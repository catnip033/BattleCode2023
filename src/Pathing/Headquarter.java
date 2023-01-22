package Pathing;

import battlecode.common.*;

public strictfp class Headquarter extends Robot {
    private final int idx;

    private boolean builtCarrier = false;

    public Headquarter(RobotController rc) throws GameActionException {
        super(rc);

        idx = rc.readSharedArray(Idx.teamHQCount);

        rc.writeSharedArray(Idx.teamHQCount, idx + 1);
        rc.writeSharedArray(idx + Idx.teamHQLocationOffset, encode(currentLocation, rc.getID()));
    }

    public void step() throws GameActionException {
        super.step();

	if (rc.isActionReady() && !builtCarrier && idx == 0 && rc.getResourceAmount(ResourceType.ADAMANTIUM) > RobotType.CARRIER.buildCostAdamantium) {
	    buildDroid(RobotType.CARRIER);
	    builtCarrier = true;
	}
    }

    private void buildDroid(RobotType robotType) throws GameActionException {
	for (Direction direction : directions) {
            MapLocation location = currentLocation.add(direction);
            if (rc.canBuildRobot(robotType, location)) {
                rc.buildRobot(robotType, location);
                return;
            }
        }
    }
}
