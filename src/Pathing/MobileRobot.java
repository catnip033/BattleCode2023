package Pathing;

import battlecode.common.*;

public class MobileRobot extends Robot {
    protected boolean evading = false;

    protected final BFS bfs;
    protected final BugPath bugPath;

    protected final Navigation navigation;

    public MobileRobot(RobotController rc) throws GameActionException {
        super(rc);

        this.rc = rc;

        currentLocation = rc.getLocation();

        RNG.setSeed(rc.getRoundNum());

        bfs = new BFS20(rc);
        bugPath = new BugPath(rc);

        navigation = new Navigation(rc);
    }

    public void step() throws GameActionException {
        super.step();
        evading = false;
    }

    // TODO: Change when to use either BugNav or BFS
    protected boolean move() throws GameActionException {
        if (!rc.isMovementReady() || currentLocation.equals(targetLocation)) { 
            return false;
        }

        Direction direction = navigation.getBestDirection(targetLocation);

        rc.setIndicatorString("" + direction);

        if (rc.canMove(direction)) {
            rc.move(direction);
            return false;
        }

        return false;

	/*
        boolean encounteredObstacle = false;
        for (MapInfo mapInfo : rc.senseNearbyMapInfos(2)) {
            encounteredObstacle |= !mapInfo.isPassable() || rc.canSenseRobotAtLocation(mapInfo.getMapLocation());
        }

        boolean moved;
        if (encounteredObstacle) {
            bugPath.update();
            moved = bugPath.moveTo(targetLocation);
        } else {
            moved = bfs.move(targetLocation);
        }

        currentLocation = rc.getLocation();
        return moved;
	*/
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
