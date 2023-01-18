package testing;

import battlecode.common.*;

public strictfp class RobotPlayer {

    private static Robot robot = null;

    public static void run(RobotController rc) throws GameActionException {
        switch (rc.getType()) {
            case HEADQUARTERS:  robot = new Headquarter(rc);    break;
            case CARRIER:       robot = new Carrier(rc);        break;
            case LAUNCHER:      robot = new Launcher(rc);       break;
            case DESTABILIZER:  robot = new Destabilizer(rc);   break;
            case BOOSTER:       robot = new Booster(rc);        break;
            case AMPLIFIER:     robot = new Amplifier(rc);      break;
            default:                                            break;
        }

        while (true) {
            //if (rc.getRoundNum() >= 500) break;
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
