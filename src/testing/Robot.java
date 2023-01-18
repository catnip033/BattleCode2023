package testing;

import battlecode.common.*;

import java.util.Random;

public class Robot {

    protected RobotController rc;

    protected MapLocation currentLocation;
    protected MapLocation target;

    protected boolean evading = false;

    protected final BFS bfs;
    protected final BugPath bugPath;
    protected final Team team;

    protected static final Random RNG = new Random(42);

    /** Array containing all the possible movement directions. */
    protected static final Direction[] directions = {
            Direction.NORTH,
            Direction.NORTHEAST,
            Direction.EAST,
            Direction.SOUTHEAST,
            Direction.SOUTH,
            Direction.SOUTHWEST,
            Direction.WEST,
            Direction.NORTHWEST,
    };

    public Robot(RobotController rc) throws GameActionException {
        this.rc = rc;
        this.currentLocation = rc.getLocation();

        RNG.setSeed(rc.getRoundNum());
        team = rc.getTeam();

        bfs = new BFS20(rc);
        bugPath = new BugPath(rc);
    }

    public void step() throws GameActionException {
        currentLocation = rc.getLocation();
        evading = false;
    }

    protected boolean move() throws GameActionException {
        if (!rc.isMovementReady() || currentLocation.equals(target)) { return false; }
        boolean encounteredObstacle = false;
        for (MapInfo mapInfo : rc.senseNearbyMapInfos(2)) {
            encounteredObstacle |= !mapInfo.isPassable() || rc.canSenseRobotAtLocation(mapInfo.getMapLocation());
        }
        boolean moved;
        if (encounteredObstacle) {
            bugPath.update();
            moved = bugPath.moveTo(target);
        } else {
            moved = bfs.move(target);
        }
        currentLocation = rc.getLocation();
        return moved;
    }

    protected void draw() throws GameActionException {
        if (target != null) {
            rc.setIndicatorDot(target, 0, 255, 0);
            rc.setIndicatorLine(rc.getLocation(), target, 255, 0, 0);
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

        target = currentLocation;

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
                target = location;
            }
        }

        evading = true;
    }

    protected void selectRandomTarget() throws GameActionException {
        target = new MapLocation(RNG.nextInt(rc.getMapWidth()), RNG.nextInt(rc.getMapHeight()));
    }

    protected boolean isDangerous(RobotType type) {
        return type == RobotType.LAUNCHER || type == RobotType.DESTABILIZER;
    }
}
