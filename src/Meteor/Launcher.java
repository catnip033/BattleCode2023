package Meteor;

import battlecode.common.*;

public strictfp class Launcher extends MobileRobot {
    private MapLocation teamHQLocation;

    private RobotInfo[] nearbyEnemies;
    private MapLocation attackTarget;

    private MapLocation[] enemyHQLocations;

    private boolean[] isEnemyHQ;
    private boolean[] isExplored;

    private final int totalHQCount;

    public Launcher(RobotController rc) throws GameActionException {
        super(rc);

        totalHQCount = rc.readSharedArray(Idx.teamHQCount);

        enemyHQLocations = new MapLocation[totalHQCount * 3];

        isEnemyHQ = new boolean[totalHQCount * 3];
        isExplored = new boolean[totalHQCount * 3];

        final int width = rc.getMapWidth(), height = rc.getMapHeight();

        int minDistance = Constants.INF;

        for (int i=0; i<totalHQCount; ++i) {
            MapLocation location = decodeLocation(rc.readSharedArray(i + Idx.teamHQLocationOffset));
            
            enemyHQLocations[i * 3 + 0] = new MapLocation(width - location.x - 1, location.y);
            enemyHQLocations[i * 3 + 1] = new MapLocation(location.x, height - location.y - 1);
            enemyHQLocations[i * 3 + 2] = new MapLocation(width - location.x - 1, height - location.y - 1);

            int distance = distanceTo(location);
            if (distance < minDistance) {
                teamHQLocation = location;
                minDistance = distance;
            }
        }
    }

    public void step() throws GameActionException {
        super.step();

        nearbyEnemies = rc.senseNearbyRobots(-1, team.opponent());

        if (rc.canWriteSharedArray(0, 0)) {
            map.reportNearbyEnemies(nearbyEnemies);
        }

        // Go to closest possible enemy HQ location that is undiscovered
        // Unless go to random location
        updateTarget();

        // Always attack enemy when possible
        updateAttackTarget();

        // Reset target if adjacent to it
        if (targetLocation != null && currentLocation.isAdjacentTo(targetLocation) &&
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

        /*
        final int enemyAttackerCount = getEnemyAttackerCount();
        final MapLocation closestEnemyAttacker = getClosestEnemyAttacker();

        MapLocation enemy = minimap.getClosestEnemy();

        if (enemy != null && (targetLocation == null || map.getInfo(targetLocation) == 0 || currentLocation.distanceSquaredTo(targetLocation) > 40 && map.getInfo(targetLocation) < map.getInfo(enemy))) {
            targetLocation = enemy;
        }

        if (targetLocation == null) selectRandomTarget();

        if (closest != null && currentLocation.distanceSquaredTo(closest) <= 13) updateTargetForEvasion(nearbyEnemies);

        if (enemySoldierCount >= 2) {
            if (rc.canWriteSharedArray(0, 0)) {
                map.reportEnemy(closest, 3);
            }
            updateTargetForEvasion(nearbyEnemies);
        }

        if (attackTarget != null && rc.isActionReady()) {
            if (isDangerous(rc.senseRobotAtLocation(attackTarget).type)) { updateTargetForEvasion(nearbyEnemies); }
            rc.attack(attackTarget);
        }
        */

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

            if (robotType == RobotType.LAUNCHER)     { health -= 50; }
            if (robotType == RobotType.DESTABILIZER) { health -= 70; }
            if (robotType == RobotType.BOOSTER)      { health -= 90; }

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
        int minDistance = Constants.INF;

        for (int i = 0; i < totalHQCount * 3; ++i) {
            if (!isExplored[i]) continue;

            MapLocation location = enemyHQLocations[i];

            if (rc.canSenseLocation(location)) {
                if (rc.canSenseRobotAtLocation(location)) {
                    RobotInfo robot = rc.senseRobotAtLocation(location);

                    if (robot.type == RobotType.HEADQUARTERS && robot.team == team.opponent()) {
                        isEnemyHQ[i] = true;
                    }
                }

                isExplored[i] = true;
                continue;
            }

            int distance = distanceTo(location);
            if (distance < minDistance) {
                minDistance = distance;
                targetLocation = location;
            }
        }

        if (targetLocation == null) selectRandomTarget();
    }
}
