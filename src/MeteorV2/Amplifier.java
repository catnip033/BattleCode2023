package MeteorV2;

import battlecode.common.*;

public strictfp class Amplifier extends MobileRobot {
    private enum Target {
        WELL,
        ENEMY_HQ,
    }

    private final Target target;

    private MapLocation teamHQLocation;

    private MapLocation[] enemyHQLocations;
    private boolean[] isExplored;
    private int symmetry = 0b111;

    public Amplifier(RobotController rc) throws GameActionException {
        super(rc);

        if (rc.getRoundNum() <= 10) {
            target = Target.WELL;
        } else {
            target = Target.ENEMY_HQ;
        }

        switch (target) {
            case WELL:
                break;

            case ENEMY_HQ:
                final int totalHQCount = rc.readSharedArray(Idx.teamHQCount);

                enemyHQLocations = new MapLocation[3];

                isExplored = new boolean[3];

                final int width = rc.getMapWidth(), height = rc.getMapHeight();

                int minDistance = Constants.INF;

                for (int i = 0; i < totalHQCount; ++i) {
                    MapLocation location = decodeLocation(rc.readSharedArray(i + Idx.teamHQLocationOffset));

                    int distance = distanceTo(location);
                    if (distance < minDistance) {
                        teamHQLocation = location;
                        minDistance = distance;
                    }
                }

                enemyHQLocations[0] = new MapLocation(width - teamHQLocation.x - 1, height - teamHQLocation.y - 1);
                enemyHQLocations[1] = new MapLocation(width - teamHQLocation.x - 1, teamHQLocation.y);
                enemyHQLocations[2] = new MapLocation(teamHQLocation.x, height - teamHQLocation.y - 1);
                break;
        }
    }

    public void step() throws GameActionException {
        super.step();

        if (targetLocation != null && currentLocation.distanceSquaredTo(targetLocation) <= 5) {
            targetLocation = null;
        }

        RobotInfo[] nearbyEnemies = rc.senseNearbyRobots(-1, team.opponent());

        //map.reportNearbyEnemies(nearbyEnemies);
        reportEnemies();

        RobotInfo enemyAttacker = null;
        for (RobotInfo robot : nearbyEnemies) {
            if (isDangerous(robot.getType())) {
                enemyAttacker = robot;
                break;
            }
        }

        // Evade enemy launchers
        if (enemyAttacker != null) {
            updateTargetForEvasion(nearbyEnemies);
            move();
            draw();
            return;
        }

        // Evade enemy HQ
        for (RobotInfo robot : nearbyEnemies) {
            if (robot.getType() == RobotType.HEADQUARTERS) {
                updateTargetForEvasion(nearbyEnemies);
                break;
            }
        }

        //if (targetLocation == null) selectRandomTarget();

        selectRandomTarget();

        MapLocation enemy = comms.getClosestCluster(currentLocation);
        if (enemy != null) targetLocation = enemy;

        move();
        draw();
    }

    @Override
    protected void selectRandomTarget() throws GameActionException {
        int minDistance = Constants.INF;

        for (int i = 0; i < 3; ++i) {
            MapLocation location = enemyHQLocations[i];
            if (isExplored[i]) continue;

            if (rc.canSenseLocation(location)) {
                if (rc.canSenseRobotAtLocation(location)) {
                    RobotInfo robot = rc.senseRobotAtLocation(location);

                    if (robot.type != RobotType.HEADQUARTERS || robot.team != team.opponent()) {
                        isExplored[i] = true;
                        continue;
                    }
                } else {
                    isExplored[i] = true;
                    continue;
                }
            }

            int distance = 0; //distanceTo(location);
            if (distance < minDistance) {
                minDistance = distance;
                targetLocation = location;
            }
        }

        if (targetLocation == null) super.selectRandomTarget();
    }
}
