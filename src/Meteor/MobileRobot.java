package Meteor;

import battlecode.common.*;

public class MobileRobot extends Robot {
    protected boolean evading = false;

    protected final BFS bfs;
    protected final BugPath bugPath;

    public MobileRobot(RobotController rc) throws GameActionException {
        super(rc);

        this.rc = rc;

        currentLocation = rc.getLocation();

        RNG.setSeed(rc.getRoundNum());

        bfs = new BFS20(rc);
        bugPath = new BugPath(rc);
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

        boolean moved;
        bugPath.update();
        moved = bugPath.moveTo(targetLocation);

        currentLocation = rc.getLocation();
        return moved;
    }

    protected void draw() throws GameActionException {
        if (targetLocation != null) {
            rc.setIndicatorDot(targetLocation, 0, 255, 0);
            rc.setIndicatorLine(rc.getLocation(), targetLocation, 255, 0, 0);
        }
    }

    protected void updateTargetForEvasion(RobotInfo[] nearbyEnemies) throws GameActionException {
        if (evading) { return; }

        int maxDistance = 0;

        for (RobotInfo robot : nearbyEnemies) {
            if (isDangerous(robot.type)) {
                maxDistance += currentLocation.distanceSquaredTo(robot.location);
            }
        }

        targetLocation = currentLocation;

        for (Direction direction : directions) {
            MapLocation location = currentLocation.add(direction);
            if (rc.getType() == RobotType.CARRIER) {
                location = location.add(direction);
            }

            if (!rc.canSenseLocation(location) || !rc.onTheMap(location) || rc.canSenseRobotAtLocation(location) || !rc.sensePassability(location)) { continue; }

            int distance = 0;
            MapLocation enemyHQLocation = null;
            for (RobotInfo robot : nearbyEnemies) {
                if (isDangerous(robot.type)) {
                    distance += location.distanceSquaredTo(robot.location);
                }
                if (robot.getType() == RobotType.HEADQUARTERS) {
                    enemyHQLocation = robot.location;
                    if (currentLocation.distanceSquaredTo(enemyHQLocation) <= 9) {
                        distance += location.distanceSquaredTo(enemyHQLocation);
                    }
                    int nextDistance = currentLocation.add(direction).distanceSquaredTo(enemyHQLocation);
                    if (nextDistance <= 9) {
                        distance -= 50 / (nextDistance + 1);
                    }
                }
            }
            if (enemyHQLocation != null) {
                Direction tangentDirection = currentLocation.directionTo(enemyHQLocation).rotateLeft();
                for (int i=3; i>=1; --i) {
                    if (direction.equals(tangentDirection)) {
                        distance += i;
                    }
                    tangentDirection = tangentDirection.rotateLeft();
                }
            }

            if (distance > maxDistance) {
                maxDistance = distance;
                targetLocation = location;
            }
        }

        evading = true;
    }

    // TODO NOT A GOOD WAY OF SELECTING TARGETS
    // SEE cat map for example
    protected void selectRandomTarget() throws GameActionException {
        targetLocation = new MapLocation(RNG.nextInt(rc.getMapWidth()), RNG.nextInt(rc.getMapHeight()));
    }
}
