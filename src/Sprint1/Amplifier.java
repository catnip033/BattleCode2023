package Sprint1;

import battlecode.common.*;

public strictfp class Amplifier extends Robot {
    public Amplifier(RobotController rc) throws GameActionException {
        super(rc);
    }

    public void step() throws GameActionException {
        super.step();

        if (target != null && currentLocation.distanceSquaredTo(target) <= 5) {
            target = null;
        }

        RobotInfo[] nearbyEnemies = rc.senseNearbyRobots(-1, team.opponent());

        minimap.reportNearbyEnemies(nearbyEnemies);

        RobotInfo enemyAttacker = null;
        for (RobotInfo robot : nearbyEnemies) {
            if (isDangerous(robot.getType())) {
                enemyAttacker = robot;
                break;
            }
        }

        // Evade enemy soldier
        if (enemyAttacker != null) {
            updateTargetForEvasion(nearbyEnemies);
            move();
            draw();
            return;
        }

        if(target == null) selectRandomTarget();

        move();
        draw();
    }
}
