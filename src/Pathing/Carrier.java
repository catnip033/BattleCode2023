package Pathing;

import battlecode.common.*;

public strictfp class Carrier extends MobileRobot {
    public Carrier(RobotController rc) throws GameActionException {
        super(rc);
    }

    public void step() throws GameActionException {
        super.step();

        updateTarget();
        while (move());

        draw();
    }

    private void updateTarget() throws GameActionException {
        if (targetLocation == null) { selectRandomTarget(); return; }
        if (currentLocation.distanceSquaredTo(targetLocation) <= 2) { targetLocation = null; }
        if (targetLocation == null) { selectRandomTarget(); return; }
    }
}
