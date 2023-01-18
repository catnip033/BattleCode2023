package AFK;

import battlecode.common.*;

public strictfp class RobotPlayer {
    public static void run(RobotController rc) throws GameActionException {
        while (true) {
            try {
                Clock.yield();
            } catch (Exception e) {
                System.out.println(rc.getType() + " Exception");
                e.printStackTrace();
            }
        }
    }
}
