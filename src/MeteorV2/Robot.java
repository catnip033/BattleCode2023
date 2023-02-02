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

    //protected final Map map;
    protected final Comms comms;
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

        //map = new Map(rc);
        comms = new Comms(rc);
    }

    public void step() throws GameActionException {
        currentLocation = rc.getLocation();
        //map.sync();
    }

    protected boolean isDangerous(RobotType type) {
        return type == RobotType.LAUNCHER || type == RobotType.DESTABILIZER;
    }

    protected int distanceTo(MapLocation location) {
        return Math.max(Math.abs(location.x - currentLocation.x), Math.abs(location.y - currentLocation.y));
    }

    protected Direction[] inorderDirections(Direction direction) {
        return new Direction[]{
                direction,
                direction.rotateRight(),
                direction.rotateLeft(),
                direction.rotateRight().rotateRight(),
                direction.rotateLeft().rotateLeft(),
        };
    }

    public void reportEnemies() throws GameActionException {
        int count = 0;
        int totalX = 0;
        int totalY = 0;
        for (RobotInfo bot : rc.senseNearbyRobots(-1, team.opponent())) {
            if (count == 20) {
                break;
            }
            switch(bot.getType()) {
                case LAUNCHER:
                case DESTABILIZER:
                case BOOSTER:
                    totalX += bot.location.x;
                    totalY += bot.location.y;
                    count++;
                    break;
                case CARRIER:
                case AMPLIFIER:
//                    if(!comms.foundEnemySoldier) {
//                        totalX += bot.location.x;
//                        totalY += bot.location.y;
//                        count++;
//                    }
                    break;
            }
        }
        if (count != 0) {
            comms.updateAvgEnemyLoc(totalX, totalY, count);
        }

    }

    protected void reportWell(ResourceType resourceType, MapLocation wellLocation, int passibleTileCount) throws GameActionException {
        if (!rc.canWriteSharedArray(0, 0)) {
            return;
        }

        int wellCountOffset    = (resourceType == ResourceType.ADAMANTIUM) ? Idx.adamantiumWellCountOffset : Idx.manaWellCountOffset;
        int wellLocationOffset = (resourceType == ResourceType.ADAMANTIUM) ? Idx.adamantiumWellLocationOffset : Idx.manaWellLocationOffset;

        int wellCount = rc.readSharedArray(wellCountOffset);
        int wellIdx = wellCount;

        for (int i=0; i<wellCount; ++i) {
            int code = rc.readSharedArray(i + wellLocationOffset);

            if (decodeLocation(code).equals(wellLocation)) {
                wellIdx = i;
                break;
            }
        }

        if (wellIdx < 8) {
            rc.writeSharedArray(wellIdx + wellLocationOffset, encode(wellLocation, passibleTileCount));
            if (wellIdx == wellCount) rc.writeSharedArray(wellCountOffset, wellCount + 1);
        }
    }

    protected MapLocation getClosestWellLocation(ResourceType resourceType) throws GameActionException {
        int wellCountOffset    = (resourceType == ResourceType.ADAMANTIUM) ? Idx.adamantiumWellCountOffset : Idx.manaWellCountOffset;
        int wellLocationOffset = (resourceType == ResourceType.ADAMANTIUM) ? Idx.adamantiumWellLocationOffset : Idx.manaWellLocationOffset;

        int wellCount = rc.readSharedArray(wellCountOffset);

        MapLocation closestWellLocation = null;
        int minDistance = Constants.INF;

        for (int i=0; i<wellCount; ++i) {
            int code = rc.readSharedArray(i + wellLocationOffset);

            if (decodeID(code) > 0) {
                MapLocation location = decodeLocation(code);
                int distance = currentLocation.distanceSquaredTo(location);

                if (distance < minDistance) {
                    closestWellLocation = location;
                    minDistance = distance;
                }
            }
        }

        return closestWellLocation;
    }

    protected void attachCarrierToWell(ResourceType resourceType, MapLocation wellLocation) throws GameActionException {
        int wellCountOffset    = (resourceType == ResourceType.ADAMANTIUM) ? Idx.adamantiumWellCountOffset : Idx.manaWellCountOffset;
        int wellLocationOffset = (resourceType == ResourceType.ADAMANTIUM) ? Idx.adamantiumWellLocationOffset : Idx.manaWellLocationOffset;

        int wellCount = rc.readSharedArray(wellCountOffset);

        for (int i=0; i<wellCount; ++i) {
            int code = rc.readSharedArray(i + wellLocationOffset);

            if (decodeID(code) > 0 && decodeLocation(code).equals(wellLocation)) {
                rc.writeSharedArray(i + wellLocationOffset, encode(wellLocation, decodeID(code) - 1));
            }
        }
    }

    protected boolean isWellAvailable(ResourceType resourceType, MapLocation wellLocation) throws GameActionException {
        int wellCountOffset    = (resourceType == ResourceType.ADAMANTIUM) ? Idx.adamantiumWellCountOffset : Idx.manaWellCountOffset;
        int wellLocationOffset = (resourceType == ResourceType.ADAMANTIUM) ? Idx.adamantiumWellLocationOffset : Idx.manaWellLocationOffset;

        int wellCount = rc.readSharedArray(wellCountOffset);

        for (int i=0; i<wellCount; ++i) {
            int code = rc.readSharedArray(i + wellLocationOffset);

            if (decodeLocation(code).equals(wellLocation)) {
                return decodeID(code) > 0;
            }
        }

        return true;
    }

    protected boolean isWellReported(ResourceType resourceType, MapLocation wellLocation) throws GameActionException {
        int wellCountOffset    = (resourceType == ResourceType.ADAMANTIUM) ? Idx.adamantiumWellCountOffset : Idx.manaWellCountOffset;
        int wellLocationOffset = (resourceType == ResourceType.ADAMANTIUM) ? Idx.adamantiumWellLocationOffset : Idx.manaWellLocationOffset;

        int wellCount = rc.readSharedArray(wellCountOffset);

        for (int i=0; i<wellCount; ++i) {
            int code = rc.readSharedArray(i + wellLocationOffset);

            if (decodeLocation(code).equals(wellLocation)) {
                return true;
            }
        }

        return false;
    }

    protected void detachWells(ResourceType resourceType) throws GameActionException {
        int wellCountOffset    = (resourceType == ResourceType.ADAMANTIUM) ? Idx.adamantiumWellCountOffset : Idx.manaWellCountOffset;
        int wellLocationOffset = (resourceType == ResourceType.ADAMANTIUM) ? Idx.adamantiumWellLocationOffset : Idx.manaWellLocationOffset;

        int wellCount = rc.readSharedArray(wellCountOffset);

        for (int i=0; i<wellCount; ++i) {
            int code = rc.readSharedArray(i + wellLocationOffset);

            if (decodeID(code) == 0) {
                rc.writeSharedArray(i + wellLocationOffset, encode(decodeLocation(code), decodeID(code) + 1));
            }
        }
    }
}
