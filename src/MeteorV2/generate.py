from queue import PriorityQueue

RADIUS_SQUARED = 20
M = 4
N = M * 2 + 1
dx = [1, 1, 0,-1,-1,-1, 0, 1]
dy = [0, 1, 1, 1, 0,-1,-1,-1]
directions = ['EAST', 'NORTHEAST', 'NORTH', 'NORTHWEST', 'WEST', 'SOUTHWEST', 'SOUTH', 'SOUTHEAST']
adjacent = {33, 35, 25, 43, 24, 26, 42, 44}

alpha = 1.0

class Cell:
    def __init__(self, x, y, i):
        self.x = x
        self.y = y
        self.i = i
        self.dist = max(abs(x), abs(y))
    
    def __lt__(self, other):
        if self.dist != other.dist: return self.dist < other.dist
        if self.x ** 2 + self.y ** 2 != other.x ** 2 + other.y ** 2: return self.x ** 2 + self.y ** 2 < other.x ** 2 + other.y ** 2
        return True
   
    def getDirectionTo(self, other):
        for d in range(8):
            if (other.x-self.x, other.y-self.y) == (dx[d], dy[d]):
                return directions[d]
        assert False

declare, assigns, relaxations, insides, outsides = ('',) * 5
declare = ''
assigns     = [''] * 8
relaxations = [''] * 8
insides     = [''] * 8
outsides    = [''] * 8

k = 0
C = [[None] * N for i in range(N)]
for x in range(-M, M+1):
    for y in range(-M, M+1):
        if x**2 + y**2 <= RADIUS_SQUARED:
            C[x+M][y+M] = Cell(x, y, k)
            k += 1

for x in range(-M, M+1):
    for y in range(-M, M+1):
        if x ** 2 + y ** 2 > RADIUS_SQUARED: continue
        u = C[x+M][y+M]
        if u.i == 34:
            declare += f'''
    private static MapLocation l{u.i};
    private static double v{u.i};
    private static double s{u.i};
'''
        else:
            declare += f'''
    private static MapLocation l{u.i};
    private static double v{u.i};
    private static Direction d{u.i};
    private static double p{u.i};
    private static double s{u.i};
'''

for i in range(8):
    pq = PriorityQueue()
    visit = [[False] * N for i in range(N)]
    done = [[False] * N for i in range(N)]
    pq.put(C[M][M])
    visit[M][M] = True
    while not pq.empty():
        u = pq.get()
        temp_str1 = ''
        temp_str2 = ''

        if (u.x, u.y) != (0, 0):
            if u.dist <= 1:
                temp_str1 = f'''if (rc.onTheMap(l{u.i}) && rc.canMove(Direction.{Cell(0, 0, 34).getDirectionTo(u)})) {{
            if (rc.canSenseLocation(l{u.i})) {{
                MapInfo mapInfo = rc.senseMapInfo(l{u.i});
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l{u.i}) || (rc.sensePassability(l{u.i}) && !rc.canSenseRobotAtLocation(l{u.i}) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l{u.i}), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {{
                    p{u.i} = mapInfo.getCooldownMultiplier(team);
                }}
            }}
            else {{
                p{u.i} = 1.5;
            }}'''
            else:
                temp_str1 = f'''if (rc.onTheMap(l{u.i})) {{
            if (rc.canSenseLocation(l{u.i})) {{
                MapInfo mapInfo = rc.senseMapInfo(l{u.i});
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l{u.i}) || (rc.sensePassability(l{u.i}) && !rc.canSenseRobotAtLocation(l{u.i}) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l{u.i}), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {{
                    p{u.i} = mapInfo.getCooldownMultiplier(team);
                    s{u.i} = Math.sqrt(l{u.i}.add(currentDirection).distanceSquaredTo(targetLocation));
                }}
            }}
            else {{
                p{u.i} = 1.5;
            }}'''

        for d in range(8):
            x, y = u.x + dx[d], u.y + dy[d]

            if i == 0 and not (y >= 0): continue
            if i == 1 and not (-x <= y): continue
            if i == 2 and not (x >= 0): continue
            if i == 3 and not (x >= y): continue
            if i == 4 and not (y <= 0): continue
            if i == 5 and not (-x >= y): continue
            if i == 6 and not (x <= 0): continue
            if i == 7 and not (x <= y): continue

            if x**2 + y**2 > RADIUS_SQUARED: continue
            v = C[x+M][y+M]

            if not visit[x+M][y+M]:
                pq.put(v)
                visit[x+M][y+M] = True
                if x != 0 or y != 0:
                    assigns[i] += f'''
        d{v.i} = null;'''
                assigns[i] += f'''
        l{v.i} = l{u.i}.add(Direction.{u.getDirectionTo(v)});
        v{v.i} = 1000000;
        p{v.i} = 1000000;
        s{v.i} = Math.sqrt(l{v.i}.distanceSquaredTo(targetLocation));'''

            elif v < u:
                if True:
                    temp_str2 += f'''
            dist = v{v.i} + p{u.i} + s{v.i} * 0.000001;
            if (v{u.i} > dist) {{
                v{u.i} = dist;
                d{u.i} = {'Direction.' + v.getDirectionTo(u) if (x, y) == (0, 0) else 'd' + str(v.i)};
            }}'''

        if (u.x, u.y) != (0, 0):
            relaxations[i] += f'''

        {temp_str1}
            {temp_str2}
        }}'''
    
    insides[i] += f'''
        int dx = targetLocation.x - l{C[M][M].i}.x;
        int dy = targetLocation.y - l{C[M][M].i}.y;

        switch(dx) {{'''

    outsides[i] += f'''
        Direction ans = Direction.CENTER;
'''

    for x in range(-M, M+1):
        insides[i] += f'''
            case {x}:
                switch(dy) {{'''
        for y in range(-M, M+1):
            if i == 0 and not (y >= 0): continue
            if i == 1 and not (-x <= y): continue
            if i == 2 and not (x >= 0): continue
            if i == 3 and not (x >= y): continue
            if i == 4 and not (y <= 0): continue
            if i == 5 and not (-x >= y): continue
            if i == 6 and not (x <= 0): continue
            if i == 7 and not (x <= y): continue
            if x ** 2 + y ** 2 <= RADIUS_SQUARED:
                c = C[x+M][y+M]

                if c.i != 34:
                    insides[i] += f'''
                    case {y}:
                        if (v{c.i} < 1000000) {{
                            bug.reset();
                            rc.setIndicatorString("" + v{c.i} + " " + d{c.i} + " " + l{c.i});
                            return d{c.i};
                        }} break;'''
            
                    outsides[i] += f'''
        double dist{c.i} = v{c.i} + {str(alpha) + ' * ' if alpha != 1.0 else ''}s{c.i};
        if (dist{c.i} < localBest) {{
            localBest = dist{c.i};
            ans = d{c.i};
        }}
'''

        insides[i] += f'''
                }} break;
'''

    insides[i] += f'''
        }}'''

file_name = 'Navigation'

f = open(f'{file_name}.java', 'w')

f.write(f'''package MeteorV2;

import battlecode.common.*;

public class {file_name} {{
    private final RobotController rc;
    private final Team team;
    private final Bug bug;

    private MapLocation previousLocation;
    private MapLocation currentLocation;

    private MapLocation targetLocation;

    private Direction lastDirection;

    private double globalBest = 1000000;

    private int consecutiveBugNavRoundCount;

    public {file_name} (RobotController rc) {{
        this.rc = rc;
        team = rc.getTeam();
        bug = new Bug(rc);
    }}
    {declare}''')

for i in range(8):
    f.write(f'''
    private Direction getBestDirection{i}() throws GameActionException {{
        double localBest = 1000000.0;
        double dist = 0.0;
        l{C[M][M].i} = currentLocation;
        v{C[M][M].i} = 0;{assigns[i]}
    {relaxations[i]}
    {insides[i]}
    {outsides[i]}
        if (localBest < globalBest) {{
            globalBest = localBest;
            bug.reset();
            return ans;
        }}

        consecutiveBugNavRoundCount += 1;

        if (consecutiveBugNavRoundCount > 40) {{
            globalBest = 1000000;
            consecutiveBugNavRoundCount = 0;
        }}

        bug.move(targetLocation, lastDirection);
        return null;
    }}
''')

f.write(f'''
    public void moveAgain(MapLocation targetLocation) throws GameActionException {{
        previousLocation = currentLocation;
        currentLocation = rc.getLocation();
        lastDirection = previousLocation == null ? Direction.CENTER : previousLocation.directionTo(currentLocation);
        globalBest = Math.min({str(alpha) + ' * ' if alpha != 1.0 else ''}Math.sqrt(currentLocation.distanceSquaredTo(targetLocation)), globalBest);
        bug.move(targetLocation, lastDirection);
    }}

    public Direction getBestDirection(MapLocation targetLocation) throws GameActionException {{
        previousLocation = currentLocation;
        currentLocation = rc.getLocation();
        lastDirection = previousLocation == null ? Direction.CENTER : previousLocation.directionTo(currentLocation);
        
        if (!targetLocation.equals(this.targetLocation)) {{
            globalBest = 1000000;
            this.targetLocation = targetLocation;
            consecutiveBugNavRoundCount = 0;
            lastDirection = Direction.CENTER;
        }}

        int dx, dy;

        if (lastDirection.equals(Direction.CENTER) || currentLocation.distanceSquaredTo(targetLocation) <= 20) {{
            dx = targetLocation.x - currentLocation.x;
            dy = targetLocation.y - currentLocation.y;
        }}
        else {{
            dx = lastDirection.getDeltaX();
            dy = lastDirection.getDeltaY();
        }}

        double prod = Math.abs((double)dy / Math.sqrt(dx * dx + dy * dy));

        Direction ans = Direction.CENTER;

        if (prod > Math.cos(Math.toRadians(22.5))) {{
            if (dy > 0) {{
                ans = getBestDirection0();
            }}
            else {{
                ans = getBestDirection4();
            }}
        }}
        else if (prod > Math.cos(Math.toRadians(67.5))) {{
             if (dx > 0 && dy > 0) {{
                ans = getBestDirection1();
             }}
             if (dx > 0 && dy < 0) {{
                ans = getBestDirection3();
             }}
             if (dx < 0 && dy < 0) {{
                ans = getBestDirection5();
             }}
             if (dx < 0 && dy > 0) {{
                ans = getBestDirection7();
             }}
        }}
        else {{
            if (dx > 0) {{
                ans = getBestDirection2();
            }}
            else {{
                ans = getBestDirection6();
            }}
        }}

        return ans;
    }}

    private double dot(Direction directionA, Direction directionB) {{
        return directionA.getDeltaX() * directionB.getDeltaX() + directionA.getDeltaY() * directionB.getDeltaY();
    }}
''')
f.write('}')

f.close()
