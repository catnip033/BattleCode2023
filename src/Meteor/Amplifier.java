package Meteor;

import battlecode.common.*;

public strictfp class Amplifier extends MobileRobot {

    public Amplifier(RobotController rc) throws GameActionException {
        super(rc);
    }

    public void step() throws GameActionException {
        super.step();

        if (targetLocation != null && rc.canSenseLocation(targetLocation)) {
            targetLocation = null;
        }

        RobotInfo[] nearbyEnemies = rc.senseNearbyRobots(-1, team.opponent());

        map.reportNearbyEnemies(nearbyEnemies);

        RobotInfo enemyAttacker = null;
        for (RobotInfo robot : nearbyEnemies) {
            if (isDangerous(robot.getType())) {
                enemyAttacker = robot;
                break;
            }
        }

        // Evade enemy launchers
        if (enemyAttacker != null) {
            updateTargetForEvasion(nearbyEnemies);
            move();
            draw();
            return;
        }

        if (targetLocation == null) selectRandomTarget();

        move();
        draw();
    }
}
