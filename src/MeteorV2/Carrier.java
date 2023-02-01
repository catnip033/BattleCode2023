package MeteorV2;

import battlecode.common.*;

public strictfp class Carrier extends MobileRobot {
    private RobotInfo[] nearbyEnemies;
    private MapLocation closestTeamHQLocation;
    private WellInfo attachedWellInfo;
    private MapLocation adamantiumWellLocation;
    private MapLocation manaWellLocation;
    private int adamantiumWellPassibleTileCount;
    private int manaWellPassibleTileCount;

    private boolean carryingAnchor = false;
    private boolean foundEnemy = false;
    private boolean returningResource = false;
    private boolean reportedAttached = false;

    private final ResourceType targetResource;

    public Carrier(RobotController rc) throws GameActionException {
        super(rc);

        RNG.setSeed(rc.getID());

        if (rc.getRoundNum() <= 5) {
            targetResource = ResourceType.MANA;
        } else {
            targetResource = RNG.nextInt(10) < 4 ? ResourceType.ADAMANTIUM : ResourceType.MANA;
        }

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
            if (adamantiumWellLocation != null) {
                reportWell(ResourceType.ADAMANTIUM, adamantiumWellLocation, adamantiumWellPassibleTileCount);
                adamantiumWellLocation = null;
            }
            if (manaWellLocation != null) {
                reportWell(ResourceType.MANA, manaWellLocation, manaWellPassibleTileCount);
                manaWellLocation = null;
            }
            if (!reportedAttached && attachedWellInfo != null) {
                attachCarrierToWell(attachedWellInfo.getResourceType(), attachedWellInfo.getMapLocation());
                reportedAttached = true;
            }
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

        if (attachedWellInfo != null)
        rc.setIndicatorString("attached: " + attachedWellInfo.getMapLocation() + " reported: " + reportedAttached);
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
        return returningResource || foundEnemy || (getClosestWellLocation(targetResource) == null && foundTargetResourceWell());
    }

    private void mine() throws GameActionException {
        for (WellInfo wellInfo : rc.senseNearbyWells(2, ResourceType.MANA)) {
            if (rc.canCollectResource(wellInfo.getMapLocation(), -1)) {
                rc.collectResource(wellInfo.getMapLocation(), -1);
                if (rc.getWeight() == GameConstants.CARRIER_CAPACITY) {
                    attachedWellInfo = wellInfo;
                }
                return;
            }
        }
        for (WellInfo wellInfo : rc.senseNearbyWells(2, ResourceType.ADAMANTIUM)) {
            if (rc.canCollectResource(wellInfo.getMapLocation(), -1)) {
                rc.collectResource(wellInfo.getMapLocation(), -1);
                if (rc.getWeight() == GameConstants.CARRIER_CAPACITY) {
                    attachedWellInfo = wellInfo;
                }
                return;
            }
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
            MapLocation closestWellLocation = getClosestWellLocation(targetResource);
            if (closestWellLocation == null && attachedWellInfo == null) {
                int approachingDistance = 8;
                if (rc.senseCloud(currentLocation)) approachingDistance = 0;
                for (WellInfo wellInfo : rc.senseNearbyWells()) {
                    MapLocation location = wellInfo.getMapLocation();
                    if (!isWellAvailable(wellInfo.getResourceType(), location)) continue;
                    if (wellInfo.getResourceType() == ResourceType.MANA && manaWellLocation == null) {
                        if (currentLocation.distanceSquaredTo(location) <= approachingDistance) {
                            manaWellLocation = location;
                            manaWellPassibleTileCount = countPassibleTiles(location);
                            targetLocation = null;
                        } else {
                            targetLocation = location;
                        }
                    } else if (wellInfo.getResourceType() == ResourceType.ADAMANTIUM && adamantiumWellLocation == null) {
                        if (currentLocation.distanceSquaredTo(location) <= approachingDistance) {
                            adamantiumWellLocation = location;
                            adamantiumWellPassibleTileCount = countPassibleTiles(location);
                            targetLocation = null;
                        } else {
                            targetLocation = location;
                        }
                    }
                }
            } else {
                MapLocation wellLocation = closestWellLocation;
                if (attachedWellInfo != null) wellLocation = attachedWellInfo.getMapLocation();
                if (targetLocation == null || targetLocation.distanceSquaredTo(wellLocation) > 2) targetLocation = wellLocation;
                if (currentLocation.distanceSquaredTo(wellLocation) <= 9) {
                    targetLocation = bestLocationNextTo(wellLocation);
                }
            }
        }

        if (targetLocation == null) { selectRandomTarget(); }
    }

    protected MapLocation bestLocationNextTo(MapLocation location) throws GameActionException {
        MapLocation bestNeighbor = location;
        int minDistance = Constants.INF;

        for (MapLocation neighbor: rc.getAllLocationsWithinRadiusSquared(location, 2)) {
            if ((rc.canSenseRobotAtLocation(neighbor) || !rc.sensePassability(neighbor) || rc.senseMapInfo(neighbor).getCurrentDirection() != Direction.CENTER) && !currentLocation.equals(neighbor)) { continue; }

            int distance = -closestTeamHQLocation.distanceSquaredTo(neighbor); //distanceTo(neighbor);
            if (neighbor.x != location.x && neighbor.y != location.y) distance -= 200000;
            if (neighbor.equals(location)) distance -= 100000;
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

    private boolean foundTargetResourceWell() {
        if (targetResource == ResourceType.ADAMANTIUM) return adamantiumWellLocation != null;
        return manaWellLocation != null;
    }

    private int countPassibleTiles(MapLocation location) throws GameActionException {
        int count = 0;

        for(MapInfo mapInfo : rc.senseNearbyMapInfos(location, 2)) {
            if (mapInfo.isPassable() && mapInfo.getCurrentDirection() == Direction.CENTER) count++;
        }

        return count;
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
