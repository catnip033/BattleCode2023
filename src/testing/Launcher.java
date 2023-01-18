package testing;

import battlecode.common.*;

public strictfp class Launcher extends Robot {

    private RobotInfo[] nearbyEnemies;
    private MapLocation attackTarget;

    public Launcher(RobotController rc) throws GameActionException {
        super(rc);
    }

    public void step() throws GameActionException {
        super.step();

        nearbyEnemies = rc.senseNearbyRobots(-1, team.opponent());

        final int enemySoldierCount = getEnemyAttackerCount();
        final MapLocation closest = getClosestEnemyAttacker();

        // Always attack nearby enemy
        updateAttackTarget();

        // Reset target if adjacent to it
        if (target != null && currentLocation.isAdjacentTo(target)) { target = null; }

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

        if (target == null) selectRandomTarget();

        if (closest != null && currentLocation.distanceSquaredTo(closest) <= 13) updateTargetForEvasion(nearbyEnemies);

        if (enemySoldierCount >= 2) updateTargetForEvasion(nearbyEnemies);

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

        for (RobotInfo robot : rc.senseNearbyRobots(13, team.opponent())) {
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

    protected void selectRandomTarget() throws GameActionException {
        int t = 5;
        int x1 = Math.max(currentLocation.x - t, 0);
        int y1 = Math.max(currentLocation.y - t, 0);
        int x2 = Math.min(currentLocation.x + t, rc.getMapWidth() - 1);
        int y2 = Math.min(currentLocation.y + t, rc.getMapHeight() - 1);
        target = new MapLocation(RNG.nextInt(x2 - x1 + 1) + x1, RNG.nextInt(y2 - y1 + 1) + y1);
    }
}
