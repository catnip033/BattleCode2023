package MeteorV2;

import battlecode.common.*;

public class Comms {
    static final int setupFlag = 0;
    static final int LAST_ROUND_AVG_ENEMY_LOC_IDX_1 = 1;
    static final int CURR_ROUND_TOTAL_ENEMY_LOC_X_IDX_1 = 2;
    static final int CURR_ROUND_TOTAL_ENEMY_LOC_Y_IDX_1 = 3;
    static final int CURR_ROUND_NUM_ENEMIES_IDX_1 = 4;
    static final int LAST_ROUND_AVG_ENEMY_LOC_IDX_2 = 5;
    static final int CURR_ROUND_TOTAL_ENEMY_LOC_X_IDX_2 = 6;
    static final int CURR_ROUND_TOTAL_ENEMY_LOC_Y_IDX_2 = 7;
    static final int CURR_ROUND_NUM_ENEMIES_IDX_2 = 8;
    static final int LAST_ROUND_AVG_ENEMY_LOC_IDX_3 = 9;
    static final int CURR_ROUND_TOTAL_ENEMY_LOC_X_IDX_3 = 10;
    static final int CURR_ROUND_TOTAL_ENEMY_LOC_Y_IDX_3 = 11;
    static final int CURR_ROUND_NUM_ENEMIES_IDX_3 = 12;
    static final int SYMMETRY_IDX = 13;

    static final int HAS_RESET_ENEMY_LOCS_OFFSET = 15;
    static final int NONZERO_DX_DY_OFFSET = 2;

    static final int X_COORD_OFFSET = 0;
    static final int Y_COORD_OFFSET = 6;
    static final int COORD_MASK = 0x3F;

    private final int width, height;

    private final RobotController rc;
    private final RobotType robotType;

    public boolean foundEnemySoldier;

    public Comms(RobotController rc) {
        this.rc = rc;
        this.robotType = rc.getType();

        width = rc.getMapWidth();
        height = rc.getMapHeight();
    }

    public MapLocation getClosestCluster(MapLocation currLoc) throws GameActionException {
        int numClusters = 0;
        for (int i = 0; i < 3; i++) {
            if (read(i * 4 + LAST_ROUND_AVG_ENEMY_LOC_IDX_1) != 0) {
                numClusters++;
            }
        }

        MapLocation currAvgLoc1 = locationFromFlag(read(LAST_ROUND_AVG_ENEMY_LOC_IDX_1));
        MapLocation currAvgLoc2 = locationFromFlag(read(LAST_ROUND_AVG_ENEMY_LOC_IDX_2));
        MapLocation currAvgLoc3 = locationFromFlag(read(LAST_ROUND_AVG_ENEMY_LOC_IDX_3));

        MapLocation[] currAvgLocs = new MapLocation[]{currAvgLoc1, currAvgLoc2, currAvgLoc3};
        // Hi Bharath
        MapLocation bestCluster = null;
        int bestClusterDist = Integer.MAX_VALUE;

        for (int clusterNum = 0; clusterNum < numClusters; clusterNum++) {
            int currDist = currLoc.distanceSquaredTo(currAvgLocs[clusterNum]);
            if(currDist < bestClusterDist) {
                bestClusterDist = currDist;
                bestCluster = currAvgLocs[clusterNum];
            }
        }
        return bestCluster;
    }

    public void updateAvgEnemyLoc(int totalX, int totalY, int numAdded) throws GameActionException {
        if(robotType != RobotType.HEADQUARTERS) {
            setNeedToResetEnemyLocs();
        }
        int numClusters = 0;
        for (int i = 0; i < 3; i++) {
            if (read(i * 4 + CURR_ROUND_TOTAL_ENEMY_LOC_X_IDX_1) != 0) {
                numClusters++;
            }
        }

        MapLocation enemyLoc = new MapLocation (totalX / numAdded, totalY / numAdded);
        MapLocation[] currAvgLocs = getCurrentClusters();
        int closestClusterDist = Integer.MAX_VALUE;
        int closestClusterIdx = -1;
        for (int i = 0; i < numClusters; i++) {
            MapLocation clusterLoc = currAvgLocs[i];
            int distToCluster = clusterLoc.distanceSquaredTo(enemyLoc);
            if (distToCluster < closestClusterDist) {
                closestClusterDist = distToCluster;
                closestClusterIdx = i;
            }
        }
        if (closestClusterDist > (width * width + height * height) / 9 && numClusters < 3) {
            closestClusterIdx = numClusters;
        }

        int X_IDX = CURR_ROUND_TOTAL_ENEMY_LOC_X_IDX_1 + 4 * closestClusterIdx;
        int Y_IDX = CURR_ROUND_TOTAL_ENEMY_LOC_Y_IDX_1 + 4 * closestClusterIdx;
        int NUM_ENEMIES_IDX = CURR_ROUND_NUM_ENEMIES_IDX_1 + 4 * closestClusterIdx;
        int numEnemies = read(NUM_ENEMIES_IDX);
        int currX = read(X_IDX);
        int currY = read(Y_IDX);
        int newX = currX + totalX;
        int newY = currY + totalY;
        write(X_IDX, newX);
        write(Y_IDX, newY);
        write(NUM_ENEMIES_IDX, numEnemies + numAdded);
    }

    public MapLocation getEnemyLoc(int X_IDX, int Y_IDX, int NUM_ENEMIES_IDX) throws GameActionException {
        int x = read(X_IDX);
        int y = read(Y_IDX);
        int numEnemies = read(NUM_ENEMIES_IDX);
        if(numEnemies == 0) {
            return new MapLocation(-100, -100);
        }
        return new MapLocation(x / numEnemies, y / numEnemies);
    }

    public MapLocation[] getCurrentClusters() throws GameActionException {
        return new MapLocation[]{
                getEnemyLoc(CURR_ROUND_TOTAL_ENEMY_LOC_X_IDX_1,
                        CURR_ROUND_TOTAL_ENEMY_LOC_Y_IDX_1,
                        CURR_ROUND_NUM_ENEMIES_IDX_1),
                getEnemyLoc(CURR_ROUND_TOTAL_ENEMY_LOC_X_IDX_2,
                        CURR_ROUND_TOTAL_ENEMY_LOC_Y_IDX_2,
                        CURR_ROUND_NUM_ENEMIES_IDX_2),
                getEnemyLoc(CURR_ROUND_TOTAL_ENEMY_LOC_X_IDX_3,
                        CURR_ROUND_TOTAL_ENEMY_LOC_Y_IDX_3,
                        CURR_ROUND_NUM_ENEMIES_IDX_3),
        };
    }

    public void drawClusterDots() throws GameActionException {
        MapLocation currAvgLoc1 = locationFromFlag(read(LAST_ROUND_AVG_ENEMY_LOC_IDX_1));
        MapLocation currAvgLoc2 = locationFromFlag(read(LAST_ROUND_AVG_ENEMY_LOC_IDX_2));
        MapLocation currAvgLoc3 = locationFromFlag(read(LAST_ROUND_AVG_ENEMY_LOC_IDX_3));

        rc.setIndicatorDot(currAvgLoc1, 0, 255, 255);
        rc.setIndicatorDot(currAvgLoc2, 0, 255, 255);
        rc.setIndicatorDot(currAvgLoc3, 0, 255, 255);
    }

    public void resetAvgEnemyLoc() throws GameActionException {
        if(needToResetEnemyLocs()) {
            broadcastNonzeroDxDy(); //there exists some other enemy
            MapLocation[] clusters = getCurrentClusters();

            write(LAST_ROUND_AVG_ENEMY_LOC_IDX_1,
                    clusters[0].x != -100 ? encodeLocation(clusters[0]) : 0);
            write(CURR_ROUND_TOTAL_ENEMY_LOC_X_IDX_1, 0);
            write(CURR_ROUND_TOTAL_ENEMY_LOC_Y_IDX_1, 0);
            write(CURR_ROUND_NUM_ENEMIES_IDX_1, 0);

            write(LAST_ROUND_AVG_ENEMY_LOC_IDX_2,
                    clusters[1].x != -100 ? encodeLocation(clusters[1]) : 0);
            write(CURR_ROUND_TOTAL_ENEMY_LOC_X_IDX_2, 0);
            write(CURR_ROUND_TOTAL_ENEMY_LOC_Y_IDX_2, 0);
            write(CURR_ROUND_NUM_ENEMIES_IDX_2, 0);

            write(LAST_ROUND_AVG_ENEMY_LOC_IDX_3,
                    clusters[2].x != -100 ? encodeLocation(clusters[2]) : 0);
            write(CURR_ROUND_TOTAL_ENEMY_LOC_X_IDX_3, 0);
            write(CURR_ROUND_TOTAL_ENEMY_LOC_Y_IDX_3, 0);
            write(CURR_ROUND_NUM_ENEMIES_IDX_3, 0);

            resetNeedToResetEnemyLocs();
        }
    }

    public void broadcastNonzeroDxDy() throws GameActionException {
        int currFlag = read(SYMMETRY_IDX);
        int newFlag = currFlag | (1 << NONZERO_DX_DY_OFFSET);
        write(SYMMETRY_IDX, newFlag);
    }

    public boolean needToResetEnemyLocs() throws GameActionException {
        return (read(setupFlag) >> HAS_RESET_ENEMY_LOCS_OFFSET) != 0;
    }

    public void setNeedToResetEnemyLocs() throws GameActionException {
        int oldFlag = read(setupFlag);
        write(setupFlag, oldFlag | (1 << HAS_RESET_ENEMY_LOCS_OFFSET));
    }

    public void resetNeedToResetEnemyLocs() throws GameActionException {
        int oldFlag = read(setupFlag);
        write(setupFlag, oldFlag & (~(1 << HAS_RESET_ENEMY_LOCS_OFFSET)));
    }

    public int read(int index) throws GameActionException {
        return rc.readSharedArray(index + Idx.mapOffset);
    }

    public void write(int index, int flag) throws GameActionException {
        index += Idx.mapOffset;
        int oldFlag = rc.readSharedArray(index);
        if (flag != oldFlag) {
            rc.writeSharedArray(index, flag);
        }
    }

    public int encodeLocation(MapLocation loc) {
        return loc.x + (loc.y << Y_COORD_OFFSET);
    }

    public MapLocation locationFromFlag(int flag) {
        return new MapLocation(xcoord(flag), ycoord(flag));
    }

    public int xcoord(int flag) {
        return flag & COORD_MASK;
    }
    public int ycoord(int flag) {
        return (flag >> Y_COORD_OFFSET) & COORD_MASK;
    }
}
