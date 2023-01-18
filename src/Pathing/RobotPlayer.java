package Pathing;

import battlecode.common.*;

public strictfp class RobotPlayer {

    private static Robot robot = null;

    public static void run(RobotController rc) throws GameActionException {
        switch (rc.getType()) {
            case HEADQUARTERS:  robot = new Headquarter(rc);    break;
            case CARRIER:       robot = new Carrier(rc);        break;
            default:                                            break;
        }

        while (true) {
            try {
                robot.step();
                Clock.yield();
            } catch (Exception e) {
                System.out.println(rc.getType() + " Exception");
                e.printStackTrace();
            }
        }
    }
}
