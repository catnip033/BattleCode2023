package MeteorV2;

import battlecode.common.*;

public strictfp class Carrier extends MobileRobot {
    private RobotInfo[] nearbyEnemies;
    private MapLocation closestTeamHQLocation;
    private MapLocation closestWellLocation;

    private boolean carryingAnchor = false;
    private boolean foundEnemy = false;
    private boolean returningResource = false;

    public Carrier(RobotController rc) throws GameActionException {
        super(rc);

        updateClosestTeamHQLocation();
    }

    public void step() throws GameActionException {
        super.step();

        updateClosestTeamHQLocation();

        if (targetLocation != null && rc.canSenseLocation(targetLocation) && rc.senseMapInfo(targetLocation).getCurrentDirection() != Direction.CENTER) targetLocation = null;

        if (rc.canTakeAnchor(closestTeamHQLocation, Anchor.STANDARD)) {
            rc.takeAnchor(closestTeamHQLocation, Anchor.STANDARD);
            carryingAnchor = true;
            targetLocation = null;
        }

        nearbyEnemies = rc.senseNearbyRobots(-1, team.opponent());

        if (rc.canWriteSharedArray(0, 0)) {
            map.reportNearbyEnemies(nearbyEnemies);
        }

        if (countEnemyAttackers() > 0) {
            foundEnemy = true;
            if (rc.getWeight() > 0) returningResource = true;
            updateTarget();

            MapLocation attackTarget = selectAttackTarget();
            if (attackTarget != null && rc.getWeight() > 0 && currentLocation.distanceSquaredTo(attackTarget) > 9) {
                Direction direction = bestAttackDirection(currentLocation.directionTo(attackTarget));
                if (direction != null) {
                    rc.move(direction);
                }
            }
            if (attackTarget != null && rc.canAttack(attackTarget)) {
                carryingAnchor = false;
                rc.attack(attackTarget);
            }
            if (!returningResource) updateTargetForEvasion(nearbyEnemies);
            while (move()) transferOrMine();

            transferOrMine();

            draw();
            return;
        }

        if (carryingAnchor) {
            if (rc.canPlaceAnchor() && rc.senseTeamOccupyingIsland(rc.senseIsland(rc.getLocation())) == Team.NEUTRAL) {
                rc.placeAnchor();
                carryingAnchor = false;
            }
        }

        else {
            transferOrMine();
        }

        updateTarget();
        while (move()) {
            nearbyEnemies = rc.senseNearbyRobots(-1, team.opponent());
            if (countEnemyAttackers() > 0) updateTargetForEvasion(nearbyEnemies);
            transferOrMine();
        }

        transferOrMine();

        draw();
    }

    private void transferOrMine() throws GameActionException {
        if (!rc.isActionReady()) { return; }
        if (isReturning()) {
            transfer();
            if (rc.getWeight() == 0) {
                returningResource = false;
            }
        }
        else {
            mine();
            if (rc.getWeight() == GameConstants.CARRIER_CAPACITY) {
                returningResource = true;
            }
        }
    }

    private void updateClosestTeamHQLocation() throws GameActionException {
        final int teamHQCount = rc.readSharedArray(Idx.teamHQCount);
        int minDistance = Constants.INF;

        for (int i=0; i<teamHQCount; ++i) {
            MapLocation teamHQLocation = decodeLocation(rc.readSharedArray(i + Idx.teamHQLocationOffset));

            int distance = distanceTo(teamHQLocation);

            if (distance < minDistance) {
                closestTeamHQLocation = teamHQLocation;
                minDistance = distance;
            }
        }
    }

    private boolean isReturning() throws GameActionException {
        return returningResource || foundEnemy;
    }

    private void mine() throws GameActionException {
        for (WellInfo wellInfo : rc.senseNearbyWells(2, ResourceType.MANA)) {
            rc.collectResource(wellInfo.getMapLocation(), -1);
            closestWellLocation = wellInfo.getMapLocation();
            return;
        }
        for (WellInfo wellInfo : rc.senseNearbyWells(2, ResourceType.ADAMANTIUM)) {
            rc.collectResource(wellInfo.getMapLocation(), -1);
            closestWellLocation = wellInfo.getMapLocation();
            return;
        }
    }

    private void transfer() throws GameActionException {
        for (RobotInfo robotInfo : rc.senseNearbyRobots(2, team)) {
            if (robotInfo.getType() != RobotType.HEADQUARTERS) continue;
            MapLocation location = robotInfo.getLocation();
            for (ResourceType resourceType : ResourceType.values()) {
                if (resourceType == ResourceType.NO_RESOURCE) continue;
                int amount = rc.getResourceAmount(resourceType);
                if (amount > 0 && rc.canTransferResource(location, resourceType, amount)) {
                    rc.transferResource(location, resourceType, amount);
                    return;
                }
            }
        }
    }

    private void updateTarget() throws GameActionException {
        if (currentLocation.equals(targetLocation)) { targetLocation = null; }
        if (targetLocation != null && rc.canSenseLocation(targetLocation) && !rc.sensePassability(targetLocation)) { targetLocation = null; }

        if (carryingAnchor) {
            int[] islandIdxs = rc.senseNearbyIslands();

            for (int idx : islandIdxs) {
                if (rc.senseTeamOccupyingIsland(idx) == Team.NEUTRAL) {
                    MapLocation[] islandLocations = rc.senseNearbyIslandLocations(idx);

                    int minDistance = Constants.INF;

                    for (MapLocation islandLocation : islandLocations) {
                        int distance = distanceTo(islandLocation);

                        if (distance < minDistance) {
                            minDistance = distance;
                            targetLocation = islandLocation;
                        }
                    }
                }
            }
        }

        else if (isReturning()) {
            targetLocation = closestTeamHQLocation;

            // TODO ???
            if (foundEnemy && currentLocation.distanceSquaredTo(targetLocation) <= 5) {
                foundEnemy = false;
            }
            if (!isReturning()) {
                targetLocation = null;
            }
        }

        else {
            if (targetLocation != null && targetLocation.equals(closestTeamHQLocation)) targetLocation = null;
            if (closestWellLocation != null && targetLocation == null) targetLocation = closestWellLocation;

            int minDistance = Constants.INF;

            for (WellInfo wellInfo : rc.senseNearbyWells()) {
                MapLocation location = wellInfo.getMapLocation();

                int carrierCount = 0;

                for (RobotInfo robotInfo : rc.senseNearbyRobots(location, 5, team)) {
                    if (robotInfo.getType() == RobotType.CARRIER) carrierCount++;
                }

                int distance = distanceTo(location);
                if ((distance >= 2 || rc.getWeight() <= 3)
                        && ((wellInfo.getResourceType() == ResourceType.ADAMANTIUM && carrierCount >= rc.getRoundNum() / 50)
                        || (wellInfo.getResourceType() == ResourceType.MANA && carrierCount >= 9))) {
                    if (targetLocation != null && location.distanceSquaredTo(targetLocation) <= 2) {
                        targetLocation = null;
                    }
                    continue;
                }

                if (distance < minDistance) {
                    minDistance = distance;
                    targetLocation = location;
                }
            }

            if (targetLocation != null && minDistance != Constants.INF && currentLocation.distanceSquaredTo(targetLocation) <= 9) {
                targetLocation = bestLocationNextTo(targetLocation);
            }
        }

        if (targetLocation == null) { selectRandomTarget(); }
    }

    protected MapLocation bestLocationNextTo(MapLocation location) throws GameActionException {
        MapLocation bestNeighbor = location;
        int minDistance = Constants.INF;

        for (MapLocation neighbor: rc.getAllLocationsWithinRadiusSquared(location, 2)) {
            if ((rc.canSenseRobotAtLocation(neighbor) || !rc.sensePassability(neighbor) || rc.senseMapInfo(neighbor).getCurrentDirection() != Direction.CENTER) && !currentLocation.equals(neighbor)) { continue; }

            int distance = closestTeamHQLocation.distanceSquaredTo(neighbor); //distanceTo(neighbor);
            if (neighbor.equals(location)) distance = 0;
            if (distance < minDistance) {
                minDistance = distance;
                bestNeighbor = neighbor;
            }
        }

        return bestNeighbor;
    }

    private Direction bestAttackDirection(Direction targetDirection) throws GameActionException {
        RobotInfo[] enemyAttackers = new RobotInfo[countEnemyAttackers()];
        int idx = 0;

        for (RobotInfo robot : nearbyEnemies) {
            if (isDangerous(robot.type)) {
                enemyAttackers[idx++] = robot;
            }
        }

        Direction bestDirection = null;
        int minCount = Constants.INF;

        for (Direction direction : inorderDirections(targetDirection)) {
            if (rc.canMove(direction)) {
                MapLocation location = currentLocation.add(direction);
                int count = 0;
                for (RobotInfo robot : enemyAttackers) {
                    if (robot.location.distanceSquaredTo(location) <= rc.getType().actionRadiusSquared) {
                        count++;
                    }
                }
                if (count <= minCount || minCount == 0) {
                    if (count > 0) {
                        if (count < minCount || minCount == 0) {
                            minCount = count;
                            bestDirection = direction;
                        }
                    } else if (minCount == Constants.INF) {
                        minCount = count;
                        bestDirection = direction;
                    }
                }
            }
        }

        return bestDirection;
    }

    private int countEnemyAttackers() {
        int count = 0;

        for (RobotInfo robot : nearbyEnemies) {
            if (isDangerous(robot.type)) { count += 1; }
        }

        return count;
    }

    private MapLocation selectAttackTarget() throws GameActionException {
        MapLocation attackTarget = null;

        int minHealth = Constants.INF;

        for (RobotInfo robot : rc.senseNearbyRobots(16, team.opponent())) {
            RobotType robotType = robot.getType();

            if (!isDangerous(robotType)) continue;

            int health = robot.getHealth();

            if (health < minHealth) {
                minHealth = health;
                attackTarget = robot.location;
            }
        }

        return attackTarget;
    }
}
