from queue import PriorityQueue

RADIUS_SQUARED = 20
M = 4
N = M * 2 + 1
dx = [1, 1, 0,-1,-1,-1, 0, 1]
dy = [0, 1, 1, 1, 0,-1,-1,-1]
directions = ['EAST', 'NORTHEAST', 'NORTH', 'NORTHWEST', 'WEST', 'SOUTHWEST', 'SOUTH', 'SOUTHEAST']
adjacent = {33, 35, 25, 43, 24, 26, 42, 44}

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
    private static Direction d{u.i};
    private static boolean r{u.i};
'''
        else:
            declare += f'''
    private static MapLocation l{u.i};
    private static double v{u.i};
    private static Direction d{u.i};
    private static double p{u.i};
    private static boolean b{u.i};
    private static boolean r{u.i};
    private static boolean o{u.i};
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
            relaxations[i] += f'''
        if (rc.onTheMap(l{u.i}) && rc.canSenseLocation(l{u.i})) {{
            if (rc.senseCloud(l{u.i})) {{
                p{u.i} = 1.5;
                b{u.i} = false;
            }} 

            else {{
                Direction currentDirection = rc.senseMapInfo(l{u.i}).getCurrentDirection();
                if (targetLocation.equals(l{u.i}) || (rc.sensePassability(l{u.i}) && !rc.canSenseRobotAtLocation(l{u.i}) && currentDirection.equals(Direction.CENTER))) {{
                    p{u.i} = rc.senseMapInfo(l{u.i}).getCooldownMultiplier(team);
                    b{u.i} = false;
                }}
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
                assigns[i] += f'''
        l{v.i} = l{u.i}.add(Direction.{u.getDirectionTo(v)});
        v{v.i} = 1000000;
        p{v.i} = 1000000;
        d{v.i} = null;
        b{v.i} = true;
        r{v.i} = false;
        o{v.i} = false;'''

            elif v < u:
                if True:
                    relaxations[i] += f'''
            if (v{u.i} > v{v.i} + p{u.i}) {{
                v{u.i} = v{v.i} + p{u.i};
                d{u.i} = {'Direction.' + v.getDirectionTo(u) if (x, y) == (0, 0) else 'd' + str(v.i)};
            }}'''

                    temp_str1 += f'''
            r{u.i} |= r{v.i};'''
                    if v.i != 34:
                        temp_str2 += f'''
            o{v.i} |= b{u.i};'''

        if (u.x, u.y) != (0, 0):
            relaxations[i] += f'''
            {temp_str1}
            r{u.i} &= !b{u.i};{temp_str2}
        }}
        else {{{temp_str2}
        }}
'''
    
    insides[i] += f'''    int dx = targetLocation.x - l{C[M][M].i}.x;
        int dy = targetLocation.y - l{C[M][M].i}.y;

        switch(dx) {{'''

    outsides[i] += f'''    Direction ans = Direction.CENTER;
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

                insides[i] += f'''
                    case {y}:
                        if (v{c.i} < 10000) {{
                            return d{c.i};
                        }}'''
            
                if (abs(x) + 1) ** 2 + y ** 2 > RADIUS_SQUARED or x ** 2 + (abs(y) + 1) ** 2 > RADIUS_SQUARED:
                    outsides[i] += f'''
        if (r{c.i} && o{c.i}) {{
            double dist{c.i} = v{c.i} + 1.5 * Math.sqrt(l{c.i}.distanceSquaredTo(targetLocation));
            if (dist{c.i} < localBest) {{
                localBest = dist{c.i};
                ans = d{c.i};
                best = l{c.i};
            }}
        }}
'''

        insides[i] += f'''
                }} break;
'''

    insides[i] += f'''
        }}'''

def isEdge(x, y):
    return x ** 2 + y ** 2 <= RADIUS_SQUARED and ((abs(x) + 1) ** 2 + y ** 2 > RADIUS_SQUARED or x ** 2 + (abs(y) + 1) ** 2 > RADIUS_SQUARED)

getEdges = [''] * 8

for i in range(8):
    for x in range(-M, M+1):
        for y in range(-M, M+1):
            if i == 0 and not (y >= 0): continue
            if i == 1 and not (-x <= y): continue
            if i == 2 and not (x >= 0): continue
            if i == 3 and not (x >= y): continue
            if i == 4 and not (y <= 0): continue
            if i == 5 and not (-x >= y): continue
            if i == 6 and not (x <= 0): continue
            if i == 7 and not (x <= y): continue

            if isEdge(x, y):
                c = C[x+M][y+M]
                getEdges[i] += f'''
        o{c.i} = r{c.i};'''

findWall = [''] * 8;
draws = [''] * 8;

for i in range(8):
    for x in range(-M, M+1):
        for y in range(-M, M+1):
            if i == 0 and not (y >= 0): continue
            if i == 1 and not (-x <= y): continue
            if i == 2 and not (x >= 0): continue
            if i == 3 and not (x >= y): continue
            if i == 4 and not (y <= 0): continue
            if i == 5 and not (-x >= y): continue
            if i == 6 and not (x <= 0): continue
            if i == 7 and not (x <= y): continue
            if x ** 2 + y ** 2 <= RADIUS_SQUARED and (x != 0 or y != 0):
                c = C[x+M][y+M]
                findWall[i] += f'''
        if (b{c.i}) {{
            int distance = currentLocation.distanceSquaredTo(l{c.i});
            if (distance == minDistance) {{
                closestWallLocations.add(l{c.i});
            }}
            if (distance < minDistance) {{
                closestWallLocations.clear();
                closestWallLocations.add(l{c.i});
                minDistance = distance;
            }}
        }}
'''
                draws[i] += f'''
        rc.setIndicatorDot(l{c.i}, 255, 0, 255);
        if (b{c.i}) {{
            rc.setIndicatorDot(l{c.i}, 255, 255, 255);
        }}
'''

file_name = 'Navigation'

f = open(f'{file_name}.java', 'w')

f.write(f'''package Pathing;

import battlecode.common.*;

import java.util.ArrayList;

public class {file_name} {{

    private RobotController rc;
    private Team team;

    private MapLocation previousLocation;
    private MapLocation currentLocation;

    private MapLocation targetLocation;

    private Direction lastDirection;
    private ArrayList<MapLocation> closestWallLocations;

    private double globalBest = 1000000;

    public {file_name} (RobotController rc) {{
        this.rc = rc;
        team = rc.getTeam();

        closestWallLocations = new ArrayList<MapLocation>();
    }}
    {declare}''')

for i in range(8):
    f.write(f'''
    private Direction getBestDirection{i}() throws GameActionException {{
        MapLocation best = currentLocation;
        double localBest = 1000000.0;
        l{C[M][M].i} = currentLocation;
        v{C[M][M].i} = 0;
        d{C[M][M].i} = Direction.CENTER;
        r{C[M][M].i} = true;{assigns[i]}
    {relaxations[i]}
    {insides[i]}
    {getEdges[i]}
    {outsides[i]}
        draws{i}();
        rc.setIndicatorDot(best, 0, 0, 255);
        if (localBest < globalBest) {{
            globalBest = localBest;
            return ans;
        }}
        return getBestDirectionWallFollow{i}(ans);
    }}

    private Direction getBestDirectionWallFollow{i}(Direction prev) throws GameActionException {{
        Direction ans = Direction.CENTER;
        int minDistance = closestWallLocations.isEmpty() ? 1000000 : currentLocation.distanceSquaredTo(closestWallLocations.get(0));
    {findWall[i]}
        if (minDistance > 2) {{ return prev; }}
        int maxDot = -999999;
        minDistance = 1000000;
        for (MapLocation closestWallLocation : closestWallLocations) {{
            Direction vertical = currentLocation.directionTo(closestWallLocation);

            Direction tangent1 = vertical.rotateLeft().rotateLeft();
            Direction tangent2 = vertical.rotateRight().rotateRight();

            int dx = lastDirection.getDeltaX();
            int dy = lastDirection.getDeltaY();

            int dot1 = tangent1.getDeltaX() * dx + tangent1.getDeltaY() * dy;
            int dot2 = tangent2.getDeltaX() * dx + tangent2.getDeltaY() * dy;

            int distance1 = currentLocation.add(tangent1).distanceSquaredTo(targetLocation);
            int distance2 = currentLocation.add(tangent2).distanceSquaredTo(targetLocation);

            if (!rc.canMove(tangent1)) {{
                dot1 = -1000000;
            }}

            if (!rc.canMove(tangent2)) {{
                dot2 = -1000000;
            }}

            if (dot1 > maxDot) {{
                maxDot = dot1;
                minDistance = distance1;
                ans = tangent1;
            }}

            if (dot2 > maxDot) {{
                maxDot = dot2;
                minDistance = distance2;
                ans = tangent2;
            }}

            if (dot1 == maxDot && distance1 < minDistance) {{
                maxDot = dot1;
                minDistance = distance1;
                ans = tangent1;
            }}

            if (dot2 == maxDot && distance2 < minDistance) {{
                maxDot = dot2;
                minDistance = distance2;
                ans = tangent2;
            }}
        }}
        draws{i}();
        for (MapLocation closestWallLocation : closestWallLocations) {{
            rc.setIndicatorDot(closestWallLocation, 255, 0, 0);
        }}
        return ans;
    }}

    private void draws{i}() throws GameActionException {{
    {draws[i]}
    }}
''')

f.write(f'''
    public Direction getBestDirection(MapLocation targetLocation) throws GameActionException {{
        currentLocation = rc.getLocation();

        globalBest = 1000000;
        if (!targetLocation.equals(this.targetLocation)) {{
            globalBest = 1000000;
            this.targetLocation = targetLocation;
            lastDirection = Direction.CENTER;
            closestWallLocations.clear();
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

        lastDirection = ans;
        return ans;
    }}

    private double dot(Direction directionA, Direction directionB) {{
        return directionA.getDeltaX() * directionB.getDeltaX() + directionA.getDeltaY() * directionB.getDeltaY();
    }}
''')
f.write('}')

f.close()
