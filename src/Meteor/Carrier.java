package Meteor;

import battlecode.common.*;

public strictfp class Carrier extends Robot {
    private MapLocation closestTeamHQLocation;

    private boolean anchorMode = false;
    private boolean foundEnemy = false;

    public Carrier(RobotController rc) throws GameActionException {
        super(rc);

        updateClosestTeamHQLocation();
    }

    public void step() throws GameActionException {
        super.step();

        if (rc.canTakeAnchor(closestTeamHQLocation, Anchor.STANDARD)) {
            rc.takeAnchor(closestTeamHQLocation, Anchor.STANDARD);
            anchorMode = true;
        }

        RobotInfo[] nearbyEnemies = rc.senseNearbyRobots(-1, team.opponent());

        if (rc.canWriteSharedArray(0, 0)) {
            minimap.reportNearbyEnemies(nearbyEnemies);
        }

        RobotInfo enemyAttacker = null;
        for (RobotInfo robot : nearbyEnemies) {
            if (isDangerous(robot.getType())) {
                enemyAttacker = robot;
                break;
            }
        }

        // Evade enemy soldier
        if (enemyAttacker != null) {
//            if (rc.isActionReady()) {
//                if (rc.canAttack(enemyAttacker.getLocation())) {
//                    rc.attack(enemyAttacker.getLocation());
//                }
//                MapLocation location = currentLocation.add(currentLocation.directionTo(enemyAttacker.getLocation()));
//                if (rc.canAttack(location)) {
//                    rc.attack(location);
//                }
//            }
            foundEnemy = true;
            updateTargetForEvasion(nearbyEnemies);
            while (move()) ;

            draw();
            return;
        }

        if (anchorMode) {
            if (rc.canPlaceAnchor() && rc.senseTeamOccupyingIsland(rc.senseIsland(rc.getLocation())) == Team.NEUTRAL) {
                rc.placeAnchor();
                anchorMode = false;
            }
        }

        else {
            if (rc.isActionReady()) {
                if (isReturning()) transfer();
                else mine();
            }
        }

        updateTarget();
        while (move()) ;

        draw();
    }

    private void updateClosestTeamHQLocation() throws GameActionException {
        final int teamHQCount = rc.readSharedArray(Idx.teamHQCount);
        int minDistance = 60;

        for (int i=0; i<teamHQCount; ++i) {
            MapLocation teamHQLocation = decodeLocation(rc.readSharedArray(i + Idx.teamHQDataOffset));
            
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
        if (currentLocation.equals(target)) { target = null; }

        if (anchorMode) {
            int[] ids = rc.senseNearbyIslands();
            for(int id : ids) {
                if(rc.senseTeamOccupyingIsland(id) == Team.NEUTRAL) {
                    MapLocation[] locs = rc.senseNearbyIslandLocations(id);
                    if(locs.length > 0) {
                        target = locs[0];
                        break;
                    }
                }
            }
        } else if (isReturning()) {
            target = closestTeamHQLocation;
            int minDistance = Constants.INF;
            for (RobotInfo robotInfo : rc.senseNearbyRobots(-1, team)) {
                if (robotInfo.getType() != RobotType.HEADQUARTERS) continue;
                MapLocation location = robotInfo.getLocation();
                int distance = distanceTo(location);
                if (distance < minDistance) { minDistance = distance; target = location; }
            }
            if (foundEnemy && currentLocation.distanceSquaredTo(target) <= 5) {
                foundEnemy = false;
                target = null;
            }
        } else {
            if (target != null && target.equals(closestTeamHQLocation)) target = null;

            int minDistance = Constants.INF;

            // Loop through all lead locations and find the best one
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
                    if (location.equals(target)) {
                        target = null;
                    }
                    continue;
                }

                if (distance < minDistance) {
                    minDistance = distance;
                    target = location;
                }
            }

            if (target != null && minDistance != Constants.INF && currentLocation.distanceSquaredTo(target) <= 9) {
                target = bestLocationNextTo(target);
            }
        }

        if (target == null) { selectRandomTarget(); }
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

    private int distanceTo(MapLocation location) {
        return Math.max(Math.abs(location.x - currentLocation.x), Math.abs(location.y - currentLocation.y));
    }
}
