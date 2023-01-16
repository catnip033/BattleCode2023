package Meteor_V1_1;

import battlecode.common.*;

public strictfp class Launcher extends Robot {
    private MapLocation hqLocation;
    private RobotInfo[] nearbyEnemies;
    private MapLocation attackTarget;

    private MapLocation[] enemyhqLocations = new MapLocation[3];
    private boolean[] noEnemyHq = new boolean[3];

    public Launcher(RobotController rc) throws GameActionException {
        super(rc);

        for (RobotInfo robotInfo : rc.senseNearbyRobots(8, team)) {
            if (robotInfo.getType() != RobotType.HEADQUARTERS) continue;
            hqLocation = robotInfo.getLocation();
            break;
        }

        final int width = rc.getMapWidth(), height = rc.getMapHeight();
        enemyhqLocations[0] = new MapLocation(width - hqLocation.x - 1, hqLocation.y);
        enemyhqLocations[1] = new MapLocation(hqLocation.x, height - hqLocation.y - 1);
        enemyhqLocations[2] = new MapLocation(width - hqLocation.x - 1, height - hqLocation.y - 1);
    }

    public void step() throws GameActionException {
        super.step();

        nearbyEnemies = rc.senseNearbyRobots(-1, team.opponent());

        if (rc.canWriteSharedArray(0, 0)) {
            minimap.reportNearbyEnemies(nearbyEnemies);
        }

        final int enemySoldierCount = getEnemyAttackerCount();
        final MapLocation closest = getClosestEnemyAttacker();

        updateTarget();

        // Always attack nearby enemy
        updateAttackTarget();

        // Reset target if adjacent to it
        if (target != null && currentLocation.isAdjacentTo(target) &&
                (!rc.canSenseRobotAtLocation(target)
                        || rc.senseRobotAtLocation(target).getType() != RobotType.HEADQUARTERS
                        || rc.senseRobotAtLocation(target).getTeam() != team.opponent())) { target = null; }

        // Move to attack target
        if (attackTarget != null && !isDangerous(rc.senseRobotAtLocation(attackTarget).type)) {
            target = attackTarget;
            if (currentLocation.isAdjacentTo(attackTarget)) target = currentLocation;
        }

        if (attackTarget == null) {
            for (int id : rc.senseNearbyIslands()) {
                if (rc.senseTeamOccupyingIsland(id) != team.opponent()) continue;
                MapLocation[] locations = rc.senseNearbyIslandLocations(id);
                target = locations[RNG.nextInt(locations.length)];
                break;
            }
        }

        if (attackTarget == null && target == null) {
            for (int id : rc.senseNearbyIslands()) {
                if (rc.senseTeamOccupyingIsland(id) != team || rc.senseAnchorPlantedHealth(id) == 250) continue;
                MapLocation[] locations = rc.senseNearbyIslandLocations(id);
                target = locations[RNG.nextInt(locations.length)];
                break;
            }
        }

        MapLocation enemy = minimap.getClosestEnemy();

        if (enemy != null && (target == null || minimap.getLevel(target) == 0 || currentLocation.distanceSquaredTo(target) > 40 && minimap.getLevel(target) < minimap.getLevel(enemy))) {
            target = enemy;
        }

        if (target == null) selectRandomTarget();

        if (closest != null && currentLocation.distanceSquaredTo(closest) <= 13) updateTargetForEvasion(nearbyEnemies);

        if (enemySoldierCount >= 2) {
            if (rc.canWriteSharedArray(0, 0)) {
                minimap.reportEnemy(closest, 3);
            }
            updateTargetForEvasion(nearbyEnemies);
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

    private void updateAttackTarget() throws GameActionException {
        int minHealth = Constants.INF;
        attackTarget = null;

        for (RobotInfo robot : rc.senseNearbyRobots(16, team.opponent())) {
            if(robot.getType() == RobotType.HEADQUARTERS) continue;
            int health = robot.getHealth();
            if(robot.getType() == RobotType.LAUNCHER) { health -= 50; }
            if(robot.getType() == RobotType.DESTABILIZER) { health -= 70; }
            if(robot.getType() == RobotType.BOOSTER) { health -= 90; }

            if(health < minHealth) {
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
        MapLocation closest = null;

        for(RobotInfo robot : nearbyEnemies) {
            if (!isDangerous(robot.type)) { continue; }

            int distance = currentLocation.distanceSquaredTo(robot.location);

            if(distance < minDistance) {
                minDistance = distance;
                closest = robot.location;
            }
        }

        return closest;
    }

    protected void updateTarget() throws GameActionException {
        int minDistance = Constants.INF;

        for (int i = 0; i < 3; ++i) {
            MapLocation location = enemyhqLocations[i];
            if (rc.canSenseLocation(location) && !rc.canSenseRobotAtLocation(location)) {
                noEnemyHq[i] = true;
            }
            if (noEnemyHq[i]) continue;

            int launcherCount = 0;
            for (RobotInfo robotInfo : rc.senseNearbyRobots(location, 5, team)) {
                if (robotInfo.getType() == RobotType.LAUNCHER) launcherCount++;
            }
            int distance = distanceTo(location);
            if (distance >= 2 && launcherCount >= 8) {
                if (location.equals(target)) {
                    target = null;
                }
                continue;
            }

            if (distance < minDistance) {
                minDistance = distance;
                target = location;
            }
        }

        if (target == null) selectRandomTarget();
    }

    private int distanceTo(MapLocation location) {
        return Math.max(Math.abs(location.x - currentLocation.x), Math.abs(location.y - currentLocation.y));
    }
}