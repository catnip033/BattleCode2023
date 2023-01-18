package Pathing;

import battlecode.common.*;

public strictfp class Headquarter extends Robot {
    private final int hqIdx;

    public Headquarter(RobotController rc) throws GameActionException {
        super(rc);

        hqIdx = rc.readSharedArray(Idx.teamHqCount);
        rc.writeSharedArray(Idx.teamHqCount, hqIdx + 1);
        rc.writeSharedArray(hqIdx + Idx.teamHqDataOffset, encode(currentLocation, rc.getID()));

        if (rc.getRoundNum() == 2 && hqIdx == 0) { calculatePossibleEnemyHqLocations(); }
    }

    public void step() throws GameActionException {
        super.step();

        if (hqIdx == 0) {
            minimap.reset();
        }

        RobotInfo[] nearbyEnemies = rc.senseNearbyRobots(-1, team.opponent());

        minimap.reportNearbyEnemies(nearbyEnemies);

        for (RobotInfo robot : nearbyEnemies) {
            if (isDangerous(robot.getType())) {
                buildDroid(RobotType.LAUNCHER);
                break;
            }
        }

        final int ad = rc.getResourceAmount(ResourceType.ADAMANTIUM);

        if (rc.getRoundNum() < 100 && rc.isActionReady()) {
            if (ad >= 50) {
                buildDroid(RobotType.CARRIER);
            }
        }
    }

    private void buildDroid(RobotType robotType) throws GameActionException {
        MapLocation well = bestWell();
        if (robotType == RobotType.CARRIER && well != null) {
            int minDistance = Constants.INF;
            MapLocation buildLocation = null;

            for(MapInfo mapInfo : rc.senseNearbyMapInfos(9)) {
                MapLocation location = mapInfo.getMapLocation();
                int distance = well.distanceSquaredTo(location);
                if (rc.canBuildRobot(robotType, location) && distance < minDistance) {
                    minDistance = distance;
                    buildLocation = location;
                }
            }

            if (buildLocation != null) {
                rc.buildRobot(robotType, buildLocation);
                return;
            }
        }
        for (int i = 0; i < 8; ++i) {
            Direction direction = directions[RNG.nextInt(8)];
            MapLocation location = currentLocation.add(direction);
            if (rc.canBuildRobot(robotType, location)) {
                rc.buildRobot(robotType, location);
                return;
            }
        }
    }

    MapLocation bestWell() throws GameActionException {
        int minCount = Constants.INF;
        MapLocation bestWellLocation = null;
        for(WellInfo wellInfo : rc.senseNearbyWells()) {
            MapLocation location = wellInfo.getMapLocation();
            int carrierCount = 0;
            for (RobotInfo robotInfo : rc.senseNearbyRobots(location, 5, team)) {
                if (robotInfo.getType() == RobotType.CARRIER) carrierCount++;
            }
            if (carrierCount < minCount) {
                minCount = carrierCount;
                bestWellLocation = location;
            }
        }
        return bestWellLocation;
    }

    private void calculatePossibleEnemyHqLocations() throws GameActionException {
        int width = rc.getMapWidth() - 1, height = rc.getMapHeight() - 1;
        int n = rc.readSharedArray(Idx.teamHqCount);

        // Horizontal, Vertical, Rotational symmetry for all team archon locations
        for (int i = 0; i < n; ++i) {
            MapLocation teamHqLocation = decodeLocation(rc.readSharedArray(i + Idx.teamHqDataOffset));
            int x = teamHqLocation.x, y = teamHqLocation.y;

            rc.writeSharedArray(i * 3 + 0 + Idx.enemyHqLocationOffset, encode(width - x, y));
            rc.writeSharedArray(i * 3 + 1 + Idx.enemyHqLocationOffset, encode(x, height - y));
            rc.writeSharedArray(i * 3 + 2 + Idx.enemyHqLocationOffset, encode(width - x, height - y));
        }

        // Remove Duplicates
        for (int i = 0; i < n * 3; ++i) {
            for(int j = 0; j < i; ++j) {
                if ((rc.readSharedArray(i + Idx.enemyHqLocationOffset) & 0xFFF) == (rc.readSharedArray(j + Idx.enemyHqLocationOffset) & 0xFFF)) {
                    rc.writeSharedArray(i + Idx.enemyHqLocationOffset, 60);
                    break;
                }
            }
        }
    }
}
