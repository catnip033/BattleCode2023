package Meteor;

import battlecode.common.*;

public strictfp class Launcher extends MobileRobot {
    private MapLocation teamHQLocation;

    private RobotInfo[] nearbyEnemies;
    private MapLocation attackTarget;

    private MapLocation[] enemyHQLocations;
    private boolean[] isExplored;
    private int symmetry = 0b111;

    private final int totalHQCount;

    public Launcher(RobotController rc) throws GameActionException {
        super(rc);

        totalHQCount = rc.readSharedArray(Idx.teamHQCount);

        enemyHQLocations = new MapLocation[3];

        isExplored = new boolean[3];

        final int width = rc.getMapWidth(), height = rc.getMapHeight();

        int minDistance = Constants.INF;

        for (int i=0; i<totalHQCount; ++i) {
            MapLocation location = decodeLocation(rc.readSharedArray(i + Idx.teamHQLocationOffset));

            int distance = distanceTo(location);
            if (distance < minDistance) {
                teamHQLocation = location;
                minDistance = distance;
            }
        }

        enemyHQLocations[0] = new MapLocation(width - teamHQLocation.x - 1, height - teamHQLocation.y - 1);
        enemyHQLocations[1] = new MapLocation(width - teamHQLocation.x - 1, teamHQLocation.y);
        enemyHQLocations[2] = new MapLocation(teamHQLocation.x, height - teamHQLocation.y - 1);
    }

    public void step() throws GameActionException {
        super.step();

        nearbyEnemies = rc.senseNearbyRobots(-1, team.opponent());

        if (rc.canWriteSharedArray(0, 0)) {
            map.reportNearbyEnemies(nearbyEnemies);
            rc.writeSharedArray(Idx.symmetryOffset, rc.readSharedArray(Idx.symmetryOffset) & symmetry);
        }

        if (rc.getRoundNum() >= 3) {
            symmetry = rc.readSharedArray(Idx.symmetryOffset);
        }

        // Go to closest possible enemy HQ location that is undiscovered
        // Unless go to random location
        updateTarget();

        // Always attack enemy when possible
        updateAttackTarget();

        // Reset target if adjacent to it
        if (targetLocation != null && currentLocation.distanceSquaredTo(targetLocation) <= 2 &&
                (!rc.canSenseRobotAtLocation(targetLocation)
                        || rc.senseRobotAtLocation(targetLocation).getType() != RobotType.HEADQUARTERS
                        || rc.senseRobotAtLocation(targetLocation).getTeam() != team.opponent())) { targetLocation = null; }

        // Move to attack target
        if (attackTarget != null && !isDangerous(rc.senseRobotAtLocation(attackTarget).type)) {
            targetLocation = attackTarget;
            if (currentLocation.isAdjacentTo(attackTarget)) targetLocation = currentLocation;
        }

        if (attackTarget == null) {
            for (int id : rc.senseNearbyIslands()) {
                if (rc.senseTeamOccupyingIsland(id) != team.opponent()) continue;
                MapLocation[] locations = rc.senseNearbyIslandLocations(id);
                targetLocation = locations[RNG.nextInt(locations.length)];
                break;
            }
        }

        if (attackTarget == null && targetLocation == null) {
            for (int id : rc.senseNearbyIslands()) {
                if (rc.senseTeamOccupyingIsland(id) != team || rc.senseAnchorPlantedHealth(id) == 250) continue;
                MapLocation[] locations = rc.senseNearbyIslandLocations(id);
                targetLocation = locations[RNG.nextInt(locations.length)];
                break;
            }
        }


        final int enemyAttackerCount = getEnemyAttackerCount();
        final MapLocation closestEnemyAttacker = getClosestEnemyAttacker();

        MapLocation enemy = map.getClosestEnemy();

        if (enemy != null && (targetLocation == null || map.getLevel(targetLocation) == 0 || currentLocation.distanceSquaredTo(targetLocation) > currentLocation.distanceSquaredTo(enemy))) {
            targetLocation = enemy;
        }

        if (targetLocation == null) selectRandomTarget();

        if (closestEnemyAttacker != null && currentLocation.distanceSquaredTo(closestEnemyAttacker) <= 16) updateTargetForEvasion(nearbyEnemies);

        if (enemyAttackerCount >= 2) {
            if (rc.canWriteSharedArray(0, 0)) {
                map.reportEnemy(closestEnemyAttacker, 3);
            }
            updateTargetForEvasion(nearbyEnemies);
        }


        for (RobotInfo robot : nearbyEnemies) {
            if (robot.getType() == RobotType.HEADQUARTERS) {
                updateTargetForEvasion(nearbyEnemies);
                break;
            }
        }

        if (attackTarget != null && rc.isActionReady()) {
            if (isDangerous(rc.senseRobotAtLocation(attackTarget).type)) { updateTargetForEvasion(nearbyEnemies); }
            rc.attack(attackTarget);
        }

        move();

        if (rc.isActionReady()) {
            updateAttackTarget();
            if (attackTarget != null && rc.canAttack(attackTarget)) rc.attack(attackTarget);
        }

        draw();
    }

    // TODO Change health to another name
    private void updateAttackTarget() throws GameActionException {
        attackTarget = null;

        int minHealth = Constants.INF;

        for (RobotInfo robot : rc.senseNearbyRobots(16, team.opponent())) {
	    RobotType robotType = robot.getType();

            if (robotType == RobotType.HEADQUARTERS) continue;

            int health = robot.getHealth();

            if (robotType == RobotType.LAUNCHER)     { health -= 500; }
            if (robotType == RobotType.DESTABILIZER) { health -= 700; }
            if (robotType == RobotType.BOOSTER)      { health -= 900; }

            if (health < minHealth) {
                minHealth = health;
                attackTarget = robot.location;
            }
        }
    }

    private int getEnemyAttackerCount() {
        int count = 0;

        for (RobotInfo robot : nearbyEnemies) {
            if (isDangerous(robot.type)) { count += 1; }
        }

        return count;
    }

    private MapLocation getClosestEnemyAttacker() {
        int minDistance = Constants.INF;
        MapLocation closestEnemyAttacker = null;

        for (RobotInfo robot : nearbyEnemies) {
            if (!isDangerous(robot.type)) { continue; }

            int distance = currentLocation.distanceSquaredTo(robot.location);

            if (distance < minDistance) {
                minDistance = distance;
                closestEnemyAttacker = robot.location;
            }
        }

        return closestEnemyAttacker;
    }

    protected void updateTarget() throws GameActionException {
        int minHealth = Constants.INF;

        for (RobotInfo robot : nearbyEnemies) {
            RobotType robotType = robot.getType();

            if (robotType != RobotType.CARRIER) continue;

            int health = robot.getHealth();

            if (health < minHealth) {
                minHealth = health;
                targetLocation = robot.location;
            }
        }
    }

    @Override
    protected void selectRandomTarget() throws GameActionException {
        int minDistance = Constants.INF;

        for (int i = 0; i < 3; ++i) {
            if ((symmetry >> i & 1) == 0) continue;
            if (isExplored[i]) continue;
            MapLocation location = enemyHQLocations[i];

            if (rc.canSenseLocation(location)) {
                if (rc.canSenseRobotAtLocation(location)) {
                    RobotInfo robot = rc.senseRobotAtLocation(location);

                    if (robot.type != RobotType.HEADQUARTERS || robot.team != team.opponent()) {
                        isExplored[i] = true;
                        symmetry &= ~(1 << i);
                        continue;
                    }
                } else {
                    isExplored[i] = true;
                    symmetry &= ~(1 << i);
                    continue;
                }
            }

            int distance = 0; //distanceTo(location);
            if (distance < minDistance) {
                minDistance = distance;
                targetLocation = location;
            }
        }

        if (targetLocation == null) super.selectRandomTarget();
    }
}
