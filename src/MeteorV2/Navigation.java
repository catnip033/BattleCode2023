package MeteorV2;

import battlecode.common.*;

public class Navigation {
    private final RobotController rc;
    private final Team team;
    private final Bug bug;

    private MapLocation previousLocation;
    private MapLocation currentLocation;

    private MapLocation targetLocation;

    private Direction lastDirection;

    private double globalBest = 1000000;

    private int consecutiveBugNavRoundCount;

    public Navigation (RobotController rc) {
        this.rc = rc;
        team = rc.getTeam();
        bug = new Bug(rc);
    }
    
    private static MapLocation l0;
    private static double v0;
    private static Direction d0;
    private static double p0;
    private static double s0;

    private static MapLocation l1;
    private static double v1;
    private static Direction d1;
    private static double p1;
    private static double s1;

    private static MapLocation l2;
    private static double v2;
    private static Direction d2;
    private static double p2;
    private static double s2;

    private static MapLocation l3;
    private static double v3;
    private static Direction d3;
    private static double p3;
    private static double s3;

    private static MapLocation l4;
    private static double v4;
    private static Direction d4;
    private static double p4;
    private static double s4;

    private static MapLocation l5;
    private static double v5;
    private static Direction d5;
    private static double p5;
    private static double s5;

    private static MapLocation l6;
    private static double v6;
    private static Direction d6;
    private static double p6;
    private static double s6;

    private static MapLocation l7;
    private static double v7;
    private static Direction d7;
    private static double p7;
    private static double s7;

    private static MapLocation l8;
    private static double v8;
    private static Direction d8;
    private static double p8;
    private static double s8;

    private static MapLocation l9;
    private static double v9;
    private static Direction d9;
    private static double p9;
    private static double s9;

    private static MapLocation l10;
    private static double v10;
    private static Direction d10;
    private static double p10;
    private static double s10;

    private static MapLocation l11;
    private static double v11;
    private static Direction d11;
    private static double p11;
    private static double s11;

    private static MapLocation l12;
    private static double v12;
    private static Direction d12;
    private static double p12;
    private static double s12;

    private static MapLocation l13;
    private static double v13;
    private static Direction d13;
    private static double p13;
    private static double s13;

    private static MapLocation l14;
    private static double v14;
    private static Direction d14;
    private static double p14;
    private static double s14;

    private static MapLocation l15;
    private static double v15;
    private static Direction d15;
    private static double p15;
    private static double s15;

    private static MapLocation l16;
    private static double v16;
    private static Direction d16;
    private static double p16;
    private static double s16;

    private static MapLocation l17;
    private static double v17;
    private static Direction d17;
    private static double p17;
    private static double s17;

    private static MapLocation l18;
    private static double v18;
    private static Direction d18;
    private static double p18;
    private static double s18;

    private static MapLocation l19;
    private static double v19;
    private static Direction d19;
    private static double p19;
    private static double s19;

    private static MapLocation l20;
    private static double v20;
    private static Direction d20;
    private static double p20;
    private static double s20;

    private static MapLocation l21;
    private static double v21;
    private static Direction d21;
    private static double p21;
    private static double s21;

    private static MapLocation l22;
    private static double v22;
    private static Direction d22;
    private static double p22;
    private static double s22;

    private static MapLocation l23;
    private static double v23;
    private static Direction d23;
    private static double p23;
    private static double s23;

    private static MapLocation l24;
    private static double v24;
    private static Direction d24;
    private static double p24;
    private static double s24;

    private static MapLocation l25;
    private static double v25;
    private static Direction d25;
    private static double p25;
    private static double s25;

    private static MapLocation l26;
    private static double v26;
    private static Direction d26;
    private static double p26;
    private static double s26;

    private static MapLocation l27;
    private static double v27;
    private static Direction d27;
    private static double p27;
    private static double s27;

    private static MapLocation l28;
    private static double v28;
    private static Direction d28;
    private static double p28;
    private static double s28;

    private static MapLocation l29;
    private static double v29;
    private static Direction d29;
    private static double p29;
    private static double s29;

    private static MapLocation l30;
    private static double v30;
    private static Direction d30;
    private static double p30;
    private static double s30;

    private static MapLocation l31;
    private static double v31;
    private static Direction d31;
    private static double p31;
    private static double s31;

    private static MapLocation l32;
    private static double v32;
    private static Direction d32;
    private static double p32;
    private static double s32;

    private static MapLocation l33;
    private static double v33;
    private static Direction d33;
    private static double p33;
    private static double s33;

    private static MapLocation l34;
    private static double v34;
    private static double s34;

    private static MapLocation l35;
    private static double v35;
    private static Direction d35;
    private static double p35;
    private static double s35;

    private static MapLocation l36;
    private static double v36;
    private static Direction d36;
    private static double p36;
    private static double s36;

    private static MapLocation l37;
    private static double v37;
    private static Direction d37;
    private static double p37;
    private static double s37;

    private static MapLocation l38;
    private static double v38;
    private static Direction d38;
    private static double p38;
    private static double s38;

    private static MapLocation l39;
    private static double v39;
    private static Direction d39;
    private static double p39;
    private static double s39;

    private static MapLocation l40;
    private static double v40;
    private static Direction d40;
    private static double p40;
    private static double s40;

    private static MapLocation l41;
    private static double v41;
    private static Direction d41;
    private static double p41;
    private static double s41;

    private static MapLocation l42;
    private static double v42;
    private static Direction d42;
    private static double p42;
    private static double s42;

    private static MapLocation l43;
    private static double v43;
    private static Direction d43;
    private static double p43;
    private static double s43;

    private static MapLocation l44;
    private static double v44;
    private static Direction d44;
    private static double p44;
    private static double s44;

    private static MapLocation l45;
    private static double v45;
    private static Direction d45;
    private static double p45;
    private static double s45;

    private static MapLocation l46;
    private static double v46;
    private static Direction d46;
    private static double p46;
    private static double s46;

    private static MapLocation l47;
    private static double v47;
    private static Direction d47;
    private static double p47;
    private static double s47;

    private static MapLocation l48;
    private static double v48;
    private static Direction d48;
    private static double p48;
    private static double s48;

    private static MapLocation l49;
    private static double v49;
    private static Direction d49;
    private static double p49;
    private static double s49;

    private static MapLocation l50;
    private static double v50;
    private static Direction d50;
    private static double p50;
    private static double s50;

    private static MapLocation l51;
    private static double v51;
    private static Direction d51;
    private static double p51;
    private static double s51;

    private static MapLocation l52;
    private static double v52;
    private static Direction d52;
    private static double p52;
    private static double s52;

    private static MapLocation l53;
    private static double v53;
    private static Direction d53;
    private static double p53;
    private static double s53;

    private static MapLocation l54;
    private static double v54;
    private static Direction d54;
    private static double p54;
    private static double s54;

    private static MapLocation l55;
    private static double v55;
    private static Direction d55;
    private static double p55;
    private static double s55;

    private static MapLocation l56;
    private static double v56;
    private static Direction d56;
    private static double p56;
    private static double s56;

    private static MapLocation l57;
    private static double v57;
    private static Direction d57;
    private static double p57;
    private static double s57;

    private static MapLocation l58;
    private static double v58;
    private static Direction d58;
    private static double p58;
    private static double s58;

    private static MapLocation l59;
    private static double v59;
    private static Direction d59;
    private static double p59;
    private static double s59;

    private static MapLocation l60;
    private static double v60;
    private static Direction d60;
    private static double p60;
    private static double s60;

    private static MapLocation l61;
    private static double v61;
    private static Direction d61;
    private static double p61;
    private static double s61;

    private static MapLocation l62;
    private static double v62;
    private static Direction d62;
    private static double p62;
    private static double s62;

    private static MapLocation l63;
    private static double v63;
    private static Direction d63;
    private static double p63;
    private static double s63;

    private static MapLocation l64;
    private static double v64;
    private static Direction d64;
    private static double p64;
    private static double s64;

    private static MapLocation l65;
    private static double v65;
    private static Direction d65;
    private static double p65;
    private static double s65;

    private static MapLocation l66;
    private static double v66;
    private static Direction d66;
    private static double p66;
    private static double s66;

    private static MapLocation l67;
    private static double v67;
    private static Direction d67;
    private static double p67;
    private static double s67;

    private static MapLocation l68;
    private static double v68;
    private static Direction d68;
    private static double p68;
    private static double s68;

    private Direction getBestDirection0() throws GameActionException {
        double localBest = 1000000.0;
        double dist = 0.0;
        l34 = currentLocation;
        v34 = 0;
        d43 = null;
        l43 = l34.add(Direction.EAST);
        v43 = 1000000;
        p43 = 1000000;
        s43 = Math.sqrt(l43.distanceSquaredTo(targetLocation));
        d44 = null;
        l44 = l34.add(Direction.NORTHEAST);
        v44 = 1000000;
        p44 = 1000000;
        s44 = Math.sqrt(l44.distanceSquaredTo(targetLocation));
        d35 = null;
        l35 = l34.add(Direction.NORTH);
        v35 = 1000000;
        p35 = 1000000;
        s35 = Math.sqrt(l35.distanceSquaredTo(targetLocation));
        d26 = null;
        l26 = l34.add(Direction.NORTHWEST);
        v26 = 1000000;
        p26 = 1000000;
        s26 = Math.sqrt(l26.distanceSquaredTo(targetLocation));
        d25 = null;
        l25 = l34.add(Direction.WEST);
        v25 = 1000000;
        p25 = 1000000;
        s25 = Math.sqrt(l25.distanceSquaredTo(targetLocation));
        d17 = null;
        l17 = l25.add(Direction.NORTHWEST);
        v17 = 1000000;
        p17 = 1000000;
        s17 = Math.sqrt(l17.distanceSquaredTo(targetLocation));
        d16 = null;
        l16 = l25.add(Direction.WEST);
        v16 = 1000000;
        p16 = 1000000;
        s16 = Math.sqrt(l16.distanceSquaredTo(targetLocation));
        d45 = null;
        l45 = l35.add(Direction.NORTHEAST);
        v45 = 1000000;
        p45 = 1000000;
        s45 = Math.sqrt(l45.distanceSquaredTo(targetLocation));
        d36 = null;
        l36 = l35.add(Direction.NORTH);
        v36 = 1000000;
        p36 = 1000000;
        s36 = Math.sqrt(l36.distanceSquaredTo(targetLocation));
        d27 = null;
        l27 = l35.add(Direction.NORTHWEST);
        v27 = 1000000;
        p27 = 1000000;
        s27 = Math.sqrt(l27.distanceSquaredTo(targetLocation));
        d52 = null;
        l52 = l43.add(Direction.EAST);
        v52 = 1000000;
        p52 = 1000000;
        s52 = Math.sqrt(l52.distanceSquaredTo(targetLocation));
        d53 = null;
        l53 = l43.add(Direction.NORTHEAST);
        v53 = 1000000;
        p53 = 1000000;
        s53 = Math.sqrt(l53.distanceSquaredTo(targetLocation));
        d18 = null;
        l18 = l26.add(Direction.NORTHWEST);
        v18 = 1000000;
        p18 = 1000000;
        s18 = Math.sqrt(l18.distanceSquaredTo(targetLocation));
        d54 = null;
        l54 = l44.add(Direction.NORTHEAST);
        v54 = 1000000;
        p54 = 1000000;
        s54 = Math.sqrt(l54.distanceSquaredTo(targetLocation));
        d60 = null;
        l60 = l52.add(Direction.EAST);
        v60 = 1000000;
        p60 = 1000000;
        s60 = Math.sqrt(l60.distanceSquaredTo(targetLocation));
        d61 = null;
        l61 = l52.add(Direction.NORTHEAST);
        v61 = 1000000;
        p61 = 1000000;
        s61 = Math.sqrt(l61.distanceSquaredTo(targetLocation));
        d46 = null;
        l46 = l36.add(Direction.NORTHEAST);
        v46 = 1000000;
        p46 = 1000000;
        s46 = Math.sqrt(l46.distanceSquaredTo(targetLocation));
        d37 = null;
        l37 = l36.add(Direction.NORTH);
        v37 = 1000000;
        p37 = 1000000;
        s37 = Math.sqrt(l37.distanceSquaredTo(targetLocation));
        d28 = null;
        l28 = l36.add(Direction.NORTHWEST);
        v28 = 1000000;
        p28 = 1000000;
        s28 = Math.sqrt(l28.distanceSquaredTo(targetLocation));
        d9 = null;
        l9 = l16.add(Direction.NORTHWEST);
        v9 = 1000000;
        p9 = 1000000;
        s9 = Math.sqrt(l9.distanceSquaredTo(targetLocation));
        d8 = null;
        l8 = l16.add(Direction.WEST);
        v8 = 1000000;
        p8 = 1000000;
        s8 = Math.sqrt(l8.distanceSquaredTo(targetLocation));
        d62 = null;
        l62 = l53.add(Direction.NORTHEAST);
        v62 = 1000000;
        p62 = 1000000;
        s62 = Math.sqrt(l62.distanceSquaredTo(targetLocation));
        d19 = null;
        l19 = l27.add(Direction.NORTHWEST);
        v19 = 1000000;
        p19 = 1000000;
        s19 = Math.sqrt(l19.distanceSquaredTo(targetLocation));
        d10 = null;
        l10 = l17.add(Direction.NORTHWEST);
        v10 = 1000000;
        p10 = 1000000;
        s10 = Math.sqrt(l10.distanceSquaredTo(targetLocation));
        d55 = null;
        l55 = l45.add(Direction.NORTHEAST);
        v55 = 1000000;
        p55 = 1000000;
        s55 = Math.sqrt(l55.distanceSquaredTo(targetLocation));
        d11 = null;
        l11 = l18.add(Direction.NORTHWEST);
        v11 = 1000000;
        p11 = 1000000;
        s11 = Math.sqrt(l11.distanceSquaredTo(targetLocation));
        d63 = null;
        l63 = l54.add(Direction.NORTHEAST);
        v63 = 1000000;
        p63 = 1000000;
        s63 = Math.sqrt(l63.distanceSquaredTo(targetLocation));
        d66 = null;
        l66 = l60.add(Direction.EAST);
        v66 = 1000000;
        p66 = 1000000;
        s66 = Math.sqrt(l66.distanceSquaredTo(targetLocation));
        d67 = null;
        l67 = l60.add(Direction.NORTHEAST);
        v67 = 1000000;
        p67 = 1000000;
        s67 = Math.sqrt(l67.distanceSquaredTo(targetLocation));
        d47 = null;
        l47 = l37.add(Direction.NORTHEAST);
        v47 = 1000000;
        p47 = 1000000;
        s47 = Math.sqrt(l47.distanceSquaredTo(targetLocation));
        d38 = null;
        l38 = l37.add(Direction.NORTH);
        v38 = 1000000;
        p38 = 1000000;
        s38 = Math.sqrt(l38.distanceSquaredTo(targetLocation));
        d29 = null;
        l29 = l37.add(Direction.NORTHWEST);
        v29 = 1000000;
        p29 = 1000000;
        s29 = Math.sqrt(l29.distanceSquaredTo(targetLocation));
        d3 = null;
        l3 = l8.add(Direction.NORTHWEST);
        v3 = 1000000;
        p3 = 1000000;
        s3 = Math.sqrt(l3.distanceSquaredTo(targetLocation));
        d2 = null;
        l2 = l8.add(Direction.WEST);
        v2 = 1000000;
        p2 = 1000000;
        s2 = Math.sqrt(l2.distanceSquaredTo(targetLocation));
        d68 = null;
        l68 = l61.add(Direction.NORTHEAST);
        v68 = 1000000;
        p68 = 1000000;
        s68 = Math.sqrt(l68.distanceSquaredTo(targetLocation));
        d56 = null;
        l56 = l46.add(Direction.NORTHEAST);
        v56 = 1000000;
        p56 = 1000000;
        s56 = Math.sqrt(l56.distanceSquaredTo(targetLocation));
        d4 = null;
        l4 = l9.add(Direction.NORTHWEST);
        v4 = 1000000;
        p4 = 1000000;
        s4 = Math.sqrt(l4.distanceSquaredTo(targetLocation));
        d20 = null;
        l20 = l28.add(Direction.NORTHWEST);
        v20 = 1000000;
        p20 = 1000000;
        s20 = Math.sqrt(l20.distanceSquaredTo(targetLocation));
    

        if (rc.onTheMap(l25) && rc.canMove(Direction.WEST)) {
            if (rc.canSenseLocation(l25)) {
                MapInfo mapInfo = rc.senseMapInfo(l25);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l25) || (rc.sensePassability(l25) && !rc.canSenseRobotAtLocation(l25) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l25), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p25 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p25 = 1.5;
            }
            
            dist = v34 + p25 + s34 * 0.000001;
            if (v25 > dist) {
                v25 = dist;
                d25 = Direction.WEST;
            }
            dist = v35 + p25 + s35 * 0.000001;
            if (v25 > dist) {
                v25 = dist;
                d25 = d35;
            }
        }

        if (rc.onTheMap(l35) && rc.canMove(Direction.NORTH)) {
            if (rc.canSenseLocation(l35)) {
                MapInfo mapInfo = rc.senseMapInfo(l35);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l35) || (rc.sensePassability(l35) && !rc.canSenseRobotAtLocation(l35) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l35), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p35 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p35 = 1.5;
            }
            
            dist = v25 + p35 + s25 * 0.000001;
            if (v35 > dist) {
                v35 = dist;
                d35 = d25;
            }
            dist = v34 + p35 + s34 * 0.000001;
            if (v35 > dist) {
                v35 = dist;
                d35 = Direction.NORTH;
            }
            dist = v43 + p35 + s43 * 0.000001;
            if (v35 > dist) {
                v35 = dist;
                d35 = d43;
            }
        }

        if (rc.onTheMap(l43) && rc.canMove(Direction.EAST)) {
            if (rc.canSenseLocation(l43)) {
                MapInfo mapInfo = rc.senseMapInfo(l43);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l43) || (rc.sensePassability(l43) && !rc.canSenseRobotAtLocation(l43) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l43), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p43 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p43 = 1.5;
            }
            
            dist = v35 + p43 + s35 * 0.000001;
            if (v43 > dist) {
                v43 = dist;
                d43 = d35;
            }
            dist = v34 + p43 + s34 * 0.000001;
            if (v43 > dist) {
                v43 = dist;
                d43 = Direction.EAST;
            }
        }

        if (rc.onTheMap(l26) && rc.canMove(Direction.NORTHWEST)) {
            if (rc.canSenseLocation(l26)) {
                MapInfo mapInfo = rc.senseMapInfo(l26);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l26) || (rc.sensePassability(l26) && !rc.canSenseRobotAtLocation(l26) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l26), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p26 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p26 = 1.5;
            }
            
            dist = v35 + p26 + s35 * 0.000001;
            if (v26 > dist) {
                v26 = dist;
                d26 = d35;
            }
            dist = v25 + p26 + s25 * 0.000001;
            if (v26 > dist) {
                v26 = dist;
                d26 = d25;
            }
            dist = v34 + p26 + s34 * 0.000001;
            if (v26 > dist) {
                v26 = dist;
                d26 = Direction.NORTHWEST;
            }
        }

        if (rc.onTheMap(l44) && rc.canMove(Direction.NORTHEAST)) {
            if (rc.canSenseLocation(l44)) {
                MapInfo mapInfo = rc.senseMapInfo(l44);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l44) || (rc.sensePassability(l44) && !rc.canSenseRobotAtLocation(l44) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l44), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p44 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p44 = 1.5;
            }
            
            dist = v35 + p44 + s35 * 0.000001;
            if (v44 > dist) {
                v44 = dist;
                d44 = d35;
            }
            dist = v34 + p44 + s34 * 0.000001;
            if (v44 > dist) {
                v44 = dist;
                d44 = Direction.NORTHEAST;
            }
            dist = v43 + p44 + s43 * 0.000001;
            if (v44 > dist) {
                v44 = dist;
                d44 = d43;
            }
        }

        if (rc.onTheMap(l52)) {
            if (rc.canSenseLocation(l52)) {
                MapInfo mapInfo = rc.senseMapInfo(l52);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l52) || (rc.sensePassability(l52) && !rc.canSenseRobotAtLocation(l52) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l52), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p52 = mapInfo.getCooldownMultiplier(team);
                    s52 = Math.sqrt(l52.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p52 = 1.5;
            }
            
            dist = v44 + p52 + s44 * 0.000001;
            if (v52 > dist) {
                v52 = dist;
                d52 = d44;
            }
            dist = v43 + p52 + s43 * 0.000001;
            if (v52 > dist) {
                v52 = dist;
                d52 = d43;
            }
        }

        if (rc.onTheMap(l36)) {
            if (rc.canSenseLocation(l36)) {
                MapInfo mapInfo = rc.senseMapInfo(l36);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l36) || (rc.sensePassability(l36) && !rc.canSenseRobotAtLocation(l36) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l36), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p36 = mapInfo.getCooldownMultiplier(team);
                    s36 = Math.sqrt(l36.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p36 = 1.5;
            }
            
            dist = v26 + p36 + s26 * 0.000001;
            if (v36 > dist) {
                v36 = dist;
                d36 = d26;
            }
            dist = v35 + p36 + s35 * 0.000001;
            if (v36 > dist) {
                v36 = dist;
                d36 = d35;
            }
            dist = v44 + p36 + s44 * 0.000001;
            if (v36 > dist) {
                v36 = dist;
                d36 = d44;
            }
        }

        if (rc.onTheMap(l16)) {
            if (rc.canSenseLocation(l16)) {
                MapInfo mapInfo = rc.senseMapInfo(l16);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l16) || (rc.sensePassability(l16) && !rc.canSenseRobotAtLocation(l16) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l16), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p16 = mapInfo.getCooldownMultiplier(team);
                    s16 = Math.sqrt(l16.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p16 = 1.5;
            }
            
            dist = v25 + p16 + s25 * 0.000001;
            if (v16 > dist) {
                v16 = dist;
                d16 = d25;
            }
            dist = v26 + p16 + s26 * 0.000001;
            if (v16 > dist) {
                v16 = dist;
                d16 = d26;
            }
        }

        if (rc.onTheMap(l53)) {
            if (rc.canSenseLocation(l53)) {
                MapInfo mapInfo = rc.senseMapInfo(l53);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l53) || (rc.sensePassability(l53) && !rc.canSenseRobotAtLocation(l53) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l53), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p53 = mapInfo.getCooldownMultiplier(team);
                    s53 = Math.sqrt(l53.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p53 = 1.5;
            }
            
            dist = v45 + p53 + s45 * 0.000001;
            if (v53 > dist) {
                v53 = dist;
                d53 = d45;
            }
            dist = v44 + p53 + s44 * 0.000001;
            if (v53 > dist) {
                v53 = dist;
                d53 = d44;
            }
            dist = v43 + p53 + s43 * 0.000001;
            if (v53 > dist) {
                v53 = dist;
                d53 = d43;
            }
            dist = v52 + p53 + s52 * 0.000001;
            if (v53 > dist) {
                v53 = dist;
                d53 = d52;
            }
        }

        if (rc.onTheMap(l27)) {
            if (rc.canSenseLocation(l27)) {
                MapInfo mapInfo = rc.senseMapInfo(l27);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l27) || (rc.sensePassability(l27) && !rc.canSenseRobotAtLocation(l27) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l27), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p27 = mapInfo.getCooldownMultiplier(team);
                    s27 = Math.sqrt(l27.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p27 = 1.5;
            }
            
            dist = v36 + p27 + s36 * 0.000001;
            if (v27 > dist) {
                v27 = dist;
                d27 = d36;
            }
            dist = v17 + p27 + s17 * 0.000001;
            if (v27 > dist) {
                v27 = dist;
                d27 = d17;
            }
            dist = v26 + p27 + s26 * 0.000001;
            if (v27 > dist) {
                v27 = dist;
                d27 = d26;
            }
            dist = v35 + p27 + s35 * 0.000001;
            if (v27 > dist) {
                v27 = dist;
                d27 = d35;
            }
        }

        if (rc.onTheMap(l17)) {
            if (rc.canSenseLocation(l17)) {
                MapInfo mapInfo = rc.senseMapInfo(l17);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l17) || (rc.sensePassability(l17) && !rc.canSenseRobotAtLocation(l17) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l17), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p17 = mapInfo.getCooldownMultiplier(team);
                    s17 = Math.sqrt(l17.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p17 = 1.5;
            }
            
            dist = v26 + p17 + s26 * 0.000001;
            if (v17 > dist) {
                v17 = dist;
                d17 = d26;
            }
            dist = v27 + p17 + s27 * 0.000001;
            if (v17 > dist) {
                v17 = dist;
                d17 = d27;
            }
            dist = v16 + p17 + s16 * 0.000001;
            if (v17 > dist) {
                v17 = dist;
                d17 = d16;
            }
            dist = v25 + p17 + s25 * 0.000001;
            if (v17 > dist) {
                v17 = dist;
                d17 = d25;
            }
        }

        if (rc.onTheMap(l45)) {
            if (rc.canSenseLocation(l45)) {
                MapInfo mapInfo = rc.senseMapInfo(l45);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l45) || (rc.sensePassability(l45) && !rc.canSenseRobotAtLocation(l45) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l45), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p45 = mapInfo.getCooldownMultiplier(team);
                    s45 = Math.sqrt(l45.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p45 = 1.5;
            }
            
            dist = v36 + p45 + s36 * 0.000001;
            if (v45 > dist) {
                v45 = dist;
                d45 = d36;
            }
            dist = v35 + p45 + s35 * 0.000001;
            if (v45 > dist) {
                v45 = dist;
                d45 = d35;
            }
            dist = v44 + p45 + s44 * 0.000001;
            if (v45 > dist) {
                v45 = dist;
                d45 = d44;
            }
            dist = v53 + p45 + s53 * 0.000001;
            if (v45 > dist) {
                v45 = dist;
                d45 = d53;
            }
        }

        if (rc.onTheMap(l18)) {
            if (rc.canSenseLocation(l18)) {
                MapInfo mapInfo = rc.senseMapInfo(l18);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l18) || (rc.sensePassability(l18) && !rc.canSenseRobotAtLocation(l18) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l18), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p18 = mapInfo.getCooldownMultiplier(team);
                    s18 = Math.sqrt(l18.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p18 = 1.5;
            }
            
            dist = v27 + p18 + s27 * 0.000001;
            if (v18 > dist) {
                v18 = dist;
                d18 = d27;
            }
            dist = v17 + p18 + s17 * 0.000001;
            if (v18 > dist) {
                v18 = dist;
                d18 = d17;
            }
            dist = v26 + p18 + s26 * 0.000001;
            if (v18 > dist) {
                v18 = dist;
                d18 = d26;
            }
        }

        if (rc.onTheMap(l54)) {
            if (rc.canSenseLocation(l54)) {
                MapInfo mapInfo = rc.senseMapInfo(l54);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l54) || (rc.sensePassability(l54) && !rc.canSenseRobotAtLocation(l54) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l54), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p54 = mapInfo.getCooldownMultiplier(team);
                    s54 = Math.sqrt(l54.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p54 = 1.5;
            }
            
            dist = v45 + p54 + s45 * 0.000001;
            if (v54 > dist) {
                v54 = dist;
                d54 = d45;
            }
            dist = v44 + p54 + s44 * 0.000001;
            if (v54 > dist) {
                v54 = dist;
                d54 = d44;
            }
            dist = v53 + p54 + s53 * 0.000001;
            if (v54 > dist) {
                v54 = dist;
                d54 = d53;
            }
        }

        if (rc.onTheMap(l60)) {
            if (rc.canSenseLocation(l60)) {
                MapInfo mapInfo = rc.senseMapInfo(l60);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l60) || (rc.sensePassability(l60) && !rc.canSenseRobotAtLocation(l60) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l60), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p60 = mapInfo.getCooldownMultiplier(team);
                    s60 = Math.sqrt(l60.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p60 = 1.5;
            }
            
            dist = v53 + p60 + s53 * 0.000001;
            if (v60 > dist) {
                v60 = dist;
                d60 = d53;
            }
            dist = v52 + p60 + s52 * 0.000001;
            if (v60 > dist) {
                v60 = dist;
                d60 = d52;
            }
        }

        if (rc.onTheMap(l37)) {
            if (rc.canSenseLocation(l37)) {
                MapInfo mapInfo = rc.senseMapInfo(l37);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l37) || (rc.sensePassability(l37) && !rc.canSenseRobotAtLocation(l37) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l37), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p37 = mapInfo.getCooldownMultiplier(team);
                    s37 = Math.sqrt(l37.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p37 = 1.5;
            }
            
            dist = v27 + p37 + s27 * 0.000001;
            if (v37 > dist) {
                v37 = dist;
                d37 = d27;
            }
            dist = v36 + p37 + s36 * 0.000001;
            if (v37 > dist) {
                v37 = dist;
                d37 = d36;
            }
            dist = v45 + p37 + s45 * 0.000001;
            if (v37 > dist) {
                v37 = dist;
                d37 = d45;
            }
        }

        if (rc.onTheMap(l8)) {
            if (rc.canSenseLocation(l8)) {
                MapInfo mapInfo = rc.senseMapInfo(l8);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l8) || (rc.sensePassability(l8) && !rc.canSenseRobotAtLocation(l8) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l8), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p8 = mapInfo.getCooldownMultiplier(team);
                    s8 = Math.sqrt(l8.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p8 = 1.5;
            }
            
            dist = v16 + p8 + s16 * 0.000001;
            if (v8 > dist) {
                v8 = dist;
                d8 = d16;
            }
            dist = v17 + p8 + s17 * 0.000001;
            if (v8 > dist) {
                v8 = dist;
                d8 = d17;
            }
        }

        if (rc.onTheMap(l61)) {
            if (rc.canSenseLocation(l61)) {
                MapInfo mapInfo = rc.senseMapInfo(l61);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l61) || (rc.sensePassability(l61) && !rc.canSenseRobotAtLocation(l61) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l61), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p61 = mapInfo.getCooldownMultiplier(team);
                    s61 = Math.sqrt(l61.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p61 = 1.5;
            }
            
            dist = v54 + p61 + s54 * 0.000001;
            if (v61 > dist) {
                v61 = dist;
                d61 = d54;
            }
            dist = v53 + p61 + s53 * 0.000001;
            if (v61 > dist) {
                v61 = dist;
                d61 = d53;
            }
            dist = v52 + p61 + s52 * 0.000001;
            if (v61 > dist) {
                v61 = dist;
                d61 = d52;
            }
            dist = v60 + p61 + s60 * 0.000001;
            if (v61 > dist) {
                v61 = dist;
                d61 = d60;
            }
        }

        if (rc.onTheMap(l46)) {
            if (rc.canSenseLocation(l46)) {
                MapInfo mapInfo = rc.senseMapInfo(l46);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l46) || (rc.sensePassability(l46) && !rc.canSenseRobotAtLocation(l46) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l46), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p46 = mapInfo.getCooldownMultiplier(team);
                    s46 = Math.sqrt(l46.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p46 = 1.5;
            }
            
            dist = v37 + p46 + s37 * 0.000001;
            if (v46 > dist) {
                v46 = dist;
                d46 = d37;
            }
            dist = v36 + p46 + s36 * 0.000001;
            if (v46 > dist) {
                v46 = dist;
                d46 = d36;
            }
            dist = v45 + p46 + s45 * 0.000001;
            if (v46 > dist) {
                v46 = dist;
                d46 = d45;
            }
            dist = v54 + p46 + s54 * 0.000001;
            if (v46 > dist) {
                v46 = dist;
                d46 = d54;
            }
        }

        if (rc.onTheMap(l9)) {
            if (rc.canSenseLocation(l9)) {
                MapInfo mapInfo = rc.senseMapInfo(l9);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l9) || (rc.sensePassability(l9) && !rc.canSenseRobotAtLocation(l9) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l9), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p9 = mapInfo.getCooldownMultiplier(team);
                    s9 = Math.sqrt(l9.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p9 = 1.5;
            }
            
            dist = v17 + p9 + s17 * 0.000001;
            if (v9 > dist) {
                v9 = dist;
                d9 = d17;
            }
            dist = v18 + p9 + s18 * 0.000001;
            if (v9 > dist) {
                v9 = dist;
                d9 = d18;
            }
            dist = v8 + p9 + s8 * 0.000001;
            if (v9 > dist) {
                v9 = dist;
                d9 = d8;
            }
            dist = v16 + p9 + s16 * 0.000001;
            if (v9 > dist) {
                v9 = dist;
                d9 = d16;
            }
        }

        if (rc.onTheMap(l28)) {
            if (rc.canSenseLocation(l28)) {
                MapInfo mapInfo = rc.senseMapInfo(l28);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l28) || (rc.sensePassability(l28) && !rc.canSenseRobotAtLocation(l28) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l28), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p28 = mapInfo.getCooldownMultiplier(team);
                    s28 = Math.sqrt(l28.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p28 = 1.5;
            }
            
            dist = v37 + p28 + s37 * 0.000001;
            if (v28 > dist) {
                v28 = dist;
                d28 = d37;
            }
            dist = v18 + p28 + s18 * 0.000001;
            if (v28 > dist) {
                v28 = dist;
                d28 = d18;
            }
            dist = v27 + p28 + s27 * 0.000001;
            if (v28 > dist) {
                v28 = dist;
                d28 = d27;
            }
            dist = v36 + p28 + s36 * 0.000001;
            if (v28 > dist) {
                v28 = dist;
                d28 = d36;
            }
        }

        if (rc.onTheMap(l10)) {
            if (rc.canSenseLocation(l10)) {
                MapInfo mapInfo = rc.senseMapInfo(l10);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l10) || (rc.sensePassability(l10) && !rc.canSenseRobotAtLocation(l10) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l10), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p10 = mapInfo.getCooldownMultiplier(team);
                    s10 = Math.sqrt(l10.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p10 = 1.5;
            }
            
            dist = v18 + p10 + s18 * 0.000001;
            if (v10 > dist) {
                v10 = dist;
                d10 = d18;
            }
            dist = v19 + p10 + s19 * 0.000001;
            if (v10 > dist) {
                v10 = dist;
                d10 = d19;
            }
            dist = v9 + p10 + s9 * 0.000001;
            if (v10 > dist) {
                v10 = dist;
                d10 = d9;
            }
            dist = v17 + p10 + s17 * 0.000001;
            if (v10 > dist) {
                v10 = dist;
                d10 = d17;
            }
        }

        if (rc.onTheMap(l62)) {
            if (rc.canSenseLocation(l62)) {
                MapInfo mapInfo = rc.senseMapInfo(l62);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l62) || (rc.sensePassability(l62) && !rc.canSenseRobotAtLocation(l62) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l62), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p62 = mapInfo.getCooldownMultiplier(team);
                    s62 = Math.sqrt(l62.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p62 = 1.5;
            }
            
            dist = v55 + p62 + s55 * 0.000001;
            if (v62 > dist) {
                v62 = dist;
                d62 = d55;
            }
            dist = v54 + p62 + s54 * 0.000001;
            if (v62 > dist) {
                v62 = dist;
                d62 = d54;
            }
            dist = v53 + p62 + s53 * 0.000001;
            if (v62 > dist) {
                v62 = dist;
                d62 = d53;
            }
            dist = v61 + p62 + s61 * 0.000001;
            if (v62 > dist) {
                v62 = dist;
                d62 = d61;
            }
        }

        if (rc.onTheMap(l55)) {
            if (rc.canSenseLocation(l55)) {
                MapInfo mapInfo = rc.senseMapInfo(l55);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l55) || (rc.sensePassability(l55) && !rc.canSenseRobotAtLocation(l55) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l55), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p55 = mapInfo.getCooldownMultiplier(team);
                    s55 = Math.sqrt(l55.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p55 = 1.5;
            }
            
            dist = v46 + p55 + s46 * 0.000001;
            if (v55 > dist) {
                v55 = dist;
                d55 = d46;
            }
            dist = v45 + p55 + s45 * 0.000001;
            if (v55 > dist) {
                v55 = dist;
                d55 = d45;
            }
            dist = v54 + p55 + s54 * 0.000001;
            if (v55 > dist) {
                v55 = dist;
                d55 = d54;
            }
            dist = v62 + p55 + s62 * 0.000001;
            if (v55 > dist) {
                v55 = dist;
                d55 = d62;
            }
        }

        if (rc.onTheMap(l19)) {
            if (rc.canSenseLocation(l19)) {
                MapInfo mapInfo = rc.senseMapInfo(l19);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l19) || (rc.sensePassability(l19) && !rc.canSenseRobotAtLocation(l19) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l19), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p19 = mapInfo.getCooldownMultiplier(team);
                    s19 = Math.sqrt(l19.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p19 = 1.5;
            }
            
            dist = v28 + p19 + s28 * 0.000001;
            if (v19 > dist) {
                v19 = dist;
                d19 = d28;
            }
            dist = v10 + p19 + s10 * 0.000001;
            if (v19 > dist) {
                v19 = dist;
                d19 = d10;
            }
            dist = v18 + p19 + s18 * 0.000001;
            if (v19 > dist) {
                v19 = dist;
                d19 = d18;
            }
            dist = v27 + p19 + s27 * 0.000001;
            if (v19 > dist) {
                v19 = dist;
                d19 = d27;
            }
        }

        if (rc.onTheMap(l63)) {
            if (rc.canSenseLocation(l63)) {
                MapInfo mapInfo = rc.senseMapInfo(l63);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l63) || (rc.sensePassability(l63) && !rc.canSenseRobotAtLocation(l63) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l63), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p63 = mapInfo.getCooldownMultiplier(team);
                    s63 = Math.sqrt(l63.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p63 = 1.5;
            }
            
            dist = v55 + p63 + s55 * 0.000001;
            if (v63 > dist) {
                v63 = dist;
                d63 = d55;
            }
            dist = v54 + p63 + s54 * 0.000001;
            if (v63 > dist) {
                v63 = dist;
                d63 = d54;
            }
            dist = v62 + p63 + s62 * 0.000001;
            if (v63 > dist) {
                v63 = dist;
                d63 = d62;
            }
        }

        if (rc.onTheMap(l11)) {
            if (rc.canSenseLocation(l11)) {
                MapInfo mapInfo = rc.senseMapInfo(l11);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l11) || (rc.sensePassability(l11) && !rc.canSenseRobotAtLocation(l11) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l11), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p11 = mapInfo.getCooldownMultiplier(team);
                    s11 = Math.sqrt(l11.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p11 = 1.5;
            }
            
            dist = v19 + p11 + s19 * 0.000001;
            if (v11 > dist) {
                v11 = dist;
                d11 = d19;
            }
            dist = v10 + p11 + s10 * 0.000001;
            if (v11 > dist) {
                v11 = dist;
                d11 = d10;
            }
            dist = v18 + p11 + s18 * 0.000001;
            if (v11 > dist) {
                v11 = dist;
                d11 = d18;
            }
        }

        if (rc.onTheMap(l2)) {
            if (rc.canSenseLocation(l2)) {
                MapInfo mapInfo = rc.senseMapInfo(l2);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l2) || (rc.sensePassability(l2) && !rc.canSenseRobotAtLocation(l2) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l2), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p2 = mapInfo.getCooldownMultiplier(team);
                    s2 = Math.sqrt(l2.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p2 = 1.5;
            }
            
            dist = v8 + p2 + s8 * 0.000001;
            if (v2 > dist) {
                v2 = dist;
                d2 = d8;
            }
            dist = v9 + p2 + s9 * 0.000001;
            if (v2 > dist) {
                v2 = dist;
                d2 = d9;
            }
        }

        if (rc.onTheMap(l66)) {
            if (rc.canSenseLocation(l66)) {
                MapInfo mapInfo = rc.senseMapInfo(l66);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l66) || (rc.sensePassability(l66) && !rc.canSenseRobotAtLocation(l66) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l66), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p66 = mapInfo.getCooldownMultiplier(team);
                    s66 = Math.sqrt(l66.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p66 = 1.5;
            }
            
            dist = v61 + p66 + s61 * 0.000001;
            if (v66 > dist) {
                v66 = dist;
                d66 = d61;
            }
            dist = v60 + p66 + s60 * 0.000001;
            if (v66 > dist) {
                v66 = dist;
                d66 = d60;
            }
        }

        if (rc.onTheMap(l38)) {
            if (rc.canSenseLocation(l38)) {
                MapInfo mapInfo = rc.senseMapInfo(l38);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l38) || (rc.sensePassability(l38) && !rc.canSenseRobotAtLocation(l38) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l38), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p38 = mapInfo.getCooldownMultiplier(team);
                    s38 = Math.sqrt(l38.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p38 = 1.5;
            }
            
            dist = v28 + p38 + s28 * 0.000001;
            if (v38 > dist) {
                v38 = dist;
                d38 = d28;
            }
            dist = v37 + p38 + s37 * 0.000001;
            if (v38 > dist) {
                v38 = dist;
                d38 = d37;
            }
            dist = v46 + p38 + s46 * 0.000001;
            if (v38 > dist) {
                v38 = dist;
                d38 = d46;
            }
        }

        if (rc.onTheMap(l3)) {
            if (rc.canSenseLocation(l3)) {
                MapInfo mapInfo = rc.senseMapInfo(l3);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l3) || (rc.sensePassability(l3) && !rc.canSenseRobotAtLocation(l3) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l3), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p3 = mapInfo.getCooldownMultiplier(team);
                    s3 = Math.sqrt(l3.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p3 = 1.5;
            }
            
            dist = v9 + p3 + s9 * 0.000001;
            if (v3 > dist) {
                v3 = dist;
                d3 = d9;
            }
            dist = v10 + p3 + s10 * 0.000001;
            if (v3 > dist) {
                v3 = dist;
                d3 = d10;
            }
            dist = v2 + p3 + s2 * 0.000001;
            if (v3 > dist) {
                v3 = dist;
                d3 = d2;
            }
            dist = v8 + p3 + s8 * 0.000001;
            if (v3 > dist) {
                v3 = dist;
                d3 = d8;
            }
        }

        if (rc.onTheMap(l47)) {
            if (rc.canSenseLocation(l47)) {
                MapInfo mapInfo = rc.senseMapInfo(l47);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l47) || (rc.sensePassability(l47) && !rc.canSenseRobotAtLocation(l47) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l47), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p47 = mapInfo.getCooldownMultiplier(team);
                    s47 = Math.sqrt(l47.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p47 = 1.5;
            }
            
            dist = v38 + p47 + s38 * 0.000001;
            if (v47 > dist) {
                v47 = dist;
                d47 = d38;
            }
            dist = v37 + p47 + s37 * 0.000001;
            if (v47 > dist) {
                v47 = dist;
                d47 = d37;
            }
            dist = v46 + p47 + s46 * 0.000001;
            if (v47 > dist) {
                v47 = dist;
                d47 = d46;
            }
            dist = v55 + p47 + s55 * 0.000001;
            if (v47 > dist) {
                v47 = dist;
                d47 = d55;
            }
        }

        if (rc.onTheMap(l29)) {
            if (rc.canSenseLocation(l29)) {
                MapInfo mapInfo = rc.senseMapInfo(l29);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l29) || (rc.sensePassability(l29) && !rc.canSenseRobotAtLocation(l29) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l29), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p29 = mapInfo.getCooldownMultiplier(team);
                    s29 = Math.sqrt(l29.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p29 = 1.5;
            }
            
            dist = v38 + p29 + s38 * 0.000001;
            if (v29 > dist) {
                v29 = dist;
                d29 = d38;
            }
            dist = v19 + p29 + s19 * 0.000001;
            if (v29 > dist) {
                v29 = dist;
                d29 = d19;
            }
            dist = v28 + p29 + s28 * 0.000001;
            if (v29 > dist) {
                v29 = dist;
                d29 = d28;
            }
            dist = v37 + p29 + s37 * 0.000001;
            if (v29 > dist) {
                v29 = dist;
                d29 = d37;
            }
        }

        if (rc.onTheMap(l67)) {
            if (rc.canSenseLocation(l67)) {
                MapInfo mapInfo = rc.senseMapInfo(l67);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l67) || (rc.sensePassability(l67) && !rc.canSenseRobotAtLocation(l67) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l67), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p67 = mapInfo.getCooldownMultiplier(team);
                    s67 = Math.sqrt(l67.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p67 = 1.5;
            }
            
            dist = v62 + p67 + s62 * 0.000001;
            if (v67 > dist) {
                v67 = dist;
                d67 = d62;
            }
            dist = v61 + p67 + s61 * 0.000001;
            if (v67 > dist) {
                v67 = dist;
                d67 = d61;
            }
            dist = v60 + p67 + s60 * 0.000001;
            if (v67 > dist) {
                v67 = dist;
                d67 = d60;
            }
            dist = v66 + p67 + s66 * 0.000001;
            if (v67 > dist) {
                v67 = dist;
                d67 = d66;
            }
        }

        if (rc.onTheMap(l68)) {
            if (rc.canSenseLocation(l68)) {
                MapInfo mapInfo = rc.senseMapInfo(l68);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l68) || (rc.sensePassability(l68) && !rc.canSenseRobotAtLocation(l68) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l68), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p68 = mapInfo.getCooldownMultiplier(team);
                    s68 = Math.sqrt(l68.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p68 = 1.5;
            }
            
            dist = v63 + p68 + s63 * 0.000001;
            if (v68 > dist) {
                v68 = dist;
                d68 = d63;
            }
            dist = v62 + p68 + s62 * 0.000001;
            if (v68 > dist) {
                v68 = dist;
                d68 = d62;
            }
            dist = v61 + p68 + s61 * 0.000001;
            if (v68 > dist) {
                v68 = dist;
                d68 = d61;
            }
            dist = v67 + p68 + s67 * 0.000001;
            if (v68 > dist) {
                v68 = dist;
                d68 = d67;
            }
        }

        if (rc.onTheMap(l4)) {
            if (rc.canSenseLocation(l4)) {
                MapInfo mapInfo = rc.senseMapInfo(l4);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l4) || (rc.sensePassability(l4) && !rc.canSenseRobotAtLocation(l4) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l4), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p4 = mapInfo.getCooldownMultiplier(team);
                    s4 = Math.sqrt(l4.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p4 = 1.5;
            }
            
            dist = v10 + p4 + s10 * 0.000001;
            if (v4 > dist) {
                v4 = dist;
                d4 = d10;
            }
            dist = v11 + p4 + s11 * 0.000001;
            if (v4 > dist) {
                v4 = dist;
                d4 = d11;
            }
            dist = v3 + p4 + s3 * 0.000001;
            if (v4 > dist) {
                v4 = dist;
                d4 = d3;
            }
            dist = v9 + p4 + s9 * 0.000001;
            if (v4 > dist) {
                v4 = dist;
                d4 = d9;
            }
        }

        if (rc.onTheMap(l56)) {
            if (rc.canSenseLocation(l56)) {
                MapInfo mapInfo = rc.senseMapInfo(l56);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l56) || (rc.sensePassability(l56) && !rc.canSenseRobotAtLocation(l56) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l56), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p56 = mapInfo.getCooldownMultiplier(team);
                    s56 = Math.sqrt(l56.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p56 = 1.5;
            }
            
            dist = v47 + p56 + s47 * 0.000001;
            if (v56 > dist) {
                v56 = dist;
                d56 = d47;
            }
            dist = v46 + p56 + s46 * 0.000001;
            if (v56 > dist) {
                v56 = dist;
                d56 = d46;
            }
            dist = v55 + p56 + s55 * 0.000001;
            if (v56 > dist) {
                v56 = dist;
                d56 = d55;
            }
            dist = v63 + p56 + s63 * 0.000001;
            if (v56 > dist) {
                v56 = dist;
                d56 = d63;
            }
        }

        if (rc.onTheMap(l20)) {
            if (rc.canSenseLocation(l20)) {
                MapInfo mapInfo = rc.senseMapInfo(l20);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l20) || (rc.sensePassability(l20) && !rc.canSenseRobotAtLocation(l20) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l20), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p20 = mapInfo.getCooldownMultiplier(team);
                    s20 = Math.sqrt(l20.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p20 = 1.5;
            }
            
            dist = v29 + p20 + s29 * 0.000001;
            if (v20 > dist) {
                v20 = dist;
                d20 = d29;
            }
            dist = v11 + p20 + s11 * 0.000001;
            if (v20 > dist) {
                v20 = dist;
                d20 = d11;
            }
            dist = v19 + p20 + s19 * 0.000001;
            if (v20 > dist) {
                v20 = dist;
                d20 = d19;
            }
            dist = v28 + p20 + s28 * 0.000001;
            if (v20 > dist) {
                v20 = dist;
                d20 = d28;
            }
        }
    
        int dx = targetLocation.x - l34.x;
        int dy = targetLocation.y - l34.y;

        switch(dx) {
            case -4:
                switch(dy) {
                    case 0:
                        if (v2 < 1000000) {
                            bug.reset();
                            return d2;
                        } break;
                    case 1:
                        if (v3 < 1000000) {
                            bug.reset();
                            return d3;
                        } break;
                    case 2:
                        if (v4 < 1000000) {
                            bug.reset();
                            return d4;
                        } break;
                } break;

            case -3:
                switch(dy) {
                    case 0:
                        if (v8 < 1000000) {
                            bug.reset();
                            return d8;
                        } break;
                    case 1:
                        if (v9 < 1000000) {
                            bug.reset();
                            return d9;
                        } break;
                    case 2:
                        if (v10 < 1000000) {
                            bug.reset();
                            return d10;
                        } break;
                    case 3:
                        if (v11 < 1000000) {
                            bug.reset();
                            return d11;
                        } break;
                } break;

            case -2:
                switch(dy) {
                    case 0:
                        if (v16 < 1000000) {
                            bug.reset();
                            return d16;
                        } break;
                    case 1:
                        if (v17 < 1000000) {
                            bug.reset();
                            return d17;
                        } break;
                    case 2:
                        if (v18 < 1000000) {
                            bug.reset();
                            return d18;
                        } break;
                    case 3:
                        if (v19 < 1000000) {
                            bug.reset();
                            return d19;
                        } break;
                    case 4:
                        if (v20 < 1000000) {
                            bug.reset();
                            return d20;
                        } break;
                } break;

            case -1:
                switch(dy) {
                    case 0:
                        if (v25 < 1000000) {
                            bug.reset();
                            return d25;
                        } break;
                    case 1:
                        if (v26 < 1000000) {
                            bug.reset();
                            return d26;
                        } break;
                    case 2:
                        if (v27 < 1000000) {
                            bug.reset();
                            return d27;
                        } break;
                    case 3:
                        if (v28 < 1000000) {
                            bug.reset();
                            return d28;
                        } break;
                    case 4:
                        if (v29 < 1000000) {
                            bug.reset();
                            return d29;
                        } break;
                } break;

            case 0:
                switch(dy) {
                    case 1:
                        if (v35 < 1000000) {
                            bug.reset();
                            return d35;
                        } break;
                    case 2:
                        if (v36 < 1000000) {
                            bug.reset();
                            return d36;
                        } break;
                    case 3:
                        if (v37 < 1000000) {
                            bug.reset();
                            return d37;
                        } break;
                    case 4:
                        if (v38 < 1000000) {
                            bug.reset();
                            return d38;
                        } break;
                } break;

            case 1:
                switch(dy) {
                    case 0:
                        if (v43 < 1000000) {
                            bug.reset();
                            return d43;
                        } break;
                    case 1:
                        if (v44 < 1000000) {
                            bug.reset();
                            return d44;
                        } break;
                    case 2:
                        if (v45 < 1000000) {
                            bug.reset();
                            return d45;
                        } break;
                    case 3:
                        if (v46 < 1000000) {
                            bug.reset();
                            return d46;
                        } break;
                    case 4:
                        if (v47 < 1000000) {
                            bug.reset();
                            return d47;
                        } break;
                } break;

            case 2:
                switch(dy) {
                    case 0:
                        if (v52 < 1000000) {
                            bug.reset();
                            return d52;
                        } break;
                    case 1:
                        if (v53 < 1000000) {
                            bug.reset();
                            return d53;
                        } break;
                    case 2:
                        if (v54 < 1000000) {
                            bug.reset();
                            return d54;
                        } break;
                    case 3:
                        if (v55 < 1000000) {
                            bug.reset();
                            return d55;
                        } break;
                    case 4:
                        if (v56 < 1000000) {
                            bug.reset();
                            return d56;
                        } break;
                } break;

            case 3:
                switch(dy) {
                    case 0:
                        if (v60 < 1000000) {
                            bug.reset();
                            return d60;
                        } break;
                    case 1:
                        if (v61 < 1000000) {
                            bug.reset();
                            return d61;
                        } break;
                    case 2:
                        if (v62 < 1000000) {
                            bug.reset();
                            return d62;
                        } break;
                    case 3:
                        if (v63 < 1000000) {
                            bug.reset();
                            return d63;
                        } break;
                } break;

            case 4:
                switch(dy) {
                    case 0:
                        if (v66 < 1000000) {
                            bug.reset();
                            return d66;
                        } break;
                    case 1:
                        if (v67 < 1000000) {
                            bug.reset();
                            return d67;
                        } break;
                    case 2:
                        if (v68 < 1000000) {
                            bug.reset();
                            return d68;
                        } break;
                } break;

        }
    
        Direction ans = Direction.CENTER;

        double dist2 = v2 + s2;
        if (dist2 < localBest) {
            localBest = dist2;
            ans = d2;
        }

        double dist3 = v3 + s3;
        if (dist3 < localBest) {
            localBest = dist3;
            ans = d3;
        }

        double dist4 = v4 + s4;
        if (dist4 < localBest) {
            localBest = dist4;
            ans = d4;
        }

        double dist8 = v8 + s8;
        if (dist8 < localBest) {
            localBest = dist8;
            ans = d8;
        }

        double dist9 = v9 + s9;
        if (dist9 < localBest) {
            localBest = dist9;
            ans = d9;
        }

        double dist10 = v10 + s10;
        if (dist10 < localBest) {
            localBest = dist10;
            ans = d10;
        }

        double dist11 = v11 + s11;
        if (dist11 < localBest) {
            localBest = dist11;
            ans = d11;
        }

        double dist16 = v16 + s16;
        if (dist16 < localBest) {
            localBest = dist16;
            ans = d16;
        }

        double dist17 = v17 + s17;
        if (dist17 < localBest) {
            localBest = dist17;
            ans = d17;
        }

        double dist18 = v18 + s18;
        if (dist18 < localBest) {
            localBest = dist18;
            ans = d18;
        }

        double dist19 = v19 + s19;
        if (dist19 < localBest) {
            localBest = dist19;
            ans = d19;
        }

        double dist20 = v20 + s20;
        if (dist20 < localBest) {
            localBest = dist20;
            ans = d20;
        }

        double dist25 = v25 + s25;
        if (dist25 < localBest) {
            localBest = dist25;
            ans = d25;
        }

        double dist26 = v26 + s26;
        if (dist26 < localBest) {
            localBest = dist26;
            ans = d26;
        }

        double dist27 = v27 + s27;
        if (dist27 < localBest) {
            localBest = dist27;
            ans = d27;
        }

        double dist28 = v28 + s28;
        if (dist28 < localBest) {
            localBest = dist28;
            ans = d28;
        }

        double dist29 = v29 + s29;
        if (dist29 < localBest) {
            localBest = dist29;
            ans = d29;
        }

        double dist35 = v35 + s35;
        if (dist35 < localBest) {
            localBest = dist35;
            ans = d35;
        }

        double dist36 = v36 + s36;
        if (dist36 < localBest) {
            localBest = dist36;
            ans = d36;
        }

        double dist37 = v37 + s37;
        if (dist37 < localBest) {
            localBest = dist37;
            ans = d37;
        }

        double dist38 = v38 + s38;
        if (dist38 < localBest) {
            localBest = dist38;
            ans = d38;
        }

        double dist43 = v43 + s43;
        if (dist43 < localBest) {
            localBest = dist43;
            ans = d43;
        }

        double dist44 = v44 + s44;
        if (dist44 < localBest) {
            localBest = dist44;
            ans = d44;
        }

        double dist45 = v45 + s45;
        if (dist45 < localBest) {
            localBest = dist45;
            ans = d45;
        }

        double dist46 = v46 + s46;
        if (dist46 < localBest) {
            localBest = dist46;
            ans = d46;
        }

        double dist47 = v47 + s47;
        if (dist47 < localBest) {
            localBest = dist47;
            ans = d47;
        }

        double dist52 = v52 + s52;
        if (dist52 < localBest) {
            localBest = dist52;
            ans = d52;
        }

        double dist53 = v53 + s53;
        if (dist53 < localBest) {
            localBest = dist53;
            ans = d53;
        }

        double dist54 = v54 + s54;
        if (dist54 < localBest) {
            localBest = dist54;
            ans = d54;
        }

        double dist55 = v55 + s55;
        if (dist55 < localBest) {
            localBest = dist55;
            ans = d55;
        }

        double dist56 = v56 + s56;
        if (dist56 < localBest) {
            localBest = dist56;
            ans = d56;
        }

        double dist60 = v60 + s60;
        if (dist60 < localBest) {
            localBest = dist60;
            ans = d60;
        }

        double dist61 = v61 + s61;
        if (dist61 < localBest) {
            localBest = dist61;
            ans = d61;
        }

        double dist62 = v62 + s62;
        if (dist62 < localBest) {
            localBest = dist62;
            ans = d62;
        }

        double dist63 = v63 + s63;
        if (dist63 < localBest) {
            localBest = dist63;
            ans = d63;
        }

        double dist66 = v66 + s66;
        if (dist66 < localBest) {
            localBest = dist66;
            ans = d66;
        }

        double dist67 = v67 + s67;
        if (dist67 < localBest) {
            localBest = dist67;
            ans = d67;
        }

        double dist68 = v68 + s68;
        if (dist68 < localBest) {
            localBest = dist68;
            ans = d68;
        }

        if (localBest < globalBest) {
            globalBest = localBest;
            bug.reset();
            return ans;
        }

        consecutiveBugNavRoundCount += 1;

        if (consecutiveBugNavRoundCount > 40) {
            globalBest = 1000000;
            consecutiveBugNavRoundCount = 0;
        }

        bug.move(targetLocation, lastDirection);
        return null;
    }

    private Direction getBestDirection1() throws GameActionException {
        double localBest = 1000000.0;
        double dist = 0.0;
        l34 = currentLocation;
        v34 = 0;
        d43 = null;
        l43 = l34.add(Direction.EAST);
        v43 = 1000000;
        p43 = 1000000;
        s43 = Math.sqrt(l43.distanceSquaredTo(targetLocation));
        d44 = null;
        l44 = l34.add(Direction.NORTHEAST);
        v44 = 1000000;
        p44 = 1000000;
        s44 = Math.sqrt(l44.distanceSquaredTo(targetLocation));
        d35 = null;
        l35 = l34.add(Direction.NORTH);
        v35 = 1000000;
        p35 = 1000000;
        s35 = Math.sqrt(l35.distanceSquaredTo(targetLocation));
        d26 = null;
        l26 = l34.add(Direction.NORTHWEST);
        v26 = 1000000;
        p26 = 1000000;
        s26 = Math.sqrt(l26.distanceSquaredTo(targetLocation));
        d42 = null;
        l42 = l34.add(Direction.SOUTHEAST);
        v42 = 1000000;
        p42 = 1000000;
        s42 = Math.sqrt(l42.distanceSquaredTo(targetLocation));
        d45 = null;
        l45 = l35.add(Direction.NORTHEAST);
        v45 = 1000000;
        p45 = 1000000;
        s45 = Math.sqrt(l45.distanceSquaredTo(targetLocation));
        d36 = null;
        l36 = l35.add(Direction.NORTH);
        v36 = 1000000;
        p36 = 1000000;
        s36 = Math.sqrt(l36.distanceSquaredTo(targetLocation));
        d27 = null;
        l27 = l35.add(Direction.NORTHWEST);
        v27 = 1000000;
        p27 = 1000000;
        s27 = Math.sqrt(l27.distanceSquaredTo(targetLocation));
        d52 = null;
        l52 = l43.add(Direction.EAST);
        v52 = 1000000;
        p52 = 1000000;
        s52 = Math.sqrt(l52.distanceSquaredTo(targetLocation));
        d53 = null;
        l53 = l43.add(Direction.NORTHEAST);
        v53 = 1000000;
        p53 = 1000000;
        s53 = Math.sqrt(l53.distanceSquaredTo(targetLocation));
        d51 = null;
        l51 = l43.add(Direction.SOUTHEAST);
        v51 = 1000000;
        p51 = 1000000;
        s51 = Math.sqrt(l51.distanceSquaredTo(targetLocation));
        d50 = null;
        l50 = l42.add(Direction.SOUTHEAST);
        v50 = 1000000;
        p50 = 1000000;
        s50 = Math.sqrt(l50.distanceSquaredTo(targetLocation));
        d54 = null;
        l54 = l44.add(Direction.NORTHEAST);
        v54 = 1000000;
        p54 = 1000000;
        s54 = Math.sqrt(l54.distanceSquaredTo(targetLocation));
        d18 = null;
        l18 = l26.add(Direction.NORTHWEST);
        v18 = 1000000;
        p18 = 1000000;
        s18 = Math.sqrt(l18.distanceSquaredTo(targetLocation));
        d46 = null;
        l46 = l36.add(Direction.NORTHEAST);
        v46 = 1000000;
        p46 = 1000000;
        s46 = Math.sqrt(l46.distanceSquaredTo(targetLocation));
        d37 = null;
        l37 = l36.add(Direction.NORTH);
        v37 = 1000000;
        p37 = 1000000;
        s37 = Math.sqrt(l37.distanceSquaredTo(targetLocation));
        d28 = null;
        l28 = l36.add(Direction.NORTHWEST);
        v28 = 1000000;
        p28 = 1000000;
        s28 = Math.sqrt(l28.distanceSquaredTo(targetLocation));
        d60 = null;
        l60 = l52.add(Direction.EAST);
        v60 = 1000000;
        p60 = 1000000;
        s60 = Math.sqrt(l60.distanceSquaredTo(targetLocation));
        d61 = null;
        l61 = l52.add(Direction.NORTHEAST);
        v61 = 1000000;
        p61 = 1000000;
        s61 = Math.sqrt(l61.distanceSquaredTo(targetLocation));
        d59 = null;
        l59 = l52.add(Direction.SOUTHEAST);
        v59 = 1000000;
        p59 = 1000000;
        s59 = Math.sqrt(l59.distanceSquaredTo(targetLocation));
        d62 = null;
        l62 = l53.add(Direction.NORTHEAST);
        v62 = 1000000;
        p62 = 1000000;
        s62 = Math.sqrt(l62.distanceSquaredTo(targetLocation));
        d58 = null;
        l58 = l51.add(Direction.SOUTHEAST);
        v58 = 1000000;
        p58 = 1000000;
        s58 = Math.sqrt(l58.distanceSquaredTo(targetLocation));
        d19 = null;
        l19 = l27.add(Direction.NORTHWEST);
        v19 = 1000000;
        p19 = 1000000;
        s19 = Math.sqrt(l19.distanceSquaredTo(targetLocation));
        d55 = null;
        l55 = l45.add(Direction.NORTHEAST);
        v55 = 1000000;
        p55 = 1000000;
        s55 = Math.sqrt(l55.distanceSquaredTo(targetLocation));
        d11 = null;
        l11 = l18.add(Direction.NORTHWEST);
        v11 = 1000000;
        p11 = 1000000;
        s11 = Math.sqrt(l11.distanceSquaredTo(targetLocation));
        d57 = null;
        l57 = l50.add(Direction.SOUTHEAST);
        v57 = 1000000;
        p57 = 1000000;
        s57 = Math.sqrt(l57.distanceSquaredTo(targetLocation));
        d63 = null;
        l63 = l54.add(Direction.NORTHEAST);
        v63 = 1000000;
        p63 = 1000000;
        s63 = Math.sqrt(l63.distanceSquaredTo(targetLocation));
        d47 = null;
        l47 = l37.add(Direction.NORTHEAST);
        v47 = 1000000;
        p47 = 1000000;
        s47 = Math.sqrt(l47.distanceSquaredTo(targetLocation));
        d38 = null;
        l38 = l37.add(Direction.NORTH);
        v38 = 1000000;
        p38 = 1000000;
        s38 = Math.sqrt(l38.distanceSquaredTo(targetLocation));
        d29 = null;
        l29 = l37.add(Direction.NORTHWEST);
        v29 = 1000000;
        p29 = 1000000;
        s29 = Math.sqrt(l29.distanceSquaredTo(targetLocation));
        d66 = null;
        l66 = l60.add(Direction.EAST);
        v66 = 1000000;
        p66 = 1000000;
        s66 = Math.sqrt(l66.distanceSquaredTo(targetLocation));
        d67 = null;
        l67 = l60.add(Direction.NORTHEAST);
        v67 = 1000000;
        p67 = 1000000;
        s67 = Math.sqrt(l67.distanceSquaredTo(targetLocation));
        d65 = null;
        l65 = l60.add(Direction.SOUTHEAST);
        v65 = 1000000;
        p65 = 1000000;
        s65 = Math.sqrt(l65.distanceSquaredTo(targetLocation));
        d64 = null;
        l64 = l59.add(Direction.SOUTHEAST);
        v64 = 1000000;
        p64 = 1000000;
        s64 = Math.sqrt(l64.distanceSquaredTo(targetLocation));
        d20 = null;
        l20 = l28.add(Direction.NORTHWEST);
        v20 = 1000000;
        p20 = 1000000;
        s20 = Math.sqrt(l20.distanceSquaredTo(targetLocation));
        d56 = null;
        l56 = l46.add(Direction.NORTHEAST);
        v56 = 1000000;
        p56 = 1000000;
        s56 = Math.sqrt(l56.distanceSquaredTo(targetLocation));
        d68 = null;
        l68 = l61.add(Direction.NORTHEAST);
        v68 = 1000000;
        p68 = 1000000;
        s68 = Math.sqrt(l68.distanceSquaredTo(targetLocation));
    

        if (rc.onTheMap(l35) && rc.canMove(Direction.NORTH)) {
            if (rc.canSenseLocation(l35)) {
                MapInfo mapInfo = rc.senseMapInfo(l35);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l35) || (rc.sensePassability(l35) && !rc.canSenseRobotAtLocation(l35) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l35), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p35 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p35 = 1.5;
            }
            
            dist = v34 + p35 + s34 * 0.000001;
            if (v35 > dist) {
                v35 = dist;
                d35 = Direction.NORTH;
            }
            dist = v43 + p35 + s43 * 0.000001;
            if (v35 > dist) {
                v35 = dist;
                d35 = d43;
            }
        }

        if (rc.onTheMap(l43) && rc.canMove(Direction.EAST)) {
            if (rc.canSenseLocation(l43)) {
                MapInfo mapInfo = rc.senseMapInfo(l43);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l43) || (rc.sensePassability(l43) && !rc.canSenseRobotAtLocation(l43) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l43), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p43 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p43 = 1.5;
            }
            
            dist = v35 + p43 + s35 * 0.000001;
            if (v43 > dist) {
                v43 = dist;
                d43 = d35;
            }
            dist = v34 + p43 + s34 * 0.000001;
            if (v43 > dist) {
                v43 = dist;
                d43 = Direction.EAST;
            }
        }

        if (rc.onTheMap(l42) && rc.canMove(Direction.SOUTHEAST)) {
            if (rc.canSenseLocation(l42)) {
                MapInfo mapInfo = rc.senseMapInfo(l42);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l42) || (rc.sensePassability(l42) && !rc.canSenseRobotAtLocation(l42) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l42), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p42 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p42 = 1.5;
            }
            
            dist = v43 + p42 + s43 * 0.000001;
            if (v42 > dist) {
                v42 = dist;
                d42 = d43;
            }
            dist = v34 + p42 + s34 * 0.000001;
            if (v42 > dist) {
                v42 = dist;
                d42 = Direction.SOUTHEAST;
            }
        }

        if (rc.onTheMap(l44) && rc.canMove(Direction.NORTHEAST)) {
            if (rc.canSenseLocation(l44)) {
                MapInfo mapInfo = rc.senseMapInfo(l44);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l44) || (rc.sensePassability(l44) && !rc.canSenseRobotAtLocation(l44) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l44), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p44 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p44 = 1.5;
            }
            
            dist = v35 + p44 + s35 * 0.000001;
            if (v44 > dist) {
                v44 = dist;
                d44 = d35;
            }
            dist = v34 + p44 + s34 * 0.000001;
            if (v44 > dist) {
                v44 = dist;
                d44 = Direction.NORTHEAST;
            }
            dist = v43 + p44 + s43 * 0.000001;
            if (v44 > dist) {
                v44 = dist;
                d44 = d43;
            }
        }

        if (rc.onTheMap(l26) && rc.canMove(Direction.NORTHWEST)) {
            if (rc.canSenseLocation(l26)) {
                MapInfo mapInfo = rc.senseMapInfo(l26);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l26) || (rc.sensePassability(l26) && !rc.canSenseRobotAtLocation(l26) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l26), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p26 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p26 = 1.5;
            }
            
            dist = v35 + p26 + s35 * 0.000001;
            if (v26 > dist) {
                v26 = dist;
                d26 = d35;
            }
            dist = v34 + p26 + s34 * 0.000001;
            if (v26 > dist) {
                v26 = dist;
                d26 = Direction.NORTHWEST;
            }
        }

        if (rc.onTheMap(l36)) {
            if (rc.canSenseLocation(l36)) {
                MapInfo mapInfo = rc.senseMapInfo(l36);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l36) || (rc.sensePassability(l36) && !rc.canSenseRobotAtLocation(l36) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l36), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p36 = mapInfo.getCooldownMultiplier(team);
                    s36 = Math.sqrt(l36.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p36 = 1.5;
            }
            
            dist = v26 + p36 + s26 * 0.000001;
            if (v36 > dist) {
                v36 = dist;
                d36 = d26;
            }
            dist = v35 + p36 + s35 * 0.000001;
            if (v36 > dist) {
                v36 = dist;
                d36 = d35;
            }
            dist = v44 + p36 + s44 * 0.000001;
            if (v36 > dist) {
                v36 = dist;
                d36 = d44;
            }
        }

        if (rc.onTheMap(l52)) {
            if (rc.canSenseLocation(l52)) {
                MapInfo mapInfo = rc.senseMapInfo(l52);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l52) || (rc.sensePassability(l52) && !rc.canSenseRobotAtLocation(l52) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l52), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p52 = mapInfo.getCooldownMultiplier(team);
                    s52 = Math.sqrt(l52.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p52 = 1.5;
            }
            
            dist = v44 + p52 + s44 * 0.000001;
            if (v52 > dist) {
                v52 = dist;
                d52 = d44;
            }
            dist = v43 + p52 + s43 * 0.000001;
            if (v52 > dist) {
                v52 = dist;
                d52 = d43;
            }
            dist = v42 + p52 + s42 * 0.000001;
            if (v52 > dist) {
                v52 = dist;
                d52 = d42;
            }
        }

        if (rc.onTheMap(l53)) {
            if (rc.canSenseLocation(l53)) {
                MapInfo mapInfo = rc.senseMapInfo(l53);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l53) || (rc.sensePassability(l53) && !rc.canSenseRobotAtLocation(l53) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l53), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p53 = mapInfo.getCooldownMultiplier(team);
                    s53 = Math.sqrt(l53.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p53 = 1.5;
            }
            
            dist = v45 + p53 + s45 * 0.000001;
            if (v53 > dist) {
                v53 = dist;
                d53 = d45;
            }
            dist = v44 + p53 + s44 * 0.000001;
            if (v53 > dist) {
                v53 = dist;
                d53 = d44;
            }
            dist = v43 + p53 + s43 * 0.000001;
            if (v53 > dist) {
                v53 = dist;
                d53 = d43;
            }
            dist = v52 + p53 + s52 * 0.000001;
            if (v53 > dist) {
                v53 = dist;
                d53 = d52;
            }
        }

        if (rc.onTheMap(l51)) {
            if (rc.canSenseLocation(l51)) {
                MapInfo mapInfo = rc.senseMapInfo(l51);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l51) || (rc.sensePassability(l51) && !rc.canSenseRobotAtLocation(l51) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l51), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p51 = mapInfo.getCooldownMultiplier(team);
                    s51 = Math.sqrt(l51.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p51 = 1.5;
            }
            
            dist = v52 + p51 + s52 * 0.000001;
            if (v51 > dist) {
                v51 = dist;
                d51 = d52;
            }
            dist = v43 + p51 + s43 * 0.000001;
            if (v51 > dist) {
                v51 = dist;
                d51 = d43;
            }
            dist = v42 + p51 + s42 * 0.000001;
            if (v51 > dist) {
                v51 = dist;
                d51 = d42;
            }
        }

        if (rc.onTheMap(l27)) {
            if (rc.canSenseLocation(l27)) {
                MapInfo mapInfo = rc.senseMapInfo(l27);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l27) || (rc.sensePassability(l27) && !rc.canSenseRobotAtLocation(l27) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l27), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p27 = mapInfo.getCooldownMultiplier(team);
                    s27 = Math.sqrt(l27.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p27 = 1.5;
            }
            
            dist = v36 + p27 + s36 * 0.000001;
            if (v27 > dist) {
                v27 = dist;
                d27 = d36;
            }
            dist = v26 + p27 + s26 * 0.000001;
            if (v27 > dist) {
                v27 = dist;
                d27 = d26;
            }
            dist = v35 + p27 + s35 * 0.000001;
            if (v27 > dist) {
                v27 = dist;
                d27 = d35;
            }
        }

        if (rc.onTheMap(l45)) {
            if (rc.canSenseLocation(l45)) {
                MapInfo mapInfo = rc.senseMapInfo(l45);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l45) || (rc.sensePassability(l45) && !rc.canSenseRobotAtLocation(l45) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l45), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p45 = mapInfo.getCooldownMultiplier(team);
                    s45 = Math.sqrt(l45.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p45 = 1.5;
            }
            
            dist = v36 + p45 + s36 * 0.000001;
            if (v45 > dist) {
                v45 = dist;
                d45 = d36;
            }
            dist = v35 + p45 + s35 * 0.000001;
            if (v45 > dist) {
                v45 = dist;
                d45 = d35;
            }
            dist = v44 + p45 + s44 * 0.000001;
            if (v45 > dist) {
                v45 = dist;
                d45 = d44;
            }
            dist = v53 + p45 + s53 * 0.000001;
            if (v45 > dist) {
                v45 = dist;
                d45 = d53;
            }
        }

        if (rc.onTheMap(l18)) {
            if (rc.canSenseLocation(l18)) {
                MapInfo mapInfo = rc.senseMapInfo(l18);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l18) || (rc.sensePassability(l18) && !rc.canSenseRobotAtLocation(l18) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l18), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p18 = mapInfo.getCooldownMultiplier(team);
                    s18 = Math.sqrt(l18.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p18 = 1.5;
            }
            
            dist = v27 + p18 + s27 * 0.000001;
            if (v18 > dist) {
                v18 = dist;
                d18 = d27;
            }
            dist = v26 + p18 + s26 * 0.000001;
            if (v18 > dist) {
                v18 = dist;
                d18 = d26;
            }
        }

        if (rc.onTheMap(l50)) {
            if (rc.canSenseLocation(l50)) {
                MapInfo mapInfo = rc.senseMapInfo(l50);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l50) || (rc.sensePassability(l50) && !rc.canSenseRobotAtLocation(l50) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l50), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p50 = mapInfo.getCooldownMultiplier(team);
                    s50 = Math.sqrt(l50.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p50 = 1.5;
            }
            
            dist = v51 + p50 + s51 * 0.000001;
            if (v50 > dist) {
                v50 = dist;
                d50 = d51;
            }
            dist = v42 + p50 + s42 * 0.000001;
            if (v50 > dist) {
                v50 = dist;
                d50 = d42;
            }
        }

        if (rc.onTheMap(l54)) {
            if (rc.canSenseLocation(l54)) {
                MapInfo mapInfo = rc.senseMapInfo(l54);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l54) || (rc.sensePassability(l54) && !rc.canSenseRobotAtLocation(l54) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l54), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p54 = mapInfo.getCooldownMultiplier(team);
                    s54 = Math.sqrt(l54.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p54 = 1.5;
            }
            
            dist = v45 + p54 + s45 * 0.000001;
            if (v54 > dist) {
                v54 = dist;
                d54 = d45;
            }
            dist = v44 + p54 + s44 * 0.000001;
            if (v54 > dist) {
                v54 = dist;
                d54 = d44;
            }
            dist = v53 + p54 + s53 * 0.000001;
            if (v54 > dist) {
                v54 = dist;
                d54 = d53;
            }
        }

        if (rc.onTheMap(l37)) {
            if (rc.canSenseLocation(l37)) {
                MapInfo mapInfo = rc.senseMapInfo(l37);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l37) || (rc.sensePassability(l37) && !rc.canSenseRobotAtLocation(l37) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l37), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p37 = mapInfo.getCooldownMultiplier(team);
                    s37 = Math.sqrt(l37.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p37 = 1.5;
            }
            
            dist = v27 + p37 + s27 * 0.000001;
            if (v37 > dist) {
                v37 = dist;
                d37 = d27;
            }
            dist = v36 + p37 + s36 * 0.000001;
            if (v37 > dist) {
                v37 = dist;
                d37 = d36;
            }
            dist = v45 + p37 + s45 * 0.000001;
            if (v37 > dist) {
                v37 = dist;
                d37 = d45;
            }
        }

        if (rc.onTheMap(l60)) {
            if (rc.canSenseLocation(l60)) {
                MapInfo mapInfo = rc.senseMapInfo(l60);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l60) || (rc.sensePassability(l60) && !rc.canSenseRobotAtLocation(l60) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l60), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p60 = mapInfo.getCooldownMultiplier(team);
                    s60 = Math.sqrt(l60.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p60 = 1.5;
            }
            
            dist = v53 + p60 + s53 * 0.000001;
            if (v60 > dist) {
                v60 = dist;
                d60 = d53;
            }
            dist = v52 + p60 + s52 * 0.000001;
            if (v60 > dist) {
                v60 = dist;
                d60 = d52;
            }
            dist = v51 + p60 + s51 * 0.000001;
            if (v60 > dist) {
                v60 = dist;
                d60 = d51;
            }
        }

        if (rc.onTheMap(l59)) {
            if (rc.canSenseLocation(l59)) {
                MapInfo mapInfo = rc.senseMapInfo(l59);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l59) || (rc.sensePassability(l59) && !rc.canSenseRobotAtLocation(l59) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l59), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p59 = mapInfo.getCooldownMultiplier(team);
                    s59 = Math.sqrt(l59.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p59 = 1.5;
            }
            
            dist = v60 + p59 + s60 * 0.000001;
            if (v59 > dist) {
                v59 = dist;
                d59 = d60;
            }
            dist = v52 + p59 + s52 * 0.000001;
            if (v59 > dist) {
                v59 = dist;
                d59 = d52;
            }
            dist = v51 + p59 + s51 * 0.000001;
            if (v59 > dist) {
                v59 = dist;
                d59 = d51;
            }
            dist = v50 + p59 + s50 * 0.000001;
            if (v59 > dist) {
                v59 = dist;
                d59 = d50;
            }
        }

        if (rc.onTheMap(l28)) {
            if (rc.canSenseLocation(l28)) {
                MapInfo mapInfo = rc.senseMapInfo(l28);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l28) || (rc.sensePassability(l28) && !rc.canSenseRobotAtLocation(l28) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l28), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p28 = mapInfo.getCooldownMultiplier(team);
                    s28 = Math.sqrt(l28.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p28 = 1.5;
            }
            
            dist = v37 + p28 + s37 * 0.000001;
            if (v28 > dist) {
                v28 = dist;
                d28 = d37;
            }
            dist = v18 + p28 + s18 * 0.000001;
            if (v28 > dist) {
                v28 = dist;
                d28 = d18;
            }
            dist = v27 + p28 + s27 * 0.000001;
            if (v28 > dist) {
                v28 = dist;
                d28 = d27;
            }
            dist = v36 + p28 + s36 * 0.000001;
            if (v28 > dist) {
                v28 = dist;
                d28 = d36;
            }
        }

        if (rc.onTheMap(l46)) {
            if (rc.canSenseLocation(l46)) {
                MapInfo mapInfo = rc.senseMapInfo(l46);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l46) || (rc.sensePassability(l46) && !rc.canSenseRobotAtLocation(l46) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l46), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p46 = mapInfo.getCooldownMultiplier(team);
                    s46 = Math.sqrt(l46.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p46 = 1.5;
            }
            
            dist = v37 + p46 + s37 * 0.000001;
            if (v46 > dist) {
                v46 = dist;
                d46 = d37;
            }
            dist = v36 + p46 + s36 * 0.000001;
            if (v46 > dist) {
                v46 = dist;
                d46 = d36;
            }
            dist = v45 + p46 + s45 * 0.000001;
            if (v46 > dist) {
                v46 = dist;
                d46 = d45;
            }
            dist = v54 + p46 + s54 * 0.000001;
            if (v46 > dist) {
                v46 = dist;
                d46 = d54;
            }
        }

        if (rc.onTheMap(l61)) {
            if (rc.canSenseLocation(l61)) {
                MapInfo mapInfo = rc.senseMapInfo(l61);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l61) || (rc.sensePassability(l61) && !rc.canSenseRobotAtLocation(l61) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l61), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p61 = mapInfo.getCooldownMultiplier(team);
                    s61 = Math.sqrt(l61.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p61 = 1.5;
            }
            
            dist = v54 + p61 + s54 * 0.000001;
            if (v61 > dist) {
                v61 = dist;
                d61 = d54;
            }
            dist = v53 + p61 + s53 * 0.000001;
            if (v61 > dist) {
                v61 = dist;
                d61 = d53;
            }
            dist = v52 + p61 + s52 * 0.000001;
            if (v61 > dist) {
                v61 = dist;
                d61 = d52;
            }
            dist = v60 + p61 + s60 * 0.000001;
            if (v61 > dist) {
                v61 = dist;
                d61 = d60;
            }
        }

        if (rc.onTheMap(l62)) {
            if (rc.canSenseLocation(l62)) {
                MapInfo mapInfo = rc.senseMapInfo(l62);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l62) || (rc.sensePassability(l62) && !rc.canSenseRobotAtLocation(l62) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l62), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p62 = mapInfo.getCooldownMultiplier(team);
                    s62 = Math.sqrt(l62.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p62 = 1.5;
            }
            
            dist = v55 + p62 + s55 * 0.000001;
            if (v62 > dist) {
                v62 = dist;
                d62 = d55;
            }
            dist = v54 + p62 + s54 * 0.000001;
            if (v62 > dist) {
                v62 = dist;
                d62 = d54;
            }
            dist = v53 + p62 + s53 * 0.000001;
            if (v62 > dist) {
                v62 = dist;
                d62 = d53;
            }
            dist = v61 + p62 + s61 * 0.000001;
            if (v62 > dist) {
                v62 = dist;
                d62 = d61;
            }
        }

        if (rc.onTheMap(l58)) {
            if (rc.canSenseLocation(l58)) {
                MapInfo mapInfo = rc.senseMapInfo(l58);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l58) || (rc.sensePassability(l58) && !rc.canSenseRobotAtLocation(l58) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l58), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p58 = mapInfo.getCooldownMultiplier(team);
                    s58 = Math.sqrt(l58.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p58 = 1.5;
            }
            
            dist = v59 + p58 + s59 * 0.000001;
            if (v58 > dist) {
                v58 = dist;
                d58 = d59;
            }
            dist = v51 + p58 + s51 * 0.000001;
            if (v58 > dist) {
                v58 = dist;
                d58 = d51;
            }
            dist = v50 + p58 + s50 * 0.000001;
            if (v58 > dist) {
                v58 = dist;
                d58 = d50;
            }
        }

        if (rc.onTheMap(l19)) {
            if (rc.canSenseLocation(l19)) {
                MapInfo mapInfo = rc.senseMapInfo(l19);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l19) || (rc.sensePassability(l19) && !rc.canSenseRobotAtLocation(l19) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l19), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p19 = mapInfo.getCooldownMultiplier(team);
                    s19 = Math.sqrt(l19.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p19 = 1.5;
            }
            
            dist = v28 + p19 + s28 * 0.000001;
            if (v19 > dist) {
                v19 = dist;
                d19 = d28;
            }
            dist = v18 + p19 + s18 * 0.000001;
            if (v19 > dist) {
                v19 = dist;
                d19 = d18;
            }
            dist = v27 + p19 + s27 * 0.000001;
            if (v19 > dist) {
                v19 = dist;
                d19 = d27;
            }
        }

        if (rc.onTheMap(l55)) {
            if (rc.canSenseLocation(l55)) {
                MapInfo mapInfo = rc.senseMapInfo(l55);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l55) || (rc.sensePassability(l55) && !rc.canSenseRobotAtLocation(l55) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l55), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p55 = mapInfo.getCooldownMultiplier(team);
                    s55 = Math.sqrt(l55.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p55 = 1.5;
            }
            
            dist = v46 + p55 + s46 * 0.000001;
            if (v55 > dist) {
                v55 = dist;
                d55 = d46;
            }
            dist = v45 + p55 + s45 * 0.000001;
            if (v55 > dist) {
                v55 = dist;
                d55 = d45;
            }
            dist = v54 + p55 + s54 * 0.000001;
            if (v55 > dist) {
                v55 = dist;
                d55 = d54;
            }
            dist = v62 + p55 + s62 * 0.000001;
            if (v55 > dist) {
                v55 = dist;
                d55 = d62;
            }
        }

        if (rc.onTheMap(l63)) {
            if (rc.canSenseLocation(l63)) {
                MapInfo mapInfo = rc.senseMapInfo(l63);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l63) || (rc.sensePassability(l63) && !rc.canSenseRobotAtLocation(l63) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l63), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p63 = mapInfo.getCooldownMultiplier(team);
                    s63 = Math.sqrt(l63.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p63 = 1.5;
            }
            
            dist = v55 + p63 + s55 * 0.000001;
            if (v63 > dist) {
                v63 = dist;
                d63 = d55;
            }
            dist = v54 + p63 + s54 * 0.000001;
            if (v63 > dist) {
                v63 = dist;
                d63 = d54;
            }
            dist = v62 + p63 + s62 * 0.000001;
            if (v63 > dist) {
                v63 = dist;
                d63 = d62;
            }
        }

        if (rc.onTheMap(l57)) {
            if (rc.canSenseLocation(l57)) {
                MapInfo mapInfo = rc.senseMapInfo(l57);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l57) || (rc.sensePassability(l57) && !rc.canSenseRobotAtLocation(l57) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l57), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p57 = mapInfo.getCooldownMultiplier(team);
                    s57 = Math.sqrt(l57.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p57 = 1.5;
            }
            
            dist = v58 + p57 + s58 * 0.000001;
            if (v57 > dist) {
                v57 = dist;
                d57 = d58;
            }
            dist = v50 + p57 + s50 * 0.000001;
            if (v57 > dist) {
                v57 = dist;
                d57 = d50;
            }
        }

        if (rc.onTheMap(l11)) {
            if (rc.canSenseLocation(l11)) {
                MapInfo mapInfo = rc.senseMapInfo(l11);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l11) || (rc.sensePassability(l11) && !rc.canSenseRobotAtLocation(l11) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l11), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p11 = mapInfo.getCooldownMultiplier(team);
                    s11 = Math.sqrt(l11.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p11 = 1.5;
            }
            
            dist = v19 + p11 + s19 * 0.000001;
            if (v11 > dist) {
                v11 = dist;
                d11 = d19;
            }
            dist = v18 + p11 + s18 * 0.000001;
            if (v11 > dist) {
                v11 = dist;
                d11 = d18;
            }
        }

        if (rc.onTheMap(l66)) {
            if (rc.canSenseLocation(l66)) {
                MapInfo mapInfo = rc.senseMapInfo(l66);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l66) || (rc.sensePassability(l66) && !rc.canSenseRobotAtLocation(l66) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l66), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p66 = mapInfo.getCooldownMultiplier(team);
                    s66 = Math.sqrt(l66.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p66 = 1.5;
            }
            
            dist = v61 + p66 + s61 * 0.000001;
            if (v66 > dist) {
                v66 = dist;
                d66 = d61;
            }
            dist = v60 + p66 + s60 * 0.000001;
            if (v66 > dist) {
                v66 = dist;
                d66 = d60;
            }
            dist = v59 + p66 + s59 * 0.000001;
            if (v66 > dist) {
                v66 = dist;
                d66 = d59;
            }
        }

        if (rc.onTheMap(l38)) {
            if (rc.canSenseLocation(l38)) {
                MapInfo mapInfo = rc.senseMapInfo(l38);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l38) || (rc.sensePassability(l38) && !rc.canSenseRobotAtLocation(l38) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l38), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p38 = mapInfo.getCooldownMultiplier(team);
                    s38 = Math.sqrt(l38.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p38 = 1.5;
            }
            
            dist = v28 + p38 + s28 * 0.000001;
            if (v38 > dist) {
                v38 = dist;
                d38 = d28;
            }
            dist = v37 + p38 + s37 * 0.000001;
            if (v38 > dist) {
                v38 = dist;
                d38 = d37;
            }
            dist = v46 + p38 + s46 * 0.000001;
            if (v38 > dist) {
                v38 = dist;
                d38 = d46;
            }
        }

        if (rc.onTheMap(l29)) {
            if (rc.canSenseLocation(l29)) {
                MapInfo mapInfo = rc.senseMapInfo(l29);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l29) || (rc.sensePassability(l29) && !rc.canSenseRobotAtLocation(l29) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l29), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p29 = mapInfo.getCooldownMultiplier(team);
                    s29 = Math.sqrt(l29.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p29 = 1.5;
            }
            
            dist = v38 + p29 + s38 * 0.000001;
            if (v29 > dist) {
                v29 = dist;
                d29 = d38;
            }
            dist = v19 + p29 + s19 * 0.000001;
            if (v29 > dist) {
                v29 = dist;
                d29 = d19;
            }
            dist = v28 + p29 + s28 * 0.000001;
            if (v29 > dist) {
                v29 = dist;
                d29 = d28;
            }
            dist = v37 + p29 + s37 * 0.000001;
            if (v29 > dist) {
                v29 = dist;
                d29 = d37;
            }
        }

        if (rc.onTheMap(l67)) {
            if (rc.canSenseLocation(l67)) {
                MapInfo mapInfo = rc.senseMapInfo(l67);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l67) || (rc.sensePassability(l67) && !rc.canSenseRobotAtLocation(l67) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l67), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p67 = mapInfo.getCooldownMultiplier(team);
                    s67 = Math.sqrt(l67.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p67 = 1.5;
            }
            
            dist = v62 + p67 + s62 * 0.000001;
            if (v67 > dist) {
                v67 = dist;
                d67 = d62;
            }
            dist = v61 + p67 + s61 * 0.000001;
            if (v67 > dist) {
                v67 = dist;
                d67 = d61;
            }
            dist = v60 + p67 + s60 * 0.000001;
            if (v67 > dist) {
                v67 = dist;
                d67 = d60;
            }
            dist = v66 + p67 + s66 * 0.000001;
            if (v67 > dist) {
                v67 = dist;
                d67 = d66;
            }
        }

        if (rc.onTheMap(l47)) {
            if (rc.canSenseLocation(l47)) {
                MapInfo mapInfo = rc.senseMapInfo(l47);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l47) || (rc.sensePassability(l47) && !rc.canSenseRobotAtLocation(l47) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l47), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p47 = mapInfo.getCooldownMultiplier(team);
                    s47 = Math.sqrt(l47.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p47 = 1.5;
            }
            
            dist = v38 + p47 + s38 * 0.000001;
            if (v47 > dist) {
                v47 = dist;
                d47 = d38;
            }
            dist = v37 + p47 + s37 * 0.000001;
            if (v47 > dist) {
                v47 = dist;
                d47 = d37;
            }
            dist = v46 + p47 + s46 * 0.000001;
            if (v47 > dist) {
                v47 = dist;
                d47 = d46;
            }
            dist = v55 + p47 + s55 * 0.000001;
            if (v47 > dist) {
                v47 = dist;
                d47 = d55;
            }
        }

        if (rc.onTheMap(l65)) {
            if (rc.canSenseLocation(l65)) {
                MapInfo mapInfo = rc.senseMapInfo(l65);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l65) || (rc.sensePassability(l65) && !rc.canSenseRobotAtLocation(l65) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l65), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p65 = mapInfo.getCooldownMultiplier(team);
                    s65 = Math.sqrt(l65.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p65 = 1.5;
            }
            
            dist = v66 + p65 + s66 * 0.000001;
            if (v65 > dist) {
                v65 = dist;
                d65 = d66;
            }
            dist = v60 + p65 + s60 * 0.000001;
            if (v65 > dist) {
                v65 = dist;
                d65 = d60;
            }
            dist = v59 + p65 + s59 * 0.000001;
            if (v65 > dist) {
                v65 = dist;
                d65 = d59;
            }
            dist = v58 + p65 + s58 * 0.000001;
            if (v65 > dist) {
                v65 = dist;
                d65 = d58;
            }
        }

        if (rc.onTheMap(l68)) {
            if (rc.canSenseLocation(l68)) {
                MapInfo mapInfo = rc.senseMapInfo(l68);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l68) || (rc.sensePassability(l68) && !rc.canSenseRobotAtLocation(l68) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l68), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p68 = mapInfo.getCooldownMultiplier(team);
                    s68 = Math.sqrt(l68.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p68 = 1.5;
            }
            
            dist = v63 + p68 + s63 * 0.000001;
            if (v68 > dist) {
                v68 = dist;
                d68 = d63;
            }
            dist = v62 + p68 + s62 * 0.000001;
            if (v68 > dist) {
                v68 = dist;
                d68 = d62;
            }
            dist = v61 + p68 + s61 * 0.000001;
            if (v68 > dist) {
                v68 = dist;
                d68 = d61;
            }
            dist = v67 + p68 + s67 * 0.000001;
            if (v68 > dist) {
                v68 = dist;
                d68 = d67;
            }
        }

        if (rc.onTheMap(l64)) {
            if (rc.canSenseLocation(l64)) {
                MapInfo mapInfo = rc.senseMapInfo(l64);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l64) || (rc.sensePassability(l64) && !rc.canSenseRobotAtLocation(l64) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l64), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p64 = mapInfo.getCooldownMultiplier(team);
                    s64 = Math.sqrt(l64.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p64 = 1.5;
            }
            
            dist = v65 + p64 + s65 * 0.000001;
            if (v64 > dist) {
                v64 = dist;
                d64 = d65;
            }
            dist = v59 + p64 + s59 * 0.000001;
            if (v64 > dist) {
                v64 = dist;
                d64 = d59;
            }
            dist = v58 + p64 + s58 * 0.000001;
            if (v64 > dist) {
                v64 = dist;
                d64 = d58;
            }
            dist = v57 + p64 + s57 * 0.000001;
            if (v64 > dist) {
                v64 = dist;
                d64 = d57;
            }
        }

        if (rc.onTheMap(l56)) {
            if (rc.canSenseLocation(l56)) {
                MapInfo mapInfo = rc.senseMapInfo(l56);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l56) || (rc.sensePassability(l56) && !rc.canSenseRobotAtLocation(l56) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l56), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p56 = mapInfo.getCooldownMultiplier(team);
                    s56 = Math.sqrt(l56.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p56 = 1.5;
            }
            
            dist = v47 + p56 + s47 * 0.000001;
            if (v56 > dist) {
                v56 = dist;
                d56 = d47;
            }
            dist = v46 + p56 + s46 * 0.000001;
            if (v56 > dist) {
                v56 = dist;
                d56 = d46;
            }
            dist = v55 + p56 + s55 * 0.000001;
            if (v56 > dist) {
                v56 = dist;
                d56 = d55;
            }
            dist = v63 + p56 + s63 * 0.000001;
            if (v56 > dist) {
                v56 = dist;
                d56 = d63;
            }
        }

        if (rc.onTheMap(l20)) {
            if (rc.canSenseLocation(l20)) {
                MapInfo mapInfo = rc.senseMapInfo(l20);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l20) || (rc.sensePassability(l20) && !rc.canSenseRobotAtLocation(l20) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l20), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p20 = mapInfo.getCooldownMultiplier(team);
                    s20 = Math.sqrt(l20.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p20 = 1.5;
            }
            
            dist = v29 + p20 + s29 * 0.000001;
            if (v20 > dist) {
                v20 = dist;
                d20 = d29;
            }
            dist = v11 + p20 + s11 * 0.000001;
            if (v20 > dist) {
                v20 = dist;
                d20 = d11;
            }
            dist = v19 + p20 + s19 * 0.000001;
            if (v20 > dist) {
                v20 = dist;
                d20 = d19;
            }
            dist = v28 + p20 + s28 * 0.000001;
            if (v20 > dist) {
                v20 = dist;
                d20 = d28;
            }
        }
    
        int dx = targetLocation.x - l34.x;
        int dy = targetLocation.y - l34.y;

        switch(dx) {
            case -4:
                switch(dy) {
                } break;

            case -3:
                switch(dy) {
                    case 3:
                        if (v11 < 1000000) {
                            bug.reset();
                            return d11;
                        } break;
                } break;

            case -2:
                switch(dy) {
                    case 2:
                        if (v18 < 1000000) {
                            bug.reset();
                            return d18;
                        } break;
                    case 3:
                        if (v19 < 1000000) {
                            bug.reset();
                            return d19;
                        } break;
                    case 4:
                        if (v20 < 1000000) {
                            bug.reset();
                            return d20;
                        } break;
                } break;

            case -1:
                switch(dy) {
                    case 1:
                        if (v26 < 1000000) {
                            bug.reset();
                            return d26;
                        } break;
                    case 2:
                        if (v27 < 1000000) {
                            bug.reset();
                            return d27;
                        } break;
                    case 3:
                        if (v28 < 1000000) {
                            bug.reset();
                            return d28;
                        } break;
                    case 4:
                        if (v29 < 1000000) {
                            bug.reset();
                            return d29;
                        } break;
                } break;

            case 0:
                switch(dy) {
                    case 1:
                        if (v35 < 1000000) {
                            bug.reset();
                            return d35;
                        } break;
                    case 2:
                        if (v36 < 1000000) {
                            bug.reset();
                            return d36;
                        } break;
                    case 3:
                        if (v37 < 1000000) {
                            bug.reset();
                            return d37;
                        } break;
                    case 4:
                        if (v38 < 1000000) {
                            bug.reset();
                            return d38;
                        } break;
                } break;

            case 1:
                switch(dy) {
                    case -1:
                        if (v42 < 1000000) {
                            bug.reset();
                            return d42;
                        } break;
                    case 0:
                        if (v43 < 1000000) {
                            bug.reset();
                            return d43;
                        } break;
                    case 1:
                        if (v44 < 1000000) {
                            bug.reset();
                            return d44;
                        } break;
                    case 2:
                        if (v45 < 1000000) {
                            bug.reset();
                            return d45;
                        } break;
                    case 3:
                        if (v46 < 1000000) {
                            bug.reset();
                            return d46;
                        } break;
                    case 4:
                        if (v47 < 1000000) {
                            bug.reset();
                            return d47;
                        } break;
                } break;

            case 2:
                switch(dy) {
                    case -2:
                        if (v50 < 1000000) {
                            bug.reset();
                            return d50;
                        } break;
                    case -1:
                        if (v51 < 1000000) {
                            bug.reset();
                            return d51;
                        } break;
                    case 0:
                        if (v52 < 1000000) {
                            bug.reset();
                            return d52;
                        } break;
                    case 1:
                        if (v53 < 1000000) {
                            bug.reset();
                            return d53;
                        } break;
                    case 2:
                        if (v54 < 1000000) {
                            bug.reset();
                            return d54;
                        } break;
                    case 3:
                        if (v55 < 1000000) {
                            bug.reset();
                            return d55;
                        } break;
                    case 4:
                        if (v56 < 1000000) {
                            bug.reset();
                            return d56;
                        } break;
                } break;

            case 3:
                switch(dy) {
                    case -3:
                        if (v57 < 1000000) {
                            bug.reset();
                            return d57;
                        } break;
                    case -2:
                        if (v58 < 1000000) {
                            bug.reset();
                            return d58;
                        } break;
                    case -1:
                        if (v59 < 1000000) {
                            bug.reset();
                            return d59;
                        } break;
                    case 0:
                        if (v60 < 1000000) {
                            bug.reset();
                            return d60;
                        } break;
                    case 1:
                        if (v61 < 1000000) {
                            bug.reset();
                            return d61;
                        } break;
                    case 2:
                        if (v62 < 1000000) {
                            bug.reset();
                            return d62;
                        } break;
                    case 3:
                        if (v63 < 1000000) {
                            bug.reset();
                            return d63;
                        } break;
                } break;

            case 4:
                switch(dy) {
                    case -2:
                        if (v64 < 1000000) {
                            bug.reset();
                            return d64;
                        } break;
                    case -1:
                        if (v65 < 1000000) {
                            bug.reset();
                            return d65;
                        } break;
                    case 0:
                        if (v66 < 1000000) {
                            bug.reset();
                            return d66;
                        } break;
                    case 1:
                        if (v67 < 1000000) {
                            bug.reset();
                            return d67;
                        } break;
                    case 2:
                        if (v68 < 1000000) {
                            bug.reset();
                            return d68;
                        } break;
                } break;

        }
    
        Direction ans = Direction.CENTER;

        double dist11 = v11 + s11;
        if (dist11 < localBest) {
            localBest = dist11;
            ans = d11;
        }

        double dist18 = v18 + s18;
        if (dist18 < localBest) {
            localBest = dist18;
            ans = d18;
        }

        double dist19 = v19 + s19;
        if (dist19 < localBest) {
            localBest = dist19;
            ans = d19;
        }

        double dist20 = v20 + s20;
        if (dist20 < localBest) {
            localBest = dist20;
            ans = d20;
        }

        double dist26 = v26 + s26;
        if (dist26 < localBest) {
            localBest = dist26;
            ans = d26;
        }

        double dist27 = v27 + s27;
        if (dist27 < localBest) {
            localBest = dist27;
            ans = d27;
        }

        double dist28 = v28 + s28;
        if (dist28 < localBest) {
            localBest = dist28;
            ans = d28;
        }

        double dist29 = v29 + s29;
        if (dist29 < localBest) {
            localBest = dist29;
            ans = d29;
        }

        double dist35 = v35 + s35;
        if (dist35 < localBest) {
            localBest = dist35;
            ans = d35;
        }

        double dist36 = v36 + s36;
        if (dist36 < localBest) {
            localBest = dist36;
            ans = d36;
        }

        double dist37 = v37 + s37;
        if (dist37 < localBest) {
            localBest = dist37;
            ans = d37;
        }

        double dist38 = v38 + s38;
        if (dist38 < localBest) {
            localBest = dist38;
            ans = d38;
        }

        double dist42 = v42 + s42;
        if (dist42 < localBest) {
            localBest = dist42;
            ans = d42;
        }

        double dist43 = v43 + s43;
        if (dist43 < localBest) {
            localBest = dist43;
            ans = d43;
        }

        double dist44 = v44 + s44;
        if (dist44 < localBest) {
            localBest = dist44;
            ans = d44;
        }

        double dist45 = v45 + s45;
        if (dist45 < localBest) {
            localBest = dist45;
            ans = d45;
        }

        double dist46 = v46 + s46;
        if (dist46 < localBest) {
            localBest = dist46;
            ans = d46;
        }

        double dist47 = v47 + s47;
        if (dist47 < localBest) {
            localBest = dist47;
            ans = d47;
        }

        double dist50 = v50 + s50;
        if (dist50 < localBest) {
            localBest = dist50;
            ans = d50;
        }

        double dist51 = v51 + s51;
        if (dist51 < localBest) {
            localBest = dist51;
            ans = d51;
        }

        double dist52 = v52 + s52;
        if (dist52 < localBest) {
            localBest = dist52;
            ans = d52;
        }

        double dist53 = v53 + s53;
        if (dist53 < localBest) {
            localBest = dist53;
            ans = d53;
        }

        double dist54 = v54 + s54;
        if (dist54 < localBest) {
            localBest = dist54;
            ans = d54;
        }

        double dist55 = v55 + s55;
        if (dist55 < localBest) {
            localBest = dist55;
            ans = d55;
        }

        double dist56 = v56 + s56;
        if (dist56 < localBest) {
            localBest = dist56;
            ans = d56;
        }

        double dist57 = v57 + s57;
        if (dist57 < localBest) {
            localBest = dist57;
            ans = d57;
        }

        double dist58 = v58 + s58;
        if (dist58 < localBest) {
            localBest = dist58;
            ans = d58;
        }

        double dist59 = v59 + s59;
        if (dist59 < localBest) {
            localBest = dist59;
            ans = d59;
        }

        double dist60 = v60 + s60;
        if (dist60 < localBest) {
            localBest = dist60;
            ans = d60;
        }

        double dist61 = v61 + s61;
        if (dist61 < localBest) {
            localBest = dist61;
            ans = d61;
        }

        double dist62 = v62 + s62;
        if (dist62 < localBest) {
            localBest = dist62;
            ans = d62;
        }

        double dist63 = v63 + s63;
        if (dist63 < localBest) {
            localBest = dist63;
            ans = d63;
        }

        double dist64 = v64 + s64;
        if (dist64 < localBest) {
            localBest = dist64;
            ans = d64;
        }

        double dist65 = v65 + s65;
        if (dist65 < localBest) {
            localBest = dist65;
            ans = d65;
        }

        double dist66 = v66 + s66;
        if (dist66 < localBest) {
            localBest = dist66;
            ans = d66;
        }

        double dist67 = v67 + s67;
        if (dist67 < localBest) {
            localBest = dist67;
            ans = d67;
        }

        double dist68 = v68 + s68;
        if (dist68 < localBest) {
            localBest = dist68;
            ans = d68;
        }

        if (localBest < globalBest) {
            globalBest = localBest;
            bug.reset();
            return ans;
        }

        consecutiveBugNavRoundCount += 1;

        if (consecutiveBugNavRoundCount > 40) {
            globalBest = 1000000;
            consecutiveBugNavRoundCount = 0;
        }

        bug.move(targetLocation, lastDirection);
        return null;
    }

    private Direction getBestDirection2() throws GameActionException {
        double localBest = 1000000.0;
        double dist = 0.0;
        l34 = currentLocation;
        v34 = 0;
        d43 = null;
        l43 = l34.add(Direction.EAST);
        v43 = 1000000;
        p43 = 1000000;
        s43 = Math.sqrt(l43.distanceSquaredTo(targetLocation));
        d44 = null;
        l44 = l34.add(Direction.NORTHEAST);
        v44 = 1000000;
        p44 = 1000000;
        s44 = Math.sqrt(l44.distanceSquaredTo(targetLocation));
        d35 = null;
        l35 = l34.add(Direction.NORTH);
        v35 = 1000000;
        p35 = 1000000;
        s35 = Math.sqrt(l35.distanceSquaredTo(targetLocation));
        d33 = null;
        l33 = l34.add(Direction.SOUTH);
        v33 = 1000000;
        p33 = 1000000;
        s33 = Math.sqrt(l33.distanceSquaredTo(targetLocation));
        d42 = null;
        l42 = l34.add(Direction.SOUTHEAST);
        v42 = 1000000;
        p42 = 1000000;
        s42 = Math.sqrt(l42.distanceSquaredTo(targetLocation));
        d32 = null;
        l32 = l33.add(Direction.SOUTH);
        v32 = 1000000;
        p32 = 1000000;
        s32 = Math.sqrt(l32.distanceSquaredTo(targetLocation));
        d41 = null;
        l41 = l33.add(Direction.SOUTHEAST);
        v41 = 1000000;
        p41 = 1000000;
        s41 = Math.sqrt(l41.distanceSquaredTo(targetLocation));
        d45 = null;
        l45 = l35.add(Direction.NORTHEAST);
        v45 = 1000000;
        p45 = 1000000;
        s45 = Math.sqrt(l45.distanceSquaredTo(targetLocation));
        d36 = null;
        l36 = l35.add(Direction.NORTH);
        v36 = 1000000;
        p36 = 1000000;
        s36 = Math.sqrt(l36.distanceSquaredTo(targetLocation));
        d52 = null;
        l52 = l43.add(Direction.EAST);
        v52 = 1000000;
        p52 = 1000000;
        s52 = Math.sqrt(l52.distanceSquaredTo(targetLocation));
        d53 = null;
        l53 = l43.add(Direction.NORTHEAST);
        v53 = 1000000;
        p53 = 1000000;
        s53 = Math.sqrt(l53.distanceSquaredTo(targetLocation));
        d51 = null;
        l51 = l43.add(Direction.SOUTHEAST);
        v51 = 1000000;
        p51 = 1000000;
        s51 = Math.sqrt(l51.distanceSquaredTo(targetLocation));
        d50 = null;
        l50 = l42.add(Direction.SOUTHEAST);
        v50 = 1000000;
        p50 = 1000000;
        s50 = Math.sqrt(l50.distanceSquaredTo(targetLocation));
        d54 = null;
        l54 = l44.add(Direction.NORTHEAST);
        v54 = 1000000;
        p54 = 1000000;
        s54 = Math.sqrt(l54.distanceSquaredTo(targetLocation));
        d31 = null;
        l31 = l32.add(Direction.SOUTH);
        v31 = 1000000;
        p31 = 1000000;
        s31 = Math.sqrt(l31.distanceSquaredTo(targetLocation));
        d40 = null;
        l40 = l32.add(Direction.SOUTHEAST);
        v40 = 1000000;
        p40 = 1000000;
        s40 = Math.sqrt(l40.distanceSquaredTo(targetLocation));
        d60 = null;
        l60 = l52.add(Direction.EAST);
        v60 = 1000000;
        p60 = 1000000;
        s60 = Math.sqrt(l60.distanceSquaredTo(targetLocation));
        d61 = null;
        l61 = l52.add(Direction.NORTHEAST);
        v61 = 1000000;
        p61 = 1000000;
        s61 = Math.sqrt(l61.distanceSquaredTo(targetLocation));
        d59 = null;
        l59 = l52.add(Direction.SOUTHEAST);
        v59 = 1000000;
        p59 = 1000000;
        s59 = Math.sqrt(l59.distanceSquaredTo(targetLocation));
        d46 = null;
        l46 = l36.add(Direction.NORTHEAST);
        v46 = 1000000;
        p46 = 1000000;
        s46 = Math.sqrt(l46.distanceSquaredTo(targetLocation));
        d37 = null;
        l37 = l36.add(Direction.NORTH);
        v37 = 1000000;
        p37 = 1000000;
        s37 = Math.sqrt(l37.distanceSquaredTo(targetLocation));
        d58 = null;
        l58 = l51.add(Direction.SOUTHEAST);
        v58 = 1000000;
        p58 = 1000000;
        s58 = Math.sqrt(l58.distanceSquaredTo(targetLocation));
        d55 = null;
        l55 = l45.add(Direction.NORTHEAST);
        v55 = 1000000;
        p55 = 1000000;
        s55 = Math.sqrt(l55.distanceSquaredTo(targetLocation));
        d62 = null;
        l62 = l53.add(Direction.NORTHEAST);
        v62 = 1000000;
        p62 = 1000000;
        s62 = Math.sqrt(l62.distanceSquaredTo(targetLocation));
        d49 = null;
        l49 = l41.add(Direction.SOUTHEAST);
        v49 = 1000000;
        p49 = 1000000;
        s49 = Math.sqrt(l49.distanceSquaredTo(targetLocation));
        d57 = null;
        l57 = l50.add(Direction.SOUTHEAST);
        v57 = 1000000;
        p57 = 1000000;
        s57 = Math.sqrt(l57.distanceSquaredTo(targetLocation));
        d63 = null;
        l63 = l54.add(Direction.NORTHEAST);
        v63 = 1000000;
        p63 = 1000000;
        s63 = Math.sqrt(l63.distanceSquaredTo(targetLocation));
        d30 = null;
        l30 = l31.add(Direction.SOUTH);
        v30 = 1000000;
        p30 = 1000000;
        s30 = Math.sqrt(l30.distanceSquaredTo(targetLocation));
        d39 = null;
        l39 = l31.add(Direction.SOUTHEAST);
        v39 = 1000000;
        p39 = 1000000;
        s39 = Math.sqrt(l39.distanceSquaredTo(targetLocation));
        d66 = null;
        l66 = l60.add(Direction.EAST);
        v66 = 1000000;
        p66 = 1000000;
        s66 = Math.sqrt(l66.distanceSquaredTo(targetLocation));
        d67 = null;
        l67 = l60.add(Direction.NORTHEAST);
        v67 = 1000000;
        p67 = 1000000;
        s67 = Math.sqrt(l67.distanceSquaredTo(targetLocation));
        d65 = null;
        l65 = l60.add(Direction.SOUTHEAST);
        v65 = 1000000;
        p65 = 1000000;
        s65 = Math.sqrt(l65.distanceSquaredTo(targetLocation));
        d47 = null;
        l47 = l37.add(Direction.NORTHEAST);
        v47 = 1000000;
        p47 = 1000000;
        s47 = Math.sqrt(l47.distanceSquaredTo(targetLocation));
        d38 = null;
        l38 = l37.add(Direction.NORTH);
        v38 = 1000000;
        p38 = 1000000;
        s38 = Math.sqrt(l38.distanceSquaredTo(targetLocation));
        d48 = null;
        l48 = l40.add(Direction.SOUTHEAST);
        v48 = 1000000;
        p48 = 1000000;
        s48 = Math.sqrt(l48.distanceSquaredTo(targetLocation));
        d56 = null;
        l56 = l46.add(Direction.NORTHEAST);
        v56 = 1000000;
        p56 = 1000000;
        s56 = Math.sqrt(l56.distanceSquaredTo(targetLocation));
        d68 = null;
        l68 = l61.add(Direction.NORTHEAST);
        v68 = 1000000;
        p68 = 1000000;
        s68 = Math.sqrt(l68.distanceSquaredTo(targetLocation));
        d64 = null;
        l64 = l59.add(Direction.SOUTHEAST);
        v64 = 1000000;
        p64 = 1000000;
        s64 = Math.sqrt(l64.distanceSquaredTo(targetLocation));
    

        if (rc.onTheMap(l33) && rc.canMove(Direction.SOUTH)) {
            if (rc.canSenseLocation(l33)) {
                MapInfo mapInfo = rc.senseMapInfo(l33);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l33) || (rc.sensePassability(l33) && !rc.canSenseRobotAtLocation(l33) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l33), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p33 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p33 = 1.5;
            }
            
            dist = v43 + p33 + s43 * 0.000001;
            if (v33 > dist) {
                v33 = dist;
                d33 = d43;
            }
            dist = v34 + p33 + s34 * 0.000001;
            if (v33 > dist) {
                v33 = dist;
                d33 = Direction.SOUTH;
            }
        }

        if (rc.onTheMap(l35) && rc.canMove(Direction.NORTH)) {
            if (rc.canSenseLocation(l35)) {
                MapInfo mapInfo = rc.senseMapInfo(l35);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l35) || (rc.sensePassability(l35) && !rc.canSenseRobotAtLocation(l35) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l35), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p35 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p35 = 1.5;
            }
            
            dist = v34 + p35 + s34 * 0.000001;
            if (v35 > dist) {
                v35 = dist;
                d35 = Direction.NORTH;
            }
            dist = v43 + p35 + s43 * 0.000001;
            if (v35 > dist) {
                v35 = dist;
                d35 = d43;
            }
        }

        if (rc.onTheMap(l43) && rc.canMove(Direction.EAST)) {
            if (rc.canSenseLocation(l43)) {
                MapInfo mapInfo = rc.senseMapInfo(l43);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l43) || (rc.sensePassability(l43) && !rc.canSenseRobotAtLocation(l43) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l43), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p43 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p43 = 1.5;
            }
            
            dist = v35 + p43 + s35 * 0.000001;
            if (v43 > dist) {
                v43 = dist;
                d43 = d35;
            }
            dist = v34 + p43 + s34 * 0.000001;
            if (v43 > dist) {
                v43 = dist;
                d43 = Direction.EAST;
            }
            dist = v33 + p43 + s33 * 0.000001;
            if (v43 > dist) {
                v43 = dist;
                d43 = d33;
            }
        }

        if (rc.onTheMap(l42) && rc.canMove(Direction.SOUTHEAST)) {
            if (rc.canSenseLocation(l42)) {
                MapInfo mapInfo = rc.senseMapInfo(l42);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l42) || (rc.sensePassability(l42) && !rc.canSenseRobotAtLocation(l42) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l42), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p42 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p42 = 1.5;
            }
            
            dist = v43 + p42 + s43 * 0.000001;
            if (v42 > dist) {
                v42 = dist;
                d42 = d43;
            }
            dist = v34 + p42 + s34 * 0.000001;
            if (v42 > dist) {
                v42 = dist;
                d42 = Direction.SOUTHEAST;
            }
            dist = v33 + p42 + s33 * 0.000001;
            if (v42 > dist) {
                v42 = dist;
                d42 = d33;
            }
        }

        if (rc.onTheMap(l44) && rc.canMove(Direction.NORTHEAST)) {
            if (rc.canSenseLocation(l44)) {
                MapInfo mapInfo = rc.senseMapInfo(l44);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l44) || (rc.sensePassability(l44) && !rc.canSenseRobotAtLocation(l44) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l44), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p44 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p44 = 1.5;
            }
            
            dist = v35 + p44 + s35 * 0.000001;
            if (v44 > dist) {
                v44 = dist;
                d44 = d35;
            }
            dist = v34 + p44 + s34 * 0.000001;
            if (v44 > dist) {
                v44 = dist;
                d44 = Direction.NORTHEAST;
            }
            dist = v43 + p44 + s43 * 0.000001;
            if (v44 > dist) {
                v44 = dist;
                d44 = d43;
            }
        }

        if (rc.onTheMap(l32)) {
            if (rc.canSenseLocation(l32)) {
                MapInfo mapInfo = rc.senseMapInfo(l32);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l32) || (rc.sensePassability(l32) && !rc.canSenseRobotAtLocation(l32) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l32), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p32 = mapInfo.getCooldownMultiplier(team);
                    s32 = Math.sqrt(l32.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p32 = 1.5;
            }
            
            dist = v42 + p32 + s42 * 0.000001;
            if (v32 > dist) {
                v32 = dist;
                d32 = d42;
            }
            dist = v33 + p32 + s33 * 0.000001;
            if (v32 > dist) {
                v32 = dist;
                d32 = d33;
            }
        }

        if (rc.onTheMap(l52)) {
            if (rc.canSenseLocation(l52)) {
                MapInfo mapInfo = rc.senseMapInfo(l52);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l52) || (rc.sensePassability(l52) && !rc.canSenseRobotAtLocation(l52) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l52), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p52 = mapInfo.getCooldownMultiplier(team);
                    s52 = Math.sqrt(l52.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p52 = 1.5;
            }
            
            dist = v44 + p52 + s44 * 0.000001;
            if (v52 > dist) {
                v52 = dist;
                d52 = d44;
            }
            dist = v43 + p52 + s43 * 0.000001;
            if (v52 > dist) {
                v52 = dist;
                d52 = d43;
            }
            dist = v42 + p52 + s42 * 0.000001;
            if (v52 > dist) {
                v52 = dist;
                d52 = d42;
            }
        }

        if (rc.onTheMap(l36)) {
            if (rc.canSenseLocation(l36)) {
                MapInfo mapInfo = rc.senseMapInfo(l36);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l36) || (rc.sensePassability(l36) && !rc.canSenseRobotAtLocation(l36) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l36), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p36 = mapInfo.getCooldownMultiplier(team);
                    s36 = Math.sqrt(l36.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p36 = 1.5;
            }
            
            dist = v35 + p36 + s35 * 0.000001;
            if (v36 > dist) {
                v36 = dist;
                d36 = d35;
            }
            dist = v44 + p36 + s44 * 0.000001;
            if (v36 > dist) {
                v36 = dist;
                d36 = d44;
            }
        }

        if (rc.onTheMap(l51)) {
            if (rc.canSenseLocation(l51)) {
                MapInfo mapInfo = rc.senseMapInfo(l51);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l51) || (rc.sensePassability(l51) && !rc.canSenseRobotAtLocation(l51) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l51), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p51 = mapInfo.getCooldownMultiplier(team);
                    s51 = Math.sqrt(l51.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p51 = 1.5;
            }
            
            dist = v52 + p51 + s52 * 0.000001;
            if (v51 > dist) {
                v51 = dist;
                d51 = d52;
            }
            dist = v43 + p51 + s43 * 0.000001;
            if (v51 > dist) {
                v51 = dist;
                d51 = d43;
            }
            dist = v42 + p51 + s42 * 0.000001;
            if (v51 > dist) {
                v51 = dist;
                d51 = d42;
            }
            dist = v41 + p51 + s41 * 0.000001;
            if (v51 > dist) {
                v51 = dist;
                d51 = d41;
            }
        }

        if (rc.onTheMap(l45)) {
            if (rc.canSenseLocation(l45)) {
                MapInfo mapInfo = rc.senseMapInfo(l45);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l45) || (rc.sensePassability(l45) && !rc.canSenseRobotAtLocation(l45) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l45), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p45 = mapInfo.getCooldownMultiplier(team);
                    s45 = Math.sqrt(l45.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p45 = 1.5;
            }
            
            dist = v36 + p45 + s36 * 0.000001;
            if (v45 > dist) {
                v45 = dist;
                d45 = d36;
            }
            dist = v35 + p45 + s35 * 0.000001;
            if (v45 > dist) {
                v45 = dist;
                d45 = d35;
            }
            dist = v44 + p45 + s44 * 0.000001;
            if (v45 > dist) {
                v45 = dist;
                d45 = d44;
            }
            dist = v53 + p45 + s53 * 0.000001;
            if (v45 > dist) {
                v45 = dist;
                d45 = d53;
            }
        }

        if (rc.onTheMap(l53)) {
            if (rc.canSenseLocation(l53)) {
                MapInfo mapInfo = rc.senseMapInfo(l53);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l53) || (rc.sensePassability(l53) && !rc.canSenseRobotAtLocation(l53) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l53), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p53 = mapInfo.getCooldownMultiplier(team);
                    s53 = Math.sqrt(l53.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p53 = 1.5;
            }
            
            dist = v45 + p53 + s45 * 0.000001;
            if (v53 > dist) {
                v53 = dist;
                d53 = d45;
            }
            dist = v44 + p53 + s44 * 0.000001;
            if (v53 > dist) {
                v53 = dist;
                d53 = d44;
            }
            dist = v43 + p53 + s43 * 0.000001;
            if (v53 > dist) {
                v53 = dist;
                d53 = d43;
            }
            dist = v52 + p53 + s52 * 0.000001;
            if (v53 > dist) {
                v53 = dist;
                d53 = d52;
            }
        }

        if (rc.onTheMap(l41)) {
            if (rc.canSenseLocation(l41)) {
                MapInfo mapInfo = rc.senseMapInfo(l41);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l41) || (rc.sensePassability(l41) && !rc.canSenseRobotAtLocation(l41) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l41), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p41 = mapInfo.getCooldownMultiplier(team);
                    s41 = Math.sqrt(l41.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p41 = 1.5;
            }
            
            dist = v51 + p41 + s51 * 0.000001;
            if (v41 > dist) {
                v41 = dist;
                d41 = d51;
            }
            dist = v42 + p41 + s42 * 0.000001;
            if (v41 > dist) {
                v41 = dist;
                d41 = d42;
            }
            dist = v33 + p41 + s33 * 0.000001;
            if (v41 > dist) {
                v41 = dist;
                d41 = d33;
            }
            dist = v32 + p41 + s32 * 0.000001;
            if (v41 > dist) {
                v41 = dist;
                d41 = d32;
            }
        }

        if (rc.onTheMap(l50)) {
            if (rc.canSenseLocation(l50)) {
                MapInfo mapInfo = rc.senseMapInfo(l50);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l50) || (rc.sensePassability(l50) && !rc.canSenseRobotAtLocation(l50) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l50), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p50 = mapInfo.getCooldownMultiplier(team);
                    s50 = Math.sqrt(l50.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p50 = 1.5;
            }
            
            dist = v51 + p50 + s51 * 0.000001;
            if (v50 > dist) {
                v50 = dist;
                d50 = d51;
            }
            dist = v42 + p50 + s42 * 0.000001;
            if (v50 > dist) {
                v50 = dist;
                d50 = d42;
            }
            dist = v41 + p50 + s41 * 0.000001;
            if (v50 > dist) {
                v50 = dist;
                d50 = d41;
            }
        }

        if (rc.onTheMap(l54)) {
            if (rc.canSenseLocation(l54)) {
                MapInfo mapInfo = rc.senseMapInfo(l54);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l54) || (rc.sensePassability(l54) && !rc.canSenseRobotAtLocation(l54) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l54), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p54 = mapInfo.getCooldownMultiplier(team);
                    s54 = Math.sqrt(l54.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p54 = 1.5;
            }
            
            dist = v45 + p54 + s45 * 0.000001;
            if (v54 > dist) {
                v54 = dist;
                d54 = d45;
            }
            dist = v44 + p54 + s44 * 0.000001;
            if (v54 > dist) {
                v54 = dist;
                d54 = d44;
            }
            dist = v53 + p54 + s53 * 0.000001;
            if (v54 > dist) {
                v54 = dist;
                d54 = d53;
            }
        }

        if (rc.onTheMap(l31)) {
            if (rc.canSenseLocation(l31)) {
                MapInfo mapInfo = rc.senseMapInfo(l31);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l31) || (rc.sensePassability(l31) && !rc.canSenseRobotAtLocation(l31) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l31), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p31 = mapInfo.getCooldownMultiplier(team);
                    s31 = Math.sqrt(l31.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p31 = 1.5;
            }
            
            dist = v41 + p31 + s41 * 0.000001;
            if (v31 > dist) {
                v31 = dist;
                d31 = d41;
            }
            dist = v32 + p31 + s32 * 0.000001;
            if (v31 > dist) {
                v31 = dist;
                d31 = d32;
            }
        }

        if (rc.onTheMap(l60)) {
            if (rc.canSenseLocation(l60)) {
                MapInfo mapInfo = rc.senseMapInfo(l60);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l60) || (rc.sensePassability(l60) && !rc.canSenseRobotAtLocation(l60) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l60), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p60 = mapInfo.getCooldownMultiplier(team);
                    s60 = Math.sqrt(l60.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p60 = 1.5;
            }
            
            dist = v53 + p60 + s53 * 0.000001;
            if (v60 > dist) {
                v60 = dist;
                d60 = d53;
            }
            dist = v52 + p60 + s52 * 0.000001;
            if (v60 > dist) {
                v60 = dist;
                d60 = d52;
            }
            dist = v51 + p60 + s51 * 0.000001;
            if (v60 > dist) {
                v60 = dist;
                d60 = d51;
            }
        }

        if (rc.onTheMap(l37)) {
            if (rc.canSenseLocation(l37)) {
                MapInfo mapInfo = rc.senseMapInfo(l37);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l37) || (rc.sensePassability(l37) && !rc.canSenseRobotAtLocation(l37) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l37), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p37 = mapInfo.getCooldownMultiplier(team);
                    s37 = Math.sqrt(l37.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p37 = 1.5;
            }
            
            dist = v36 + p37 + s36 * 0.000001;
            if (v37 > dist) {
                v37 = dist;
                d37 = d36;
            }
            dist = v45 + p37 + s45 * 0.000001;
            if (v37 > dist) {
                v37 = dist;
                d37 = d45;
            }
        }

        if (rc.onTheMap(l40)) {
            if (rc.canSenseLocation(l40)) {
                MapInfo mapInfo = rc.senseMapInfo(l40);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l40) || (rc.sensePassability(l40) && !rc.canSenseRobotAtLocation(l40) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l40), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p40 = mapInfo.getCooldownMultiplier(team);
                    s40 = Math.sqrt(l40.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p40 = 1.5;
            }
            
            dist = v50 + p40 + s50 * 0.000001;
            if (v40 > dist) {
                v40 = dist;
                d40 = d50;
            }
            dist = v41 + p40 + s41 * 0.000001;
            if (v40 > dist) {
                v40 = dist;
                d40 = d41;
            }
            dist = v32 + p40 + s32 * 0.000001;
            if (v40 > dist) {
                v40 = dist;
                d40 = d32;
            }
            dist = v31 + p40 + s31 * 0.000001;
            if (v40 > dist) {
                v40 = dist;
                d40 = d31;
            }
        }

        if (rc.onTheMap(l46)) {
            if (rc.canSenseLocation(l46)) {
                MapInfo mapInfo = rc.senseMapInfo(l46);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l46) || (rc.sensePassability(l46) && !rc.canSenseRobotAtLocation(l46) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l46), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p46 = mapInfo.getCooldownMultiplier(team);
                    s46 = Math.sqrt(l46.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p46 = 1.5;
            }
            
            dist = v37 + p46 + s37 * 0.000001;
            if (v46 > dist) {
                v46 = dist;
                d46 = d37;
            }
            dist = v36 + p46 + s36 * 0.000001;
            if (v46 > dist) {
                v46 = dist;
                d46 = d36;
            }
            dist = v45 + p46 + s45 * 0.000001;
            if (v46 > dist) {
                v46 = dist;
                d46 = d45;
            }
            dist = v54 + p46 + s54 * 0.000001;
            if (v46 > dist) {
                v46 = dist;
                d46 = d54;
            }
        }

        if (rc.onTheMap(l61)) {
            if (rc.canSenseLocation(l61)) {
                MapInfo mapInfo = rc.senseMapInfo(l61);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l61) || (rc.sensePassability(l61) && !rc.canSenseRobotAtLocation(l61) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l61), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p61 = mapInfo.getCooldownMultiplier(team);
                    s61 = Math.sqrt(l61.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p61 = 1.5;
            }
            
            dist = v54 + p61 + s54 * 0.000001;
            if (v61 > dist) {
                v61 = dist;
                d61 = d54;
            }
            dist = v53 + p61 + s53 * 0.000001;
            if (v61 > dist) {
                v61 = dist;
                d61 = d53;
            }
            dist = v52 + p61 + s52 * 0.000001;
            if (v61 > dist) {
                v61 = dist;
                d61 = d52;
            }
            dist = v60 + p61 + s60 * 0.000001;
            if (v61 > dist) {
                v61 = dist;
                d61 = d60;
            }
        }

        if (rc.onTheMap(l59)) {
            if (rc.canSenseLocation(l59)) {
                MapInfo mapInfo = rc.senseMapInfo(l59);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l59) || (rc.sensePassability(l59) && !rc.canSenseRobotAtLocation(l59) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l59), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p59 = mapInfo.getCooldownMultiplier(team);
                    s59 = Math.sqrt(l59.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p59 = 1.5;
            }
            
            dist = v60 + p59 + s60 * 0.000001;
            if (v59 > dist) {
                v59 = dist;
                d59 = d60;
            }
            dist = v52 + p59 + s52 * 0.000001;
            if (v59 > dist) {
                v59 = dist;
                d59 = d52;
            }
            dist = v51 + p59 + s51 * 0.000001;
            if (v59 > dist) {
                v59 = dist;
                d59 = d51;
            }
            dist = v50 + p59 + s50 * 0.000001;
            if (v59 > dist) {
                v59 = dist;
                d59 = d50;
            }
        }

        if (rc.onTheMap(l62)) {
            if (rc.canSenseLocation(l62)) {
                MapInfo mapInfo = rc.senseMapInfo(l62);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l62) || (rc.sensePassability(l62) && !rc.canSenseRobotAtLocation(l62) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l62), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p62 = mapInfo.getCooldownMultiplier(team);
                    s62 = Math.sqrt(l62.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p62 = 1.5;
            }
            
            dist = v55 + p62 + s55 * 0.000001;
            if (v62 > dist) {
                v62 = dist;
                d62 = d55;
            }
            dist = v54 + p62 + s54 * 0.000001;
            if (v62 > dist) {
                v62 = dist;
                d62 = d54;
            }
            dist = v53 + p62 + s53 * 0.000001;
            if (v62 > dist) {
                v62 = dist;
                d62 = d53;
            }
            dist = v61 + p62 + s61 * 0.000001;
            if (v62 > dist) {
                v62 = dist;
                d62 = d61;
            }
        }

        if (rc.onTheMap(l58)) {
            if (rc.canSenseLocation(l58)) {
                MapInfo mapInfo = rc.senseMapInfo(l58);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l58) || (rc.sensePassability(l58) && !rc.canSenseRobotAtLocation(l58) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l58), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p58 = mapInfo.getCooldownMultiplier(team);
                    s58 = Math.sqrt(l58.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p58 = 1.5;
            }
            
            dist = v59 + p58 + s59 * 0.000001;
            if (v58 > dist) {
                v58 = dist;
                d58 = d59;
            }
            dist = v51 + p58 + s51 * 0.000001;
            if (v58 > dist) {
                v58 = dist;
                d58 = d51;
            }
            dist = v50 + p58 + s50 * 0.000001;
            if (v58 > dist) {
                v58 = dist;
                d58 = d50;
            }
            dist = v49 + p58 + s49 * 0.000001;
            if (v58 > dist) {
                v58 = dist;
                d58 = d49;
            }
        }

        if (rc.onTheMap(l49)) {
            if (rc.canSenseLocation(l49)) {
                MapInfo mapInfo = rc.senseMapInfo(l49);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l49) || (rc.sensePassability(l49) && !rc.canSenseRobotAtLocation(l49) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l49), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p49 = mapInfo.getCooldownMultiplier(team);
                    s49 = Math.sqrt(l49.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p49 = 1.5;
            }
            
            dist = v58 + p49 + s58 * 0.000001;
            if (v49 > dist) {
                v49 = dist;
                d49 = d58;
            }
            dist = v50 + p49 + s50 * 0.000001;
            if (v49 > dist) {
                v49 = dist;
                d49 = d50;
            }
            dist = v41 + p49 + s41 * 0.000001;
            if (v49 > dist) {
                v49 = dist;
                d49 = d41;
            }
            dist = v40 + p49 + s40 * 0.000001;
            if (v49 > dist) {
                v49 = dist;
                d49 = d40;
            }
        }

        if (rc.onTheMap(l55)) {
            if (rc.canSenseLocation(l55)) {
                MapInfo mapInfo = rc.senseMapInfo(l55);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l55) || (rc.sensePassability(l55) && !rc.canSenseRobotAtLocation(l55) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l55), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p55 = mapInfo.getCooldownMultiplier(team);
                    s55 = Math.sqrt(l55.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p55 = 1.5;
            }
            
            dist = v46 + p55 + s46 * 0.000001;
            if (v55 > dist) {
                v55 = dist;
                d55 = d46;
            }
            dist = v45 + p55 + s45 * 0.000001;
            if (v55 > dist) {
                v55 = dist;
                d55 = d45;
            }
            dist = v54 + p55 + s54 * 0.000001;
            if (v55 > dist) {
                v55 = dist;
                d55 = d54;
            }
            dist = v62 + p55 + s62 * 0.000001;
            if (v55 > dist) {
                v55 = dist;
                d55 = d62;
            }
        }

        if (rc.onTheMap(l63)) {
            if (rc.canSenseLocation(l63)) {
                MapInfo mapInfo = rc.senseMapInfo(l63);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l63) || (rc.sensePassability(l63) && !rc.canSenseRobotAtLocation(l63) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l63), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p63 = mapInfo.getCooldownMultiplier(team);
                    s63 = Math.sqrt(l63.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p63 = 1.5;
            }
            
            dist = v55 + p63 + s55 * 0.000001;
            if (v63 > dist) {
                v63 = dist;
                d63 = d55;
            }
            dist = v54 + p63 + s54 * 0.000001;
            if (v63 > dist) {
                v63 = dist;
                d63 = d54;
            }
            dist = v62 + p63 + s62 * 0.000001;
            if (v63 > dist) {
                v63 = dist;
                d63 = d62;
            }
        }

        if (rc.onTheMap(l57)) {
            if (rc.canSenseLocation(l57)) {
                MapInfo mapInfo = rc.senseMapInfo(l57);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l57) || (rc.sensePassability(l57) && !rc.canSenseRobotAtLocation(l57) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l57), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p57 = mapInfo.getCooldownMultiplier(team);
                    s57 = Math.sqrt(l57.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p57 = 1.5;
            }
            
            dist = v58 + p57 + s58 * 0.000001;
            if (v57 > dist) {
                v57 = dist;
                d57 = d58;
            }
            dist = v50 + p57 + s50 * 0.000001;
            if (v57 > dist) {
                v57 = dist;
                d57 = d50;
            }
            dist = v49 + p57 + s49 * 0.000001;
            if (v57 > dist) {
                v57 = dist;
                d57 = d49;
            }
        }

        if (rc.onTheMap(l38)) {
            if (rc.canSenseLocation(l38)) {
                MapInfo mapInfo = rc.senseMapInfo(l38);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l38) || (rc.sensePassability(l38) && !rc.canSenseRobotAtLocation(l38) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l38), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p38 = mapInfo.getCooldownMultiplier(team);
                    s38 = Math.sqrt(l38.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p38 = 1.5;
            }
            
            dist = v37 + p38 + s37 * 0.000001;
            if (v38 > dist) {
                v38 = dist;
                d38 = d37;
            }
            dist = v46 + p38 + s46 * 0.000001;
            if (v38 > dist) {
                v38 = dist;
                d38 = d46;
            }
        }

        if (rc.onTheMap(l30)) {
            if (rc.canSenseLocation(l30)) {
                MapInfo mapInfo = rc.senseMapInfo(l30);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l30) || (rc.sensePassability(l30) && !rc.canSenseRobotAtLocation(l30) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l30), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p30 = mapInfo.getCooldownMultiplier(team);
                    s30 = Math.sqrt(l30.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p30 = 1.5;
            }
            
            dist = v40 + p30 + s40 * 0.000001;
            if (v30 > dist) {
                v30 = dist;
                d30 = d40;
            }
            dist = v31 + p30 + s31 * 0.000001;
            if (v30 > dist) {
                v30 = dist;
                d30 = d31;
            }
        }

        if (rc.onTheMap(l66)) {
            if (rc.canSenseLocation(l66)) {
                MapInfo mapInfo = rc.senseMapInfo(l66);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l66) || (rc.sensePassability(l66) && !rc.canSenseRobotAtLocation(l66) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l66), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p66 = mapInfo.getCooldownMultiplier(team);
                    s66 = Math.sqrt(l66.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p66 = 1.5;
            }
            
            dist = v61 + p66 + s61 * 0.000001;
            if (v66 > dist) {
                v66 = dist;
                d66 = d61;
            }
            dist = v60 + p66 + s60 * 0.000001;
            if (v66 > dist) {
                v66 = dist;
                d66 = d60;
            }
            dist = v59 + p66 + s59 * 0.000001;
            if (v66 > dist) {
                v66 = dist;
                d66 = d59;
            }
        }

        if (rc.onTheMap(l39)) {
            if (rc.canSenseLocation(l39)) {
                MapInfo mapInfo = rc.senseMapInfo(l39);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l39) || (rc.sensePassability(l39) && !rc.canSenseRobotAtLocation(l39) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l39), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p39 = mapInfo.getCooldownMultiplier(team);
                    s39 = Math.sqrt(l39.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p39 = 1.5;
            }
            
            dist = v49 + p39 + s49 * 0.000001;
            if (v39 > dist) {
                v39 = dist;
                d39 = d49;
            }
            dist = v40 + p39 + s40 * 0.000001;
            if (v39 > dist) {
                v39 = dist;
                d39 = d40;
            }
            dist = v31 + p39 + s31 * 0.000001;
            if (v39 > dist) {
                v39 = dist;
                d39 = d31;
            }
            dist = v30 + p39 + s30 * 0.000001;
            if (v39 > dist) {
                v39 = dist;
                d39 = d30;
            }
        }

        if (rc.onTheMap(l47)) {
            if (rc.canSenseLocation(l47)) {
                MapInfo mapInfo = rc.senseMapInfo(l47);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l47) || (rc.sensePassability(l47) && !rc.canSenseRobotAtLocation(l47) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l47), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p47 = mapInfo.getCooldownMultiplier(team);
                    s47 = Math.sqrt(l47.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p47 = 1.5;
            }
            
            dist = v38 + p47 + s38 * 0.000001;
            if (v47 > dist) {
                v47 = dist;
                d47 = d38;
            }
            dist = v37 + p47 + s37 * 0.000001;
            if (v47 > dist) {
                v47 = dist;
                d47 = d37;
            }
            dist = v46 + p47 + s46 * 0.000001;
            if (v47 > dist) {
                v47 = dist;
                d47 = d46;
            }
            dist = v55 + p47 + s55 * 0.000001;
            if (v47 > dist) {
                v47 = dist;
                d47 = d55;
            }
        }

        if (rc.onTheMap(l65)) {
            if (rc.canSenseLocation(l65)) {
                MapInfo mapInfo = rc.senseMapInfo(l65);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l65) || (rc.sensePassability(l65) && !rc.canSenseRobotAtLocation(l65) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l65), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p65 = mapInfo.getCooldownMultiplier(team);
                    s65 = Math.sqrt(l65.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p65 = 1.5;
            }
            
            dist = v66 + p65 + s66 * 0.000001;
            if (v65 > dist) {
                v65 = dist;
                d65 = d66;
            }
            dist = v60 + p65 + s60 * 0.000001;
            if (v65 > dist) {
                v65 = dist;
                d65 = d60;
            }
            dist = v59 + p65 + s59 * 0.000001;
            if (v65 > dist) {
                v65 = dist;
                d65 = d59;
            }
            dist = v58 + p65 + s58 * 0.000001;
            if (v65 > dist) {
                v65 = dist;
                d65 = d58;
            }
        }

        if (rc.onTheMap(l67)) {
            if (rc.canSenseLocation(l67)) {
                MapInfo mapInfo = rc.senseMapInfo(l67);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l67) || (rc.sensePassability(l67) && !rc.canSenseRobotAtLocation(l67) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l67), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p67 = mapInfo.getCooldownMultiplier(team);
                    s67 = Math.sqrt(l67.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p67 = 1.5;
            }
            
            dist = v62 + p67 + s62 * 0.000001;
            if (v67 > dist) {
                v67 = dist;
                d67 = d62;
            }
            dist = v61 + p67 + s61 * 0.000001;
            if (v67 > dist) {
                v67 = dist;
                d67 = d61;
            }
            dist = v60 + p67 + s60 * 0.000001;
            if (v67 > dist) {
                v67 = dist;
                d67 = d60;
            }
            dist = v66 + p67 + s66 * 0.000001;
            if (v67 > dist) {
                v67 = dist;
                d67 = d66;
            }
        }

        if (rc.onTheMap(l64)) {
            if (rc.canSenseLocation(l64)) {
                MapInfo mapInfo = rc.senseMapInfo(l64);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l64) || (rc.sensePassability(l64) && !rc.canSenseRobotAtLocation(l64) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l64), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p64 = mapInfo.getCooldownMultiplier(team);
                    s64 = Math.sqrt(l64.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p64 = 1.5;
            }
            
            dist = v65 + p64 + s65 * 0.000001;
            if (v64 > dist) {
                v64 = dist;
                d64 = d65;
            }
            dist = v59 + p64 + s59 * 0.000001;
            if (v64 > dist) {
                v64 = dist;
                d64 = d59;
            }
            dist = v58 + p64 + s58 * 0.000001;
            if (v64 > dist) {
                v64 = dist;
                d64 = d58;
            }
            dist = v57 + p64 + s57 * 0.000001;
            if (v64 > dist) {
                v64 = dist;
                d64 = d57;
            }
        }

        if (rc.onTheMap(l48)) {
            if (rc.canSenseLocation(l48)) {
                MapInfo mapInfo = rc.senseMapInfo(l48);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l48) || (rc.sensePassability(l48) && !rc.canSenseRobotAtLocation(l48) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l48), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p48 = mapInfo.getCooldownMultiplier(team);
                    s48 = Math.sqrt(l48.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p48 = 1.5;
            }
            
            dist = v57 + p48 + s57 * 0.000001;
            if (v48 > dist) {
                v48 = dist;
                d48 = d57;
            }
            dist = v49 + p48 + s49 * 0.000001;
            if (v48 > dist) {
                v48 = dist;
                d48 = d49;
            }
            dist = v40 + p48 + s40 * 0.000001;
            if (v48 > dist) {
                v48 = dist;
                d48 = d40;
            }
            dist = v39 + p48 + s39 * 0.000001;
            if (v48 > dist) {
                v48 = dist;
                d48 = d39;
            }
        }

        if (rc.onTheMap(l68)) {
            if (rc.canSenseLocation(l68)) {
                MapInfo mapInfo = rc.senseMapInfo(l68);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l68) || (rc.sensePassability(l68) && !rc.canSenseRobotAtLocation(l68) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l68), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p68 = mapInfo.getCooldownMultiplier(team);
                    s68 = Math.sqrt(l68.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p68 = 1.5;
            }
            
            dist = v63 + p68 + s63 * 0.000001;
            if (v68 > dist) {
                v68 = dist;
                d68 = d63;
            }
            dist = v62 + p68 + s62 * 0.000001;
            if (v68 > dist) {
                v68 = dist;
                d68 = d62;
            }
            dist = v61 + p68 + s61 * 0.000001;
            if (v68 > dist) {
                v68 = dist;
                d68 = d61;
            }
            dist = v67 + p68 + s67 * 0.000001;
            if (v68 > dist) {
                v68 = dist;
                d68 = d67;
            }
        }

        if (rc.onTheMap(l56)) {
            if (rc.canSenseLocation(l56)) {
                MapInfo mapInfo = rc.senseMapInfo(l56);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l56) || (rc.sensePassability(l56) && !rc.canSenseRobotAtLocation(l56) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l56), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p56 = mapInfo.getCooldownMultiplier(team);
                    s56 = Math.sqrt(l56.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p56 = 1.5;
            }
            
            dist = v47 + p56 + s47 * 0.000001;
            if (v56 > dist) {
                v56 = dist;
                d56 = d47;
            }
            dist = v46 + p56 + s46 * 0.000001;
            if (v56 > dist) {
                v56 = dist;
                d56 = d46;
            }
            dist = v55 + p56 + s55 * 0.000001;
            if (v56 > dist) {
                v56 = dist;
                d56 = d55;
            }
            dist = v63 + p56 + s63 * 0.000001;
            if (v56 > dist) {
                v56 = dist;
                d56 = d63;
            }
        }
    
        int dx = targetLocation.x - l34.x;
        int dy = targetLocation.y - l34.y;

        switch(dx) {
            case -4:
                switch(dy) {
                } break;

            case -3:
                switch(dy) {
                } break;

            case -2:
                switch(dy) {
                } break;

            case -1:
                switch(dy) {
                } break;

            case 0:
                switch(dy) {
                    case -4:
                        if (v30 < 1000000) {
                            bug.reset();
                            return d30;
                        } break;
                    case -3:
                        if (v31 < 1000000) {
                            bug.reset();
                            return d31;
                        } break;
                    case -2:
                        if (v32 < 1000000) {
                            bug.reset();
                            return d32;
                        } break;
                    case -1:
                        if (v33 < 1000000) {
                            bug.reset();
                            return d33;
                        } break;
                    case 1:
                        if (v35 < 1000000) {
                            bug.reset();
                            return d35;
                        } break;
                    case 2:
                        if (v36 < 1000000) {
                            bug.reset();
                            return d36;
                        } break;
                    case 3:
                        if (v37 < 1000000) {
                            bug.reset();
                            return d37;
                        } break;
                    case 4:
                        if (v38 < 1000000) {
                            bug.reset();
                            return d38;
                        } break;
                } break;

            case 1:
                switch(dy) {
                    case -4:
                        if (v39 < 1000000) {
                            bug.reset();
                            return d39;
                        } break;
                    case -3:
                        if (v40 < 1000000) {
                            bug.reset();
                            return d40;
                        } break;
                    case -2:
                        if (v41 < 1000000) {
                            bug.reset();
                            return d41;
                        } break;
                    case -1:
                        if (v42 < 1000000) {
                            bug.reset();
                            return d42;
                        } break;
                    case 0:
                        if (v43 < 1000000) {
                            bug.reset();
                            return d43;
                        } break;
                    case 1:
                        if (v44 < 1000000) {
                            bug.reset();
                            return d44;
                        } break;
                    case 2:
                        if (v45 < 1000000) {
                            bug.reset();
                            return d45;
                        } break;
                    case 3:
                        if (v46 < 1000000) {
                            bug.reset();
                            return d46;
                        } break;
                    case 4:
                        if (v47 < 1000000) {
                            bug.reset();
                            return d47;
                        } break;
                } break;

            case 2:
                switch(dy) {
                    case -4:
                        if (v48 < 1000000) {
                            bug.reset();
                            return d48;
                        } break;
                    case -3:
                        if (v49 < 1000000) {
                            bug.reset();
                            return d49;
                        } break;
                    case -2:
                        if (v50 < 1000000) {
                            bug.reset();
                            return d50;
                        } break;
                    case -1:
                        if (v51 < 1000000) {
                            bug.reset();
                            return d51;
                        } break;
                    case 0:
                        if (v52 < 1000000) {
                            bug.reset();
                            return d52;
                        } break;
                    case 1:
                        if (v53 < 1000000) {
                            bug.reset();
                            return d53;
                        } break;
                    case 2:
                        if (v54 < 1000000) {
                            bug.reset();
                            return d54;
                        } break;
                    case 3:
                        if (v55 < 1000000) {
                            bug.reset();
                            return d55;
                        } break;
                    case 4:
                        if (v56 < 1000000) {
                            bug.reset();
                            return d56;
                        } break;
                } break;

            case 3:
                switch(dy) {
                    case -3:
                        if (v57 < 1000000) {
                            bug.reset();
                            return d57;
                        } break;
                    case -2:
                        if (v58 < 1000000) {
                            bug.reset();
                            return d58;
                        } break;
                    case -1:
                        if (v59 < 1000000) {
                            bug.reset();
                            return d59;
                        } break;
                    case 0:
                        if (v60 < 1000000) {
                            bug.reset();
                            return d60;
                        } break;
                    case 1:
                        if (v61 < 1000000) {
                            bug.reset();
                            return d61;
                        } break;
                    case 2:
                        if (v62 < 1000000) {
                            bug.reset();
                            return d62;
                        } break;
                    case 3:
                        if (v63 < 1000000) {
                            bug.reset();
                            return d63;
                        } break;
                } break;

            case 4:
                switch(dy) {
                    case -2:
                        if (v64 < 1000000) {
                            bug.reset();
                            return d64;
                        } break;
                    case -1:
                        if (v65 < 1000000) {
                            bug.reset();
                            return d65;
                        } break;
                    case 0:
                        if (v66 < 1000000) {
                            bug.reset();
                            return d66;
                        } break;
                    case 1:
                        if (v67 < 1000000) {
                            bug.reset();
                            return d67;
                        } break;
                    case 2:
                        if (v68 < 1000000) {
                            bug.reset();
                            return d68;
                        } break;
                } break;

        }
    
        Direction ans = Direction.CENTER;

        double dist30 = v30 + s30;
        if (dist30 < localBest) {
            localBest = dist30;
            ans = d30;
        }

        double dist31 = v31 + s31;
        if (dist31 < localBest) {
            localBest = dist31;
            ans = d31;
        }

        double dist32 = v32 + s32;
        if (dist32 < localBest) {
            localBest = dist32;
            ans = d32;
        }

        double dist33 = v33 + s33;
        if (dist33 < localBest) {
            localBest = dist33;
            ans = d33;
        }

        double dist35 = v35 + s35;
        if (dist35 < localBest) {
            localBest = dist35;
            ans = d35;
        }

        double dist36 = v36 + s36;
        if (dist36 < localBest) {
            localBest = dist36;
            ans = d36;
        }

        double dist37 = v37 + s37;
        if (dist37 < localBest) {
            localBest = dist37;
            ans = d37;
        }

        double dist38 = v38 + s38;
        if (dist38 < localBest) {
            localBest = dist38;
            ans = d38;
        }

        double dist39 = v39 + s39;
        if (dist39 < localBest) {
            localBest = dist39;
            ans = d39;
        }

        double dist40 = v40 + s40;
        if (dist40 < localBest) {
            localBest = dist40;
            ans = d40;
        }

        double dist41 = v41 + s41;
        if (dist41 < localBest) {
            localBest = dist41;
            ans = d41;
        }

        double dist42 = v42 + s42;
        if (dist42 < localBest) {
            localBest = dist42;
            ans = d42;
        }

        double dist43 = v43 + s43;
        if (dist43 < localBest) {
            localBest = dist43;
            ans = d43;
        }

        double dist44 = v44 + s44;
        if (dist44 < localBest) {
            localBest = dist44;
            ans = d44;
        }

        double dist45 = v45 + s45;
        if (dist45 < localBest) {
            localBest = dist45;
            ans = d45;
        }

        double dist46 = v46 + s46;
        if (dist46 < localBest) {
            localBest = dist46;
            ans = d46;
        }

        double dist47 = v47 + s47;
        if (dist47 < localBest) {
            localBest = dist47;
            ans = d47;
        }

        double dist48 = v48 + s48;
        if (dist48 < localBest) {
            localBest = dist48;
            ans = d48;
        }

        double dist49 = v49 + s49;
        if (dist49 < localBest) {
            localBest = dist49;
            ans = d49;
        }

        double dist50 = v50 + s50;
        if (dist50 < localBest) {
            localBest = dist50;
            ans = d50;
        }

        double dist51 = v51 + s51;
        if (dist51 < localBest) {
            localBest = dist51;
            ans = d51;
        }

        double dist52 = v52 + s52;
        if (dist52 < localBest) {
            localBest = dist52;
            ans = d52;
        }

        double dist53 = v53 + s53;
        if (dist53 < localBest) {
            localBest = dist53;
            ans = d53;
        }

        double dist54 = v54 + s54;
        if (dist54 < localBest) {
            localBest = dist54;
            ans = d54;
        }

        double dist55 = v55 + s55;
        if (dist55 < localBest) {
            localBest = dist55;
            ans = d55;
        }

        double dist56 = v56 + s56;
        if (dist56 < localBest) {
            localBest = dist56;
            ans = d56;
        }

        double dist57 = v57 + s57;
        if (dist57 < localBest) {
            localBest = dist57;
            ans = d57;
        }

        double dist58 = v58 + s58;
        if (dist58 < localBest) {
            localBest = dist58;
            ans = d58;
        }

        double dist59 = v59 + s59;
        if (dist59 < localBest) {
            localBest = dist59;
            ans = d59;
        }

        double dist60 = v60 + s60;
        if (dist60 < localBest) {
            localBest = dist60;
            ans = d60;
        }

        double dist61 = v61 + s61;
        if (dist61 < localBest) {
            localBest = dist61;
            ans = d61;
        }

        double dist62 = v62 + s62;
        if (dist62 < localBest) {
            localBest = dist62;
            ans = d62;
        }

        double dist63 = v63 + s63;
        if (dist63 < localBest) {
            localBest = dist63;
            ans = d63;
        }

        double dist64 = v64 + s64;
        if (dist64 < localBest) {
            localBest = dist64;
            ans = d64;
        }

        double dist65 = v65 + s65;
        if (dist65 < localBest) {
            localBest = dist65;
            ans = d65;
        }

        double dist66 = v66 + s66;
        if (dist66 < localBest) {
            localBest = dist66;
            ans = d66;
        }

        double dist67 = v67 + s67;
        if (dist67 < localBest) {
            localBest = dist67;
            ans = d67;
        }

        double dist68 = v68 + s68;
        if (dist68 < localBest) {
            localBest = dist68;
            ans = d68;
        }

        if (localBest < globalBest) {
            globalBest = localBest;
            bug.reset();
            return ans;
        }

        consecutiveBugNavRoundCount += 1;

        if (consecutiveBugNavRoundCount > 40) {
            globalBest = 1000000;
            consecutiveBugNavRoundCount = 0;
        }

        bug.move(targetLocation, lastDirection);
        return null;
    }

    private Direction getBestDirection3() throws GameActionException {
        double localBest = 1000000.0;
        double dist = 0.0;
        l34 = currentLocation;
        v34 = 0;
        d43 = null;
        l43 = l34.add(Direction.EAST);
        v43 = 1000000;
        p43 = 1000000;
        s43 = Math.sqrt(l43.distanceSquaredTo(targetLocation));
        d44 = null;
        l44 = l34.add(Direction.NORTHEAST);
        v44 = 1000000;
        p44 = 1000000;
        s44 = Math.sqrt(l44.distanceSquaredTo(targetLocation));
        d24 = null;
        l24 = l34.add(Direction.SOUTHWEST);
        v24 = 1000000;
        p24 = 1000000;
        s24 = Math.sqrt(l24.distanceSquaredTo(targetLocation));
        d33 = null;
        l33 = l34.add(Direction.SOUTH);
        v33 = 1000000;
        p33 = 1000000;
        s33 = Math.sqrt(l33.distanceSquaredTo(targetLocation));
        d42 = null;
        l42 = l34.add(Direction.SOUTHEAST);
        v42 = 1000000;
        p42 = 1000000;
        s42 = Math.sqrt(l42.distanceSquaredTo(targetLocation));
        d23 = null;
        l23 = l33.add(Direction.SOUTHWEST);
        v23 = 1000000;
        p23 = 1000000;
        s23 = Math.sqrt(l23.distanceSquaredTo(targetLocation));
        d32 = null;
        l32 = l33.add(Direction.SOUTH);
        v32 = 1000000;
        p32 = 1000000;
        s32 = Math.sqrt(l32.distanceSquaredTo(targetLocation));
        d41 = null;
        l41 = l33.add(Direction.SOUTHEAST);
        v41 = 1000000;
        p41 = 1000000;
        s41 = Math.sqrt(l41.distanceSquaredTo(targetLocation));
        d52 = null;
        l52 = l43.add(Direction.EAST);
        v52 = 1000000;
        p52 = 1000000;
        s52 = Math.sqrt(l52.distanceSquaredTo(targetLocation));
        d53 = null;
        l53 = l43.add(Direction.NORTHEAST);
        v53 = 1000000;
        p53 = 1000000;
        s53 = Math.sqrt(l53.distanceSquaredTo(targetLocation));
        d51 = null;
        l51 = l43.add(Direction.SOUTHEAST);
        v51 = 1000000;
        p51 = 1000000;
        s51 = Math.sqrt(l51.distanceSquaredTo(targetLocation));
        d50 = null;
        l50 = l42.add(Direction.SOUTHEAST);
        v50 = 1000000;
        p50 = 1000000;
        s50 = Math.sqrt(l50.distanceSquaredTo(targetLocation));
        d54 = null;
        l54 = l44.add(Direction.NORTHEAST);
        v54 = 1000000;
        p54 = 1000000;
        s54 = Math.sqrt(l54.distanceSquaredTo(targetLocation));
        d14 = null;
        l14 = l24.add(Direction.SOUTHWEST);
        v14 = 1000000;
        p14 = 1000000;
        s14 = Math.sqrt(l14.distanceSquaredTo(targetLocation));
        d22 = null;
        l22 = l32.add(Direction.SOUTHWEST);
        v22 = 1000000;
        p22 = 1000000;
        s22 = Math.sqrt(l22.distanceSquaredTo(targetLocation));
        d31 = null;
        l31 = l32.add(Direction.SOUTH);
        v31 = 1000000;
        p31 = 1000000;
        s31 = Math.sqrt(l31.distanceSquaredTo(targetLocation));
        d40 = null;
        l40 = l32.add(Direction.SOUTHEAST);
        v40 = 1000000;
        p40 = 1000000;
        s40 = Math.sqrt(l40.distanceSquaredTo(targetLocation));
        d60 = null;
        l60 = l52.add(Direction.EAST);
        v60 = 1000000;
        p60 = 1000000;
        s60 = Math.sqrt(l60.distanceSquaredTo(targetLocation));
        d61 = null;
        l61 = l52.add(Direction.NORTHEAST);
        v61 = 1000000;
        p61 = 1000000;
        s61 = Math.sqrt(l61.distanceSquaredTo(targetLocation));
        d59 = null;
        l59 = l52.add(Direction.SOUTHEAST);
        v59 = 1000000;
        p59 = 1000000;
        s59 = Math.sqrt(l59.distanceSquaredTo(targetLocation));
        d62 = null;
        l62 = l53.add(Direction.NORTHEAST);
        v62 = 1000000;
        p62 = 1000000;
        s62 = Math.sqrt(l62.distanceSquaredTo(targetLocation));
        d58 = null;
        l58 = l51.add(Direction.SOUTHEAST);
        v58 = 1000000;
        p58 = 1000000;
        s58 = Math.sqrt(l58.distanceSquaredTo(targetLocation));
        d49 = null;
        l49 = l41.add(Direction.SOUTHEAST);
        v49 = 1000000;
        p49 = 1000000;
        s49 = Math.sqrt(l49.distanceSquaredTo(targetLocation));
        d13 = null;
        l13 = l23.add(Direction.SOUTHWEST);
        v13 = 1000000;
        p13 = 1000000;
        s13 = Math.sqrt(l13.distanceSquaredTo(targetLocation));
        d5 = null;
        l5 = l14.add(Direction.SOUTHWEST);
        v5 = 1000000;
        p5 = 1000000;
        s5 = Math.sqrt(l5.distanceSquaredTo(targetLocation));
        d57 = null;
        l57 = l50.add(Direction.SOUTHEAST);
        v57 = 1000000;
        p57 = 1000000;
        s57 = Math.sqrt(l57.distanceSquaredTo(targetLocation));
        d63 = null;
        l63 = l54.add(Direction.NORTHEAST);
        v63 = 1000000;
        p63 = 1000000;
        s63 = Math.sqrt(l63.distanceSquaredTo(targetLocation));
        d21 = null;
        l21 = l31.add(Direction.SOUTHWEST);
        v21 = 1000000;
        p21 = 1000000;
        s21 = Math.sqrt(l21.distanceSquaredTo(targetLocation));
        d30 = null;
        l30 = l31.add(Direction.SOUTH);
        v30 = 1000000;
        p30 = 1000000;
        s30 = Math.sqrt(l30.distanceSquaredTo(targetLocation));
        d39 = null;
        l39 = l31.add(Direction.SOUTHEAST);
        v39 = 1000000;
        p39 = 1000000;
        s39 = Math.sqrt(l39.distanceSquaredTo(targetLocation));
        d66 = null;
        l66 = l60.add(Direction.EAST);
        v66 = 1000000;
        p66 = 1000000;
        s66 = Math.sqrt(l66.distanceSquaredTo(targetLocation));
        d67 = null;
        l67 = l60.add(Direction.NORTHEAST);
        v67 = 1000000;
        p67 = 1000000;
        s67 = Math.sqrt(l67.distanceSquaredTo(targetLocation));
        d65 = null;
        l65 = l60.add(Direction.SOUTHEAST);
        v65 = 1000000;
        p65 = 1000000;
        s65 = Math.sqrt(l65.distanceSquaredTo(targetLocation));
        d64 = null;
        l64 = l59.add(Direction.SOUTHEAST);
        v64 = 1000000;
        p64 = 1000000;
        s64 = Math.sqrt(l64.distanceSquaredTo(targetLocation));
        d48 = null;
        l48 = l40.add(Direction.SOUTHEAST);
        v48 = 1000000;
        p48 = 1000000;
        s48 = Math.sqrt(l48.distanceSquaredTo(targetLocation));
        d12 = null;
        l12 = l22.add(Direction.SOUTHWEST);
        v12 = 1000000;
        p12 = 1000000;
        s12 = Math.sqrt(l12.distanceSquaredTo(targetLocation));
        d68 = null;
        l68 = l61.add(Direction.NORTHEAST);
        v68 = 1000000;
        p68 = 1000000;
        s68 = Math.sqrt(l68.distanceSquaredTo(targetLocation));
    

        if (rc.onTheMap(l33) && rc.canMove(Direction.SOUTH)) {
            if (rc.canSenseLocation(l33)) {
                MapInfo mapInfo = rc.senseMapInfo(l33);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l33) || (rc.sensePassability(l33) && !rc.canSenseRobotAtLocation(l33) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l33), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p33 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p33 = 1.5;
            }
            
            dist = v43 + p33 + s43 * 0.000001;
            if (v33 > dist) {
                v33 = dist;
                d33 = d43;
            }
            dist = v34 + p33 + s34 * 0.000001;
            if (v33 > dist) {
                v33 = dist;
                d33 = Direction.SOUTH;
            }
        }

        if (rc.onTheMap(l43) && rc.canMove(Direction.EAST)) {
            if (rc.canSenseLocation(l43)) {
                MapInfo mapInfo = rc.senseMapInfo(l43);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l43) || (rc.sensePassability(l43) && !rc.canSenseRobotAtLocation(l43) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l43), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p43 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p43 = 1.5;
            }
            
            dist = v34 + p43 + s34 * 0.000001;
            if (v43 > dist) {
                v43 = dist;
                d43 = Direction.EAST;
            }
            dist = v33 + p43 + s33 * 0.000001;
            if (v43 > dist) {
                v43 = dist;
                d43 = d33;
            }
        }

        if (rc.onTheMap(l42) && rc.canMove(Direction.SOUTHEAST)) {
            if (rc.canSenseLocation(l42)) {
                MapInfo mapInfo = rc.senseMapInfo(l42);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l42) || (rc.sensePassability(l42) && !rc.canSenseRobotAtLocation(l42) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l42), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p42 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p42 = 1.5;
            }
            
            dist = v43 + p42 + s43 * 0.000001;
            if (v42 > dist) {
                v42 = dist;
                d42 = d43;
            }
            dist = v34 + p42 + s34 * 0.000001;
            if (v42 > dist) {
                v42 = dist;
                d42 = Direction.SOUTHEAST;
            }
            dist = v33 + p42 + s33 * 0.000001;
            if (v42 > dist) {
                v42 = dist;
                d42 = d33;
            }
        }

        if (rc.onTheMap(l44) && rc.canMove(Direction.NORTHEAST)) {
            if (rc.canSenseLocation(l44)) {
                MapInfo mapInfo = rc.senseMapInfo(l44);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l44) || (rc.sensePassability(l44) && !rc.canSenseRobotAtLocation(l44) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l44), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p44 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p44 = 1.5;
            }
            
            dist = v34 + p44 + s34 * 0.000001;
            if (v44 > dist) {
                v44 = dist;
                d44 = Direction.NORTHEAST;
            }
            dist = v43 + p44 + s43 * 0.000001;
            if (v44 > dist) {
                v44 = dist;
                d44 = d43;
            }
        }

        if (rc.onTheMap(l24) && rc.canMove(Direction.SOUTHWEST)) {
            if (rc.canSenseLocation(l24)) {
                MapInfo mapInfo = rc.senseMapInfo(l24);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l24) || (rc.sensePassability(l24) && !rc.canSenseRobotAtLocation(l24) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l24), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p24 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p24 = 1.5;
            }
            
            dist = v33 + p24 + s33 * 0.000001;
            if (v24 > dist) {
                v24 = dist;
                d24 = d33;
            }
            dist = v34 + p24 + s34 * 0.000001;
            if (v24 > dist) {
                v24 = dist;
                d24 = Direction.SOUTHWEST;
            }
        }

        if (rc.onTheMap(l32)) {
            if (rc.canSenseLocation(l32)) {
                MapInfo mapInfo = rc.senseMapInfo(l32);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l32) || (rc.sensePassability(l32) && !rc.canSenseRobotAtLocation(l32) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l32), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p32 = mapInfo.getCooldownMultiplier(team);
                    s32 = Math.sqrt(l32.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p32 = 1.5;
            }
            
            dist = v42 + p32 + s42 * 0.000001;
            if (v32 > dist) {
                v32 = dist;
                d32 = d42;
            }
            dist = v33 + p32 + s33 * 0.000001;
            if (v32 > dist) {
                v32 = dist;
                d32 = d33;
            }
            dist = v24 + p32 + s24 * 0.000001;
            if (v32 > dist) {
                v32 = dist;
                d32 = d24;
            }
        }

        if (rc.onTheMap(l52)) {
            if (rc.canSenseLocation(l52)) {
                MapInfo mapInfo = rc.senseMapInfo(l52);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l52) || (rc.sensePassability(l52) && !rc.canSenseRobotAtLocation(l52) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l52), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p52 = mapInfo.getCooldownMultiplier(team);
                    s52 = Math.sqrt(l52.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p52 = 1.5;
            }
            
            dist = v44 + p52 + s44 * 0.000001;
            if (v52 > dist) {
                v52 = dist;
                d52 = d44;
            }
            dist = v43 + p52 + s43 * 0.000001;
            if (v52 > dist) {
                v52 = dist;
                d52 = d43;
            }
            dist = v42 + p52 + s42 * 0.000001;
            if (v52 > dist) {
                v52 = dist;
                d52 = d42;
            }
        }

        if (rc.onTheMap(l53)) {
            if (rc.canSenseLocation(l53)) {
                MapInfo mapInfo = rc.senseMapInfo(l53);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l53) || (rc.sensePassability(l53) && !rc.canSenseRobotAtLocation(l53) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l53), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p53 = mapInfo.getCooldownMultiplier(team);
                    s53 = Math.sqrt(l53.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p53 = 1.5;
            }
            
            dist = v44 + p53 + s44 * 0.000001;
            if (v53 > dist) {
                v53 = dist;
                d53 = d44;
            }
            dist = v43 + p53 + s43 * 0.000001;
            if (v53 > dist) {
                v53 = dist;
                d53 = d43;
            }
            dist = v52 + p53 + s52 * 0.000001;
            if (v53 > dist) {
                v53 = dist;
                d53 = d52;
            }
        }

        if (rc.onTheMap(l51)) {
            if (rc.canSenseLocation(l51)) {
                MapInfo mapInfo = rc.senseMapInfo(l51);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l51) || (rc.sensePassability(l51) && !rc.canSenseRobotAtLocation(l51) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l51), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p51 = mapInfo.getCooldownMultiplier(team);
                    s51 = Math.sqrt(l51.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p51 = 1.5;
            }
            
            dist = v52 + p51 + s52 * 0.000001;
            if (v51 > dist) {
                v51 = dist;
                d51 = d52;
            }
            dist = v43 + p51 + s43 * 0.000001;
            if (v51 > dist) {
                v51 = dist;
                d51 = d43;
            }
            dist = v42 + p51 + s42 * 0.000001;
            if (v51 > dist) {
                v51 = dist;
                d51 = d42;
            }
            dist = v41 + p51 + s41 * 0.000001;
            if (v51 > dist) {
                v51 = dist;
                d51 = d41;
            }
        }

        if (rc.onTheMap(l41)) {
            if (rc.canSenseLocation(l41)) {
                MapInfo mapInfo = rc.senseMapInfo(l41);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l41) || (rc.sensePassability(l41) && !rc.canSenseRobotAtLocation(l41) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l41), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p41 = mapInfo.getCooldownMultiplier(team);
                    s41 = Math.sqrt(l41.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p41 = 1.5;
            }
            
            dist = v51 + p41 + s51 * 0.000001;
            if (v41 > dist) {
                v41 = dist;
                d41 = d51;
            }
            dist = v42 + p41 + s42 * 0.000001;
            if (v41 > dist) {
                v41 = dist;
                d41 = d42;
            }
            dist = v33 + p41 + s33 * 0.000001;
            if (v41 > dist) {
                v41 = dist;
                d41 = d33;
            }
            dist = v32 + p41 + s32 * 0.000001;
            if (v41 > dist) {
                v41 = dist;
                d41 = d32;
            }
        }

        if (rc.onTheMap(l23)) {
            if (rc.canSenseLocation(l23)) {
                MapInfo mapInfo = rc.senseMapInfo(l23);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l23) || (rc.sensePassability(l23) && !rc.canSenseRobotAtLocation(l23) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l23), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p23 = mapInfo.getCooldownMultiplier(team);
                    s23 = Math.sqrt(l23.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p23 = 1.5;
            }
            
            dist = v32 + p23 + s32 * 0.000001;
            if (v23 > dist) {
                v23 = dist;
                d23 = d32;
            }
            dist = v33 + p23 + s33 * 0.000001;
            if (v23 > dist) {
                v23 = dist;
                d23 = d33;
            }
            dist = v24 + p23 + s24 * 0.000001;
            if (v23 > dist) {
                v23 = dist;
                d23 = d24;
            }
        }

        if (rc.onTheMap(l14)) {
            if (rc.canSenseLocation(l14)) {
                MapInfo mapInfo = rc.senseMapInfo(l14);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l14) || (rc.sensePassability(l14) && !rc.canSenseRobotAtLocation(l14) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l14), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p14 = mapInfo.getCooldownMultiplier(team);
                    s14 = Math.sqrt(l14.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p14 = 1.5;
            }
            
            dist = v23 + p14 + s23 * 0.000001;
            if (v14 > dist) {
                v14 = dist;
                d14 = d23;
            }
            dist = v24 + p14 + s24 * 0.000001;
            if (v14 > dist) {
                v14 = dist;
                d14 = d24;
            }
        }

        if (rc.onTheMap(l50)) {
            if (rc.canSenseLocation(l50)) {
                MapInfo mapInfo = rc.senseMapInfo(l50);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l50) || (rc.sensePassability(l50) && !rc.canSenseRobotAtLocation(l50) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l50), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p50 = mapInfo.getCooldownMultiplier(team);
                    s50 = Math.sqrt(l50.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p50 = 1.5;
            }
            
            dist = v51 + p50 + s51 * 0.000001;
            if (v50 > dist) {
                v50 = dist;
                d50 = d51;
            }
            dist = v42 + p50 + s42 * 0.000001;
            if (v50 > dist) {
                v50 = dist;
                d50 = d42;
            }
            dist = v41 + p50 + s41 * 0.000001;
            if (v50 > dist) {
                v50 = dist;
                d50 = d41;
            }
        }

        if (rc.onTheMap(l54)) {
            if (rc.canSenseLocation(l54)) {
                MapInfo mapInfo = rc.senseMapInfo(l54);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l54) || (rc.sensePassability(l54) && !rc.canSenseRobotAtLocation(l54) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l54), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p54 = mapInfo.getCooldownMultiplier(team);
                    s54 = Math.sqrt(l54.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p54 = 1.5;
            }
            
            dist = v44 + p54 + s44 * 0.000001;
            if (v54 > dist) {
                v54 = dist;
                d54 = d44;
            }
            dist = v53 + p54 + s53 * 0.000001;
            if (v54 > dist) {
                v54 = dist;
                d54 = d53;
            }
        }

        if (rc.onTheMap(l31)) {
            if (rc.canSenseLocation(l31)) {
                MapInfo mapInfo = rc.senseMapInfo(l31);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l31) || (rc.sensePassability(l31) && !rc.canSenseRobotAtLocation(l31) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l31), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p31 = mapInfo.getCooldownMultiplier(team);
                    s31 = Math.sqrt(l31.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p31 = 1.5;
            }
            
            dist = v41 + p31 + s41 * 0.000001;
            if (v31 > dist) {
                v31 = dist;
                d31 = d41;
            }
            dist = v32 + p31 + s32 * 0.000001;
            if (v31 > dist) {
                v31 = dist;
                d31 = d32;
            }
            dist = v23 + p31 + s23 * 0.000001;
            if (v31 > dist) {
                v31 = dist;
                d31 = d23;
            }
        }

        if (rc.onTheMap(l60)) {
            if (rc.canSenseLocation(l60)) {
                MapInfo mapInfo = rc.senseMapInfo(l60);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l60) || (rc.sensePassability(l60) && !rc.canSenseRobotAtLocation(l60) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l60), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p60 = mapInfo.getCooldownMultiplier(team);
                    s60 = Math.sqrt(l60.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p60 = 1.5;
            }
            
            dist = v53 + p60 + s53 * 0.000001;
            if (v60 > dist) {
                v60 = dist;
                d60 = d53;
            }
            dist = v52 + p60 + s52 * 0.000001;
            if (v60 > dist) {
                v60 = dist;
                d60 = d52;
            }
            dist = v51 + p60 + s51 * 0.000001;
            if (v60 > dist) {
                v60 = dist;
                d60 = d51;
            }
        }

        if (rc.onTheMap(l59)) {
            if (rc.canSenseLocation(l59)) {
                MapInfo mapInfo = rc.senseMapInfo(l59);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l59) || (rc.sensePassability(l59) && !rc.canSenseRobotAtLocation(l59) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l59), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p59 = mapInfo.getCooldownMultiplier(team);
                    s59 = Math.sqrt(l59.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p59 = 1.5;
            }
            
            dist = v60 + p59 + s60 * 0.000001;
            if (v59 > dist) {
                v59 = dist;
                d59 = d60;
            }
            dist = v52 + p59 + s52 * 0.000001;
            if (v59 > dist) {
                v59 = dist;
                d59 = d52;
            }
            dist = v51 + p59 + s51 * 0.000001;
            if (v59 > dist) {
                v59 = dist;
                d59 = d51;
            }
            dist = v50 + p59 + s50 * 0.000001;
            if (v59 > dist) {
                v59 = dist;
                d59 = d50;
            }
        }

        if (rc.onTheMap(l40)) {
            if (rc.canSenseLocation(l40)) {
                MapInfo mapInfo = rc.senseMapInfo(l40);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l40) || (rc.sensePassability(l40) && !rc.canSenseRobotAtLocation(l40) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l40), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p40 = mapInfo.getCooldownMultiplier(team);
                    s40 = Math.sqrt(l40.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p40 = 1.5;
            }
            
            dist = v50 + p40 + s50 * 0.000001;
            if (v40 > dist) {
                v40 = dist;
                d40 = d50;
            }
            dist = v41 + p40 + s41 * 0.000001;
            if (v40 > dist) {
                v40 = dist;
                d40 = d41;
            }
            dist = v32 + p40 + s32 * 0.000001;
            if (v40 > dist) {
                v40 = dist;
                d40 = d32;
            }
            dist = v31 + p40 + s31 * 0.000001;
            if (v40 > dist) {
                v40 = dist;
                d40 = d31;
            }
        }

        if (rc.onTheMap(l22)) {
            if (rc.canSenseLocation(l22)) {
                MapInfo mapInfo = rc.senseMapInfo(l22);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l22) || (rc.sensePassability(l22) && !rc.canSenseRobotAtLocation(l22) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l22), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p22 = mapInfo.getCooldownMultiplier(team);
                    s22 = Math.sqrt(l22.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p22 = 1.5;
            }
            
            dist = v31 + p22 + s31 * 0.000001;
            if (v22 > dist) {
                v22 = dist;
                d22 = d31;
            }
            dist = v32 + p22 + s32 * 0.000001;
            if (v22 > dist) {
                v22 = dist;
                d22 = d32;
            }
            dist = v23 + p22 + s23 * 0.000001;
            if (v22 > dist) {
                v22 = dist;
                d22 = d23;
            }
            dist = v14 + p22 + s14 * 0.000001;
            if (v22 > dist) {
                v22 = dist;
                d22 = d14;
            }
        }

        if (rc.onTheMap(l61)) {
            if (rc.canSenseLocation(l61)) {
                MapInfo mapInfo = rc.senseMapInfo(l61);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l61) || (rc.sensePassability(l61) && !rc.canSenseRobotAtLocation(l61) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l61), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p61 = mapInfo.getCooldownMultiplier(team);
                    s61 = Math.sqrt(l61.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p61 = 1.5;
            }
            
            dist = v54 + p61 + s54 * 0.000001;
            if (v61 > dist) {
                v61 = dist;
                d61 = d54;
            }
            dist = v53 + p61 + s53 * 0.000001;
            if (v61 > dist) {
                v61 = dist;
                d61 = d53;
            }
            dist = v52 + p61 + s52 * 0.000001;
            if (v61 > dist) {
                v61 = dist;
                d61 = d52;
            }
            dist = v60 + p61 + s60 * 0.000001;
            if (v61 > dist) {
                v61 = dist;
                d61 = d60;
            }
        }

        if (rc.onTheMap(l62)) {
            if (rc.canSenseLocation(l62)) {
                MapInfo mapInfo = rc.senseMapInfo(l62);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l62) || (rc.sensePassability(l62) && !rc.canSenseRobotAtLocation(l62) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l62), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p62 = mapInfo.getCooldownMultiplier(team);
                    s62 = Math.sqrt(l62.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p62 = 1.5;
            }
            
            dist = v54 + p62 + s54 * 0.000001;
            if (v62 > dist) {
                v62 = dist;
                d62 = d54;
            }
            dist = v53 + p62 + s53 * 0.000001;
            if (v62 > dist) {
                v62 = dist;
                d62 = d53;
            }
            dist = v61 + p62 + s61 * 0.000001;
            if (v62 > dist) {
                v62 = dist;
                d62 = d61;
            }
        }

        if (rc.onTheMap(l58)) {
            if (rc.canSenseLocation(l58)) {
                MapInfo mapInfo = rc.senseMapInfo(l58);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l58) || (rc.sensePassability(l58) && !rc.canSenseRobotAtLocation(l58) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l58), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p58 = mapInfo.getCooldownMultiplier(team);
                    s58 = Math.sqrt(l58.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p58 = 1.5;
            }
            
            dist = v59 + p58 + s59 * 0.000001;
            if (v58 > dist) {
                v58 = dist;
                d58 = d59;
            }
            dist = v51 + p58 + s51 * 0.000001;
            if (v58 > dist) {
                v58 = dist;
                d58 = d51;
            }
            dist = v50 + p58 + s50 * 0.000001;
            if (v58 > dist) {
                v58 = dist;
                d58 = d50;
            }
            dist = v49 + p58 + s49 * 0.000001;
            if (v58 > dist) {
                v58 = dist;
                d58 = d49;
            }
        }

        if (rc.onTheMap(l49)) {
            if (rc.canSenseLocation(l49)) {
                MapInfo mapInfo = rc.senseMapInfo(l49);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l49) || (rc.sensePassability(l49) && !rc.canSenseRobotAtLocation(l49) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l49), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p49 = mapInfo.getCooldownMultiplier(team);
                    s49 = Math.sqrt(l49.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p49 = 1.5;
            }
            
            dist = v58 + p49 + s58 * 0.000001;
            if (v49 > dist) {
                v49 = dist;
                d49 = d58;
            }
            dist = v50 + p49 + s50 * 0.000001;
            if (v49 > dist) {
                v49 = dist;
                d49 = d50;
            }
            dist = v41 + p49 + s41 * 0.000001;
            if (v49 > dist) {
                v49 = dist;
                d49 = d41;
            }
            dist = v40 + p49 + s40 * 0.000001;
            if (v49 > dist) {
                v49 = dist;
                d49 = d40;
            }
        }

        if (rc.onTheMap(l13)) {
            if (rc.canSenseLocation(l13)) {
                MapInfo mapInfo = rc.senseMapInfo(l13);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l13) || (rc.sensePassability(l13) && !rc.canSenseRobotAtLocation(l13) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l13), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p13 = mapInfo.getCooldownMultiplier(team);
                    s13 = Math.sqrt(l13.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p13 = 1.5;
            }
            
            dist = v22 + p13 + s22 * 0.000001;
            if (v13 > dist) {
                v13 = dist;
                d13 = d22;
            }
            dist = v23 + p13 + s23 * 0.000001;
            if (v13 > dist) {
                v13 = dist;
                d13 = d23;
            }
            dist = v14 + p13 + s14 * 0.000001;
            if (v13 > dist) {
                v13 = dist;
                d13 = d14;
            }
        }

        if (rc.onTheMap(l63)) {
            if (rc.canSenseLocation(l63)) {
                MapInfo mapInfo = rc.senseMapInfo(l63);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l63) || (rc.sensePassability(l63) && !rc.canSenseRobotAtLocation(l63) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l63), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p63 = mapInfo.getCooldownMultiplier(team);
                    s63 = Math.sqrt(l63.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p63 = 1.5;
            }
            
            dist = v54 + p63 + s54 * 0.000001;
            if (v63 > dist) {
                v63 = dist;
                d63 = d54;
            }
            dist = v62 + p63 + s62 * 0.000001;
            if (v63 > dist) {
                v63 = dist;
                d63 = d62;
            }
        }

        if (rc.onTheMap(l57)) {
            if (rc.canSenseLocation(l57)) {
                MapInfo mapInfo = rc.senseMapInfo(l57);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l57) || (rc.sensePassability(l57) && !rc.canSenseRobotAtLocation(l57) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l57), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p57 = mapInfo.getCooldownMultiplier(team);
                    s57 = Math.sqrt(l57.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p57 = 1.5;
            }
            
            dist = v58 + p57 + s58 * 0.000001;
            if (v57 > dist) {
                v57 = dist;
                d57 = d58;
            }
            dist = v50 + p57 + s50 * 0.000001;
            if (v57 > dist) {
                v57 = dist;
                d57 = d50;
            }
            dist = v49 + p57 + s49 * 0.000001;
            if (v57 > dist) {
                v57 = dist;
                d57 = d49;
            }
        }

        if (rc.onTheMap(l5)) {
            if (rc.canSenseLocation(l5)) {
                MapInfo mapInfo = rc.senseMapInfo(l5);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l5) || (rc.sensePassability(l5) && !rc.canSenseRobotAtLocation(l5) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l5), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p5 = mapInfo.getCooldownMultiplier(team);
                    s5 = Math.sqrt(l5.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p5 = 1.5;
            }
            
            dist = v13 + p5 + s13 * 0.000001;
            if (v5 > dist) {
                v5 = dist;
                d5 = d13;
            }
            dist = v14 + p5 + s14 * 0.000001;
            if (v5 > dist) {
                v5 = dist;
                d5 = d14;
            }
        }

        if (rc.onTheMap(l66)) {
            if (rc.canSenseLocation(l66)) {
                MapInfo mapInfo = rc.senseMapInfo(l66);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l66) || (rc.sensePassability(l66) && !rc.canSenseRobotAtLocation(l66) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l66), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p66 = mapInfo.getCooldownMultiplier(team);
                    s66 = Math.sqrt(l66.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p66 = 1.5;
            }
            
            dist = v61 + p66 + s61 * 0.000001;
            if (v66 > dist) {
                v66 = dist;
                d66 = d61;
            }
            dist = v60 + p66 + s60 * 0.000001;
            if (v66 > dist) {
                v66 = dist;
                d66 = d60;
            }
            dist = v59 + p66 + s59 * 0.000001;
            if (v66 > dist) {
                v66 = dist;
                d66 = d59;
            }
        }

        if (rc.onTheMap(l30)) {
            if (rc.canSenseLocation(l30)) {
                MapInfo mapInfo = rc.senseMapInfo(l30);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l30) || (rc.sensePassability(l30) && !rc.canSenseRobotAtLocation(l30) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l30), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p30 = mapInfo.getCooldownMultiplier(team);
                    s30 = Math.sqrt(l30.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p30 = 1.5;
            }
            
            dist = v40 + p30 + s40 * 0.000001;
            if (v30 > dist) {
                v30 = dist;
                d30 = d40;
            }
            dist = v31 + p30 + s31 * 0.000001;
            if (v30 > dist) {
                v30 = dist;
                d30 = d31;
            }
            dist = v22 + p30 + s22 * 0.000001;
            if (v30 > dist) {
                v30 = dist;
                d30 = d22;
            }
        }

        if (rc.onTheMap(l39)) {
            if (rc.canSenseLocation(l39)) {
                MapInfo mapInfo = rc.senseMapInfo(l39);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l39) || (rc.sensePassability(l39) && !rc.canSenseRobotAtLocation(l39) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l39), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p39 = mapInfo.getCooldownMultiplier(team);
                    s39 = Math.sqrt(l39.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p39 = 1.5;
            }
            
            dist = v49 + p39 + s49 * 0.000001;
            if (v39 > dist) {
                v39 = dist;
                d39 = d49;
            }
            dist = v40 + p39 + s40 * 0.000001;
            if (v39 > dist) {
                v39 = dist;
                d39 = d40;
            }
            dist = v31 + p39 + s31 * 0.000001;
            if (v39 > dist) {
                v39 = dist;
                d39 = d31;
            }
            dist = v30 + p39 + s30 * 0.000001;
            if (v39 > dist) {
                v39 = dist;
                d39 = d30;
            }
        }

        if (rc.onTheMap(l67)) {
            if (rc.canSenseLocation(l67)) {
                MapInfo mapInfo = rc.senseMapInfo(l67);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l67) || (rc.sensePassability(l67) && !rc.canSenseRobotAtLocation(l67) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l67), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p67 = mapInfo.getCooldownMultiplier(team);
                    s67 = Math.sqrt(l67.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p67 = 1.5;
            }
            
            dist = v62 + p67 + s62 * 0.000001;
            if (v67 > dist) {
                v67 = dist;
                d67 = d62;
            }
            dist = v61 + p67 + s61 * 0.000001;
            if (v67 > dist) {
                v67 = dist;
                d67 = d61;
            }
            dist = v60 + p67 + s60 * 0.000001;
            if (v67 > dist) {
                v67 = dist;
                d67 = d60;
            }
            dist = v66 + p67 + s66 * 0.000001;
            if (v67 > dist) {
                v67 = dist;
                d67 = d66;
            }
        }

        if (rc.onTheMap(l21)) {
            if (rc.canSenseLocation(l21)) {
                MapInfo mapInfo = rc.senseMapInfo(l21);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l21) || (rc.sensePassability(l21) && !rc.canSenseRobotAtLocation(l21) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l21), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p21 = mapInfo.getCooldownMultiplier(team);
                    s21 = Math.sqrt(l21.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p21 = 1.5;
            }
            
            dist = v30 + p21 + s30 * 0.000001;
            if (v21 > dist) {
                v21 = dist;
                d21 = d30;
            }
            dist = v31 + p21 + s31 * 0.000001;
            if (v21 > dist) {
                v21 = dist;
                d21 = d31;
            }
            dist = v22 + p21 + s22 * 0.000001;
            if (v21 > dist) {
                v21 = dist;
                d21 = d22;
            }
            dist = v13 + p21 + s13 * 0.000001;
            if (v21 > dist) {
                v21 = dist;
                d21 = d13;
            }
        }

        if (rc.onTheMap(l65)) {
            if (rc.canSenseLocation(l65)) {
                MapInfo mapInfo = rc.senseMapInfo(l65);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l65) || (rc.sensePassability(l65) && !rc.canSenseRobotAtLocation(l65) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l65), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p65 = mapInfo.getCooldownMultiplier(team);
                    s65 = Math.sqrt(l65.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p65 = 1.5;
            }
            
            dist = v66 + p65 + s66 * 0.000001;
            if (v65 > dist) {
                v65 = dist;
                d65 = d66;
            }
            dist = v60 + p65 + s60 * 0.000001;
            if (v65 > dist) {
                v65 = dist;
                d65 = d60;
            }
            dist = v59 + p65 + s59 * 0.000001;
            if (v65 > dist) {
                v65 = dist;
                d65 = d59;
            }
            dist = v58 + p65 + s58 * 0.000001;
            if (v65 > dist) {
                v65 = dist;
                d65 = d58;
            }
        }

        if (rc.onTheMap(l68)) {
            if (rc.canSenseLocation(l68)) {
                MapInfo mapInfo = rc.senseMapInfo(l68);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l68) || (rc.sensePassability(l68) && !rc.canSenseRobotAtLocation(l68) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l68), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p68 = mapInfo.getCooldownMultiplier(team);
                    s68 = Math.sqrt(l68.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p68 = 1.5;
            }
            
            dist = v63 + p68 + s63 * 0.000001;
            if (v68 > dist) {
                v68 = dist;
                d68 = d63;
            }
            dist = v62 + p68 + s62 * 0.000001;
            if (v68 > dist) {
                v68 = dist;
                d68 = d62;
            }
            dist = v61 + p68 + s61 * 0.000001;
            if (v68 > dist) {
                v68 = dist;
                d68 = d61;
            }
            dist = v67 + p68 + s67 * 0.000001;
            if (v68 > dist) {
                v68 = dist;
                d68 = d67;
            }
        }

        if (rc.onTheMap(l64)) {
            if (rc.canSenseLocation(l64)) {
                MapInfo mapInfo = rc.senseMapInfo(l64);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l64) || (rc.sensePassability(l64) && !rc.canSenseRobotAtLocation(l64) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l64), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p64 = mapInfo.getCooldownMultiplier(team);
                    s64 = Math.sqrt(l64.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p64 = 1.5;
            }
            
            dist = v65 + p64 + s65 * 0.000001;
            if (v64 > dist) {
                v64 = dist;
                d64 = d65;
            }
            dist = v59 + p64 + s59 * 0.000001;
            if (v64 > dist) {
                v64 = dist;
                d64 = d59;
            }
            dist = v58 + p64 + s58 * 0.000001;
            if (v64 > dist) {
                v64 = dist;
                d64 = d58;
            }
            dist = v57 + p64 + s57 * 0.000001;
            if (v64 > dist) {
                v64 = dist;
                d64 = d57;
            }
        }

        if (rc.onTheMap(l12)) {
            if (rc.canSenseLocation(l12)) {
                MapInfo mapInfo = rc.senseMapInfo(l12);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l12) || (rc.sensePassability(l12) && !rc.canSenseRobotAtLocation(l12) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l12), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p12 = mapInfo.getCooldownMultiplier(team);
                    s12 = Math.sqrt(l12.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p12 = 1.5;
            }
            
            dist = v21 + p12 + s21 * 0.000001;
            if (v12 > dist) {
                v12 = dist;
                d12 = d21;
            }
            dist = v22 + p12 + s22 * 0.000001;
            if (v12 > dist) {
                v12 = dist;
                d12 = d22;
            }
            dist = v13 + p12 + s13 * 0.000001;
            if (v12 > dist) {
                v12 = dist;
                d12 = d13;
            }
            dist = v5 + p12 + s5 * 0.000001;
            if (v12 > dist) {
                v12 = dist;
                d12 = d5;
            }
        }

        if (rc.onTheMap(l48)) {
            if (rc.canSenseLocation(l48)) {
                MapInfo mapInfo = rc.senseMapInfo(l48);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l48) || (rc.sensePassability(l48) && !rc.canSenseRobotAtLocation(l48) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l48), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p48 = mapInfo.getCooldownMultiplier(team);
                    s48 = Math.sqrt(l48.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p48 = 1.5;
            }
            
            dist = v57 + p48 + s57 * 0.000001;
            if (v48 > dist) {
                v48 = dist;
                d48 = d57;
            }
            dist = v49 + p48 + s49 * 0.000001;
            if (v48 > dist) {
                v48 = dist;
                d48 = d49;
            }
            dist = v40 + p48 + s40 * 0.000001;
            if (v48 > dist) {
                v48 = dist;
                d48 = d40;
            }
            dist = v39 + p48 + s39 * 0.000001;
            if (v48 > dist) {
                v48 = dist;
                d48 = d39;
            }
        }
    
        int dx = targetLocation.x - l34.x;
        int dy = targetLocation.y - l34.y;

        switch(dx) {
            case -4:
                switch(dy) {
                } break;

            case -3:
                switch(dy) {
                    case -3:
                        if (v5 < 1000000) {
                            bug.reset();
                            return d5;
                        } break;
                } break;

            case -2:
                switch(dy) {
                    case -4:
                        if (v12 < 1000000) {
                            bug.reset();
                            return d12;
                        } break;
                    case -3:
                        if (v13 < 1000000) {
                            bug.reset();
                            return d13;
                        } break;
                    case -2:
                        if (v14 < 1000000) {
                            bug.reset();
                            return d14;
                        } break;
                } break;

            case -1:
                switch(dy) {
                    case -4:
                        if (v21 < 1000000) {
                            bug.reset();
                            return d21;
                        } break;
                    case -3:
                        if (v22 < 1000000) {
                            bug.reset();
                            return d22;
                        } break;
                    case -2:
                        if (v23 < 1000000) {
                            bug.reset();
                            return d23;
                        } break;
                    case -1:
                        if (v24 < 1000000) {
                            bug.reset();
                            return d24;
                        } break;
                } break;

            case 0:
                switch(dy) {
                    case -4:
                        if (v30 < 1000000) {
                            bug.reset();
                            return d30;
                        } break;
                    case -3:
                        if (v31 < 1000000) {
                            bug.reset();
                            return d31;
                        } break;
                    case -2:
                        if (v32 < 1000000) {
                            bug.reset();
                            return d32;
                        } break;
                    case -1:
                        if (v33 < 1000000) {
                            bug.reset();
                            return d33;
                        } break;
                } break;

            case 1:
                switch(dy) {
                    case -4:
                        if (v39 < 1000000) {
                            bug.reset();
                            return d39;
                        } break;
                    case -3:
                        if (v40 < 1000000) {
                            bug.reset();
                            return d40;
                        } break;
                    case -2:
                        if (v41 < 1000000) {
                            bug.reset();
                            return d41;
                        } break;
                    case -1:
                        if (v42 < 1000000) {
                            bug.reset();
                            return d42;
                        } break;
                    case 0:
                        if (v43 < 1000000) {
                            bug.reset();
                            return d43;
                        } break;
                    case 1:
                        if (v44 < 1000000) {
                            bug.reset();
                            return d44;
                        } break;
                } break;

            case 2:
                switch(dy) {
                    case -4:
                        if (v48 < 1000000) {
                            bug.reset();
                            return d48;
                        } break;
                    case -3:
                        if (v49 < 1000000) {
                            bug.reset();
                            return d49;
                        } break;
                    case -2:
                        if (v50 < 1000000) {
                            bug.reset();
                            return d50;
                        } break;
                    case -1:
                        if (v51 < 1000000) {
                            bug.reset();
                            return d51;
                        } break;
                    case 0:
                        if (v52 < 1000000) {
                            bug.reset();
                            return d52;
                        } break;
                    case 1:
                        if (v53 < 1000000) {
                            bug.reset();
                            return d53;
                        } break;
                    case 2:
                        if (v54 < 1000000) {
                            bug.reset();
                            return d54;
                        } break;
                } break;

            case 3:
                switch(dy) {
                    case -3:
                        if (v57 < 1000000) {
                            bug.reset();
                            return d57;
                        } break;
                    case -2:
                        if (v58 < 1000000) {
                            bug.reset();
                            return d58;
                        } break;
                    case -1:
                        if (v59 < 1000000) {
                            bug.reset();
                            return d59;
                        } break;
                    case 0:
                        if (v60 < 1000000) {
                            bug.reset();
                            return d60;
                        } break;
                    case 1:
                        if (v61 < 1000000) {
                            bug.reset();
                            return d61;
                        } break;
                    case 2:
                        if (v62 < 1000000) {
                            bug.reset();
                            return d62;
                        } break;
                    case 3:
                        if (v63 < 1000000) {
                            bug.reset();
                            return d63;
                        } break;
                } break;

            case 4:
                switch(dy) {
                    case -2:
                        if (v64 < 1000000) {
                            bug.reset();
                            return d64;
                        } break;
                    case -1:
                        if (v65 < 1000000) {
                            bug.reset();
                            return d65;
                        } break;
                    case 0:
                        if (v66 < 1000000) {
                            bug.reset();
                            return d66;
                        } break;
                    case 1:
                        if (v67 < 1000000) {
                            bug.reset();
                            return d67;
                        } break;
                    case 2:
                        if (v68 < 1000000) {
                            bug.reset();
                            return d68;
                        } break;
                } break;

        }
    
        Direction ans = Direction.CENTER;

        double dist5 = v5 + s5;
        if (dist5 < localBest) {
            localBest = dist5;
            ans = d5;
        }

        double dist12 = v12 + s12;
        if (dist12 < localBest) {
            localBest = dist12;
            ans = d12;
        }

        double dist13 = v13 + s13;
        if (dist13 < localBest) {
            localBest = dist13;
            ans = d13;
        }

        double dist14 = v14 + s14;
        if (dist14 < localBest) {
            localBest = dist14;
            ans = d14;
        }

        double dist21 = v21 + s21;
        if (dist21 < localBest) {
            localBest = dist21;
            ans = d21;
        }

        double dist22 = v22 + s22;
        if (dist22 < localBest) {
            localBest = dist22;
            ans = d22;
        }

        double dist23 = v23 + s23;
        if (dist23 < localBest) {
            localBest = dist23;
            ans = d23;
        }

        double dist24 = v24 + s24;
        if (dist24 < localBest) {
            localBest = dist24;
            ans = d24;
        }

        double dist30 = v30 + s30;
        if (dist30 < localBest) {
            localBest = dist30;
            ans = d30;
        }

        double dist31 = v31 + s31;
        if (dist31 < localBest) {
            localBest = dist31;
            ans = d31;
        }

        double dist32 = v32 + s32;
        if (dist32 < localBest) {
            localBest = dist32;
            ans = d32;
        }

        double dist33 = v33 + s33;
        if (dist33 < localBest) {
            localBest = dist33;
            ans = d33;
        }

        double dist39 = v39 + s39;
        if (dist39 < localBest) {
            localBest = dist39;
            ans = d39;
        }

        double dist40 = v40 + s40;
        if (dist40 < localBest) {
            localBest = dist40;
            ans = d40;
        }

        double dist41 = v41 + s41;
        if (dist41 < localBest) {
            localBest = dist41;
            ans = d41;
        }

        double dist42 = v42 + s42;
        if (dist42 < localBest) {
            localBest = dist42;
            ans = d42;
        }

        double dist43 = v43 + s43;
        if (dist43 < localBest) {
            localBest = dist43;
            ans = d43;
        }

        double dist44 = v44 + s44;
        if (dist44 < localBest) {
            localBest = dist44;
            ans = d44;
        }

        double dist48 = v48 + s48;
        if (dist48 < localBest) {
            localBest = dist48;
            ans = d48;
        }

        double dist49 = v49 + s49;
        if (dist49 < localBest) {
            localBest = dist49;
            ans = d49;
        }

        double dist50 = v50 + s50;
        if (dist50 < localBest) {
            localBest = dist50;
            ans = d50;
        }

        double dist51 = v51 + s51;
        if (dist51 < localBest) {
            localBest = dist51;
            ans = d51;
        }

        double dist52 = v52 + s52;
        if (dist52 < localBest) {
            localBest = dist52;
            ans = d52;
        }

        double dist53 = v53 + s53;
        if (dist53 < localBest) {
            localBest = dist53;
            ans = d53;
        }

        double dist54 = v54 + s54;
        if (dist54 < localBest) {
            localBest = dist54;
            ans = d54;
        }

        double dist57 = v57 + s57;
        if (dist57 < localBest) {
            localBest = dist57;
            ans = d57;
        }

        double dist58 = v58 + s58;
        if (dist58 < localBest) {
            localBest = dist58;
            ans = d58;
        }

        double dist59 = v59 + s59;
        if (dist59 < localBest) {
            localBest = dist59;
            ans = d59;
        }

        double dist60 = v60 + s60;
        if (dist60 < localBest) {
            localBest = dist60;
            ans = d60;
        }

        double dist61 = v61 + s61;
        if (dist61 < localBest) {
            localBest = dist61;
            ans = d61;
        }

        double dist62 = v62 + s62;
        if (dist62 < localBest) {
            localBest = dist62;
            ans = d62;
        }

        double dist63 = v63 + s63;
        if (dist63 < localBest) {
            localBest = dist63;
            ans = d63;
        }

        double dist64 = v64 + s64;
        if (dist64 < localBest) {
            localBest = dist64;
            ans = d64;
        }

        double dist65 = v65 + s65;
        if (dist65 < localBest) {
            localBest = dist65;
            ans = d65;
        }

        double dist66 = v66 + s66;
        if (dist66 < localBest) {
            localBest = dist66;
            ans = d66;
        }

        double dist67 = v67 + s67;
        if (dist67 < localBest) {
            localBest = dist67;
            ans = d67;
        }

        double dist68 = v68 + s68;
        if (dist68 < localBest) {
            localBest = dist68;
            ans = d68;
        }

        if (localBest < globalBest) {
            globalBest = localBest;
            bug.reset();
            return ans;
        }

        consecutiveBugNavRoundCount += 1;

        if (consecutiveBugNavRoundCount > 40) {
            globalBest = 1000000;
            consecutiveBugNavRoundCount = 0;
        }

        bug.move(targetLocation, lastDirection);
        return null;
    }

    private Direction getBestDirection4() throws GameActionException {
        double localBest = 1000000.0;
        double dist = 0.0;
        l34 = currentLocation;
        v34 = 0;
        d43 = null;
        l43 = l34.add(Direction.EAST);
        v43 = 1000000;
        p43 = 1000000;
        s43 = Math.sqrt(l43.distanceSquaredTo(targetLocation));
        d25 = null;
        l25 = l34.add(Direction.WEST);
        v25 = 1000000;
        p25 = 1000000;
        s25 = Math.sqrt(l25.distanceSquaredTo(targetLocation));
        d24 = null;
        l24 = l34.add(Direction.SOUTHWEST);
        v24 = 1000000;
        p24 = 1000000;
        s24 = Math.sqrt(l24.distanceSquaredTo(targetLocation));
        d33 = null;
        l33 = l34.add(Direction.SOUTH);
        v33 = 1000000;
        p33 = 1000000;
        s33 = Math.sqrt(l33.distanceSquaredTo(targetLocation));
        d42 = null;
        l42 = l34.add(Direction.SOUTHEAST);
        v42 = 1000000;
        p42 = 1000000;
        s42 = Math.sqrt(l42.distanceSquaredTo(targetLocation));
        d23 = null;
        l23 = l33.add(Direction.SOUTHWEST);
        v23 = 1000000;
        p23 = 1000000;
        s23 = Math.sqrt(l23.distanceSquaredTo(targetLocation));
        d32 = null;
        l32 = l33.add(Direction.SOUTH);
        v32 = 1000000;
        p32 = 1000000;
        s32 = Math.sqrt(l32.distanceSquaredTo(targetLocation));
        d41 = null;
        l41 = l33.add(Direction.SOUTHEAST);
        v41 = 1000000;
        p41 = 1000000;
        s41 = Math.sqrt(l41.distanceSquaredTo(targetLocation));
        d16 = null;
        l16 = l25.add(Direction.WEST);
        v16 = 1000000;
        p16 = 1000000;
        s16 = Math.sqrt(l16.distanceSquaredTo(targetLocation));
        d15 = null;
        l15 = l25.add(Direction.SOUTHWEST);
        v15 = 1000000;
        p15 = 1000000;
        s15 = Math.sqrt(l15.distanceSquaredTo(targetLocation));
        d52 = null;
        l52 = l43.add(Direction.EAST);
        v52 = 1000000;
        p52 = 1000000;
        s52 = Math.sqrt(l52.distanceSquaredTo(targetLocation));
        d51 = null;
        l51 = l43.add(Direction.SOUTHEAST);
        v51 = 1000000;
        p51 = 1000000;
        s51 = Math.sqrt(l51.distanceSquaredTo(targetLocation));
        d50 = null;
        l50 = l42.add(Direction.SOUTHEAST);
        v50 = 1000000;
        p50 = 1000000;
        s50 = Math.sqrt(l50.distanceSquaredTo(targetLocation));
        d14 = null;
        l14 = l24.add(Direction.SOUTHWEST);
        v14 = 1000000;
        p14 = 1000000;
        s14 = Math.sqrt(l14.distanceSquaredTo(targetLocation));
        d60 = null;
        l60 = l52.add(Direction.EAST);
        v60 = 1000000;
        p60 = 1000000;
        s60 = Math.sqrt(l60.distanceSquaredTo(targetLocation));
        d59 = null;
        l59 = l52.add(Direction.SOUTHEAST);
        v59 = 1000000;
        p59 = 1000000;
        s59 = Math.sqrt(l59.distanceSquaredTo(targetLocation));
        d22 = null;
        l22 = l32.add(Direction.SOUTHWEST);
        v22 = 1000000;
        p22 = 1000000;
        s22 = Math.sqrt(l22.distanceSquaredTo(targetLocation));
        d31 = null;
        l31 = l32.add(Direction.SOUTH);
        v31 = 1000000;
        p31 = 1000000;
        s31 = Math.sqrt(l31.distanceSquaredTo(targetLocation));
        d40 = null;
        l40 = l32.add(Direction.SOUTHEAST);
        v40 = 1000000;
        p40 = 1000000;
        s40 = Math.sqrt(l40.distanceSquaredTo(targetLocation));
        d8 = null;
        l8 = l16.add(Direction.WEST);
        v8 = 1000000;
        p8 = 1000000;
        s8 = Math.sqrt(l8.distanceSquaredTo(targetLocation));
        d7 = null;
        l7 = l16.add(Direction.SOUTHWEST);
        v7 = 1000000;
        p7 = 1000000;
        s7 = Math.sqrt(l7.distanceSquaredTo(targetLocation));
        d58 = null;
        l58 = l51.add(Direction.SOUTHEAST);
        v58 = 1000000;
        p58 = 1000000;
        s58 = Math.sqrt(l58.distanceSquaredTo(targetLocation));
        d6 = null;
        l6 = l15.add(Direction.SOUTHWEST);
        v6 = 1000000;
        p6 = 1000000;
        s6 = Math.sqrt(l6.distanceSquaredTo(targetLocation));
        d13 = null;
        l13 = l23.add(Direction.SOUTHWEST);
        v13 = 1000000;
        p13 = 1000000;
        s13 = Math.sqrt(l13.distanceSquaredTo(targetLocation));
        d49 = null;
        l49 = l41.add(Direction.SOUTHEAST);
        v49 = 1000000;
        p49 = 1000000;
        s49 = Math.sqrt(l49.distanceSquaredTo(targetLocation));
        d57 = null;
        l57 = l50.add(Direction.SOUTHEAST);
        v57 = 1000000;
        p57 = 1000000;
        s57 = Math.sqrt(l57.distanceSquaredTo(targetLocation));
        d5 = null;
        l5 = l14.add(Direction.SOUTHWEST);
        v5 = 1000000;
        p5 = 1000000;
        s5 = Math.sqrt(l5.distanceSquaredTo(targetLocation));
        d66 = null;
        l66 = l60.add(Direction.EAST);
        v66 = 1000000;
        p66 = 1000000;
        s66 = Math.sqrt(l66.distanceSquaredTo(targetLocation));
        d65 = null;
        l65 = l60.add(Direction.SOUTHEAST);
        v65 = 1000000;
        p65 = 1000000;
        s65 = Math.sqrt(l65.distanceSquaredTo(targetLocation));
        d21 = null;
        l21 = l31.add(Direction.SOUTHWEST);
        v21 = 1000000;
        p21 = 1000000;
        s21 = Math.sqrt(l21.distanceSquaredTo(targetLocation));
        d30 = null;
        l30 = l31.add(Direction.SOUTH);
        v30 = 1000000;
        p30 = 1000000;
        s30 = Math.sqrt(l30.distanceSquaredTo(targetLocation));
        d39 = null;
        l39 = l31.add(Direction.SOUTHEAST);
        v39 = 1000000;
        p39 = 1000000;
        s39 = Math.sqrt(l39.distanceSquaredTo(targetLocation));
        d2 = null;
        l2 = l8.add(Direction.WEST);
        v2 = 1000000;
        p2 = 1000000;
        s2 = Math.sqrt(l2.distanceSquaredTo(targetLocation));
        d1 = null;
        l1 = l8.add(Direction.SOUTHWEST);
        v1 = 1000000;
        p1 = 1000000;
        s1 = Math.sqrt(l1.distanceSquaredTo(targetLocation));
        d64 = null;
        l64 = l59.add(Direction.SOUTHEAST);
        v64 = 1000000;
        p64 = 1000000;
        s64 = Math.sqrt(l64.distanceSquaredTo(targetLocation));
        d12 = null;
        l12 = l22.add(Direction.SOUTHWEST);
        v12 = 1000000;
        p12 = 1000000;
        s12 = Math.sqrt(l12.distanceSquaredTo(targetLocation));
        d0 = null;
        l0 = l7.add(Direction.SOUTHWEST);
        v0 = 1000000;
        p0 = 1000000;
        s0 = Math.sqrt(l0.distanceSquaredTo(targetLocation));
        d48 = null;
        l48 = l40.add(Direction.SOUTHEAST);
        v48 = 1000000;
        p48 = 1000000;
        s48 = Math.sqrt(l48.distanceSquaredTo(targetLocation));
    

        if (rc.onTheMap(l33) && rc.canMove(Direction.SOUTH)) {
            if (rc.canSenseLocation(l33)) {
                MapInfo mapInfo = rc.senseMapInfo(l33);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l33) || (rc.sensePassability(l33) && !rc.canSenseRobotAtLocation(l33) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l33), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p33 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p33 = 1.5;
            }
            
            dist = v43 + p33 + s43 * 0.000001;
            if (v33 > dist) {
                v33 = dist;
                d33 = d43;
            }
            dist = v34 + p33 + s34 * 0.000001;
            if (v33 > dist) {
                v33 = dist;
                d33 = Direction.SOUTH;
            }
            dist = v25 + p33 + s25 * 0.000001;
            if (v33 > dist) {
                v33 = dist;
                d33 = d25;
            }
        }

        if (rc.onTheMap(l25) && rc.canMove(Direction.WEST)) {
            if (rc.canSenseLocation(l25)) {
                MapInfo mapInfo = rc.senseMapInfo(l25);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l25) || (rc.sensePassability(l25) && !rc.canSenseRobotAtLocation(l25) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l25), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p25 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p25 = 1.5;
            }
            
            dist = v34 + p25 + s34 * 0.000001;
            if (v25 > dist) {
                v25 = dist;
                d25 = Direction.WEST;
            }
            dist = v33 + p25 + s33 * 0.000001;
            if (v25 > dist) {
                v25 = dist;
                d25 = d33;
            }
        }

        if (rc.onTheMap(l43) && rc.canMove(Direction.EAST)) {
            if (rc.canSenseLocation(l43)) {
                MapInfo mapInfo = rc.senseMapInfo(l43);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l43) || (rc.sensePassability(l43) && !rc.canSenseRobotAtLocation(l43) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l43), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p43 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p43 = 1.5;
            }
            
            dist = v34 + p43 + s34 * 0.000001;
            if (v43 > dist) {
                v43 = dist;
                d43 = Direction.EAST;
            }
            dist = v33 + p43 + s33 * 0.000001;
            if (v43 > dist) {
                v43 = dist;
                d43 = d33;
            }
        }

        if (rc.onTheMap(l42) && rc.canMove(Direction.SOUTHEAST)) {
            if (rc.canSenseLocation(l42)) {
                MapInfo mapInfo = rc.senseMapInfo(l42);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l42) || (rc.sensePassability(l42) && !rc.canSenseRobotAtLocation(l42) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l42), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p42 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p42 = 1.5;
            }
            
            dist = v43 + p42 + s43 * 0.000001;
            if (v42 > dist) {
                v42 = dist;
                d42 = d43;
            }
            dist = v34 + p42 + s34 * 0.000001;
            if (v42 > dist) {
                v42 = dist;
                d42 = Direction.SOUTHEAST;
            }
            dist = v33 + p42 + s33 * 0.000001;
            if (v42 > dist) {
                v42 = dist;
                d42 = d33;
            }
        }

        if (rc.onTheMap(l24) && rc.canMove(Direction.SOUTHWEST)) {
            if (rc.canSenseLocation(l24)) {
                MapInfo mapInfo = rc.senseMapInfo(l24);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l24) || (rc.sensePassability(l24) && !rc.canSenseRobotAtLocation(l24) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l24), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p24 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p24 = 1.5;
            }
            
            dist = v33 + p24 + s33 * 0.000001;
            if (v24 > dist) {
                v24 = dist;
                d24 = d33;
            }
            dist = v34 + p24 + s34 * 0.000001;
            if (v24 > dist) {
                v24 = dist;
                d24 = Direction.SOUTHWEST;
            }
            dist = v25 + p24 + s25 * 0.000001;
            if (v24 > dist) {
                v24 = dist;
                d24 = d25;
            }
        }

        if (rc.onTheMap(l52)) {
            if (rc.canSenseLocation(l52)) {
                MapInfo mapInfo = rc.senseMapInfo(l52);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l52) || (rc.sensePassability(l52) && !rc.canSenseRobotAtLocation(l52) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l52), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p52 = mapInfo.getCooldownMultiplier(team);
                    s52 = Math.sqrt(l52.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p52 = 1.5;
            }
            
            dist = v43 + p52 + s43 * 0.000001;
            if (v52 > dist) {
                v52 = dist;
                d52 = d43;
            }
            dist = v42 + p52 + s42 * 0.000001;
            if (v52 > dist) {
                v52 = dist;
                d52 = d42;
            }
        }

        if (rc.onTheMap(l32)) {
            if (rc.canSenseLocation(l32)) {
                MapInfo mapInfo = rc.senseMapInfo(l32);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l32) || (rc.sensePassability(l32) && !rc.canSenseRobotAtLocation(l32) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l32), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p32 = mapInfo.getCooldownMultiplier(team);
                    s32 = Math.sqrt(l32.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p32 = 1.5;
            }
            
            dist = v42 + p32 + s42 * 0.000001;
            if (v32 > dist) {
                v32 = dist;
                d32 = d42;
            }
            dist = v33 + p32 + s33 * 0.000001;
            if (v32 > dist) {
                v32 = dist;
                d32 = d33;
            }
            dist = v24 + p32 + s24 * 0.000001;
            if (v32 > dist) {
                v32 = dist;
                d32 = d24;
            }
        }

        if (rc.onTheMap(l16)) {
            if (rc.canSenseLocation(l16)) {
                MapInfo mapInfo = rc.senseMapInfo(l16);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l16) || (rc.sensePassability(l16) && !rc.canSenseRobotAtLocation(l16) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l16), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p16 = mapInfo.getCooldownMultiplier(team);
                    s16 = Math.sqrt(l16.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p16 = 1.5;
            }
            
            dist = v25 + p16 + s25 * 0.000001;
            if (v16 > dist) {
                v16 = dist;
                d16 = d25;
            }
            dist = v24 + p16 + s24 * 0.000001;
            if (v16 > dist) {
                v16 = dist;
                d16 = d24;
            }
        }

        if (rc.onTheMap(l51)) {
            if (rc.canSenseLocation(l51)) {
                MapInfo mapInfo = rc.senseMapInfo(l51);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l51) || (rc.sensePassability(l51) && !rc.canSenseRobotAtLocation(l51) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l51), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p51 = mapInfo.getCooldownMultiplier(team);
                    s51 = Math.sqrt(l51.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p51 = 1.5;
            }
            
            dist = v52 + p51 + s52 * 0.000001;
            if (v51 > dist) {
                v51 = dist;
                d51 = d52;
            }
            dist = v43 + p51 + s43 * 0.000001;
            if (v51 > dist) {
                v51 = dist;
                d51 = d43;
            }
            dist = v42 + p51 + s42 * 0.000001;
            if (v51 > dist) {
                v51 = dist;
                d51 = d42;
            }
            dist = v41 + p51 + s41 * 0.000001;
            if (v51 > dist) {
                v51 = dist;
                d51 = d41;
            }
        }

        if (rc.onTheMap(l15)) {
            if (rc.canSenseLocation(l15)) {
                MapInfo mapInfo = rc.senseMapInfo(l15);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l15) || (rc.sensePassability(l15) && !rc.canSenseRobotAtLocation(l15) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l15), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p15 = mapInfo.getCooldownMultiplier(team);
                    s15 = Math.sqrt(l15.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p15 = 1.5;
            }
            
            dist = v24 + p15 + s24 * 0.000001;
            if (v15 > dist) {
                v15 = dist;
                d15 = d24;
            }
            dist = v25 + p15 + s25 * 0.000001;
            if (v15 > dist) {
                v15 = dist;
                d15 = d25;
            }
            dist = v16 + p15 + s16 * 0.000001;
            if (v15 > dist) {
                v15 = dist;
                d15 = d16;
            }
            dist = v23 + p15 + s23 * 0.000001;
            if (v15 > dist) {
                v15 = dist;
                d15 = d23;
            }
        }

        if (rc.onTheMap(l23)) {
            if (rc.canSenseLocation(l23)) {
                MapInfo mapInfo = rc.senseMapInfo(l23);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l23) || (rc.sensePassability(l23) && !rc.canSenseRobotAtLocation(l23) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l23), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p23 = mapInfo.getCooldownMultiplier(team);
                    s23 = Math.sqrt(l23.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p23 = 1.5;
            }
            
            dist = v32 + p23 + s32 * 0.000001;
            if (v23 > dist) {
                v23 = dist;
                d23 = d32;
            }
            dist = v33 + p23 + s33 * 0.000001;
            if (v23 > dist) {
                v23 = dist;
                d23 = d33;
            }
            dist = v24 + p23 + s24 * 0.000001;
            if (v23 > dist) {
                v23 = dist;
                d23 = d24;
            }
            dist = v15 + p23 + s15 * 0.000001;
            if (v23 > dist) {
                v23 = dist;
                d23 = d15;
            }
        }

        if (rc.onTheMap(l41)) {
            if (rc.canSenseLocation(l41)) {
                MapInfo mapInfo = rc.senseMapInfo(l41);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l41) || (rc.sensePassability(l41) && !rc.canSenseRobotAtLocation(l41) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l41), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p41 = mapInfo.getCooldownMultiplier(team);
                    s41 = Math.sqrt(l41.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p41 = 1.5;
            }
            
            dist = v51 + p41 + s51 * 0.000001;
            if (v41 > dist) {
                v41 = dist;
                d41 = d51;
            }
            dist = v42 + p41 + s42 * 0.000001;
            if (v41 > dist) {
                v41 = dist;
                d41 = d42;
            }
            dist = v33 + p41 + s33 * 0.000001;
            if (v41 > dist) {
                v41 = dist;
                d41 = d33;
            }
            dist = v32 + p41 + s32 * 0.000001;
            if (v41 > dist) {
                v41 = dist;
                d41 = d32;
            }
        }

        if (rc.onTheMap(l50)) {
            if (rc.canSenseLocation(l50)) {
                MapInfo mapInfo = rc.senseMapInfo(l50);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l50) || (rc.sensePassability(l50) && !rc.canSenseRobotAtLocation(l50) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l50), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p50 = mapInfo.getCooldownMultiplier(team);
                    s50 = Math.sqrt(l50.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p50 = 1.5;
            }
            
            dist = v51 + p50 + s51 * 0.000001;
            if (v50 > dist) {
                v50 = dist;
                d50 = d51;
            }
            dist = v42 + p50 + s42 * 0.000001;
            if (v50 > dist) {
                v50 = dist;
                d50 = d42;
            }
            dist = v41 + p50 + s41 * 0.000001;
            if (v50 > dist) {
                v50 = dist;
                d50 = d41;
            }
        }

        if (rc.onTheMap(l14)) {
            if (rc.canSenseLocation(l14)) {
                MapInfo mapInfo = rc.senseMapInfo(l14);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l14) || (rc.sensePassability(l14) && !rc.canSenseRobotAtLocation(l14) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l14), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p14 = mapInfo.getCooldownMultiplier(team);
                    s14 = Math.sqrt(l14.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p14 = 1.5;
            }
            
            dist = v23 + p14 + s23 * 0.000001;
            if (v14 > dist) {
                v14 = dist;
                d14 = d23;
            }
            dist = v24 + p14 + s24 * 0.000001;
            if (v14 > dist) {
                v14 = dist;
                d14 = d24;
            }
            dist = v15 + p14 + s15 * 0.000001;
            if (v14 > dist) {
                v14 = dist;
                d14 = d15;
            }
        }

        if (rc.onTheMap(l60)) {
            if (rc.canSenseLocation(l60)) {
                MapInfo mapInfo = rc.senseMapInfo(l60);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l60) || (rc.sensePassability(l60) && !rc.canSenseRobotAtLocation(l60) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l60), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p60 = mapInfo.getCooldownMultiplier(team);
                    s60 = Math.sqrt(l60.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p60 = 1.5;
            }
            
            dist = v52 + p60 + s52 * 0.000001;
            if (v60 > dist) {
                v60 = dist;
                d60 = d52;
            }
            dist = v51 + p60 + s51 * 0.000001;
            if (v60 > dist) {
                v60 = dist;
                d60 = d51;
            }
        }

        if (rc.onTheMap(l31)) {
            if (rc.canSenseLocation(l31)) {
                MapInfo mapInfo = rc.senseMapInfo(l31);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l31) || (rc.sensePassability(l31) && !rc.canSenseRobotAtLocation(l31) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l31), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p31 = mapInfo.getCooldownMultiplier(team);
                    s31 = Math.sqrt(l31.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p31 = 1.5;
            }
            
            dist = v41 + p31 + s41 * 0.000001;
            if (v31 > dist) {
                v31 = dist;
                d31 = d41;
            }
            dist = v32 + p31 + s32 * 0.000001;
            if (v31 > dist) {
                v31 = dist;
                d31 = d32;
            }
            dist = v23 + p31 + s23 * 0.000001;
            if (v31 > dist) {
                v31 = dist;
                d31 = d23;
            }
        }

        if (rc.onTheMap(l8)) {
            if (rc.canSenseLocation(l8)) {
                MapInfo mapInfo = rc.senseMapInfo(l8);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l8) || (rc.sensePassability(l8) && !rc.canSenseRobotAtLocation(l8) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l8), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p8 = mapInfo.getCooldownMultiplier(team);
                    s8 = Math.sqrt(l8.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p8 = 1.5;
            }
            
            dist = v16 + p8 + s16 * 0.000001;
            if (v8 > dist) {
                v8 = dist;
                d8 = d16;
            }
            dist = v15 + p8 + s15 * 0.000001;
            if (v8 > dist) {
                v8 = dist;
                d8 = d15;
            }
        }

        if (rc.onTheMap(l59)) {
            if (rc.canSenseLocation(l59)) {
                MapInfo mapInfo = rc.senseMapInfo(l59);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l59) || (rc.sensePassability(l59) && !rc.canSenseRobotAtLocation(l59) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l59), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p59 = mapInfo.getCooldownMultiplier(team);
                    s59 = Math.sqrt(l59.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p59 = 1.5;
            }
            
            dist = v60 + p59 + s60 * 0.000001;
            if (v59 > dist) {
                v59 = dist;
                d59 = d60;
            }
            dist = v52 + p59 + s52 * 0.000001;
            if (v59 > dist) {
                v59 = dist;
                d59 = d52;
            }
            dist = v51 + p59 + s51 * 0.000001;
            if (v59 > dist) {
                v59 = dist;
                d59 = d51;
            }
            dist = v50 + p59 + s50 * 0.000001;
            if (v59 > dist) {
                v59 = dist;
                d59 = d50;
            }
        }

        if (rc.onTheMap(l22)) {
            if (rc.canSenseLocation(l22)) {
                MapInfo mapInfo = rc.senseMapInfo(l22);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l22) || (rc.sensePassability(l22) && !rc.canSenseRobotAtLocation(l22) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l22), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p22 = mapInfo.getCooldownMultiplier(team);
                    s22 = Math.sqrt(l22.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p22 = 1.5;
            }
            
            dist = v31 + p22 + s31 * 0.000001;
            if (v22 > dist) {
                v22 = dist;
                d22 = d31;
            }
            dist = v32 + p22 + s32 * 0.000001;
            if (v22 > dist) {
                v22 = dist;
                d22 = d32;
            }
            dist = v23 + p22 + s23 * 0.000001;
            if (v22 > dist) {
                v22 = dist;
                d22 = d23;
            }
            dist = v14 + p22 + s14 * 0.000001;
            if (v22 > dist) {
                v22 = dist;
                d22 = d14;
            }
        }

        if (rc.onTheMap(l7)) {
            if (rc.canSenseLocation(l7)) {
                MapInfo mapInfo = rc.senseMapInfo(l7);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l7) || (rc.sensePassability(l7) && !rc.canSenseRobotAtLocation(l7) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l7), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p7 = mapInfo.getCooldownMultiplier(team);
                    s7 = Math.sqrt(l7.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p7 = 1.5;
            }
            
            dist = v15 + p7 + s15 * 0.000001;
            if (v7 > dist) {
                v7 = dist;
                d7 = d15;
            }
            dist = v16 + p7 + s16 * 0.000001;
            if (v7 > dist) {
                v7 = dist;
                d7 = d16;
            }
            dist = v8 + p7 + s8 * 0.000001;
            if (v7 > dist) {
                v7 = dist;
                d7 = d8;
            }
            dist = v14 + p7 + s14 * 0.000001;
            if (v7 > dist) {
                v7 = dist;
                d7 = d14;
            }
        }

        if (rc.onTheMap(l40)) {
            if (rc.canSenseLocation(l40)) {
                MapInfo mapInfo = rc.senseMapInfo(l40);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l40) || (rc.sensePassability(l40) && !rc.canSenseRobotAtLocation(l40) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l40), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p40 = mapInfo.getCooldownMultiplier(team);
                    s40 = Math.sqrt(l40.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p40 = 1.5;
            }
            
            dist = v50 + p40 + s50 * 0.000001;
            if (v40 > dist) {
                v40 = dist;
                d40 = d50;
            }
            dist = v41 + p40 + s41 * 0.000001;
            if (v40 > dist) {
                v40 = dist;
                d40 = d41;
            }
            dist = v32 + p40 + s32 * 0.000001;
            if (v40 > dist) {
                v40 = dist;
                d40 = d32;
            }
            dist = v31 + p40 + s31 * 0.000001;
            if (v40 > dist) {
                v40 = dist;
                d40 = d31;
            }
        }

        if (rc.onTheMap(l13)) {
            if (rc.canSenseLocation(l13)) {
                MapInfo mapInfo = rc.senseMapInfo(l13);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l13) || (rc.sensePassability(l13) && !rc.canSenseRobotAtLocation(l13) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l13), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p13 = mapInfo.getCooldownMultiplier(team);
                    s13 = Math.sqrt(l13.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p13 = 1.5;
            }
            
            dist = v22 + p13 + s22 * 0.000001;
            if (v13 > dist) {
                v13 = dist;
                d13 = d22;
            }
            dist = v23 + p13 + s23 * 0.000001;
            if (v13 > dist) {
                v13 = dist;
                d13 = d23;
            }
            dist = v14 + p13 + s14 * 0.000001;
            if (v13 > dist) {
                v13 = dist;
                d13 = d14;
            }
            dist = v6 + p13 + s6 * 0.000001;
            if (v13 > dist) {
                v13 = dist;
                d13 = d6;
            }
        }

        if (rc.onTheMap(l58)) {
            if (rc.canSenseLocation(l58)) {
                MapInfo mapInfo = rc.senseMapInfo(l58);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l58) || (rc.sensePassability(l58) && !rc.canSenseRobotAtLocation(l58) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l58), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p58 = mapInfo.getCooldownMultiplier(team);
                    s58 = Math.sqrt(l58.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p58 = 1.5;
            }
            
            dist = v59 + p58 + s59 * 0.000001;
            if (v58 > dist) {
                v58 = dist;
                d58 = d59;
            }
            dist = v51 + p58 + s51 * 0.000001;
            if (v58 > dist) {
                v58 = dist;
                d58 = d51;
            }
            dist = v50 + p58 + s50 * 0.000001;
            if (v58 > dist) {
                v58 = dist;
                d58 = d50;
            }
            dist = v49 + p58 + s49 * 0.000001;
            if (v58 > dist) {
                v58 = dist;
                d58 = d49;
            }
        }

        if (rc.onTheMap(l49)) {
            if (rc.canSenseLocation(l49)) {
                MapInfo mapInfo = rc.senseMapInfo(l49);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l49) || (rc.sensePassability(l49) && !rc.canSenseRobotAtLocation(l49) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l49), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p49 = mapInfo.getCooldownMultiplier(team);
                    s49 = Math.sqrt(l49.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p49 = 1.5;
            }
            
            dist = v58 + p49 + s58 * 0.000001;
            if (v49 > dist) {
                v49 = dist;
                d49 = d58;
            }
            dist = v50 + p49 + s50 * 0.000001;
            if (v49 > dist) {
                v49 = dist;
                d49 = d50;
            }
            dist = v41 + p49 + s41 * 0.000001;
            if (v49 > dist) {
                v49 = dist;
                d49 = d41;
            }
            dist = v40 + p49 + s40 * 0.000001;
            if (v49 > dist) {
                v49 = dist;
                d49 = d40;
            }
        }

        if (rc.onTheMap(l6)) {
            if (rc.canSenseLocation(l6)) {
                MapInfo mapInfo = rc.senseMapInfo(l6);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l6) || (rc.sensePassability(l6) && !rc.canSenseRobotAtLocation(l6) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l6), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p6 = mapInfo.getCooldownMultiplier(team);
                    s6 = Math.sqrt(l6.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p6 = 1.5;
            }
            
            dist = v14 + p6 + s14 * 0.000001;
            if (v6 > dist) {
                v6 = dist;
                d6 = d14;
            }
            dist = v15 + p6 + s15 * 0.000001;
            if (v6 > dist) {
                v6 = dist;
                d6 = d15;
            }
            dist = v7 + p6 + s7 * 0.000001;
            if (v6 > dist) {
                v6 = dist;
                d6 = d7;
            }
            dist = v13 + p6 + s13 * 0.000001;
            if (v6 > dist) {
                v6 = dist;
                d6 = d13;
            }
        }

        if (rc.onTheMap(l5)) {
            if (rc.canSenseLocation(l5)) {
                MapInfo mapInfo = rc.senseMapInfo(l5);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l5) || (rc.sensePassability(l5) && !rc.canSenseRobotAtLocation(l5) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l5), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p5 = mapInfo.getCooldownMultiplier(team);
                    s5 = Math.sqrt(l5.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p5 = 1.5;
            }
            
            dist = v13 + p5 + s13 * 0.000001;
            if (v5 > dist) {
                v5 = dist;
                d5 = d13;
            }
            dist = v14 + p5 + s14 * 0.000001;
            if (v5 > dist) {
                v5 = dist;
                d5 = d14;
            }
            dist = v6 + p5 + s6 * 0.000001;
            if (v5 > dist) {
                v5 = dist;
                d5 = d6;
            }
        }

        if (rc.onTheMap(l57)) {
            if (rc.canSenseLocation(l57)) {
                MapInfo mapInfo = rc.senseMapInfo(l57);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l57) || (rc.sensePassability(l57) && !rc.canSenseRobotAtLocation(l57) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l57), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p57 = mapInfo.getCooldownMultiplier(team);
                    s57 = Math.sqrt(l57.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p57 = 1.5;
            }
            
            dist = v58 + p57 + s58 * 0.000001;
            if (v57 > dist) {
                v57 = dist;
                d57 = d58;
            }
            dist = v50 + p57 + s50 * 0.000001;
            if (v57 > dist) {
                v57 = dist;
                d57 = d50;
            }
            dist = v49 + p57 + s49 * 0.000001;
            if (v57 > dist) {
                v57 = dist;
                d57 = d49;
            }
        }

        if (rc.onTheMap(l2)) {
            if (rc.canSenseLocation(l2)) {
                MapInfo mapInfo = rc.senseMapInfo(l2);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l2) || (rc.sensePassability(l2) && !rc.canSenseRobotAtLocation(l2) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l2), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p2 = mapInfo.getCooldownMultiplier(team);
                    s2 = Math.sqrt(l2.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p2 = 1.5;
            }
            
            dist = v8 + p2 + s8 * 0.000001;
            if (v2 > dist) {
                v2 = dist;
                d2 = d8;
            }
            dist = v7 + p2 + s7 * 0.000001;
            if (v2 > dist) {
                v2 = dist;
                d2 = d7;
            }
        }

        if (rc.onTheMap(l66)) {
            if (rc.canSenseLocation(l66)) {
                MapInfo mapInfo = rc.senseMapInfo(l66);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l66) || (rc.sensePassability(l66) && !rc.canSenseRobotAtLocation(l66) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l66), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p66 = mapInfo.getCooldownMultiplier(team);
                    s66 = Math.sqrt(l66.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p66 = 1.5;
            }
            
            dist = v60 + p66 + s60 * 0.000001;
            if (v66 > dist) {
                v66 = dist;
                d66 = d60;
            }
            dist = v59 + p66 + s59 * 0.000001;
            if (v66 > dist) {
                v66 = dist;
                d66 = d59;
            }
        }

        if (rc.onTheMap(l30)) {
            if (rc.canSenseLocation(l30)) {
                MapInfo mapInfo = rc.senseMapInfo(l30);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l30) || (rc.sensePassability(l30) && !rc.canSenseRobotAtLocation(l30) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l30), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p30 = mapInfo.getCooldownMultiplier(team);
                    s30 = Math.sqrt(l30.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p30 = 1.5;
            }
            
            dist = v40 + p30 + s40 * 0.000001;
            if (v30 > dist) {
                v30 = dist;
                d30 = d40;
            }
            dist = v31 + p30 + s31 * 0.000001;
            if (v30 > dist) {
                v30 = dist;
                d30 = d31;
            }
            dist = v22 + p30 + s22 * 0.000001;
            if (v30 > dist) {
                v30 = dist;
                d30 = d22;
            }
        }

        if (rc.onTheMap(l21)) {
            if (rc.canSenseLocation(l21)) {
                MapInfo mapInfo = rc.senseMapInfo(l21);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l21) || (rc.sensePassability(l21) && !rc.canSenseRobotAtLocation(l21) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l21), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p21 = mapInfo.getCooldownMultiplier(team);
                    s21 = Math.sqrt(l21.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p21 = 1.5;
            }
            
            dist = v30 + p21 + s30 * 0.000001;
            if (v21 > dist) {
                v21 = dist;
                d21 = d30;
            }
            dist = v31 + p21 + s31 * 0.000001;
            if (v21 > dist) {
                v21 = dist;
                d21 = d31;
            }
            dist = v22 + p21 + s22 * 0.000001;
            if (v21 > dist) {
                v21 = dist;
                d21 = d22;
            }
            dist = v13 + p21 + s13 * 0.000001;
            if (v21 > dist) {
                v21 = dist;
                d21 = d13;
            }
        }

        if (rc.onTheMap(l1)) {
            if (rc.canSenseLocation(l1)) {
                MapInfo mapInfo = rc.senseMapInfo(l1);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l1) || (rc.sensePassability(l1) && !rc.canSenseRobotAtLocation(l1) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l1), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p1 = mapInfo.getCooldownMultiplier(team);
                    s1 = Math.sqrt(l1.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p1 = 1.5;
            }
            
            dist = v7 + p1 + s7 * 0.000001;
            if (v1 > dist) {
                v1 = dist;
                d1 = d7;
            }
            dist = v8 + p1 + s8 * 0.000001;
            if (v1 > dist) {
                v1 = dist;
                d1 = d8;
            }
            dist = v2 + p1 + s2 * 0.000001;
            if (v1 > dist) {
                v1 = dist;
                d1 = d2;
            }
            dist = v6 + p1 + s6 * 0.000001;
            if (v1 > dist) {
                v1 = dist;
                d1 = d6;
            }
        }

        if (rc.onTheMap(l39)) {
            if (rc.canSenseLocation(l39)) {
                MapInfo mapInfo = rc.senseMapInfo(l39);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l39) || (rc.sensePassability(l39) && !rc.canSenseRobotAtLocation(l39) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l39), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p39 = mapInfo.getCooldownMultiplier(team);
                    s39 = Math.sqrt(l39.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p39 = 1.5;
            }
            
            dist = v49 + p39 + s49 * 0.000001;
            if (v39 > dist) {
                v39 = dist;
                d39 = d49;
            }
            dist = v40 + p39 + s40 * 0.000001;
            if (v39 > dist) {
                v39 = dist;
                d39 = d40;
            }
            dist = v31 + p39 + s31 * 0.000001;
            if (v39 > dist) {
                v39 = dist;
                d39 = d31;
            }
            dist = v30 + p39 + s30 * 0.000001;
            if (v39 > dist) {
                v39 = dist;
                d39 = d30;
            }
        }

        if (rc.onTheMap(l65)) {
            if (rc.canSenseLocation(l65)) {
                MapInfo mapInfo = rc.senseMapInfo(l65);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l65) || (rc.sensePassability(l65) && !rc.canSenseRobotAtLocation(l65) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l65), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p65 = mapInfo.getCooldownMultiplier(team);
                    s65 = Math.sqrt(l65.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p65 = 1.5;
            }
            
            dist = v66 + p65 + s66 * 0.000001;
            if (v65 > dist) {
                v65 = dist;
                d65 = d66;
            }
            dist = v60 + p65 + s60 * 0.000001;
            if (v65 > dist) {
                v65 = dist;
                d65 = d60;
            }
            dist = v59 + p65 + s59 * 0.000001;
            if (v65 > dist) {
                v65 = dist;
                d65 = d59;
            }
            dist = v58 + p65 + s58 * 0.000001;
            if (v65 > dist) {
                v65 = dist;
                d65 = d58;
            }
        }

        if (rc.onTheMap(l64)) {
            if (rc.canSenseLocation(l64)) {
                MapInfo mapInfo = rc.senseMapInfo(l64);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l64) || (rc.sensePassability(l64) && !rc.canSenseRobotAtLocation(l64) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l64), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p64 = mapInfo.getCooldownMultiplier(team);
                    s64 = Math.sqrt(l64.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p64 = 1.5;
            }
            
            dist = v65 + p64 + s65 * 0.000001;
            if (v64 > dist) {
                v64 = dist;
                d64 = d65;
            }
            dist = v59 + p64 + s59 * 0.000001;
            if (v64 > dist) {
                v64 = dist;
                d64 = d59;
            }
            dist = v58 + p64 + s58 * 0.000001;
            if (v64 > dist) {
                v64 = dist;
                d64 = d58;
            }
            dist = v57 + p64 + s57 * 0.000001;
            if (v64 > dist) {
                v64 = dist;
                d64 = d57;
            }
        }

        if (rc.onTheMap(l12)) {
            if (rc.canSenseLocation(l12)) {
                MapInfo mapInfo = rc.senseMapInfo(l12);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l12) || (rc.sensePassability(l12) && !rc.canSenseRobotAtLocation(l12) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l12), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p12 = mapInfo.getCooldownMultiplier(team);
                    s12 = Math.sqrt(l12.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p12 = 1.5;
            }
            
            dist = v21 + p12 + s21 * 0.000001;
            if (v12 > dist) {
                v12 = dist;
                d12 = d21;
            }
            dist = v22 + p12 + s22 * 0.000001;
            if (v12 > dist) {
                v12 = dist;
                d12 = d22;
            }
            dist = v13 + p12 + s13 * 0.000001;
            if (v12 > dist) {
                v12 = dist;
                d12 = d13;
            }
            dist = v5 + p12 + s5 * 0.000001;
            if (v12 > dist) {
                v12 = dist;
                d12 = d5;
            }
        }

        if (rc.onTheMap(l0)) {
            if (rc.canSenseLocation(l0)) {
                MapInfo mapInfo = rc.senseMapInfo(l0);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l0) || (rc.sensePassability(l0) && !rc.canSenseRobotAtLocation(l0) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l0), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p0 = mapInfo.getCooldownMultiplier(team);
                    s0 = Math.sqrt(l0.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p0 = 1.5;
            }
            
            dist = v6 + p0 + s6 * 0.000001;
            if (v0 > dist) {
                v0 = dist;
                d0 = d6;
            }
            dist = v7 + p0 + s7 * 0.000001;
            if (v0 > dist) {
                v0 = dist;
                d0 = d7;
            }
            dist = v1 + p0 + s1 * 0.000001;
            if (v0 > dist) {
                v0 = dist;
                d0 = d1;
            }
            dist = v5 + p0 + s5 * 0.000001;
            if (v0 > dist) {
                v0 = dist;
                d0 = d5;
            }
        }

        if (rc.onTheMap(l48)) {
            if (rc.canSenseLocation(l48)) {
                MapInfo mapInfo = rc.senseMapInfo(l48);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l48) || (rc.sensePassability(l48) && !rc.canSenseRobotAtLocation(l48) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l48), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p48 = mapInfo.getCooldownMultiplier(team);
                    s48 = Math.sqrt(l48.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p48 = 1.5;
            }
            
            dist = v57 + p48 + s57 * 0.000001;
            if (v48 > dist) {
                v48 = dist;
                d48 = d57;
            }
            dist = v49 + p48 + s49 * 0.000001;
            if (v48 > dist) {
                v48 = dist;
                d48 = d49;
            }
            dist = v40 + p48 + s40 * 0.000001;
            if (v48 > dist) {
                v48 = dist;
                d48 = d40;
            }
            dist = v39 + p48 + s39 * 0.000001;
            if (v48 > dist) {
                v48 = dist;
                d48 = d39;
            }
        }
    
        int dx = targetLocation.x - l34.x;
        int dy = targetLocation.y - l34.y;

        switch(dx) {
            case -4:
                switch(dy) {
                    case -2:
                        if (v0 < 1000000) {
                            bug.reset();
                            return d0;
                        } break;
                    case -1:
                        if (v1 < 1000000) {
                            bug.reset();
                            return d1;
                        } break;
                    case 0:
                        if (v2 < 1000000) {
                            bug.reset();
                            return d2;
                        } break;
                } break;

            case -3:
                switch(dy) {
                    case -3:
                        if (v5 < 1000000) {
                            bug.reset();
                            return d5;
                        } break;
                    case -2:
                        if (v6 < 1000000) {
                            bug.reset();
                            return d6;
                        } break;
                    case -1:
                        if (v7 < 1000000) {
                            bug.reset();
                            return d7;
                        } break;
                    case 0:
                        if (v8 < 1000000) {
                            bug.reset();
                            return d8;
                        } break;
                } break;

            case -2:
                switch(dy) {
                    case -4:
                        if (v12 < 1000000) {
                            bug.reset();
                            return d12;
                        } break;
                    case -3:
                        if (v13 < 1000000) {
                            bug.reset();
                            return d13;
                        } break;
                    case -2:
                        if (v14 < 1000000) {
                            bug.reset();
                            return d14;
                        } break;
                    case -1:
                        if (v15 < 1000000) {
                            bug.reset();
                            return d15;
                        } break;
                    case 0:
                        if (v16 < 1000000) {
                            bug.reset();
                            return d16;
                        } break;
                } break;

            case -1:
                switch(dy) {
                    case -4:
                        if (v21 < 1000000) {
                            bug.reset();
                            return d21;
                        } break;
                    case -3:
                        if (v22 < 1000000) {
                            bug.reset();
                            return d22;
                        } break;
                    case -2:
                        if (v23 < 1000000) {
                            bug.reset();
                            return d23;
                        } break;
                    case -1:
                        if (v24 < 1000000) {
                            bug.reset();
                            return d24;
                        } break;
                    case 0:
                        if (v25 < 1000000) {
                            bug.reset();
                            return d25;
                        } break;
                } break;

            case 0:
                switch(dy) {
                    case -4:
                        if (v30 < 1000000) {
                            bug.reset();
                            return d30;
                        } break;
                    case -3:
                        if (v31 < 1000000) {
                            bug.reset();
                            return d31;
                        } break;
                    case -2:
                        if (v32 < 1000000) {
                            bug.reset();
                            return d32;
                        } break;
                    case -1:
                        if (v33 < 1000000) {
                            bug.reset();
                            return d33;
                        } break;
                } break;

            case 1:
                switch(dy) {
                    case -4:
                        if (v39 < 1000000) {
                            bug.reset();
                            return d39;
                        } break;
                    case -3:
                        if (v40 < 1000000) {
                            bug.reset();
                            return d40;
                        } break;
                    case -2:
                        if (v41 < 1000000) {
                            bug.reset();
                            return d41;
                        } break;
                    case -1:
                        if (v42 < 1000000) {
                            bug.reset();
                            return d42;
                        } break;
                    case 0:
                        if (v43 < 1000000) {
                            bug.reset();
                            return d43;
                        } break;
                } break;

            case 2:
                switch(dy) {
                    case -4:
                        if (v48 < 1000000) {
                            bug.reset();
                            return d48;
                        } break;
                    case -3:
                        if (v49 < 1000000) {
                            bug.reset();
                            return d49;
                        } break;
                    case -2:
                        if (v50 < 1000000) {
                            bug.reset();
                            return d50;
                        } break;
                    case -1:
                        if (v51 < 1000000) {
                            bug.reset();
                            return d51;
                        } break;
                    case 0:
                        if (v52 < 1000000) {
                            bug.reset();
                            return d52;
                        } break;
                } break;

            case 3:
                switch(dy) {
                    case -3:
                        if (v57 < 1000000) {
                            bug.reset();
                            return d57;
                        } break;
                    case -2:
                        if (v58 < 1000000) {
                            bug.reset();
                            return d58;
                        } break;
                    case -1:
                        if (v59 < 1000000) {
                            bug.reset();
                            return d59;
                        } break;
                    case 0:
                        if (v60 < 1000000) {
                            bug.reset();
                            return d60;
                        } break;
                } break;

            case 4:
                switch(dy) {
                    case -2:
                        if (v64 < 1000000) {
                            bug.reset();
                            return d64;
                        } break;
                    case -1:
                        if (v65 < 1000000) {
                            bug.reset();
                            return d65;
                        } break;
                    case 0:
                        if (v66 < 1000000) {
                            bug.reset();
                            return d66;
                        } break;
                } break;

        }
    
        Direction ans = Direction.CENTER;

        double dist0 = v0 + s0;
        if (dist0 < localBest) {
            localBest = dist0;
            ans = d0;
        }

        double dist1 = v1 + s1;
        if (dist1 < localBest) {
            localBest = dist1;
            ans = d1;
        }

        double dist2 = v2 + s2;
        if (dist2 < localBest) {
            localBest = dist2;
            ans = d2;
        }

        double dist5 = v5 + s5;
        if (dist5 < localBest) {
            localBest = dist5;
            ans = d5;
        }

        double dist6 = v6 + s6;
        if (dist6 < localBest) {
            localBest = dist6;
            ans = d6;
        }

        double dist7 = v7 + s7;
        if (dist7 < localBest) {
            localBest = dist7;
            ans = d7;
        }

        double dist8 = v8 + s8;
        if (dist8 < localBest) {
            localBest = dist8;
            ans = d8;
        }

        double dist12 = v12 + s12;
        if (dist12 < localBest) {
            localBest = dist12;
            ans = d12;
        }

        double dist13 = v13 + s13;
        if (dist13 < localBest) {
            localBest = dist13;
            ans = d13;
        }

        double dist14 = v14 + s14;
        if (dist14 < localBest) {
            localBest = dist14;
            ans = d14;
        }

        double dist15 = v15 + s15;
        if (dist15 < localBest) {
            localBest = dist15;
            ans = d15;
        }

        double dist16 = v16 + s16;
        if (dist16 < localBest) {
            localBest = dist16;
            ans = d16;
        }

        double dist21 = v21 + s21;
        if (dist21 < localBest) {
            localBest = dist21;
            ans = d21;
        }

        double dist22 = v22 + s22;
        if (dist22 < localBest) {
            localBest = dist22;
            ans = d22;
        }

        double dist23 = v23 + s23;
        if (dist23 < localBest) {
            localBest = dist23;
            ans = d23;
        }

        double dist24 = v24 + s24;
        if (dist24 < localBest) {
            localBest = dist24;
            ans = d24;
        }

        double dist25 = v25 + s25;
        if (dist25 < localBest) {
            localBest = dist25;
            ans = d25;
        }

        double dist30 = v30 + s30;
        if (dist30 < localBest) {
            localBest = dist30;
            ans = d30;
        }

        double dist31 = v31 + s31;
        if (dist31 < localBest) {
            localBest = dist31;
            ans = d31;
        }

        double dist32 = v32 + s32;
        if (dist32 < localBest) {
            localBest = dist32;
            ans = d32;
        }

        double dist33 = v33 + s33;
        if (dist33 < localBest) {
            localBest = dist33;
            ans = d33;
        }

        double dist39 = v39 + s39;
        if (dist39 < localBest) {
            localBest = dist39;
            ans = d39;
        }

        double dist40 = v40 + s40;
        if (dist40 < localBest) {
            localBest = dist40;
            ans = d40;
        }

        double dist41 = v41 + s41;
        if (dist41 < localBest) {
            localBest = dist41;
            ans = d41;
        }

        double dist42 = v42 + s42;
        if (dist42 < localBest) {
            localBest = dist42;
            ans = d42;
        }

        double dist43 = v43 + s43;
        if (dist43 < localBest) {
            localBest = dist43;
            ans = d43;
        }

        double dist48 = v48 + s48;
        if (dist48 < localBest) {
            localBest = dist48;
            ans = d48;
        }

        double dist49 = v49 + s49;
        if (dist49 < localBest) {
            localBest = dist49;
            ans = d49;
        }

        double dist50 = v50 + s50;
        if (dist50 < localBest) {
            localBest = dist50;
            ans = d50;
        }

        double dist51 = v51 + s51;
        if (dist51 < localBest) {
            localBest = dist51;
            ans = d51;
        }

        double dist52 = v52 + s52;
        if (dist52 < localBest) {
            localBest = dist52;
            ans = d52;
        }

        double dist57 = v57 + s57;
        if (dist57 < localBest) {
            localBest = dist57;
            ans = d57;
        }

        double dist58 = v58 + s58;
        if (dist58 < localBest) {
            localBest = dist58;
            ans = d58;
        }

        double dist59 = v59 + s59;
        if (dist59 < localBest) {
            localBest = dist59;
            ans = d59;
        }

        double dist60 = v60 + s60;
        if (dist60 < localBest) {
            localBest = dist60;
            ans = d60;
        }

        double dist64 = v64 + s64;
        if (dist64 < localBest) {
            localBest = dist64;
            ans = d64;
        }

        double dist65 = v65 + s65;
        if (dist65 < localBest) {
            localBest = dist65;
            ans = d65;
        }

        double dist66 = v66 + s66;
        if (dist66 < localBest) {
            localBest = dist66;
            ans = d66;
        }

        if (localBest < globalBest) {
            globalBest = localBest;
            bug.reset();
            return ans;
        }

        consecutiveBugNavRoundCount += 1;

        if (consecutiveBugNavRoundCount > 40) {
            globalBest = 1000000;
            consecutiveBugNavRoundCount = 0;
        }

        bug.move(targetLocation, lastDirection);
        return null;
    }

    private Direction getBestDirection5() throws GameActionException {
        double localBest = 1000000.0;
        double dist = 0.0;
        l34 = currentLocation;
        v34 = 0;
        d26 = null;
        l26 = l34.add(Direction.NORTHWEST);
        v26 = 1000000;
        p26 = 1000000;
        s26 = Math.sqrt(l26.distanceSquaredTo(targetLocation));
        d25 = null;
        l25 = l34.add(Direction.WEST);
        v25 = 1000000;
        p25 = 1000000;
        s25 = Math.sqrt(l25.distanceSquaredTo(targetLocation));
        d24 = null;
        l24 = l34.add(Direction.SOUTHWEST);
        v24 = 1000000;
        p24 = 1000000;
        s24 = Math.sqrt(l24.distanceSquaredTo(targetLocation));
        d33 = null;
        l33 = l34.add(Direction.SOUTH);
        v33 = 1000000;
        p33 = 1000000;
        s33 = Math.sqrt(l33.distanceSquaredTo(targetLocation));
        d42 = null;
        l42 = l34.add(Direction.SOUTHEAST);
        v42 = 1000000;
        p42 = 1000000;
        s42 = Math.sqrt(l42.distanceSquaredTo(targetLocation));
        d23 = null;
        l23 = l33.add(Direction.SOUTHWEST);
        v23 = 1000000;
        p23 = 1000000;
        s23 = Math.sqrt(l23.distanceSquaredTo(targetLocation));
        d32 = null;
        l32 = l33.add(Direction.SOUTH);
        v32 = 1000000;
        p32 = 1000000;
        s32 = Math.sqrt(l32.distanceSquaredTo(targetLocation));
        d41 = null;
        l41 = l33.add(Direction.SOUTHEAST);
        v41 = 1000000;
        p41 = 1000000;
        s41 = Math.sqrt(l41.distanceSquaredTo(targetLocation));
        d17 = null;
        l17 = l25.add(Direction.NORTHWEST);
        v17 = 1000000;
        p17 = 1000000;
        s17 = Math.sqrt(l17.distanceSquaredTo(targetLocation));
        d16 = null;
        l16 = l25.add(Direction.WEST);
        v16 = 1000000;
        p16 = 1000000;
        s16 = Math.sqrt(l16.distanceSquaredTo(targetLocation));
        d15 = null;
        l15 = l25.add(Direction.SOUTHWEST);
        v15 = 1000000;
        p15 = 1000000;
        s15 = Math.sqrt(l15.distanceSquaredTo(targetLocation));
        d50 = null;
        l50 = l42.add(Direction.SOUTHEAST);
        v50 = 1000000;
        p50 = 1000000;
        s50 = Math.sqrt(l50.distanceSquaredTo(targetLocation));
        d18 = null;
        l18 = l26.add(Direction.NORTHWEST);
        v18 = 1000000;
        p18 = 1000000;
        s18 = Math.sqrt(l18.distanceSquaredTo(targetLocation));
        d14 = null;
        l14 = l24.add(Direction.SOUTHWEST);
        v14 = 1000000;
        p14 = 1000000;
        s14 = Math.sqrt(l14.distanceSquaredTo(targetLocation));
        d9 = null;
        l9 = l16.add(Direction.NORTHWEST);
        v9 = 1000000;
        p9 = 1000000;
        s9 = Math.sqrt(l9.distanceSquaredTo(targetLocation));
        d8 = null;
        l8 = l16.add(Direction.WEST);
        v8 = 1000000;
        p8 = 1000000;
        s8 = Math.sqrt(l8.distanceSquaredTo(targetLocation));
        d7 = null;
        l7 = l16.add(Direction.SOUTHWEST);
        v7 = 1000000;
        p7 = 1000000;
        s7 = Math.sqrt(l7.distanceSquaredTo(targetLocation));
        d22 = null;
        l22 = l32.add(Direction.SOUTHWEST);
        v22 = 1000000;
        p22 = 1000000;
        s22 = Math.sqrt(l22.distanceSquaredTo(targetLocation));
        d31 = null;
        l31 = l32.add(Direction.SOUTH);
        v31 = 1000000;
        p31 = 1000000;
        s31 = Math.sqrt(l31.distanceSquaredTo(targetLocation));
        d40 = null;
        l40 = l32.add(Direction.SOUTHEAST);
        v40 = 1000000;
        p40 = 1000000;
        s40 = Math.sqrt(l40.distanceSquaredTo(targetLocation));
        d6 = null;
        l6 = l15.add(Direction.SOUTHWEST);
        v6 = 1000000;
        p6 = 1000000;
        s6 = Math.sqrt(l6.distanceSquaredTo(targetLocation));
        d49 = null;
        l49 = l41.add(Direction.SOUTHEAST);
        v49 = 1000000;
        p49 = 1000000;
        s49 = Math.sqrt(l49.distanceSquaredTo(targetLocation));
        d13 = null;
        l13 = l23.add(Direction.SOUTHWEST);
        v13 = 1000000;
        p13 = 1000000;
        s13 = Math.sqrt(l13.distanceSquaredTo(targetLocation));
        d10 = null;
        l10 = l17.add(Direction.NORTHWEST);
        v10 = 1000000;
        p10 = 1000000;
        s10 = Math.sqrt(l10.distanceSquaredTo(targetLocation));
        d11 = null;
        l11 = l18.add(Direction.NORTHWEST);
        v11 = 1000000;
        p11 = 1000000;
        s11 = Math.sqrt(l11.distanceSquaredTo(targetLocation));
        d57 = null;
        l57 = l50.add(Direction.SOUTHEAST);
        v57 = 1000000;
        p57 = 1000000;
        s57 = Math.sqrt(l57.distanceSquaredTo(targetLocation));
        d5 = null;
        l5 = l14.add(Direction.SOUTHWEST);
        v5 = 1000000;
        p5 = 1000000;
        s5 = Math.sqrt(l5.distanceSquaredTo(targetLocation));
        d3 = null;
        l3 = l8.add(Direction.NORTHWEST);
        v3 = 1000000;
        p3 = 1000000;
        s3 = Math.sqrt(l3.distanceSquaredTo(targetLocation));
        d2 = null;
        l2 = l8.add(Direction.WEST);
        v2 = 1000000;
        p2 = 1000000;
        s2 = Math.sqrt(l2.distanceSquaredTo(targetLocation));
        d1 = null;
        l1 = l8.add(Direction.SOUTHWEST);
        v1 = 1000000;
        p1 = 1000000;
        s1 = Math.sqrt(l1.distanceSquaredTo(targetLocation));
        d21 = null;
        l21 = l31.add(Direction.SOUTHWEST);
        v21 = 1000000;
        p21 = 1000000;
        s21 = Math.sqrt(l21.distanceSquaredTo(targetLocation));
        d30 = null;
        l30 = l31.add(Direction.SOUTH);
        v30 = 1000000;
        p30 = 1000000;
        s30 = Math.sqrt(l30.distanceSquaredTo(targetLocation));
        d39 = null;
        l39 = l31.add(Direction.SOUTHEAST);
        v39 = 1000000;
        p39 = 1000000;
        s39 = Math.sqrt(l39.distanceSquaredTo(targetLocation));
        d0 = null;
        l0 = l7.add(Direction.SOUTHWEST);
        v0 = 1000000;
        p0 = 1000000;
        s0 = Math.sqrt(l0.distanceSquaredTo(targetLocation));
        d4 = null;
        l4 = l9.add(Direction.NORTHWEST);
        v4 = 1000000;
        p4 = 1000000;
        s4 = Math.sqrt(l4.distanceSquaredTo(targetLocation));
        d48 = null;
        l48 = l40.add(Direction.SOUTHEAST);
        v48 = 1000000;
        p48 = 1000000;
        s48 = Math.sqrt(l48.distanceSquaredTo(targetLocation));
        d12 = null;
        l12 = l22.add(Direction.SOUTHWEST);
        v12 = 1000000;
        p12 = 1000000;
        s12 = Math.sqrt(l12.distanceSquaredTo(targetLocation));
    

        if (rc.onTheMap(l33) && rc.canMove(Direction.SOUTH)) {
            if (rc.canSenseLocation(l33)) {
                MapInfo mapInfo = rc.senseMapInfo(l33);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l33) || (rc.sensePassability(l33) && !rc.canSenseRobotAtLocation(l33) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l33), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p33 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p33 = 1.5;
            }
            
            dist = v34 + p33 + s34 * 0.000001;
            if (v33 > dist) {
                v33 = dist;
                d33 = Direction.SOUTH;
            }
            dist = v25 + p33 + s25 * 0.000001;
            if (v33 > dist) {
                v33 = dist;
                d33 = d25;
            }
        }

        if (rc.onTheMap(l25) && rc.canMove(Direction.WEST)) {
            if (rc.canSenseLocation(l25)) {
                MapInfo mapInfo = rc.senseMapInfo(l25);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l25) || (rc.sensePassability(l25) && !rc.canSenseRobotAtLocation(l25) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l25), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p25 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p25 = 1.5;
            }
            
            dist = v34 + p25 + s34 * 0.000001;
            if (v25 > dist) {
                v25 = dist;
                d25 = Direction.WEST;
            }
            dist = v33 + p25 + s33 * 0.000001;
            if (v25 > dist) {
                v25 = dist;
                d25 = d33;
            }
        }

        if (rc.onTheMap(l42) && rc.canMove(Direction.SOUTHEAST)) {
            if (rc.canSenseLocation(l42)) {
                MapInfo mapInfo = rc.senseMapInfo(l42);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l42) || (rc.sensePassability(l42) && !rc.canSenseRobotAtLocation(l42) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l42), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p42 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p42 = 1.5;
            }
            
            dist = v34 + p42 + s34 * 0.000001;
            if (v42 > dist) {
                v42 = dist;
                d42 = Direction.SOUTHEAST;
            }
            dist = v33 + p42 + s33 * 0.000001;
            if (v42 > dist) {
                v42 = dist;
                d42 = d33;
            }
        }

        if (rc.onTheMap(l26) && rc.canMove(Direction.NORTHWEST)) {
            if (rc.canSenseLocation(l26)) {
                MapInfo mapInfo = rc.senseMapInfo(l26);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l26) || (rc.sensePassability(l26) && !rc.canSenseRobotAtLocation(l26) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l26), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p26 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p26 = 1.5;
            }
            
            dist = v25 + p26 + s25 * 0.000001;
            if (v26 > dist) {
                v26 = dist;
                d26 = d25;
            }
            dist = v34 + p26 + s34 * 0.000001;
            if (v26 > dist) {
                v26 = dist;
                d26 = Direction.NORTHWEST;
            }
        }

        if (rc.onTheMap(l24) && rc.canMove(Direction.SOUTHWEST)) {
            if (rc.canSenseLocation(l24)) {
                MapInfo mapInfo = rc.senseMapInfo(l24);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l24) || (rc.sensePassability(l24) && !rc.canSenseRobotAtLocation(l24) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l24), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p24 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p24 = 1.5;
            }
            
            dist = v33 + p24 + s33 * 0.000001;
            if (v24 > dist) {
                v24 = dist;
                d24 = d33;
            }
            dist = v34 + p24 + s34 * 0.000001;
            if (v24 > dist) {
                v24 = dist;
                d24 = Direction.SOUTHWEST;
            }
            dist = v25 + p24 + s25 * 0.000001;
            if (v24 > dist) {
                v24 = dist;
                d24 = d25;
            }
        }

        if (rc.onTheMap(l16)) {
            if (rc.canSenseLocation(l16)) {
                MapInfo mapInfo = rc.senseMapInfo(l16);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l16) || (rc.sensePassability(l16) && !rc.canSenseRobotAtLocation(l16) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l16), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p16 = mapInfo.getCooldownMultiplier(team);
                    s16 = Math.sqrt(l16.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p16 = 1.5;
            }
            
            dist = v25 + p16 + s25 * 0.000001;
            if (v16 > dist) {
                v16 = dist;
                d16 = d25;
            }
            dist = v26 + p16 + s26 * 0.000001;
            if (v16 > dist) {
                v16 = dist;
                d16 = d26;
            }
            dist = v24 + p16 + s24 * 0.000001;
            if (v16 > dist) {
                v16 = dist;
                d16 = d24;
            }
        }

        if (rc.onTheMap(l32)) {
            if (rc.canSenseLocation(l32)) {
                MapInfo mapInfo = rc.senseMapInfo(l32);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l32) || (rc.sensePassability(l32) && !rc.canSenseRobotAtLocation(l32) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l32), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p32 = mapInfo.getCooldownMultiplier(team);
                    s32 = Math.sqrt(l32.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p32 = 1.5;
            }
            
            dist = v42 + p32 + s42 * 0.000001;
            if (v32 > dist) {
                v32 = dist;
                d32 = d42;
            }
            dist = v33 + p32 + s33 * 0.000001;
            if (v32 > dist) {
                v32 = dist;
                d32 = d33;
            }
            dist = v24 + p32 + s24 * 0.000001;
            if (v32 > dist) {
                v32 = dist;
                d32 = d24;
            }
        }

        if (rc.onTheMap(l15)) {
            if (rc.canSenseLocation(l15)) {
                MapInfo mapInfo = rc.senseMapInfo(l15);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l15) || (rc.sensePassability(l15) && !rc.canSenseRobotAtLocation(l15) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l15), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p15 = mapInfo.getCooldownMultiplier(team);
                    s15 = Math.sqrt(l15.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p15 = 1.5;
            }
            
            dist = v24 + p15 + s24 * 0.000001;
            if (v15 > dist) {
                v15 = dist;
                d15 = d24;
            }
            dist = v25 + p15 + s25 * 0.000001;
            if (v15 > dist) {
                v15 = dist;
                d15 = d25;
            }
            dist = v16 + p15 + s16 * 0.000001;
            if (v15 > dist) {
                v15 = dist;
                d15 = d16;
            }
            dist = v23 + p15 + s23 * 0.000001;
            if (v15 > dist) {
                v15 = dist;
                d15 = d23;
            }
        }

        if (rc.onTheMap(l41)) {
            if (rc.canSenseLocation(l41)) {
                MapInfo mapInfo = rc.senseMapInfo(l41);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l41) || (rc.sensePassability(l41) && !rc.canSenseRobotAtLocation(l41) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l41), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p41 = mapInfo.getCooldownMultiplier(team);
                    s41 = Math.sqrt(l41.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p41 = 1.5;
            }
            
            dist = v42 + p41 + s42 * 0.000001;
            if (v41 > dist) {
                v41 = dist;
                d41 = d42;
            }
            dist = v33 + p41 + s33 * 0.000001;
            if (v41 > dist) {
                v41 = dist;
                d41 = d33;
            }
            dist = v32 + p41 + s32 * 0.000001;
            if (v41 > dist) {
                v41 = dist;
                d41 = d32;
            }
        }

        if (rc.onTheMap(l23)) {
            if (rc.canSenseLocation(l23)) {
                MapInfo mapInfo = rc.senseMapInfo(l23);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l23) || (rc.sensePassability(l23) && !rc.canSenseRobotAtLocation(l23) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l23), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p23 = mapInfo.getCooldownMultiplier(team);
                    s23 = Math.sqrt(l23.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p23 = 1.5;
            }
            
            dist = v32 + p23 + s32 * 0.000001;
            if (v23 > dist) {
                v23 = dist;
                d23 = d32;
            }
            dist = v33 + p23 + s33 * 0.000001;
            if (v23 > dist) {
                v23 = dist;
                d23 = d33;
            }
            dist = v24 + p23 + s24 * 0.000001;
            if (v23 > dist) {
                v23 = dist;
                d23 = d24;
            }
            dist = v15 + p23 + s15 * 0.000001;
            if (v23 > dist) {
                v23 = dist;
                d23 = d15;
            }
        }

        if (rc.onTheMap(l17)) {
            if (rc.canSenseLocation(l17)) {
                MapInfo mapInfo = rc.senseMapInfo(l17);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l17) || (rc.sensePassability(l17) && !rc.canSenseRobotAtLocation(l17) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l17), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p17 = mapInfo.getCooldownMultiplier(team);
                    s17 = Math.sqrt(l17.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p17 = 1.5;
            }
            
            dist = v26 + p17 + s26 * 0.000001;
            if (v17 > dist) {
                v17 = dist;
                d17 = d26;
            }
            dist = v16 + p17 + s16 * 0.000001;
            if (v17 > dist) {
                v17 = dist;
                d17 = d16;
            }
            dist = v25 + p17 + s25 * 0.000001;
            if (v17 > dist) {
                v17 = dist;
                d17 = d25;
            }
        }

        if (rc.onTheMap(l18)) {
            if (rc.canSenseLocation(l18)) {
                MapInfo mapInfo = rc.senseMapInfo(l18);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l18) || (rc.sensePassability(l18) && !rc.canSenseRobotAtLocation(l18) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l18), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p18 = mapInfo.getCooldownMultiplier(team);
                    s18 = Math.sqrt(l18.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p18 = 1.5;
            }
            
            dist = v17 + p18 + s17 * 0.000001;
            if (v18 > dist) {
                v18 = dist;
                d18 = d17;
            }
            dist = v26 + p18 + s26 * 0.000001;
            if (v18 > dist) {
                v18 = dist;
                d18 = d26;
            }
        }

        if (rc.onTheMap(l50)) {
            if (rc.canSenseLocation(l50)) {
                MapInfo mapInfo = rc.senseMapInfo(l50);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l50) || (rc.sensePassability(l50) && !rc.canSenseRobotAtLocation(l50) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l50), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p50 = mapInfo.getCooldownMultiplier(team);
                    s50 = Math.sqrt(l50.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p50 = 1.5;
            }
            
            dist = v42 + p50 + s42 * 0.000001;
            if (v50 > dist) {
                v50 = dist;
                d50 = d42;
            }
            dist = v41 + p50 + s41 * 0.000001;
            if (v50 > dist) {
                v50 = dist;
                d50 = d41;
            }
        }

        if (rc.onTheMap(l14)) {
            if (rc.canSenseLocation(l14)) {
                MapInfo mapInfo = rc.senseMapInfo(l14);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l14) || (rc.sensePassability(l14) && !rc.canSenseRobotAtLocation(l14) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l14), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p14 = mapInfo.getCooldownMultiplier(team);
                    s14 = Math.sqrt(l14.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p14 = 1.5;
            }
            
            dist = v23 + p14 + s23 * 0.000001;
            if (v14 > dist) {
                v14 = dist;
                d14 = d23;
            }
            dist = v24 + p14 + s24 * 0.000001;
            if (v14 > dist) {
                v14 = dist;
                d14 = d24;
            }
            dist = v15 + p14 + s15 * 0.000001;
            if (v14 > dist) {
                v14 = dist;
                d14 = d15;
            }
        }

        if (rc.onTheMap(l8)) {
            if (rc.canSenseLocation(l8)) {
                MapInfo mapInfo = rc.senseMapInfo(l8);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l8) || (rc.sensePassability(l8) && !rc.canSenseRobotAtLocation(l8) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l8), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p8 = mapInfo.getCooldownMultiplier(team);
                    s8 = Math.sqrt(l8.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p8 = 1.5;
            }
            
            dist = v16 + p8 + s16 * 0.000001;
            if (v8 > dist) {
                v8 = dist;
                d8 = d16;
            }
            dist = v17 + p8 + s17 * 0.000001;
            if (v8 > dist) {
                v8 = dist;
                d8 = d17;
            }
            dist = v15 + p8 + s15 * 0.000001;
            if (v8 > dist) {
                v8 = dist;
                d8 = d15;
            }
        }

        if (rc.onTheMap(l31)) {
            if (rc.canSenseLocation(l31)) {
                MapInfo mapInfo = rc.senseMapInfo(l31);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l31) || (rc.sensePassability(l31) && !rc.canSenseRobotAtLocation(l31) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l31), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p31 = mapInfo.getCooldownMultiplier(team);
                    s31 = Math.sqrt(l31.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p31 = 1.5;
            }
            
            dist = v41 + p31 + s41 * 0.000001;
            if (v31 > dist) {
                v31 = dist;
                d31 = d41;
            }
            dist = v32 + p31 + s32 * 0.000001;
            if (v31 > dist) {
                v31 = dist;
                d31 = d32;
            }
            dist = v23 + p31 + s23 * 0.000001;
            if (v31 > dist) {
                v31 = dist;
                d31 = d23;
            }
        }

        if (rc.onTheMap(l7)) {
            if (rc.canSenseLocation(l7)) {
                MapInfo mapInfo = rc.senseMapInfo(l7);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l7) || (rc.sensePassability(l7) && !rc.canSenseRobotAtLocation(l7) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l7), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p7 = mapInfo.getCooldownMultiplier(team);
                    s7 = Math.sqrt(l7.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p7 = 1.5;
            }
            
            dist = v15 + p7 + s15 * 0.000001;
            if (v7 > dist) {
                v7 = dist;
                d7 = d15;
            }
            dist = v16 + p7 + s16 * 0.000001;
            if (v7 > dist) {
                v7 = dist;
                d7 = d16;
            }
            dist = v8 + p7 + s8 * 0.000001;
            if (v7 > dist) {
                v7 = dist;
                d7 = d8;
            }
            dist = v14 + p7 + s14 * 0.000001;
            if (v7 > dist) {
                v7 = dist;
                d7 = d14;
            }
        }

        if (rc.onTheMap(l9)) {
            if (rc.canSenseLocation(l9)) {
                MapInfo mapInfo = rc.senseMapInfo(l9);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l9) || (rc.sensePassability(l9) && !rc.canSenseRobotAtLocation(l9) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l9), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p9 = mapInfo.getCooldownMultiplier(team);
                    s9 = Math.sqrt(l9.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p9 = 1.5;
            }
            
            dist = v17 + p9 + s17 * 0.000001;
            if (v9 > dist) {
                v9 = dist;
                d9 = d17;
            }
            dist = v18 + p9 + s18 * 0.000001;
            if (v9 > dist) {
                v9 = dist;
                d9 = d18;
            }
            dist = v8 + p9 + s8 * 0.000001;
            if (v9 > dist) {
                v9 = dist;
                d9 = d8;
            }
            dist = v16 + p9 + s16 * 0.000001;
            if (v9 > dist) {
                v9 = dist;
                d9 = d16;
            }
        }

        if (rc.onTheMap(l40)) {
            if (rc.canSenseLocation(l40)) {
                MapInfo mapInfo = rc.senseMapInfo(l40);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l40) || (rc.sensePassability(l40) && !rc.canSenseRobotAtLocation(l40) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l40), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p40 = mapInfo.getCooldownMultiplier(team);
                    s40 = Math.sqrt(l40.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p40 = 1.5;
            }
            
            dist = v50 + p40 + s50 * 0.000001;
            if (v40 > dist) {
                v40 = dist;
                d40 = d50;
            }
            dist = v41 + p40 + s41 * 0.000001;
            if (v40 > dist) {
                v40 = dist;
                d40 = d41;
            }
            dist = v32 + p40 + s32 * 0.000001;
            if (v40 > dist) {
                v40 = dist;
                d40 = d32;
            }
            dist = v31 + p40 + s31 * 0.000001;
            if (v40 > dist) {
                v40 = dist;
                d40 = d31;
            }
        }

        if (rc.onTheMap(l22)) {
            if (rc.canSenseLocation(l22)) {
                MapInfo mapInfo = rc.senseMapInfo(l22);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l22) || (rc.sensePassability(l22) && !rc.canSenseRobotAtLocation(l22) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l22), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p22 = mapInfo.getCooldownMultiplier(team);
                    s22 = Math.sqrt(l22.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p22 = 1.5;
            }
            
            dist = v31 + p22 + s31 * 0.000001;
            if (v22 > dist) {
                v22 = dist;
                d22 = d31;
            }
            dist = v32 + p22 + s32 * 0.000001;
            if (v22 > dist) {
                v22 = dist;
                d22 = d32;
            }
            dist = v23 + p22 + s23 * 0.000001;
            if (v22 > dist) {
                v22 = dist;
                d22 = d23;
            }
            dist = v14 + p22 + s14 * 0.000001;
            if (v22 > dist) {
                v22 = dist;
                d22 = d14;
            }
        }

        if (rc.onTheMap(l6)) {
            if (rc.canSenseLocation(l6)) {
                MapInfo mapInfo = rc.senseMapInfo(l6);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l6) || (rc.sensePassability(l6) && !rc.canSenseRobotAtLocation(l6) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l6), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p6 = mapInfo.getCooldownMultiplier(team);
                    s6 = Math.sqrt(l6.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p6 = 1.5;
            }
            
            dist = v14 + p6 + s14 * 0.000001;
            if (v6 > dist) {
                v6 = dist;
                d6 = d14;
            }
            dist = v15 + p6 + s15 * 0.000001;
            if (v6 > dist) {
                v6 = dist;
                d6 = d15;
            }
            dist = v7 + p6 + s7 * 0.000001;
            if (v6 > dist) {
                v6 = dist;
                d6 = d7;
            }
            dist = v13 + p6 + s13 * 0.000001;
            if (v6 > dist) {
                v6 = dist;
                d6 = d13;
            }
        }

        if (rc.onTheMap(l13)) {
            if (rc.canSenseLocation(l13)) {
                MapInfo mapInfo = rc.senseMapInfo(l13);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l13) || (rc.sensePassability(l13) && !rc.canSenseRobotAtLocation(l13) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l13), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p13 = mapInfo.getCooldownMultiplier(team);
                    s13 = Math.sqrt(l13.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p13 = 1.5;
            }
            
            dist = v22 + p13 + s22 * 0.000001;
            if (v13 > dist) {
                v13 = dist;
                d13 = d22;
            }
            dist = v23 + p13 + s23 * 0.000001;
            if (v13 > dist) {
                v13 = dist;
                d13 = d23;
            }
            dist = v14 + p13 + s14 * 0.000001;
            if (v13 > dist) {
                v13 = dist;
                d13 = d14;
            }
            dist = v6 + p13 + s6 * 0.000001;
            if (v13 > dist) {
                v13 = dist;
                d13 = d6;
            }
        }

        if (rc.onTheMap(l49)) {
            if (rc.canSenseLocation(l49)) {
                MapInfo mapInfo = rc.senseMapInfo(l49);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l49) || (rc.sensePassability(l49) && !rc.canSenseRobotAtLocation(l49) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l49), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p49 = mapInfo.getCooldownMultiplier(team);
                    s49 = Math.sqrt(l49.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p49 = 1.5;
            }
            
            dist = v50 + p49 + s50 * 0.000001;
            if (v49 > dist) {
                v49 = dist;
                d49 = d50;
            }
            dist = v41 + p49 + s41 * 0.000001;
            if (v49 > dist) {
                v49 = dist;
                d49 = d41;
            }
            dist = v40 + p49 + s40 * 0.000001;
            if (v49 > dist) {
                v49 = dist;
                d49 = d40;
            }
        }

        if (rc.onTheMap(l10)) {
            if (rc.canSenseLocation(l10)) {
                MapInfo mapInfo = rc.senseMapInfo(l10);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l10) || (rc.sensePassability(l10) && !rc.canSenseRobotAtLocation(l10) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l10), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p10 = mapInfo.getCooldownMultiplier(team);
                    s10 = Math.sqrt(l10.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p10 = 1.5;
            }
            
            dist = v18 + p10 + s18 * 0.000001;
            if (v10 > dist) {
                v10 = dist;
                d10 = d18;
            }
            dist = v9 + p10 + s9 * 0.000001;
            if (v10 > dist) {
                v10 = dist;
                d10 = d9;
            }
            dist = v17 + p10 + s17 * 0.000001;
            if (v10 > dist) {
                v10 = dist;
                d10 = d17;
            }
        }

        if (rc.onTheMap(l57)) {
            if (rc.canSenseLocation(l57)) {
                MapInfo mapInfo = rc.senseMapInfo(l57);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l57) || (rc.sensePassability(l57) && !rc.canSenseRobotAtLocation(l57) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l57), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p57 = mapInfo.getCooldownMultiplier(team);
                    s57 = Math.sqrt(l57.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p57 = 1.5;
            }
            
            dist = v50 + p57 + s50 * 0.000001;
            if (v57 > dist) {
                v57 = dist;
                d57 = d50;
            }
            dist = v49 + p57 + s49 * 0.000001;
            if (v57 > dist) {
                v57 = dist;
                d57 = d49;
            }
        }

        if (rc.onTheMap(l5)) {
            if (rc.canSenseLocation(l5)) {
                MapInfo mapInfo = rc.senseMapInfo(l5);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l5) || (rc.sensePassability(l5) && !rc.canSenseRobotAtLocation(l5) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l5), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p5 = mapInfo.getCooldownMultiplier(team);
                    s5 = Math.sqrt(l5.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p5 = 1.5;
            }
            
            dist = v13 + p5 + s13 * 0.000001;
            if (v5 > dist) {
                v5 = dist;
                d5 = d13;
            }
            dist = v14 + p5 + s14 * 0.000001;
            if (v5 > dist) {
                v5 = dist;
                d5 = d14;
            }
            dist = v6 + p5 + s6 * 0.000001;
            if (v5 > dist) {
                v5 = dist;
                d5 = d6;
            }
        }

        if (rc.onTheMap(l11)) {
            if (rc.canSenseLocation(l11)) {
                MapInfo mapInfo = rc.senseMapInfo(l11);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l11) || (rc.sensePassability(l11) && !rc.canSenseRobotAtLocation(l11) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l11), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p11 = mapInfo.getCooldownMultiplier(team);
                    s11 = Math.sqrt(l11.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p11 = 1.5;
            }
            
            dist = v10 + p11 + s10 * 0.000001;
            if (v11 > dist) {
                v11 = dist;
                d11 = d10;
            }
            dist = v18 + p11 + s18 * 0.000001;
            if (v11 > dist) {
                v11 = dist;
                d11 = d18;
            }
        }

        if (rc.onTheMap(l30)) {
            if (rc.canSenseLocation(l30)) {
                MapInfo mapInfo = rc.senseMapInfo(l30);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l30) || (rc.sensePassability(l30) && !rc.canSenseRobotAtLocation(l30) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l30), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p30 = mapInfo.getCooldownMultiplier(team);
                    s30 = Math.sqrt(l30.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p30 = 1.5;
            }
            
            dist = v40 + p30 + s40 * 0.000001;
            if (v30 > dist) {
                v30 = dist;
                d30 = d40;
            }
            dist = v31 + p30 + s31 * 0.000001;
            if (v30 > dist) {
                v30 = dist;
                d30 = d31;
            }
            dist = v22 + p30 + s22 * 0.000001;
            if (v30 > dist) {
                v30 = dist;
                d30 = d22;
            }
        }

        if (rc.onTheMap(l2)) {
            if (rc.canSenseLocation(l2)) {
                MapInfo mapInfo = rc.senseMapInfo(l2);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l2) || (rc.sensePassability(l2) && !rc.canSenseRobotAtLocation(l2) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l2), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p2 = mapInfo.getCooldownMultiplier(team);
                    s2 = Math.sqrt(l2.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p2 = 1.5;
            }
            
            dist = v8 + p2 + s8 * 0.000001;
            if (v2 > dist) {
                v2 = dist;
                d2 = d8;
            }
            dist = v9 + p2 + s9 * 0.000001;
            if (v2 > dist) {
                v2 = dist;
                d2 = d9;
            }
            dist = v7 + p2 + s7 * 0.000001;
            if (v2 > dist) {
                v2 = dist;
                d2 = d7;
            }
        }

        if (rc.onTheMap(l1)) {
            if (rc.canSenseLocation(l1)) {
                MapInfo mapInfo = rc.senseMapInfo(l1);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l1) || (rc.sensePassability(l1) && !rc.canSenseRobotAtLocation(l1) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l1), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p1 = mapInfo.getCooldownMultiplier(team);
                    s1 = Math.sqrt(l1.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p1 = 1.5;
            }
            
            dist = v7 + p1 + s7 * 0.000001;
            if (v1 > dist) {
                v1 = dist;
                d1 = d7;
            }
            dist = v8 + p1 + s8 * 0.000001;
            if (v1 > dist) {
                v1 = dist;
                d1 = d8;
            }
            dist = v2 + p1 + s2 * 0.000001;
            if (v1 > dist) {
                v1 = dist;
                d1 = d2;
            }
            dist = v6 + p1 + s6 * 0.000001;
            if (v1 > dist) {
                v1 = dist;
                d1 = d6;
            }
        }

        if (rc.onTheMap(l39)) {
            if (rc.canSenseLocation(l39)) {
                MapInfo mapInfo = rc.senseMapInfo(l39);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l39) || (rc.sensePassability(l39) && !rc.canSenseRobotAtLocation(l39) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l39), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p39 = mapInfo.getCooldownMultiplier(team);
                    s39 = Math.sqrt(l39.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p39 = 1.5;
            }
            
            dist = v49 + p39 + s49 * 0.000001;
            if (v39 > dist) {
                v39 = dist;
                d39 = d49;
            }
            dist = v40 + p39 + s40 * 0.000001;
            if (v39 > dist) {
                v39 = dist;
                d39 = d40;
            }
            dist = v31 + p39 + s31 * 0.000001;
            if (v39 > dist) {
                v39 = dist;
                d39 = d31;
            }
            dist = v30 + p39 + s30 * 0.000001;
            if (v39 > dist) {
                v39 = dist;
                d39 = d30;
            }
        }

        if (rc.onTheMap(l21)) {
            if (rc.canSenseLocation(l21)) {
                MapInfo mapInfo = rc.senseMapInfo(l21);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l21) || (rc.sensePassability(l21) && !rc.canSenseRobotAtLocation(l21) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l21), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p21 = mapInfo.getCooldownMultiplier(team);
                    s21 = Math.sqrt(l21.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p21 = 1.5;
            }
            
            dist = v30 + p21 + s30 * 0.000001;
            if (v21 > dist) {
                v21 = dist;
                d21 = d30;
            }
            dist = v31 + p21 + s31 * 0.000001;
            if (v21 > dist) {
                v21 = dist;
                d21 = d31;
            }
            dist = v22 + p21 + s22 * 0.000001;
            if (v21 > dist) {
                v21 = dist;
                d21 = d22;
            }
            dist = v13 + p21 + s13 * 0.000001;
            if (v21 > dist) {
                v21 = dist;
                d21 = d13;
            }
        }

        if (rc.onTheMap(l3)) {
            if (rc.canSenseLocation(l3)) {
                MapInfo mapInfo = rc.senseMapInfo(l3);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l3) || (rc.sensePassability(l3) && !rc.canSenseRobotAtLocation(l3) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l3), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p3 = mapInfo.getCooldownMultiplier(team);
                    s3 = Math.sqrt(l3.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p3 = 1.5;
            }
            
            dist = v9 + p3 + s9 * 0.000001;
            if (v3 > dist) {
                v3 = dist;
                d3 = d9;
            }
            dist = v10 + p3 + s10 * 0.000001;
            if (v3 > dist) {
                v3 = dist;
                d3 = d10;
            }
            dist = v2 + p3 + s2 * 0.000001;
            if (v3 > dist) {
                v3 = dist;
                d3 = d2;
            }
            dist = v8 + p3 + s8 * 0.000001;
            if (v3 > dist) {
                v3 = dist;
                d3 = d8;
            }
        }

        if (rc.onTheMap(l4)) {
            if (rc.canSenseLocation(l4)) {
                MapInfo mapInfo = rc.senseMapInfo(l4);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l4) || (rc.sensePassability(l4) && !rc.canSenseRobotAtLocation(l4) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l4), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p4 = mapInfo.getCooldownMultiplier(team);
                    s4 = Math.sqrt(l4.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p4 = 1.5;
            }
            
            dist = v10 + p4 + s10 * 0.000001;
            if (v4 > dist) {
                v4 = dist;
                d4 = d10;
            }
            dist = v11 + p4 + s11 * 0.000001;
            if (v4 > dist) {
                v4 = dist;
                d4 = d11;
            }
            dist = v3 + p4 + s3 * 0.000001;
            if (v4 > dist) {
                v4 = dist;
                d4 = d3;
            }
            dist = v9 + p4 + s9 * 0.000001;
            if (v4 > dist) {
                v4 = dist;
                d4 = d9;
            }
        }

        if (rc.onTheMap(l48)) {
            if (rc.canSenseLocation(l48)) {
                MapInfo mapInfo = rc.senseMapInfo(l48);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l48) || (rc.sensePassability(l48) && !rc.canSenseRobotAtLocation(l48) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l48), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p48 = mapInfo.getCooldownMultiplier(team);
                    s48 = Math.sqrt(l48.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p48 = 1.5;
            }
            
            dist = v57 + p48 + s57 * 0.000001;
            if (v48 > dist) {
                v48 = dist;
                d48 = d57;
            }
            dist = v49 + p48 + s49 * 0.000001;
            if (v48 > dist) {
                v48 = dist;
                d48 = d49;
            }
            dist = v40 + p48 + s40 * 0.000001;
            if (v48 > dist) {
                v48 = dist;
                d48 = d40;
            }
            dist = v39 + p48 + s39 * 0.000001;
            if (v48 > dist) {
                v48 = dist;
                d48 = d39;
            }
        }

        if (rc.onTheMap(l0)) {
            if (rc.canSenseLocation(l0)) {
                MapInfo mapInfo = rc.senseMapInfo(l0);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l0) || (rc.sensePassability(l0) && !rc.canSenseRobotAtLocation(l0) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l0), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p0 = mapInfo.getCooldownMultiplier(team);
                    s0 = Math.sqrt(l0.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p0 = 1.5;
            }
            
            dist = v6 + p0 + s6 * 0.000001;
            if (v0 > dist) {
                v0 = dist;
                d0 = d6;
            }
            dist = v7 + p0 + s7 * 0.000001;
            if (v0 > dist) {
                v0 = dist;
                d0 = d7;
            }
            dist = v1 + p0 + s1 * 0.000001;
            if (v0 > dist) {
                v0 = dist;
                d0 = d1;
            }
            dist = v5 + p0 + s5 * 0.000001;
            if (v0 > dist) {
                v0 = dist;
                d0 = d5;
            }
        }

        if (rc.onTheMap(l12)) {
            if (rc.canSenseLocation(l12)) {
                MapInfo mapInfo = rc.senseMapInfo(l12);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l12) || (rc.sensePassability(l12) && !rc.canSenseRobotAtLocation(l12) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l12), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p12 = mapInfo.getCooldownMultiplier(team);
                    s12 = Math.sqrt(l12.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p12 = 1.5;
            }
            
            dist = v21 + p12 + s21 * 0.000001;
            if (v12 > dist) {
                v12 = dist;
                d12 = d21;
            }
            dist = v22 + p12 + s22 * 0.000001;
            if (v12 > dist) {
                v12 = dist;
                d12 = d22;
            }
            dist = v13 + p12 + s13 * 0.000001;
            if (v12 > dist) {
                v12 = dist;
                d12 = d13;
            }
            dist = v5 + p12 + s5 * 0.000001;
            if (v12 > dist) {
                v12 = dist;
                d12 = d5;
            }
        }
    
        int dx = targetLocation.x - l34.x;
        int dy = targetLocation.y - l34.y;

        switch(dx) {
            case -4:
                switch(dy) {
                    case -2:
                        if (v0 < 1000000) {
                            bug.reset();
                            return d0;
                        } break;
                    case -1:
                        if (v1 < 1000000) {
                            bug.reset();
                            return d1;
                        } break;
                    case 0:
                        if (v2 < 1000000) {
                            bug.reset();
                            return d2;
                        } break;
                    case 1:
                        if (v3 < 1000000) {
                            bug.reset();
                            return d3;
                        } break;
                    case 2:
                        if (v4 < 1000000) {
                            bug.reset();
                            return d4;
                        } break;
                } break;

            case -3:
                switch(dy) {
                    case -3:
                        if (v5 < 1000000) {
                            bug.reset();
                            return d5;
                        } break;
                    case -2:
                        if (v6 < 1000000) {
                            bug.reset();
                            return d6;
                        } break;
                    case -1:
                        if (v7 < 1000000) {
                            bug.reset();
                            return d7;
                        } break;
                    case 0:
                        if (v8 < 1000000) {
                            bug.reset();
                            return d8;
                        } break;
                    case 1:
                        if (v9 < 1000000) {
                            bug.reset();
                            return d9;
                        } break;
                    case 2:
                        if (v10 < 1000000) {
                            bug.reset();
                            return d10;
                        } break;
                    case 3:
                        if (v11 < 1000000) {
                            bug.reset();
                            return d11;
                        } break;
                } break;

            case -2:
                switch(dy) {
                    case -4:
                        if (v12 < 1000000) {
                            bug.reset();
                            return d12;
                        } break;
                    case -3:
                        if (v13 < 1000000) {
                            bug.reset();
                            return d13;
                        } break;
                    case -2:
                        if (v14 < 1000000) {
                            bug.reset();
                            return d14;
                        } break;
                    case -1:
                        if (v15 < 1000000) {
                            bug.reset();
                            return d15;
                        } break;
                    case 0:
                        if (v16 < 1000000) {
                            bug.reset();
                            return d16;
                        } break;
                    case 1:
                        if (v17 < 1000000) {
                            bug.reset();
                            return d17;
                        } break;
                    case 2:
                        if (v18 < 1000000) {
                            bug.reset();
                            return d18;
                        } break;
                } break;

            case -1:
                switch(dy) {
                    case -4:
                        if (v21 < 1000000) {
                            bug.reset();
                            return d21;
                        } break;
                    case -3:
                        if (v22 < 1000000) {
                            bug.reset();
                            return d22;
                        } break;
                    case -2:
                        if (v23 < 1000000) {
                            bug.reset();
                            return d23;
                        } break;
                    case -1:
                        if (v24 < 1000000) {
                            bug.reset();
                            return d24;
                        } break;
                    case 0:
                        if (v25 < 1000000) {
                            bug.reset();
                            return d25;
                        } break;
                    case 1:
                        if (v26 < 1000000) {
                            bug.reset();
                            return d26;
                        } break;
                } break;

            case 0:
                switch(dy) {
                    case -4:
                        if (v30 < 1000000) {
                            bug.reset();
                            return d30;
                        } break;
                    case -3:
                        if (v31 < 1000000) {
                            bug.reset();
                            return d31;
                        } break;
                    case -2:
                        if (v32 < 1000000) {
                            bug.reset();
                            return d32;
                        } break;
                    case -1:
                        if (v33 < 1000000) {
                            bug.reset();
                            return d33;
                        } break;
                } break;

            case 1:
                switch(dy) {
                    case -4:
                        if (v39 < 1000000) {
                            bug.reset();
                            return d39;
                        } break;
                    case -3:
                        if (v40 < 1000000) {
                            bug.reset();
                            return d40;
                        } break;
                    case -2:
                        if (v41 < 1000000) {
                            bug.reset();
                            return d41;
                        } break;
                    case -1:
                        if (v42 < 1000000) {
                            bug.reset();
                            return d42;
                        } break;
                } break;

            case 2:
                switch(dy) {
                    case -4:
                        if (v48 < 1000000) {
                            bug.reset();
                            return d48;
                        } break;
                    case -3:
                        if (v49 < 1000000) {
                            bug.reset();
                            return d49;
                        } break;
                    case -2:
                        if (v50 < 1000000) {
                            bug.reset();
                            return d50;
                        } break;
                } break;

            case 3:
                switch(dy) {
                    case -3:
                        if (v57 < 1000000) {
                            bug.reset();
                            return d57;
                        } break;
                } break;

            case 4:
                switch(dy) {
                } break;

        }
    
        Direction ans = Direction.CENTER;

        double dist0 = v0 + s0;
        if (dist0 < localBest) {
            localBest = dist0;
            ans = d0;
        }

        double dist1 = v1 + s1;
        if (dist1 < localBest) {
            localBest = dist1;
            ans = d1;
        }

        double dist2 = v2 + s2;
        if (dist2 < localBest) {
            localBest = dist2;
            ans = d2;
        }

        double dist3 = v3 + s3;
        if (dist3 < localBest) {
            localBest = dist3;
            ans = d3;
        }

        double dist4 = v4 + s4;
        if (dist4 < localBest) {
            localBest = dist4;
            ans = d4;
        }

        double dist5 = v5 + s5;
        if (dist5 < localBest) {
            localBest = dist5;
            ans = d5;
        }

        double dist6 = v6 + s6;
        if (dist6 < localBest) {
            localBest = dist6;
            ans = d6;
        }

        double dist7 = v7 + s7;
        if (dist7 < localBest) {
            localBest = dist7;
            ans = d7;
        }

        double dist8 = v8 + s8;
        if (dist8 < localBest) {
            localBest = dist8;
            ans = d8;
        }

        double dist9 = v9 + s9;
        if (dist9 < localBest) {
            localBest = dist9;
            ans = d9;
        }

        double dist10 = v10 + s10;
        if (dist10 < localBest) {
            localBest = dist10;
            ans = d10;
        }

        double dist11 = v11 + s11;
        if (dist11 < localBest) {
            localBest = dist11;
            ans = d11;
        }

        double dist12 = v12 + s12;
        if (dist12 < localBest) {
            localBest = dist12;
            ans = d12;
        }

        double dist13 = v13 + s13;
        if (dist13 < localBest) {
            localBest = dist13;
            ans = d13;
        }

        double dist14 = v14 + s14;
        if (dist14 < localBest) {
            localBest = dist14;
            ans = d14;
        }

        double dist15 = v15 + s15;
        if (dist15 < localBest) {
            localBest = dist15;
            ans = d15;
        }

        double dist16 = v16 + s16;
        if (dist16 < localBest) {
            localBest = dist16;
            ans = d16;
        }

        double dist17 = v17 + s17;
        if (dist17 < localBest) {
            localBest = dist17;
            ans = d17;
        }

        double dist18 = v18 + s18;
        if (dist18 < localBest) {
            localBest = dist18;
            ans = d18;
        }

        double dist21 = v21 + s21;
        if (dist21 < localBest) {
            localBest = dist21;
            ans = d21;
        }

        double dist22 = v22 + s22;
        if (dist22 < localBest) {
            localBest = dist22;
            ans = d22;
        }

        double dist23 = v23 + s23;
        if (dist23 < localBest) {
            localBest = dist23;
            ans = d23;
        }

        double dist24 = v24 + s24;
        if (dist24 < localBest) {
            localBest = dist24;
            ans = d24;
        }

        double dist25 = v25 + s25;
        if (dist25 < localBest) {
            localBest = dist25;
            ans = d25;
        }

        double dist26 = v26 + s26;
        if (dist26 < localBest) {
            localBest = dist26;
            ans = d26;
        }

        double dist30 = v30 + s30;
        if (dist30 < localBest) {
            localBest = dist30;
            ans = d30;
        }

        double dist31 = v31 + s31;
        if (dist31 < localBest) {
            localBest = dist31;
            ans = d31;
        }

        double dist32 = v32 + s32;
        if (dist32 < localBest) {
            localBest = dist32;
            ans = d32;
        }

        double dist33 = v33 + s33;
        if (dist33 < localBest) {
            localBest = dist33;
            ans = d33;
        }

        double dist39 = v39 + s39;
        if (dist39 < localBest) {
            localBest = dist39;
            ans = d39;
        }

        double dist40 = v40 + s40;
        if (dist40 < localBest) {
            localBest = dist40;
            ans = d40;
        }

        double dist41 = v41 + s41;
        if (dist41 < localBest) {
            localBest = dist41;
            ans = d41;
        }

        double dist42 = v42 + s42;
        if (dist42 < localBest) {
            localBest = dist42;
            ans = d42;
        }

        double dist48 = v48 + s48;
        if (dist48 < localBest) {
            localBest = dist48;
            ans = d48;
        }

        double dist49 = v49 + s49;
        if (dist49 < localBest) {
            localBest = dist49;
            ans = d49;
        }

        double dist50 = v50 + s50;
        if (dist50 < localBest) {
            localBest = dist50;
            ans = d50;
        }

        double dist57 = v57 + s57;
        if (dist57 < localBest) {
            localBest = dist57;
            ans = d57;
        }

        if (localBest < globalBest) {
            globalBest = localBest;
            bug.reset();
            return ans;
        }

        consecutiveBugNavRoundCount += 1;

        if (consecutiveBugNavRoundCount > 40) {
            globalBest = 1000000;
            consecutiveBugNavRoundCount = 0;
        }

        bug.move(targetLocation, lastDirection);
        return null;
    }

    private Direction getBestDirection6() throws GameActionException {
        double localBest = 1000000.0;
        double dist = 0.0;
        l34 = currentLocation;
        v34 = 0;
        d35 = null;
        l35 = l34.add(Direction.NORTH);
        v35 = 1000000;
        p35 = 1000000;
        s35 = Math.sqrt(l35.distanceSquaredTo(targetLocation));
        d26 = null;
        l26 = l34.add(Direction.NORTHWEST);
        v26 = 1000000;
        p26 = 1000000;
        s26 = Math.sqrt(l26.distanceSquaredTo(targetLocation));
        d25 = null;
        l25 = l34.add(Direction.WEST);
        v25 = 1000000;
        p25 = 1000000;
        s25 = Math.sqrt(l25.distanceSquaredTo(targetLocation));
        d24 = null;
        l24 = l34.add(Direction.SOUTHWEST);
        v24 = 1000000;
        p24 = 1000000;
        s24 = Math.sqrt(l24.distanceSquaredTo(targetLocation));
        d33 = null;
        l33 = l34.add(Direction.SOUTH);
        v33 = 1000000;
        p33 = 1000000;
        s33 = Math.sqrt(l33.distanceSquaredTo(targetLocation));
        d23 = null;
        l23 = l33.add(Direction.SOUTHWEST);
        v23 = 1000000;
        p23 = 1000000;
        s23 = Math.sqrt(l23.distanceSquaredTo(targetLocation));
        d32 = null;
        l32 = l33.add(Direction.SOUTH);
        v32 = 1000000;
        p32 = 1000000;
        s32 = Math.sqrt(l32.distanceSquaredTo(targetLocation));
        d17 = null;
        l17 = l25.add(Direction.NORTHWEST);
        v17 = 1000000;
        p17 = 1000000;
        s17 = Math.sqrt(l17.distanceSquaredTo(targetLocation));
        d16 = null;
        l16 = l25.add(Direction.WEST);
        v16 = 1000000;
        p16 = 1000000;
        s16 = Math.sqrt(l16.distanceSquaredTo(targetLocation));
        d15 = null;
        l15 = l25.add(Direction.SOUTHWEST);
        v15 = 1000000;
        p15 = 1000000;
        s15 = Math.sqrt(l15.distanceSquaredTo(targetLocation));
        d36 = null;
        l36 = l35.add(Direction.NORTH);
        v36 = 1000000;
        p36 = 1000000;
        s36 = Math.sqrt(l36.distanceSquaredTo(targetLocation));
        d27 = null;
        l27 = l35.add(Direction.NORTHWEST);
        v27 = 1000000;
        p27 = 1000000;
        s27 = Math.sqrt(l27.distanceSquaredTo(targetLocation));
        d14 = null;
        l14 = l24.add(Direction.SOUTHWEST);
        v14 = 1000000;
        p14 = 1000000;
        s14 = Math.sqrt(l14.distanceSquaredTo(targetLocation));
        d18 = null;
        l18 = l26.add(Direction.NORTHWEST);
        v18 = 1000000;
        p18 = 1000000;
        s18 = Math.sqrt(l18.distanceSquaredTo(targetLocation));
        d37 = null;
        l37 = l36.add(Direction.NORTH);
        v37 = 1000000;
        p37 = 1000000;
        s37 = Math.sqrt(l37.distanceSquaredTo(targetLocation));
        d28 = null;
        l28 = l36.add(Direction.NORTHWEST);
        v28 = 1000000;
        p28 = 1000000;
        s28 = Math.sqrt(l28.distanceSquaredTo(targetLocation));
        d9 = null;
        l9 = l16.add(Direction.NORTHWEST);
        v9 = 1000000;
        p9 = 1000000;
        s9 = Math.sqrt(l9.distanceSquaredTo(targetLocation));
        d8 = null;
        l8 = l16.add(Direction.WEST);
        v8 = 1000000;
        p8 = 1000000;
        s8 = Math.sqrt(l8.distanceSquaredTo(targetLocation));
        d7 = null;
        l7 = l16.add(Direction.SOUTHWEST);
        v7 = 1000000;
        p7 = 1000000;
        s7 = Math.sqrt(l7.distanceSquaredTo(targetLocation));
        d22 = null;
        l22 = l32.add(Direction.SOUTHWEST);
        v22 = 1000000;
        p22 = 1000000;
        s22 = Math.sqrt(l22.distanceSquaredTo(targetLocation));
        d31 = null;
        l31 = l32.add(Direction.SOUTH);
        v31 = 1000000;
        p31 = 1000000;
        s31 = Math.sqrt(l31.distanceSquaredTo(targetLocation));
        d19 = null;
        l19 = l27.add(Direction.NORTHWEST);
        v19 = 1000000;
        p19 = 1000000;
        s19 = Math.sqrt(l19.distanceSquaredTo(targetLocation));
        d6 = null;
        l6 = l15.add(Direction.SOUTHWEST);
        v6 = 1000000;
        p6 = 1000000;
        s6 = Math.sqrt(l6.distanceSquaredTo(targetLocation));
        d13 = null;
        l13 = l23.add(Direction.SOUTHWEST);
        v13 = 1000000;
        p13 = 1000000;
        s13 = Math.sqrt(l13.distanceSquaredTo(targetLocation));
        d10 = null;
        l10 = l17.add(Direction.NORTHWEST);
        v10 = 1000000;
        p10 = 1000000;
        s10 = Math.sqrt(l10.distanceSquaredTo(targetLocation));
        d5 = null;
        l5 = l14.add(Direction.SOUTHWEST);
        v5 = 1000000;
        p5 = 1000000;
        s5 = Math.sqrt(l5.distanceSquaredTo(targetLocation));
        d11 = null;
        l11 = l18.add(Direction.NORTHWEST);
        v11 = 1000000;
        p11 = 1000000;
        s11 = Math.sqrt(l11.distanceSquaredTo(targetLocation));
        d38 = null;
        l38 = l37.add(Direction.NORTH);
        v38 = 1000000;
        p38 = 1000000;
        s38 = Math.sqrt(l38.distanceSquaredTo(targetLocation));
        d29 = null;
        l29 = l37.add(Direction.NORTHWEST);
        v29 = 1000000;
        p29 = 1000000;
        s29 = Math.sqrt(l29.distanceSquaredTo(targetLocation));
        d3 = null;
        l3 = l8.add(Direction.NORTHWEST);
        v3 = 1000000;
        p3 = 1000000;
        s3 = Math.sqrt(l3.distanceSquaredTo(targetLocation));
        d2 = null;
        l2 = l8.add(Direction.WEST);
        v2 = 1000000;
        p2 = 1000000;
        s2 = Math.sqrt(l2.distanceSquaredTo(targetLocation));
        d1 = null;
        l1 = l8.add(Direction.SOUTHWEST);
        v1 = 1000000;
        p1 = 1000000;
        s1 = Math.sqrt(l1.distanceSquaredTo(targetLocation));
        d21 = null;
        l21 = l31.add(Direction.SOUTHWEST);
        v21 = 1000000;
        p21 = 1000000;
        s21 = Math.sqrt(l21.distanceSquaredTo(targetLocation));
        d30 = null;
        l30 = l31.add(Direction.SOUTH);
        v30 = 1000000;
        p30 = 1000000;
        s30 = Math.sqrt(l30.distanceSquaredTo(targetLocation));
        d20 = null;
        l20 = l28.add(Direction.NORTHWEST);
        v20 = 1000000;
        p20 = 1000000;
        s20 = Math.sqrt(l20.distanceSquaredTo(targetLocation));
        d4 = null;
        l4 = l9.add(Direction.NORTHWEST);
        v4 = 1000000;
        p4 = 1000000;
        s4 = Math.sqrt(l4.distanceSquaredTo(targetLocation));
        d12 = null;
        l12 = l22.add(Direction.SOUTHWEST);
        v12 = 1000000;
        p12 = 1000000;
        s12 = Math.sqrt(l12.distanceSquaredTo(targetLocation));
        d0 = null;
        l0 = l7.add(Direction.SOUTHWEST);
        v0 = 1000000;
        p0 = 1000000;
        s0 = Math.sqrt(l0.distanceSquaredTo(targetLocation));
    

        if (rc.onTheMap(l33) && rc.canMove(Direction.SOUTH)) {
            if (rc.canSenseLocation(l33)) {
                MapInfo mapInfo = rc.senseMapInfo(l33);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l33) || (rc.sensePassability(l33) && !rc.canSenseRobotAtLocation(l33) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l33), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p33 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p33 = 1.5;
            }
            
            dist = v34 + p33 + s34 * 0.000001;
            if (v33 > dist) {
                v33 = dist;
                d33 = Direction.SOUTH;
            }
            dist = v25 + p33 + s25 * 0.000001;
            if (v33 > dist) {
                v33 = dist;
                d33 = d25;
            }
        }

        if (rc.onTheMap(l25) && rc.canMove(Direction.WEST)) {
            if (rc.canSenseLocation(l25)) {
                MapInfo mapInfo = rc.senseMapInfo(l25);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l25) || (rc.sensePassability(l25) && !rc.canSenseRobotAtLocation(l25) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l25), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p25 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p25 = 1.5;
            }
            
            dist = v34 + p25 + s34 * 0.000001;
            if (v25 > dist) {
                v25 = dist;
                d25 = Direction.WEST;
            }
            dist = v35 + p25 + s35 * 0.000001;
            if (v25 > dist) {
                v25 = dist;
                d25 = d35;
            }
            dist = v33 + p25 + s33 * 0.000001;
            if (v25 > dist) {
                v25 = dist;
                d25 = d33;
            }
        }

        if (rc.onTheMap(l35) && rc.canMove(Direction.NORTH)) {
            if (rc.canSenseLocation(l35)) {
                MapInfo mapInfo = rc.senseMapInfo(l35);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l35) || (rc.sensePassability(l35) && !rc.canSenseRobotAtLocation(l35) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l35), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p35 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p35 = 1.5;
            }
            
            dist = v25 + p35 + s25 * 0.000001;
            if (v35 > dist) {
                v35 = dist;
                d35 = d25;
            }
            dist = v34 + p35 + s34 * 0.000001;
            if (v35 > dist) {
                v35 = dist;
                d35 = Direction.NORTH;
            }
        }

        if (rc.onTheMap(l24) && rc.canMove(Direction.SOUTHWEST)) {
            if (rc.canSenseLocation(l24)) {
                MapInfo mapInfo = rc.senseMapInfo(l24);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l24) || (rc.sensePassability(l24) && !rc.canSenseRobotAtLocation(l24) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l24), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p24 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p24 = 1.5;
            }
            
            dist = v33 + p24 + s33 * 0.000001;
            if (v24 > dist) {
                v24 = dist;
                d24 = d33;
            }
            dist = v34 + p24 + s34 * 0.000001;
            if (v24 > dist) {
                v24 = dist;
                d24 = Direction.SOUTHWEST;
            }
            dist = v25 + p24 + s25 * 0.000001;
            if (v24 > dist) {
                v24 = dist;
                d24 = d25;
            }
        }

        if (rc.onTheMap(l26) && rc.canMove(Direction.NORTHWEST)) {
            if (rc.canSenseLocation(l26)) {
                MapInfo mapInfo = rc.senseMapInfo(l26);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l26) || (rc.sensePassability(l26) && !rc.canSenseRobotAtLocation(l26) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l26), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p26 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p26 = 1.5;
            }
            
            dist = v35 + p26 + s35 * 0.000001;
            if (v26 > dist) {
                v26 = dist;
                d26 = d35;
            }
            dist = v25 + p26 + s25 * 0.000001;
            if (v26 > dist) {
                v26 = dist;
                d26 = d25;
            }
            dist = v34 + p26 + s34 * 0.000001;
            if (v26 > dist) {
                v26 = dist;
                d26 = Direction.NORTHWEST;
            }
        }

        if (rc.onTheMap(l36)) {
            if (rc.canSenseLocation(l36)) {
                MapInfo mapInfo = rc.senseMapInfo(l36);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l36) || (rc.sensePassability(l36) && !rc.canSenseRobotAtLocation(l36) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l36), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p36 = mapInfo.getCooldownMultiplier(team);
                    s36 = Math.sqrt(l36.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p36 = 1.5;
            }
            
            dist = v26 + p36 + s26 * 0.000001;
            if (v36 > dist) {
                v36 = dist;
                d36 = d26;
            }
            dist = v35 + p36 + s35 * 0.000001;
            if (v36 > dist) {
                v36 = dist;
                d36 = d35;
            }
        }

        if (rc.onTheMap(l16)) {
            if (rc.canSenseLocation(l16)) {
                MapInfo mapInfo = rc.senseMapInfo(l16);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l16) || (rc.sensePassability(l16) && !rc.canSenseRobotAtLocation(l16) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l16), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p16 = mapInfo.getCooldownMultiplier(team);
                    s16 = Math.sqrt(l16.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p16 = 1.5;
            }
            
            dist = v25 + p16 + s25 * 0.000001;
            if (v16 > dist) {
                v16 = dist;
                d16 = d25;
            }
            dist = v26 + p16 + s26 * 0.000001;
            if (v16 > dist) {
                v16 = dist;
                d16 = d26;
            }
            dist = v24 + p16 + s24 * 0.000001;
            if (v16 > dist) {
                v16 = dist;
                d16 = d24;
            }
        }

        if (rc.onTheMap(l32)) {
            if (rc.canSenseLocation(l32)) {
                MapInfo mapInfo = rc.senseMapInfo(l32);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l32) || (rc.sensePassability(l32) && !rc.canSenseRobotAtLocation(l32) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l32), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p32 = mapInfo.getCooldownMultiplier(team);
                    s32 = Math.sqrt(l32.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p32 = 1.5;
            }
            
            dist = v33 + p32 + s33 * 0.000001;
            if (v32 > dist) {
                v32 = dist;
                d32 = d33;
            }
            dist = v24 + p32 + s24 * 0.000001;
            if (v32 > dist) {
                v32 = dist;
                d32 = d24;
            }
        }

        if (rc.onTheMap(l27)) {
            if (rc.canSenseLocation(l27)) {
                MapInfo mapInfo = rc.senseMapInfo(l27);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l27) || (rc.sensePassability(l27) && !rc.canSenseRobotAtLocation(l27) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l27), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p27 = mapInfo.getCooldownMultiplier(team);
                    s27 = Math.sqrt(l27.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p27 = 1.5;
            }
            
            dist = v36 + p27 + s36 * 0.000001;
            if (v27 > dist) {
                v27 = dist;
                d27 = d36;
            }
            dist = v17 + p27 + s17 * 0.000001;
            if (v27 > dist) {
                v27 = dist;
                d27 = d17;
            }
            dist = v26 + p27 + s26 * 0.000001;
            if (v27 > dist) {
                v27 = dist;
                d27 = d26;
            }
            dist = v35 + p27 + s35 * 0.000001;
            if (v27 > dist) {
                v27 = dist;
                d27 = d35;
            }
        }

        if (rc.onTheMap(l15)) {
            if (rc.canSenseLocation(l15)) {
                MapInfo mapInfo = rc.senseMapInfo(l15);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l15) || (rc.sensePassability(l15) && !rc.canSenseRobotAtLocation(l15) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l15), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p15 = mapInfo.getCooldownMultiplier(team);
                    s15 = Math.sqrt(l15.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p15 = 1.5;
            }
            
            dist = v24 + p15 + s24 * 0.000001;
            if (v15 > dist) {
                v15 = dist;
                d15 = d24;
            }
            dist = v25 + p15 + s25 * 0.000001;
            if (v15 > dist) {
                v15 = dist;
                d15 = d25;
            }
            dist = v16 + p15 + s16 * 0.000001;
            if (v15 > dist) {
                v15 = dist;
                d15 = d16;
            }
            dist = v23 + p15 + s23 * 0.000001;
            if (v15 > dist) {
                v15 = dist;
                d15 = d23;
            }
        }

        if (rc.onTheMap(l23)) {
            if (rc.canSenseLocation(l23)) {
                MapInfo mapInfo = rc.senseMapInfo(l23);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l23) || (rc.sensePassability(l23) && !rc.canSenseRobotAtLocation(l23) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l23), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p23 = mapInfo.getCooldownMultiplier(team);
                    s23 = Math.sqrt(l23.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p23 = 1.5;
            }
            
            dist = v32 + p23 + s32 * 0.000001;
            if (v23 > dist) {
                v23 = dist;
                d23 = d32;
            }
            dist = v33 + p23 + s33 * 0.000001;
            if (v23 > dist) {
                v23 = dist;
                d23 = d33;
            }
            dist = v24 + p23 + s24 * 0.000001;
            if (v23 > dist) {
                v23 = dist;
                d23 = d24;
            }
            dist = v15 + p23 + s15 * 0.000001;
            if (v23 > dist) {
                v23 = dist;
                d23 = d15;
            }
        }

        if (rc.onTheMap(l17)) {
            if (rc.canSenseLocation(l17)) {
                MapInfo mapInfo = rc.senseMapInfo(l17);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l17) || (rc.sensePassability(l17) && !rc.canSenseRobotAtLocation(l17) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l17), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p17 = mapInfo.getCooldownMultiplier(team);
                    s17 = Math.sqrt(l17.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p17 = 1.5;
            }
            
            dist = v26 + p17 + s26 * 0.000001;
            if (v17 > dist) {
                v17 = dist;
                d17 = d26;
            }
            dist = v27 + p17 + s27 * 0.000001;
            if (v17 > dist) {
                v17 = dist;
                d17 = d27;
            }
            dist = v16 + p17 + s16 * 0.000001;
            if (v17 > dist) {
                v17 = dist;
                d17 = d16;
            }
            dist = v25 + p17 + s25 * 0.000001;
            if (v17 > dist) {
                v17 = dist;
                d17 = d25;
            }
        }

        if (rc.onTheMap(l14)) {
            if (rc.canSenseLocation(l14)) {
                MapInfo mapInfo = rc.senseMapInfo(l14);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l14) || (rc.sensePassability(l14) && !rc.canSenseRobotAtLocation(l14) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l14), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p14 = mapInfo.getCooldownMultiplier(team);
                    s14 = Math.sqrt(l14.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p14 = 1.5;
            }
            
            dist = v23 + p14 + s23 * 0.000001;
            if (v14 > dist) {
                v14 = dist;
                d14 = d23;
            }
            dist = v24 + p14 + s24 * 0.000001;
            if (v14 > dist) {
                v14 = dist;
                d14 = d24;
            }
            dist = v15 + p14 + s15 * 0.000001;
            if (v14 > dist) {
                v14 = dist;
                d14 = d15;
            }
        }

        if (rc.onTheMap(l18)) {
            if (rc.canSenseLocation(l18)) {
                MapInfo mapInfo = rc.senseMapInfo(l18);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l18) || (rc.sensePassability(l18) && !rc.canSenseRobotAtLocation(l18) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l18), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p18 = mapInfo.getCooldownMultiplier(team);
                    s18 = Math.sqrt(l18.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p18 = 1.5;
            }
            
            dist = v27 + p18 + s27 * 0.000001;
            if (v18 > dist) {
                v18 = dist;
                d18 = d27;
            }
            dist = v17 + p18 + s17 * 0.000001;
            if (v18 > dist) {
                v18 = dist;
                d18 = d17;
            }
            dist = v26 + p18 + s26 * 0.000001;
            if (v18 > dist) {
                v18 = dist;
                d18 = d26;
            }
        }

        if (rc.onTheMap(l37)) {
            if (rc.canSenseLocation(l37)) {
                MapInfo mapInfo = rc.senseMapInfo(l37);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l37) || (rc.sensePassability(l37) && !rc.canSenseRobotAtLocation(l37) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l37), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p37 = mapInfo.getCooldownMultiplier(team);
                    s37 = Math.sqrt(l37.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p37 = 1.5;
            }
            
            dist = v27 + p37 + s27 * 0.000001;
            if (v37 > dist) {
                v37 = dist;
                d37 = d27;
            }
            dist = v36 + p37 + s36 * 0.000001;
            if (v37 > dist) {
                v37 = dist;
                d37 = d36;
            }
        }

        if (rc.onTheMap(l8)) {
            if (rc.canSenseLocation(l8)) {
                MapInfo mapInfo = rc.senseMapInfo(l8);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l8) || (rc.sensePassability(l8) && !rc.canSenseRobotAtLocation(l8) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l8), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p8 = mapInfo.getCooldownMultiplier(team);
                    s8 = Math.sqrt(l8.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p8 = 1.5;
            }
            
            dist = v16 + p8 + s16 * 0.000001;
            if (v8 > dist) {
                v8 = dist;
                d8 = d16;
            }
            dist = v17 + p8 + s17 * 0.000001;
            if (v8 > dist) {
                v8 = dist;
                d8 = d17;
            }
            dist = v15 + p8 + s15 * 0.000001;
            if (v8 > dist) {
                v8 = dist;
                d8 = d15;
            }
        }

        if (rc.onTheMap(l31)) {
            if (rc.canSenseLocation(l31)) {
                MapInfo mapInfo = rc.senseMapInfo(l31);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l31) || (rc.sensePassability(l31) && !rc.canSenseRobotAtLocation(l31) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l31), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p31 = mapInfo.getCooldownMultiplier(team);
                    s31 = Math.sqrt(l31.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p31 = 1.5;
            }
            
            dist = v32 + p31 + s32 * 0.000001;
            if (v31 > dist) {
                v31 = dist;
                d31 = d32;
            }
            dist = v23 + p31 + s23 * 0.000001;
            if (v31 > dist) {
                v31 = dist;
                d31 = d23;
            }
        }

        if (rc.onTheMap(l28)) {
            if (rc.canSenseLocation(l28)) {
                MapInfo mapInfo = rc.senseMapInfo(l28);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l28) || (rc.sensePassability(l28) && !rc.canSenseRobotAtLocation(l28) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l28), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p28 = mapInfo.getCooldownMultiplier(team);
                    s28 = Math.sqrt(l28.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p28 = 1.5;
            }
            
            dist = v37 + p28 + s37 * 0.000001;
            if (v28 > dist) {
                v28 = dist;
                d28 = d37;
            }
            dist = v18 + p28 + s18 * 0.000001;
            if (v28 > dist) {
                v28 = dist;
                d28 = d18;
            }
            dist = v27 + p28 + s27 * 0.000001;
            if (v28 > dist) {
                v28 = dist;
                d28 = d27;
            }
            dist = v36 + p28 + s36 * 0.000001;
            if (v28 > dist) {
                v28 = dist;
                d28 = d36;
            }
        }

        if (rc.onTheMap(l9)) {
            if (rc.canSenseLocation(l9)) {
                MapInfo mapInfo = rc.senseMapInfo(l9);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l9) || (rc.sensePassability(l9) && !rc.canSenseRobotAtLocation(l9) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l9), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p9 = mapInfo.getCooldownMultiplier(team);
                    s9 = Math.sqrt(l9.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p9 = 1.5;
            }
            
            dist = v17 + p9 + s17 * 0.000001;
            if (v9 > dist) {
                v9 = dist;
                d9 = d17;
            }
            dist = v18 + p9 + s18 * 0.000001;
            if (v9 > dist) {
                v9 = dist;
                d9 = d18;
            }
            dist = v8 + p9 + s8 * 0.000001;
            if (v9 > dist) {
                v9 = dist;
                d9 = d8;
            }
            dist = v16 + p9 + s16 * 0.000001;
            if (v9 > dist) {
                v9 = dist;
                d9 = d16;
            }
        }

        if (rc.onTheMap(l22)) {
            if (rc.canSenseLocation(l22)) {
                MapInfo mapInfo = rc.senseMapInfo(l22);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l22) || (rc.sensePassability(l22) && !rc.canSenseRobotAtLocation(l22) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l22), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p22 = mapInfo.getCooldownMultiplier(team);
                    s22 = Math.sqrt(l22.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p22 = 1.5;
            }
            
            dist = v31 + p22 + s31 * 0.000001;
            if (v22 > dist) {
                v22 = dist;
                d22 = d31;
            }
            dist = v32 + p22 + s32 * 0.000001;
            if (v22 > dist) {
                v22 = dist;
                d22 = d32;
            }
            dist = v23 + p22 + s23 * 0.000001;
            if (v22 > dist) {
                v22 = dist;
                d22 = d23;
            }
            dist = v14 + p22 + s14 * 0.000001;
            if (v22 > dist) {
                v22 = dist;
                d22 = d14;
            }
        }

        if (rc.onTheMap(l7)) {
            if (rc.canSenseLocation(l7)) {
                MapInfo mapInfo = rc.senseMapInfo(l7);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l7) || (rc.sensePassability(l7) && !rc.canSenseRobotAtLocation(l7) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l7), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p7 = mapInfo.getCooldownMultiplier(team);
                    s7 = Math.sqrt(l7.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p7 = 1.5;
            }
            
            dist = v15 + p7 + s15 * 0.000001;
            if (v7 > dist) {
                v7 = dist;
                d7 = d15;
            }
            dist = v16 + p7 + s16 * 0.000001;
            if (v7 > dist) {
                v7 = dist;
                d7 = d16;
            }
            dist = v8 + p7 + s8 * 0.000001;
            if (v7 > dist) {
                v7 = dist;
                d7 = d8;
            }
            dist = v14 + p7 + s14 * 0.000001;
            if (v7 > dist) {
                v7 = dist;
                d7 = d14;
            }
        }

        if (rc.onTheMap(l13)) {
            if (rc.canSenseLocation(l13)) {
                MapInfo mapInfo = rc.senseMapInfo(l13);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l13) || (rc.sensePassability(l13) && !rc.canSenseRobotAtLocation(l13) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l13), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p13 = mapInfo.getCooldownMultiplier(team);
                    s13 = Math.sqrt(l13.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p13 = 1.5;
            }
            
            dist = v22 + p13 + s22 * 0.000001;
            if (v13 > dist) {
                v13 = dist;
                d13 = d22;
            }
            dist = v23 + p13 + s23 * 0.000001;
            if (v13 > dist) {
                v13 = dist;
                d13 = d23;
            }
            dist = v14 + p13 + s14 * 0.000001;
            if (v13 > dist) {
                v13 = dist;
                d13 = d14;
            }
            dist = v6 + p13 + s6 * 0.000001;
            if (v13 > dist) {
                v13 = dist;
                d13 = d6;
            }
        }

        if (rc.onTheMap(l19)) {
            if (rc.canSenseLocation(l19)) {
                MapInfo mapInfo = rc.senseMapInfo(l19);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l19) || (rc.sensePassability(l19) && !rc.canSenseRobotAtLocation(l19) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l19), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p19 = mapInfo.getCooldownMultiplier(team);
                    s19 = Math.sqrt(l19.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p19 = 1.5;
            }
            
            dist = v28 + p19 + s28 * 0.000001;
            if (v19 > dist) {
                v19 = dist;
                d19 = d28;
            }
            dist = v10 + p19 + s10 * 0.000001;
            if (v19 > dist) {
                v19 = dist;
                d19 = d10;
            }
            dist = v18 + p19 + s18 * 0.000001;
            if (v19 > dist) {
                v19 = dist;
                d19 = d18;
            }
            dist = v27 + p19 + s27 * 0.000001;
            if (v19 > dist) {
                v19 = dist;
                d19 = d27;
            }
        }

        if (rc.onTheMap(l10)) {
            if (rc.canSenseLocation(l10)) {
                MapInfo mapInfo = rc.senseMapInfo(l10);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l10) || (rc.sensePassability(l10) && !rc.canSenseRobotAtLocation(l10) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l10), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p10 = mapInfo.getCooldownMultiplier(team);
                    s10 = Math.sqrt(l10.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p10 = 1.5;
            }
            
            dist = v18 + p10 + s18 * 0.000001;
            if (v10 > dist) {
                v10 = dist;
                d10 = d18;
            }
            dist = v19 + p10 + s19 * 0.000001;
            if (v10 > dist) {
                v10 = dist;
                d10 = d19;
            }
            dist = v9 + p10 + s9 * 0.000001;
            if (v10 > dist) {
                v10 = dist;
                d10 = d9;
            }
            dist = v17 + p10 + s17 * 0.000001;
            if (v10 > dist) {
                v10 = dist;
                d10 = d17;
            }
        }

        if (rc.onTheMap(l6)) {
            if (rc.canSenseLocation(l6)) {
                MapInfo mapInfo = rc.senseMapInfo(l6);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l6) || (rc.sensePassability(l6) && !rc.canSenseRobotAtLocation(l6) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l6), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p6 = mapInfo.getCooldownMultiplier(team);
                    s6 = Math.sqrt(l6.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p6 = 1.5;
            }
            
            dist = v14 + p6 + s14 * 0.000001;
            if (v6 > dist) {
                v6 = dist;
                d6 = d14;
            }
            dist = v15 + p6 + s15 * 0.000001;
            if (v6 > dist) {
                v6 = dist;
                d6 = d15;
            }
            dist = v7 + p6 + s7 * 0.000001;
            if (v6 > dist) {
                v6 = dist;
                d6 = d7;
            }
            dist = v13 + p6 + s13 * 0.000001;
            if (v6 > dist) {
                v6 = dist;
                d6 = d13;
            }
        }

        if (rc.onTheMap(l11)) {
            if (rc.canSenseLocation(l11)) {
                MapInfo mapInfo = rc.senseMapInfo(l11);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l11) || (rc.sensePassability(l11) && !rc.canSenseRobotAtLocation(l11) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l11), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p11 = mapInfo.getCooldownMultiplier(team);
                    s11 = Math.sqrt(l11.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p11 = 1.5;
            }
            
            dist = v19 + p11 + s19 * 0.000001;
            if (v11 > dist) {
                v11 = dist;
                d11 = d19;
            }
            dist = v10 + p11 + s10 * 0.000001;
            if (v11 > dist) {
                v11 = dist;
                d11 = d10;
            }
            dist = v18 + p11 + s18 * 0.000001;
            if (v11 > dist) {
                v11 = dist;
                d11 = d18;
            }
        }

        if (rc.onTheMap(l5)) {
            if (rc.canSenseLocation(l5)) {
                MapInfo mapInfo = rc.senseMapInfo(l5);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l5) || (rc.sensePassability(l5) && !rc.canSenseRobotAtLocation(l5) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l5), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p5 = mapInfo.getCooldownMultiplier(team);
                    s5 = Math.sqrt(l5.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p5 = 1.5;
            }
            
            dist = v13 + p5 + s13 * 0.000001;
            if (v5 > dist) {
                v5 = dist;
                d5 = d13;
            }
            dist = v14 + p5 + s14 * 0.000001;
            if (v5 > dist) {
                v5 = dist;
                d5 = d14;
            }
            dist = v6 + p5 + s6 * 0.000001;
            if (v5 > dist) {
                v5 = dist;
                d5 = d6;
            }
        }

        if (rc.onTheMap(l30)) {
            if (rc.canSenseLocation(l30)) {
                MapInfo mapInfo = rc.senseMapInfo(l30);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l30) || (rc.sensePassability(l30) && !rc.canSenseRobotAtLocation(l30) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l30), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p30 = mapInfo.getCooldownMultiplier(team);
                    s30 = Math.sqrt(l30.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p30 = 1.5;
            }
            
            dist = v31 + p30 + s31 * 0.000001;
            if (v30 > dist) {
                v30 = dist;
                d30 = d31;
            }
            dist = v22 + p30 + s22 * 0.000001;
            if (v30 > dist) {
                v30 = dist;
                d30 = d22;
            }
        }

        if (rc.onTheMap(l38)) {
            if (rc.canSenseLocation(l38)) {
                MapInfo mapInfo = rc.senseMapInfo(l38);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l38) || (rc.sensePassability(l38) && !rc.canSenseRobotAtLocation(l38) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l38), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p38 = mapInfo.getCooldownMultiplier(team);
                    s38 = Math.sqrt(l38.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p38 = 1.5;
            }
            
            dist = v28 + p38 + s28 * 0.000001;
            if (v38 > dist) {
                v38 = dist;
                d38 = d28;
            }
            dist = v37 + p38 + s37 * 0.000001;
            if (v38 > dist) {
                v38 = dist;
                d38 = d37;
            }
        }

        if (rc.onTheMap(l2)) {
            if (rc.canSenseLocation(l2)) {
                MapInfo mapInfo = rc.senseMapInfo(l2);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l2) || (rc.sensePassability(l2) && !rc.canSenseRobotAtLocation(l2) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l2), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p2 = mapInfo.getCooldownMultiplier(team);
                    s2 = Math.sqrt(l2.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p2 = 1.5;
            }
            
            dist = v8 + p2 + s8 * 0.000001;
            if (v2 > dist) {
                v2 = dist;
                d2 = d8;
            }
            dist = v9 + p2 + s9 * 0.000001;
            if (v2 > dist) {
                v2 = dist;
                d2 = d9;
            }
            dist = v7 + p2 + s7 * 0.000001;
            if (v2 > dist) {
                v2 = dist;
                d2 = d7;
            }
        }

        if (rc.onTheMap(l21)) {
            if (rc.canSenseLocation(l21)) {
                MapInfo mapInfo = rc.senseMapInfo(l21);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l21) || (rc.sensePassability(l21) && !rc.canSenseRobotAtLocation(l21) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l21), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p21 = mapInfo.getCooldownMultiplier(team);
                    s21 = Math.sqrt(l21.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p21 = 1.5;
            }
            
            dist = v30 + p21 + s30 * 0.000001;
            if (v21 > dist) {
                v21 = dist;
                d21 = d30;
            }
            dist = v31 + p21 + s31 * 0.000001;
            if (v21 > dist) {
                v21 = dist;
                d21 = d31;
            }
            dist = v22 + p21 + s22 * 0.000001;
            if (v21 > dist) {
                v21 = dist;
                d21 = d22;
            }
            dist = v13 + p21 + s13 * 0.000001;
            if (v21 > dist) {
                v21 = dist;
                d21 = d13;
            }
        }

        if (rc.onTheMap(l3)) {
            if (rc.canSenseLocation(l3)) {
                MapInfo mapInfo = rc.senseMapInfo(l3);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l3) || (rc.sensePassability(l3) && !rc.canSenseRobotAtLocation(l3) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l3), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p3 = mapInfo.getCooldownMultiplier(team);
                    s3 = Math.sqrt(l3.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p3 = 1.5;
            }
            
            dist = v9 + p3 + s9 * 0.000001;
            if (v3 > dist) {
                v3 = dist;
                d3 = d9;
            }
            dist = v10 + p3 + s10 * 0.000001;
            if (v3 > dist) {
                v3 = dist;
                d3 = d10;
            }
            dist = v2 + p3 + s2 * 0.000001;
            if (v3 > dist) {
                v3 = dist;
                d3 = d2;
            }
            dist = v8 + p3 + s8 * 0.000001;
            if (v3 > dist) {
                v3 = dist;
                d3 = d8;
            }
        }

        if (rc.onTheMap(l1)) {
            if (rc.canSenseLocation(l1)) {
                MapInfo mapInfo = rc.senseMapInfo(l1);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l1) || (rc.sensePassability(l1) && !rc.canSenseRobotAtLocation(l1) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l1), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p1 = mapInfo.getCooldownMultiplier(team);
                    s1 = Math.sqrt(l1.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p1 = 1.5;
            }
            
            dist = v7 + p1 + s7 * 0.000001;
            if (v1 > dist) {
                v1 = dist;
                d1 = d7;
            }
            dist = v8 + p1 + s8 * 0.000001;
            if (v1 > dist) {
                v1 = dist;
                d1 = d8;
            }
            dist = v2 + p1 + s2 * 0.000001;
            if (v1 > dist) {
                v1 = dist;
                d1 = d2;
            }
            dist = v6 + p1 + s6 * 0.000001;
            if (v1 > dist) {
                v1 = dist;
                d1 = d6;
            }
        }

        if (rc.onTheMap(l29)) {
            if (rc.canSenseLocation(l29)) {
                MapInfo mapInfo = rc.senseMapInfo(l29);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l29) || (rc.sensePassability(l29) && !rc.canSenseRobotAtLocation(l29) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l29), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p29 = mapInfo.getCooldownMultiplier(team);
                    s29 = Math.sqrt(l29.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p29 = 1.5;
            }
            
            dist = v38 + p29 + s38 * 0.000001;
            if (v29 > dist) {
                v29 = dist;
                d29 = d38;
            }
            dist = v19 + p29 + s19 * 0.000001;
            if (v29 > dist) {
                v29 = dist;
                d29 = d19;
            }
            dist = v28 + p29 + s28 * 0.000001;
            if (v29 > dist) {
                v29 = dist;
                d29 = d28;
            }
            dist = v37 + p29 + s37 * 0.000001;
            if (v29 > dist) {
                v29 = dist;
                d29 = d37;
            }
        }

        if (rc.onTheMap(l20)) {
            if (rc.canSenseLocation(l20)) {
                MapInfo mapInfo = rc.senseMapInfo(l20);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l20) || (rc.sensePassability(l20) && !rc.canSenseRobotAtLocation(l20) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l20), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p20 = mapInfo.getCooldownMultiplier(team);
                    s20 = Math.sqrt(l20.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p20 = 1.5;
            }
            
            dist = v29 + p20 + s29 * 0.000001;
            if (v20 > dist) {
                v20 = dist;
                d20 = d29;
            }
            dist = v11 + p20 + s11 * 0.000001;
            if (v20 > dist) {
                v20 = dist;
                d20 = d11;
            }
            dist = v19 + p20 + s19 * 0.000001;
            if (v20 > dist) {
                v20 = dist;
                d20 = d19;
            }
            dist = v28 + p20 + s28 * 0.000001;
            if (v20 > dist) {
                v20 = dist;
                d20 = d28;
            }
        }

        if (rc.onTheMap(l12)) {
            if (rc.canSenseLocation(l12)) {
                MapInfo mapInfo = rc.senseMapInfo(l12);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l12) || (rc.sensePassability(l12) && !rc.canSenseRobotAtLocation(l12) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l12), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p12 = mapInfo.getCooldownMultiplier(team);
                    s12 = Math.sqrt(l12.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p12 = 1.5;
            }
            
            dist = v21 + p12 + s21 * 0.000001;
            if (v12 > dist) {
                v12 = dist;
                d12 = d21;
            }
            dist = v22 + p12 + s22 * 0.000001;
            if (v12 > dist) {
                v12 = dist;
                d12 = d22;
            }
            dist = v13 + p12 + s13 * 0.000001;
            if (v12 > dist) {
                v12 = dist;
                d12 = d13;
            }
            dist = v5 + p12 + s5 * 0.000001;
            if (v12 > dist) {
                v12 = dist;
                d12 = d5;
            }
        }

        if (rc.onTheMap(l4)) {
            if (rc.canSenseLocation(l4)) {
                MapInfo mapInfo = rc.senseMapInfo(l4);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l4) || (rc.sensePassability(l4) && !rc.canSenseRobotAtLocation(l4) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l4), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p4 = mapInfo.getCooldownMultiplier(team);
                    s4 = Math.sqrt(l4.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p4 = 1.5;
            }
            
            dist = v10 + p4 + s10 * 0.000001;
            if (v4 > dist) {
                v4 = dist;
                d4 = d10;
            }
            dist = v11 + p4 + s11 * 0.000001;
            if (v4 > dist) {
                v4 = dist;
                d4 = d11;
            }
            dist = v3 + p4 + s3 * 0.000001;
            if (v4 > dist) {
                v4 = dist;
                d4 = d3;
            }
            dist = v9 + p4 + s9 * 0.000001;
            if (v4 > dist) {
                v4 = dist;
                d4 = d9;
            }
        }

        if (rc.onTheMap(l0)) {
            if (rc.canSenseLocation(l0)) {
                MapInfo mapInfo = rc.senseMapInfo(l0);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l0) || (rc.sensePassability(l0) && !rc.canSenseRobotAtLocation(l0) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l0), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p0 = mapInfo.getCooldownMultiplier(team);
                    s0 = Math.sqrt(l0.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p0 = 1.5;
            }
            
            dist = v6 + p0 + s6 * 0.000001;
            if (v0 > dist) {
                v0 = dist;
                d0 = d6;
            }
            dist = v7 + p0 + s7 * 0.000001;
            if (v0 > dist) {
                v0 = dist;
                d0 = d7;
            }
            dist = v1 + p0 + s1 * 0.000001;
            if (v0 > dist) {
                v0 = dist;
                d0 = d1;
            }
            dist = v5 + p0 + s5 * 0.000001;
            if (v0 > dist) {
                v0 = dist;
                d0 = d5;
            }
        }
    
        int dx = targetLocation.x - l34.x;
        int dy = targetLocation.y - l34.y;

        switch(dx) {
            case -4:
                switch(dy) {
                    case -2:
                        if (v0 < 1000000) {
                            bug.reset();
                            return d0;
                        } break;
                    case -1:
                        if (v1 < 1000000) {
                            bug.reset();
                            return d1;
                        } break;
                    case 0:
                        if (v2 < 1000000) {
                            bug.reset();
                            return d2;
                        } break;
                    case 1:
                        if (v3 < 1000000) {
                            bug.reset();
                            return d3;
                        } break;
                    case 2:
                        if (v4 < 1000000) {
                            bug.reset();
                            return d4;
                        } break;
                } break;

            case -3:
                switch(dy) {
                    case -3:
                        if (v5 < 1000000) {
                            bug.reset();
                            return d5;
                        } break;
                    case -2:
                        if (v6 < 1000000) {
                            bug.reset();
                            return d6;
                        } break;
                    case -1:
                        if (v7 < 1000000) {
                            bug.reset();
                            return d7;
                        } break;
                    case 0:
                        if (v8 < 1000000) {
                            bug.reset();
                            return d8;
                        } break;
                    case 1:
                        if (v9 < 1000000) {
                            bug.reset();
                            return d9;
                        } break;
                    case 2:
                        if (v10 < 1000000) {
                            bug.reset();
                            return d10;
                        } break;
                    case 3:
                        if (v11 < 1000000) {
                            bug.reset();
                            return d11;
                        } break;
                } break;

            case -2:
                switch(dy) {
                    case -4:
                        if (v12 < 1000000) {
                            bug.reset();
                            return d12;
                        } break;
                    case -3:
                        if (v13 < 1000000) {
                            bug.reset();
                            return d13;
                        } break;
                    case -2:
                        if (v14 < 1000000) {
                            bug.reset();
                            return d14;
                        } break;
                    case -1:
                        if (v15 < 1000000) {
                            bug.reset();
                            return d15;
                        } break;
                    case 0:
                        if (v16 < 1000000) {
                            bug.reset();
                            return d16;
                        } break;
                    case 1:
                        if (v17 < 1000000) {
                            bug.reset();
                            return d17;
                        } break;
                    case 2:
                        if (v18 < 1000000) {
                            bug.reset();
                            return d18;
                        } break;
                    case 3:
                        if (v19 < 1000000) {
                            bug.reset();
                            return d19;
                        } break;
                    case 4:
                        if (v20 < 1000000) {
                            bug.reset();
                            return d20;
                        } break;
                } break;

            case -1:
                switch(dy) {
                    case -4:
                        if (v21 < 1000000) {
                            bug.reset();
                            return d21;
                        } break;
                    case -3:
                        if (v22 < 1000000) {
                            bug.reset();
                            return d22;
                        } break;
                    case -2:
                        if (v23 < 1000000) {
                            bug.reset();
                            return d23;
                        } break;
                    case -1:
                        if (v24 < 1000000) {
                            bug.reset();
                            return d24;
                        } break;
                    case 0:
                        if (v25 < 1000000) {
                            bug.reset();
                            return d25;
                        } break;
                    case 1:
                        if (v26 < 1000000) {
                            bug.reset();
                            return d26;
                        } break;
                    case 2:
                        if (v27 < 1000000) {
                            bug.reset();
                            return d27;
                        } break;
                    case 3:
                        if (v28 < 1000000) {
                            bug.reset();
                            return d28;
                        } break;
                    case 4:
                        if (v29 < 1000000) {
                            bug.reset();
                            return d29;
                        } break;
                } break;

            case 0:
                switch(dy) {
                    case -4:
                        if (v30 < 1000000) {
                            bug.reset();
                            return d30;
                        } break;
                    case -3:
                        if (v31 < 1000000) {
                            bug.reset();
                            return d31;
                        } break;
                    case -2:
                        if (v32 < 1000000) {
                            bug.reset();
                            return d32;
                        } break;
                    case -1:
                        if (v33 < 1000000) {
                            bug.reset();
                            return d33;
                        } break;
                    case 1:
                        if (v35 < 1000000) {
                            bug.reset();
                            return d35;
                        } break;
                    case 2:
                        if (v36 < 1000000) {
                            bug.reset();
                            return d36;
                        } break;
                    case 3:
                        if (v37 < 1000000) {
                            bug.reset();
                            return d37;
                        } break;
                    case 4:
                        if (v38 < 1000000) {
                            bug.reset();
                            return d38;
                        } break;
                } break;

            case 1:
                switch(dy) {
                } break;

            case 2:
                switch(dy) {
                } break;

            case 3:
                switch(dy) {
                } break;

            case 4:
                switch(dy) {
                } break;

        }
    
        Direction ans = Direction.CENTER;

        double dist0 = v0 + s0;
        if (dist0 < localBest) {
            localBest = dist0;
            ans = d0;
        }

        double dist1 = v1 + s1;
        if (dist1 < localBest) {
            localBest = dist1;
            ans = d1;
        }

        double dist2 = v2 + s2;
        if (dist2 < localBest) {
            localBest = dist2;
            ans = d2;
        }

        double dist3 = v3 + s3;
        if (dist3 < localBest) {
            localBest = dist3;
            ans = d3;
        }

        double dist4 = v4 + s4;
        if (dist4 < localBest) {
            localBest = dist4;
            ans = d4;
        }

        double dist5 = v5 + s5;
        if (dist5 < localBest) {
            localBest = dist5;
            ans = d5;
        }

        double dist6 = v6 + s6;
        if (dist6 < localBest) {
            localBest = dist6;
            ans = d6;
        }

        double dist7 = v7 + s7;
        if (dist7 < localBest) {
            localBest = dist7;
            ans = d7;
        }

        double dist8 = v8 + s8;
        if (dist8 < localBest) {
            localBest = dist8;
            ans = d8;
        }

        double dist9 = v9 + s9;
        if (dist9 < localBest) {
            localBest = dist9;
            ans = d9;
        }

        double dist10 = v10 + s10;
        if (dist10 < localBest) {
            localBest = dist10;
            ans = d10;
        }

        double dist11 = v11 + s11;
        if (dist11 < localBest) {
            localBest = dist11;
            ans = d11;
        }

        double dist12 = v12 + s12;
        if (dist12 < localBest) {
            localBest = dist12;
            ans = d12;
        }

        double dist13 = v13 + s13;
        if (dist13 < localBest) {
            localBest = dist13;
            ans = d13;
        }

        double dist14 = v14 + s14;
        if (dist14 < localBest) {
            localBest = dist14;
            ans = d14;
        }

        double dist15 = v15 + s15;
        if (dist15 < localBest) {
            localBest = dist15;
            ans = d15;
        }

        double dist16 = v16 + s16;
        if (dist16 < localBest) {
            localBest = dist16;
            ans = d16;
        }

        double dist17 = v17 + s17;
        if (dist17 < localBest) {
            localBest = dist17;
            ans = d17;
        }

        double dist18 = v18 + s18;
        if (dist18 < localBest) {
            localBest = dist18;
            ans = d18;
        }

        double dist19 = v19 + s19;
        if (dist19 < localBest) {
            localBest = dist19;
            ans = d19;
        }

        double dist20 = v20 + s20;
        if (dist20 < localBest) {
            localBest = dist20;
            ans = d20;
        }

        double dist21 = v21 + s21;
        if (dist21 < localBest) {
            localBest = dist21;
            ans = d21;
        }

        double dist22 = v22 + s22;
        if (dist22 < localBest) {
            localBest = dist22;
            ans = d22;
        }

        double dist23 = v23 + s23;
        if (dist23 < localBest) {
            localBest = dist23;
            ans = d23;
        }

        double dist24 = v24 + s24;
        if (dist24 < localBest) {
            localBest = dist24;
            ans = d24;
        }

        double dist25 = v25 + s25;
        if (dist25 < localBest) {
            localBest = dist25;
            ans = d25;
        }

        double dist26 = v26 + s26;
        if (dist26 < localBest) {
            localBest = dist26;
            ans = d26;
        }

        double dist27 = v27 + s27;
        if (dist27 < localBest) {
            localBest = dist27;
            ans = d27;
        }

        double dist28 = v28 + s28;
        if (dist28 < localBest) {
            localBest = dist28;
            ans = d28;
        }

        double dist29 = v29 + s29;
        if (dist29 < localBest) {
            localBest = dist29;
            ans = d29;
        }

        double dist30 = v30 + s30;
        if (dist30 < localBest) {
            localBest = dist30;
            ans = d30;
        }

        double dist31 = v31 + s31;
        if (dist31 < localBest) {
            localBest = dist31;
            ans = d31;
        }

        double dist32 = v32 + s32;
        if (dist32 < localBest) {
            localBest = dist32;
            ans = d32;
        }

        double dist33 = v33 + s33;
        if (dist33 < localBest) {
            localBest = dist33;
            ans = d33;
        }

        double dist35 = v35 + s35;
        if (dist35 < localBest) {
            localBest = dist35;
            ans = d35;
        }

        double dist36 = v36 + s36;
        if (dist36 < localBest) {
            localBest = dist36;
            ans = d36;
        }

        double dist37 = v37 + s37;
        if (dist37 < localBest) {
            localBest = dist37;
            ans = d37;
        }

        double dist38 = v38 + s38;
        if (dist38 < localBest) {
            localBest = dist38;
            ans = d38;
        }

        if (localBest < globalBest) {
            globalBest = localBest;
            bug.reset();
            return ans;
        }

        consecutiveBugNavRoundCount += 1;

        if (consecutiveBugNavRoundCount > 40) {
            globalBest = 1000000;
            consecutiveBugNavRoundCount = 0;
        }

        bug.move(targetLocation, lastDirection);
        return null;
    }

    private Direction getBestDirection7() throws GameActionException {
        double localBest = 1000000.0;
        double dist = 0.0;
        l34 = currentLocation;
        v34 = 0;
        d44 = null;
        l44 = l34.add(Direction.NORTHEAST);
        v44 = 1000000;
        p44 = 1000000;
        s44 = Math.sqrt(l44.distanceSquaredTo(targetLocation));
        d35 = null;
        l35 = l34.add(Direction.NORTH);
        v35 = 1000000;
        p35 = 1000000;
        s35 = Math.sqrt(l35.distanceSquaredTo(targetLocation));
        d26 = null;
        l26 = l34.add(Direction.NORTHWEST);
        v26 = 1000000;
        p26 = 1000000;
        s26 = Math.sqrt(l26.distanceSquaredTo(targetLocation));
        d25 = null;
        l25 = l34.add(Direction.WEST);
        v25 = 1000000;
        p25 = 1000000;
        s25 = Math.sqrt(l25.distanceSquaredTo(targetLocation));
        d24 = null;
        l24 = l34.add(Direction.SOUTHWEST);
        v24 = 1000000;
        p24 = 1000000;
        s24 = Math.sqrt(l24.distanceSquaredTo(targetLocation));
        d17 = null;
        l17 = l25.add(Direction.NORTHWEST);
        v17 = 1000000;
        p17 = 1000000;
        s17 = Math.sqrt(l17.distanceSquaredTo(targetLocation));
        d16 = null;
        l16 = l25.add(Direction.WEST);
        v16 = 1000000;
        p16 = 1000000;
        s16 = Math.sqrt(l16.distanceSquaredTo(targetLocation));
        d15 = null;
        l15 = l25.add(Direction.SOUTHWEST);
        v15 = 1000000;
        p15 = 1000000;
        s15 = Math.sqrt(l15.distanceSquaredTo(targetLocation));
        d45 = null;
        l45 = l35.add(Direction.NORTHEAST);
        v45 = 1000000;
        p45 = 1000000;
        s45 = Math.sqrt(l45.distanceSquaredTo(targetLocation));
        d36 = null;
        l36 = l35.add(Direction.NORTH);
        v36 = 1000000;
        p36 = 1000000;
        s36 = Math.sqrt(l36.distanceSquaredTo(targetLocation));
        d27 = null;
        l27 = l35.add(Direction.NORTHWEST);
        v27 = 1000000;
        p27 = 1000000;
        s27 = Math.sqrt(l27.distanceSquaredTo(targetLocation));
        d14 = null;
        l14 = l24.add(Direction.SOUTHWEST);
        v14 = 1000000;
        p14 = 1000000;
        s14 = Math.sqrt(l14.distanceSquaredTo(targetLocation));
        d54 = null;
        l54 = l44.add(Direction.NORTHEAST);
        v54 = 1000000;
        p54 = 1000000;
        s54 = Math.sqrt(l54.distanceSquaredTo(targetLocation));
        d18 = null;
        l18 = l26.add(Direction.NORTHWEST);
        v18 = 1000000;
        p18 = 1000000;
        s18 = Math.sqrt(l18.distanceSquaredTo(targetLocation));
        d46 = null;
        l46 = l36.add(Direction.NORTHEAST);
        v46 = 1000000;
        p46 = 1000000;
        s46 = Math.sqrt(l46.distanceSquaredTo(targetLocation));
        d37 = null;
        l37 = l36.add(Direction.NORTH);
        v37 = 1000000;
        p37 = 1000000;
        s37 = Math.sqrt(l37.distanceSquaredTo(targetLocation));
        d28 = null;
        l28 = l36.add(Direction.NORTHWEST);
        v28 = 1000000;
        p28 = 1000000;
        s28 = Math.sqrt(l28.distanceSquaredTo(targetLocation));
        d9 = null;
        l9 = l16.add(Direction.NORTHWEST);
        v9 = 1000000;
        p9 = 1000000;
        s9 = Math.sqrt(l9.distanceSquaredTo(targetLocation));
        d8 = null;
        l8 = l16.add(Direction.WEST);
        v8 = 1000000;
        p8 = 1000000;
        s8 = Math.sqrt(l8.distanceSquaredTo(targetLocation));
        d7 = null;
        l7 = l16.add(Direction.SOUTHWEST);
        v7 = 1000000;
        p7 = 1000000;
        s7 = Math.sqrt(l7.distanceSquaredTo(targetLocation));
        d19 = null;
        l19 = l27.add(Direction.NORTHWEST);
        v19 = 1000000;
        p19 = 1000000;
        s19 = Math.sqrt(l19.distanceSquaredTo(targetLocation));
        d6 = null;
        l6 = l15.add(Direction.SOUTHWEST);
        v6 = 1000000;
        p6 = 1000000;
        s6 = Math.sqrt(l6.distanceSquaredTo(targetLocation));
        d10 = null;
        l10 = l17.add(Direction.NORTHWEST);
        v10 = 1000000;
        p10 = 1000000;
        s10 = Math.sqrt(l10.distanceSquaredTo(targetLocation));
        d55 = null;
        l55 = l45.add(Direction.NORTHEAST);
        v55 = 1000000;
        p55 = 1000000;
        s55 = Math.sqrt(l55.distanceSquaredTo(targetLocation));
        d63 = null;
        l63 = l54.add(Direction.NORTHEAST);
        v63 = 1000000;
        p63 = 1000000;
        s63 = Math.sqrt(l63.distanceSquaredTo(targetLocation));
        d5 = null;
        l5 = l14.add(Direction.SOUTHWEST);
        v5 = 1000000;
        p5 = 1000000;
        s5 = Math.sqrt(l5.distanceSquaredTo(targetLocation));
        d11 = null;
        l11 = l18.add(Direction.NORTHWEST);
        v11 = 1000000;
        p11 = 1000000;
        s11 = Math.sqrt(l11.distanceSquaredTo(targetLocation));
        d47 = null;
        l47 = l37.add(Direction.NORTHEAST);
        v47 = 1000000;
        p47 = 1000000;
        s47 = Math.sqrt(l47.distanceSquaredTo(targetLocation));
        d38 = null;
        l38 = l37.add(Direction.NORTH);
        v38 = 1000000;
        p38 = 1000000;
        s38 = Math.sqrt(l38.distanceSquaredTo(targetLocation));
        d29 = null;
        l29 = l37.add(Direction.NORTHWEST);
        v29 = 1000000;
        p29 = 1000000;
        s29 = Math.sqrt(l29.distanceSquaredTo(targetLocation));
        d3 = null;
        l3 = l8.add(Direction.NORTHWEST);
        v3 = 1000000;
        p3 = 1000000;
        s3 = Math.sqrt(l3.distanceSquaredTo(targetLocation));
        d2 = null;
        l2 = l8.add(Direction.WEST);
        v2 = 1000000;
        p2 = 1000000;
        s2 = Math.sqrt(l2.distanceSquaredTo(targetLocation));
        d1 = null;
        l1 = l8.add(Direction.SOUTHWEST);
        v1 = 1000000;
        p1 = 1000000;
        s1 = Math.sqrt(l1.distanceSquaredTo(targetLocation));
        d20 = null;
        l20 = l28.add(Direction.NORTHWEST);
        v20 = 1000000;
        p20 = 1000000;
        s20 = Math.sqrt(l20.distanceSquaredTo(targetLocation));
        d56 = null;
        l56 = l46.add(Direction.NORTHEAST);
        v56 = 1000000;
        p56 = 1000000;
        s56 = Math.sqrt(l56.distanceSquaredTo(targetLocation));
        d0 = null;
        l0 = l7.add(Direction.SOUTHWEST);
        v0 = 1000000;
        p0 = 1000000;
        s0 = Math.sqrt(l0.distanceSquaredTo(targetLocation));
        d4 = null;
        l4 = l9.add(Direction.NORTHWEST);
        v4 = 1000000;
        p4 = 1000000;
        s4 = Math.sqrt(l4.distanceSquaredTo(targetLocation));
    

        if (rc.onTheMap(l25) && rc.canMove(Direction.WEST)) {
            if (rc.canSenseLocation(l25)) {
                MapInfo mapInfo = rc.senseMapInfo(l25);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l25) || (rc.sensePassability(l25) && !rc.canSenseRobotAtLocation(l25) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l25), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p25 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p25 = 1.5;
            }
            
            dist = v34 + p25 + s34 * 0.000001;
            if (v25 > dist) {
                v25 = dist;
                d25 = Direction.WEST;
            }
            dist = v35 + p25 + s35 * 0.000001;
            if (v25 > dist) {
                v25 = dist;
                d25 = d35;
            }
        }

        if (rc.onTheMap(l35) && rc.canMove(Direction.NORTH)) {
            if (rc.canSenseLocation(l35)) {
                MapInfo mapInfo = rc.senseMapInfo(l35);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l35) || (rc.sensePassability(l35) && !rc.canSenseRobotAtLocation(l35) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l35), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p35 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p35 = 1.5;
            }
            
            dist = v25 + p35 + s25 * 0.000001;
            if (v35 > dist) {
                v35 = dist;
                d35 = d25;
            }
            dist = v34 + p35 + s34 * 0.000001;
            if (v35 > dist) {
                v35 = dist;
                d35 = Direction.NORTH;
            }
        }

        if (rc.onTheMap(l24) && rc.canMove(Direction.SOUTHWEST)) {
            if (rc.canSenseLocation(l24)) {
                MapInfo mapInfo = rc.senseMapInfo(l24);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l24) || (rc.sensePassability(l24) && !rc.canSenseRobotAtLocation(l24) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l24), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p24 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p24 = 1.5;
            }
            
            dist = v34 + p24 + s34 * 0.000001;
            if (v24 > dist) {
                v24 = dist;
                d24 = Direction.SOUTHWEST;
            }
            dist = v25 + p24 + s25 * 0.000001;
            if (v24 > dist) {
                v24 = dist;
                d24 = d25;
            }
        }

        if (rc.onTheMap(l44) && rc.canMove(Direction.NORTHEAST)) {
            if (rc.canSenseLocation(l44)) {
                MapInfo mapInfo = rc.senseMapInfo(l44);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l44) || (rc.sensePassability(l44) && !rc.canSenseRobotAtLocation(l44) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l44), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p44 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p44 = 1.5;
            }
            
            dist = v35 + p44 + s35 * 0.000001;
            if (v44 > dist) {
                v44 = dist;
                d44 = d35;
            }
            dist = v34 + p44 + s34 * 0.000001;
            if (v44 > dist) {
                v44 = dist;
                d44 = Direction.NORTHEAST;
            }
        }

        if (rc.onTheMap(l26) && rc.canMove(Direction.NORTHWEST)) {
            if (rc.canSenseLocation(l26)) {
                MapInfo mapInfo = rc.senseMapInfo(l26);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l26) || (rc.sensePassability(l26) && !rc.canSenseRobotAtLocation(l26) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l26), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p26 = mapInfo.getCooldownMultiplier(team);
                }
            }
            else {
                p26 = 1.5;
            }
            
            dist = v35 + p26 + s35 * 0.000001;
            if (v26 > dist) {
                v26 = dist;
                d26 = d35;
            }
            dist = v25 + p26 + s25 * 0.000001;
            if (v26 > dist) {
                v26 = dist;
                d26 = d25;
            }
            dist = v34 + p26 + s34 * 0.000001;
            if (v26 > dist) {
                v26 = dist;
                d26 = Direction.NORTHWEST;
            }
        }

        if (rc.onTheMap(l36)) {
            if (rc.canSenseLocation(l36)) {
                MapInfo mapInfo = rc.senseMapInfo(l36);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l36) || (rc.sensePassability(l36) && !rc.canSenseRobotAtLocation(l36) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l36), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p36 = mapInfo.getCooldownMultiplier(team);
                    s36 = Math.sqrt(l36.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p36 = 1.5;
            }
            
            dist = v26 + p36 + s26 * 0.000001;
            if (v36 > dist) {
                v36 = dist;
                d36 = d26;
            }
            dist = v35 + p36 + s35 * 0.000001;
            if (v36 > dist) {
                v36 = dist;
                d36 = d35;
            }
            dist = v44 + p36 + s44 * 0.000001;
            if (v36 > dist) {
                v36 = dist;
                d36 = d44;
            }
        }

        if (rc.onTheMap(l16)) {
            if (rc.canSenseLocation(l16)) {
                MapInfo mapInfo = rc.senseMapInfo(l16);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l16) || (rc.sensePassability(l16) && !rc.canSenseRobotAtLocation(l16) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l16), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p16 = mapInfo.getCooldownMultiplier(team);
                    s16 = Math.sqrt(l16.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p16 = 1.5;
            }
            
            dist = v25 + p16 + s25 * 0.000001;
            if (v16 > dist) {
                v16 = dist;
                d16 = d25;
            }
            dist = v26 + p16 + s26 * 0.000001;
            if (v16 > dist) {
                v16 = dist;
                d16 = d26;
            }
            dist = v24 + p16 + s24 * 0.000001;
            if (v16 > dist) {
                v16 = dist;
                d16 = d24;
            }
        }

        if (rc.onTheMap(l27)) {
            if (rc.canSenseLocation(l27)) {
                MapInfo mapInfo = rc.senseMapInfo(l27);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l27) || (rc.sensePassability(l27) && !rc.canSenseRobotAtLocation(l27) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l27), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p27 = mapInfo.getCooldownMultiplier(team);
                    s27 = Math.sqrt(l27.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p27 = 1.5;
            }
            
            dist = v36 + p27 + s36 * 0.000001;
            if (v27 > dist) {
                v27 = dist;
                d27 = d36;
            }
            dist = v17 + p27 + s17 * 0.000001;
            if (v27 > dist) {
                v27 = dist;
                d27 = d17;
            }
            dist = v26 + p27 + s26 * 0.000001;
            if (v27 > dist) {
                v27 = dist;
                d27 = d26;
            }
            dist = v35 + p27 + s35 * 0.000001;
            if (v27 > dist) {
                v27 = dist;
                d27 = d35;
            }
        }

        if (rc.onTheMap(l15)) {
            if (rc.canSenseLocation(l15)) {
                MapInfo mapInfo = rc.senseMapInfo(l15);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l15) || (rc.sensePassability(l15) && !rc.canSenseRobotAtLocation(l15) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l15), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p15 = mapInfo.getCooldownMultiplier(team);
                    s15 = Math.sqrt(l15.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p15 = 1.5;
            }
            
            dist = v24 + p15 + s24 * 0.000001;
            if (v15 > dist) {
                v15 = dist;
                d15 = d24;
            }
            dist = v25 + p15 + s25 * 0.000001;
            if (v15 > dist) {
                v15 = dist;
                d15 = d25;
            }
            dist = v16 + p15 + s16 * 0.000001;
            if (v15 > dist) {
                v15 = dist;
                d15 = d16;
            }
        }

        if (rc.onTheMap(l17)) {
            if (rc.canSenseLocation(l17)) {
                MapInfo mapInfo = rc.senseMapInfo(l17);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l17) || (rc.sensePassability(l17) && !rc.canSenseRobotAtLocation(l17) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l17), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p17 = mapInfo.getCooldownMultiplier(team);
                    s17 = Math.sqrt(l17.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p17 = 1.5;
            }
            
            dist = v26 + p17 + s26 * 0.000001;
            if (v17 > dist) {
                v17 = dist;
                d17 = d26;
            }
            dist = v27 + p17 + s27 * 0.000001;
            if (v17 > dist) {
                v17 = dist;
                d17 = d27;
            }
            dist = v16 + p17 + s16 * 0.000001;
            if (v17 > dist) {
                v17 = dist;
                d17 = d16;
            }
            dist = v25 + p17 + s25 * 0.000001;
            if (v17 > dist) {
                v17 = dist;
                d17 = d25;
            }
        }

        if (rc.onTheMap(l45)) {
            if (rc.canSenseLocation(l45)) {
                MapInfo mapInfo = rc.senseMapInfo(l45);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l45) || (rc.sensePassability(l45) && !rc.canSenseRobotAtLocation(l45) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l45), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p45 = mapInfo.getCooldownMultiplier(team);
                    s45 = Math.sqrt(l45.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p45 = 1.5;
            }
            
            dist = v36 + p45 + s36 * 0.000001;
            if (v45 > dist) {
                v45 = dist;
                d45 = d36;
            }
            dist = v35 + p45 + s35 * 0.000001;
            if (v45 > dist) {
                v45 = dist;
                d45 = d35;
            }
            dist = v44 + p45 + s44 * 0.000001;
            if (v45 > dist) {
                v45 = dist;
                d45 = d44;
            }
        }

        if (rc.onTheMap(l54)) {
            if (rc.canSenseLocation(l54)) {
                MapInfo mapInfo = rc.senseMapInfo(l54);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l54) || (rc.sensePassability(l54) && !rc.canSenseRobotAtLocation(l54) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l54), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p54 = mapInfo.getCooldownMultiplier(team);
                    s54 = Math.sqrt(l54.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p54 = 1.5;
            }
            
            dist = v45 + p54 + s45 * 0.000001;
            if (v54 > dist) {
                v54 = dist;
                d54 = d45;
            }
            dist = v44 + p54 + s44 * 0.000001;
            if (v54 > dist) {
                v54 = dist;
                d54 = d44;
            }
        }

        if (rc.onTheMap(l14)) {
            if (rc.canSenseLocation(l14)) {
                MapInfo mapInfo = rc.senseMapInfo(l14);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l14) || (rc.sensePassability(l14) && !rc.canSenseRobotAtLocation(l14) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l14), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p14 = mapInfo.getCooldownMultiplier(team);
                    s14 = Math.sqrt(l14.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p14 = 1.5;
            }
            
            dist = v24 + p14 + s24 * 0.000001;
            if (v14 > dist) {
                v14 = dist;
                d14 = d24;
            }
            dist = v15 + p14 + s15 * 0.000001;
            if (v14 > dist) {
                v14 = dist;
                d14 = d15;
            }
        }

        if (rc.onTheMap(l18)) {
            if (rc.canSenseLocation(l18)) {
                MapInfo mapInfo = rc.senseMapInfo(l18);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l18) || (rc.sensePassability(l18) && !rc.canSenseRobotAtLocation(l18) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l18), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p18 = mapInfo.getCooldownMultiplier(team);
                    s18 = Math.sqrt(l18.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p18 = 1.5;
            }
            
            dist = v27 + p18 + s27 * 0.000001;
            if (v18 > dist) {
                v18 = dist;
                d18 = d27;
            }
            dist = v17 + p18 + s17 * 0.000001;
            if (v18 > dist) {
                v18 = dist;
                d18 = d17;
            }
            dist = v26 + p18 + s26 * 0.000001;
            if (v18 > dist) {
                v18 = dist;
                d18 = d26;
            }
        }

        if (rc.onTheMap(l37)) {
            if (rc.canSenseLocation(l37)) {
                MapInfo mapInfo = rc.senseMapInfo(l37);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l37) || (rc.sensePassability(l37) && !rc.canSenseRobotAtLocation(l37) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l37), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p37 = mapInfo.getCooldownMultiplier(team);
                    s37 = Math.sqrt(l37.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p37 = 1.5;
            }
            
            dist = v27 + p37 + s27 * 0.000001;
            if (v37 > dist) {
                v37 = dist;
                d37 = d27;
            }
            dist = v36 + p37 + s36 * 0.000001;
            if (v37 > dist) {
                v37 = dist;
                d37 = d36;
            }
            dist = v45 + p37 + s45 * 0.000001;
            if (v37 > dist) {
                v37 = dist;
                d37 = d45;
            }
        }

        if (rc.onTheMap(l8)) {
            if (rc.canSenseLocation(l8)) {
                MapInfo mapInfo = rc.senseMapInfo(l8);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l8) || (rc.sensePassability(l8) && !rc.canSenseRobotAtLocation(l8) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l8), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p8 = mapInfo.getCooldownMultiplier(team);
                    s8 = Math.sqrt(l8.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p8 = 1.5;
            }
            
            dist = v16 + p8 + s16 * 0.000001;
            if (v8 > dist) {
                v8 = dist;
                d8 = d16;
            }
            dist = v17 + p8 + s17 * 0.000001;
            if (v8 > dist) {
                v8 = dist;
                d8 = d17;
            }
            dist = v15 + p8 + s15 * 0.000001;
            if (v8 > dist) {
                v8 = dist;
                d8 = d15;
            }
        }

        if (rc.onTheMap(l28)) {
            if (rc.canSenseLocation(l28)) {
                MapInfo mapInfo = rc.senseMapInfo(l28);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l28) || (rc.sensePassability(l28) && !rc.canSenseRobotAtLocation(l28) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l28), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p28 = mapInfo.getCooldownMultiplier(team);
                    s28 = Math.sqrt(l28.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p28 = 1.5;
            }
            
            dist = v37 + p28 + s37 * 0.000001;
            if (v28 > dist) {
                v28 = dist;
                d28 = d37;
            }
            dist = v18 + p28 + s18 * 0.000001;
            if (v28 > dist) {
                v28 = dist;
                d28 = d18;
            }
            dist = v27 + p28 + s27 * 0.000001;
            if (v28 > dist) {
                v28 = dist;
                d28 = d27;
            }
            dist = v36 + p28 + s36 * 0.000001;
            if (v28 > dist) {
                v28 = dist;
                d28 = d36;
            }
        }

        if (rc.onTheMap(l46)) {
            if (rc.canSenseLocation(l46)) {
                MapInfo mapInfo = rc.senseMapInfo(l46);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l46) || (rc.sensePassability(l46) && !rc.canSenseRobotAtLocation(l46) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l46), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p46 = mapInfo.getCooldownMultiplier(team);
                    s46 = Math.sqrt(l46.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p46 = 1.5;
            }
            
            dist = v37 + p46 + s37 * 0.000001;
            if (v46 > dist) {
                v46 = dist;
                d46 = d37;
            }
            dist = v36 + p46 + s36 * 0.000001;
            if (v46 > dist) {
                v46 = dist;
                d46 = d36;
            }
            dist = v45 + p46 + s45 * 0.000001;
            if (v46 > dist) {
                v46 = dist;
                d46 = d45;
            }
            dist = v54 + p46 + s54 * 0.000001;
            if (v46 > dist) {
                v46 = dist;
                d46 = d54;
            }
        }

        if (rc.onTheMap(l7)) {
            if (rc.canSenseLocation(l7)) {
                MapInfo mapInfo = rc.senseMapInfo(l7);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l7) || (rc.sensePassability(l7) && !rc.canSenseRobotAtLocation(l7) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l7), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p7 = mapInfo.getCooldownMultiplier(team);
                    s7 = Math.sqrt(l7.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p7 = 1.5;
            }
            
            dist = v15 + p7 + s15 * 0.000001;
            if (v7 > dist) {
                v7 = dist;
                d7 = d15;
            }
            dist = v16 + p7 + s16 * 0.000001;
            if (v7 > dist) {
                v7 = dist;
                d7 = d16;
            }
            dist = v8 + p7 + s8 * 0.000001;
            if (v7 > dist) {
                v7 = dist;
                d7 = d8;
            }
            dist = v14 + p7 + s14 * 0.000001;
            if (v7 > dist) {
                v7 = dist;
                d7 = d14;
            }
        }

        if (rc.onTheMap(l9)) {
            if (rc.canSenseLocation(l9)) {
                MapInfo mapInfo = rc.senseMapInfo(l9);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l9) || (rc.sensePassability(l9) && !rc.canSenseRobotAtLocation(l9) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l9), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p9 = mapInfo.getCooldownMultiplier(team);
                    s9 = Math.sqrt(l9.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p9 = 1.5;
            }
            
            dist = v17 + p9 + s17 * 0.000001;
            if (v9 > dist) {
                v9 = dist;
                d9 = d17;
            }
            dist = v18 + p9 + s18 * 0.000001;
            if (v9 > dist) {
                v9 = dist;
                d9 = d18;
            }
            dist = v8 + p9 + s8 * 0.000001;
            if (v9 > dist) {
                v9 = dist;
                d9 = d8;
            }
            dist = v16 + p9 + s16 * 0.000001;
            if (v9 > dist) {
                v9 = dist;
                d9 = d16;
            }
        }

        if (rc.onTheMap(l19)) {
            if (rc.canSenseLocation(l19)) {
                MapInfo mapInfo = rc.senseMapInfo(l19);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l19) || (rc.sensePassability(l19) && !rc.canSenseRobotAtLocation(l19) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l19), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p19 = mapInfo.getCooldownMultiplier(team);
                    s19 = Math.sqrt(l19.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p19 = 1.5;
            }
            
            dist = v28 + p19 + s28 * 0.000001;
            if (v19 > dist) {
                v19 = dist;
                d19 = d28;
            }
            dist = v10 + p19 + s10 * 0.000001;
            if (v19 > dist) {
                v19 = dist;
                d19 = d10;
            }
            dist = v18 + p19 + s18 * 0.000001;
            if (v19 > dist) {
                v19 = dist;
                d19 = d18;
            }
            dist = v27 + p19 + s27 * 0.000001;
            if (v19 > dist) {
                v19 = dist;
                d19 = d27;
            }
        }

        if (rc.onTheMap(l10)) {
            if (rc.canSenseLocation(l10)) {
                MapInfo mapInfo = rc.senseMapInfo(l10);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l10) || (rc.sensePassability(l10) && !rc.canSenseRobotAtLocation(l10) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l10), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p10 = mapInfo.getCooldownMultiplier(team);
                    s10 = Math.sqrt(l10.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p10 = 1.5;
            }
            
            dist = v18 + p10 + s18 * 0.000001;
            if (v10 > dist) {
                v10 = dist;
                d10 = d18;
            }
            dist = v19 + p10 + s19 * 0.000001;
            if (v10 > dist) {
                v10 = dist;
                d10 = d19;
            }
            dist = v9 + p10 + s9 * 0.000001;
            if (v10 > dist) {
                v10 = dist;
                d10 = d9;
            }
            dist = v17 + p10 + s17 * 0.000001;
            if (v10 > dist) {
                v10 = dist;
                d10 = d17;
            }
        }

        if (rc.onTheMap(l6)) {
            if (rc.canSenseLocation(l6)) {
                MapInfo mapInfo = rc.senseMapInfo(l6);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l6) || (rc.sensePassability(l6) && !rc.canSenseRobotAtLocation(l6) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l6), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p6 = mapInfo.getCooldownMultiplier(team);
                    s6 = Math.sqrt(l6.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p6 = 1.5;
            }
            
            dist = v14 + p6 + s14 * 0.000001;
            if (v6 > dist) {
                v6 = dist;
                d6 = d14;
            }
            dist = v15 + p6 + s15 * 0.000001;
            if (v6 > dist) {
                v6 = dist;
                d6 = d15;
            }
            dist = v7 + p6 + s7 * 0.000001;
            if (v6 > dist) {
                v6 = dist;
                d6 = d7;
            }
        }

        if (rc.onTheMap(l55)) {
            if (rc.canSenseLocation(l55)) {
                MapInfo mapInfo = rc.senseMapInfo(l55);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l55) || (rc.sensePassability(l55) && !rc.canSenseRobotAtLocation(l55) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l55), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p55 = mapInfo.getCooldownMultiplier(team);
                    s55 = Math.sqrt(l55.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p55 = 1.5;
            }
            
            dist = v46 + p55 + s46 * 0.000001;
            if (v55 > dist) {
                v55 = dist;
                d55 = d46;
            }
            dist = v45 + p55 + s45 * 0.000001;
            if (v55 > dist) {
                v55 = dist;
                d55 = d45;
            }
            dist = v54 + p55 + s54 * 0.000001;
            if (v55 > dist) {
                v55 = dist;
                d55 = d54;
            }
        }

        if (rc.onTheMap(l5)) {
            if (rc.canSenseLocation(l5)) {
                MapInfo mapInfo = rc.senseMapInfo(l5);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l5) || (rc.sensePassability(l5) && !rc.canSenseRobotAtLocation(l5) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l5), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p5 = mapInfo.getCooldownMultiplier(team);
                    s5 = Math.sqrt(l5.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p5 = 1.5;
            }
            
            dist = v14 + p5 + s14 * 0.000001;
            if (v5 > dist) {
                v5 = dist;
                d5 = d14;
            }
            dist = v6 + p5 + s6 * 0.000001;
            if (v5 > dist) {
                v5 = dist;
                d5 = d6;
            }
        }

        if (rc.onTheMap(l11)) {
            if (rc.canSenseLocation(l11)) {
                MapInfo mapInfo = rc.senseMapInfo(l11);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l11) || (rc.sensePassability(l11) && !rc.canSenseRobotAtLocation(l11) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l11), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p11 = mapInfo.getCooldownMultiplier(team);
                    s11 = Math.sqrt(l11.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p11 = 1.5;
            }
            
            dist = v19 + p11 + s19 * 0.000001;
            if (v11 > dist) {
                v11 = dist;
                d11 = d19;
            }
            dist = v10 + p11 + s10 * 0.000001;
            if (v11 > dist) {
                v11 = dist;
                d11 = d10;
            }
            dist = v18 + p11 + s18 * 0.000001;
            if (v11 > dist) {
                v11 = dist;
                d11 = d18;
            }
        }

        if (rc.onTheMap(l63)) {
            if (rc.canSenseLocation(l63)) {
                MapInfo mapInfo = rc.senseMapInfo(l63);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l63) || (rc.sensePassability(l63) && !rc.canSenseRobotAtLocation(l63) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l63), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p63 = mapInfo.getCooldownMultiplier(team);
                    s63 = Math.sqrt(l63.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p63 = 1.5;
            }
            
            dist = v55 + p63 + s55 * 0.000001;
            if (v63 > dist) {
                v63 = dist;
                d63 = d55;
            }
            dist = v54 + p63 + s54 * 0.000001;
            if (v63 > dist) {
                v63 = dist;
                d63 = d54;
            }
        }

        if (rc.onTheMap(l2)) {
            if (rc.canSenseLocation(l2)) {
                MapInfo mapInfo = rc.senseMapInfo(l2);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l2) || (rc.sensePassability(l2) && !rc.canSenseRobotAtLocation(l2) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l2), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p2 = mapInfo.getCooldownMultiplier(team);
                    s2 = Math.sqrt(l2.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p2 = 1.5;
            }
            
            dist = v8 + p2 + s8 * 0.000001;
            if (v2 > dist) {
                v2 = dist;
                d2 = d8;
            }
            dist = v9 + p2 + s9 * 0.000001;
            if (v2 > dist) {
                v2 = dist;
                d2 = d9;
            }
            dist = v7 + p2 + s7 * 0.000001;
            if (v2 > dist) {
                v2 = dist;
                d2 = d7;
            }
        }

        if (rc.onTheMap(l38)) {
            if (rc.canSenseLocation(l38)) {
                MapInfo mapInfo = rc.senseMapInfo(l38);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l38) || (rc.sensePassability(l38) && !rc.canSenseRobotAtLocation(l38) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l38), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p38 = mapInfo.getCooldownMultiplier(team);
                    s38 = Math.sqrt(l38.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p38 = 1.5;
            }
            
            dist = v28 + p38 + s28 * 0.000001;
            if (v38 > dist) {
                v38 = dist;
                d38 = d28;
            }
            dist = v37 + p38 + s37 * 0.000001;
            if (v38 > dist) {
                v38 = dist;
                d38 = d37;
            }
            dist = v46 + p38 + s46 * 0.000001;
            if (v38 > dist) {
                v38 = dist;
                d38 = d46;
            }
        }

        if (rc.onTheMap(l29)) {
            if (rc.canSenseLocation(l29)) {
                MapInfo mapInfo = rc.senseMapInfo(l29);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l29) || (rc.sensePassability(l29) && !rc.canSenseRobotAtLocation(l29) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l29), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p29 = mapInfo.getCooldownMultiplier(team);
                    s29 = Math.sqrt(l29.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p29 = 1.5;
            }
            
            dist = v38 + p29 + s38 * 0.000001;
            if (v29 > dist) {
                v29 = dist;
                d29 = d38;
            }
            dist = v19 + p29 + s19 * 0.000001;
            if (v29 > dist) {
                v29 = dist;
                d29 = d19;
            }
            dist = v28 + p29 + s28 * 0.000001;
            if (v29 > dist) {
                v29 = dist;
                d29 = d28;
            }
            dist = v37 + p29 + s37 * 0.000001;
            if (v29 > dist) {
                v29 = dist;
                d29 = d37;
            }
        }

        if (rc.onTheMap(l1)) {
            if (rc.canSenseLocation(l1)) {
                MapInfo mapInfo = rc.senseMapInfo(l1);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l1) || (rc.sensePassability(l1) && !rc.canSenseRobotAtLocation(l1) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l1), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p1 = mapInfo.getCooldownMultiplier(team);
                    s1 = Math.sqrt(l1.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p1 = 1.5;
            }
            
            dist = v7 + p1 + s7 * 0.000001;
            if (v1 > dist) {
                v1 = dist;
                d1 = d7;
            }
            dist = v8 + p1 + s8 * 0.000001;
            if (v1 > dist) {
                v1 = dist;
                d1 = d8;
            }
            dist = v2 + p1 + s2 * 0.000001;
            if (v1 > dist) {
                v1 = dist;
                d1 = d2;
            }
            dist = v6 + p1 + s6 * 0.000001;
            if (v1 > dist) {
                v1 = dist;
                d1 = d6;
            }
        }

        if (rc.onTheMap(l3)) {
            if (rc.canSenseLocation(l3)) {
                MapInfo mapInfo = rc.senseMapInfo(l3);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l3) || (rc.sensePassability(l3) && !rc.canSenseRobotAtLocation(l3) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l3), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p3 = mapInfo.getCooldownMultiplier(team);
                    s3 = Math.sqrt(l3.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p3 = 1.5;
            }
            
            dist = v9 + p3 + s9 * 0.000001;
            if (v3 > dist) {
                v3 = dist;
                d3 = d9;
            }
            dist = v10 + p3 + s10 * 0.000001;
            if (v3 > dist) {
                v3 = dist;
                d3 = d10;
            }
            dist = v2 + p3 + s2 * 0.000001;
            if (v3 > dist) {
                v3 = dist;
                d3 = d2;
            }
            dist = v8 + p3 + s8 * 0.000001;
            if (v3 > dist) {
                v3 = dist;
                d3 = d8;
            }
        }

        if (rc.onTheMap(l47)) {
            if (rc.canSenseLocation(l47)) {
                MapInfo mapInfo = rc.senseMapInfo(l47);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l47) || (rc.sensePassability(l47) && !rc.canSenseRobotAtLocation(l47) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l47), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p47 = mapInfo.getCooldownMultiplier(team);
                    s47 = Math.sqrt(l47.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p47 = 1.5;
            }
            
            dist = v38 + p47 + s38 * 0.000001;
            if (v47 > dist) {
                v47 = dist;
                d47 = d38;
            }
            dist = v37 + p47 + s37 * 0.000001;
            if (v47 > dist) {
                v47 = dist;
                d47 = d37;
            }
            dist = v46 + p47 + s46 * 0.000001;
            if (v47 > dist) {
                v47 = dist;
                d47 = d46;
            }
            dist = v55 + p47 + s55 * 0.000001;
            if (v47 > dist) {
                v47 = dist;
                d47 = d55;
            }
        }

        if (rc.onTheMap(l56)) {
            if (rc.canSenseLocation(l56)) {
                MapInfo mapInfo = rc.senseMapInfo(l56);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l56) || (rc.sensePassability(l56) && !rc.canSenseRobotAtLocation(l56) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l56), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p56 = mapInfo.getCooldownMultiplier(team);
                    s56 = Math.sqrt(l56.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p56 = 1.5;
            }
            
            dist = v47 + p56 + s47 * 0.000001;
            if (v56 > dist) {
                v56 = dist;
                d56 = d47;
            }
            dist = v46 + p56 + s46 * 0.000001;
            if (v56 > dist) {
                v56 = dist;
                d56 = d46;
            }
            dist = v55 + p56 + s55 * 0.000001;
            if (v56 > dist) {
                v56 = dist;
                d56 = d55;
            }
            dist = v63 + p56 + s63 * 0.000001;
            if (v56 > dist) {
                v56 = dist;
                d56 = d63;
            }
        }

        if (rc.onTheMap(l0)) {
            if (rc.canSenseLocation(l0)) {
                MapInfo mapInfo = rc.senseMapInfo(l0);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l0) || (rc.sensePassability(l0) && !rc.canSenseRobotAtLocation(l0) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l0), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p0 = mapInfo.getCooldownMultiplier(team);
                    s0 = Math.sqrt(l0.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p0 = 1.5;
            }
            
            dist = v6 + p0 + s6 * 0.000001;
            if (v0 > dist) {
                v0 = dist;
                d0 = d6;
            }
            dist = v7 + p0 + s7 * 0.000001;
            if (v0 > dist) {
                v0 = dist;
                d0 = d7;
            }
            dist = v1 + p0 + s1 * 0.000001;
            if (v0 > dist) {
                v0 = dist;
                d0 = d1;
            }
            dist = v5 + p0 + s5 * 0.000001;
            if (v0 > dist) {
                v0 = dist;
                d0 = d5;
            }
        }

        if (rc.onTheMap(l20)) {
            if (rc.canSenseLocation(l20)) {
                MapInfo mapInfo = rc.senseMapInfo(l20);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l20) || (rc.sensePassability(l20) && !rc.canSenseRobotAtLocation(l20) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l20), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p20 = mapInfo.getCooldownMultiplier(team);
                    s20 = Math.sqrt(l20.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p20 = 1.5;
            }
            
            dist = v29 + p20 + s29 * 0.000001;
            if (v20 > dist) {
                v20 = dist;
                d20 = d29;
            }
            dist = v11 + p20 + s11 * 0.000001;
            if (v20 > dist) {
                v20 = dist;
                d20 = d11;
            }
            dist = v19 + p20 + s19 * 0.000001;
            if (v20 > dist) {
                v20 = dist;
                d20 = d19;
            }
            dist = v28 + p20 + s28 * 0.000001;
            if (v20 > dist) {
                v20 = dist;
                d20 = d28;
            }
        }

        if (rc.onTheMap(l4)) {
            if (rc.canSenseLocation(l4)) {
                MapInfo mapInfo = rc.senseMapInfo(l4);
                Direction currentDirection = mapInfo.getCurrentDirection();
                if (targetLocation.equals(l4) || (rc.sensePassability(l4) && !rc.canSenseRobotAtLocation(l4) && (currentDirection.equals(Direction.CENTER) || (dot(currentLocation.directionTo(l4), currentDirection) > 0 && dot(lastDirection, currentDirection) > 0)))) {
                    p4 = mapInfo.getCooldownMultiplier(team);
                    s4 = Math.sqrt(l4.add(currentDirection).distanceSquaredTo(targetLocation));
                }
            }
            else {
                p4 = 1.5;
            }
            
            dist = v10 + p4 + s10 * 0.000001;
            if (v4 > dist) {
                v4 = dist;
                d4 = d10;
            }
            dist = v11 + p4 + s11 * 0.000001;
            if (v4 > dist) {
                v4 = dist;
                d4 = d11;
            }
            dist = v3 + p4 + s3 * 0.000001;
            if (v4 > dist) {
                v4 = dist;
                d4 = d3;
            }
            dist = v9 + p4 + s9 * 0.000001;
            if (v4 > dist) {
                v4 = dist;
                d4 = d9;
            }
        }
    
        int dx = targetLocation.x - l34.x;
        int dy = targetLocation.y - l34.y;

        switch(dx) {
            case -4:
                switch(dy) {
                    case -2:
                        if (v0 < 1000000) {
                            bug.reset();
                            return d0;
                        } break;
                    case -1:
                        if (v1 < 1000000) {
                            bug.reset();
                            return d1;
                        } break;
                    case 0:
                        if (v2 < 1000000) {
                            bug.reset();
                            return d2;
                        } break;
                    case 1:
                        if (v3 < 1000000) {
                            bug.reset();
                            return d3;
                        } break;
                    case 2:
                        if (v4 < 1000000) {
                            bug.reset();
                            return d4;
                        } break;
                } break;

            case -3:
                switch(dy) {
                    case -3:
                        if (v5 < 1000000) {
                            bug.reset();
                            return d5;
                        } break;
                    case -2:
                        if (v6 < 1000000) {
                            bug.reset();
                            return d6;
                        } break;
                    case -1:
                        if (v7 < 1000000) {
                            bug.reset();
                            return d7;
                        } break;
                    case 0:
                        if (v8 < 1000000) {
                            bug.reset();
                            return d8;
                        } break;
                    case 1:
                        if (v9 < 1000000) {
                            bug.reset();
                            return d9;
                        } break;
                    case 2:
                        if (v10 < 1000000) {
                            bug.reset();
                            return d10;
                        } break;
                    case 3:
                        if (v11 < 1000000) {
                            bug.reset();
                            return d11;
                        } break;
                } break;

            case -2:
                switch(dy) {
                    case -2:
                        if (v14 < 1000000) {
                            bug.reset();
                            return d14;
                        } break;
                    case -1:
                        if (v15 < 1000000) {
                            bug.reset();
                            return d15;
                        } break;
                    case 0:
                        if (v16 < 1000000) {
                            bug.reset();
                            return d16;
                        } break;
                    case 1:
                        if (v17 < 1000000) {
                            bug.reset();
                            return d17;
                        } break;
                    case 2:
                        if (v18 < 1000000) {
                            bug.reset();
                            return d18;
                        } break;
                    case 3:
                        if (v19 < 1000000) {
                            bug.reset();
                            return d19;
                        } break;
                    case 4:
                        if (v20 < 1000000) {
                            bug.reset();
                            return d20;
                        } break;
                } break;

            case -1:
                switch(dy) {
                    case -1:
                        if (v24 < 1000000) {
                            bug.reset();
                            return d24;
                        } break;
                    case 0:
                        if (v25 < 1000000) {
                            bug.reset();
                            return d25;
                        } break;
                    case 1:
                        if (v26 < 1000000) {
                            bug.reset();
                            return d26;
                        } break;
                    case 2:
                        if (v27 < 1000000) {
                            bug.reset();
                            return d27;
                        } break;
                    case 3:
                        if (v28 < 1000000) {
                            bug.reset();
                            return d28;
                        } break;
                    case 4:
                        if (v29 < 1000000) {
                            bug.reset();
                            return d29;
                        } break;
                } break;

            case 0:
                switch(dy) {
                    case 1:
                        if (v35 < 1000000) {
                            bug.reset();
                            return d35;
                        } break;
                    case 2:
                        if (v36 < 1000000) {
                            bug.reset();
                            return d36;
                        } break;
                    case 3:
                        if (v37 < 1000000) {
                            bug.reset();
                            return d37;
                        } break;
                    case 4:
                        if (v38 < 1000000) {
                            bug.reset();
                            return d38;
                        } break;
                } break;

            case 1:
                switch(dy) {
                    case 1:
                        if (v44 < 1000000) {
                            bug.reset();
                            return d44;
                        } break;
                    case 2:
                        if (v45 < 1000000) {
                            bug.reset();
                            return d45;
                        } break;
                    case 3:
                        if (v46 < 1000000) {
                            bug.reset();
                            return d46;
                        } break;
                    case 4:
                        if (v47 < 1000000) {
                            bug.reset();
                            return d47;
                        } break;
                } break;

            case 2:
                switch(dy) {
                    case 2:
                        if (v54 < 1000000) {
                            bug.reset();
                            return d54;
                        } break;
                    case 3:
                        if (v55 < 1000000) {
                            bug.reset();
                            return d55;
                        } break;
                    case 4:
                        if (v56 < 1000000) {
                            bug.reset();
                            return d56;
                        } break;
                } break;

            case 3:
                switch(dy) {
                    case 3:
                        if (v63 < 1000000) {
                            bug.reset();
                            return d63;
                        } break;
                } break;

            case 4:
                switch(dy) {
                } break;

        }
    
        Direction ans = Direction.CENTER;

        double dist0 = v0 + s0;
        if (dist0 < localBest) {
            localBest = dist0;
            ans = d0;
        }

        double dist1 = v1 + s1;
        if (dist1 < localBest) {
            localBest = dist1;
            ans = d1;
        }

        double dist2 = v2 + s2;
        if (dist2 < localBest) {
            localBest = dist2;
            ans = d2;
        }

        double dist3 = v3 + s3;
        if (dist3 < localBest) {
            localBest = dist3;
            ans = d3;
        }

        double dist4 = v4 + s4;
        if (dist4 < localBest) {
            localBest = dist4;
            ans = d4;
        }

        double dist5 = v5 + s5;
        if (dist5 < localBest) {
            localBest = dist5;
            ans = d5;
        }

        double dist6 = v6 + s6;
        if (dist6 < localBest) {
            localBest = dist6;
            ans = d6;
        }

        double dist7 = v7 + s7;
        if (dist7 < localBest) {
            localBest = dist7;
            ans = d7;
        }

        double dist8 = v8 + s8;
        if (dist8 < localBest) {
            localBest = dist8;
            ans = d8;
        }

        double dist9 = v9 + s9;
        if (dist9 < localBest) {
            localBest = dist9;
            ans = d9;
        }

        double dist10 = v10 + s10;
        if (dist10 < localBest) {
            localBest = dist10;
            ans = d10;
        }

        double dist11 = v11 + s11;
        if (dist11 < localBest) {
            localBest = dist11;
            ans = d11;
        }

        double dist14 = v14 + s14;
        if (dist14 < localBest) {
            localBest = dist14;
            ans = d14;
        }

        double dist15 = v15 + s15;
        if (dist15 < localBest) {
            localBest = dist15;
            ans = d15;
        }

        double dist16 = v16 + s16;
        if (dist16 < localBest) {
            localBest = dist16;
            ans = d16;
        }

        double dist17 = v17 + s17;
        if (dist17 < localBest) {
            localBest = dist17;
            ans = d17;
        }

        double dist18 = v18 + s18;
        if (dist18 < localBest) {
            localBest = dist18;
            ans = d18;
        }

        double dist19 = v19 + s19;
        if (dist19 < localBest) {
            localBest = dist19;
            ans = d19;
        }

        double dist20 = v20 + s20;
        if (dist20 < localBest) {
            localBest = dist20;
            ans = d20;
        }

        double dist24 = v24 + s24;
        if (dist24 < localBest) {
            localBest = dist24;
            ans = d24;
        }

        double dist25 = v25 + s25;
        if (dist25 < localBest) {
            localBest = dist25;
            ans = d25;
        }

        double dist26 = v26 + s26;
        if (dist26 < localBest) {
            localBest = dist26;
            ans = d26;
        }

        double dist27 = v27 + s27;
        if (dist27 < localBest) {
            localBest = dist27;
            ans = d27;
        }

        double dist28 = v28 + s28;
        if (dist28 < localBest) {
            localBest = dist28;
            ans = d28;
        }

        double dist29 = v29 + s29;
        if (dist29 < localBest) {
            localBest = dist29;
            ans = d29;
        }

        double dist35 = v35 + s35;
        if (dist35 < localBest) {
            localBest = dist35;
            ans = d35;
        }

        double dist36 = v36 + s36;
        if (dist36 < localBest) {
            localBest = dist36;
            ans = d36;
        }

        double dist37 = v37 + s37;
        if (dist37 < localBest) {
            localBest = dist37;
            ans = d37;
        }

        double dist38 = v38 + s38;
        if (dist38 < localBest) {
            localBest = dist38;
            ans = d38;
        }

        double dist44 = v44 + s44;
        if (dist44 < localBest) {
            localBest = dist44;
            ans = d44;
        }

        double dist45 = v45 + s45;
        if (dist45 < localBest) {
            localBest = dist45;
            ans = d45;
        }

        double dist46 = v46 + s46;
        if (dist46 < localBest) {
            localBest = dist46;
            ans = d46;
        }

        double dist47 = v47 + s47;
        if (dist47 < localBest) {
            localBest = dist47;
            ans = d47;
        }

        double dist54 = v54 + s54;
        if (dist54 < localBest) {
            localBest = dist54;
            ans = d54;
        }

        double dist55 = v55 + s55;
        if (dist55 < localBest) {
            localBest = dist55;
            ans = d55;
        }

        double dist56 = v56 + s56;
        if (dist56 < localBest) {
            localBest = dist56;
            ans = d56;
        }

        double dist63 = v63 + s63;
        if (dist63 < localBest) {
            localBest = dist63;
            ans = d63;
        }

        if (localBest < globalBest) {
            globalBest = localBest;
            bug.reset();
            return ans;
        }

        consecutiveBugNavRoundCount += 1;

        if (consecutiveBugNavRoundCount > 40) {
            globalBest = 1000000;
            consecutiveBugNavRoundCount = 0;
        }

        bug.move(targetLocation, lastDirection);
        return null;
    }

    public void moveAgain(MapLocation targetLocation) throws GameActionException {
        previousLocation = currentLocation;
        currentLocation = rc.getLocation();
        lastDirection = previousLocation == null ? Direction.CENTER : previousLocation.directionTo(currentLocation);
        globalBest = Math.min(Math.sqrt(currentLocation.distanceSquaredTo(targetLocation)), globalBest);
        bug.move(targetLocation, lastDirection);
    }

    public Direction getBestDirection(MapLocation targetLocation) throws GameActionException {
        previousLocation = currentLocation;
        currentLocation = rc.getLocation();
        lastDirection = previousLocation == null ? Direction.CENTER : previousLocation.directionTo(currentLocation);
        
        if (!targetLocation.equals(this.targetLocation)) {
            globalBest = 1000000;
            this.targetLocation = targetLocation;
            consecutiveBugNavRoundCount = 0;
            lastDirection = Direction.CENTER;
        }

        int dx, dy;

        if (lastDirection.equals(Direction.CENTER) || currentLocation.distanceSquaredTo(targetLocation) <= 20) {
            dx = targetLocation.x - currentLocation.x;
            dy = targetLocation.y - currentLocation.y;
        }
        else {
            dx = lastDirection.getDeltaX();
            dy = lastDirection.getDeltaY();
        }

        double prod = Math.abs((double)dy / Math.sqrt(dx * dx + dy * dy));

        Direction ans = Direction.CENTER;

        if (prod > Math.cos(Math.toRadians(22.5))) {
            if (dy > 0) {
                ans = getBestDirection0();
            }
            else {
                ans = getBestDirection4();
            }
        }
        else if (prod > Math.cos(Math.toRadians(67.5))) {
             if (dx > 0 && dy > 0) {
                ans = getBestDirection1();
             }
             if (dx > 0 && dy < 0) {
                ans = getBestDirection3();
             }
             if (dx < 0 && dy < 0) {
                ans = getBestDirection5();
             }
             if (dx < 0 && dy > 0) {
                ans = getBestDirection7();
             }
        }
        else {
            if (dx > 0) {
                ans = getBestDirection2();
            }
            else {
                ans = getBestDirection6();
            }
        }

        return ans;
    }

    private double dot(Direction directionA, Direction directionB) {
        return directionA.getDeltaX() * directionB.getDeltaX() + directionA.getDeltaY() * directionB.getDeltaY();
    }
}