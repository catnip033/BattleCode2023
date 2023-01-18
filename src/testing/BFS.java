package testing;

import battlecode.common.*;

public abstract class BFS {

    protected final RobotController rc;
    protected MapLocation currentLocation;

    public BFS (RobotController rc) {
        this.rc = rc;
    }

    public boolean move(MapLocation target) throws GameActionException {
        currentLocation = rc.getLocation();

        Direction direction = getBestDirection(target);

        if (direction == Direction.CENTER) { return false; }

        if (direction != null && rc.canMove(direction)) {
            rc.move(direction);
            return true;
        }

        return false;
    }

    protected abstract Direction getBestDirection(MapLocation target) throws GameActionException;
}
