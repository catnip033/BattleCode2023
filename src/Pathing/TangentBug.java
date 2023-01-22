package Pathing;

import battlecode.common.*;

public class TangentBug {

    private RobotController rc;

    public TangentBug(RobotController rc){
        this.rc = rc;
    }

    public Direction getBestDirection(MapLocation target) throws GameActionException {
        MapLocation currentLocation = rc.getLocation();

        return currentLocation.directionTo(target);
    }

}
