package Meteor_V1_1;

import battlecode.common.*;

public strictfp class Headquarter extends Robot {
    private int anchorBuildOrder = 0;
    private int amplifierCount = 0;

    public Headquarter(RobotController rc) throws GameActionException {
        super(rc);

        if (rc.readSharedArray(Idx.firstHqId) == 0) {
            rc.writeSharedArray(Idx.firstHqId, rc.getID());
        }

        buildDroid(RobotType.CARRIER);
    }

    public void step() throws GameActionException {
        super.step();

        if (rc.getID() == rc.readSharedArray(Idx.firstHqId)) {
            minimap.reset();
            rc.setIndicatorString("reset()");
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
                if (mn >= 60) {
                    buildDroid(RobotType.LAUNCHER);
                } else if (ad >= 50) {
                    buildDroid(RobotType.CARRIER);
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
}