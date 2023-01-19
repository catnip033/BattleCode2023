package Meteor;

import battlecode.common.*;

public strictfp class Carrier extends MobileRobot {
    private MapLocation closestTeamHQLocation;

    private boolean carryingAnchor = false;
    private boolean foundEnemy = false;

    public Carrier(RobotController rc) throws GameActionException {
        super(rc);

        updateClosestTeamHQLocation();
    }

    public void step() throws GameActionException {
        super.step();

        updateClosestTeamHQLocation();

        if (rc.canTakeAnchor(closestTeamHQLocation, Anchor.STANDARD)) {
            rc.takeAnchor(closestTeamHQLocation, Anchor.STANDARD);
            carryingAnchor = true;
        }

        RobotInfo[] nearbyEnemies = rc.senseNearbyRobots(-1, team.opponent());

        if (rc.canWriteSharedArray(0, 0)) {
            map.reportNearbyEnemies(nearbyEnemies);
        }

        RobotInfo enemyAttacker = null;
        for (RobotInfo robot : nearbyEnemies) {
            if (isDangerous(robot.getType())) {
                enemyAttacker = robot;
                break;
            }
        }

        if (enemyAttacker != null) {
            foundEnemy = true;
            updateTargetForEvasion(nearbyEnemies);
            while (move()) ;

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
            if (rc.isActionReady()) {
                if (isReturning()) {
                    transfer();
                }

                else {
                    mine();
                }
            }
        }

        updateTarget();
        while (move()) ;

        draw();
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
        return rc.getWeight() == GameConstants.CARRIER_CAPACITY || foundEnemy;
    }

    private void mine() throws GameActionException {
        for (WellInfo wellInfo : rc.senseNearbyWells(2)) {
            rc.collectResource(wellInfo.getMapLocation(), -1);
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
                if (rc.canTransferResource(location, resourceType, amount)) {
                    rc.transferResource(location, resourceType, amount);
                    return;
                }
            }
        }
    }

    private void updateTarget() throws GameActionException {
        if (currentLocation.equals(targetLocation)) { targetLocation = null; }

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
                targetLocation = null;
            }
        }

        else {
            if (targetLocation != null && targetLocation.equals(closestTeamHQLocation)) targetLocation = null;

            int minDistance = Constants.INF;

            for (WellInfo wellInfo : rc.senseNearbyWells()) {
                MapLocation location = wellInfo.getMapLocation();

                int carrierCount = 0;

                for (RobotInfo robotInfo : rc.senseNearbyRobots(location, 5, team)) {
                    if (robotInfo.getType() == RobotType.CARRIER) carrierCount++;
                }

                int distance = distanceTo(location);
                if (distance >= 2
                        && ((wellInfo.getResourceType() == ResourceType.ADAMANTIUM && carrierCount >= 2)
                        || (wellInfo.getResourceType() == ResourceType.MANA && carrierCount >= 7))) {
                    if (location.equals(targetLocation)) {
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
            if ((rc.canSenseRobotAtLocation(neighbor) || !rc.sensePassability(neighbor)) && !currentLocation.equals(neighbor)) { continue; }

            int distance = closestTeamHQLocation.distanceSquaredTo(neighbor); //distanceTo(neighbor);
            if (distance < minDistance) {
                minDistance = distance;
                bestNeighbor = neighbor;
            }
        }

        return bestNeighbor;
    }
}
