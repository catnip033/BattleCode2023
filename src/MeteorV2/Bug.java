package MeteorV2;

import battlecode.common.*;

public class Bug {
    private final RobotController rc;

    private MapLocation currentLocation;
    private MapLocation targetLocation;

    private MapLocation wallLocation;

    private boolean[] canMove;

    private Boolean rotateClockwise;

    public Bug(RobotController rc) {
        this.rc = rc;

        canMove = new boolean[9];
    }

    public void move(MapLocation targetLocation, Direction lastDirection) throws GameActionException {
        currentLocation = rc.getLocation();

        if (!targetLocation.equals(this.targetLocation)) {
            reset();
            this.targetLocation = targetLocation;
        }
        if (wallLocation != null) {
            rc.setIndicatorDot(wallLocation, 0, 0, 0);
        }
        for (Direction direction : Direction.allDirections()) {
            MapLocation newLocation = currentLocation.add(direction);
            canMove[direction.ordinal()] = false;

            if (newLocation.equals(wallLocation)) {
                continue;
            }
            if (rc.canMove(direction)) {
                if (rc.canSenseLocation(newLocation)) {
                    Direction currentDirection = rc.senseMapInfo(newLocation).getCurrentDirection();
                    if (currentDirection.equals(Direction.CENTER) || (dot(currentDirection, direction) > 0 && dot(currentDirection, lastDirection) >= 0)) {
                        canMove[direction.ordinal()] = true;
                    }
                }
                else {
                    canMove[direction.ordinal()] = true;
                }
            }
        }

        Direction direction = currentLocation.directionTo(wallLocation == null ? targetLocation : wallLocation);

        if (canMove[direction.ordinal()]) {
            rc.move(direction);

            if (wallLocation != null) {
                wallLocation = rc.getLocation().add(direction);

                if (!rc.onTheMap(wallLocation)) {
                    reset();
                }
            }

            return;
        }

        checkRotateDirection(direction, lastDirection);

        for (int i=0; i<=16; ++i) {
            MapLocation newLocation = currentLocation.add(direction);

            if (canMove[direction.ordinal()]) {
                rc.move(direction);
                return;
            }
            if (!rc.onTheMap(newLocation)) {
                rotateClockwise = !rotateClockwise;
            }
            else {
                wallLocation = newLocation;
            }
            direction = rotateClockwise ? direction.rotateRight() : direction.rotateLeft();
        }
        if (canMove[direction.ordinal()]) {
            rc.move(direction);
        }
    }

    private void checkRotateDirection(Direction direction, Direction lastDirection) {
        if (rotateClockwise != null) { return; }

        Direction directionL = direction;
        Direction directionR = direction;

        for (int i=0; i<8; ++i) {
            if (!canMove[directionL.ordinal()]) { directionL = directionL.rotateLeft(); } else { break; }
        }

        for (int i=0; i<8; ++i) {
            if (!canMove[directionR.ordinal()]) { directionR = directionR.rotateRight(); } else { break; }
        }

        int distanceL = currentLocation.add(directionL).distanceSquaredTo(targetLocation);
        int distanceR = currentLocation.add(directionR).distanceSquaredTo(targetLocation);

        double dotL = dot(directionL, lastDirection);
        double dotR = dot(directionR, lastDirection);

        rotateClockwise =  (dotL < dotR) || (dotL == dotR && distanceL > distanceR);
    }

    public void reset() {
        rotateClockwise = null;
        wallLocation = null;
    }

    private double dot(Direction directionA, Direction directionB) {
        return directionA.getDeltaX() * directionB.getDeltaX() + directionA.getDeltaY() * directionB.getDeltaY();
    }

}
