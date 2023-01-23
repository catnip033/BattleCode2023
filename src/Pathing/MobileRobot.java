package Pathing;

import battlecode.common.*;

public class MobileRobot extends Robot {
    protected boolean evading = false;

    protected final Navigation navigation;

    protected boolean hasMoved;

    public MobileRobot(RobotController rc) throws GameActionException {
        super(rc);

        this.rc = rc;

        currentLocation = rc.getLocation();

        RNG.setSeed(rc.getRoundNum());

        navigation = new Navigation(rc);
    }

    public void step() throws GameActionException {
        super.step();
	hasMoved = false;
        evading = false;
    }

    protected boolean move() throws GameActionException {
        if (!rc.isMovementReady() || currentLocation.equals(targetLocation)) { 
            return false;
        }

	if (hasMoved) {
	    return false;
	}

        Direction direction = navigation.getBestDirection(targetLocation);

        if (direction != null) {
	    if (rc.canMove(direction)) {
		rc.move(direction);
	    }
	}

        currentLocation = rc.getLocation();
	hasMoved = true;
        return true;
    }

    protected void draw() throws GameActionException {
        if (targetLocation != null) {
            rc.setIndicatorDot(targetLocation, 0, 255, 0);
            rc.setIndicatorLine(rc.getLocation(), targetLocation, 255, 0, 0);
        }
    }

    protected void selectRandomTarget() throws GameActionException {
        targetLocation = new MapLocation(RNG.nextInt(rc.getMapWidth()), RNG.nextInt(rc.getMapHeight()));
    }
}
