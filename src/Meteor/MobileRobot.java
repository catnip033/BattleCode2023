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
            MapLocation location = currentLocation.add(direction).add(direction);

            if (!rc.canSenseLocation(location) || !rc.onTheMap(location) || rc.canSenseRobotAtLocation(location) || !rc.sensePassability(location)) { continue; }

            int distance = 0;
            for (RobotInfo robot : nearbyEnemies) {
                if (isDangerous(robot.type)) {
                    distance += location.distanceSquaredTo(robot.location);
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
