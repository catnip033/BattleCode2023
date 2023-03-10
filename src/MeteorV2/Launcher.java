package MeteorV2;

import battlecode.common.*;

public strictfp class Launcher extends MobileRobot {
    private MapLocation teamHQLocation;

    private RobotInfo[] nearbyEnemies;
    private MapLocation attackTarget;

    private MapLocation[] enemyHQLocations, enemyWellLocations;
    private boolean[] isExplored, isExploredWell;
    private int enemyWellCount;
    private int symmetry = 0b111;

    private final int totalHQCount;
    private final int width, height;

    public Launcher(RobotController rc) throws GameActionException {
        super(rc);

        totalHQCount = rc.readSharedArray(Idx.teamHQCount);

        enemyHQLocations = new MapLocation[totalHQCount * 3];
        enemyWellLocations = new MapLocation[24];

        isExplored = new boolean[totalHQCount * 3];
        isExploredWell = new boolean[24];

        width = rc.getMapWidth();
        height = rc.getMapHeight();

        int minDistance = Constants.INF;

        for (int i=0; i<totalHQCount; ++i) {
            MapLocation location = decodeLocation(rc.readSharedArray(i + Idx.teamHQLocationOffset));

            int x = location.x, y = location.y;

            enemyHQLocations[i * 3 + 0] = new MapLocation(width - x - 1, height - y - 1);
            enemyHQLocations[i * 3 + 1] = new MapLocation(width - x - 1, y);
            enemyHQLocations[i * 3 + 2] = new MapLocation(x, height - y - 1);

            int distance = distanceTo(location);
            if (distance < minDistance) {
                teamHQLocation = location;
                minDistance = distance;
            }
        }
    }

    public void step() throws GameActionException {
        super.step();

        nearbyEnemies = rc.senseNearbyRobots(-1, team.opponent());

        if (rc.canWriteSharedArray(0, 0)) {
            reportEnemies();

            // map.reportNearbyEnemies(nearbyEnemies);
            rc.writeSharedArray(Idx.symmetryOffset, rc.readSharedArray(Idx.symmetryOffset) & symmetry);

            MapLocation enemy = comms.getClosestCluster(currentLocation);
            if (enemy != null && enemy.isAdjacentTo(currentLocation)) comms.setNeedToResetEnemyLocs();
        }

        if (rc.getRoundNum() >= 3) {
            symmetry &= rc.readSharedArray(Idx.symmetryOffset);
        }

        final int enemyAttackerCount = getEnemyAttackerCount();
        final MapLocation closestEnemyAttacker = getClosestEnemyAttacker();

        // Go to closest possible enemy HQ location that is undiscovered
        // Unless go to random location
        updateTarget();

        // Always attack enemy when possible
        updateAttackTarget();

        // Reset target if adjacent to it
        if (targetLocation != null && currentLocation.distanceSquaredTo(targetLocation) <= 2 &&
                (!rc.canSenseRobotAtLocation(targetLocation)
                        || rc.senseRobotAtLocation(targetLocation).getType() != RobotType.HEADQUARTERS
                        || rc.senseRobotAtLocation(targetLocation).getTeam() != team.opponent())) { targetLocation = null; }

        evadeInvisibleEnemyHQ();

        if (closestEnemyAttacker != null && currentLocation.distanceSquaredTo(closestEnemyAttacker) <= 16) updateTargetForEvasion(nearbyEnemies);

        if (enemyAttackerCount >= 2) {
            updateTargetForEvasion(nearbyEnemies);
        }


        for (RobotInfo robot : nearbyEnemies) {
            if (robot.getType() == RobotType.HEADQUARTERS) {
                updateTargetForEvasion(nearbyEnemies);
                break;
            }
        }

        if (attackTarget != null && rc.isActionReady()) {
            if (isDangerous(rc.senseRobotAtLocation(attackTarget).type)) { updateTargetForEvasion(nearbyEnemies); }
            rc.attack(attackTarget);
        }

        if (!evading) {
            selectRandomTarget();

            MapLocation enemy = comms.getClosestCluster(currentLocation);

            if (enemy != null && (targetLocation == null || currentLocation.distanceSquaredTo(targetLocation) > currentLocation.distanceSquaredTo(enemy))) {
                targetLocation = enemy;
            }

            // Move to attack target
            if (attackTarget != null && rc.canSenseRobotAtLocation(attackTarget) && !isDangerous(rc.senseRobotAtLocation(attackTarget).type) && enemyAttackerCount == 0) {
                targetLocation = attackTarget;
                if (currentLocation.isAdjacentTo(attackTarget)) targetLocation = currentLocation;
            }

            if (attackTarget == null) {
                for (int id : rc.senseNearbyIslands()) {
                    if (rc.senseTeamOccupyingIsland(id) != team.opponent()) continue;
                    MapLocation[] locations = rc.senseNearbyIslandLocations(id);
                    targetLocation = locations[RNG.nextInt(locations.length)];
                    break;
                }
            }

            if (attackTarget == null && targetLocation == null) {
                for (int id : rc.senseNearbyIslands()) {
                    if (rc.senseTeamOccupyingIsland(id) != team || rc.senseAnchorPlantedHealth(id) == 250) continue;
                    MapLocation[] locations = rc.senseNearbyIslandLocations(id);
                    targetLocation = locations[RNG.nextInt(locations.length)];
                    break;
                }
            }
        }

        move();

        if (rc.isActionReady()) {
            updateAttackTarget();
            if (attackTarget != null && rc.canAttack(attackTarget)) rc.attack(attackTarget);
        }

        if (rc.isActionReady()) {
            if (rc.senseCloud(currentLocation)) {
                int dx = RNG.nextInt(7) - 3;
                int dy = RNG.nextInt(7) - 3;

                if (dx == 0 && dy == 0) {
                    dx = -2;
                    dy = +2;
                }

                if (dx * dx + dy * dy == 1) {
                    dx = 3 * dx;
                    dy = 3 * dy;
                }

                if (dx * dx + dy * dy == 2) {
                    dx = 2 * dx;
                    dy = 2 * dy;
                }

                if (dx * dx + dy * dy == 4) {
                    dx = (int)((float)dx * 1.5);
                    dy = (int)((float)dy * 1.5);
                }

                attackTarget = new MapLocation(currentLocation.x + dx, currentLocation.y + dy);
                if (rc.canAttack(attackTarget)) rc.attack(attackTarget);
            }

            else {
                MapLocation[] cloudLocations = rc.senseNearbyCloudLocations(16);

                MapLocation[] eligibleLocations = new MapLocation[cloudLocations.length];
                int farCloudCount = 0;

                for (MapLocation cloudLocation : cloudLocations) {
                    if (currentLocation.distanceSquaredTo(cloudLocation) > 4) {
                        eligibleLocations[farCloudCount] = cloudLocation;
                        farCloudCount += 1;
                    }
                }

                if (farCloudCount > 0) {
                    attackTarget = eligibleLocations[RNG.nextInt(farCloudCount)];
                    if (rc.canAttack(attackTarget)) rc.attack(attackTarget);
                }
            }
        }

        draw();
    }

    // TODO Change health to another name
    private void updateAttackTarget() throws GameActionException {
        attackTarget = null;

        int minHealth = Constants.INF;

        for (RobotInfo robot : rc.senseNearbyRobots(16, team.opponent())) {
	    RobotType robotType = robot.getType();

            if (robotType == RobotType.HEADQUARTERS) continue;

            int health = robot.getHealth();

            if (robotType == RobotType.LAUNCHER)     { health -= 500; }
            if (robotType == RobotType.DESTABILIZER) { health -= 700; }
            if (robotType == RobotType.BOOSTER)      { health -= 900; }

            if (health < minHealth) {
                minHealth = health;
                attackTarget = robot.location;
            }
        }
    }

    private int getEnemyAttackerCount() {
        int count = 0;

        for (RobotInfo robot : nearbyEnemies) {
            if (isDangerous(robot.type)) { count += 1; }
        }

        return count;
    }

    private MapLocation getClosestEnemyAttacker() {
        int minDistance = Constants.INF;
        MapLocation closestEnemyAttacker = null;

        for (RobotInfo robot : nearbyEnemies) {
            if (!isDangerous(robot.type)) { continue; }

            int distance = currentLocation.distanceSquaredTo(robot.location);

            if (distance < minDistance) {
                minDistance = distance;
                closestEnemyAttacker = robot.location;
            }
        }

        return closestEnemyAttacker;
    }

    private void evadeInvisibleEnemyHQ() throws GameActionException {
        if (symmetry == 1 || symmetry == 2 || symmetry == 4) {
            for (int j = 0; j < 3; ++j) {
                if ((symmetry >> j & 1) == 0) continue;
                for (int i = 0; i < totalHQCount; ++i) {
                    int k = i * 3 + j;
                    MapLocation location = enemyHQLocations[k];

                    if (currentLocation.distanceSquaredTo(location) <= 20) {
                        updateTargetForEvasion(nearbyEnemies, location);
                    }
                }
            }
        }
    }

    protected void updateTarget() throws GameActionException {
        int minHealth = Constants.INF;

        for (RobotInfo robot : nearbyEnemies) {
            RobotType robotType = robot.getType();

            if (robotType != RobotType.CARRIER) continue;

            int health = robot.getHealth();

            if (health < minHealth) {
                minHealth = health;
                targetLocation = robot.location;
            }
        }
    }

    @Override
    protected void selectRandomTarget() throws GameActionException {
        int minDistance = Constants.INF;

        int newEnemyWellCount = rc.readSharedArray(Idx.manaWellCountOffset);
        while (enemyWellCount < newEnemyWellCount) {
            int i = enemyWellCount;
            MapLocation location = decodeLocation(rc.readSharedArray(i + Idx.manaWellLocationOffset));

            int x = location.x, y = location.y;

            enemyWellLocations[i * 3 + 0] = new MapLocation(width - x - 1, height - y - 1);
            enemyWellLocations[i * 3 + 1] = new MapLocation(width - x - 1, y);
            enemyWellLocations[i * 3 + 2] = new MapLocation(x, height - y - 1);

            enemyWellCount++;
        }

        for (int j = 0; j < 3; ++j) {
            if ((symmetry >> j & 1) == 0) continue;
            for (int i = 0; i < enemyWellCount; ++i) {
                int k = i * 3 + j;
                if (isExploredWell[k]) continue;
                MapLocation location = enemyWellLocations[k];

                if (rc.canSenseLocation(location)) {
                    if (rc.senseWell(location) == null || rc.senseWell(location).getResourceType() != ResourceType.MANA) {
                        isExploredWell[k] = true;
                        symmetry &= ~(1 << j);
                        break;
                    } else {
                        symmetry = 1 << j;
                        if (currentLocation.distanceSquaredTo(location) <= 2) {
                            isExploredWell[k] = true;
                        }
                    }
                }
            }
            for (int i = 0; i < totalHQCount; ++i) {
                int k = i * 3 + j;
                if (isExplored[k]) continue;
                MapLocation location = enemyHQLocations[k];

                if (rc.canSenseLocation(location)) {
                    if (rc.canSenseRobotAtLocation(location)) {
                        RobotInfo robot = rc.senseRobotAtLocation(location);

                        if (robot.type != RobotType.HEADQUARTERS || robot.team != team.opponent()) {
                            isExplored[k] = true;
                            symmetry &= ~(1 << j);
                            break;
                        } else {
                            isExplored[k] = true;
                            symmetry = 1 << j;
                        }
                    } else {
                        isExplored[k] = true;
                        symmetry &= ~(1 << j);
                        break;
                    }
                }
            }
        }

        for (int j = 0; j < 3; ++j) {
            if ((symmetry >> j & 1) == 0) continue;
            for (int i = 0; i < enemyWellCount; ++i) {
                int k = i * 3 + j;
                if (isExploredWell[k]) continue;
                MapLocation location = enemyWellLocations[k];
                if (isWellReported(ResourceType.MANA, location)) continue;

                rc.setIndicatorDot(location, 0, 0, 255);

                int distance = currentLocation.distanceSquaredTo(location);
                distance -= 100000;
                if (j == 0) distance -= 100000;
                if (distance < minDistance) {
                    minDistance = distance;
                    targetLocation = location;
                }
            }

            for (int i = 0; i < totalHQCount; ++i) {
                int k = i * 3 + j;
                if (isExplored[k]) continue;
                MapLocation location = enemyHQLocations[k];

                rc.setIndicatorDot(location, 255, 255, 0);

                int distance = currentLocation.distanceSquaredTo(location);
                if (j == 0) distance -= 100000;
                if (distance < minDistance) {
                    minDistance = distance;
                    targetLocation = location;
                }
            }
        }

        if (targetLocation == null) super.selectRandomTarget();
    }
}
