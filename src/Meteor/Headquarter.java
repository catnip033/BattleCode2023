package Meteor;

import battlecode.common.*;

public strictfp class Headquarter extends Robot {
    private int anchorBuildOrder = 0;
    private int amplifierCount = 0;

    private final int idx;

    public Headquarter(RobotController rc) throws GameActionException {
        super(rc);

        idx = rc.readSharedArray(Idx.teamHQCount);

        rc.writeSharedArray(Idx.teamHQCount, idx + 1);
        rc.writeSharedArray(idx + Idx.teamHQLocationOffset, encode(currentLocation, rc.getID()));
    }

    public void step() throws GameActionException {
        super.step();

        if (idx == 0) { map.reset(); }

        RobotInfo[] nearbyEnemies = rc.senseNearbyRobots(-1, team.opponent());

        map.reportNearbyEnemies(nearbyEnemies);

        for (RobotInfo robot : nearbyEnemies) {
            if (isDangerous(robot.getType())) {
                buildDroid(RobotType.LAUNCHER);
                break;
            }
        }

        final int ad = rc.getResourceAmount(ResourceType.ADAMANTIUM);
        final int mn = rc.getResourceAmount(ResourceType.MANA);

        if (rc.isActionReady()) {
            if (rc.getRoundNum() <= 150) {
                if (ad >= 50) {
                    buildDroid(RobotType.CARRIER);
                } else if (mn >= 60) {
                    buildDroid(RobotType.LAUNCHER);
                }
            } else if (rc.getRoundNum() <= 500) {
                if (mn >= 40 && ad >= 40 && amplifierCount < 2) {
                    buildDroid(RobotType.AMPLIFIER);
                    amplifierCount++;
                } else if (mn >= 100) {
                    buildDroid(RobotType.LAUNCHER);
                } else if (ad >= 100) {
                    buildDroid(RobotType.CARRIER);
                }
            } else {
                if (ad >= 100 && anchorBuildOrder < 4 || ad >= 200) {
                    buildDroid(RobotType.CARRIER);
                    if (mn >= 60) anchorBuildOrder++;
                } else if (mn >= 100 && anchorBuildOrder < 8 || mn >= 200) {
                    buildDroid(RobotType.LAUNCHER);
                    if (ad >= 50) anchorBuildOrder++;
                } else if (ad >= 100 && mn >= 100) {
                    rc.buildAnchor(Anchor.STANDARD);
                    anchorBuildOrder = 0;
                }
            }
            //else if (mn >= 60 && rc.getNumAnchors(Anchor.STANDARD) > 0) buildDroid(RobotType.LAUNCHER);
            //else if (ad >= 50 && countCarriers() < 10 && rc.getNumAnchors(Anchor.STANDARD) > 0) buildDroid(RobotType.CARRIER);
        }
    }

    private void buildDroid(RobotType robotType) throws GameActionException {
        MapLocation well = bestWell();
        if (robotType == RobotType.CARRIER && well != null) {
            int minDistance = Constants.INF;
            MapLocation buildLocation = null;

            for (MapInfo mapInfo : rc.senseNearbyMapInfos(9)) {
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

    private MapLocation bestWell() throws GameActionException {
        int minCount = Constants.INF;
        MapLocation bestWellLocation = null;

        for (WellInfo wellInfo : rc.senseNearbyWells()) {
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
}
