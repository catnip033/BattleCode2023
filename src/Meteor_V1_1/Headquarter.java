package Meteor_V1_1;

import battlecode.common.*;

public strictfp class Headquarter extends Robot {
    private int anchorBuildOrder = 0;
    private int amplifierCount = 0;

    private final int hqIdx;

    public Headquarter(RobotController rc) throws GameActionException {
        super(rc);

        hqIdx = rc.readSharedArray(Idx.teamHqCount);
        rc.writeSharedArray(Idx.teamHqCount, hqIdx + 1);
        rc.writeSharedArray(hqIdx + Idx.teamHqDataOffset, encode(currentLocation, rc.getID()));

        if (rc.getRoundNum() == 2 && hqIdx == 0) { calculatePossibleEnemyHqLocations(); }

        buildDroid(RobotType.CARRIER);
    }

    public void step() throws GameActionException {
        super.step();

        final int n = rc.readSharedArray(Idx.teamHqCount);

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
        for (int i = 0; i < 8; ++i) {
            Direction direction = directions[RNG.nextInt(8)];
            MapLocation location = currentLocation.add(direction);
            if (rc.canBuildRobot(robotType, location)) {
                rc.buildRobot(robotType, location);
                return;
            }
        }
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