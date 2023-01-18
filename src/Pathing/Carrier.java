package Pathing;

import battlecode.common.*;

public strictfp class Carrier extends Robot {
    private MapLocation headquarterLocation;

    public Carrier(RobotController rc) throws GameActionException {
        super(rc);

        for (RobotInfo robotInfo : rc.senseNearbyRobots(9, team)) {
            if (robotInfo.getType() != RobotType.HEADQUARTERS) continue;
            headquarterLocation = robotInfo.getLocation();
            break;
        }
    }

    public void step() throws GameActionException {
        super.step();

        if (rc.isActionReady()) {
            if (isReturning()) transfer();
            else mine();
        }

        updateTarget();
        while (move()) ;

        draw();
    }

    private boolean isReturning() throws GameActionException {
        return rc.getWeight() == GameConstants.CARRIER_CAPACITY;
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

        if (isReturning()) {
            target = headquarterLocation;
            int minDistance = Constants.INF;
            for (RobotInfo robotInfo : rc.senseNearbyRobots(-1, team)) {
                if (robotInfo.getType() != RobotType.HEADQUARTERS) continue;
                MapLocation location = robotInfo.getLocation();
                int distance = distanceTo(location);
                if (distance < minDistance) { minDistance = distance; target = location; }
            }
        } else {
            if (target != null && target.equals(headquarterLocation)) target = null;

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

            int distance = headquarterLocation.distanceSquaredTo(neighbor); //distanceTo(neighbor);
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
