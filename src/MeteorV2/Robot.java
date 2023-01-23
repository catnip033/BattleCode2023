package MeteorV2;

import battlecode.common.*;

import java.util.Random;

public class Robot {
    /* Enocde a location on the map and a ID into a 16bit integer */
    int encode (MapLocation location, int ID) { return location.x | (location.y << 6) | (ID << 12); }
    int encode (MapLocation location) { return location.x | (location.y << 6); }
    int encode (int x, int y) { return x | (y << 6); }

    int decodeID (int code) { return (code >> 12) & 0xF; }
    MapLocation decodeLocation (int code) { return new MapLocation(code & 0x3F, (code >> 6) & 0x3F); }

    protected RobotController rc;

    protected MapLocation currentLocation;
    protected MapLocation targetLocation;

    protected final Map map;
    protected final Team team;

    protected static final Random RNG = new Random(42);

    /* Array containing all the possible movement directions. */
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

        currentLocation = rc.getLocation();
        team = rc.getTeam();

        RNG.setSeed(rc.getRoundNum());

        map = new Map(rc);
    }

    public void step() throws GameActionException {
        currentLocation = rc.getLocation();
        map.sync();
    }

    protected boolean isDangerous(RobotType type) {
        return type == RobotType.LAUNCHER || type == RobotType.DESTABILIZER;
    }

    protected int distanceTo(MapLocation location) {
        return Math.max(Math.abs(location.x - currentLocation.x), Math.abs(location.y - currentLocation.y));
    }
}
