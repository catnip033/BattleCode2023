package Meteor;

import battlecode.common.*;

public class Map {

    /*
     * A map that represents the game map in a lower resolution
     */

    private final int ROWS, COLS;
    private final int GRID_ROWS, GRID_COLS, GRID_MAX_IDX;

    private final int GRID_SIZE         = 6;
    private final int BITS_PER_INFO     = 4;
    private final int INFOS_PER_INTEGER = 16 / BITS_PER_INFO;

    private final int MASK = 1 << (BITS_PER_INFO - 1);

    private final RobotController rc;

    private int roundNumber;

    public Map(RobotController rc) {
        this.rc = rc;

        ROWS = rc.getMapHeight();
        COLS = rc.getMapWidth();

        GRID_ROWS = (ROWS - 1) / GRID_SIZE + 1;
        GRID_COLS = (COLS - 1) / GRID_SIZE + 1;

        GRID_MAX_IDX = (GRID_ROWS * GRID_COLS - 1) / INFOS_PER_INTEGER + 1;
    }

    public void reset() throws GameActionException {
        for (int i = 0; i < GRID_MAX_IDX; ++i) {
            for (int j = 0; j < INFOS_PER_INTEGER; ++j) {

                int info = (rc.readSharedArray(i + Idx.mapOffset + parity(false)) >> (j * BITS_PER_INFO)) & MASK;

                if (info == 0) { continue; }

                int r = (i * INFOS_PER_INTEGER + j) / GRID_COLS, c = (i * INFOS_PER_INTEGER + j) % GRID_COLS;

                MapLocation location = new MapLocation(c * GRID_SIZE + GRID_SIZE / 2, r * GRID_SIZE + GRID_SIZE / 2);

                if (info == 1) { rc.setIndicatorDot(location, 255, 255, 0);  }
                if (info == 2) { rc.setIndicatorDot(location, 255, 153, 51); }
                if (info == 3) { rc.setIndicatorDot(location, 255, 80, 80);  }
            }

            rc.writeSharedArray(Idx.mapOffset + i + parity(true), 0);
        }
    }

    public void sync() {
        roundNumber = rc.getRoundNum();
    }

    public void reportEnemy(MapLocation location, int info) throws GameActionException {
        int k = location.x / GRID_SIZE + location.y / GRID_SIZE * GRID_COLS;

        int x = rc.readSharedArray(k / INFOS_PER_INTEGER + Idx.mapOffset + parity(true));

        if (((x >> ((k % INFOS_PER_INTEGER) * BITS_PER_INFO)) & MASK) >= info) { return; }

        x &= ~(MASK << ((k % INFOS_PER_INTEGER) * BITS_PER_INFO));
        x |= info   << ((k % INFOS_PER_INTEGER) * BITS_PER_INFO);

        rc.writeSharedArray(k / INFOS_PER_INTEGER + Idx.mapOffset + parity(true), x);
    }

    public void reportNearbyEnemies(RobotInfo[] nearbyRobots) throws GameActionException {
        for (RobotInfo robot : nearbyRobots) {
            if (robot.getType() == RobotType.CARRIER) { reportEnemy(robot.location, 1); }
            if (robot.getType() == RobotType.LAUNCHER || robot.getType() == RobotType.DESTABILIZER) { reportEnemy(robot.location, 2); }
        }
    }

    public int getInfo(MapLocation location) throws GameActionException {
        int k = location.x / GRID_SIZE + location.y / GRID_SIZE * GRID_COLS;
        int x = rc.readSharedArray(k / INFOS_PER_INTEGER + Idx.mapOffset + parity(false));
        return (x >> ((k % INFOS_PER_INTEGER) * BITS_PER_INFO)) & MASK;
    }

    private int parity(boolean inverse) {
        return ((roundNumber % 2 == 0) ^ inverse) ? 0 : GRID_MAX_IDX;
    }
}
