package MeteorV2;

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

        if (idx == 0) {
            rc.writeSharedArray(Idx.symmetryOffset, 0b111);
        }
    }

    public void step() throws GameActionException {
        super.step();

        comms.resetAvgEnemyLoc();
        comms.drawClusterDots();

        if (rc.getRoundNum() % 100 == 0) {
            detachWells(ResourceType.ADAMANTIUM);
            detachWells(ResourceType.MANA);
        }

        //if (idx == 0) { map.reset(); }

        if (rc.getRoundNum() == 2) { reportSymmetry(); }
        if (rc.getRoundNum() % 10 == 0) comms.setNeedToResetEnemyLocs();

        RobotInfo[] nearbyEnemies = rc.senseNearbyRobots(-1, team.opponent());

        //map.reportNearbyEnemies(nearbyEnemies);
        reportEnemies();

        for (RobotInfo robot : nearbyEnemies) {
            if (isDangerous(robot.getType())) {
                buildDroid(RobotType.LAUNCHER);
                break;
            }
        }

        while (build()) ;
    }

    private boolean build() throws GameActionException {
        final int ad = rc.getResourceAmount(ResourceType.ADAMANTIUM);
        final int mn = rc.getResourceAmount(ResourceType.MANA);

        if (rc.isActionReady()) {
            if (rc.getRoundNum() <= 150) {
                if (mn >= RobotType.LAUNCHER.buildCostMana) {
                    return buildDroid(RobotType.LAUNCHER);
                } else if (ad >= RobotType.CARRIER.buildCostAdamantium) {
                    return buildDroid(RobotType.CARRIER);
                }
            } else if (rc.getRoundNum() <= 500) {
                if (mn >= RobotType.AMPLIFIER.buildCostMana && ad >= RobotType.AMPLIFIER.buildCostAdamantium && amplifierCount < 2) {
                    amplifierCount++;
                    return buildDroid(RobotType.AMPLIFIER);
                } else if (mn >= RobotType.LAUNCHER.buildCostMana) {
                    return buildDroid(RobotType.LAUNCHER);
                } else if (ad >= RobotType.CARRIER.buildCostAdamantium) {
                    return buildDroid(RobotType.CARRIER);
                }
            } else {
                if (ad >= 80 && anchorBuildOrder < 4 || ad >= 200) {
                    if (mn >= RobotType.LAUNCHER.buildCostMana) anchorBuildOrder++;
                    return buildDroid(RobotType.CARRIER);
                } else if (mn >= 80 && anchorBuildOrder < 8 || mn >= 200) {
                    if (ad >= RobotType.CARRIER.buildCostAdamantium) anchorBuildOrder++;
                    return buildDroid(RobotType.LAUNCHER);
                } else if (ad >= 80 && mn >= 80) {
                    rc.buildAnchor(Anchor.STANDARD);
                    anchorBuildOrder = 0;
                    return true;
                }
            }
            //else if (mn >= 60 && rc.getNumAnchors(Anchor.STANDARD) > 0) buildDroid(RobotType.LAUNCHER);
            //else if (ad >= 50 && countCarriers() < 10 && rc.getNumAnchors(Anchor.STANDARD) > 0) buildDroid(RobotType.CARRIER);
        }
        return false;
    }

    private boolean buildDroid(RobotType robotType) throws GameActionException {
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
                return true;
            }
        }
        if (robotType == RobotType.LAUNCHER) {
            int minDistance = Constants.INF;
            MapLocation buildLocation = null;
            final MapLocation centerLocation = new MapLocation(rc.getMapWidth() / 2, rc.getMapHeight() / 2);

            for (MapInfo mapInfo : rc.senseNearbyMapInfos(9)) {
                MapLocation location = mapInfo.getMapLocation();
                int distance = centerLocation.distanceSquaredTo(location);
                if (rc.canBuildRobot(robotType, location) && distance < minDistance) {
                    minDistance = distance;
                    buildLocation = location;
                }
            }

            if (buildLocation != null) {
                rc.buildRobot(robotType, buildLocation);
                return true;
            }
        }

        for (int i = 0; i < 8; ++i) {
            Direction direction = directions[RNG.nextInt(8)];
            MapLocation location = currentLocation.add(direction);

            if (rc.canBuildRobot(robotType, location)) {
                rc.buildRobot(robotType, location);
                return true;
            }
        }
        return false;
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

    private void reportSymmetry() throws GameActionException {
        int width = rc.getMapWidth() - 1, height = rc.getMapHeight() - 1;
        int n = rc.readSharedArray(Idx.teamHQCount);

        int symmetry = rc.readSharedArray(Idx.symmetryOffset);

        for (int i = 0; i < n; ++i) {
            MapLocation teamHQLocation = decodeLocation(rc.readSharedArray(i + Idx.teamHQLocationOffset));
            int x = teamHQLocation.x, y = teamHQLocation.y;

            MapLocation[] possibleEnemyHQLocation = {
                    new MapLocation(width - x - 1, height - y - 1),
                    new MapLocation(width - x - 1, y),
                    new MapLocation(x, height - y - 1),
            };

            for (int j = 0; j < 3; ++j) {
                MapLocation location = possibleEnemyHQLocation[j];

                if (rc.canSenseLocation(location)) {
                    if (!rc.canSenseRobotAtLocation(location) || rc.senseRobotAtLocation(location).type != RobotType.HEADQUARTERS || rc.senseRobotAtLocation(location).team == team) {
                        symmetry &= ~(1 << j);
                    }
                }
            }
        }

        rc.writeSharedArray(Idx.symmetryOffset, symmetry);
    }
}
