package Pathing;

import battlecode.common.*;

import java.util.ArrayList;

public class Navigation {

    private RobotController rc;
    private Team team;

    private MapLocation previousLocation;
    private MapLocation currentLocation;

    private MapLocation targetLocation;

    private Direction lastDirection;
    private ArrayList<MapLocation> closestWallLocations;

    private double globalBest = 1000000;

    public Navigation (RobotController rc) {
        this.rc = rc;
        team = rc.getTeam();

        closestWallLocations = new ArrayList<MapLocation>();
    }
    
    private static MapLocation l0;
    private static double v0;
    private static Direction d0;
    private static double p0;
    private static boolean b0;
    private static boolean r0;
    private static boolean o0;

    private static MapLocation l1;
    private static double v1;
    private static Direction d1;
    private static double p1;
    private static boolean b1;
    private static boolean r1;
    private static boolean o1;

    private static MapLocation l2;
    private static double v2;
    private static Direction d2;
    private static double p2;
    private static boolean b2;
    private static boolean r2;
    private static boolean o2;

    private static MapLocation l3;
    private static double v3;
    private static Direction d3;
    private static double p3;
    private static boolean b3;
    private static boolean r3;
    private static boolean o3;

    private static MapLocation l4;
    private static double v4;
    private static Direction d4;
    private static double p4;
    private static boolean b4;
    private static boolean r4;
    private static boolean o4;

    private static MapLocation l5;
    private static double v5;
    private static Direction d5;
    private static double p5;
    private static boolean b5;
    private static boolean r5;
    private static boolean o5;

    private static MapLocation l6;
    private static double v6;
    private static Direction d6;
    private static double p6;
    private static boolean b6;
    private static boolean r6;
    private static boolean o6;

    private static MapLocation l7;
    private static double v7;
    private static Direction d7;
    private static double p7;
    private static boolean b7;
    private static boolean r7;
    private static boolean o7;

    private static MapLocation l8;
    private static double v8;
    private static Direction d8;
    private static double p8;
    private static boolean b8;
    private static boolean r8;
    private static boolean o8;

    private static MapLocation l9;
    private static double v9;
    private static Direction d9;
    private static double p9;
    private static boolean b9;
    private static boolean r9;
    private static boolean o9;

    private static MapLocation l10;
    private static double v10;
    private static Direction d10;
    private static double p10;
    private static boolean b10;
    private static boolean r10;
    private static boolean o10;

    private static MapLocation l11;
    private static double v11;
    private static Direction d11;
    private static double p11;
    private static boolean b11;
    private static boolean r11;
    private static boolean o11;

    private static MapLocation l12;
    private static double v12;
    private static Direction d12;
    private static double p12;
    private static boolean b12;
    private static boolean r12;
    private static boolean o12;

    private static MapLocation l13;
    private static double v13;
    private static Direction d13;
    private static double p13;
    private static boolean b13;
    private static boolean r13;
    private static boolean o13;

    private static MapLocation l14;
    private static double v14;
    private static Direction d14;
    private static double p14;
    private static boolean b14;
    private static boolean r14;
    private static boolean o14;

    private static MapLocation l15;
    private static double v15;
    private static Direction d15;
    private static double p15;
    private static boolean b15;
    private static boolean r15;
    private static boolean o15;

    private static MapLocation l16;
    private static double v16;
    private static Direction d16;
    private static double p16;
    private static boolean b16;
    private static boolean r16;
    private static boolean o16;

    private static MapLocation l17;
    private static double v17;
    private static Direction d17;
    private static double p17;
    private static boolean b17;
    private static boolean r17;
    private static boolean o17;

    private static MapLocation l18;
    private static double v18;
    private static Direction d18;
    private static double p18;
    private static boolean b18;
    private static boolean r18;
    private static boolean o18;

    private static MapLocation l19;
    private static double v19;
    private static Direction d19;
    private static double p19;
    private static boolean b19;
    private static boolean r19;
    private static boolean o19;

    private static MapLocation l20;
    private static double v20;
    private static Direction d20;
    private static double p20;
    private static boolean b20;
    private static boolean r20;
    private static boolean o20;

    private static MapLocation l21;
    private static double v21;
    private static Direction d21;
    private static double p21;
    private static boolean b21;
    private static boolean r21;
    private static boolean o21;

    private static MapLocation l22;
    private static double v22;
    private static Direction d22;
    private static double p22;
    private static boolean b22;
    private static boolean r22;
    private static boolean o22;

    private static MapLocation l23;
    private static double v23;
    private static Direction d23;
    private static double p23;
    private static boolean b23;
    private static boolean r23;
    private static boolean o23;

    private static MapLocation l24;
    private static double v24;
    private static Direction d24;
    private static double p24;
    private static boolean b24;
    private static boolean r24;
    private static boolean o24;

    private static MapLocation l25;
    private static double v25;
    private static Direction d25;
    private static double p25;
    private static boolean b25;
    private static boolean r25;
    private static boolean o25;

    private static MapLocation l26;
    private static double v26;
    private static Direction d26;
    private static double p26;
    private static boolean b26;
    private static boolean r26;
    private static boolean o26;

    private static MapLocation l27;
    private static double v27;
    private static Direction d27;
    private static double p27;
    private static boolean b27;
    private static boolean r27;
    private static boolean o27;

    private static MapLocation l28;
    private static double v28;
    private static Direction d28;
    private static double p28;
    private static boolean b28;
    private static boolean r28;
    private static boolean o28;

    private static MapLocation l29;
    private static double v29;
    private static Direction d29;
    private static double p29;
    private static boolean b29;
    private static boolean r29;
    private static boolean o29;

    private static MapLocation l30;
    private static double v30;
    private static Direction d30;
    private static double p30;
    private static boolean b30;
    private static boolean r30;
    private static boolean o30;

    private static MapLocation l31;
    private static double v31;
    private static Direction d31;
    private static double p31;
    private static boolean b31;
    private static boolean r31;
    private static boolean o31;

    private static MapLocation l32;
    private static double v32;
    private static Direction d32;
    private static double p32;
    private static boolean b32;
    private static boolean r32;
    private static boolean o32;

    private static MapLocation l33;
    private static double v33;
    private static Direction d33;
    private static double p33;
    private static boolean b33;
    private static boolean r33;
    private static boolean o33;

    private static MapLocation l34;
    private static double v34;
    private static Direction d34;
    private static boolean r34;

    private static MapLocation l35;
    private static double v35;
    private static Direction d35;
    private static double p35;
    private static boolean b35;
    private static boolean r35;
    private static boolean o35;

    private static MapLocation l36;
    private static double v36;
    private static Direction d36;
    private static double p36;
    private static boolean b36;
    private static boolean r36;
    private static boolean o36;

    private static MapLocation l37;
    private static double v37;
    private static Direction d37;
    private static double p37;
    private static boolean b37;
    private static boolean r37;
    private static boolean o37;

    private static MapLocation l38;
    private static double v38;
    private static Direction d38;
    private static double p38;
    private static boolean b38;
    private static boolean r38;
    private static boolean o38;

    private static MapLocation l39;
    private static double v39;
    private static Direction d39;
    private static double p39;
    private static boolean b39;
    private static boolean r39;
    private static boolean o39;

    private static MapLocation l40;
    private static double v40;
    private static Direction d40;
    private static double p40;
    private static boolean b40;
    private static boolean r40;
    private static boolean o40;

    private static MapLocation l41;
    private static double v41;
    private static Direction d41;
    private static double p41;
    private static boolean b41;
    private static boolean r41;
    private static boolean o41;

    private static MapLocation l42;
    private static double v42;
    private static Direction d42;
    private static double p42;
    private static boolean b42;
    private static boolean r42;
    private static boolean o42;

    private static MapLocation l43;
    private static double v43;
    private static Direction d43;
    private static double p43;
    private static boolean b43;
    private static boolean r43;
    private static boolean o43;

    private static MapLocation l44;
    private static double v44;
    private static Direction d44;
    private static double p44;
    private static boolean b44;
    private static boolean r44;
    private static boolean o44;

    private static MapLocation l45;
    private static double v45;
    private static Direction d45;
    private static double p45;
    private static boolean b45;
    private static boolean r45;
    private static boolean o45;

    private static MapLocation l46;
    private static double v46;
    private static Direction d46;
    private static double p46;
    private static boolean b46;
    private static boolean r46;
    private static boolean o46;

    private static MapLocation l47;
    private static double v47;
    private static Direction d47;
    private static double p47;
    private static boolean b47;
    private static boolean r47;
    private static boolean o47;

    private static MapLocation l48;
    private static double v48;
    private static Direction d48;
    private static double p48;
    private static boolean b48;
    private static boolean r48;
    private static boolean o48;

    private static MapLocation l49;
    private static double v49;
    private static Direction d49;
    private static double p49;
    private static boolean b49;
    private static boolean r49;
    private static boolean o49;

    private static MapLocation l50;
    private static double v50;
    private static Direction d50;
    private static double p50;
    private static boolean b50;
    private static boolean r50;
    private static boolean o50;

    private static MapLocation l51;
    private static double v51;
    private static Direction d51;
    private static double p51;
    private static boolean b51;
    private static boolean r51;
    private static boolean o51;

    private static MapLocation l52;
    private static double v52;
    private static Direction d52;
    private static double p52;
    private static boolean b52;
    private static boolean r52;
    private static boolean o52;

    private static MapLocation l53;
    private static double v53;
    private static Direction d53;
    private static double p53;
    private static boolean b53;
    private static boolean r53;
    private static boolean o53;

    private static MapLocation l54;
    private static double v54;
    private static Direction d54;
    private static double p54;
    private static boolean b54;
    private static boolean r54;
    private static boolean o54;

    private static MapLocation l55;
    private static double v55;
    private static Direction d55;
    private static double p55;
    private static boolean b55;
    private static boolean r55;
    private static boolean o55;

    private static MapLocation l56;
    private static double v56;
    private static Direction d56;
    private static double p56;
    private static boolean b56;
    private static boolean r56;
    private static boolean o56;

    private static MapLocation l57;
    private static double v57;
    private static Direction d57;
    private static double p57;
    private static boolean b57;
    private static boolean r57;
    private static boolean o57;

    private static MapLocation l58;
    private static double v58;
    private static Direction d58;
    private static double p58;
    private static boolean b58;
    private static boolean r58;
    private static boolean o58;

    private static MapLocation l59;
    private static double v59;
    private static Direction d59;
    private static double p59;
    private static boolean b59;
    private static boolean r59;
    private static boolean o59;

    private static MapLocation l60;
    private static double v60;
    private static Direction d60;
    private static double p60;
    private static boolean b60;
    private static boolean r60;
    private static boolean o60;

    private static MapLocation l61;
    private static double v61;
    private static Direction d61;
    private static double p61;
    private static boolean b61;
    private static boolean r61;
    private static boolean o61;

    private static MapLocation l62;
    private static double v62;
    private static Direction d62;
    private static double p62;
    private static boolean b62;
    private static boolean r62;
    private static boolean o62;

    private static MapLocation l63;
    private static double v63;
    private static Direction d63;
    private static double p63;
    private static boolean b63;
    private static boolean r63;
    private static boolean o63;

    private static MapLocation l64;
    private static double v64;
    private static Direction d64;
    private static double p64;
    private static boolean b64;
    private static boolean r64;
    private static boolean o64;

    private static MapLocation l65;
    private static double v65;
    private static Direction d65;
    private static double p65;
    private static boolean b65;
    private static boolean r65;
    private static boolean o65;

    private static MapLocation l66;
    private static double v66;
    private static Direction d66;
    private static double p66;
    private static boolean b66;
    private static boolean r66;
    private static boolean o66;

    private static MapLocation l67;
    private static double v67;
    private static Direction d67;
    private static double p67;
    private static boolean b67;
    private static boolean r67;
    private static boolean o67;

    private static MapLocation l68;
    private static double v68;
    private static Direction d68;
    private static double p68;
    private static boolean b68;
    private static boolean r68;
    private static boolean o68;

    private Direction getBestDirection0() throws GameActionException {
        MapLocation best = currentLocation;
        double localBest = 1000000.0;
        l34 = currentLocation;
        v34 = 0;
        d34 = Direction.CENTER;
        r34 = true;
        l43 = l34.add(Direction.EAST);
        v43 = 1000000;
        p43 = 1000000;
        d43 = null;
        b43 = true;
        r43 = false;
        o43 = false;
        l44 = l34.add(Direction.NORTHEAST);
        v44 = 1000000;
        p44 = 1000000;
        d44 = null;
        b44 = true;
        r44 = false;
        o44 = false;
        l35 = l34.add(Direction.NORTH);
        v35 = 1000000;
        p35 = 1000000;
        d35 = null;
        b35 = true;
        r35 = false;
        o35 = false;
        l26 = l34.add(Direction.NORTHWEST);
        v26 = 1000000;
        p26 = 1000000;
        d26 = null;
        b26 = true;
        r26 = false;
        o26 = false;
        l25 = l34.add(Direction.WEST);
        v25 = 1000000;
        p25 = 1000000;
        d25 = null;
        b25 = true;
        r25 = false;
        o25 = false;
        l17 = l25.add(Direction.NORTHWEST);
        v17 = 1000000;
        p17 = 1000000;
        d17 = null;
        b17 = true;
        r17 = false;
        o17 = false;
        l16 = l25.add(Direction.WEST);
        v16 = 1000000;
        p16 = 1000000;
        d16 = null;
        b16 = true;
        r16 = false;
        o16 = false;
        l45 = l35.add(Direction.NORTHEAST);
        v45 = 1000000;
        p45 = 1000000;
        d45 = null;
        b45 = true;
        r45 = false;
        o45 = false;
        l36 = l35.add(Direction.NORTH);
        v36 = 1000000;
        p36 = 1000000;
        d36 = null;
        b36 = true;
        r36 = false;
        o36 = false;
        l27 = l35.add(Direction.NORTHWEST);
        v27 = 1000000;
        p27 = 1000000;
        d27 = null;
        b27 = true;
        r27 = false;
        o27 = false;
        l52 = l43.add(Direction.EAST);
        v52 = 1000000;
        p52 = 1000000;
        d52 = null;
        b52 = true;
        r52 = false;
        o52 = false;
        l53 = l43.add(Direction.NORTHEAST);
        v53 = 1000000;
        p53 = 1000000;
        d53 = null;
        b53 = true;
        r53 = false;
        o53 = false;
        l18 = l26.add(Direction.NORTHWEST);
        v18 = 1000000;
        p18 = 1000000;
        d18 = null;
        b18 = true;
        r18 = false;
        o18 = false;
        l54 = l44.add(Direction.NORTHEAST);
        v54 = 1000000;
        p54 = 1000000;
        d54 = null;
        b54 = true;
        r54 = false;
        o54 = false;
        l60 = l52.add(Direction.EAST);
        v60 = 1000000;
        p60 = 1000000;
        d60 = null;
        b60 = true;
        r60 = false;
        o60 = false;
        l61 = l52.add(Direction.NORTHEAST);
        v61 = 1000000;
        p61 = 1000000;
        d61 = null;
        b61 = true;
        r61 = false;
        o61 = false;
        l46 = l36.add(Direction.NORTHEAST);
        v46 = 1000000;
        p46 = 1000000;
        d46 = null;
        b46 = true;
        r46 = false;
        o46 = false;
        l37 = l36.add(Direction.NORTH);
        v37 = 1000000;
        p37 = 1000000;
        d37 = null;
        b37 = true;
        r37 = false;
        o37 = false;
        l28 = l36.add(Direction.NORTHWEST);
        v28 = 1000000;
        p28 = 1000000;
        d28 = null;
        b28 = true;
        r28 = false;
        o28 = false;
        l9 = l16.add(Direction.NORTHWEST);
        v9 = 1000000;
        p9 = 1000000;
        d9 = null;
        b9 = true;
        r9 = false;
        o9 = false;
        l8 = l16.add(Direction.WEST);
        v8 = 1000000;
        p8 = 1000000;
        d8 = null;
        b8 = true;
        r8 = false;
        o8 = false;
        l62 = l53.add(Direction.NORTHEAST);
        v62 = 1000000;
        p62 = 1000000;
        d62 = null;
        b62 = true;
        r62 = false;
        o62 = false;
        l19 = l27.add(Direction.NORTHWEST);
        v19 = 1000000;
        p19 = 1000000;
        d19 = null;
        b19 = true;
        r19 = false;
        o19 = false;
        l10 = l17.add(Direction.NORTHWEST);
        v10 = 1000000;
        p10 = 1000000;
        d10 = null;
        b10 = true;
        r10 = false;
        o10 = false;
        l55 = l45.add(Direction.NORTHEAST);
        v55 = 1000000;
        p55 = 1000000;
        d55 = null;
        b55 = true;
        r55 = false;
        o55 = false;
        l11 = l18.add(Direction.NORTHWEST);
        v11 = 1000000;
        p11 = 1000000;
        d11 = null;
        b11 = true;
        r11 = false;
        o11 = false;
        l63 = l54.add(Direction.NORTHEAST);
        v63 = 1000000;
        p63 = 1000000;
        d63 = null;
        b63 = true;
        r63 = false;
        o63 = false;
        l66 = l60.add(Direction.EAST);
        v66 = 1000000;
        p66 = 1000000;
        d66 = null;
        b66 = true;
        r66 = false;
        o66 = false;
        l67 = l60.add(Direction.NORTHEAST);
        v67 = 1000000;
        p67 = 1000000;
        d67 = null;
        b67 = true;
        r67 = false;
        o67 = false;
        l47 = l37.add(Direction.NORTHEAST);
        v47 = 1000000;
        p47 = 1000000;
        d47 = null;
        b47 = true;
        r47 = false;
        o47 = false;
        l38 = l37.add(Direction.NORTH);
        v38 = 1000000;
        p38 = 1000000;
        d38 = null;
        b38 = true;
        r38 = false;
        o38 = false;
        l29 = l37.add(Direction.NORTHWEST);
        v29 = 1000000;
        p29 = 1000000;
        d29 = null;
        b29 = true;
        r29 = false;
        o29 = false;
        l3 = l8.add(Direction.NORTHWEST);
        v3 = 1000000;
        p3 = 1000000;
        d3 = null;
        b3 = true;
        r3 = false;
        o3 = false;
        l2 = l8.add(Direction.WEST);
        v2 = 1000000;
        p2 = 1000000;
        d2 = null;
        b2 = true;
        r2 = false;
        o2 = false;
        l68 = l61.add(Direction.NORTHEAST);
        v68 = 1000000;
        p68 = 1000000;
        d68 = null;
        b68 = true;
        r68 = false;
        o68 = false;
        l56 = l46.add(Direction.NORTHEAST);
        v56 = 1000000;
        p56 = 1000000;
        d56 = null;
        b56 = true;
        r56 = false;
        o56 = false;
        l4 = l9.add(Direction.NORTHWEST);
        v4 = 1000000;
        p4 = 1000000;
        d4 = null;
        b4 = true;
        r4 = false;
        o4 = false;
        l20 = l28.add(Direction.NORTHWEST);
        v20 = 1000000;
        p20 = 1000000;
        d20 = null;
        b20 = true;
        r20 = false;
        o20 = false;
    
        if (rc.onTheMap(l25) && rc.canSenseLocation(l25)) {
            if (rc.senseCloud(l25)) {
                p25 = 1.5;
                b25 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l25).getCurrentDirection();
                if (targetLocation.equals(l25) || (rc.sensePassability(l25) && !rc.canSenseRobotAtLocation(l25) && currentDirection.equals(Direction.CENTER))) {
                    p25 = rc.senseMapInfo(l25).getCooldownMultiplier(team);
                    b25 = false;
                }
            }
            if (v25 > v34 + p25) {
                v25 = v34 + p25;
                d25 = Direction.WEST;
            }
            if (v25 > v35 + p25) {
                v25 = v35 + p25;
                d25 = d35;
            }
            
            r25 |= r34;
            r25 |= r35;
            r25 &= !b25;
            o35 |= b25;
        }
        else {
            o35 |= b25;
        }

        if (rc.onTheMap(l35) && rc.canSenseLocation(l35)) {
            if (rc.senseCloud(l35)) {
                p35 = 1.5;
                b35 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l35).getCurrentDirection();
                if (targetLocation.equals(l35) || (rc.sensePassability(l35) && !rc.canSenseRobotAtLocation(l35) && currentDirection.equals(Direction.CENTER))) {
                    p35 = rc.senseMapInfo(l35).getCooldownMultiplier(team);
                    b35 = false;
                }
            }
            if (v35 > v25 + p35) {
                v35 = v25 + p35;
                d35 = d25;
            }
            if (v35 > v34 + p35) {
                v35 = v34 + p35;
                d35 = Direction.NORTH;
            }
            if (v35 > v43 + p35) {
                v35 = v43 + p35;
                d35 = d43;
            }
            
            r35 |= r25;
            r35 |= r34;
            r35 |= r43;
            r35 &= !b35;
            o25 |= b35;
            o43 |= b35;
        }
        else {
            o25 |= b35;
            o43 |= b35;
        }

        if (rc.onTheMap(l43) && rc.canSenseLocation(l43)) {
            if (rc.senseCloud(l43)) {
                p43 = 1.5;
                b43 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l43).getCurrentDirection();
                if (targetLocation.equals(l43) || (rc.sensePassability(l43) && !rc.canSenseRobotAtLocation(l43) && currentDirection.equals(Direction.CENTER))) {
                    p43 = rc.senseMapInfo(l43).getCooldownMultiplier(team);
                    b43 = false;
                }
            }
            if (v43 > v35 + p43) {
                v43 = v35 + p43;
                d43 = d35;
            }
            if (v43 > v34 + p43) {
                v43 = v34 + p43;
                d43 = Direction.EAST;
            }
            
            r43 |= r35;
            r43 |= r34;
            r43 &= !b43;
            o35 |= b43;
        }
        else {
            o35 |= b43;
        }

        if (rc.onTheMap(l26) && rc.canSenseLocation(l26)) {
            if (rc.senseCloud(l26)) {
                p26 = 1.5;
                b26 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l26).getCurrentDirection();
                if (targetLocation.equals(l26) || (rc.sensePassability(l26) && !rc.canSenseRobotAtLocation(l26) && currentDirection.equals(Direction.CENTER))) {
                    p26 = rc.senseMapInfo(l26).getCooldownMultiplier(team);
                    b26 = false;
                }
            }
            if (v26 > v35 + p26) {
                v26 = v35 + p26;
                d26 = d35;
            }
            if (v26 > v25 + p26) {
                v26 = v25 + p26;
                d26 = d25;
            }
            if (v26 > v34 + p26) {
                v26 = v34 + p26;
                d26 = Direction.NORTHWEST;
            }
            
            r26 |= r35;
            r26 |= r25;
            r26 |= r34;
            r26 &= !b26;
            o35 |= b26;
            o25 |= b26;
        }
        else {
            o35 |= b26;
            o25 |= b26;
        }

        if (rc.onTheMap(l44) && rc.canSenseLocation(l44)) {
            if (rc.senseCloud(l44)) {
                p44 = 1.5;
                b44 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l44).getCurrentDirection();
                if (targetLocation.equals(l44) || (rc.sensePassability(l44) && !rc.canSenseRobotAtLocation(l44) && currentDirection.equals(Direction.CENTER))) {
                    p44 = rc.senseMapInfo(l44).getCooldownMultiplier(team);
                    b44 = false;
                }
            }
            if (v44 > v35 + p44) {
                v44 = v35 + p44;
                d44 = d35;
            }
            if (v44 > v34 + p44) {
                v44 = v34 + p44;
                d44 = Direction.NORTHEAST;
            }
            if (v44 > v43 + p44) {
                v44 = v43 + p44;
                d44 = d43;
            }
            
            r44 |= r35;
            r44 |= r34;
            r44 |= r43;
            r44 &= !b44;
            o35 |= b44;
            o43 |= b44;
        }
        else {
            o35 |= b44;
            o43 |= b44;
        }

        if (rc.onTheMap(l52) && rc.canSenseLocation(l52)) {
            if (rc.senseCloud(l52)) {
                p52 = 1.5;
                b52 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l52).getCurrentDirection();
                if (targetLocation.equals(l52) || (rc.sensePassability(l52) && !rc.canSenseRobotAtLocation(l52) && currentDirection.equals(Direction.CENTER))) {
                    p52 = rc.senseMapInfo(l52).getCooldownMultiplier(team);
                    b52 = false;
                }
            }
            if (v52 > v44 + p52) {
                v52 = v44 + p52;
                d52 = d44;
            }
            if (v52 > v43 + p52) {
                v52 = v43 + p52;
                d52 = d43;
            }
            
            r52 |= r44;
            r52 |= r43;
            r52 &= !b52;
            o44 |= b52;
            o43 |= b52;
        }
        else {
            o44 |= b52;
            o43 |= b52;
        }

        if (rc.onTheMap(l36) && rc.canSenseLocation(l36)) {
            if (rc.senseCloud(l36)) {
                p36 = 1.5;
                b36 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l36).getCurrentDirection();
                if (targetLocation.equals(l36) || (rc.sensePassability(l36) && !rc.canSenseRobotAtLocation(l36) && currentDirection.equals(Direction.CENTER))) {
                    p36 = rc.senseMapInfo(l36).getCooldownMultiplier(team);
                    b36 = false;
                }
            }
            if (v36 > v26 + p36) {
                v36 = v26 + p36;
                d36 = d26;
            }
            if (v36 > v35 + p36) {
                v36 = v35 + p36;
                d36 = d35;
            }
            if (v36 > v44 + p36) {
                v36 = v44 + p36;
                d36 = d44;
            }
            
            r36 |= r26;
            r36 |= r35;
            r36 |= r44;
            r36 &= !b36;
            o26 |= b36;
            o35 |= b36;
            o44 |= b36;
        }
        else {
            o26 |= b36;
            o35 |= b36;
            o44 |= b36;
        }

        if (rc.onTheMap(l16) && rc.canSenseLocation(l16)) {
            if (rc.senseCloud(l16)) {
                p16 = 1.5;
                b16 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l16).getCurrentDirection();
                if (targetLocation.equals(l16) || (rc.sensePassability(l16) && !rc.canSenseRobotAtLocation(l16) && currentDirection.equals(Direction.CENTER))) {
                    p16 = rc.senseMapInfo(l16).getCooldownMultiplier(team);
                    b16 = false;
                }
            }
            if (v16 > v25 + p16) {
                v16 = v25 + p16;
                d16 = d25;
            }
            if (v16 > v26 + p16) {
                v16 = v26 + p16;
                d16 = d26;
            }
            
            r16 |= r25;
            r16 |= r26;
            r16 &= !b16;
            o25 |= b16;
            o26 |= b16;
        }
        else {
            o25 |= b16;
            o26 |= b16;
        }

        if (rc.onTheMap(l53) && rc.canSenseLocation(l53)) {
            if (rc.senseCloud(l53)) {
                p53 = 1.5;
                b53 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l53).getCurrentDirection();
                if (targetLocation.equals(l53) || (rc.sensePassability(l53) && !rc.canSenseRobotAtLocation(l53) && currentDirection.equals(Direction.CENTER))) {
                    p53 = rc.senseMapInfo(l53).getCooldownMultiplier(team);
                    b53 = false;
                }
            }
            if (v53 > v45 + p53) {
                v53 = v45 + p53;
                d53 = d45;
            }
            if (v53 > v44 + p53) {
                v53 = v44 + p53;
                d53 = d44;
            }
            if (v53 > v43 + p53) {
                v53 = v43 + p53;
                d53 = d43;
            }
            if (v53 > v52 + p53) {
                v53 = v52 + p53;
                d53 = d52;
            }
            
            r53 |= r45;
            r53 |= r44;
            r53 |= r43;
            r53 |= r52;
            r53 &= !b53;
            o45 |= b53;
            o44 |= b53;
            o43 |= b53;
            o52 |= b53;
        }
        else {
            o45 |= b53;
            o44 |= b53;
            o43 |= b53;
            o52 |= b53;
        }

        if (rc.onTheMap(l27) && rc.canSenseLocation(l27)) {
            if (rc.senseCloud(l27)) {
                p27 = 1.5;
                b27 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l27).getCurrentDirection();
                if (targetLocation.equals(l27) || (rc.sensePassability(l27) && !rc.canSenseRobotAtLocation(l27) && currentDirection.equals(Direction.CENTER))) {
                    p27 = rc.senseMapInfo(l27).getCooldownMultiplier(team);
                    b27 = false;
                }
            }
            if (v27 > v36 + p27) {
                v27 = v36 + p27;
                d27 = d36;
            }
            if (v27 > v17 + p27) {
                v27 = v17 + p27;
                d27 = d17;
            }
            if (v27 > v26 + p27) {
                v27 = v26 + p27;
                d27 = d26;
            }
            if (v27 > v35 + p27) {
                v27 = v35 + p27;
                d27 = d35;
            }
            
            r27 |= r36;
            r27 |= r17;
            r27 |= r26;
            r27 |= r35;
            r27 &= !b27;
            o36 |= b27;
            o17 |= b27;
            o26 |= b27;
            o35 |= b27;
        }
        else {
            o36 |= b27;
            o17 |= b27;
            o26 |= b27;
            o35 |= b27;
        }

        if (rc.onTheMap(l17) && rc.canSenseLocation(l17)) {
            if (rc.senseCloud(l17)) {
                p17 = 1.5;
                b17 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l17).getCurrentDirection();
                if (targetLocation.equals(l17) || (rc.sensePassability(l17) && !rc.canSenseRobotAtLocation(l17) && currentDirection.equals(Direction.CENTER))) {
                    p17 = rc.senseMapInfo(l17).getCooldownMultiplier(team);
                    b17 = false;
                }
            }
            if (v17 > v26 + p17) {
                v17 = v26 + p17;
                d17 = d26;
            }
            if (v17 > v27 + p17) {
                v17 = v27 + p17;
                d17 = d27;
            }
            if (v17 > v16 + p17) {
                v17 = v16 + p17;
                d17 = d16;
            }
            if (v17 > v25 + p17) {
                v17 = v25 + p17;
                d17 = d25;
            }
            
            r17 |= r26;
            r17 |= r27;
            r17 |= r16;
            r17 |= r25;
            r17 &= !b17;
            o26 |= b17;
            o27 |= b17;
            o16 |= b17;
            o25 |= b17;
        }
        else {
            o26 |= b17;
            o27 |= b17;
            o16 |= b17;
            o25 |= b17;
        }

        if (rc.onTheMap(l45) && rc.canSenseLocation(l45)) {
            if (rc.senseCloud(l45)) {
                p45 = 1.5;
                b45 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l45).getCurrentDirection();
                if (targetLocation.equals(l45) || (rc.sensePassability(l45) && !rc.canSenseRobotAtLocation(l45) && currentDirection.equals(Direction.CENTER))) {
                    p45 = rc.senseMapInfo(l45).getCooldownMultiplier(team);
                    b45 = false;
                }
            }
            if (v45 > v36 + p45) {
                v45 = v36 + p45;
                d45 = d36;
            }
            if (v45 > v35 + p45) {
                v45 = v35 + p45;
                d45 = d35;
            }
            if (v45 > v44 + p45) {
                v45 = v44 + p45;
                d45 = d44;
            }
            if (v45 > v53 + p45) {
                v45 = v53 + p45;
                d45 = d53;
            }
            
            r45 |= r36;
            r45 |= r35;
            r45 |= r44;
            r45 |= r53;
            r45 &= !b45;
            o36 |= b45;
            o35 |= b45;
            o44 |= b45;
            o53 |= b45;
        }
        else {
            o36 |= b45;
            o35 |= b45;
            o44 |= b45;
            o53 |= b45;
        }

        if (rc.onTheMap(l18) && rc.canSenseLocation(l18)) {
            if (rc.senseCloud(l18)) {
                p18 = 1.5;
                b18 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l18).getCurrentDirection();
                if (targetLocation.equals(l18) || (rc.sensePassability(l18) && !rc.canSenseRobotAtLocation(l18) && currentDirection.equals(Direction.CENTER))) {
                    p18 = rc.senseMapInfo(l18).getCooldownMultiplier(team);
                    b18 = false;
                }
            }
            if (v18 > v27 + p18) {
                v18 = v27 + p18;
                d18 = d27;
            }
            if (v18 > v17 + p18) {
                v18 = v17 + p18;
                d18 = d17;
            }
            if (v18 > v26 + p18) {
                v18 = v26 + p18;
                d18 = d26;
            }
            
            r18 |= r27;
            r18 |= r17;
            r18 |= r26;
            r18 &= !b18;
            o27 |= b18;
            o17 |= b18;
            o26 |= b18;
        }
        else {
            o27 |= b18;
            o17 |= b18;
            o26 |= b18;
        }

        if (rc.onTheMap(l54) && rc.canSenseLocation(l54)) {
            if (rc.senseCloud(l54)) {
                p54 = 1.5;
                b54 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l54).getCurrentDirection();
                if (targetLocation.equals(l54) || (rc.sensePassability(l54) && !rc.canSenseRobotAtLocation(l54) && currentDirection.equals(Direction.CENTER))) {
                    p54 = rc.senseMapInfo(l54).getCooldownMultiplier(team);
                    b54 = false;
                }
            }
            if (v54 > v45 + p54) {
                v54 = v45 + p54;
                d54 = d45;
            }
            if (v54 > v44 + p54) {
                v54 = v44 + p54;
                d54 = d44;
            }
            if (v54 > v53 + p54) {
                v54 = v53 + p54;
                d54 = d53;
            }
            
            r54 |= r45;
            r54 |= r44;
            r54 |= r53;
            r54 &= !b54;
            o45 |= b54;
            o44 |= b54;
            o53 |= b54;
        }
        else {
            o45 |= b54;
            o44 |= b54;
            o53 |= b54;
        }

        if (rc.onTheMap(l60) && rc.canSenseLocation(l60)) {
            if (rc.senseCloud(l60)) {
                p60 = 1.5;
                b60 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l60).getCurrentDirection();
                if (targetLocation.equals(l60) || (rc.sensePassability(l60) && !rc.canSenseRobotAtLocation(l60) && currentDirection.equals(Direction.CENTER))) {
                    p60 = rc.senseMapInfo(l60).getCooldownMultiplier(team);
                    b60 = false;
                }
            }
            if (v60 > v53 + p60) {
                v60 = v53 + p60;
                d60 = d53;
            }
            if (v60 > v52 + p60) {
                v60 = v52 + p60;
                d60 = d52;
            }
            
            r60 |= r53;
            r60 |= r52;
            r60 &= !b60;
            o53 |= b60;
            o52 |= b60;
        }
        else {
            o53 |= b60;
            o52 |= b60;
        }

        if (rc.onTheMap(l37) && rc.canSenseLocation(l37)) {
            if (rc.senseCloud(l37)) {
                p37 = 1.5;
                b37 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l37).getCurrentDirection();
                if (targetLocation.equals(l37) || (rc.sensePassability(l37) && !rc.canSenseRobotAtLocation(l37) && currentDirection.equals(Direction.CENTER))) {
                    p37 = rc.senseMapInfo(l37).getCooldownMultiplier(team);
                    b37 = false;
                }
            }
            if (v37 > v27 + p37) {
                v37 = v27 + p37;
                d37 = d27;
            }
            if (v37 > v36 + p37) {
                v37 = v36 + p37;
                d37 = d36;
            }
            if (v37 > v45 + p37) {
                v37 = v45 + p37;
                d37 = d45;
            }
            
            r37 |= r27;
            r37 |= r36;
            r37 |= r45;
            r37 &= !b37;
            o27 |= b37;
            o36 |= b37;
            o45 |= b37;
        }
        else {
            o27 |= b37;
            o36 |= b37;
            o45 |= b37;
        }

        if (rc.onTheMap(l8) && rc.canSenseLocation(l8)) {
            if (rc.senseCloud(l8)) {
                p8 = 1.5;
                b8 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l8).getCurrentDirection();
                if (targetLocation.equals(l8) || (rc.sensePassability(l8) && !rc.canSenseRobotAtLocation(l8) && currentDirection.equals(Direction.CENTER))) {
                    p8 = rc.senseMapInfo(l8).getCooldownMultiplier(team);
                    b8 = false;
                }
            }
            if (v8 > v16 + p8) {
                v8 = v16 + p8;
                d8 = d16;
            }
            if (v8 > v17 + p8) {
                v8 = v17 + p8;
                d8 = d17;
            }
            
            r8 |= r16;
            r8 |= r17;
            r8 &= !b8;
            o16 |= b8;
            o17 |= b8;
        }
        else {
            o16 |= b8;
            o17 |= b8;
        }

        if (rc.onTheMap(l61) && rc.canSenseLocation(l61)) {
            if (rc.senseCloud(l61)) {
                p61 = 1.5;
                b61 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l61).getCurrentDirection();
                if (targetLocation.equals(l61) || (rc.sensePassability(l61) && !rc.canSenseRobotAtLocation(l61) && currentDirection.equals(Direction.CENTER))) {
                    p61 = rc.senseMapInfo(l61).getCooldownMultiplier(team);
                    b61 = false;
                }
            }
            if (v61 > v54 + p61) {
                v61 = v54 + p61;
                d61 = d54;
            }
            if (v61 > v53 + p61) {
                v61 = v53 + p61;
                d61 = d53;
            }
            if (v61 > v52 + p61) {
                v61 = v52 + p61;
                d61 = d52;
            }
            if (v61 > v60 + p61) {
                v61 = v60 + p61;
                d61 = d60;
            }
            
            r61 |= r54;
            r61 |= r53;
            r61 |= r52;
            r61 |= r60;
            r61 &= !b61;
            o54 |= b61;
            o53 |= b61;
            o52 |= b61;
            o60 |= b61;
        }
        else {
            o54 |= b61;
            o53 |= b61;
            o52 |= b61;
            o60 |= b61;
        }

        if (rc.onTheMap(l46) && rc.canSenseLocation(l46)) {
            if (rc.senseCloud(l46)) {
                p46 = 1.5;
                b46 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l46).getCurrentDirection();
                if (targetLocation.equals(l46) || (rc.sensePassability(l46) && !rc.canSenseRobotAtLocation(l46) && currentDirection.equals(Direction.CENTER))) {
                    p46 = rc.senseMapInfo(l46).getCooldownMultiplier(team);
                    b46 = false;
                }
            }
            if (v46 > v37 + p46) {
                v46 = v37 + p46;
                d46 = d37;
            }
            if (v46 > v36 + p46) {
                v46 = v36 + p46;
                d46 = d36;
            }
            if (v46 > v45 + p46) {
                v46 = v45 + p46;
                d46 = d45;
            }
            if (v46 > v54 + p46) {
                v46 = v54 + p46;
                d46 = d54;
            }
            
            r46 |= r37;
            r46 |= r36;
            r46 |= r45;
            r46 |= r54;
            r46 &= !b46;
            o37 |= b46;
            o36 |= b46;
            o45 |= b46;
            o54 |= b46;
        }
        else {
            o37 |= b46;
            o36 |= b46;
            o45 |= b46;
            o54 |= b46;
        }

        if (rc.onTheMap(l9) && rc.canSenseLocation(l9)) {
            if (rc.senseCloud(l9)) {
                p9 = 1.5;
                b9 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l9).getCurrentDirection();
                if (targetLocation.equals(l9) || (rc.sensePassability(l9) && !rc.canSenseRobotAtLocation(l9) && currentDirection.equals(Direction.CENTER))) {
                    p9 = rc.senseMapInfo(l9).getCooldownMultiplier(team);
                    b9 = false;
                }
            }
            if (v9 > v17 + p9) {
                v9 = v17 + p9;
                d9 = d17;
            }
            if (v9 > v18 + p9) {
                v9 = v18 + p9;
                d9 = d18;
            }
            if (v9 > v8 + p9) {
                v9 = v8 + p9;
                d9 = d8;
            }
            if (v9 > v16 + p9) {
                v9 = v16 + p9;
                d9 = d16;
            }
            
            r9 |= r17;
            r9 |= r18;
            r9 |= r8;
            r9 |= r16;
            r9 &= !b9;
            o17 |= b9;
            o18 |= b9;
            o8 |= b9;
            o16 |= b9;
        }
        else {
            o17 |= b9;
            o18 |= b9;
            o8 |= b9;
            o16 |= b9;
        }

        if (rc.onTheMap(l28) && rc.canSenseLocation(l28)) {
            if (rc.senseCloud(l28)) {
                p28 = 1.5;
                b28 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l28).getCurrentDirection();
                if (targetLocation.equals(l28) || (rc.sensePassability(l28) && !rc.canSenseRobotAtLocation(l28) && currentDirection.equals(Direction.CENTER))) {
                    p28 = rc.senseMapInfo(l28).getCooldownMultiplier(team);
                    b28 = false;
                }
            }
            if (v28 > v37 + p28) {
                v28 = v37 + p28;
                d28 = d37;
            }
            if (v28 > v18 + p28) {
                v28 = v18 + p28;
                d28 = d18;
            }
            if (v28 > v27 + p28) {
                v28 = v27 + p28;
                d28 = d27;
            }
            if (v28 > v36 + p28) {
                v28 = v36 + p28;
                d28 = d36;
            }
            
            r28 |= r37;
            r28 |= r18;
            r28 |= r27;
            r28 |= r36;
            r28 &= !b28;
            o37 |= b28;
            o18 |= b28;
            o27 |= b28;
            o36 |= b28;
        }
        else {
            o37 |= b28;
            o18 |= b28;
            o27 |= b28;
            o36 |= b28;
        }

        if (rc.onTheMap(l10) && rc.canSenseLocation(l10)) {
            if (rc.senseCloud(l10)) {
                p10 = 1.5;
                b10 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l10).getCurrentDirection();
                if (targetLocation.equals(l10) || (rc.sensePassability(l10) && !rc.canSenseRobotAtLocation(l10) && currentDirection.equals(Direction.CENTER))) {
                    p10 = rc.senseMapInfo(l10).getCooldownMultiplier(team);
                    b10 = false;
                }
            }
            if (v10 > v18 + p10) {
                v10 = v18 + p10;
                d10 = d18;
            }
            if (v10 > v19 + p10) {
                v10 = v19 + p10;
                d10 = d19;
            }
            if (v10 > v9 + p10) {
                v10 = v9 + p10;
                d10 = d9;
            }
            if (v10 > v17 + p10) {
                v10 = v17 + p10;
                d10 = d17;
            }
            
            r10 |= r18;
            r10 |= r19;
            r10 |= r9;
            r10 |= r17;
            r10 &= !b10;
            o18 |= b10;
            o19 |= b10;
            o9 |= b10;
            o17 |= b10;
        }
        else {
            o18 |= b10;
            o19 |= b10;
            o9 |= b10;
            o17 |= b10;
        }

        if (rc.onTheMap(l62) && rc.canSenseLocation(l62)) {
            if (rc.senseCloud(l62)) {
                p62 = 1.5;
                b62 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l62).getCurrentDirection();
                if (targetLocation.equals(l62) || (rc.sensePassability(l62) && !rc.canSenseRobotAtLocation(l62) && currentDirection.equals(Direction.CENTER))) {
                    p62 = rc.senseMapInfo(l62).getCooldownMultiplier(team);
                    b62 = false;
                }
            }
            if (v62 > v55 + p62) {
                v62 = v55 + p62;
                d62 = d55;
            }
            if (v62 > v54 + p62) {
                v62 = v54 + p62;
                d62 = d54;
            }
            if (v62 > v53 + p62) {
                v62 = v53 + p62;
                d62 = d53;
            }
            if (v62 > v61 + p62) {
                v62 = v61 + p62;
                d62 = d61;
            }
            
            r62 |= r55;
            r62 |= r54;
            r62 |= r53;
            r62 |= r61;
            r62 &= !b62;
            o55 |= b62;
            o54 |= b62;
            o53 |= b62;
            o61 |= b62;
        }
        else {
            o55 |= b62;
            o54 |= b62;
            o53 |= b62;
            o61 |= b62;
        }

        if (rc.onTheMap(l55) && rc.canSenseLocation(l55)) {
            if (rc.senseCloud(l55)) {
                p55 = 1.5;
                b55 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l55).getCurrentDirection();
                if (targetLocation.equals(l55) || (rc.sensePassability(l55) && !rc.canSenseRobotAtLocation(l55) && currentDirection.equals(Direction.CENTER))) {
                    p55 = rc.senseMapInfo(l55).getCooldownMultiplier(team);
                    b55 = false;
                }
            }
            if (v55 > v46 + p55) {
                v55 = v46 + p55;
                d55 = d46;
            }
            if (v55 > v45 + p55) {
                v55 = v45 + p55;
                d55 = d45;
            }
            if (v55 > v54 + p55) {
                v55 = v54 + p55;
                d55 = d54;
            }
            if (v55 > v62 + p55) {
                v55 = v62 + p55;
                d55 = d62;
            }
            
            r55 |= r46;
            r55 |= r45;
            r55 |= r54;
            r55 |= r62;
            r55 &= !b55;
            o46 |= b55;
            o45 |= b55;
            o54 |= b55;
            o62 |= b55;
        }
        else {
            o46 |= b55;
            o45 |= b55;
            o54 |= b55;
            o62 |= b55;
        }

        if (rc.onTheMap(l19) && rc.canSenseLocation(l19)) {
            if (rc.senseCloud(l19)) {
                p19 = 1.5;
                b19 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l19).getCurrentDirection();
                if (targetLocation.equals(l19) || (rc.sensePassability(l19) && !rc.canSenseRobotAtLocation(l19) && currentDirection.equals(Direction.CENTER))) {
                    p19 = rc.senseMapInfo(l19).getCooldownMultiplier(team);
                    b19 = false;
                }
            }
            if (v19 > v28 + p19) {
                v19 = v28 + p19;
                d19 = d28;
            }
            if (v19 > v10 + p19) {
                v19 = v10 + p19;
                d19 = d10;
            }
            if (v19 > v18 + p19) {
                v19 = v18 + p19;
                d19 = d18;
            }
            if (v19 > v27 + p19) {
                v19 = v27 + p19;
                d19 = d27;
            }
            
            r19 |= r28;
            r19 |= r10;
            r19 |= r18;
            r19 |= r27;
            r19 &= !b19;
            o28 |= b19;
            o10 |= b19;
            o18 |= b19;
            o27 |= b19;
        }
        else {
            o28 |= b19;
            o10 |= b19;
            o18 |= b19;
            o27 |= b19;
        }

        if (rc.onTheMap(l63) && rc.canSenseLocation(l63)) {
            if (rc.senseCloud(l63)) {
                p63 = 1.5;
                b63 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l63).getCurrentDirection();
                if (targetLocation.equals(l63) || (rc.sensePassability(l63) && !rc.canSenseRobotAtLocation(l63) && currentDirection.equals(Direction.CENTER))) {
                    p63 = rc.senseMapInfo(l63).getCooldownMultiplier(team);
                    b63 = false;
                }
            }
            if (v63 > v55 + p63) {
                v63 = v55 + p63;
                d63 = d55;
            }
            if (v63 > v54 + p63) {
                v63 = v54 + p63;
                d63 = d54;
            }
            if (v63 > v62 + p63) {
                v63 = v62 + p63;
                d63 = d62;
            }
            
            r63 |= r55;
            r63 |= r54;
            r63 |= r62;
            r63 &= !b63;
            o55 |= b63;
            o54 |= b63;
            o62 |= b63;
        }
        else {
            o55 |= b63;
            o54 |= b63;
            o62 |= b63;
        }

        if (rc.onTheMap(l11) && rc.canSenseLocation(l11)) {
            if (rc.senseCloud(l11)) {
                p11 = 1.5;
                b11 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l11).getCurrentDirection();
                if (targetLocation.equals(l11) || (rc.sensePassability(l11) && !rc.canSenseRobotAtLocation(l11) && currentDirection.equals(Direction.CENTER))) {
                    p11 = rc.senseMapInfo(l11).getCooldownMultiplier(team);
                    b11 = false;
                }
            }
            if (v11 > v19 + p11) {
                v11 = v19 + p11;
                d11 = d19;
            }
            if (v11 > v10 + p11) {
                v11 = v10 + p11;
                d11 = d10;
            }
            if (v11 > v18 + p11) {
                v11 = v18 + p11;
                d11 = d18;
            }
            
            r11 |= r19;
            r11 |= r10;
            r11 |= r18;
            r11 &= !b11;
            o19 |= b11;
            o10 |= b11;
            o18 |= b11;
        }
        else {
            o19 |= b11;
            o10 |= b11;
            o18 |= b11;
        }

        if (rc.onTheMap(l2) && rc.canSenseLocation(l2)) {
            if (rc.senseCloud(l2)) {
                p2 = 1.5;
                b2 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l2).getCurrentDirection();
                if (targetLocation.equals(l2) || (rc.sensePassability(l2) && !rc.canSenseRobotAtLocation(l2) && currentDirection.equals(Direction.CENTER))) {
                    p2 = rc.senseMapInfo(l2).getCooldownMultiplier(team);
                    b2 = false;
                }
            }
            if (v2 > v8 + p2) {
                v2 = v8 + p2;
                d2 = d8;
            }
            if (v2 > v9 + p2) {
                v2 = v9 + p2;
                d2 = d9;
            }
            
            r2 |= r8;
            r2 |= r9;
            r2 &= !b2;
            o8 |= b2;
            o9 |= b2;
        }
        else {
            o8 |= b2;
            o9 |= b2;
        }

        if (rc.onTheMap(l66) && rc.canSenseLocation(l66)) {
            if (rc.senseCloud(l66)) {
                p66 = 1.5;
                b66 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l66).getCurrentDirection();
                if (targetLocation.equals(l66) || (rc.sensePassability(l66) && !rc.canSenseRobotAtLocation(l66) && currentDirection.equals(Direction.CENTER))) {
                    p66 = rc.senseMapInfo(l66).getCooldownMultiplier(team);
                    b66 = false;
                }
            }
            if (v66 > v61 + p66) {
                v66 = v61 + p66;
                d66 = d61;
            }
            if (v66 > v60 + p66) {
                v66 = v60 + p66;
                d66 = d60;
            }
            
            r66 |= r61;
            r66 |= r60;
            r66 &= !b66;
            o61 |= b66;
            o60 |= b66;
        }
        else {
            o61 |= b66;
            o60 |= b66;
        }

        if (rc.onTheMap(l38) && rc.canSenseLocation(l38)) {
            if (rc.senseCloud(l38)) {
                p38 = 1.5;
                b38 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l38).getCurrentDirection();
                if (targetLocation.equals(l38) || (rc.sensePassability(l38) && !rc.canSenseRobotAtLocation(l38) && currentDirection.equals(Direction.CENTER))) {
                    p38 = rc.senseMapInfo(l38).getCooldownMultiplier(team);
                    b38 = false;
                }
            }
            if (v38 > v28 + p38) {
                v38 = v28 + p38;
                d38 = d28;
            }
            if (v38 > v37 + p38) {
                v38 = v37 + p38;
                d38 = d37;
            }
            if (v38 > v46 + p38) {
                v38 = v46 + p38;
                d38 = d46;
            }
            
            r38 |= r28;
            r38 |= r37;
            r38 |= r46;
            r38 &= !b38;
            o28 |= b38;
            o37 |= b38;
            o46 |= b38;
        }
        else {
            o28 |= b38;
            o37 |= b38;
            o46 |= b38;
        }

        if (rc.onTheMap(l3) && rc.canSenseLocation(l3)) {
            if (rc.senseCloud(l3)) {
                p3 = 1.5;
                b3 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l3).getCurrentDirection();
                if (targetLocation.equals(l3) || (rc.sensePassability(l3) && !rc.canSenseRobotAtLocation(l3) && currentDirection.equals(Direction.CENTER))) {
                    p3 = rc.senseMapInfo(l3).getCooldownMultiplier(team);
                    b3 = false;
                }
            }
            if (v3 > v9 + p3) {
                v3 = v9 + p3;
                d3 = d9;
            }
            if (v3 > v10 + p3) {
                v3 = v10 + p3;
                d3 = d10;
            }
            if (v3 > v2 + p3) {
                v3 = v2 + p3;
                d3 = d2;
            }
            if (v3 > v8 + p3) {
                v3 = v8 + p3;
                d3 = d8;
            }
            
            r3 |= r9;
            r3 |= r10;
            r3 |= r2;
            r3 |= r8;
            r3 &= !b3;
            o9 |= b3;
            o10 |= b3;
            o2 |= b3;
            o8 |= b3;
        }
        else {
            o9 |= b3;
            o10 |= b3;
            o2 |= b3;
            o8 |= b3;
        }

        if (rc.onTheMap(l47) && rc.canSenseLocation(l47)) {
            if (rc.senseCloud(l47)) {
                p47 = 1.5;
                b47 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l47).getCurrentDirection();
                if (targetLocation.equals(l47) || (rc.sensePassability(l47) && !rc.canSenseRobotAtLocation(l47) && currentDirection.equals(Direction.CENTER))) {
                    p47 = rc.senseMapInfo(l47).getCooldownMultiplier(team);
                    b47 = false;
                }
            }
            if (v47 > v38 + p47) {
                v47 = v38 + p47;
                d47 = d38;
            }
            if (v47 > v37 + p47) {
                v47 = v37 + p47;
                d47 = d37;
            }
            if (v47 > v46 + p47) {
                v47 = v46 + p47;
                d47 = d46;
            }
            if (v47 > v55 + p47) {
                v47 = v55 + p47;
                d47 = d55;
            }
            
            r47 |= r38;
            r47 |= r37;
            r47 |= r46;
            r47 |= r55;
            r47 &= !b47;
            o38 |= b47;
            o37 |= b47;
            o46 |= b47;
            o55 |= b47;
        }
        else {
            o38 |= b47;
            o37 |= b47;
            o46 |= b47;
            o55 |= b47;
        }

        if (rc.onTheMap(l29) && rc.canSenseLocation(l29)) {
            if (rc.senseCloud(l29)) {
                p29 = 1.5;
                b29 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l29).getCurrentDirection();
                if (targetLocation.equals(l29) || (rc.sensePassability(l29) && !rc.canSenseRobotAtLocation(l29) && currentDirection.equals(Direction.CENTER))) {
                    p29 = rc.senseMapInfo(l29).getCooldownMultiplier(team);
                    b29 = false;
                }
            }
            if (v29 > v38 + p29) {
                v29 = v38 + p29;
                d29 = d38;
            }
            if (v29 > v19 + p29) {
                v29 = v19 + p29;
                d29 = d19;
            }
            if (v29 > v28 + p29) {
                v29 = v28 + p29;
                d29 = d28;
            }
            if (v29 > v37 + p29) {
                v29 = v37 + p29;
                d29 = d37;
            }
            
            r29 |= r38;
            r29 |= r19;
            r29 |= r28;
            r29 |= r37;
            r29 &= !b29;
            o38 |= b29;
            o19 |= b29;
            o28 |= b29;
            o37 |= b29;
        }
        else {
            o38 |= b29;
            o19 |= b29;
            o28 |= b29;
            o37 |= b29;
        }

        if (rc.onTheMap(l67) && rc.canSenseLocation(l67)) {
            if (rc.senseCloud(l67)) {
                p67 = 1.5;
                b67 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l67).getCurrentDirection();
                if (targetLocation.equals(l67) || (rc.sensePassability(l67) && !rc.canSenseRobotAtLocation(l67) && currentDirection.equals(Direction.CENTER))) {
                    p67 = rc.senseMapInfo(l67).getCooldownMultiplier(team);
                    b67 = false;
                }
            }
            if (v67 > v62 + p67) {
                v67 = v62 + p67;
                d67 = d62;
            }
            if (v67 > v61 + p67) {
                v67 = v61 + p67;
                d67 = d61;
            }
            if (v67 > v60 + p67) {
                v67 = v60 + p67;
                d67 = d60;
            }
            if (v67 > v66 + p67) {
                v67 = v66 + p67;
                d67 = d66;
            }
            
            r67 |= r62;
            r67 |= r61;
            r67 |= r60;
            r67 |= r66;
            r67 &= !b67;
            o62 |= b67;
            o61 |= b67;
            o60 |= b67;
            o66 |= b67;
        }
        else {
            o62 |= b67;
            o61 |= b67;
            o60 |= b67;
            o66 |= b67;
        }

        if (rc.onTheMap(l68) && rc.canSenseLocation(l68)) {
            if (rc.senseCloud(l68)) {
                p68 = 1.5;
                b68 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l68).getCurrentDirection();
                if (targetLocation.equals(l68) || (rc.sensePassability(l68) && !rc.canSenseRobotAtLocation(l68) && currentDirection.equals(Direction.CENTER))) {
                    p68 = rc.senseMapInfo(l68).getCooldownMultiplier(team);
                    b68 = false;
                }
            }
            if (v68 > v63 + p68) {
                v68 = v63 + p68;
                d68 = d63;
            }
            if (v68 > v62 + p68) {
                v68 = v62 + p68;
                d68 = d62;
            }
            if (v68 > v61 + p68) {
                v68 = v61 + p68;
                d68 = d61;
            }
            if (v68 > v67 + p68) {
                v68 = v67 + p68;
                d68 = d67;
            }
            
            r68 |= r63;
            r68 |= r62;
            r68 |= r61;
            r68 |= r67;
            r68 &= !b68;
            o63 |= b68;
            o62 |= b68;
            o61 |= b68;
            o67 |= b68;
        }
        else {
            o63 |= b68;
            o62 |= b68;
            o61 |= b68;
            o67 |= b68;
        }

        if (rc.onTheMap(l4) && rc.canSenseLocation(l4)) {
            if (rc.senseCloud(l4)) {
                p4 = 1.5;
                b4 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l4).getCurrentDirection();
                if (targetLocation.equals(l4) || (rc.sensePassability(l4) && !rc.canSenseRobotAtLocation(l4) && currentDirection.equals(Direction.CENTER))) {
                    p4 = rc.senseMapInfo(l4).getCooldownMultiplier(team);
                    b4 = false;
                }
            }
            if (v4 > v10 + p4) {
                v4 = v10 + p4;
                d4 = d10;
            }
            if (v4 > v11 + p4) {
                v4 = v11 + p4;
                d4 = d11;
            }
            if (v4 > v3 + p4) {
                v4 = v3 + p4;
                d4 = d3;
            }
            if (v4 > v9 + p4) {
                v4 = v9 + p4;
                d4 = d9;
            }
            
            r4 |= r10;
            r4 |= r11;
            r4 |= r3;
            r4 |= r9;
            r4 &= !b4;
            o10 |= b4;
            o11 |= b4;
            o3 |= b4;
            o9 |= b4;
        }
        else {
            o10 |= b4;
            o11 |= b4;
            o3 |= b4;
            o9 |= b4;
        }

        if (rc.onTheMap(l56) && rc.canSenseLocation(l56)) {
            if (rc.senseCloud(l56)) {
                p56 = 1.5;
                b56 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l56).getCurrentDirection();
                if (targetLocation.equals(l56) || (rc.sensePassability(l56) && !rc.canSenseRobotAtLocation(l56) && currentDirection.equals(Direction.CENTER))) {
                    p56 = rc.senseMapInfo(l56).getCooldownMultiplier(team);
                    b56 = false;
                }
            }
            if (v56 > v47 + p56) {
                v56 = v47 + p56;
                d56 = d47;
            }
            if (v56 > v46 + p56) {
                v56 = v46 + p56;
                d56 = d46;
            }
            if (v56 > v55 + p56) {
                v56 = v55 + p56;
                d56 = d55;
            }
            if (v56 > v63 + p56) {
                v56 = v63 + p56;
                d56 = d63;
            }
            
            r56 |= r47;
            r56 |= r46;
            r56 |= r55;
            r56 |= r63;
            r56 &= !b56;
            o47 |= b56;
            o46 |= b56;
            o55 |= b56;
            o63 |= b56;
        }
        else {
            o47 |= b56;
            o46 |= b56;
            o55 |= b56;
            o63 |= b56;
        }

        if (rc.onTheMap(l20) && rc.canSenseLocation(l20)) {
            if (rc.senseCloud(l20)) {
                p20 = 1.5;
                b20 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l20).getCurrentDirection();
                if (targetLocation.equals(l20) || (rc.sensePassability(l20) && !rc.canSenseRobotAtLocation(l20) && currentDirection.equals(Direction.CENTER))) {
                    p20 = rc.senseMapInfo(l20).getCooldownMultiplier(team);
                    b20 = false;
                }
            }
            if (v20 > v29 + p20) {
                v20 = v29 + p20;
                d20 = d29;
            }
            if (v20 > v11 + p20) {
                v20 = v11 + p20;
                d20 = d11;
            }
            if (v20 > v19 + p20) {
                v20 = v19 + p20;
                d20 = d19;
            }
            if (v20 > v28 + p20) {
                v20 = v28 + p20;
                d20 = d28;
            }
            
            r20 |= r29;
            r20 |= r11;
            r20 |= r19;
            r20 |= r28;
            r20 &= !b20;
            o29 |= b20;
            o11 |= b20;
            o19 |= b20;
            o28 |= b20;
        }
        else {
            o29 |= b20;
            o11 |= b20;
            o19 |= b20;
            o28 |= b20;
        }

        int dx = targetLocation.x - l34.x;
        int dy = targetLocation.y - l34.y;

        switch(dx) {
            case -4:
                switch(dy) {
                    case 0:
                        if (v2 < 10000) {
                            return d2;
                        }
                    case 1:
                        if (v3 < 10000) {
                            return d3;
                        }
                    case 2:
                        if (v4 < 10000) {
                            return d4;
                        }
                } break;

            case -3:
                switch(dy) {
                    case 0:
                        if (v8 < 10000) {
                            return d8;
                        }
                    case 1:
                        if (v9 < 10000) {
                            return d9;
                        }
                    case 2:
                        if (v10 < 10000) {
                            return d10;
                        }
                    case 3:
                        if (v11 < 10000) {
                            return d11;
                        }
                } break;

            case -2:
                switch(dy) {
                    case 0:
                        if (v16 < 10000) {
                            return d16;
                        }
                    case 1:
                        if (v17 < 10000) {
                            return d17;
                        }
                    case 2:
                        if (v18 < 10000) {
                            return d18;
                        }
                    case 3:
                        if (v19 < 10000) {
                            return d19;
                        }
                    case 4:
                        if (v20 < 10000) {
                            return d20;
                        }
                } break;

            case -1:
                switch(dy) {
                    case 0:
                        if (v25 < 10000) {
                            return d25;
                        }
                    case 1:
                        if (v26 < 10000) {
                            return d26;
                        }
                    case 2:
                        if (v27 < 10000) {
                            return d27;
                        }
                    case 3:
                        if (v28 < 10000) {
                            return d28;
                        }
                    case 4:
                        if (v29 < 10000) {
                            return d29;
                        }
                } break;

            case 0:
                switch(dy) {
                    case 0:
                        if (v34 < 10000) {
                            return d34;
                        }
                    case 1:
                        if (v35 < 10000) {
                            return d35;
                        }
                    case 2:
                        if (v36 < 10000) {
                            return d36;
                        }
                    case 3:
                        if (v37 < 10000) {
                            return d37;
                        }
                    case 4:
                        if (v38 < 10000) {
                            return d38;
                        }
                } break;

            case 1:
                switch(dy) {
                    case 0:
                        if (v43 < 10000) {
                            return d43;
                        }
                    case 1:
                        if (v44 < 10000) {
                            return d44;
                        }
                    case 2:
                        if (v45 < 10000) {
                            return d45;
                        }
                    case 3:
                        if (v46 < 10000) {
                            return d46;
                        }
                    case 4:
                        if (v47 < 10000) {
                            return d47;
                        }
                } break;

            case 2:
                switch(dy) {
                    case 0:
                        if (v52 < 10000) {
                            return d52;
                        }
                    case 1:
                        if (v53 < 10000) {
                            return d53;
                        }
                    case 2:
                        if (v54 < 10000) {
                            return d54;
                        }
                    case 3:
                        if (v55 < 10000) {
                            return d55;
                        }
                    case 4:
                        if (v56 < 10000) {
                            return d56;
                        }
                } break;

            case 3:
                switch(dy) {
                    case 0:
                        if (v60 < 10000) {
                            return d60;
                        }
                    case 1:
                        if (v61 < 10000) {
                            return d61;
                        }
                    case 2:
                        if (v62 < 10000) {
                            return d62;
                        }
                    case 3:
                        if (v63 < 10000) {
                            return d63;
                        }
                } break;

            case 4:
                switch(dy) {
                    case 0:
                        if (v66 < 10000) {
                            return d66;
                        }
                    case 1:
                        if (v67 < 10000) {
                            return d67;
                        }
                    case 2:
                        if (v68 < 10000) {
                            return d68;
                        }
                } break;

        }
    
        o2 = r2;
        o3 = r3;
        o4 = r4;
        o11 = r11;
        o20 = r20;
        o29 = r29;
        o38 = r38;
        o47 = r47;
        o56 = r56;
        o63 = r63;
        o66 = r66;
        o67 = r67;
        o68 = r68;
        Direction ans = Direction.CENTER;

        if (r2 && o2) {
            double dist2 = v2 + 1.5 * Math.sqrt(l2.distanceSquaredTo(targetLocation));
            if (dist2 < localBest) {
                localBest = dist2;
                ans = d2;
                best = l2;
            }
        }

        if (r3 && o3) {
            double dist3 = v3 + 1.5 * Math.sqrt(l3.distanceSquaredTo(targetLocation));
            if (dist3 < localBest) {
                localBest = dist3;
                ans = d3;
                best = l3;
            }
        }

        if (r4 && o4) {
            double dist4 = v4 + 1.5 * Math.sqrt(l4.distanceSquaredTo(targetLocation));
            if (dist4 < localBest) {
                localBest = dist4;
                ans = d4;
                best = l4;
            }
        }

        if (r11 && o11) {
            double dist11 = v11 + 1.5 * Math.sqrt(l11.distanceSquaredTo(targetLocation));
            if (dist11 < localBest) {
                localBest = dist11;
                ans = d11;
                best = l11;
            }
        }

        if (r20 && o20) {
            double dist20 = v20 + 1.5 * Math.sqrt(l20.distanceSquaredTo(targetLocation));
            if (dist20 < localBest) {
                localBest = dist20;
                ans = d20;
                best = l20;
            }
        }

        if (r29 && o29) {
            double dist29 = v29 + 1.5 * Math.sqrt(l29.distanceSquaredTo(targetLocation));
            if (dist29 < localBest) {
                localBest = dist29;
                ans = d29;
                best = l29;
            }
        }

        if (r38 && o38) {
            double dist38 = v38 + 1.5 * Math.sqrt(l38.distanceSquaredTo(targetLocation));
            if (dist38 < localBest) {
                localBest = dist38;
                ans = d38;
                best = l38;
            }
        }

        if (r47 && o47) {
            double dist47 = v47 + 1.5 * Math.sqrt(l47.distanceSquaredTo(targetLocation));
            if (dist47 < localBest) {
                localBest = dist47;
                ans = d47;
                best = l47;
            }
        }

        if (r56 && o56) {
            double dist56 = v56 + 1.5 * Math.sqrt(l56.distanceSquaredTo(targetLocation));
            if (dist56 < localBest) {
                localBest = dist56;
                ans = d56;
                best = l56;
            }
        }

        if (r63 && o63) {
            double dist63 = v63 + 1.5 * Math.sqrt(l63.distanceSquaredTo(targetLocation));
            if (dist63 < localBest) {
                localBest = dist63;
                ans = d63;
                best = l63;
            }
        }

        if (r66 && o66) {
            double dist66 = v66 + 1.5 * Math.sqrt(l66.distanceSquaredTo(targetLocation));
            if (dist66 < localBest) {
                localBest = dist66;
                ans = d66;
                best = l66;
            }
        }

        if (r67 && o67) {
            double dist67 = v67 + 1.5 * Math.sqrt(l67.distanceSquaredTo(targetLocation));
            if (dist67 < localBest) {
                localBest = dist67;
                ans = d67;
                best = l67;
            }
        }

        if (r68 && o68) {
            double dist68 = v68 + 1.5 * Math.sqrt(l68.distanceSquaredTo(targetLocation));
            if (dist68 < localBest) {
                localBest = dist68;
                ans = d68;
                best = l68;
            }
        }

        draws0();
        rc.setIndicatorDot(best, 0, 0, 255);
        if (localBest < globalBest) {
            globalBest = localBest;
            return ans;
        }
        return getBestDirectionWallFollow0(ans);
    }

    private Direction getBestDirectionWallFollow0(Direction prev) throws GameActionException {
        Direction ans = Direction.CENTER;
        int minDistance = closestWallLocations.isEmpty() ? 1000000 : currentLocation.distanceSquaredTo(closestWallLocations.get(0));
    
        if (b2) {
            int distance = currentLocation.distanceSquaredTo(l2);
            if (distance == minDistance) {
                closestWallLocations.add(l2);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l2);
                minDistance = distance;
            }
        }

        if (b3) {
            int distance = currentLocation.distanceSquaredTo(l3);
            if (distance == minDistance) {
                closestWallLocations.add(l3);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l3);
                minDistance = distance;
            }
        }

        if (b4) {
            int distance = currentLocation.distanceSquaredTo(l4);
            if (distance == minDistance) {
                closestWallLocations.add(l4);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l4);
                minDistance = distance;
            }
        }

        if (b8) {
            int distance = currentLocation.distanceSquaredTo(l8);
            if (distance == minDistance) {
                closestWallLocations.add(l8);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l8);
                minDistance = distance;
            }
        }

        if (b9) {
            int distance = currentLocation.distanceSquaredTo(l9);
            if (distance == minDistance) {
                closestWallLocations.add(l9);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l9);
                minDistance = distance;
            }
        }

        if (b10) {
            int distance = currentLocation.distanceSquaredTo(l10);
            if (distance == minDistance) {
                closestWallLocations.add(l10);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l10);
                minDistance = distance;
            }
        }

        if (b11) {
            int distance = currentLocation.distanceSquaredTo(l11);
            if (distance == minDistance) {
                closestWallLocations.add(l11);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l11);
                minDistance = distance;
            }
        }

        if (b16) {
            int distance = currentLocation.distanceSquaredTo(l16);
            if (distance == minDistance) {
                closestWallLocations.add(l16);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l16);
                minDistance = distance;
            }
        }

        if (b17) {
            int distance = currentLocation.distanceSquaredTo(l17);
            if (distance == minDistance) {
                closestWallLocations.add(l17);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l17);
                minDistance = distance;
            }
        }

        if (b18) {
            int distance = currentLocation.distanceSquaredTo(l18);
            if (distance == minDistance) {
                closestWallLocations.add(l18);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l18);
                minDistance = distance;
            }
        }

        if (b19) {
            int distance = currentLocation.distanceSquaredTo(l19);
            if (distance == minDistance) {
                closestWallLocations.add(l19);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l19);
                minDistance = distance;
            }
        }

        if (b20) {
            int distance = currentLocation.distanceSquaredTo(l20);
            if (distance == minDistance) {
                closestWallLocations.add(l20);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l20);
                minDistance = distance;
            }
        }

        if (b25) {
            int distance = currentLocation.distanceSquaredTo(l25);
            if (distance == minDistance) {
                closestWallLocations.add(l25);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l25);
                minDistance = distance;
            }
        }

        if (b26) {
            int distance = currentLocation.distanceSquaredTo(l26);
            if (distance == minDistance) {
                closestWallLocations.add(l26);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l26);
                minDistance = distance;
            }
        }

        if (b27) {
            int distance = currentLocation.distanceSquaredTo(l27);
            if (distance == minDistance) {
                closestWallLocations.add(l27);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l27);
                minDistance = distance;
            }
        }

        if (b28) {
            int distance = currentLocation.distanceSquaredTo(l28);
            if (distance == minDistance) {
                closestWallLocations.add(l28);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l28);
                minDistance = distance;
            }
        }

        if (b29) {
            int distance = currentLocation.distanceSquaredTo(l29);
            if (distance == minDistance) {
                closestWallLocations.add(l29);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l29);
                minDistance = distance;
            }
        }

        if (b35) {
            int distance = currentLocation.distanceSquaredTo(l35);
            if (distance == minDistance) {
                closestWallLocations.add(l35);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l35);
                minDistance = distance;
            }
        }

        if (b36) {
            int distance = currentLocation.distanceSquaredTo(l36);
            if (distance == minDistance) {
                closestWallLocations.add(l36);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l36);
                minDistance = distance;
            }
        }

        if (b37) {
            int distance = currentLocation.distanceSquaredTo(l37);
            if (distance == minDistance) {
                closestWallLocations.add(l37);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l37);
                minDistance = distance;
            }
        }

        if (b38) {
            int distance = currentLocation.distanceSquaredTo(l38);
            if (distance == minDistance) {
                closestWallLocations.add(l38);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l38);
                minDistance = distance;
            }
        }

        if (b43) {
            int distance = currentLocation.distanceSquaredTo(l43);
            if (distance == minDistance) {
                closestWallLocations.add(l43);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l43);
                minDistance = distance;
            }
        }

        if (b44) {
            int distance = currentLocation.distanceSquaredTo(l44);
            if (distance == minDistance) {
                closestWallLocations.add(l44);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l44);
                minDistance = distance;
            }
        }

        if (b45) {
            int distance = currentLocation.distanceSquaredTo(l45);
            if (distance == minDistance) {
                closestWallLocations.add(l45);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l45);
                minDistance = distance;
            }
        }

        if (b46) {
            int distance = currentLocation.distanceSquaredTo(l46);
            if (distance == minDistance) {
                closestWallLocations.add(l46);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l46);
                minDistance = distance;
            }
        }

        if (b47) {
            int distance = currentLocation.distanceSquaredTo(l47);
            if (distance == minDistance) {
                closestWallLocations.add(l47);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l47);
                minDistance = distance;
            }
        }

        if (b52) {
            int distance = currentLocation.distanceSquaredTo(l52);
            if (distance == minDistance) {
                closestWallLocations.add(l52);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l52);
                minDistance = distance;
            }
        }

        if (b53) {
            int distance = currentLocation.distanceSquaredTo(l53);
            if (distance == minDistance) {
                closestWallLocations.add(l53);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l53);
                minDistance = distance;
            }
        }

        if (b54) {
            int distance = currentLocation.distanceSquaredTo(l54);
            if (distance == minDistance) {
                closestWallLocations.add(l54);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l54);
                minDistance = distance;
            }
        }

        if (b55) {
            int distance = currentLocation.distanceSquaredTo(l55);
            if (distance == minDistance) {
                closestWallLocations.add(l55);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l55);
                minDistance = distance;
            }
        }

        if (b56) {
            int distance = currentLocation.distanceSquaredTo(l56);
            if (distance == minDistance) {
                closestWallLocations.add(l56);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l56);
                minDistance = distance;
            }
        }

        if (b60) {
            int distance = currentLocation.distanceSquaredTo(l60);
            if (distance == minDistance) {
                closestWallLocations.add(l60);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l60);
                minDistance = distance;
            }
        }

        if (b61) {
            int distance = currentLocation.distanceSquaredTo(l61);
            if (distance == minDistance) {
                closestWallLocations.add(l61);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l61);
                minDistance = distance;
            }
        }

        if (b62) {
            int distance = currentLocation.distanceSquaredTo(l62);
            if (distance == minDistance) {
                closestWallLocations.add(l62);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l62);
                minDistance = distance;
            }
        }

        if (b63) {
            int distance = currentLocation.distanceSquaredTo(l63);
            if (distance == minDistance) {
                closestWallLocations.add(l63);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l63);
                minDistance = distance;
            }
        }

        if (b66) {
            int distance = currentLocation.distanceSquaredTo(l66);
            if (distance == minDistance) {
                closestWallLocations.add(l66);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l66);
                minDistance = distance;
            }
        }

        if (b67) {
            int distance = currentLocation.distanceSquaredTo(l67);
            if (distance == minDistance) {
                closestWallLocations.add(l67);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l67);
                minDistance = distance;
            }
        }

        if (b68) {
            int distance = currentLocation.distanceSquaredTo(l68);
            if (distance == minDistance) {
                closestWallLocations.add(l68);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l68);
                minDistance = distance;
            }
        }

        if (minDistance > 2) { return prev; }
        int maxDot = -999999;
        minDistance = 1000000;
        for (MapLocation closestWallLocation : closestWallLocations) {
            Direction vertical = currentLocation.directionTo(closestWallLocation);

            Direction tangent1 = vertical.rotateLeft().rotateLeft();
            Direction tangent2 = vertical.rotateRight().rotateRight();

            int dx = lastDirection.getDeltaX();
            int dy = lastDirection.getDeltaY();

            int dot1 = tangent1.getDeltaX() * dx + tangent1.getDeltaY() * dy;
            int dot2 = tangent2.getDeltaX() * dx + tangent2.getDeltaY() * dy;

            int distance1 = currentLocation.add(tangent1).distanceSquaredTo(targetLocation);
            int distance2 = currentLocation.add(tangent2).distanceSquaredTo(targetLocation);

            if (!rc.canMove(tangent1)) {
                dot1 = -1000000;
            }

            if (!rc.canMove(tangent2)) {
                dot2 = -1000000;
            }

            if (dot1 > maxDot) {
                maxDot = dot1;
                minDistance = distance1;
                ans = tangent1;
            }

            if (dot2 > maxDot) {
                maxDot = dot2;
                minDistance = distance2;
                ans = tangent2;
            }

            if (dot1 == maxDot && distance1 < minDistance) {
                maxDot = dot1;
                minDistance = distance1;
                ans = tangent1;
            }

            if (dot2 == maxDot && distance2 < minDistance) {
                maxDot = dot2;
                minDistance = distance2;
                ans = tangent2;
            }
        }
        draws0();
        for (MapLocation closestWallLocation : closestWallLocations) {
            rc.setIndicatorDot(closestWallLocation, 255, 0, 0);
        }
        return ans;
    }

    private void draws0() throws GameActionException {
    
        rc.setIndicatorDot(l2, 255, 0, 255);
        if (b2) {
            rc.setIndicatorDot(l2, 255, 255, 255);
        }

        rc.setIndicatorDot(l3, 255, 0, 255);
        if (b3) {
            rc.setIndicatorDot(l3, 255, 255, 255);
        }

        rc.setIndicatorDot(l4, 255, 0, 255);
        if (b4) {
            rc.setIndicatorDot(l4, 255, 255, 255);
        }

        rc.setIndicatorDot(l8, 255, 0, 255);
        if (b8) {
            rc.setIndicatorDot(l8, 255, 255, 255);
        }

        rc.setIndicatorDot(l9, 255, 0, 255);
        if (b9) {
            rc.setIndicatorDot(l9, 255, 255, 255);
        }

        rc.setIndicatorDot(l10, 255, 0, 255);
        if (b10) {
            rc.setIndicatorDot(l10, 255, 255, 255);
        }

        rc.setIndicatorDot(l11, 255, 0, 255);
        if (b11) {
            rc.setIndicatorDot(l11, 255, 255, 255);
        }

        rc.setIndicatorDot(l16, 255, 0, 255);
        if (b16) {
            rc.setIndicatorDot(l16, 255, 255, 255);
        }

        rc.setIndicatorDot(l17, 255, 0, 255);
        if (b17) {
            rc.setIndicatorDot(l17, 255, 255, 255);
        }

        rc.setIndicatorDot(l18, 255, 0, 255);
        if (b18) {
            rc.setIndicatorDot(l18, 255, 255, 255);
        }

        rc.setIndicatorDot(l19, 255, 0, 255);
        if (b19) {
            rc.setIndicatorDot(l19, 255, 255, 255);
        }

        rc.setIndicatorDot(l20, 255, 0, 255);
        if (b20) {
            rc.setIndicatorDot(l20, 255, 255, 255);
        }

        rc.setIndicatorDot(l25, 255, 0, 255);
        if (b25) {
            rc.setIndicatorDot(l25, 255, 255, 255);
        }

        rc.setIndicatorDot(l26, 255, 0, 255);
        if (b26) {
            rc.setIndicatorDot(l26, 255, 255, 255);
        }

        rc.setIndicatorDot(l27, 255, 0, 255);
        if (b27) {
            rc.setIndicatorDot(l27, 255, 255, 255);
        }

        rc.setIndicatorDot(l28, 255, 0, 255);
        if (b28) {
            rc.setIndicatorDot(l28, 255, 255, 255);
        }

        rc.setIndicatorDot(l29, 255, 0, 255);
        if (b29) {
            rc.setIndicatorDot(l29, 255, 255, 255);
        }

        rc.setIndicatorDot(l35, 255, 0, 255);
        if (b35) {
            rc.setIndicatorDot(l35, 255, 255, 255);
        }

        rc.setIndicatorDot(l36, 255, 0, 255);
        if (b36) {
            rc.setIndicatorDot(l36, 255, 255, 255);
        }

        rc.setIndicatorDot(l37, 255, 0, 255);
        if (b37) {
            rc.setIndicatorDot(l37, 255, 255, 255);
        }

        rc.setIndicatorDot(l38, 255, 0, 255);
        if (b38) {
            rc.setIndicatorDot(l38, 255, 255, 255);
        }

        rc.setIndicatorDot(l43, 255, 0, 255);
        if (b43) {
            rc.setIndicatorDot(l43, 255, 255, 255);
        }

        rc.setIndicatorDot(l44, 255, 0, 255);
        if (b44) {
            rc.setIndicatorDot(l44, 255, 255, 255);
        }

        rc.setIndicatorDot(l45, 255, 0, 255);
        if (b45) {
            rc.setIndicatorDot(l45, 255, 255, 255);
        }

        rc.setIndicatorDot(l46, 255, 0, 255);
        if (b46) {
            rc.setIndicatorDot(l46, 255, 255, 255);
        }

        rc.setIndicatorDot(l47, 255, 0, 255);
        if (b47) {
            rc.setIndicatorDot(l47, 255, 255, 255);
        }

        rc.setIndicatorDot(l52, 255, 0, 255);
        if (b52) {
            rc.setIndicatorDot(l52, 255, 255, 255);
        }

        rc.setIndicatorDot(l53, 255, 0, 255);
        if (b53) {
            rc.setIndicatorDot(l53, 255, 255, 255);
        }

        rc.setIndicatorDot(l54, 255, 0, 255);
        if (b54) {
            rc.setIndicatorDot(l54, 255, 255, 255);
        }

        rc.setIndicatorDot(l55, 255, 0, 255);
        if (b55) {
            rc.setIndicatorDot(l55, 255, 255, 255);
        }

        rc.setIndicatorDot(l56, 255, 0, 255);
        if (b56) {
            rc.setIndicatorDot(l56, 255, 255, 255);
        }

        rc.setIndicatorDot(l60, 255, 0, 255);
        if (b60) {
            rc.setIndicatorDot(l60, 255, 255, 255);
        }

        rc.setIndicatorDot(l61, 255, 0, 255);
        if (b61) {
            rc.setIndicatorDot(l61, 255, 255, 255);
        }

        rc.setIndicatorDot(l62, 255, 0, 255);
        if (b62) {
            rc.setIndicatorDot(l62, 255, 255, 255);
        }

        rc.setIndicatorDot(l63, 255, 0, 255);
        if (b63) {
            rc.setIndicatorDot(l63, 255, 255, 255);
        }

        rc.setIndicatorDot(l66, 255, 0, 255);
        if (b66) {
            rc.setIndicatorDot(l66, 255, 255, 255);
        }

        rc.setIndicatorDot(l67, 255, 0, 255);
        if (b67) {
            rc.setIndicatorDot(l67, 255, 255, 255);
        }

        rc.setIndicatorDot(l68, 255, 0, 255);
        if (b68) {
            rc.setIndicatorDot(l68, 255, 255, 255);
        }

    }

    private Direction getBestDirection1() throws GameActionException {
        MapLocation best = currentLocation;
        double localBest = 1000000.0;
        l34 = currentLocation;
        v34 = 0;
        d34 = Direction.CENTER;
        r34 = true;
        l43 = l34.add(Direction.EAST);
        v43 = 1000000;
        p43 = 1000000;
        d43 = null;
        b43 = true;
        r43 = false;
        o43 = false;
        l44 = l34.add(Direction.NORTHEAST);
        v44 = 1000000;
        p44 = 1000000;
        d44 = null;
        b44 = true;
        r44 = false;
        o44 = false;
        l35 = l34.add(Direction.NORTH);
        v35 = 1000000;
        p35 = 1000000;
        d35 = null;
        b35 = true;
        r35 = false;
        o35 = false;
        l26 = l34.add(Direction.NORTHWEST);
        v26 = 1000000;
        p26 = 1000000;
        d26 = null;
        b26 = true;
        r26 = false;
        o26 = false;
        l42 = l34.add(Direction.SOUTHEAST);
        v42 = 1000000;
        p42 = 1000000;
        d42 = null;
        b42 = true;
        r42 = false;
        o42 = false;
        l45 = l35.add(Direction.NORTHEAST);
        v45 = 1000000;
        p45 = 1000000;
        d45 = null;
        b45 = true;
        r45 = false;
        o45 = false;
        l36 = l35.add(Direction.NORTH);
        v36 = 1000000;
        p36 = 1000000;
        d36 = null;
        b36 = true;
        r36 = false;
        o36 = false;
        l27 = l35.add(Direction.NORTHWEST);
        v27 = 1000000;
        p27 = 1000000;
        d27 = null;
        b27 = true;
        r27 = false;
        o27 = false;
        l52 = l43.add(Direction.EAST);
        v52 = 1000000;
        p52 = 1000000;
        d52 = null;
        b52 = true;
        r52 = false;
        o52 = false;
        l53 = l43.add(Direction.NORTHEAST);
        v53 = 1000000;
        p53 = 1000000;
        d53 = null;
        b53 = true;
        r53 = false;
        o53 = false;
        l51 = l43.add(Direction.SOUTHEAST);
        v51 = 1000000;
        p51 = 1000000;
        d51 = null;
        b51 = true;
        r51 = false;
        o51 = false;
        l50 = l42.add(Direction.SOUTHEAST);
        v50 = 1000000;
        p50 = 1000000;
        d50 = null;
        b50 = true;
        r50 = false;
        o50 = false;
        l54 = l44.add(Direction.NORTHEAST);
        v54 = 1000000;
        p54 = 1000000;
        d54 = null;
        b54 = true;
        r54 = false;
        o54 = false;
        l18 = l26.add(Direction.NORTHWEST);
        v18 = 1000000;
        p18 = 1000000;
        d18 = null;
        b18 = true;
        r18 = false;
        o18 = false;
        l46 = l36.add(Direction.NORTHEAST);
        v46 = 1000000;
        p46 = 1000000;
        d46 = null;
        b46 = true;
        r46 = false;
        o46 = false;
        l37 = l36.add(Direction.NORTH);
        v37 = 1000000;
        p37 = 1000000;
        d37 = null;
        b37 = true;
        r37 = false;
        o37 = false;
        l28 = l36.add(Direction.NORTHWEST);
        v28 = 1000000;
        p28 = 1000000;
        d28 = null;
        b28 = true;
        r28 = false;
        o28 = false;
        l60 = l52.add(Direction.EAST);
        v60 = 1000000;
        p60 = 1000000;
        d60 = null;
        b60 = true;
        r60 = false;
        o60 = false;
        l61 = l52.add(Direction.NORTHEAST);
        v61 = 1000000;
        p61 = 1000000;
        d61 = null;
        b61 = true;
        r61 = false;
        o61 = false;
        l59 = l52.add(Direction.SOUTHEAST);
        v59 = 1000000;
        p59 = 1000000;
        d59 = null;
        b59 = true;
        r59 = false;
        o59 = false;
        l62 = l53.add(Direction.NORTHEAST);
        v62 = 1000000;
        p62 = 1000000;
        d62 = null;
        b62 = true;
        r62 = false;
        o62 = false;
        l58 = l51.add(Direction.SOUTHEAST);
        v58 = 1000000;
        p58 = 1000000;
        d58 = null;
        b58 = true;
        r58 = false;
        o58 = false;
        l19 = l27.add(Direction.NORTHWEST);
        v19 = 1000000;
        p19 = 1000000;
        d19 = null;
        b19 = true;
        r19 = false;
        o19 = false;
        l55 = l45.add(Direction.NORTHEAST);
        v55 = 1000000;
        p55 = 1000000;
        d55 = null;
        b55 = true;
        r55 = false;
        o55 = false;
        l11 = l18.add(Direction.NORTHWEST);
        v11 = 1000000;
        p11 = 1000000;
        d11 = null;
        b11 = true;
        r11 = false;
        o11 = false;
        l57 = l50.add(Direction.SOUTHEAST);
        v57 = 1000000;
        p57 = 1000000;
        d57 = null;
        b57 = true;
        r57 = false;
        o57 = false;
        l63 = l54.add(Direction.NORTHEAST);
        v63 = 1000000;
        p63 = 1000000;
        d63 = null;
        b63 = true;
        r63 = false;
        o63 = false;
        l47 = l37.add(Direction.NORTHEAST);
        v47 = 1000000;
        p47 = 1000000;
        d47 = null;
        b47 = true;
        r47 = false;
        o47 = false;
        l38 = l37.add(Direction.NORTH);
        v38 = 1000000;
        p38 = 1000000;
        d38 = null;
        b38 = true;
        r38 = false;
        o38 = false;
        l29 = l37.add(Direction.NORTHWEST);
        v29 = 1000000;
        p29 = 1000000;
        d29 = null;
        b29 = true;
        r29 = false;
        o29 = false;
        l66 = l60.add(Direction.EAST);
        v66 = 1000000;
        p66 = 1000000;
        d66 = null;
        b66 = true;
        r66 = false;
        o66 = false;
        l67 = l60.add(Direction.NORTHEAST);
        v67 = 1000000;
        p67 = 1000000;
        d67 = null;
        b67 = true;
        r67 = false;
        o67 = false;
        l65 = l60.add(Direction.SOUTHEAST);
        v65 = 1000000;
        p65 = 1000000;
        d65 = null;
        b65 = true;
        r65 = false;
        o65 = false;
        l64 = l59.add(Direction.SOUTHEAST);
        v64 = 1000000;
        p64 = 1000000;
        d64 = null;
        b64 = true;
        r64 = false;
        o64 = false;
        l20 = l28.add(Direction.NORTHWEST);
        v20 = 1000000;
        p20 = 1000000;
        d20 = null;
        b20 = true;
        r20 = false;
        o20 = false;
        l56 = l46.add(Direction.NORTHEAST);
        v56 = 1000000;
        p56 = 1000000;
        d56 = null;
        b56 = true;
        r56 = false;
        o56 = false;
        l68 = l61.add(Direction.NORTHEAST);
        v68 = 1000000;
        p68 = 1000000;
        d68 = null;
        b68 = true;
        r68 = false;
        o68 = false;
    
        if (rc.onTheMap(l35) && rc.canSenseLocation(l35)) {
            if (rc.senseCloud(l35)) {
                p35 = 1.5;
                b35 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l35).getCurrentDirection();
                if (targetLocation.equals(l35) || (rc.sensePassability(l35) && !rc.canSenseRobotAtLocation(l35) && currentDirection.equals(Direction.CENTER))) {
                    p35 = rc.senseMapInfo(l35).getCooldownMultiplier(team);
                    b35 = false;
                }
            }
            if (v35 > v34 + p35) {
                v35 = v34 + p35;
                d35 = Direction.NORTH;
            }
            if (v35 > v43 + p35) {
                v35 = v43 + p35;
                d35 = d43;
            }
            
            r35 |= r34;
            r35 |= r43;
            r35 &= !b35;
            o43 |= b35;
        }
        else {
            o43 |= b35;
        }

        if (rc.onTheMap(l43) && rc.canSenseLocation(l43)) {
            if (rc.senseCloud(l43)) {
                p43 = 1.5;
                b43 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l43).getCurrentDirection();
                if (targetLocation.equals(l43) || (rc.sensePassability(l43) && !rc.canSenseRobotAtLocation(l43) && currentDirection.equals(Direction.CENTER))) {
                    p43 = rc.senseMapInfo(l43).getCooldownMultiplier(team);
                    b43 = false;
                }
            }
            if (v43 > v35 + p43) {
                v43 = v35 + p43;
                d43 = d35;
            }
            if (v43 > v34 + p43) {
                v43 = v34 + p43;
                d43 = Direction.EAST;
            }
            
            r43 |= r35;
            r43 |= r34;
            r43 &= !b43;
            o35 |= b43;
        }
        else {
            o35 |= b43;
        }

        if (rc.onTheMap(l42) && rc.canSenseLocation(l42)) {
            if (rc.senseCloud(l42)) {
                p42 = 1.5;
                b42 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l42).getCurrentDirection();
                if (targetLocation.equals(l42) || (rc.sensePassability(l42) && !rc.canSenseRobotAtLocation(l42) && currentDirection.equals(Direction.CENTER))) {
                    p42 = rc.senseMapInfo(l42).getCooldownMultiplier(team);
                    b42 = false;
                }
            }
            if (v42 > v43 + p42) {
                v42 = v43 + p42;
                d42 = d43;
            }
            if (v42 > v34 + p42) {
                v42 = v34 + p42;
                d42 = Direction.SOUTHEAST;
            }
            
            r42 |= r43;
            r42 |= r34;
            r42 &= !b42;
            o43 |= b42;
        }
        else {
            o43 |= b42;
        }

        if (rc.onTheMap(l44) && rc.canSenseLocation(l44)) {
            if (rc.senseCloud(l44)) {
                p44 = 1.5;
                b44 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l44).getCurrentDirection();
                if (targetLocation.equals(l44) || (rc.sensePassability(l44) && !rc.canSenseRobotAtLocation(l44) && currentDirection.equals(Direction.CENTER))) {
                    p44 = rc.senseMapInfo(l44).getCooldownMultiplier(team);
                    b44 = false;
                }
            }
            if (v44 > v35 + p44) {
                v44 = v35 + p44;
                d44 = d35;
            }
            if (v44 > v34 + p44) {
                v44 = v34 + p44;
                d44 = Direction.NORTHEAST;
            }
            if (v44 > v43 + p44) {
                v44 = v43 + p44;
                d44 = d43;
            }
            
            r44 |= r35;
            r44 |= r34;
            r44 |= r43;
            r44 &= !b44;
            o35 |= b44;
            o43 |= b44;
        }
        else {
            o35 |= b44;
            o43 |= b44;
        }

        if (rc.onTheMap(l26) && rc.canSenseLocation(l26)) {
            if (rc.senseCloud(l26)) {
                p26 = 1.5;
                b26 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l26).getCurrentDirection();
                if (targetLocation.equals(l26) || (rc.sensePassability(l26) && !rc.canSenseRobotAtLocation(l26) && currentDirection.equals(Direction.CENTER))) {
                    p26 = rc.senseMapInfo(l26).getCooldownMultiplier(team);
                    b26 = false;
                }
            }
            if (v26 > v35 + p26) {
                v26 = v35 + p26;
                d26 = d35;
            }
            if (v26 > v34 + p26) {
                v26 = v34 + p26;
                d26 = Direction.NORTHWEST;
            }
            
            r26 |= r35;
            r26 |= r34;
            r26 &= !b26;
            o35 |= b26;
        }
        else {
            o35 |= b26;
        }

        if (rc.onTheMap(l36) && rc.canSenseLocation(l36)) {
            if (rc.senseCloud(l36)) {
                p36 = 1.5;
                b36 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l36).getCurrentDirection();
                if (targetLocation.equals(l36) || (rc.sensePassability(l36) && !rc.canSenseRobotAtLocation(l36) && currentDirection.equals(Direction.CENTER))) {
                    p36 = rc.senseMapInfo(l36).getCooldownMultiplier(team);
                    b36 = false;
                }
            }
            if (v36 > v26 + p36) {
                v36 = v26 + p36;
                d36 = d26;
            }
            if (v36 > v35 + p36) {
                v36 = v35 + p36;
                d36 = d35;
            }
            if (v36 > v44 + p36) {
                v36 = v44 + p36;
                d36 = d44;
            }
            
            r36 |= r26;
            r36 |= r35;
            r36 |= r44;
            r36 &= !b36;
            o26 |= b36;
            o35 |= b36;
            o44 |= b36;
        }
        else {
            o26 |= b36;
            o35 |= b36;
            o44 |= b36;
        }

        if (rc.onTheMap(l52) && rc.canSenseLocation(l52)) {
            if (rc.senseCloud(l52)) {
                p52 = 1.5;
                b52 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l52).getCurrentDirection();
                if (targetLocation.equals(l52) || (rc.sensePassability(l52) && !rc.canSenseRobotAtLocation(l52) && currentDirection.equals(Direction.CENTER))) {
                    p52 = rc.senseMapInfo(l52).getCooldownMultiplier(team);
                    b52 = false;
                }
            }
            if (v52 > v44 + p52) {
                v52 = v44 + p52;
                d52 = d44;
            }
            if (v52 > v43 + p52) {
                v52 = v43 + p52;
                d52 = d43;
            }
            if (v52 > v42 + p52) {
                v52 = v42 + p52;
                d52 = d42;
            }
            
            r52 |= r44;
            r52 |= r43;
            r52 |= r42;
            r52 &= !b52;
            o44 |= b52;
            o43 |= b52;
            o42 |= b52;
        }
        else {
            o44 |= b52;
            o43 |= b52;
            o42 |= b52;
        }

        if (rc.onTheMap(l53) && rc.canSenseLocation(l53)) {
            if (rc.senseCloud(l53)) {
                p53 = 1.5;
                b53 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l53).getCurrentDirection();
                if (targetLocation.equals(l53) || (rc.sensePassability(l53) && !rc.canSenseRobotAtLocation(l53) && currentDirection.equals(Direction.CENTER))) {
                    p53 = rc.senseMapInfo(l53).getCooldownMultiplier(team);
                    b53 = false;
                }
            }
            if (v53 > v45 + p53) {
                v53 = v45 + p53;
                d53 = d45;
            }
            if (v53 > v44 + p53) {
                v53 = v44 + p53;
                d53 = d44;
            }
            if (v53 > v43 + p53) {
                v53 = v43 + p53;
                d53 = d43;
            }
            if (v53 > v52 + p53) {
                v53 = v52 + p53;
                d53 = d52;
            }
            
            r53 |= r45;
            r53 |= r44;
            r53 |= r43;
            r53 |= r52;
            r53 &= !b53;
            o45 |= b53;
            o44 |= b53;
            o43 |= b53;
            o52 |= b53;
        }
        else {
            o45 |= b53;
            o44 |= b53;
            o43 |= b53;
            o52 |= b53;
        }

        if (rc.onTheMap(l51) && rc.canSenseLocation(l51)) {
            if (rc.senseCloud(l51)) {
                p51 = 1.5;
                b51 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l51).getCurrentDirection();
                if (targetLocation.equals(l51) || (rc.sensePassability(l51) && !rc.canSenseRobotAtLocation(l51) && currentDirection.equals(Direction.CENTER))) {
                    p51 = rc.senseMapInfo(l51).getCooldownMultiplier(team);
                    b51 = false;
                }
            }
            if (v51 > v52 + p51) {
                v51 = v52 + p51;
                d51 = d52;
            }
            if (v51 > v43 + p51) {
                v51 = v43 + p51;
                d51 = d43;
            }
            if (v51 > v42 + p51) {
                v51 = v42 + p51;
                d51 = d42;
            }
            
            r51 |= r52;
            r51 |= r43;
            r51 |= r42;
            r51 &= !b51;
            o52 |= b51;
            o43 |= b51;
            o42 |= b51;
        }
        else {
            o52 |= b51;
            o43 |= b51;
            o42 |= b51;
        }

        if (rc.onTheMap(l27) && rc.canSenseLocation(l27)) {
            if (rc.senseCloud(l27)) {
                p27 = 1.5;
                b27 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l27).getCurrentDirection();
                if (targetLocation.equals(l27) || (rc.sensePassability(l27) && !rc.canSenseRobotAtLocation(l27) && currentDirection.equals(Direction.CENTER))) {
                    p27 = rc.senseMapInfo(l27).getCooldownMultiplier(team);
                    b27 = false;
                }
            }
            if (v27 > v36 + p27) {
                v27 = v36 + p27;
                d27 = d36;
            }
            if (v27 > v26 + p27) {
                v27 = v26 + p27;
                d27 = d26;
            }
            if (v27 > v35 + p27) {
                v27 = v35 + p27;
                d27 = d35;
            }
            
            r27 |= r36;
            r27 |= r26;
            r27 |= r35;
            r27 &= !b27;
            o36 |= b27;
            o26 |= b27;
            o35 |= b27;
        }
        else {
            o36 |= b27;
            o26 |= b27;
            o35 |= b27;
        }

        if (rc.onTheMap(l45) && rc.canSenseLocation(l45)) {
            if (rc.senseCloud(l45)) {
                p45 = 1.5;
                b45 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l45).getCurrentDirection();
                if (targetLocation.equals(l45) || (rc.sensePassability(l45) && !rc.canSenseRobotAtLocation(l45) && currentDirection.equals(Direction.CENTER))) {
                    p45 = rc.senseMapInfo(l45).getCooldownMultiplier(team);
                    b45 = false;
                }
            }
            if (v45 > v36 + p45) {
                v45 = v36 + p45;
                d45 = d36;
            }
            if (v45 > v35 + p45) {
                v45 = v35 + p45;
                d45 = d35;
            }
            if (v45 > v44 + p45) {
                v45 = v44 + p45;
                d45 = d44;
            }
            if (v45 > v53 + p45) {
                v45 = v53 + p45;
                d45 = d53;
            }
            
            r45 |= r36;
            r45 |= r35;
            r45 |= r44;
            r45 |= r53;
            r45 &= !b45;
            o36 |= b45;
            o35 |= b45;
            o44 |= b45;
            o53 |= b45;
        }
        else {
            o36 |= b45;
            o35 |= b45;
            o44 |= b45;
            o53 |= b45;
        }

        if (rc.onTheMap(l18) && rc.canSenseLocation(l18)) {
            if (rc.senseCloud(l18)) {
                p18 = 1.5;
                b18 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l18).getCurrentDirection();
                if (targetLocation.equals(l18) || (rc.sensePassability(l18) && !rc.canSenseRobotAtLocation(l18) && currentDirection.equals(Direction.CENTER))) {
                    p18 = rc.senseMapInfo(l18).getCooldownMultiplier(team);
                    b18 = false;
                }
            }
            if (v18 > v27 + p18) {
                v18 = v27 + p18;
                d18 = d27;
            }
            if (v18 > v26 + p18) {
                v18 = v26 + p18;
                d18 = d26;
            }
            
            r18 |= r27;
            r18 |= r26;
            r18 &= !b18;
            o27 |= b18;
            o26 |= b18;
        }
        else {
            o27 |= b18;
            o26 |= b18;
        }

        if (rc.onTheMap(l50) && rc.canSenseLocation(l50)) {
            if (rc.senseCloud(l50)) {
                p50 = 1.5;
                b50 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l50).getCurrentDirection();
                if (targetLocation.equals(l50) || (rc.sensePassability(l50) && !rc.canSenseRobotAtLocation(l50) && currentDirection.equals(Direction.CENTER))) {
                    p50 = rc.senseMapInfo(l50).getCooldownMultiplier(team);
                    b50 = false;
                }
            }
            if (v50 > v51 + p50) {
                v50 = v51 + p50;
                d50 = d51;
            }
            if (v50 > v42 + p50) {
                v50 = v42 + p50;
                d50 = d42;
            }
            
            r50 |= r51;
            r50 |= r42;
            r50 &= !b50;
            o51 |= b50;
            o42 |= b50;
        }
        else {
            o51 |= b50;
            o42 |= b50;
        }

        if (rc.onTheMap(l54) && rc.canSenseLocation(l54)) {
            if (rc.senseCloud(l54)) {
                p54 = 1.5;
                b54 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l54).getCurrentDirection();
                if (targetLocation.equals(l54) || (rc.sensePassability(l54) && !rc.canSenseRobotAtLocation(l54) && currentDirection.equals(Direction.CENTER))) {
                    p54 = rc.senseMapInfo(l54).getCooldownMultiplier(team);
                    b54 = false;
                }
            }
            if (v54 > v45 + p54) {
                v54 = v45 + p54;
                d54 = d45;
            }
            if (v54 > v44 + p54) {
                v54 = v44 + p54;
                d54 = d44;
            }
            if (v54 > v53 + p54) {
                v54 = v53 + p54;
                d54 = d53;
            }
            
            r54 |= r45;
            r54 |= r44;
            r54 |= r53;
            r54 &= !b54;
            o45 |= b54;
            o44 |= b54;
            o53 |= b54;
        }
        else {
            o45 |= b54;
            o44 |= b54;
            o53 |= b54;
        }

        if (rc.onTheMap(l37) && rc.canSenseLocation(l37)) {
            if (rc.senseCloud(l37)) {
                p37 = 1.5;
                b37 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l37).getCurrentDirection();
                if (targetLocation.equals(l37) || (rc.sensePassability(l37) && !rc.canSenseRobotAtLocation(l37) && currentDirection.equals(Direction.CENTER))) {
                    p37 = rc.senseMapInfo(l37).getCooldownMultiplier(team);
                    b37 = false;
                }
            }
            if (v37 > v27 + p37) {
                v37 = v27 + p37;
                d37 = d27;
            }
            if (v37 > v36 + p37) {
                v37 = v36 + p37;
                d37 = d36;
            }
            if (v37 > v45 + p37) {
                v37 = v45 + p37;
                d37 = d45;
            }
            
            r37 |= r27;
            r37 |= r36;
            r37 |= r45;
            r37 &= !b37;
            o27 |= b37;
            o36 |= b37;
            o45 |= b37;
        }
        else {
            o27 |= b37;
            o36 |= b37;
            o45 |= b37;
        }

        if (rc.onTheMap(l60) && rc.canSenseLocation(l60)) {
            if (rc.senseCloud(l60)) {
                p60 = 1.5;
                b60 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l60).getCurrentDirection();
                if (targetLocation.equals(l60) || (rc.sensePassability(l60) && !rc.canSenseRobotAtLocation(l60) && currentDirection.equals(Direction.CENTER))) {
                    p60 = rc.senseMapInfo(l60).getCooldownMultiplier(team);
                    b60 = false;
                }
            }
            if (v60 > v53 + p60) {
                v60 = v53 + p60;
                d60 = d53;
            }
            if (v60 > v52 + p60) {
                v60 = v52 + p60;
                d60 = d52;
            }
            if (v60 > v51 + p60) {
                v60 = v51 + p60;
                d60 = d51;
            }
            
            r60 |= r53;
            r60 |= r52;
            r60 |= r51;
            r60 &= !b60;
            o53 |= b60;
            o52 |= b60;
            o51 |= b60;
        }
        else {
            o53 |= b60;
            o52 |= b60;
            o51 |= b60;
        }

        if (rc.onTheMap(l59) && rc.canSenseLocation(l59)) {
            if (rc.senseCloud(l59)) {
                p59 = 1.5;
                b59 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l59).getCurrentDirection();
                if (targetLocation.equals(l59) || (rc.sensePassability(l59) && !rc.canSenseRobotAtLocation(l59) && currentDirection.equals(Direction.CENTER))) {
                    p59 = rc.senseMapInfo(l59).getCooldownMultiplier(team);
                    b59 = false;
                }
            }
            if (v59 > v60 + p59) {
                v59 = v60 + p59;
                d59 = d60;
            }
            if (v59 > v52 + p59) {
                v59 = v52 + p59;
                d59 = d52;
            }
            if (v59 > v51 + p59) {
                v59 = v51 + p59;
                d59 = d51;
            }
            if (v59 > v50 + p59) {
                v59 = v50 + p59;
                d59 = d50;
            }
            
            r59 |= r60;
            r59 |= r52;
            r59 |= r51;
            r59 |= r50;
            r59 &= !b59;
            o60 |= b59;
            o52 |= b59;
            o51 |= b59;
            o50 |= b59;
        }
        else {
            o60 |= b59;
            o52 |= b59;
            o51 |= b59;
            o50 |= b59;
        }

        if (rc.onTheMap(l28) && rc.canSenseLocation(l28)) {
            if (rc.senseCloud(l28)) {
                p28 = 1.5;
                b28 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l28).getCurrentDirection();
                if (targetLocation.equals(l28) || (rc.sensePassability(l28) && !rc.canSenseRobotAtLocation(l28) && currentDirection.equals(Direction.CENTER))) {
                    p28 = rc.senseMapInfo(l28).getCooldownMultiplier(team);
                    b28 = false;
                }
            }
            if (v28 > v37 + p28) {
                v28 = v37 + p28;
                d28 = d37;
            }
            if (v28 > v18 + p28) {
                v28 = v18 + p28;
                d28 = d18;
            }
            if (v28 > v27 + p28) {
                v28 = v27 + p28;
                d28 = d27;
            }
            if (v28 > v36 + p28) {
                v28 = v36 + p28;
                d28 = d36;
            }
            
            r28 |= r37;
            r28 |= r18;
            r28 |= r27;
            r28 |= r36;
            r28 &= !b28;
            o37 |= b28;
            o18 |= b28;
            o27 |= b28;
            o36 |= b28;
        }
        else {
            o37 |= b28;
            o18 |= b28;
            o27 |= b28;
            o36 |= b28;
        }

        if (rc.onTheMap(l46) && rc.canSenseLocation(l46)) {
            if (rc.senseCloud(l46)) {
                p46 = 1.5;
                b46 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l46).getCurrentDirection();
                if (targetLocation.equals(l46) || (rc.sensePassability(l46) && !rc.canSenseRobotAtLocation(l46) && currentDirection.equals(Direction.CENTER))) {
                    p46 = rc.senseMapInfo(l46).getCooldownMultiplier(team);
                    b46 = false;
                }
            }
            if (v46 > v37 + p46) {
                v46 = v37 + p46;
                d46 = d37;
            }
            if (v46 > v36 + p46) {
                v46 = v36 + p46;
                d46 = d36;
            }
            if (v46 > v45 + p46) {
                v46 = v45 + p46;
                d46 = d45;
            }
            if (v46 > v54 + p46) {
                v46 = v54 + p46;
                d46 = d54;
            }
            
            r46 |= r37;
            r46 |= r36;
            r46 |= r45;
            r46 |= r54;
            r46 &= !b46;
            o37 |= b46;
            o36 |= b46;
            o45 |= b46;
            o54 |= b46;
        }
        else {
            o37 |= b46;
            o36 |= b46;
            o45 |= b46;
            o54 |= b46;
        }

        if (rc.onTheMap(l61) && rc.canSenseLocation(l61)) {
            if (rc.senseCloud(l61)) {
                p61 = 1.5;
                b61 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l61).getCurrentDirection();
                if (targetLocation.equals(l61) || (rc.sensePassability(l61) && !rc.canSenseRobotAtLocation(l61) && currentDirection.equals(Direction.CENTER))) {
                    p61 = rc.senseMapInfo(l61).getCooldownMultiplier(team);
                    b61 = false;
                }
            }
            if (v61 > v54 + p61) {
                v61 = v54 + p61;
                d61 = d54;
            }
            if (v61 > v53 + p61) {
                v61 = v53 + p61;
                d61 = d53;
            }
            if (v61 > v52 + p61) {
                v61 = v52 + p61;
                d61 = d52;
            }
            if (v61 > v60 + p61) {
                v61 = v60 + p61;
                d61 = d60;
            }
            
            r61 |= r54;
            r61 |= r53;
            r61 |= r52;
            r61 |= r60;
            r61 &= !b61;
            o54 |= b61;
            o53 |= b61;
            o52 |= b61;
            o60 |= b61;
        }
        else {
            o54 |= b61;
            o53 |= b61;
            o52 |= b61;
            o60 |= b61;
        }

        if (rc.onTheMap(l62) && rc.canSenseLocation(l62)) {
            if (rc.senseCloud(l62)) {
                p62 = 1.5;
                b62 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l62).getCurrentDirection();
                if (targetLocation.equals(l62) || (rc.sensePassability(l62) && !rc.canSenseRobotAtLocation(l62) && currentDirection.equals(Direction.CENTER))) {
                    p62 = rc.senseMapInfo(l62).getCooldownMultiplier(team);
                    b62 = false;
                }
            }
            if (v62 > v55 + p62) {
                v62 = v55 + p62;
                d62 = d55;
            }
            if (v62 > v54 + p62) {
                v62 = v54 + p62;
                d62 = d54;
            }
            if (v62 > v53 + p62) {
                v62 = v53 + p62;
                d62 = d53;
            }
            if (v62 > v61 + p62) {
                v62 = v61 + p62;
                d62 = d61;
            }
            
            r62 |= r55;
            r62 |= r54;
            r62 |= r53;
            r62 |= r61;
            r62 &= !b62;
            o55 |= b62;
            o54 |= b62;
            o53 |= b62;
            o61 |= b62;
        }
        else {
            o55 |= b62;
            o54 |= b62;
            o53 |= b62;
            o61 |= b62;
        }

        if (rc.onTheMap(l58) && rc.canSenseLocation(l58)) {
            if (rc.senseCloud(l58)) {
                p58 = 1.5;
                b58 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l58).getCurrentDirection();
                if (targetLocation.equals(l58) || (rc.sensePassability(l58) && !rc.canSenseRobotAtLocation(l58) && currentDirection.equals(Direction.CENTER))) {
                    p58 = rc.senseMapInfo(l58).getCooldownMultiplier(team);
                    b58 = false;
                }
            }
            if (v58 > v59 + p58) {
                v58 = v59 + p58;
                d58 = d59;
            }
            if (v58 > v51 + p58) {
                v58 = v51 + p58;
                d58 = d51;
            }
            if (v58 > v50 + p58) {
                v58 = v50 + p58;
                d58 = d50;
            }
            
            r58 |= r59;
            r58 |= r51;
            r58 |= r50;
            r58 &= !b58;
            o59 |= b58;
            o51 |= b58;
            o50 |= b58;
        }
        else {
            o59 |= b58;
            o51 |= b58;
            o50 |= b58;
        }

        if (rc.onTheMap(l19) && rc.canSenseLocation(l19)) {
            if (rc.senseCloud(l19)) {
                p19 = 1.5;
                b19 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l19).getCurrentDirection();
                if (targetLocation.equals(l19) || (rc.sensePassability(l19) && !rc.canSenseRobotAtLocation(l19) && currentDirection.equals(Direction.CENTER))) {
                    p19 = rc.senseMapInfo(l19).getCooldownMultiplier(team);
                    b19 = false;
                }
            }
            if (v19 > v28 + p19) {
                v19 = v28 + p19;
                d19 = d28;
            }
            if (v19 > v18 + p19) {
                v19 = v18 + p19;
                d19 = d18;
            }
            if (v19 > v27 + p19) {
                v19 = v27 + p19;
                d19 = d27;
            }
            
            r19 |= r28;
            r19 |= r18;
            r19 |= r27;
            r19 &= !b19;
            o28 |= b19;
            o18 |= b19;
            o27 |= b19;
        }
        else {
            o28 |= b19;
            o18 |= b19;
            o27 |= b19;
        }

        if (rc.onTheMap(l55) && rc.canSenseLocation(l55)) {
            if (rc.senseCloud(l55)) {
                p55 = 1.5;
                b55 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l55).getCurrentDirection();
                if (targetLocation.equals(l55) || (rc.sensePassability(l55) && !rc.canSenseRobotAtLocation(l55) && currentDirection.equals(Direction.CENTER))) {
                    p55 = rc.senseMapInfo(l55).getCooldownMultiplier(team);
                    b55 = false;
                }
            }
            if (v55 > v46 + p55) {
                v55 = v46 + p55;
                d55 = d46;
            }
            if (v55 > v45 + p55) {
                v55 = v45 + p55;
                d55 = d45;
            }
            if (v55 > v54 + p55) {
                v55 = v54 + p55;
                d55 = d54;
            }
            if (v55 > v62 + p55) {
                v55 = v62 + p55;
                d55 = d62;
            }
            
            r55 |= r46;
            r55 |= r45;
            r55 |= r54;
            r55 |= r62;
            r55 &= !b55;
            o46 |= b55;
            o45 |= b55;
            o54 |= b55;
            o62 |= b55;
        }
        else {
            o46 |= b55;
            o45 |= b55;
            o54 |= b55;
            o62 |= b55;
        }

        if (rc.onTheMap(l63) && rc.canSenseLocation(l63)) {
            if (rc.senseCloud(l63)) {
                p63 = 1.5;
                b63 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l63).getCurrentDirection();
                if (targetLocation.equals(l63) || (rc.sensePassability(l63) && !rc.canSenseRobotAtLocation(l63) && currentDirection.equals(Direction.CENTER))) {
                    p63 = rc.senseMapInfo(l63).getCooldownMultiplier(team);
                    b63 = false;
                }
            }
            if (v63 > v55 + p63) {
                v63 = v55 + p63;
                d63 = d55;
            }
            if (v63 > v54 + p63) {
                v63 = v54 + p63;
                d63 = d54;
            }
            if (v63 > v62 + p63) {
                v63 = v62 + p63;
                d63 = d62;
            }
            
            r63 |= r55;
            r63 |= r54;
            r63 |= r62;
            r63 &= !b63;
            o55 |= b63;
            o54 |= b63;
            o62 |= b63;
        }
        else {
            o55 |= b63;
            o54 |= b63;
            o62 |= b63;
        }

        if (rc.onTheMap(l57) && rc.canSenseLocation(l57)) {
            if (rc.senseCloud(l57)) {
                p57 = 1.5;
                b57 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l57).getCurrentDirection();
                if (targetLocation.equals(l57) || (rc.sensePassability(l57) && !rc.canSenseRobotAtLocation(l57) && currentDirection.equals(Direction.CENTER))) {
                    p57 = rc.senseMapInfo(l57).getCooldownMultiplier(team);
                    b57 = false;
                }
            }
            if (v57 > v58 + p57) {
                v57 = v58 + p57;
                d57 = d58;
            }
            if (v57 > v50 + p57) {
                v57 = v50 + p57;
                d57 = d50;
            }
            
            r57 |= r58;
            r57 |= r50;
            r57 &= !b57;
            o58 |= b57;
            o50 |= b57;
        }
        else {
            o58 |= b57;
            o50 |= b57;
        }

        if (rc.onTheMap(l11) && rc.canSenseLocation(l11)) {
            if (rc.senseCloud(l11)) {
                p11 = 1.5;
                b11 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l11).getCurrentDirection();
                if (targetLocation.equals(l11) || (rc.sensePassability(l11) && !rc.canSenseRobotAtLocation(l11) && currentDirection.equals(Direction.CENTER))) {
                    p11 = rc.senseMapInfo(l11).getCooldownMultiplier(team);
                    b11 = false;
                }
            }
            if (v11 > v19 + p11) {
                v11 = v19 + p11;
                d11 = d19;
            }
            if (v11 > v18 + p11) {
                v11 = v18 + p11;
                d11 = d18;
            }
            
            r11 |= r19;
            r11 |= r18;
            r11 &= !b11;
            o19 |= b11;
            o18 |= b11;
        }
        else {
            o19 |= b11;
            o18 |= b11;
        }

        if (rc.onTheMap(l66) && rc.canSenseLocation(l66)) {
            if (rc.senseCloud(l66)) {
                p66 = 1.5;
                b66 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l66).getCurrentDirection();
                if (targetLocation.equals(l66) || (rc.sensePassability(l66) && !rc.canSenseRobotAtLocation(l66) && currentDirection.equals(Direction.CENTER))) {
                    p66 = rc.senseMapInfo(l66).getCooldownMultiplier(team);
                    b66 = false;
                }
            }
            if (v66 > v61 + p66) {
                v66 = v61 + p66;
                d66 = d61;
            }
            if (v66 > v60 + p66) {
                v66 = v60 + p66;
                d66 = d60;
            }
            if (v66 > v59 + p66) {
                v66 = v59 + p66;
                d66 = d59;
            }
            
            r66 |= r61;
            r66 |= r60;
            r66 |= r59;
            r66 &= !b66;
            o61 |= b66;
            o60 |= b66;
            o59 |= b66;
        }
        else {
            o61 |= b66;
            o60 |= b66;
            o59 |= b66;
        }

        if (rc.onTheMap(l38) && rc.canSenseLocation(l38)) {
            if (rc.senseCloud(l38)) {
                p38 = 1.5;
                b38 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l38).getCurrentDirection();
                if (targetLocation.equals(l38) || (rc.sensePassability(l38) && !rc.canSenseRobotAtLocation(l38) && currentDirection.equals(Direction.CENTER))) {
                    p38 = rc.senseMapInfo(l38).getCooldownMultiplier(team);
                    b38 = false;
                }
            }
            if (v38 > v28 + p38) {
                v38 = v28 + p38;
                d38 = d28;
            }
            if (v38 > v37 + p38) {
                v38 = v37 + p38;
                d38 = d37;
            }
            if (v38 > v46 + p38) {
                v38 = v46 + p38;
                d38 = d46;
            }
            
            r38 |= r28;
            r38 |= r37;
            r38 |= r46;
            r38 &= !b38;
            o28 |= b38;
            o37 |= b38;
            o46 |= b38;
        }
        else {
            o28 |= b38;
            o37 |= b38;
            o46 |= b38;
        }

        if (rc.onTheMap(l29) && rc.canSenseLocation(l29)) {
            if (rc.senseCloud(l29)) {
                p29 = 1.5;
                b29 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l29).getCurrentDirection();
                if (targetLocation.equals(l29) || (rc.sensePassability(l29) && !rc.canSenseRobotAtLocation(l29) && currentDirection.equals(Direction.CENTER))) {
                    p29 = rc.senseMapInfo(l29).getCooldownMultiplier(team);
                    b29 = false;
                }
            }
            if (v29 > v38 + p29) {
                v29 = v38 + p29;
                d29 = d38;
            }
            if (v29 > v19 + p29) {
                v29 = v19 + p29;
                d29 = d19;
            }
            if (v29 > v28 + p29) {
                v29 = v28 + p29;
                d29 = d28;
            }
            if (v29 > v37 + p29) {
                v29 = v37 + p29;
                d29 = d37;
            }
            
            r29 |= r38;
            r29 |= r19;
            r29 |= r28;
            r29 |= r37;
            r29 &= !b29;
            o38 |= b29;
            o19 |= b29;
            o28 |= b29;
            o37 |= b29;
        }
        else {
            o38 |= b29;
            o19 |= b29;
            o28 |= b29;
            o37 |= b29;
        }

        if (rc.onTheMap(l67) && rc.canSenseLocation(l67)) {
            if (rc.senseCloud(l67)) {
                p67 = 1.5;
                b67 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l67).getCurrentDirection();
                if (targetLocation.equals(l67) || (rc.sensePassability(l67) && !rc.canSenseRobotAtLocation(l67) && currentDirection.equals(Direction.CENTER))) {
                    p67 = rc.senseMapInfo(l67).getCooldownMultiplier(team);
                    b67 = false;
                }
            }
            if (v67 > v62 + p67) {
                v67 = v62 + p67;
                d67 = d62;
            }
            if (v67 > v61 + p67) {
                v67 = v61 + p67;
                d67 = d61;
            }
            if (v67 > v60 + p67) {
                v67 = v60 + p67;
                d67 = d60;
            }
            if (v67 > v66 + p67) {
                v67 = v66 + p67;
                d67 = d66;
            }
            
            r67 |= r62;
            r67 |= r61;
            r67 |= r60;
            r67 |= r66;
            r67 &= !b67;
            o62 |= b67;
            o61 |= b67;
            o60 |= b67;
            o66 |= b67;
        }
        else {
            o62 |= b67;
            o61 |= b67;
            o60 |= b67;
            o66 |= b67;
        }

        if (rc.onTheMap(l47) && rc.canSenseLocation(l47)) {
            if (rc.senseCloud(l47)) {
                p47 = 1.5;
                b47 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l47).getCurrentDirection();
                if (targetLocation.equals(l47) || (rc.sensePassability(l47) && !rc.canSenseRobotAtLocation(l47) && currentDirection.equals(Direction.CENTER))) {
                    p47 = rc.senseMapInfo(l47).getCooldownMultiplier(team);
                    b47 = false;
                }
            }
            if (v47 > v38 + p47) {
                v47 = v38 + p47;
                d47 = d38;
            }
            if (v47 > v37 + p47) {
                v47 = v37 + p47;
                d47 = d37;
            }
            if (v47 > v46 + p47) {
                v47 = v46 + p47;
                d47 = d46;
            }
            if (v47 > v55 + p47) {
                v47 = v55 + p47;
                d47 = d55;
            }
            
            r47 |= r38;
            r47 |= r37;
            r47 |= r46;
            r47 |= r55;
            r47 &= !b47;
            o38 |= b47;
            o37 |= b47;
            o46 |= b47;
            o55 |= b47;
        }
        else {
            o38 |= b47;
            o37 |= b47;
            o46 |= b47;
            o55 |= b47;
        }

        if (rc.onTheMap(l65) && rc.canSenseLocation(l65)) {
            if (rc.senseCloud(l65)) {
                p65 = 1.5;
                b65 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l65).getCurrentDirection();
                if (targetLocation.equals(l65) || (rc.sensePassability(l65) && !rc.canSenseRobotAtLocation(l65) && currentDirection.equals(Direction.CENTER))) {
                    p65 = rc.senseMapInfo(l65).getCooldownMultiplier(team);
                    b65 = false;
                }
            }
            if (v65 > v66 + p65) {
                v65 = v66 + p65;
                d65 = d66;
            }
            if (v65 > v60 + p65) {
                v65 = v60 + p65;
                d65 = d60;
            }
            if (v65 > v59 + p65) {
                v65 = v59 + p65;
                d65 = d59;
            }
            if (v65 > v58 + p65) {
                v65 = v58 + p65;
                d65 = d58;
            }
            
            r65 |= r66;
            r65 |= r60;
            r65 |= r59;
            r65 |= r58;
            r65 &= !b65;
            o66 |= b65;
            o60 |= b65;
            o59 |= b65;
            o58 |= b65;
        }
        else {
            o66 |= b65;
            o60 |= b65;
            o59 |= b65;
            o58 |= b65;
        }

        if (rc.onTheMap(l68) && rc.canSenseLocation(l68)) {
            if (rc.senseCloud(l68)) {
                p68 = 1.5;
                b68 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l68).getCurrentDirection();
                if (targetLocation.equals(l68) || (rc.sensePassability(l68) && !rc.canSenseRobotAtLocation(l68) && currentDirection.equals(Direction.CENTER))) {
                    p68 = rc.senseMapInfo(l68).getCooldownMultiplier(team);
                    b68 = false;
                }
            }
            if (v68 > v63 + p68) {
                v68 = v63 + p68;
                d68 = d63;
            }
            if (v68 > v62 + p68) {
                v68 = v62 + p68;
                d68 = d62;
            }
            if (v68 > v61 + p68) {
                v68 = v61 + p68;
                d68 = d61;
            }
            if (v68 > v67 + p68) {
                v68 = v67 + p68;
                d68 = d67;
            }
            
            r68 |= r63;
            r68 |= r62;
            r68 |= r61;
            r68 |= r67;
            r68 &= !b68;
            o63 |= b68;
            o62 |= b68;
            o61 |= b68;
            o67 |= b68;
        }
        else {
            o63 |= b68;
            o62 |= b68;
            o61 |= b68;
            o67 |= b68;
        }

        if (rc.onTheMap(l64) && rc.canSenseLocation(l64)) {
            if (rc.senseCloud(l64)) {
                p64 = 1.5;
                b64 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l64).getCurrentDirection();
                if (targetLocation.equals(l64) || (rc.sensePassability(l64) && !rc.canSenseRobotAtLocation(l64) && currentDirection.equals(Direction.CENTER))) {
                    p64 = rc.senseMapInfo(l64).getCooldownMultiplier(team);
                    b64 = false;
                }
            }
            if (v64 > v65 + p64) {
                v64 = v65 + p64;
                d64 = d65;
            }
            if (v64 > v59 + p64) {
                v64 = v59 + p64;
                d64 = d59;
            }
            if (v64 > v58 + p64) {
                v64 = v58 + p64;
                d64 = d58;
            }
            if (v64 > v57 + p64) {
                v64 = v57 + p64;
                d64 = d57;
            }
            
            r64 |= r65;
            r64 |= r59;
            r64 |= r58;
            r64 |= r57;
            r64 &= !b64;
            o65 |= b64;
            o59 |= b64;
            o58 |= b64;
            o57 |= b64;
        }
        else {
            o65 |= b64;
            o59 |= b64;
            o58 |= b64;
            o57 |= b64;
        }

        if (rc.onTheMap(l56) && rc.canSenseLocation(l56)) {
            if (rc.senseCloud(l56)) {
                p56 = 1.5;
                b56 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l56).getCurrentDirection();
                if (targetLocation.equals(l56) || (rc.sensePassability(l56) && !rc.canSenseRobotAtLocation(l56) && currentDirection.equals(Direction.CENTER))) {
                    p56 = rc.senseMapInfo(l56).getCooldownMultiplier(team);
                    b56 = false;
                }
            }
            if (v56 > v47 + p56) {
                v56 = v47 + p56;
                d56 = d47;
            }
            if (v56 > v46 + p56) {
                v56 = v46 + p56;
                d56 = d46;
            }
            if (v56 > v55 + p56) {
                v56 = v55 + p56;
                d56 = d55;
            }
            if (v56 > v63 + p56) {
                v56 = v63 + p56;
                d56 = d63;
            }
            
            r56 |= r47;
            r56 |= r46;
            r56 |= r55;
            r56 |= r63;
            r56 &= !b56;
            o47 |= b56;
            o46 |= b56;
            o55 |= b56;
            o63 |= b56;
        }
        else {
            o47 |= b56;
            o46 |= b56;
            o55 |= b56;
            o63 |= b56;
        }

        if (rc.onTheMap(l20) && rc.canSenseLocation(l20)) {
            if (rc.senseCloud(l20)) {
                p20 = 1.5;
                b20 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l20).getCurrentDirection();
                if (targetLocation.equals(l20) || (rc.sensePassability(l20) && !rc.canSenseRobotAtLocation(l20) && currentDirection.equals(Direction.CENTER))) {
                    p20 = rc.senseMapInfo(l20).getCooldownMultiplier(team);
                    b20 = false;
                }
            }
            if (v20 > v29 + p20) {
                v20 = v29 + p20;
                d20 = d29;
            }
            if (v20 > v11 + p20) {
                v20 = v11 + p20;
                d20 = d11;
            }
            if (v20 > v19 + p20) {
                v20 = v19 + p20;
                d20 = d19;
            }
            if (v20 > v28 + p20) {
                v20 = v28 + p20;
                d20 = d28;
            }
            
            r20 |= r29;
            r20 |= r11;
            r20 |= r19;
            r20 |= r28;
            r20 &= !b20;
            o29 |= b20;
            o11 |= b20;
            o19 |= b20;
            o28 |= b20;
        }
        else {
            o29 |= b20;
            o11 |= b20;
            o19 |= b20;
            o28 |= b20;
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
                        if (v11 < 10000) {
                            return d11;
                        }
                } break;

            case -2:
                switch(dy) {
                    case 2:
                        if (v18 < 10000) {
                            return d18;
                        }
                    case 3:
                        if (v19 < 10000) {
                            return d19;
                        }
                    case 4:
                        if (v20 < 10000) {
                            return d20;
                        }
                } break;

            case -1:
                switch(dy) {
                    case 1:
                        if (v26 < 10000) {
                            return d26;
                        }
                    case 2:
                        if (v27 < 10000) {
                            return d27;
                        }
                    case 3:
                        if (v28 < 10000) {
                            return d28;
                        }
                    case 4:
                        if (v29 < 10000) {
                            return d29;
                        }
                } break;

            case 0:
                switch(dy) {
                    case 0:
                        if (v34 < 10000) {
                            return d34;
                        }
                    case 1:
                        if (v35 < 10000) {
                            return d35;
                        }
                    case 2:
                        if (v36 < 10000) {
                            return d36;
                        }
                    case 3:
                        if (v37 < 10000) {
                            return d37;
                        }
                    case 4:
                        if (v38 < 10000) {
                            return d38;
                        }
                } break;

            case 1:
                switch(dy) {
                    case -1:
                        if (v42 < 10000) {
                            return d42;
                        }
                    case 0:
                        if (v43 < 10000) {
                            return d43;
                        }
                    case 1:
                        if (v44 < 10000) {
                            return d44;
                        }
                    case 2:
                        if (v45 < 10000) {
                            return d45;
                        }
                    case 3:
                        if (v46 < 10000) {
                            return d46;
                        }
                    case 4:
                        if (v47 < 10000) {
                            return d47;
                        }
                } break;

            case 2:
                switch(dy) {
                    case -2:
                        if (v50 < 10000) {
                            return d50;
                        }
                    case -1:
                        if (v51 < 10000) {
                            return d51;
                        }
                    case 0:
                        if (v52 < 10000) {
                            return d52;
                        }
                    case 1:
                        if (v53 < 10000) {
                            return d53;
                        }
                    case 2:
                        if (v54 < 10000) {
                            return d54;
                        }
                    case 3:
                        if (v55 < 10000) {
                            return d55;
                        }
                    case 4:
                        if (v56 < 10000) {
                            return d56;
                        }
                } break;

            case 3:
                switch(dy) {
                    case -3:
                        if (v57 < 10000) {
                            return d57;
                        }
                    case -2:
                        if (v58 < 10000) {
                            return d58;
                        }
                    case -1:
                        if (v59 < 10000) {
                            return d59;
                        }
                    case 0:
                        if (v60 < 10000) {
                            return d60;
                        }
                    case 1:
                        if (v61 < 10000) {
                            return d61;
                        }
                    case 2:
                        if (v62 < 10000) {
                            return d62;
                        }
                    case 3:
                        if (v63 < 10000) {
                            return d63;
                        }
                } break;

            case 4:
                switch(dy) {
                    case -2:
                        if (v64 < 10000) {
                            return d64;
                        }
                    case -1:
                        if (v65 < 10000) {
                            return d65;
                        }
                    case 0:
                        if (v66 < 10000) {
                            return d66;
                        }
                    case 1:
                        if (v67 < 10000) {
                            return d67;
                        }
                    case 2:
                        if (v68 < 10000) {
                            return d68;
                        }
                } break;

        }
    
        o11 = r11;
        o20 = r20;
        o29 = r29;
        o38 = r38;
        o47 = r47;
        o56 = r56;
        o57 = r57;
        o63 = r63;
        o64 = r64;
        o65 = r65;
        o66 = r66;
        o67 = r67;
        o68 = r68;
        Direction ans = Direction.CENTER;

        if (r11 && o11) {
            double dist11 = v11 + 1.5 * Math.sqrt(l11.distanceSquaredTo(targetLocation));
            if (dist11 < localBest) {
                localBest = dist11;
                ans = d11;
                best = l11;
            }
        }

        if (r20 && o20) {
            double dist20 = v20 + 1.5 * Math.sqrt(l20.distanceSquaredTo(targetLocation));
            if (dist20 < localBest) {
                localBest = dist20;
                ans = d20;
                best = l20;
            }
        }

        if (r29 && o29) {
            double dist29 = v29 + 1.5 * Math.sqrt(l29.distanceSquaredTo(targetLocation));
            if (dist29 < localBest) {
                localBest = dist29;
                ans = d29;
                best = l29;
            }
        }

        if (r38 && o38) {
            double dist38 = v38 + 1.5 * Math.sqrt(l38.distanceSquaredTo(targetLocation));
            if (dist38 < localBest) {
                localBest = dist38;
                ans = d38;
                best = l38;
            }
        }

        if (r47 && o47) {
            double dist47 = v47 + 1.5 * Math.sqrt(l47.distanceSquaredTo(targetLocation));
            if (dist47 < localBest) {
                localBest = dist47;
                ans = d47;
                best = l47;
            }
        }

        if (r56 && o56) {
            double dist56 = v56 + 1.5 * Math.sqrt(l56.distanceSquaredTo(targetLocation));
            if (dist56 < localBest) {
                localBest = dist56;
                ans = d56;
                best = l56;
            }
        }

        if (r57 && o57) {
            double dist57 = v57 + 1.5 * Math.sqrt(l57.distanceSquaredTo(targetLocation));
            if (dist57 < localBest) {
                localBest = dist57;
                ans = d57;
                best = l57;
            }
        }

        if (r63 && o63) {
            double dist63 = v63 + 1.5 * Math.sqrt(l63.distanceSquaredTo(targetLocation));
            if (dist63 < localBest) {
                localBest = dist63;
                ans = d63;
                best = l63;
            }
        }

        if (r64 && o64) {
            double dist64 = v64 + 1.5 * Math.sqrt(l64.distanceSquaredTo(targetLocation));
            if (dist64 < localBest) {
                localBest = dist64;
                ans = d64;
                best = l64;
            }
        }

        if (r65 && o65) {
            double dist65 = v65 + 1.5 * Math.sqrt(l65.distanceSquaredTo(targetLocation));
            if (dist65 < localBest) {
                localBest = dist65;
                ans = d65;
                best = l65;
            }
        }

        if (r66 && o66) {
            double dist66 = v66 + 1.5 * Math.sqrt(l66.distanceSquaredTo(targetLocation));
            if (dist66 < localBest) {
                localBest = dist66;
                ans = d66;
                best = l66;
            }
        }

        if (r67 && o67) {
            double dist67 = v67 + 1.5 * Math.sqrt(l67.distanceSquaredTo(targetLocation));
            if (dist67 < localBest) {
                localBest = dist67;
                ans = d67;
                best = l67;
            }
        }

        if (r68 && o68) {
            double dist68 = v68 + 1.5 * Math.sqrt(l68.distanceSquaredTo(targetLocation));
            if (dist68 < localBest) {
                localBest = dist68;
                ans = d68;
                best = l68;
            }
        }

        draws1();
        rc.setIndicatorDot(best, 0, 0, 255);
        if (localBest < globalBest) {
            globalBest = localBest;
            return ans;
        }
        return getBestDirectionWallFollow1(ans);
    }

    private Direction getBestDirectionWallFollow1(Direction prev) throws GameActionException {
        Direction ans = Direction.CENTER;
        int minDistance = closestWallLocations.isEmpty() ? 1000000 : currentLocation.distanceSquaredTo(closestWallLocations.get(0));
    
        if (b11) {
            int distance = currentLocation.distanceSquaredTo(l11);
            if (distance == minDistance) {
                closestWallLocations.add(l11);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l11);
                minDistance = distance;
            }
        }

        if (b18) {
            int distance = currentLocation.distanceSquaredTo(l18);
            if (distance == minDistance) {
                closestWallLocations.add(l18);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l18);
                minDistance = distance;
            }
        }

        if (b19) {
            int distance = currentLocation.distanceSquaredTo(l19);
            if (distance == minDistance) {
                closestWallLocations.add(l19);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l19);
                minDistance = distance;
            }
        }

        if (b20) {
            int distance = currentLocation.distanceSquaredTo(l20);
            if (distance == minDistance) {
                closestWallLocations.add(l20);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l20);
                minDistance = distance;
            }
        }

        if (b26) {
            int distance = currentLocation.distanceSquaredTo(l26);
            if (distance == minDistance) {
                closestWallLocations.add(l26);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l26);
                minDistance = distance;
            }
        }

        if (b27) {
            int distance = currentLocation.distanceSquaredTo(l27);
            if (distance == minDistance) {
                closestWallLocations.add(l27);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l27);
                minDistance = distance;
            }
        }

        if (b28) {
            int distance = currentLocation.distanceSquaredTo(l28);
            if (distance == minDistance) {
                closestWallLocations.add(l28);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l28);
                minDistance = distance;
            }
        }

        if (b29) {
            int distance = currentLocation.distanceSquaredTo(l29);
            if (distance == minDistance) {
                closestWallLocations.add(l29);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l29);
                minDistance = distance;
            }
        }

        if (b35) {
            int distance = currentLocation.distanceSquaredTo(l35);
            if (distance == minDistance) {
                closestWallLocations.add(l35);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l35);
                minDistance = distance;
            }
        }

        if (b36) {
            int distance = currentLocation.distanceSquaredTo(l36);
            if (distance == minDistance) {
                closestWallLocations.add(l36);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l36);
                minDistance = distance;
            }
        }

        if (b37) {
            int distance = currentLocation.distanceSquaredTo(l37);
            if (distance == minDistance) {
                closestWallLocations.add(l37);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l37);
                minDistance = distance;
            }
        }

        if (b38) {
            int distance = currentLocation.distanceSquaredTo(l38);
            if (distance == minDistance) {
                closestWallLocations.add(l38);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l38);
                minDistance = distance;
            }
        }

        if (b42) {
            int distance = currentLocation.distanceSquaredTo(l42);
            if (distance == minDistance) {
                closestWallLocations.add(l42);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l42);
                minDistance = distance;
            }
        }

        if (b43) {
            int distance = currentLocation.distanceSquaredTo(l43);
            if (distance == minDistance) {
                closestWallLocations.add(l43);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l43);
                minDistance = distance;
            }
        }

        if (b44) {
            int distance = currentLocation.distanceSquaredTo(l44);
            if (distance == minDistance) {
                closestWallLocations.add(l44);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l44);
                minDistance = distance;
            }
        }

        if (b45) {
            int distance = currentLocation.distanceSquaredTo(l45);
            if (distance == minDistance) {
                closestWallLocations.add(l45);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l45);
                minDistance = distance;
            }
        }

        if (b46) {
            int distance = currentLocation.distanceSquaredTo(l46);
            if (distance == minDistance) {
                closestWallLocations.add(l46);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l46);
                minDistance = distance;
            }
        }

        if (b47) {
            int distance = currentLocation.distanceSquaredTo(l47);
            if (distance == minDistance) {
                closestWallLocations.add(l47);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l47);
                minDistance = distance;
            }
        }

        if (b50) {
            int distance = currentLocation.distanceSquaredTo(l50);
            if (distance == minDistance) {
                closestWallLocations.add(l50);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l50);
                minDistance = distance;
            }
        }

        if (b51) {
            int distance = currentLocation.distanceSquaredTo(l51);
            if (distance == minDistance) {
                closestWallLocations.add(l51);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l51);
                minDistance = distance;
            }
        }

        if (b52) {
            int distance = currentLocation.distanceSquaredTo(l52);
            if (distance == minDistance) {
                closestWallLocations.add(l52);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l52);
                minDistance = distance;
            }
        }

        if (b53) {
            int distance = currentLocation.distanceSquaredTo(l53);
            if (distance == minDistance) {
                closestWallLocations.add(l53);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l53);
                minDistance = distance;
            }
        }

        if (b54) {
            int distance = currentLocation.distanceSquaredTo(l54);
            if (distance == minDistance) {
                closestWallLocations.add(l54);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l54);
                minDistance = distance;
            }
        }

        if (b55) {
            int distance = currentLocation.distanceSquaredTo(l55);
            if (distance == minDistance) {
                closestWallLocations.add(l55);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l55);
                minDistance = distance;
            }
        }

        if (b56) {
            int distance = currentLocation.distanceSquaredTo(l56);
            if (distance == minDistance) {
                closestWallLocations.add(l56);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l56);
                minDistance = distance;
            }
        }

        if (b57) {
            int distance = currentLocation.distanceSquaredTo(l57);
            if (distance == minDistance) {
                closestWallLocations.add(l57);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l57);
                minDistance = distance;
            }
        }

        if (b58) {
            int distance = currentLocation.distanceSquaredTo(l58);
            if (distance == minDistance) {
                closestWallLocations.add(l58);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l58);
                minDistance = distance;
            }
        }

        if (b59) {
            int distance = currentLocation.distanceSquaredTo(l59);
            if (distance == minDistance) {
                closestWallLocations.add(l59);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l59);
                minDistance = distance;
            }
        }

        if (b60) {
            int distance = currentLocation.distanceSquaredTo(l60);
            if (distance == minDistance) {
                closestWallLocations.add(l60);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l60);
                minDistance = distance;
            }
        }

        if (b61) {
            int distance = currentLocation.distanceSquaredTo(l61);
            if (distance == minDistance) {
                closestWallLocations.add(l61);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l61);
                minDistance = distance;
            }
        }

        if (b62) {
            int distance = currentLocation.distanceSquaredTo(l62);
            if (distance == minDistance) {
                closestWallLocations.add(l62);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l62);
                minDistance = distance;
            }
        }

        if (b63) {
            int distance = currentLocation.distanceSquaredTo(l63);
            if (distance == minDistance) {
                closestWallLocations.add(l63);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l63);
                minDistance = distance;
            }
        }

        if (b64) {
            int distance = currentLocation.distanceSquaredTo(l64);
            if (distance == minDistance) {
                closestWallLocations.add(l64);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l64);
                minDistance = distance;
            }
        }

        if (b65) {
            int distance = currentLocation.distanceSquaredTo(l65);
            if (distance == minDistance) {
                closestWallLocations.add(l65);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l65);
                minDistance = distance;
            }
        }

        if (b66) {
            int distance = currentLocation.distanceSquaredTo(l66);
            if (distance == minDistance) {
                closestWallLocations.add(l66);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l66);
                minDistance = distance;
            }
        }

        if (b67) {
            int distance = currentLocation.distanceSquaredTo(l67);
            if (distance == minDistance) {
                closestWallLocations.add(l67);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l67);
                minDistance = distance;
            }
        }

        if (b68) {
            int distance = currentLocation.distanceSquaredTo(l68);
            if (distance == minDistance) {
                closestWallLocations.add(l68);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l68);
                minDistance = distance;
            }
        }

        if (minDistance > 2) { return prev; }
        int maxDot = -999999;
        minDistance = 1000000;
        for (MapLocation closestWallLocation : closestWallLocations) {
            Direction vertical = currentLocation.directionTo(closestWallLocation);

            Direction tangent1 = vertical.rotateLeft().rotateLeft();
            Direction tangent2 = vertical.rotateRight().rotateRight();

            int dx = lastDirection.getDeltaX();
            int dy = lastDirection.getDeltaY();

            int dot1 = tangent1.getDeltaX() * dx + tangent1.getDeltaY() * dy;
            int dot2 = tangent2.getDeltaX() * dx + tangent2.getDeltaY() * dy;

            int distance1 = currentLocation.add(tangent1).distanceSquaredTo(targetLocation);
            int distance2 = currentLocation.add(tangent2).distanceSquaredTo(targetLocation);

            if (!rc.canMove(tangent1)) {
                dot1 = -1000000;
            }

            if (!rc.canMove(tangent2)) {
                dot2 = -1000000;
            }

            if (dot1 > maxDot) {
                maxDot = dot1;
                minDistance = distance1;
                ans = tangent1;
            }

            if (dot2 > maxDot) {
                maxDot = dot2;
                minDistance = distance2;
                ans = tangent2;
            }

            if (dot1 == maxDot && distance1 < minDistance) {
                maxDot = dot1;
                minDistance = distance1;
                ans = tangent1;
            }

            if (dot2 == maxDot && distance2 < minDistance) {
                maxDot = dot2;
                minDistance = distance2;
                ans = tangent2;
            }
        }
        draws1();
        for (MapLocation closestWallLocation : closestWallLocations) {
            rc.setIndicatorDot(closestWallLocation, 255, 0, 0);
        }
        return ans;
    }

    private void draws1() throws GameActionException {
    
        rc.setIndicatorDot(l11, 255, 0, 255);
        if (b11) {
            rc.setIndicatorDot(l11, 255, 255, 255);
        }

        rc.setIndicatorDot(l18, 255, 0, 255);
        if (b18) {
            rc.setIndicatorDot(l18, 255, 255, 255);
        }

        rc.setIndicatorDot(l19, 255, 0, 255);
        if (b19) {
            rc.setIndicatorDot(l19, 255, 255, 255);
        }

        rc.setIndicatorDot(l20, 255, 0, 255);
        if (b20) {
            rc.setIndicatorDot(l20, 255, 255, 255);
        }

        rc.setIndicatorDot(l26, 255, 0, 255);
        if (b26) {
            rc.setIndicatorDot(l26, 255, 255, 255);
        }

        rc.setIndicatorDot(l27, 255, 0, 255);
        if (b27) {
            rc.setIndicatorDot(l27, 255, 255, 255);
        }

        rc.setIndicatorDot(l28, 255, 0, 255);
        if (b28) {
            rc.setIndicatorDot(l28, 255, 255, 255);
        }

        rc.setIndicatorDot(l29, 255, 0, 255);
        if (b29) {
            rc.setIndicatorDot(l29, 255, 255, 255);
        }

        rc.setIndicatorDot(l35, 255, 0, 255);
        if (b35) {
            rc.setIndicatorDot(l35, 255, 255, 255);
        }

        rc.setIndicatorDot(l36, 255, 0, 255);
        if (b36) {
            rc.setIndicatorDot(l36, 255, 255, 255);
        }

        rc.setIndicatorDot(l37, 255, 0, 255);
        if (b37) {
            rc.setIndicatorDot(l37, 255, 255, 255);
        }

        rc.setIndicatorDot(l38, 255, 0, 255);
        if (b38) {
            rc.setIndicatorDot(l38, 255, 255, 255);
        }

        rc.setIndicatorDot(l42, 255, 0, 255);
        if (b42) {
            rc.setIndicatorDot(l42, 255, 255, 255);
        }

        rc.setIndicatorDot(l43, 255, 0, 255);
        if (b43) {
            rc.setIndicatorDot(l43, 255, 255, 255);
        }

        rc.setIndicatorDot(l44, 255, 0, 255);
        if (b44) {
            rc.setIndicatorDot(l44, 255, 255, 255);
        }

        rc.setIndicatorDot(l45, 255, 0, 255);
        if (b45) {
            rc.setIndicatorDot(l45, 255, 255, 255);
        }

        rc.setIndicatorDot(l46, 255, 0, 255);
        if (b46) {
            rc.setIndicatorDot(l46, 255, 255, 255);
        }

        rc.setIndicatorDot(l47, 255, 0, 255);
        if (b47) {
            rc.setIndicatorDot(l47, 255, 255, 255);
        }

        rc.setIndicatorDot(l50, 255, 0, 255);
        if (b50) {
            rc.setIndicatorDot(l50, 255, 255, 255);
        }

        rc.setIndicatorDot(l51, 255, 0, 255);
        if (b51) {
            rc.setIndicatorDot(l51, 255, 255, 255);
        }

        rc.setIndicatorDot(l52, 255, 0, 255);
        if (b52) {
            rc.setIndicatorDot(l52, 255, 255, 255);
        }

        rc.setIndicatorDot(l53, 255, 0, 255);
        if (b53) {
            rc.setIndicatorDot(l53, 255, 255, 255);
        }

        rc.setIndicatorDot(l54, 255, 0, 255);
        if (b54) {
            rc.setIndicatorDot(l54, 255, 255, 255);
        }

        rc.setIndicatorDot(l55, 255, 0, 255);
        if (b55) {
            rc.setIndicatorDot(l55, 255, 255, 255);
        }

        rc.setIndicatorDot(l56, 255, 0, 255);
        if (b56) {
            rc.setIndicatorDot(l56, 255, 255, 255);
        }

        rc.setIndicatorDot(l57, 255, 0, 255);
        if (b57) {
            rc.setIndicatorDot(l57, 255, 255, 255);
        }

        rc.setIndicatorDot(l58, 255, 0, 255);
        if (b58) {
            rc.setIndicatorDot(l58, 255, 255, 255);
        }

        rc.setIndicatorDot(l59, 255, 0, 255);
        if (b59) {
            rc.setIndicatorDot(l59, 255, 255, 255);
        }

        rc.setIndicatorDot(l60, 255, 0, 255);
        if (b60) {
            rc.setIndicatorDot(l60, 255, 255, 255);
        }

        rc.setIndicatorDot(l61, 255, 0, 255);
        if (b61) {
            rc.setIndicatorDot(l61, 255, 255, 255);
        }

        rc.setIndicatorDot(l62, 255, 0, 255);
        if (b62) {
            rc.setIndicatorDot(l62, 255, 255, 255);
        }

        rc.setIndicatorDot(l63, 255, 0, 255);
        if (b63) {
            rc.setIndicatorDot(l63, 255, 255, 255);
        }

        rc.setIndicatorDot(l64, 255, 0, 255);
        if (b64) {
            rc.setIndicatorDot(l64, 255, 255, 255);
        }

        rc.setIndicatorDot(l65, 255, 0, 255);
        if (b65) {
            rc.setIndicatorDot(l65, 255, 255, 255);
        }

        rc.setIndicatorDot(l66, 255, 0, 255);
        if (b66) {
            rc.setIndicatorDot(l66, 255, 255, 255);
        }

        rc.setIndicatorDot(l67, 255, 0, 255);
        if (b67) {
            rc.setIndicatorDot(l67, 255, 255, 255);
        }

        rc.setIndicatorDot(l68, 255, 0, 255);
        if (b68) {
            rc.setIndicatorDot(l68, 255, 255, 255);
        }

    }

    private Direction getBestDirection2() throws GameActionException {
        MapLocation best = currentLocation;
        double localBest = 1000000.0;
        l34 = currentLocation;
        v34 = 0;
        d34 = Direction.CENTER;
        r34 = true;
        l43 = l34.add(Direction.EAST);
        v43 = 1000000;
        p43 = 1000000;
        d43 = null;
        b43 = true;
        r43 = false;
        o43 = false;
        l44 = l34.add(Direction.NORTHEAST);
        v44 = 1000000;
        p44 = 1000000;
        d44 = null;
        b44 = true;
        r44 = false;
        o44 = false;
        l35 = l34.add(Direction.NORTH);
        v35 = 1000000;
        p35 = 1000000;
        d35 = null;
        b35 = true;
        r35 = false;
        o35 = false;
        l33 = l34.add(Direction.SOUTH);
        v33 = 1000000;
        p33 = 1000000;
        d33 = null;
        b33 = true;
        r33 = false;
        o33 = false;
        l42 = l34.add(Direction.SOUTHEAST);
        v42 = 1000000;
        p42 = 1000000;
        d42 = null;
        b42 = true;
        r42 = false;
        o42 = false;
        l32 = l33.add(Direction.SOUTH);
        v32 = 1000000;
        p32 = 1000000;
        d32 = null;
        b32 = true;
        r32 = false;
        o32 = false;
        l41 = l33.add(Direction.SOUTHEAST);
        v41 = 1000000;
        p41 = 1000000;
        d41 = null;
        b41 = true;
        r41 = false;
        o41 = false;
        l45 = l35.add(Direction.NORTHEAST);
        v45 = 1000000;
        p45 = 1000000;
        d45 = null;
        b45 = true;
        r45 = false;
        o45 = false;
        l36 = l35.add(Direction.NORTH);
        v36 = 1000000;
        p36 = 1000000;
        d36 = null;
        b36 = true;
        r36 = false;
        o36 = false;
        l52 = l43.add(Direction.EAST);
        v52 = 1000000;
        p52 = 1000000;
        d52 = null;
        b52 = true;
        r52 = false;
        o52 = false;
        l53 = l43.add(Direction.NORTHEAST);
        v53 = 1000000;
        p53 = 1000000;
        d53 = null;
        b53 = true;
        r53 = false;
        o53 = false;
        l51 = l43.add(Direction.SOUTHEAST);
        v51 = 1000000;
        p51 = 1000000;
        d51 = null;
        b51 = true;
        r51 = false;
        o51 = false;
        l50 = l42.add(Direction.SOUTHEAST);
        v50 = 1000000;
        p50 = 1000000;
        d50 = null;
        b50 = true;
        r50 = false;
        o50 = false;
        l54 = l44.add(Direction.NORTHEAST);
        v54 = 1000000;
        p54 = 1000000;
        d54 = null;
        b54 = true;
        r54 = false;
        o54 = false;
        l31 = l32.add(Direction.SOUTH);
        v31 = 1000000;
        p31 = 1000000;
        d31 = null;
        b31 = true;
        r31 = false;
        o31 = false;
        l40 = l32.add(Direction.SOUTHEAST);
        v40 = 1000000;
        p40 = 1000000;
        d40 = null;
        b40 = true;
        r40 = false;
        o40 = false;
        l60 = l52.add(Direction.EAST);
        v60 = 1000000;
        p60 = 1000000;
        d60 = null;
        b60 = true;
        r60 = false;
        o60 = false;
        l61 = l52.add(Direction.NORTHEAST);
        v61 = 1000000;
        p61 = 1000000;
        d61 = null;
        b61 = true;
        r61 = false;
        o61 = false;
        l59 = l52.add(Direction.SOUTHEAST);
        v59 = 1000000;
        p59 = 1000000;
        d59 = null;
        b59 = true;
        r59 = false;
        o59 = false;
        l46 = l36.add(Direction.NORTHEAST);
        v46 = 1000000;
        p46 = 1000000;
        d46 = null;
        b46 = true;
        r46 = false;
        o46 = false;
        l37 = l36.add(Direction.NORTH);
        v37 = 1000000;
        p37 = 1000000;
        d37 = null;
        b37 = true;
        r37 = false;
        o37 = false;
        l58 = l51.add(Direction.SOUTHEAST);
        v58 = 1000000;
        p58 = 1000000;
        d58 = null;
        b58 = true;
        r58 = false;
        o58 = false;
        l55 = l45.add(Direction.NORTHEAST);
        v55 = 1000000;
        p55 = 1000000;
        d55 = null;
        b55 = true;
        r55 = false;
        o55 = false;
        l62 = l53.add(Direction.NORTHEAST);
        v62 = 1000000;
        p62 = 1000000;
        d62 = null;
        b62 = true;
        r62 = false;
        o62 = false;
        l49 = l41.add(Direction.SOUTHEAST);
        v49 = 1000000;
        p49 = 1000000;
        d49 = null;
        b49 = true;
        r49 = false;
        o49 = false;
        l57 = l50.add(Direction.SOUTHEAST);
        v57 = 1000000;
        p57 = 1000000;
        d57 = null;
        b57 = true;
        r57 = false;
        o57 = false;
        l63 = l54.add(Direction.NORTHEAST);
        v63 = 1000000;
        p63 = 1000000;
        d63 = null;
        b63 = true;
        r63 = false;
        o63 = false;
        l30 = l31.add(Direction.SOUTH);
        v30 = 1000000;
        p30 = 1000000;
        d30 = null;
        b30 = true;
        r30 = false;
        o30 = false;
        l39 = l31.add(Direction.SOUTHEAST);
        v39 = 1000000;
        p39 = 1000000;
        d39 = null;
        b39 = true;
        r39 = false;
        o39 = false;
        l66 = l60.add(Direction.EAST);
        v66 = 1000000;
        p66 = 1000000;
        d66 = null;
        b66 = true;
        r66 = false;
        o66 = false;
        l67 = l60.add(Direction.NORTHEAST);
        v67 = 1000000;
        p67 = 1000000;
        d67 = null;
        b67 = true;
        r67 = false;
        o67 = false;
        l65 = l60.add(Direction.SOUTHEAST);
        v65 = 1000000;
        p65 = 1000000;
        d65 = null;
        b65 = true;
        r65 = false;
        o65 = false;
        l47 = l37.add(Direction.NORTHEAST);
        v47 = 1000000;
        p47 = 1000000;
        d47 = null;
        b47 = true;
        r47 = false;
        o47 = false;
        l38 = l37.add(Direction.NORTH);
        v38 = 1000000;
        p38 = 1000000;
        d38 = null;
        b38 = true;
        r38 = false;
        o38 = false;
        l48 = l40.add(Direction.SOUTHEAST);
        v48 = 1000000;
        p48 = 1000000;
        d48 = null;
        b48 = true;
        r48 = false;
        o48 = false;
        l56 = l46.add(Direction.NORTHEAST);
        v56 = 1000000;
        p56 = 1000000;
        d56 = null;
        b56 = true;
        r56 = false;
        o56 = false;
        l68 = l61.add(Direction.NORTHEAST);
        v68 = 1000000;
        p68 = 1000000;
        d68 = null;
        b68 = true;
        r68 = false;
        o68 = false;
        l64 = l59.add(Direction.SOUTHEAST);
        v64 = 1000000;
        p64 = 1000000;
        d64 = null;
        b64 = true;
        r64 = false;
        o64 = false;
    
        if (rc.onTheMap(l33) && rc.canSenseLocation(l33)) {
            if (rc.senseCloud(l33)) {
                p33 = 1.5;
                b33 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l33).getCurrentDirection();
                if (targetLocation.equals(l33) || (rc.sensePassability(l33) && !rc.canSenseRobotAtLocation(l33) && currentDirection.equals(Direction.CENTER))) {
                    p33 = rc.senseMapInfo(l33).getCooldownMultiplier(team);
                    b33 = false;
                }
            }
            if (v33 > v43 + p33) {
                v33 = v43 + p33;
                d33 = d43;
            }
            if (v33 > v34 + p33) {
                v33 = v34 + p33;
                d33 = Direction.SOUTH;
            }
            
            r33 |= r43;
            r33 |= r34;
            r33 &= !b33;
            o43 |= b33;
        }
        else {
            o43 |= b33;
        }

        if (rc.onTheMap(l35) && rc.canSenseLocation(l35)) {
            if (rc.senseCloud(l35)) {
                p35 = 1.5;
                b35 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l35).getCurrentDirection();
                if (targetLocation.equals(l35) || (rc.sensePassability(l35) && !rc.canSenseRobotAtLocation(l35) && currentDirection.equals(Direction.CENTER))) {
                    p35 = rc.senseMapInfo(l35).getCooldownMultiplier(team);
                    b35 = false;
                }
            }
            if (v35 > v34 + p35) {
                v35 = v34 + p35;
                d35 = Direction.NORTH;
            }
            if (v35 > v43 + p35) {
                v35 = v43 + p35;
                d35 = d43;
            }
            
            r35 |= r34;
            r35 |= r43;
            r35 &= !b35;
            o43 |= b35;
        }
        else {
            o43 |= b35;
        }

        if (rc.onTheMap(l43) && rc.canSenseLocation(l43)) {
            if (rc.senseCloud(l43)) {
                p43 = 1.5;
                b43 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l43).getCurrentDirection();
                if (targetLocation.equals(l43) || (rc.sensePassability(l43) && !rc.canSenseRobotAtLocation(l43) && currentDirection.equals(Direction.CENTER))) {
                    p43 = rc.senseMapInfo(l43).getCooldownMultiplier(team);
                    b43 = false;
                }
            }
            if (v43 > v35 + p43) {
                v43 = v35 + p43;
                d43 = d35;
            }
            if (v43 > v34 + p43) {
                v43 = v34 + p43;
                d43 = Direction.EAST;
            }
            if (v43 > v33 + p43) {
                v43 = v33 + p43;
                d43 = d33;
            }
            
            r43 |= r35;
            r43 |= r34;
            r43 |= r33;
            r43 &= !b43;
            o35 |= b43;
            o33 |= b43;
        }
        else {
            o35 |= b43;
            o33 |= b43;
        }

        if (rc.onTheMap(l42) && rc.canSenseLocation(l42)) {
            if (rc.senseCloud(l42)) {
                p42 = 1.5;
                b42 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l42).getCurrentDirection();
                if (targetLocation.equals(l42) || (rc.sensePassability(l42) && !rc.canSenseRobotAtLocation(l42) && currentDirection.equals(Direction.CENTER))) {
                    p42 = rc.senseMapInfo(l42).getCooldownMultiplier(team);
                    b42 = false;
                }
            }
            if (v42 > v43 + p42) {
                v42 = v43 + p42;
                d42 = d43;
            }
            if (v42 > v34 + p42) {
                v42 = v34 + p42;
                d42 = Direction.SOUTHEAST;
            }
            if (v42 > v33 + p42) {
                v42 = v33 + p42;
                d42 = d33;
            }
            
            r42 |= r43;
            r42 |= r34;
            r42 |= r33;
            r42 &= !b42;
            o43 |= b42;
            o33 |= b42;
        }
        else {
            o43 |= b42;
            o33 |= b42;
        }

        if (rc.onTheMap(l44) && rc.canSenseLocation(l44)) {
            if (rc.senseCloud(l44)) {
                p44 = 1.5;
                b44 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l44).getCurrentDirection();
                if (targetLocation.equals(l44) || (rc.sensePassability(l44) && !rc.canSenseRobotAtLocation(l44) && currentDirection.equals(Direction.CENTER))) {
                    p44 = rc.senseMapInfo(l44).getCooldownMultiplier(team);
                    b44 = false;
                }
            }
            if (v44 > v35 + p44) {
                v44 = v35 + p44;
                d44 = d35;
            }
            if (v44 > v34 + p44) {
                v44 = v34 + p44;
                d44 = Direction.NORTHEAST;
            }
            if (v44 > v43 + p44) {
                v44 = v43 + p44;
                d44 = d43;
            }
            
            r44 |= r35;
            r44 |= r34;
            r44 |= r43;
            r44 &= !b44;
            o35 |= b44;
            o43 |= b44;
        }
        else {
            o35 |= b44;
            o43 |= b44;
        }

        if (rc.onTheMap(l32) && rc.canSenseLocation(l32)) {
            if (rc.senseCloud(l32)) {
                p32 = 1.5;
                b32 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l32).getCurrentDirection();
                if (targetLocation.equals(l32) || (rc.sensePassability(l32) && !rc.canSenseRobotAtLocation(l32) && currentDirection.equals(Direction.CENTER))) {
                    p32 = rc.senseMapInfo(l32).getCooldownMultiplier(team);
                    b32 = false;
                }
            }
            if (v32 > v42 + p32) {
                v32 = v42 + p32;
                d32 = d42;
            }
            if (v32 > v33 + p32) {
                v32 = v33 + p32;
                d32 = d33;
            }
            
            r32 |= r42;
            r32 |= r33;
            r32 &= !b32;
            o42 |= b32;
            o33 |= b32;
        }
        else {
            o42 |= b32;
            o33 |= b32;
        }

        if (rc.onTheMap(l52) && rc.canSenseLocation(l52)) {
            if (rc.senseCloud(l52)) {
                p52 = 1.5;
                b52 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l52).getCurrentDirection();
                if (targetLocation.equals(l52) || (rc.sensePassability(l52) && !rc.canSenseRobotAtLocation(l52) && currentDirection.equals(Direction.CENTER))) {
                    p52 = rc.senseMapInfo(l52).getCooldownMultiplier(team);
                    b52 = false;
                }
            }
            if (v52 > v44 + p52) {
                v52 = v44 + p52;
                d52 = d44;
            }
            if (v52 > v43 + p52) {
                v52 = v43 + p52;
                d52 = d43;
            }
            if (v52 > v42 + p52) {
                v52 = v42 + p52;
                d52 = d42;
            }
            
            r52 |= r44;
            r52 |= r43;
            r52 |= r42;
            r52 &= !b52;
            o44 |= b52;
            o43 |= b52;
            o42 |= b52;
        }
        else {
            o44 |= b52;
            o43 |= b52;
            o42 |= b52;
        }

        if (rc.onTheMap(l36) && rc.canSenseLocation(l36)) {
            if (rc.senseCloud(l36)) {
                p36 = 1.5;
                b36 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l36).getCurrentDirection();
                if (targetLocation.equals(l36) || (rc.sensePassability(l36) && !rc.canSenseRobotAtLocation(l36) && currentDirection.equals(Direction.CENTER))) {
                    p36 = rc.senseMapInfo(l36).getCooldownMultiplier(team);
                    b36 = false;
                }
            }
            if (v36 > v35 + p36) {
                v36 = v35 + p36;
                d36 = d35;
            }
            if (v36 > v44 + p36) {
                v36 = v44 + p36;
                d36 = d44;
            }
            
            r36 |= r35;
            r36 |= r44;
            r36 &= !b36;
            o35 |= b36;
            o44 |= b36;
        }
        else {
            o35 |= b36;
            o44 |= b36;
        }

        if (rc.onTheMap(l51) && rc.canSenseLocation(l51)) {
            if (rc.senseCloud(l51)) {
                p51 = 1.5;
                b51 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l51).getCurrentDirection();
                if (targetLocation.equals(l51) || (rc.sensePassability(l51) && !rc.canSenseRobotAtLocation(l51) && currentDirection.equals(Direction.CENTER))) {
                    p51 = rc.senseMapInfo(l51).getCooldownMultiplier(team);
                    b51 = false;
                }
            }
            if (v51 > v52 + p51) {
                v51 = v52 + p51;
                d51 = d52;
            }
            if (v51 > v43 + p51) {
                v51 = v43 + p51;
                d51 = d43;
            }
            if (v51 > v42 + p51) {
                v51 = v42 + p51;
                d51 = d42;
            }
            if (v51 > v41 + p51) {
                v51 = v41 + p51;
                d51 = d41;
            }
            
            r51 |= r52;
            r51 |= r43;
            r51 |= r42;
            r51 |= r41;
            r51 &= !b51;
            o52 |= b51;
            o43 |= b51;
            o42 |= b51;
            o41 |= b51;
        }
        else {
            o52 |= b51;
            o43 |= b51;
            o42 |= b51;
            o41 |= b51;
        }

        if (rc.onTheMap(l45) && rc.canSenseLocation(l45)) {
            if (rc.senseCloud(l45)) {
                p45 = 1.5;
                b45 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l45).getCurrentDirection();
                if (targetLocation.equals(l45) || (rc.sensePassability(l45) && !rc.canSenseRobotAtLocation(l45) && currentDirection.equals(Direction.CENTER))) {
                    p45 = rc.senseMapInfo(l45).getCooldownMultiplier(team);
                    b45 = false;
                }
            }
            if (v45 > v36 + p45) {
                v45 = v36 + p45;
                d45 = d36;
            }
            if (v45 > v35 + p45) {
                v45 = v35 + p45;
                d45 = d35;
            }
            if (v45 > v44 + p45) {
                v45 = v44 + p45;
                d45 = d44;
            }
            if (v45 > v53 + p45) {
                v45 = v53 + p45;
                d45 = d53;
            }
            
            r45 |= r36;
            r45 |= r35;
            r45 |= r44;
            r45 |= r53;
            r45 &= !b45;
            o36 |= b45;
            o35 |= b45;
            o44 |= b45;
            o53 |= b45;
        }
        else {
            o36 |= b45;
            o35 |= b45;
            o44 |= b45;
            o53 |= b45;
        }

        if (rc.onTheMap(l53) && rc.canSenseLocation(l53)) {
            if (rc.senseCloud(l53)) {
                p53 = 1.5;
                b53 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l53).getCurrentDirection();
                if (targetLocation.equals(l53) || (rc.sensePassability(l53) && !rc.canSenseRobotAtLocation(l53) && currentDirection.equals(Direction.CENTER))) {
                    p53 = rc.senseMapInfo(l53).getCooldownMultiplier(team);
                    b53 = false;
                }
            }
            if (v53 > v45 + p53) {
                v53 = v45 + p53;
                d53 = d45;
            }
            if (v53 > v44 + p53) {
                v53 = v44 + p53;
                d53 = d44;
            }
            if (v53 > v43 + p53) {
                v53 = v43 + p53;
                d53 = d43;
            }
            if (v53 > v52 + p53) {
                v53 = v52 + p53;
                d53 = d52;
            }
            
            r53 |= r45;
            r53 |= r44;
            r53 |= r43;
            r53 |= r52;
            r53 &= !b53;
            o45 |= b53;
            o44 |= b53;
            o43 |= b53;
            o52 |= b53;
        }
        else {
            o45 |= b53;
            o44 |= b53;
            o43 |= b53;
            o52 |= b53;
        }

        if (rc.onTheMap(l41) && rc.canSenseLocation(l41)) {
            if (rc.senseCloud(l41)) {
                p41 = 1.5;
                b41 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l41).getCurrentDirection();
                if (targetLocation.equals(l41) || (rc.sensePassability(l41) && !rc.canSenseRobotAtLocation(l41) && currentDirection.equals(Direction.CENTER))) {
                    p41 = rc.senseMapInfo(l41).getCooldownMultiplier(team);
                    b41 = false;
                }
            }
            if (v41 > v51 + p41) {
                v41 = v51 + p41;
                d41 = d51;
            }
            if (v41 > v42 + p41) {
                v41 = v42 + p41;
                d41 = d42;
            }
            if (v41 > v33 + p41) {
                v41 = v33 + p41;
                d41 = d33;
            }
            if (v41 > v32 + p41) {
                v41 = v32 + p41;
                d41 = d32;
            }
            
            r41 |= r51;
            r41 |= r42;
            r41 |= r33;
            r41 |= r32;
            r41 &= !b41;
            o51 |= b41;
            o42 |= b41;
            o33 |= b41;
            o32 |= b41;
        }
        else {
            o51 |= b41;
            o42 |= b41;
            o33 |= b41;
            o32 |= b41;
        }

        if (rc.onTheMap(l50) && rc.canSenseLocation(l50)) {
            if (rc.senseCloud(l50)) {
                p50 = 1.5;
                b50 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l50).getCurrentDirection();
                if (targetLocation.equals(l50) || (rc.sensePassability(l50) && !rc.canSenseRobotAtLocation(l50) && currentDirection.equals(Direction.CENTER))) {
                    p50 = rc.senseMapInfo(l50).getCooldownMultiplier(team);
                    b50 = false;
                }
            }
            if (v50 > v51 + p50) {
                v50 = v51 + p50;
                d50 = d51;
            }
            if (v50 > v42 + p50) {
                v50 = v42 + p50;
                d50 = d42;
            }
            if (v50 > v41 + p50) {
                v50 = v41 + p50;
                d50 = d41;
            }
            
            r50 |= r51;
            r50 |= r42;
            r50 |= r41;
            r50 &= !b50;
            o51 |= b50;
            o42 |= b50;
            o41 |= b50;
        }
        else {
            o51 |= b50;
            o42 |= b50;
            o41 |= b50;
        }

        if (rc.onTheMap(l54) && rc.canSenseLocation(l54)) {
            if (rc.senseCloud(l54)) {
                p54 = 1.5;
                b54 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l54).getCurrentDirection();
                if (targetLocation.equals(l54) || (rc.sensePassability(l54) && !rc.canSenseRobotAtLocation(l54) && currentDirection.equals(Direction.CENTER))) {
                    p54 = rc.senseMapInfo(l54).getCooldownMultiplier(team);
                    b54 = false;
                }
            }
            if (v54 > v45 + p54) {
                v54 = v45 + p54;
                d54 = d45;
            }
            if (v54 > v44 + p54) {
                v54 = v44 + p54;
                d54 = d44;
            }
            if (v54 > v53 + p54) {
                v54 = v53 + p54;
                d54 = d53;
            }
            
            r54 |= r45;
            r54 |= r44;
            r54 |= r53;
            r54 &= !b54;
            o45 |= b54;
            o44 |= b54;
            o53 |= b54;
        }
        else {
            o45 |= b54;
            o44 |= b54;
            o53 |= b54;
        }

        if (rc.onTheMap(l31) && rc.canSenseLocation(l31)) {
            if (rc.senseCloud(l31)) {
                p31 = 1.5;
                b31 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l31).getCurrentDirection();
                if (targetLocation.equals(l31) || (rc.sensePassability(l31) && !rc.canSenseRobotAtLocation(l31) && currentDirection.equals(Direction.CENTER))) {
                    p31 = rc.senseMapInfo(l31).getCooldownMultiplier(team);
                    b31 = false;
                }
            }
            if (v31 > v41 + p31) {
                v31 = v41 + p31;
                d31 = d41;
            }
            if (v31 > v32 + p31) {
                v31 = v32 + p31;
                d31 = d32;
            }
            
            r31 |= r41;
            r31 |= r32;
            r31 &= !b31;
            o41 |= b31;
            o32 |= b31;
        }
        else {
            o41 |= b31;
            o32 |= b31;
        }

        if (rc.onTheMap(l60) && rc.canSenseLocation(l60)) {
            if (rc.senseCloud(l60)) {
                p60 = 1.5;
                b60 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l60).getCurrentDirection();
                if (targetLocation.equals(l60) || (rc.sensePassability(l60) && !rc.canSenseRobotAtLocation(l60) && currentDirection.equals(Direction.CENTER))) {
                    p60 = rc.senseMapInfo(l60).getCooldownMultiplier(team);
                    b60 = false;
                }
            }
            if (v60 > v53 + p60) {
                v60 = v53 + p60;
                d60 = d53;
            }
            if (v60 > v52 + p60) {
                v60 = v52 + p60;
                d60 = d52;
            }
            if (v60 > v51 + p60) {
                v60 = v51 + p60;
                d60 = d51;
            }
            
            r60 |= r53;
            r60 |= r52;
            r60 |= r51;
            r60 &= !b60;
            o53 |= b60;
            o52 |= b60;
            o51 |= b60;
        }
        else {
            o53 |= b60;
            o52 |= b60;
            o51 |= b60;
        }

        if (rc.onTheMap(l37) && rc.canSenseLocation(l37)) {
            if (rc.senseCloud(l37)) {
                p37 = 1.5;
                b37 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l37).getCurrentDirection();
                if (targetLocation.equals(l37) || (rc.sensePassability(l37) && !rc.canSenseRobotAtLocation(l37) && currentDirection.equals(Direction.CENTER))) {
                    p37 = rc.senseMapInfo(l37).getCooldownMultiplier(team);
                    b37 = false;
                }
            }
            if (v37 > v36 + p37) {
                v37 = v36 + p37;
                d37 = d36;
            }
            if (v37 > v45 + p37) {
                v37 = v45 + p37;
                d37 = d45;
            }
            
            r37 |= r36;
            r37 |= r45;
            r37 &= !b37;
            o36 |= b37;
            o45 |= b37;
        }
        else {
            o36 |= b37;
            o45 |= b37;
        }

        if (rc.onTheMap(l40) && rc.canSenseLocation(l40)) {
            if (rc.senseCloud(l40)) {
                p40 = 1.5;
                b40 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l40).getCurrentDirection();
                if (targetLocation.equals(l40) || (rc.sensePassability(l40) && !rc.canSenseRobotAtLocation(l40) && currentDirection.equals(Direction.CENTER))) {
                    p40 = rc.senseMapInfo(l40).getCooldownMultiplier(team);
                    b40 = false;
                }
            }
            if (v40 > v50 + p40) {
                v40 = v50 + p40;
                d40 = d50;
            }
            if (v40 > v41 + p40) {
                v40 = v41 + p40;
                d40 = d41;
            }
            if (v40 > v32 + p40) {
                v40 = v32 + p40;
                d40 = d32;
            }
            if (v40 > v31 + p40) {
                v40 = v31 + p40;
                d40 = d31;
            }
            
            r40 |= r50;
            r40 |= r41;
            r40 |= r32;
            r40 |= r31;
            r40 &= !b40;
            o50 |= b40;
            o41 |= b40;
            o32 |= b40;
            o31 |= b40;
        }
        else {
            o50 |= b40;
            o41 |= b40;
            o32 |= b40;
            o31 |= b40;
        }

        if (rc.onTheMap(l46) && rc.canSenseLocation(l46)) {
            if (rc.senseCloud(l46)) {
                p46 = 1.5;
                b46 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l46).getCurrentDirection();
                if (targetLocation.equals(l46) || (rc.sensePassability(l46) && !rc.canSenseRobotAtLocation(l46) && currentDirection.equals(Direction.CENTER))) {
                    p46 = rc.senseMapInfo(l46).getCooldownMultiplier(team);
                    b46 = false;
                }
            }
            if (v46 > v37 + p46) {
                v46 = v37 + p46;
                d46 = d37;
            }
            if (v46 > v36 + p46) {
                v46 = v36 + p46;
                d46 = d36;
            }
            if (v46 > v45 + p46) {
                v46 = v45 + p46;
                d46 = d45;
            }
            if (v46 > v54 + p46) {
                v46 = v54 + p46;
                d46 = d54;
            }
            
            r46 |= r37;
            r46 |= r36;
            r46 |= r45;
            r46 |= r54;
            r46 &= !b46;
            o37 |= b46;
            o36 |= b46;
            o45 |= b46;
            o54 |= b46;
        }
        else {
            o37 |= b46;
            o36 |= b46;
            o45 |= b46;
            o54 |= b46;
        }

        if (rc.onTheMap(l61) && rc.canSenseLocation(l61)) {
            if (rc.senseCloud(l61)) {
                p61 = 1.5;
                b61 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l61).getCurrentDirection();
                if (targetLocation.equals(l61) || (rc.sensePassability(l61) && !rc.canSenseRobotAtLocation(l61) && currentDirection.equals(Direction.CENTER))) {
                    p61 = rc.senseMapInfo(l61).getCooldownMultiplier(team);
                    b61 = false;
                }
            }
            if (v61 > v54 + p61) {
                v61 = v54 + p61;
                d61 = d54;
            }
            if (v61 > v53 + p61) {
                v61 = v53 + p61;
                d61 = d53;
            }
            if (v61 > v52 + p61) {
                v61 = v52 + p61;
                d61 = d52;
            }
            if (v61 > v60 + p61) {
                v61 = v60 + p61;
                d61 = d60;
            }
            
            r61 |= r54;
            r61 |= r53;
            r61 |= r52;
            r61 |= r60;
            r61 &= !b61;
            o54 |= b61;
            o53 |= b61;
            o52 |= b61;
            o60 |= b61;
        }
        else {
            o54 |= b61;
            o53 |= b61;
            o52 |= b61;
            o60 |= b61;
        }

        if (rc.onTheMap(l59) && rc.canSenseLocation(l59)) {
            if (rc.senseCloud(l59)) {
                p59 = 1.5;
                b59 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l59).getCurrentDirection();
                if (targetLocation.equals(l59) || (rc.sensePassability(l59) && !rc.canSenseRobotAtLocation(l59) && currentDirection.equals(Direction.CENTER))) {
                    p59 = rc.senseMapInfo(l59).getCooldownMultiplier(team);
                    b59 = false;
                }
            }
            if (v59 > v60 + p59) {
                v59 = v60 + p59;
                d59 = d60;
            }
            if (v59 > v52 + p59) {
                v59 = v52 + p59;
                d59 = d52;
            }
            if (v59 > v51 + p59) {
                v59 = v51 + p59;
                d59 = d51;
            }
            if (v59 > v50 + p59) {
                v59 = v50 + p59;
                d59 = d50;
            }
            
            r59 |= r60;
            r59 |= r52;
            r59 |= r51;
            r59 |= r50;
            r59 &= !b59;
            o60 |= b59;
            o52 |= b59;
            o51 |= b59;
            o50 |= b59;
        }
        else {
            o60 |= b59;
            o52 |= b59;
            o51 |= b59;
            o50 |= b59;
        }

        if (rc.onTheMap(l62) && rc.canSenseLocation(l62)) {
            if (rc.senseCloud(l62)) {
                p62 = 1.5;
                b62 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l62).getCurrentDirection();
                if (targetLocation.equals(l62) || (rc.sensePassability(l62) && !rc.canSenseRobotAtLocation(l62) && currentDirection.equals(Direction.CENTER))) {
                    p62 = rc.senseMapInfo(l62).getCooldownMultiplier(team);
                    b62 = false;
                }
            }
            if (v62 > v55 + p62) {
                v62 = v55 + p62;
                d62 = d55;
            }
            if (v62 > v54 + p62) {
                v62 = v54 + p62;
                d62 = d54;
            }
            if (v62 > v53 + p62) {
                v62 = v53 + p62;
                d62 = d53;
            }
            if (v62 > v61 + p62) {
                v62 = v61 + p62;
                d62 = d61;
            }
            
            r62 |= r55;
            r62 |= r54;
            r62 |= r53;
            r62 |= r61;
            r62 &= !b62;
            o55 |= b62;
            o54 |= b62;
            o53 |= b62;
            o61 |= b62;
        }
        else {
            o55 |= b62;
            o54 |= b62;
            o53 |= b62;
            o61 |= b62;
        }

        if (rc.onTheMap(l58) && rc.canSenseLocation(l58)) {
            if (rc.senseCloud(l58)) {
                p58 = 1.5;
                b58 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l58).getCurrentDirection();
                if (targetLocation.equals(l58) || (rc.sensePassability(l58) && !rc.canSenseRobotAtLocation(l58) && currentDirection.equals(Direction.CENTER))) {
                    p58 = rc.senseMapInfo(l58).getCooldownMultiplier(team);
                    b58 = false;
                }
            }
            if (v58 > v59 + p58) {
                v58 = v59 + p58;
                d58 = d59;
            }
            if (v58 > v51 + p58) {
                v58 = v51 + p58;
                d58 = d51;
            }
            if (v58 > v50 + p58) {
                v58 = v50 + p58;
                d58 = d50;
            }
            if (v58 > v49 + p58) {
                v58 = v49 + p58;
                d58 = d49;
            }
            
            r58 |= r59;
            r58 |= r51;
            r58 |= r50;
            r58 |= r49;
            r58 &= !b58;
            o59 |= b58;
            o51 |= b58;
            o50 |= b58;
            o49 |= b58;
        }
        else {
            o59 |= b58;
            o51 |= b58;
            o50 |= b58;
            o49 |= b58;
        }

        if (rc.onTheMap(l49) && rc.canSenseLocation(l49)) {
            if (rc.senseCloud(l49)) {
                p49 = 1.5;
                b49 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l49).getCurrentDirection();
                if (targetLocation.equals(l49) || (rc.sensePassability(l49) && !rc.canSenseRobotAtLocation(l49) && currentDirection.equals(Direction.CENTER))) {
                    p49 = rc.senseMapInfo(l49).getCooldownMultiplier(team);
                    b49 = false;
                }
            }
            if (v49 > v58 + p49) {
                v49 = v58 + p49;
                d49 = d58;
            }
            if (v49 > v50 + p49) {
                v49 = v50 + p49;
                d49 = d50;
            }
            if (v49 > v41 + p49) {
                v49 = v41 + p49;
                d49 = d41;
            }
            if (v49 > v40 + p49) {
                v49 = v40 + p49;
                d49 = d40;
            }
            
            r49 |= r58;
            r49 |= r50;
            r49 |= r41;
            r49 |= r40;
            r49 &= !b49;
            o58 |= b49;
            o50 |= b49;
            o41 |= b49;
            o40 |= b49;
        }
        else {
            o58 |= b49;
            o50 |= b49;
            o41 |= b49;
            o40 |= b49;
        }

        if (rc.onTheMap(l55) && rc.canSenseLocation(l55)) {
            if (rc.senseCloud(l55)) {
                p55 = 1.5;
                b55 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l55).getCurrentDirection();
                if (targetLocation.equals(l55) || (rc.sensePassability(l55) && !rc.canSenseRobotAtLocation(l55) && currentDirection.equals(Direction.CENTER))) {
                    p55 = rc.senseMapInfo(l55).getCooldownMultiplier(team);
                    b55 = false;
                }
            }
            if (v55 > v46 + p55) {
                v55 = v46 + p55;
                d55 = d46;
            }
            if (v55 > v45 + p55) {
                v55 = v45 + p55;
                d55 = d45;
            }
            if (v55 > v54 + p55) {
                v55 = v54 + p55;
                d55 = d54;
            }
            if (v55 > v62 + p55) {
                v55 = v62 + p55;
                d55 = d62;
            }
            
            r55 |= r46;
            r55 |= r45;
            r55 |= r54;
            r55 |= r62;
            r55 &= !b55;
            o46 |= b55;
            o45 |= b55;
            o54 |= b55;
            o62 |= b55;
        }
        else {
            o46 |= b55;
            o45 |= b55;
            o54 |= b55;
            o62 |= b55;
        }

        if (rc.onTheMap(l63) && rc.canSenseLocation(l63)) {
            if (rc.senseCloud(l63)) {
                p63 = 1.5;
                b63 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l63).getCurrentDirection();
                if (targetLocation.equals(l63) || (rc.sensePassability(l63) && !rc.canSenseRobotAtLocation(l63) && currentDirection.equals(Direction.CENTER))) {
                    p63 = rc.senseMapInfo(l63).getCooldownMultiplier(team);
                    b63 = false;
                }
            }
            if (v63 > v55 + p63) {
                v63 = v55 + p63;
                d63 = d55;
            }
            if (v63 > v54 + p63) {
                v63 = v54 + p63;
                d63 = d54;
            }
            if (v63 > v62 + p63) {
                v63 = v62 + p63;
                d63 = d62;
            }
            
            r63 |= r55;
            r63 |= r54;
            r63 |= r62;
            r63 &= !b63;
            o55 |= b63;
            o54 |= b63;
            o62 |= b63;
        }
        else {
            o55 |= b63;
            o54 |= b63;
            o62 |= b63;
        }

        if (rc.onTheMap(l57) && rc.canSenseLocation(l57)) {
            if (rc.senseCloud(l57)) {
                p57 = 1.5;
                b57 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l57).getCurrentDirection();
                if (targetLocation.equals(l57) || (rc.sensePassability(l57) && !rc.canSenseRobotAtLocation(l57) && currentDirection.equals(Direction.CENTER))) {
                    p57 = rc.senseMapInfo(l57).getCooldownMultiplier(team);
                    b57 = false;
                }
            }
            if (v57 > v58 + p57) {
                v57 = v58 + p57;
                d57 = d58;
            }
            if (v57 > v50 + p57) {
                v57 = v50 + p57;
                d57 = d50;
            }
            if (v57 > v49 + p57) {
                v57 = v49 + p57;
                d57 = d49;
            }
            
            r57 |= r58;
            r57 |= r50;
            r57 |= r49;
            r57 &= !b57;
            o58 |= b57;
            o50 |= b57;
            o49 |= b57;
        }
        else {
            o58 |= b57;
            o50 |= b57;
            o49 |= b57;
        }

        if (rc.onTheMap(l38) && rc.canSenseLocation(l38)) {
            if (rc.senseCloud(l38)) {
                p38 = 1.5;
                b38 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l38).getCurrentDirection();
                if (targetLocation.equals(l38) || (rc.sensePassability(l38) && !rc.canSenseRobotAtLocation(l38) && currentDirection.equals(Direction.CENTER))) {
                    p38 = rc.senseMapInfo(l38).getCooldownMultiplier(team);
                    b38 = false;
                }
            }
            if (v38 > v37 + p38) {
                v38 = v37 + p38;
                d38 = d37;
            }
            if (v38 > v46 + p38) {
                v38 = v46 + p38;
                d38 = d46;
            }
            
            r38 |= r37;
            r38 |= r46;
            r38 &= !b38;
            o37 |= b38;
            o46 |= b38;
        }
        else {
            o37 |= b38;
            o46 |= b38;
        }

        if (rc.onTheMap(l30) && rc.canSenseLocation(l30)) {
            if (rc.senseCloud(l30)) {
                p30 = 1.5;
                b30 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l30).getCurrentDirection();
                if (targetLocation.equals(l30) || (rc.sensePassability(l30) && !rc.canSenseRobotAtLocation(l30) && currentDirection.equals(Direction.CENTER))) {
                    p30 = rc.senseMapInfo(l30).getCooldownMultiplier(team);
                    b30 = false;
                }
            }
            if (v30 > v40 + p30) {
                v30 = v40 + p30;
                d30 = d40;
            }
            if (v30 > v31 + p30) {
                v30 = v31 + p30;
                d30 = d31;
            }
            
            r30 |= r40;
            r30 |= r31;
            r30 &= !b30;
            o40 |= b30;
            o31 |= b30;
        }
        else {
            o40 |= b30;
            o31 |= b30;
        }

        if (rc.onTheMap(l66) && rc.canSenseLocation(l66)) {
            if (rc.senseCloud(l66)) {
                p66 = 1.5;
                b66 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l66).getCurrentDirection();
                if (targetLocation.equals(l66) || (rc.sensePassability(l66) && !rc.canSenseRobotAtLocation(l66) && currentDirection.equals(Direction.CENTER))) {
                    p66 = rc.senseMapInfo(l66).getCooldownMultiplier(team);
                    b66 = false;
                }
            }
            if (v66 > v61 + p66) {
                v66 = v61 + p66;
                d66 = d61;
            }
            if (v66 > v60 + p66) {
                v66 = v60 + p66;
                d66 = d60;
            }
            if (v66 > v59 + p66) {
                v66 = v59 + p66;
                d66 = d59;
            }
            
            r66 |= r61;
            r66 |= r60;
            r66 |= r59;
            r66 &= !b66;
            o61 |= b66;
            o60 |= b66;
            o59 |= b66;
        }
        else {
            o61 |= b66;
            o60 |= b66;
            o59 |= b66;
        }

        if (rc.onTheMap(l39) && rc.canSenseLocation(l39)) {
            if (rc.senseCloud(l39)) {
                p39 = 1.5;
                b39 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l39).getCurrentDirection();
                if (targetLocation.equals(l39) || (rc.sensePassability(l39) && !rc.canSenseRobotAtLocation(l39) && currentDirection.equals(Direction.CENTER))) {
                    p39 = rc.senseMapInfo(l39).getCooldownMultiplier(team);
                    b39 = false;
                }
            }
            if (v39 > v49 + p39) {
                v39 = v49 + p39;
                d39 = d49;
            }
            if (v39 > v40 + p39) {
                v39 = v40 + p39;
                d39 = d40;
            }
            if (v39 > v31 + p39) {
                v39 = v31 + p39;
                d39 = d31;
            }
            if (v39 > v30 + p39) {
                v39 = v30 + p39;
                d39 = d30;
            }
            
            r39 |= r49;
            r39 |= r40;
            r39 |= r31;
            r39 |= r30;
            r39 &= !b39;
            o49 |= b39;
            o40 |= b39;
            o31 |= b39;
            o30 |= b39;
        }
        else {
            o49 |= b39;
            o40 |= b39;
            o31 |= b39;
            o30 |= b39;
        }

        if (rc.onTheMap(l47) && rc.canSenseLocation(l47)) {
            if (rc.senseCloud(l47)) {
                p47 = 1.5;
                b47 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l47).getCurrentDirection();
                if (targetLocation.equals(l47) || (rc.sensePassability(l47) && !rc.canSenseRobotAtLocation(l47) && currentDirection.equals(Direction.CENTER))) {
                    p47 = rc.senseMapInfo(l47).getCooldownMultiplier(team);
                    b47 = false;
                }
            }
            if (v47 > v38 + p47) {
                v47 = v38 + p47;
                d47 = d38;
            }
            if (v47 > v37 + p47) {
                v47 = v37 + p47;
                d47 = d37;
            }
            if (v47 > v46 + p47) {
                v47 = v46 + p47;
                d47 = d46;
            }
            if (v47 > v55 + p47) {
                v47 = v55 + p47;
                d47 = d55;
            }
            
            r47 |= r38;
            r47 |= r37;
            r47 |= r46;
            r47 |= r55;
            r47 &= !b47;
            o38 |= b47;
            o37 |= b47;
            o46 |= b47;
            o55 |= b47;
        }
        else {
            o38 |= b47;
            o37 |= b47;
            o46 |= b47;
            o55 |= b47;
        }

        if (rc.onTheMap(l65) && rc.canSenseLocation(l65)) {
            if (rc.senseCloud(l65)) {
                p65 = 1.5;
                b65 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l65).getCurrentDirection();
                if (targetLocation.equals(l65) || (rc.sensePassability(l65) && !rc.canSenseRobotAtLocation(l65) && currentDirection.equals(Direction.CENTER))) {
                    p65 = rc.senseMapInfo(l65).getCooldownMultiplier(team);
                    b65 = false;
                }
            }
            if (v65 > v66 + p65) {
                v65 = v66 + p65;
                d65 = d66;
            }
            if (v65 > v60 + p65) {
                v65 = v60 + p65;
                d65 = d60;
            }
            if (v65 > v59 + p65) {
                v65 = v59 + p65;
                d65 = d59;
            }
            if (v65 > v58 + p65) {
                v65 = v58 + p65;
                d65 = d58;
            }
            
            r65 |= r66;
            r65 |= r60;
            r65 |= r59;
            r65 |= r58;
            r65 &= !b65;
            o66 |= b65;
            o60 |= b65;
            o59 |= b65;
            o58 |= b65;
        }
        else {
            o66 |= b65;
            o60 |= b65;
            o59 |= b65;
            o58 |= b65;
        }

        if (rc.onTheMap(l67) && rc.canSenseLocation(l67)) {
            if (rc.senseCloud(l67)) {
                p67 = 1.5;
                b67 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l67).getCurrentDirection();
                if (targetLocation.equals(l67) || (rc.sensePassability(l67) && !rc.canSenseRobotAtLocation(l67) && currentDirection.equals(Direction.CENTER))) {
                    p67 = rc.senseMapInfo(l67).getCooldownMultiplier(team);
                    b67 = false;
                }
            }
            if (v67 > v62 + p67) {
                v67 = v62 + p67;
                d67 = d62;
            }
            if (v67 > v61 + p67) {
                v67 = v61 + p67;
                d67 = d61;
            }
            if (v67 > v60 + p67) {
                v67 = v60 + p67;
                d67 = d60;
            }
            if (v67 > v66 + p67) {
                v67 = v66 + p67;
                d67 = d66;
            }
            
            r67 |= r62;
            r67 |= r61;
            r67 |= r60;
            r67 |= r66;
            r67 &= !b67;
            o62 |= b67;
            o61 |= b67;
            o60 |= b67;
            o66 |= b67;
        }
        else {
            o62 |= b67;
            o61 |= b67;
            o60 |= b67;
            o66 |= b67;
        }

        if (rc.onTheMap(l64) && rc.canSenseLocation(l64)) {
            if (rc.senseCloud(l64)) {
                p64 = 1.5;
                b64 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l64).getCurrentDirection();
                if (targetLocation.equals(l64) || (rc.sensePassability(l64) && !rc.canSenseRobotAtLocation(l64) && currentDirection.equals(Direction.CENTER))) {
                    p64 = rc.senseMapInfo(l64).getCooldownMultiplier(team);
                    b64 = false;
                }
            }
            if (v64 > v65 + p64) {
                v64 = v65 + p64;
                d64 = d65;
            }
            if (v64 > v59 + p64) {
                v64 = v59 + p64;
                d64 = d59;
            }
            if (v64 > v58 + p64) {
                v64 = v58 + p64;
                d64 = d58;
            }
            if (v64 > v57 + p64) {
                v64 = v57 + p64;
                d64 = d57;
            }
            
            r64 |= r65;
            r64 |= r59;
            r64 |= r58;
            r64 |= r57;
            r64 &= !b64;
            o65 |= b64;
            o59 |= b64;
            o58 |= b64;
            o57 |= b64;
        }
        else {
            o65 |= b64;
            o59 |= b64;
            o58 |= b64;
            o57 |= b64;
        }

        if (rc.onTheMap(l48) && rc.canSenseLocation(l48)) {
            if (rc.senseCloud(l48)) {
                p48 = 1.5;
                b48 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l48).getCurrentDirection();
                if (targetLocation.equals(l48) || (rc.sensePassability(l48) && !rc.canSenseRobotAtLocation(l48) && currentDirection.equals(Direction.CENTER))) {
                    p48 = rc.senseMapInfo(l48).getCooldownMultiplier(team);
                    b48 = false;
                }
            }
            if (v48 > v57 + p48) {
                v48 = v57 + p48;
                d48 = d57;
            }
            if (v48 > v49 + p48) {
                v48 = v49 + p48;
                d48 = d49;
            }
            if (v48 > v40 + p48) {
                v48 = v40 + p48;
                d48 = d40;
            }
            if (v48 > v39 + p48) {
                v48 = v39 + p48;
                d48 = d39;
            }
            
            r48 |= r57;
            r48 |= r49;
            r48 |= r40;
            r48 |= r39;
            r48 &= !b48;
            o57 |= b48;
            o49 |= b48;
            o40 |= b48;
            o39 |= b48;
        }
        else {
            o57 |= b48;
            o49 |= b48;
            o40 |= b48;
            o39 |= b48;
        }

        if (rc.onTheMap(l68) && rc.canSenseLocation(l68)) {
            if (rc.senseCloud(l68)) {
                p68 = 1.5;
                b68 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l68).getCurrentDirection();
                if (targetLocation.equals(l68) || (rc.sensePassability(l68) && !rc.canSenseRobotAtLocation(l68) && currentDirection.equals(Direction.CENTER))) {
                    p68 = rc.senseMapInfo(l68).getCooldownMultiplier(team);
                    b68 = false;
                }
            }
            if (v68 > v63 + p68) {
                v68 = v63 + p68;
                d68 = d63;
            }
            if (v68 > v62 + p68) {
                v68 = v62 + p68;
                d68 = d62;
            }
            if (v68 > v61 + p68) {
                v68 = v61 + p68;
                d68 = d61;
            }
            if (v68 > v67 + p68) {
                v68 = v67 + p68;
                d68 = d67;
            }
            
            r68 |= r63;
            r68 |= r62;
            r68 |= r61;
            r68 |= r67;
            r68 &= !b68;
            o63 |= b68;
            o62 |= b68;
            o61 |= b68;
            o67 |= b68;
        }
        else {
            o63 |= b68;
            o62 |= b68;
            o61 |= b68;
            o67 |= b68;
        }

        if (rc.onTheMap(l56) && rc.canSenseLocation(l56)) {
            if (rc.senseCloud(l56)) {
                p56 = 1.5;
                b56 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l56).getCurrentDirection();
                if (targetLocation.equals(l56) || (rc.sensePassability(l56) && !rc.canSenseRobotAtLocation(l56) && currentDirection.equals(Direction.CENTER))) {
                    p56 = rc.senseMapInfo(l56).getCooldownMultiplier(team);
                    b56 = false;
                }
            }
            if (v56 > v47 + p56) {
                v56 = v47 + p56;
                d56 = d47;
            }
            if (v56 > v46 + p56) {
                v56 = v46 + p56;
                d56 = d46;
            }
            if (v56 > v55 + p56) {
                v56 = v55 + p56;
                d56 = d55;
            }
            if (v56 > v63 + p56) {
                v56 = v63 + p56;
                d56 = d63;
            }
            
            r56 |= r47;
            r56 |= r46;
            r56 |= r55;
            r56 |= r63;
            r56 &= !b56;
            o47 |= b56;
            o46 |= b56;
            o55 |= b56;
            o63 |= b56;
        }
        else {
            o47 |= b56;
            o46 |= b56;
            o55 |= b56;
            o63 |= b56;
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
                        if (v30 < 10000) {
                            return d30;
                        }
                    case -3:
                        if (v31 < 10000) {
                            return d31;
                        }
                    case -2:
                        if (v32 < 10000) {
                            return d32;
                        }
                    case -1:
                        if (v33 < 10000) {
                            return d33;
                        }
                    case 0:
                        if (v34 < 10000) {
                            return d34;
                        }
                    case 1:
                        if (v35 < 10000) {
                            return d35;
                        }
                    case 2:
                        if (v36 < 10000) {
                            return d36;
                        }
                    case 3:
                        if (v37 < 10000) {
                            return d37;
                        }
                    case 4:
                        if (v38 < 10000) {
                            return d38;
                        }
                } break;

            case 1:
                switch(dy) {
                    case -4:
                        if (v39 < 10000) {
                            return d39;
                        }
                    case -3:
                        if (v40 < 10000) {
                            return d40;
                        }
                    case -2:
                        if (v41 < 10000) {
                            return d41;
                        }
                    case -1:
                        if (v42 < 10000) {
                            return d42;
                        }
                    case 0:
                        if (v43 < 10000) {
                            return d43;
                        }
                    case 1:
                        if (v44 < 10000) {
                            return d44;
                        }
                    case 2:
                        if (v45 < 10000) {
                            return d45;
                        }
                    case 3:
                        if (v46 < 10000) {
                            return d46;
                        }
                    case 4:
                        if (v47 < 10000) {
                            return d47;
                        }
                } break;

            case 2:
                switch(dy) {
                    case -4:
                        if (v48 < 10000) {
                            return d48;
                        }
                    case -3:
                        if (v49 < 10000) {
                            return d49;
                        }
                    case -2:
                        if (v50 < 10000) {
                            return d50;
                        }
                    case -1:
                        if (v51 < 10000) {
                            return d51;
                        }
                    case 0:
                        if (v52 < 10000) {
                            return d52;
                        }
                    case 1:
                        if (v53 < 10000) {
                            return d53;
                        }
                    case 2:
                        if (v54 < 10000) {
                            return d54;
                        }
                    case 3:
                        if (v55 < 10000) {
                            return d55;
                        }
                    case 4:
                        if (v56 < 10000) {
                            return d56;
                        }
                } break;

            case 3:
                switch(dy) {
                    case -3:
                        if (v57 < 10000) {
                            return d57;
                        }
                    case -2:
                        if (v58 < 10000) {
                            return d58;
                        }
                    case -1:
                        if (v59 < 10000) {
                            return d59;
                        }
                    case 0:
                        if (v60 < 10000) {
                            return d60;
                        }
                    case 1:
                        if (v61 < 10000) {
                            return d61;
                        }
                    case 2:
                        if (v62 < 10000) {
                            return d62;
                        }
                    case 3:
                        if (v63 < 10000) {
                            return d63;
                        }
                } break;

            case 4:
                switch(dy) {
                    case -2:
                        if (v64 < 10000) {
                            return d64;
                        }
                    case -1:
                        if (v65 < 10000) {
                            return d65;
                        }
                    case 0:
                        if (v66 < 10000) {
                            return d66;
                        }
                    case 1:
                        if (v67 < 10000) {
                            return d67;
                        }
                    case 2:
                        if (v68 < 10000) {
                            return d68;
                        }
                } break;

        }
    
        o30 = r30;
        o38 = r38;
        o39 = r39;
        o47 = r47;
        o48 = r48;
        o56 = r56;
        o57 = r57;
        o63 = r63;
        o64 = r64;
        o65 = r65;
        o66 = r66;
        o67 = r67;
        o68 = r68;
        Direction ans = Direction.CENTER;

        if (r30 && o30) {
            double dist30 = v30 + 1.5 * Math.sqrt(l30.distanceSquaredTo(targetLocation));
            if (dist30 < localBest) {
                localBest = dist30;
                ans = d30;
                best = l30;
            }
        }

        if (r38 && o38) {
            double dist38 = v38 + 1.5 * Math.sqrt(l38.distanceSquaredTo(targetLocation));
            if (dist38 < localBest) {
                localBest = dist38;
                ans = d38;
                best = l38;
            }
        }

        if (r39 && o39) {
            double dist39 = v39 + 1.5 * Math.sqrt(l39.distanceSquaredTo(targetLocation));
            if (dist39 < localBest) {
                localBest = dist39;
                ans = d39;
                best = l39;
            }
        }

        if (r47 && o47) {
            double dist47 = v47 + 1.5 * Math.sqrt(l47.distanceSquaredTo(targetLocation));
            if (dist47 < localBest) {
                localBest = dist47;
                ans = d47;
                best = l47;
            }
        }

        if (r48 && o48) {
            double dist48 = v48 + 1.5 * Math.sqrt(l48.distanceSquaredTo(targetLocation));
            if (dist48 < localBest) {
                localBest = dist48;
                ans = d48;
                best = l48;
            }
        }

        if (r56 && o56) {
            double dist56 = v56 + 1.5 * Math.sqrt(l56.distanceSquaredTo(targetLocation));
            if (dist56 < localBest) {
                localBest = dist56;
                ans = d56;
                best = l56;
            }
        }

        if (r57 && o57) {
            double dist57 = v57 + 1.5 * Math.sqrt(l57.distanceSquaredTo(targetLocation));
            if (dist57 < localBest) {
                localBest = dist57;
                ans = d57;
                best = l57;
            }
        }

        if (r63 && o63) {
            double dist63 = v63 + 1.5 * Math.sqrt(l63.distanceSquaredTo(targetLocation));
            if (dist63 < localBest) {
                localBest = dist63;
                ans = d63;
                best = l63;
            }
        }

        if (r64 && o64) {
            double dist64 = v64 + 1.5 * Math.sqrt(l64.distanceSquaredTo(targetLocation));
            if (dist64 < localBest) {
                localBest = dist64;
                ans = d64;
                best = l64;
            }
        }

        if (r65 && o65) {
            double dist65 = v65 + 1.5 * Math.sqrt(l65.distanceSquaredTo(targetLocation));
            if (dist65 < localBest) {
                localBest = dist65;
                ans = d65;
                best = l65;
            }
        }

        if (r66 && o66) {
            double dist66 = v66 + 1.5 * Math.sqrt(l66.distanceSquaredTo(targetLocation));
            if (dist66 < localBest) {
                localBest = dist66;
                ans = d66;
                best = l66;
            }
        }

        if (r67 && o67) {
            double dist67 = v67 + 1.5 * Math.sqrt(l67.distanceSquaredTo(targetLocation));
            if (dist67 < localBest) {
                localBest = dist67;
                ans = d67;
                best = l67;
            }
        }

        if (r68 && o68) {
            double dist68 = v68 + 1.5 * Math.sqrt(l68.distanceSquaredTo(targetLocation));
            if (dist68 < localBest) {
                localBest = dist68;
                ans = d68;
                best = l68;
            }
        }

        draws2();
        rc.setIndicatorDot(best, 0, 0, 255);
        if (localBest < globalBest) {
            globalBest = localBest;
            return ans;
        }
        return getBestDirectionWallFollow2(ans);
    }

    private Direction getBestDirectionWallFollow2(Direction prev) throws GameActionException {
        Direction ans = Direction.CENTER;
        int minDistance = closestWallLocations.isEmpty() ? 1000000 : currentLocation.distanceSquaredTo(closestWallLocations.get(0));
    
        if (b30) {
            int distance = currentLocation.distanceSquaredTo(l30);
            if (distance == minDistance) {
                closestWallLocations.add(l30);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l30);
                minDistance = distance;
            }
        }

        if (b31) {
            int distance = currentLocation.distanceSquaredTo(l31);
            if (distance == minDistance) {
                closestWallLocations.add(l31);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l31);
                minDistance = distance;
            }
        }

        if (b32) {
            int distance = currentLocation.distanceSquaredTo(l32);
            if (distance == minDistance) {
                closestWallLocations.add(l32);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l32);
                minDistance = distance;
            }
        }

        if (b33) {
            int distance = currentLocation.distanceSquaredTo(l33);
            if (distance == minDistance) {
                closestWallLocations.add(l33);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l33);
                minDistance = distance;
            }
        }

        if (b35) {
            int distance = currentLocation.distanceSquaredTo(l35);
            if (distance == minDistance) {
                closestWallLocations.add(l35);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l35);
                minDistance = distance;
            }
        }

        if (b36) {
            int distance = currentLocation.distanceSquaredTo(l36);
            if (distance == minDistance) {
                closestWallLocations.add(l36);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l36);
                minDistance = distance;
            }
        }

        if (b37) {
            int distance = currentLocation.distanceSquaredTo(l37);
            if (distance == minDistance) {
                closestWallLocations.add(l37);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l37);
                minDistance = distance;
            }
        }

        if (b38) {
            int distance = currentLocation.distanceSquaredTo(l38);
            if (distance == minDistance) {
                closestWallLocations.add(l38);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l38);
                minDistance = distance;
            }
        }

        if (b39) {
            int distance = currentLocation.distanceSquaredTo(l39);
            if (distance == minDistance) {
                closestWallLocations.add(l39);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l39);
                minDistance = distance;
            }
        }

        if (b40) {
            int distance = currentLocation.distanceSquaredTo(l40);
            if (distance == minDistance) {
                closestWallLocations.add(l40);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l40);
                minDistance = distance;
            }
        }

        if (b41) {
            int distance = currentLocation.distanceSquaredTo(l41);
            if (distance == minDistance) {
                closestWallLocations.add(l41);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l41);
                minDistance = distance;
            }
        }

        if (b42) {
            int distance = currentLocation.distanceSquaredTo(l42);
            if (distance == minDistance) {
                closestWallLocations.add(l42);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l42);
                minDistance = distance;
            }
        }

        if (b43) {
            int distance = currentLocation.distanceSquaredTo(l43);
            if (distance == minDistance) {
                closestWallLocations.add(l43);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l43);
                minDistance = distance;
            }
        }

        if (b44) {
            int distance = currentLocation.distanceSquaredTo(l44);
            if (distance == minDistance) {
                closestWallLocations.add(l44);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l44);
                minDistance = distance;
            }
        }

        if (b45) {
            int distance = currentLocation.distanceSquaredTo(l45);
            if (distance == minDistance) {
                closestWallLocations.add(l45);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l45);
                minDistance = distance;
            }
        }

        if (b46) {
            int distance = currentLocation.distanceSquaredTo(l46);
            if (distance == minDistance) {
                closestWallLocations.add(l46);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l46);
                minDistance = distance;
            }
        }

        if (b47) {
            int distance = currentLocation.distanceSquaredTo(l47);
            if (distance == minDistance) {
                closestWallLocations.add(l47);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l47);
                minDistance = distance;
            }
        }

        if (b48) {
            int distance = currentLocation.distanceSquaredTo(l48);
            if (distance == minDistance) {
                closestWallLocations.add(l48);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l48);
                minDistance = distance;
            }
        }

        if (b49) {
            int distance = currentLocation.distanceSquaredTo(l49);
            if (distance == minDistance) {
                closestWallLocations.add(l49);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l49);
                minDistance = distance;
            }
        }

        if (b50) {
            int distance = currentLocation.distanceSquaredTo(l50);
            if (distance == minDistance) {
                closestWallLocations.add(l50);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l50);
                minDistance = distance;
            }
        }

        if (b51) {
            int distance = currentLocation.distanceSquaredTo(l51);
            if (distance == minDistance) {
                closestWallLocations.add(l51);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l51);
                minDistance = distance;
            }
        }

        if (b52) {
            int distance = currentLocation.distanceSquaredTo(l52);
            if (distance == minDistance) {
                closestWallLocations.add(l52);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l52);
                minDistance = distance;
            }
        }

        if (b53) {
            int distance = currentLocation.distanceSquaredTo(l53);
            if (distance == minDistance) {
                closestWallLocations.add(l53);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l53);
                minDistance = distance;
            }
        }

        if (b54) {
            int distance = currentLocation.distanceSquaredTo(l54);
            if (distance == minDistance) {
                closestWallLocations.add(l54);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l54);
                minDistance = distance;
            }
        }

        if (b55) {
            int distance = currentLocation.distanceSquaredTo(l55);
            if (distance == minDistance) {
                closestWallLocations.add(l55);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l55);
                minDistance = distance;
            }
        }

        if (b56) {
            int distance = currentLocation.distanceSquaredTo(l56);
            if (distance == minDistance) {
                closestWallLocations.add(l56);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l56);
                minDistance = distance;
            }
        }

        if (b57) {
            int distance = currentLocation.distanceSquaredTo(l57);
            if (distance == minDistance) {
                closestWallLocations.add(l57);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l57);
                minDistance = distance;
            }
        }

        if (b58) {
            int distance = currentLocation.distanceSquaredTo(l58);
            if (distance == minDistance) {
                closestWallLocations.add(l58);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l58);
                minDistance = distance;
            }
        }

        if (b59) {
            int distance = currentLocation.distanceSquaredTo(l59);
            if (distance == minDistance) {
                closestWallLocations.add(l59);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l59);
                minDistance = distance;
            }
        }

        if (b60) {
            int distance = currentLocation.distanceSquaredTo(l60);
            if (distance == minDistance) {
                closestWallLocations.add(l60);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l60);
                minDistance = distance;
            }
        }

        if (b61) {
            int distance = currentLocation.distanceSquaredTo(l61);
            if (distance == minDistance) {
                closestWallLocations.add(l61);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l61);
                minDistance = distance;
            }
        }

        if (b62) {
            int distance = currentLocation.distanceSquaredTo(l62);
            if (distance == minDistance) {
                closestWallLocations.add(l62);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l62);
                minDistance = distance;
            }
        }

        if (b63) {
            int distance = currentLocation.distanceSquaredTo(l63);
            if (distance == minDistance) {
                closestWallLocations.add(l63);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l63);
                minDistance = distance;
            }
        }

        if (b64) {
            int distance = currentLocation.distanceSquaredTo(l64);
            if (distance == minDistance) {
                closestWallLocations.add(l64);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l64);
                minDistance = distance;
            }
        }

        if (b65) {
            int distance = currentLocation.distanceSquaredTo(l65);
            if (distance == minDistance) {
                closestWallLocations.add(l65);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l65);
                minDistance = distance;
            }
        }

        if (b66) {
            int distance = currentLocation.distanceSquaredTo(l66);
            if (distance == minDistance) {
                closestWallLocations.add(l66);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l66);
                minDistance = distance;
            }
        }

        if (b67) {
            int distance = currentLocation.distanceSquaredTo(l67);
            if (distance == minDistance) {
                closestWallLocations.add(l67);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l67);
                minDistance = distance;
            }
        }

        if (b68) {
            int distance = currentLocation.distanceSquaredTo(l68);
            if (distance == minDistance) {
                closestWallLocations.add(l68);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l68);
                minDistance = distance;
            }
        }

        if (minDistance > 2) { return prev; }
        int maxDot = -999999;
        minDistance = 1000000;
        for (MapLocation closestWallLocation : closestWallLocations) {
            Direction vertical = currentLocation.directionTo(closestWallLocation);

            Direction tangent1 = vertical.rotateLeft().rotateLeft();
            Direction tangent2 = vertical.rotateRight().rotateRight();

            int dx = lastDirection.getDeltaX();
            int dy = lastDirection.getDeltaY();

            int dot1 = tangent1.getDeltaX() * dx + tangent1.getDeltaY() * dy;
            int dot2 = tangent2.getDeltaX() * dx + tangent2.getDeltaY() * dy;

            int distance1 = currentLocation.add(tangent1).distanceSquaredTo(targetLocation);
            int distance2 = currentLocation.add(tangent2).distanceSquaredTo(targetLocation);

            if (!rc.canMove(tangent1)) {
                dot1 = -1000000;
            }

            if (!rc.canMove(tangent2)) {
                dot2 = -1000000;
            }

            if (dot1 > maxDot) {
                maxDot = dot1;
                minDistance = distance1;
                ans = tangent1;
            }

            if (dot2 > maxDot) {
                maxDot = dot2;
                minDistance = distance2;
                ans = tangent2;
            }

            if (dot1 == maxDot && distance1 < minDistance) {
                maxDot = dot1;
                minDistance = distance1;
                ans = tangent1;
            }

            if (dot2 == maxDot && distance2 < minDistance) {
                maxDot = dot2;
                minDistance = distance2;
                ans = tangent2;
            }
        }
        draws2();
        for (MapLocation closestWallLocation : closestWallLocations) {
            rc.setIndicatorDot(closestWallLocation, 255, 0, 0);
        }
        return ans;
    }

    private void draws2() throws GameActionException {
    
        rc.setIndicatorDot(l30, 255, 0, 255);
        if (b30) {
            rc.setIndicatorDot(l30, 255, 255, 255);
        }

        rc.setIndicatorDot(l31, 255, 0, 255);
        if (b31) {
            rc.setIndicatorDot(l31, 255, 255, 255);
        }

        rc.setIndicatorDot(l32, 255, 0, 255);
        if (b32) {
            rc.setIndicatorDot(l32, 255, 255, 255);
        }

        rc.setIndicatorDot(l33, 255, 0, 255);
        if (b33) {
            rc.setIndicatorDot(l33, 255, 255, 255);
        }

        rc.setIndicatorDot(l35, 255, 0, 255);
        if (b35) {
            rc.setIndicatorDot(l35, 255, 255, 255);
        }

        rc.setIndicatorDot(l36, 255, 0, 255);
        if (b36) {
            rc.setIndicatorDot(l36, 255, 255, 255);
        }

        rc.setIndicatorDot(l37, 255, 0, 255);
        if (b37) {
            rc.setIndicatorDot(l37, 255, 255, 255);
        }

        rc.setIndicatorDot(l38, 255, 0, 255);
        if (b38) {
            rc.setIndicatorDot(l38, 255, 255, 255);
        }

        rc.setIndicatorDot(l39, 255, 0, 255);
        if (b39) {
            rc.setIndicatorDot(l39, 255, 255, 255);
        }

        rc.setIndicatorDot(l40, 255, 0, 255);
        if (b40) {
            rc.setIndicatorDot(l40, 255, 255, 255);
        }

        rc.setIndicatorDot(l41, 255, 0, 255);
        if (b41) {
            rc.setIndicatorDot(l41, 255, 255, 255);
        }

        rc.setIndicatorDot(l42, 255, 0, 255);
        if (b42) {
            rc.setIndicatorDot(l42, 255, 255, 255);
        }

        rc.setIndicatorDot(l43, 255, 0, 255);
        if (b43) {
            rc.setIndicatorDot(l43, 255, 255, 255);
        }

        rc.setIndicatorDot(l44, 255, 0, 255);
        if (b44) {
            rc.setIndicatorDot(l44, 255, 255, 255);
        }

        rc.setIndicatorDot(l45, 255, 0, 255);
        if (b45) {
            rc.setIndicatorDot(l45, 255, 255, 255);
        }

        rc.setIndicatorDot(l46, 255, 0, 255);
        if (b46) {
            rc.setIndicatorDot(l46, 255, 255, 255);
        }

        rc.setIndicatorDot(l47, 255, 0, 255);
        if (b47) {
            rc.setIndicatorDot(l47, 255, 255, 255);
        }

        rc.setIndicatorDot(l48, 255, 0, 255);
        if (b48) {
            rc.setIndicatorDot(l48, 255, 255, 255);
        }

        rc.setIndicatorDot(l49, 255, 0, 255);
        if (b49) {
            rc.setIndicatorDot(l49, 255, 255, 255);
        }

        rc.setIndicatorDot(l50, 255, 0, 255);
        if (b50) {
            rc.setIndicatorDot(l50, 255, 255, 255);
        }

        rc.setIndicatorDot(l51, 255, 0, 255);
        if (b51) {
            rc.setIndicatorDot(l51, 255, 255, 255);
        }

        rc.setIndicatorDot(l52, 255, 0, 255);
        if (b52) {
            rc.setIndicatorDot(l52, 255, 255, 255);
        }

        rc.setIndicatorDot(l53, 255, 0, 255);
        if (b53) {
            rc.setIndicatorDot(l53, 255, 255, 255);
        }

        rc.setIndicatorDot(l54, 255, 0, 255);
        if (b54) {
            rc.setIndicatorDot(l54, 255, 255, 255);
        }

        rc.setIndicatorDot(l55, 255, 0, 255);
        if (b55) {
            rc.setIndicatorDot(l55, 255, 255, 255);
        }

        rc.setIndicatorDot(l56, 255, 0, 255);
        if (b56) {
            rc.setIndicatorDot(l56, 255, 255, 255);
        }

        rc.setIndicatorDot(l57, 255, 0, 255);
        if (b57) {
            rc.setIndicatorDot(l57, 255, 255, 255);
        }

        rc.setIndicatorDot(l58, 255, 0, 255);
        if (b58) {
            rc.setIndicatorDot(l58, 255, 255, 255);
        }

        rc.setIndicatorDot(l59, 255, 0, 255);
        if (b59) {
            rc.setIndicatorDot(l59, 255, 255, 255);
        }

        rc.setIndicatorDot(l60, 255, 0, 255);
        if (b60) {
            rc.setIndicatorDot(l60, 255, 255, 255);
        }

        rc.setIndicatorDot(l61, 255, 0, 255);
        if (b61) {
            rc.setIndicatorDot(l61, 255, 255, 255);
        }

        rc.setIndicatorDot(l62, 255, 0, 255);
        if (b62) {
            rc.setIndicatorDot(l62, 255, 255, 255);
        }

        rc.setIndicatorDot(l63, 255, 0, 255);
        if (b63) {
            rc.setIndicatorDot(l63, 255, 255, 255);
        }

        rc.setIndicatorDot(l64, 255, 0, 255);
        if (b64) {
            rc.setIndicatorDot(l64, 255, 255, 255);
        }

        rc.setIndicatorDot(l65, 255, 0, 255);
        if (b65) {
            rc.setIndicatorDot(l65, 255, 255, 255);
        }

        rc.setIndicatorDot(l66, 255, 0, 255);
        if (b66) {
            rc.setIndicatorDot(l66, 255, 255, 255);
        }

        rc.setIndicatorDot(l67, 255, 0, 255);
        if (b67) {
            rc.setIndicatorDot(l67, 255, 255, 255);
        }

        rc.setIndicatorDot(l68, 255, 0, 255);
        if (b68) {
            rc.setIndicatorDot(l68, 255, 255, 255);
        }

    }

    private Direction getBestDirection3() throws GameActionException {
        MapLocation best = currentLocation;
        double localBest = 1000000.0;
        l34 = currentLocation;
        v34 = 0;
        d34 = Direction.CENTER;
        r34 = true;
        l43 = l34.add(Direction.EAST);
        v43 = 1000000;
        p43 = 1000000;
        d43 = null;
        b43 = true;
        r43 = false;
        o43 = false;
        l44 = l34.add(Direction.NORTHEAST);
        v44 = 1000000;
        p44 = 1000000;
        d44 = null;
        b44 = true;
        r44 = false;
        o44 = false;
        l24 = l34.add(Direction.SOUTHWEST);
        v24 = 1000000;
        p24 = 1000000;
        d24 = null;
        b24 = true;
        r24 = false;
        o24 = false;
        l33 = l34.add(Direction.SOUTH);
        v33 = 1000000;
        p33 = 1000000;
        d33 = null;
        b33 = true;
        r33 = false;
        o33 = false;
        l42 = l34.add(Direction.SOUTHEAST);
        v42 = 1000000;
        p42 = 1000000;
        d42 = null;
        b42 = true;
        r42 = false;
        o42 = false;
        l23 = l33.add(Direction.SOUTHWEST);
        v23 = 1000000;
        p23 = 1000000;
        d23 = null;
        b23 = true;
        r23 = false;
        o23 = false;
        l32 = l33.add(Direction.SOUTH);
        v32 = 1000000;
        p32 = 1000000;
        d32 = null;
        b32 = true;
        r32 = false;
        o32 = false;
        l41 = l33.add(Direction.SOUTHEAST);
        v41 = 1000000;
        p41 = 1000000;
        d41 = null;
        b41 = true;
        r41 = false;
        o41 = false;
        l52 = l43.add(Direction.EAST);
        v52 = 1000000;
        p52 = 1000000;
        d52 = null;
        b52 = true;
        r52 = false;
        o52 = false;
        l53 = l43.add(Direction.NORTHEAST);
        v53 = 1000000;
        p53 = 1000000;
        d53 = null;
        b53 = true;
        r53 = false;
        o53 = false;
        l51 = l43.add(Direction.SOUTHEAST);
        v51 = 1000000;
        p51 = 1000000;
        d51 = null;
        b51 = true;
        r51 = false;
        o51 = false;
        l50 = l42.add(Direction.SOUTHEAST);
        v50 = 1000000;
        p50 = 1000000;
        d50 = null;
        b50 = true;
        r50 = false;
        o50 = false;
        l54 = l44.add(Direction.NORTHEAST);
        v54 = 1000000;
        p54 = 1000000;
        d54 = null;
        b54 = true;
        r54 = false;
        o54 = false;
        l14 = l24.add(Direction.SOUTHWEST);
        v14 = 1000000;
        p14 = 1000000;
        d14 = null;
        b14 = true;
        r14 = false;
        o14 = false;
        l22 = l32.add(Direction.SOUTHWEST);
        v22 = 1000000;
        p22 = 1000000;
        d22 = null;
        b22 = true;
        r22 = false;
        o22 = false;
        l31 = l32.add(Direction.SOUTH);
        v31 = 1000000;
        p31 = 1000000;
        d31 = null;
        b31 = true;
        r31 = false;
        o31 = false;
        l40 = l32.add(Direction.SOUTHEAST);
        v40 = 1000000;
        p40 = 1000000;
        d40 = null;
        b40 = true;
        r40 = false;
        o40 = false;
        l60 = l52.add(Direction.EAST);
        v60 = 1000000;
        p60 = 1000000;
        d60 = null;
        b60 = true;
        r60 = false;
        o60 = false;
        l61 = l52.add(Direction.NORTHEAST);
        v61 = 1000000;
        p61 = 1000000;
        d61 = null;
        b61 = true;
        r61 = false;
        o61 = false;
        l59 = l52.add(Direction.SOUTHEAST);
        v59 = 1000000;
        p59 = 1000000;
        d59 = null;
        b59 = true;
        r59 = false;
        o59 = false;
        l62 = l53.add(Direction.NORTHEAST);
        v62 = 1000000;
        p62 = 1000000;
        d62 = null;
        b62 = true;
        r62 = false;
        o62 = false;
        l58 = l51.add(Direction.SOUTHEAST);
        v58 = 1000000;
        p58 = 1000000;
        d58 = null;
        b58 = true;
        r58 = false;
        o58 = false;
        l49 = l41.add(Direction.SOUTHEAST);
        v49 = 1000000;
        p49 = 1000000;
        d49 = null;
        b49 = true;
        r49 = false;
        o49 = false;
        l13 = l23.add(Direction.SOUTHWEST);
        v13 = 1000000;
        p13 = 1000000;
        d13 = null;
        b13 = true;
        r13 = false;
        o13 = false;
        l5 = l14.add(Direction.SOUTHWEST);
        v5 = 1000000;
        p5 = 1000000;
        d5 = null;
        b5 = true;
        r5 = false;
        o5 = false;
        l57 = l50.add(Direction.SOUTHEAST);
        v57 = 1000000;
        p57 = 1000000;
        d57 = null;
        b57 = true;
        r57 = false;
        o57 = false;
        l63 = l54.add(Direction.NORTHEAST);
        v63 = 1000000;
        p63 = 1000000;
        d63 = null;
        b63 = true;
        r63 = false;
        o63 = false;
        l21 = l31.add(Direction.SOUTHWEST);
        v21 = 1000000;
        p21 = 1000000;
        d21 = null;
        b21 = true;
        r21 = false;
        o21 = false;
        l30 = l31.add(Direction.SOUTH);
        v30 = 1000000;
        p30 = 1000000;
        d30 = null;
        b30 = true;
        r30 = false;
        o30 = false;
        l39 = l31.add(Direction.SOUTHEAST);
        v39 = 1000000;
        p39 = 1000000;
        d39 = null;
        b39 = true;
        r39 = false;
        o39 = false;
        l66 = l60.add(Direction.EAST);
        v66 = 1000000;
        p66 = 1000000;
        d66 = null;
        b66 = true;
        r66 = false;
        o66 = false;
        l67 = l60.add(Direction.NORTHEAST);
        v67 = 1000000;
        p67 = 1000000;
        d67 = null;
        b67 = true;
        r67 = false;
        o67 = false;
        l65 = l60.add(Direction.SOUTHEAST);
        v65 = 1000000;
        p65 = 1000000;
        d65 = null;
        b65 = true;
        r65 = false;
        o65 = false;
        l64 = l59.add(Direction.SOUTHEAST);
        v64 = 1000000;
        p64 = 1000000;
        d64 = null;
        b64 = true;
        r64 = false;
        o64 = false;
        l48 = l40.add(Direction.SOUTHEAST);
        v48 = 1000000;
        p48 = 1000000;
        d48 = null;
        b48 = true;
        r48 = false;
        o48 = false;
        l12 = l22.add(Direction.SOUTHWEST);
        v12 = 1000000;
        p12 = 1000000;
        d12 = null;
        b12 = true;
        r12 = false;
        o12 = false;
        l68 = l61.add(Direction.NORTHEAST);
        v68 = 1000000;
        p68 = 1000000;
        d68 = null;
        b68 = true;
        r68 = false;
        o68 = false;
    
        if (rc.onTheMap(l33) && rc.canSenseLocation(l33)) {
            if (rc.senseCloud(l33)) {
                p33 = 1.5;
                b33 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l33).getCurrentDirection();
                if (targetLocation.equals(l33) || (rc.sensePassability(l33) && !rc.canSenseRobotAtLocation(l33) && currentDirection.equals(Direction.CENTER))) {
                    p33 = rc.senseMapInfo(l33).getCooldownMultiplier(team);
                    b33 = false;
                }
            }
            if (v33 > v43 + p33) {
                v33 = v43 + p33;
                d33 = d43;
            }
            if (v33 > v34 + p33) {
                v33 = v34 + p33;
                d33 = Direction.SOUTH;
            }
            
            r33 |= r43;
            r33 |= r34;
            r33 &= !b33;
            o43 |= b33;
        }
        else {
            o43 |= b33;
        }

        if (rc.onTheMap(l43) && rc.canSenseLocation(l43)) {
            if (rc.senseCloud(l43)) {
                p43 = 1.5;
                b43 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l43).getCurrentDirection();
                if (targetLocation.equals(l43) || (rc.sensePassability(l43) && !rc.canSenseRobotAtLocation(l43) && currentDirection.equals(Direction.CENTER))) {
                    p43 = rc.senseMapInfo(l43).getCooldownMultiplier(team);
                    b43 = false;
                }
            }
            if (v43 > v34 + p43) {
                v43 = v34 + p43;
                d43 = Direction.EAST;
            }
            if (v43 > v33 + p43) {
                v43 = v33 + p43;
                d43 = d33;
            }
            
            r43 |= r34;
            r43 |= r33;
            r43 &= !b43;
            o33 |= b43;
        }
        else {
            o33 |= b43;
        }

        if (rc.onTheMap(l42) && rc.canSenseLocation(l42)) {
            if (rc.senseCloud(l42)) {
                p42 = 1.5;
                b42 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l42).getCurrentDirection();
                if (targetLocation.equals(l42) || (rc.sensePassability(l42) && !rc.canSenseRobotAtLocation(l42) && currentDirection.equals(Direction.CENTER))) {
                    p42 = rc.senseMapInfo(l42).getCooldownMultiplier(team);
                    b42 = false;
                }
            }
            if (v42 > v43 + p42) {
                v42 = v43 + p42;
                d42 = d43;
            }
            if (v42 > v34 + p42) {
                v42 = v34 + p42;
                d42 = Direction.SOUTHEAST;
            }
            if (v42 > v33 + p42) {
                v42 = v33 + p42;
                d42 = d33;
            }
            
            r42 |= r43;
            r42 |= r34;
            r42 |= r33;
            r42 &= !b42;
            o43 |= b42;
            o33 |= b42;
        }
        else {
            o43 |= b42;
            o33 |= b42;
        }

        if (rc.onTheMap(l44) && rc.canSenseLocation(l44)) {
            if (rc.senseCloud(l44)) {
                p44 = 1.5;
                b44 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l44).getCurrentDirection();
                if (targetLocation.equals(l44) || (rc.sensePassability(l44) && !rc.canSenseRobotAtLocation(l44) && currentDirection.equals(Direction.CENTER))) {
                    p44 = rc.senseMapInfo(l44).getCooldownMultiplier(team);
                    b44 = false;
                }
            }
            if (v44 > v34 + p44) {
                v44 = v34 + p44;
                d44 = Direction.NORTHEAST;
            }
            if (v44 > v43 + p44) {
                v44 = v43 + p44;
                d44 = d43;
            }
            
            r44 |= r34;
            r44 |= r43;
            r44 &= !b44;
            o43 |= b44;
        }
        else {
            o43 |= b44;
        }

        if (rc.onTheMap(l24) && rc.canSenseLocation(l24)) {
            if (rc.senseCloud(l24)) {
                p24 = 1.5;
                b24 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l24).getCurrentDirection();
                if (targetLocation.equals(l24) || (rc.sensePassability(l24) && !rc.canSenseRobotAtLocation(l24) && currentDirection.equals(Direction.CENTER))) {
                    p24 = rc.senseMapInfo(l24).getCooldownMultiplier(team);
                    b24 = false;
                }
            }
            if (v24 > v33 + p24) {
                v24 = v33 + p24;
                d24 = d33;
            }
            if (v24 > v34 + p24) {
                v24 = v34 + p24;
                d24 = Direction.SOUTHWEST;
            }
            
            r24 |= r33;
            r24 |= r34;
            r24 &= !b24;
            o33 |= b24;
        }
        else {
            o33 |= b24;
        }

        if (rc.onTheMap(l32) && rc.canSenseLocation(l32)) {
            if (rc.senseCloud(l32)) {
                p32 = 1.5;
                b32 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l32).getCurrentDirection();
                if (targetLocation.equals(l32) || (rc.sensePassability(l32) && !rc.canSenseRobotAtLocation(l32) && currentDirection.equals(Direction.CENTER))) {
                    p32 = rc.senseMapInfo(l32).getCooldownMultiplier(team);
                    b32 = false;
                }
            }
            if (v32 > v42 + p32) {
                v32 = v42 + p32;
                d32 = d42;
            }
            if (v32 > v33 + p32) {
                v32 = v33 + p32;
                d32 = d33;
            }
            if (v32 > v24 + p32) {
                v32 = v24 + p32;
                d32 = d24;
            }
            
            r32 |= r42;
            r32 |= r33;
            r32 |= r24;
            r32 &= !b32;
            o42 |= b32;
            o33 |= b32;
            o24 |= b32;
        }
        else {
            o42 |= b32;
            o33 |= b32;
            o24 |= b32;
        }

        if (rc.onTheMap(l52) && rc.canSenseLocation(l52)) {
            if (rc.senseCloud(l52)) {
                p52 = 1.5;
                b52 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l52).getCurrentDirection();
                if (targetLocation.equals(l52) || (rc.sensePassability(l52) && !rc.canSenseRobotAtLocation(l52) && currentDirection.equals(Direction.CENTER))) {
                    p52 = rc.senseMapInfo(l52).getCooldownMultiplier(team);
                    b52 = false;
                }
            }
            if (v52 > v44 + p52) {
                v52 = v44 + p52;
                d52 = d44;
            }
            if (v52 > v43 + p52) {
                v52 = v43 + p52;
                d52 = d43;
            }
            if (v52 > v42 + p52) {
                v52 = v42 + p52;
                d52 = d42;
            }
            
            r52 |= r44;
            r52 |= r43;
            r52 |= r42;
            r52 &= !b52;
            o44 |= b52;
            o43 |= b52;
            o42 |= b52;
        }
        else {
            o44 |= b52;
            o43 |= b52;
            o42 |= b52;
        }

        if (rc.onTheMap(l53) && rc.canSenseLocation(l53)) {
            if (rc.senseCloud(l53)) {
                p53 = 1.5;
                b53 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l53).getCurrentDirection();
                if (targetLocation.equals(l53) || (rc.sensePassability(l53) && !rc.canSenseRobotAtLocation(l53) && currentDirection.equals(Direction.CENTER))) {
                    p53 = rc.senseMapInfo(l53).getCooldownMultiplier(team);
                    b53 = false;
                }
            }
            if (v53 > v44 + p53) {
                v53 = v44 + p53;
                d53 = d44;
            }
            if (v53 > v43 + p53) {
                v53 = v43 + p53;
                d53 = d43;
            }
            if (v53 > v52 + p53) {
                v53 = v52 + p53;
                d53 = d52;
            }
            
            r53 |= r44;
            r53 |= r43;
            r53 |= r52;
            r53 &= !b53;
            o44 |= b53;
            o43 |= b53;
            o52 |= b53;
        }
        else {
            o44 |= b53;
            o43 |= b53;
            o52 |= b53;
        }

        if (rc.onTheMap(l51) && rc.canSenseLocation(l51)) {
            if (rc.senseCloud(l51)) {
                p51 = 1.5;
                b51 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l51).getCurrentDirection();
                if (targetLocation.equals(l51) || (rc.sensePassability(l51) && !rc.canSenseRobotAtLocation(l51) && currentDirection.equals(Direction.CENTER))) {
                    p51 = rc.senseMapInfo(l51).getCooldownMultiplier(team);
                    b51 = false;
                }
            }
            if (v51 > v52 + p51) {
                v51 = v52 + p51;
                d51 = d52;
            }
            if (v51 > v43 + p51) {
                v51 = v43 + p51;
                d51 = d43;
            }
            if (v51 > v42 + p51) {
                v51 = v42 + p51;
                d51 = d42;
            }
            if (v51 > v41 + p51) {
                v51 = v41 + p51;
                d51 = d41;
            }
            
            r51 |= r52;
            r51 |= r43;
            r51 |= r42;
            r51 |= r41;
            r51 &= !b51;
            o52 |= b51;
            o43 |= b51;
            o42 |= b51;
            o41 |= b51;
        }
        else {
            o52 |= b51;
            o43 |= b51;
            o42 |= b51;
            o41 |= b51;
        }

        if (rc.onTheMap(l41) && rc.canSenseLocation(l41)) {
            if (rc.senseCloud(l41)) {
                p41 = 1.5;
                b41 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l41).getCurrentDirection();
                if (targetLocation.equals(l41) || (rc.sensePassability(l41) && !rc.canSenseRobotAtLocation(l41) && currentDirection.equals(Direction.CENTER))) {
                    p41 = rc.senseMapInfo(l41).getCooldownMultiplier(team);
                    b41 = false;
                }
            }
            if (v41 > v51 + p41) {
                v41 = v51 + p41;
                d41 = d51;
            }
            if (v41 > v42 + p41) {
                v41 = v42 + p41;
                d41 = d42;
            }
            if (v41 > v33 + p41) {
                v41 = v33 + p41;
                d41 = d33;
            }
            if (v41 > v32 + p41) {
                v41 = v32 + p41;
                d41 = d32;
            }
            
            r41 |= r51;
            r41 |= r42;
            r41 |= r33;
            r41 |= r32;
            r41 &= !b41;
            o51 |= b41;
            o42 |= b41;
            o33 |= b41;
            o32 |= b41;
        }
        else {
            o51 |= b41;
            o42 |= b41;
            o33 |= b41;
            o32 |= b41;
        }

        if (rc.onTheMap(l23) && rc.canSenseLocation(l23)) {
            if (rc.senseCloud(l23)) {
                p23 = 1.5;
                b23 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l23).getCurrentDirection();
                if (targetLocation.equals(l23) || (rc.sensePassability(l23) && !rc.canSenseRobotAtLocation(l23) && currentDirection.equals(Direction.CENTER))) {
                    p23 = rc.senseMapInfo(l23).getCooldownMultiplier(team);
                    b23 = false;
                }
            }
            if (v23 > v32 + p23) {
                v23 = v32 + p23;
                d23 = d32;
            }
            if (v23 > v33 + p23) {
                v23 = v33 + p23;
                d23 = d33;
            }
            if (v23 > v24 + p23) {
                v23 = v24 + p23;
                d23 = d24;
            }
            
            r23 |= r32;
            r23 |= r33;
            r23 |= r24;
            r23 &= !b23;
            o32 |= b23;
            o33 |= b23;
            o24 |= b23;
        }
        else {
            o32 |= b23;
            o33 |= b23;
            o24 |= b23;
        }

        if (rc.onTheMap(l14) && rc.canSenseLocation(l14)) {
            if (rc.senseCloud(l14)) {
                p14 = 1.5;
                b14 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l14).getCurrentDirection();
                if (targetLocation.equals(l14) || (rc.sensePassability(l14) && !rc.canSenseRobotAtLocation(l14) && currentDirection.equals(Direction.CENTER))) {
                    p14 = rc.senseMapInfo(l14).getCooldownMultiplier(team);
                    b14 = false;
                }
            }
            if (v14 > v23 + p14) {
                v14 = v23 + p14;
                d14 = d23;
            }
            if (v14 > v24 + p14) {
                v14 = v24 + p14;
                d14 = d24;
            }
            
            r14 |= r23;
            r14 |= r24;
            r14 &= !b14;
            o23 |= b14;
            o24 |= b14;
        }
        else {
            o23 |= b14;
            o24 |= b14;
        }

        if (rc.onTheMap(l50) && rc.canSenseLocation(l50)) {
            if (rc.senseCloud(l50)) {
                p50 = 1.5;
                b50 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l50).getCurrentDirection();
                if (targetLocation.equals(l50) || (rc.sensePassability(l50) && !rc.canSenseRobotAtLocation(l50) && currentDirection.equals(Direction.CENTER))) {
                    p50 = rc.senseMapInfo(l50).getCooldownMultiplier(team);
                    b50 = false;
                }
            }
            if (v50 > v51 + p50) {
                v50 = v51 + p50;
                d50 = d51;
            }
            if (v50 > v42 + p50) {
                v50 = v42 + p50;
                d50 = d42;
            }
            if (v50 > v41 + p50) {
                v50 = v41 + p50;
                d50 = d41;
            }
            
            r50 |= r51;
            r50 |= r42;
            r50 |= r41;
            r50 &= !b50;
            o51 |= b50;
            o42 |= b50;
            o41 |= b50;
        }
        else {
            o51 |= b50;
            o42 |= b50;
            o41 |= b50;
        }

        if (rc.onTheMap(l54) && rc.canSenseLocation(l54)) {
            if (rc.senseCloud(l54)) {
                p54 = 1.5;
                b54 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l54).getCurrentDirection();
                if (targetLocation.equals(l54) || (rc.sensePassability(l54) && !rc.canSenseRobotAtLocation(l54) && currentDirection.equals(Direction.CENTER))) {
                    p54 = rc.senseMapInfo(l54).getCooldownMultiplier(team);
                    b54 = false;
                }
            }
            if (v54 > v44 + p54) {
                v54 = v44 + p54;
                d54 = d44;
            }
            if (v54 > v53 + p54) {
                v54 = v53 + p54;
                d54 = d53;
            }
            
            r54 |= r44;
            r54 |= r53;
            r54 &= !b54;
            o44 |= b54;
            o53 |= b54;
        }
        else {
            o44 |= b54;
            o53 |= b54;
        }

        if (rc.onTheMap(l31) && rc.canSenseLocation(l31)) {
            if (rc.senseCloud(l31)) {
                p31 = 1.5;
                b31 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l31).getCurrentDirection();
                if (targetLocation.equals(l31) || (rc.sensePassability(l31) && !rc.canSenseRobotAtLocation(l31) && currentDirection.equals(Direction.CENTER))) {
                    p31 = rc.senseMapInfo(l31).getCooldownMultiplier(team);
                    b31 = false;
                }
            }
            if (v31 > v41 + p31) {
                v31 = v41 + p31;
                d31 = d41;
            }
            if (v31 > v32 + p31) {
                v31 = v32 + p31;
                d31 = d32;
            }
            if (v31 > v23 + p31) {
                v31 = v23 + p31;
                d31 = d23;
            }
            
            r31 |= r41;
            r31 |= r32;
            r31 |= r23;
            r31 &= !b31;
            o41 |= b31;
            o32 |= b31;
            o23 |= b31;
        }
        else {
            o41 |= b31;
            o32 |= b31;
            o23 |= b31;
        }

        if (rc.onTheMap(l60) && rc.canSenseLocation(l60)) {
            if (rc.senseCloud(l60)) {
                p60 = 1.5;
                b60 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l60).getCurrentDirection();
                if (targetLocation.equals(l60) || (rc.sensePassability(l60) && !rc.canSenseRobotAtLocation(l60) && currentDirection.equals(Direction.CENTER))) {
                    p60 = rc.senseMapInfo(l60).getCooldownMultiplier(team);
                    b60 = false;
                }
            }
            if (v60 > v53 + p60) {
                v60 = v53 + p60;
                d60 = d53;
            }
            if (v60 > v52 + p60) {
                v60 = v52 + p60;
                d60 = d52;
            }
            if (v60 > v51 + p60) {
                v60 = v51 + p60;
                d60 = d51;
            }
            
            r60 |= r53;
            r60 |= r52;
            r60 |= r51;
            r60 &= !b60;
            o53 |= b60;
            o52 |= b60;
            o51 |= b60;
        }
        else {
            o53 |= b60;
            o52 |= b60;
            o51 |= b60;
        }

        if (rc.onTheMap(l59) && rc.canSenseLocation(l59)) {
            if (rc.senseCloud(l59)) {
                p59 = 1.5;
                b59 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l59).getCurrentDirection();
                if (targetLocation.equals(l59) || (rc.sensePassability(l59) && !rc.canSenseRobotAtLocation(l59) && currentDirection.equals(Direction.CENTER))) {
                    p59 = rc.senseMapInfo(l59).getCooldownMultiplier(team);
                    b59 = false;
                }
            }
            if (v59 > v60 + p59) {
                v59 = v60 + p59;
                d59 = d60;
            }
            if (v59 > v52 + p59) {
                v59 = v52 + p59;
                d59 = d52;
            }
            if (v59 > v51 + p59) {
                v59 = v51 + p59;
                d59 = d51;
            }
            if (v59 > v50 + p59) {
                v59 = v50 + p59;
                d59 = d50;
            }
            
            r59 |= r60;
            r59 |= r52;
            r59 |= r51;
            r59 |= r50;
            r59 &= !b59;
            o60 |= b59;
            o52 |= b59;
            o51 |= b59;
            o50 |= b59;
        }
        else {
            o60 |= b59;
            o52 |= b59;
            o51 |= b59;
            o50 |= b59;
        }

        if (rc.onTheMap(l40) && rc.canSenseLocation(l40)) {
            if (rc.senseCloud(l40)) {
                p40 = 1.5;
                b40 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l40).getCurrentDirection();
                if (targetLocation.equals(l40) || (rc.sensePassability(l40) && !rc.canSenseRobotAtLocation(l40) && currentDirection.equals(Direction.CENTER))) {
                    p40 = rc.senseMapInfo(l40).getCooldownMultiplier(team);
                    b40 = false;
                }
            }
            if (v40 > v50 + p40) {
                v40 = v50 + p40;
                d40 = d50;
            }
            if (v40 > v41 + p40) {
                v40 = v41 + p40;
                d40 = d41;
            }
            if (v40 > v32 + p40) {
                v40 = v32 + p40;
                d40 = d32;
            }
            if (v40 > v31 + p40) {
                v40 = v31 + p40;
                d40 = d31;
            }
            
            r40 |= r50;
            r40 |= r41;
            r40 |= r32;
            r40 |= r31;
            r40 &= !b40;
            o50 |= b40;
            o41 |= b40;
            o32 |= b40;
            o31 |= b40;
        }
        else {
            o50 |= b40;
            o41 |= b40;
            o32 |= b40;
            o31 |= b40;
        }

        if (rc.onTheMap(l22) && rc.canSenseLocation(l22)) {
            if (rc.senseCloud(l22)) {
                p22 = 1.5;
                b22 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l22).getCurrentDirection();
                if (targetLocation.equals(l22) || (rc.sensePassability(l22) && !rc.canSenseRobotAtLocation(l22) && currentDirection.equals(Direction.CENTER))) {
                    p22 = rc.senseMapInfo(l22).getCooldownMultiplier(team);
                    b22 = false;
                }
            }
            if (v22 > v31 + p22) {
                v22 = v31 + p22;
                d22 = d31;
            }
            if (v22 > v32 + p22) {
                v22 = v32 + p22;
                d22 = d32;
            }
            if (v22 > v23 + p22) {
                v22 = v23 + p22;
                d22 = d23;
            }
            if (v22 > v14 + p22) {
                v22 = v14 + p22;
                d22 = d14;
            }
            
            r22 |= r31;
            r22 |= r32;
            r22 |= r23;
            r22 |= r14;
            r22 &= !b22;
            o31 |= b22;
            o32 |= b22;
            o23 |= b22;
            o14 |= b22;
        }
        else {
            o31 |= b22;
            o32 |= b22;
            o23 |= b22;
            o14 |= b22;
        }

        if (rc.onTheMap(l61) && rc.canSenseLocation(l61)) {
            if (rc.senseCloud(l61)) {
                p61 = 1.5;
                b61 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l61).getCurrentDirection();
                if (targetLocation.equals(l61) || (rc.sensePassability(l61) && !rc.canSenseRobotAtLocation(l61) && currentDirection.equals(Direction.CENTER))) {
                    p61 = rc.senseMapInfo(l61).getCooldownMultiplier(team);
                    b61 = false;
                }
            }
            if (v61 > v54 + p61) {
                v61 = v54 + p61;
                d61 = d54;
            }
            if (v61 > v53 + p61) {
                v61 = v53 + p61;
                d61 = d53;
            }
            if (v61 > v52 + p61) {
                v61 = v52 + p61;
                d61 = d52;
            }
            if (v61 > v60 + p61) {
                v61 = v60 + p61;
                d61 = d60;
            }
            
            r61 |= r54;
            r61 |= r53;
            r61 |= r52;
            r61 |= r60;
            r61 &= !b61;
            o54 |= b61;
            o53 |= b61;
            o52 |= b61;
            o60 |= b61;
        }
        else {
            o54 |= b61;
            o53 |= b61;
            o52 |= b61;
            o60 |= b61;
        }

        if (rc.onTheMap(l62) && rc.canSenseLocation(l62)) {
            if (rc.senseCloud(l62)) {
                p62 = 1.5;
                b62 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l62).getCurrentDirection();
                if (targetLocation.equals(l62) || (rc.sensePassability(l62) && !rc.canSenseRobotAtLocation(l62) && currentDirection.equals(Direction.CENTER))) {
                    p62 = rc.senseMapInfo(l62).getCooldownMultiplier(team);
                    b62 = false;
                }
            }
            if (v62 > v54 + p62) {
                v62 = v54 + p62;
                d62 = d54;
            }
            if (v62 > v53 + p62) {
                v62 = v53 + p62;
                d62 = d53;
            }
            if (v62 > v61 + p62) {
                v62 = v61 + p62;
                d62 = d61;
            }
            
            r62 |= r54;
            r62 |= r53;
            r62 |= r61;
            r62 &= !b62;
            o54 |= b62;
            o53 |= b62;
            o61 |= b62;
        }
        else {
            o54 |= b62;
            o53 |= b62;
            o61 |= b62;
        }

        if (rc.onTheMap(l58) && rc.canSenseLocation(l58)) {
            if (rc.senseCloud(l58)) {
                p58 = 1.5;
                b58 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l58).getCurrentDirection();
                if (targetLocation.equals(l58) || (rc.sensePassability(l58) && !rc.canSenseRobotAtLocation(l58) && currentDirection.equals(Direction.CENTER))) {
                    p58 = rc.senseMapInfo(l58).getCooldownMultiplier(team);
                    b58 = false;
                }
            }
            if (v58 > v59 + p58) {
                v58 = v59 + p58;
                d58 = d59;
            }
            if (v58 > v51 + p58) {
                v58 = v51 + p58;
                d58 = d51;
            }
            if (v58 > v50 + p58) {
                v58 = v50 + p58;
                d58 = d50;
            }
            if (v58 > v49 + p58) {
                v58 = v49 + p58;
                d58 = d49;
            }
            
            r58 |= r59;
            r58 |= r51;
            r58 |= r50;
            r58 |= r49;
            r58 &= !b58;
            o59 |= b58;
            o51 |= b58;
            o50 |= b58;
            o49 |= b58;
        }
        else {
            o59 |= b58;
            o51 |= b58;
            o50 |= b58;
            o49 |= b58;
        }

        if (rc.onTheMap(l49) && rc.canSenseLocation(l49)) {
            if (rc.senseCloud(l49)) {
                p49 = 1.5;
                b49 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l49).getCurrentDirection();
                if (targetLocation.equals(l49) || (rc.sensePassability(l49) && !rc.canSenseRobotAtLocation(l49) && currentDirection.equals(Direction.CENTER))) {
                    p49 = rc.senseMapInfo(l49).getCooldownMultiplier(team);
                    b49 = false;
                }
            }
            if (v49 > v58 + p49) {
                v49 = v58 + p49;
                d49 = d58;
            }
            if (v49 > v50 + p49) {
                v49 = v50 + p49;
                d49 = d50;
            }
            if (v49 > v41 + p49) {
                v49 = v41 + p49;
                d49 = d41;
            }
            if (v49 > v40 + p49) {
                v49 = v40 + p49;
                d49 = d40;
            }
            
            r49 |= r58;
            r49 |= r50;
            r49 |= r41;
            r49 |= r40;
            r49 &= !b49;
            o58 |= b49;
            o50 |= b49;
            o41 |= b49;
            o40 |= b49;
        }
        else {
            o58 |= b49;
            o50 |= b49;
            o41 |= b49;
            o40 |= b49;
        }

        if (rc.onTheMap(l13) && rc.canSenseLocation(l13)) {
            if (rc.senseCloud(l13)) {
                p13 = 1.5;
                b13 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l13).getCurrentDirection();
                if (targetLocation.equals(l13) || (rc.sensePassability(l13) && !rc.canSenseRobotAtLocation(l13) && currentDirection.equals(Direction.CENTER))) {
                    p13 = rc.senseMapInfo(l13).getCooldownMultiplier(team);
                    b13 = false;
                }
            }
            if (v13 > v22 + p13) {
                v13 = v22 + p13;
                d13 = d22;
            }
            if (v13 > v23 + p13) {
                v13 = v23 + p13;
                d13 = d23;
            }
            if (v13 > v14 + p13) {
                v13 = v14 + p13;
                d13 = d14;
            }
            
            r13 |= r22;
            r13 |= r23;
            r13 |= r14;
            r13 &= !b13;
            o22 |= b13;
            o23 |= b13;
            o14 |= b13;
        }
        else {
            o22 |= b13;
            o23 |= b13;
            o14 |= b13;
        }

        if (rc.onTheMap(l63) && rc.canSenseLocation(l63)) {
            if (rc.senseCloud(l63)) {
                p63 = 1.5;
                b63 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l63).getCurrentDirection();
                if (targetLocation.equals(l63) || (rc.sensePassability(l63) && !rc.canSenseRobotAtLocation(l63) && currentDirection.equals(Direction.CENTER))) {
                    p63 = rc.senseMapInfo(l63).getCooldownMultiplier(team);
                    b63 = false;
                }
            }
            if (v63 > v54 + p63) {
                v63 = v54 + p63;
                d63 = d54;
            }
            if (v63 > v62 + p63) {
                v63 = v62 + p63;
                d63 = d62;
            }
            
            r63 |= r54;
            r63 |= r62;
            r63 &= !b63;
            o54 |= b63;
            o62 |= b63;
        }
        else {
            o54 |= b63;
            o62 |= b63;
        }

        if (rc.onTheMap(l57) && rc.canSenseLocation(l57)) {
            if (rc.senseCloud(l57)) {
                p57 = 1.5;
                b57 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l57).getCurrentDirection();
                if (targetLocation.equals(l57) || (rc.sensePassability(l57) && !rc.canSenseRobotAtLocation(l57) && currentDirection.equals(Direction.CENTER))) {
                    p57 = rc.senseMapInfo(l57).getCooldownMultiplier(team);
                    b57 = false;
                }
            }
            if (v57 > v58 + p57) {
                v57 = v58 + p57;
                d57 = d58;
            }
            if (v57 > v50 + p57) {
                v57 = v50 + p57;
                d57 = d50;
            }
            if (v57 > v49 + p57) {
                v57 = v49 + p57;
                d57 = d49;
            }
            
            r57 |= r58;
            r57 |= r50;
            r57 |= r49;
            r57 &= !b57;
            o58 |= b57;
            o50 |= b57;
            o49 |= b57;
        }
        else {
            o58 |= b57;
            o50 |= b57;
            o49 |= b57;
        }

        if (rc.onTheMap(l5) && rc.canSenseLocation(l5)) {
            if (rc.senseCloud(l5)) {
                p5 = 1.5;
                b5 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l5).getCurrentDirection();
                if (targetLocation.equals(l5) || (rc.sensePassability(l5) && !rc.canSenseRobotAtLocation(l5) && currentDirection.equals(Direction.CENTER))) {
                    p5 = rc.senseMapInfo(l5).getCooldownMultiplier(team);
                    b5 = false;
                }
            }
            if (v5 > v13 + p5) {
                v5 = v13 + p5;
                d5 = d13;
            }
            if (v5 > v14 + p5) {
                v5 = v14 + p5;
                d5 = d14;
            }
            
            r5 |= r13;
            r5 |= r14;
            r5 &= !b5;
            o13 |= b5;
            o14 |= b5;
        }
        else {
            o13 |= b5;
            o14 |= b5;
        }

        if (rc.onTheMap(l66) && rc.canSenseLocation(l66)) {
            if (rc.senseCloud(l66)) {
                p66 = 1.5;
                b66 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l66).getCurrentDirection();
                if (targetLocation.equals(l66) || (rc.sensePassability(l66) && !rc.canSenseRobotAtLocation(l66) && currentDirection.equals(Direction.CENTER))) {
                    p66 = rc.senseMapInfo(l66).getCooldownMultiplier(team);
                    b66 = false;
                }
            }
            if (v66 > v61 + p66) {
                v66 = v61 + p66;
                d66 = d61;
            }
            if (v66 > v60 + p66) {
                v66 = v60 + p66;
                d66 = d60;
            }
            if (v66 > v59 + p66) {
                v66 = v59 + p66;
                d66 = d59;
            }
            
            r66 |= r61;
            r66 |= r60;
            r66 |= r59;
            r66 &= !b66;
            o61 |= b66;
            o60 |= b66;
            o59 |= b66;
        }
        else {
            o61 |= b66;
            o60 |= b66;
            o59 |= b66;
        }

        if (rc.onTheMap(l30) && rc.canSenseLocation(l30)) {
            if (rc.senseCloud(l30)) {
                p30 = 1.5;
                b30 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l30).getCurrentDirection();
                if (targetLocation.equals(l30) || (rc.sensePassability(l30) && !rc.canSenseRobotAtLocation(l30) && currentDirection.equals(Direction.CENTER))) {
                    p30 = rc.senseMapInfo(l30).getCooldownMultiplier(team);
                    b30 = false;
                }
            }
            if (v30 > v40 + p30) {
                v30 = v40 + p30;
                d30 = d40;
            }
            if (v30 > v31 + p30) {
                v30 = v31 + p30;
                d30 = d31;
            }
            if (v30 > v22 + p30) {
                v30 = v22 + p30;
                d30 = d22;
            }
            
            r30 |= r40;
            r30 |= r31;
            r30 |= r22;
            r30 &= !b30;
            o40 |= b30;
            o31 |= b30;
            o22 |= b30;
        }
        else {
            o40 |= b30;
            o31 |= b30;
            o22 |= b30;
        }

        if (rc.onTheMap(l39) && rc.canSenseLocation(l39)) {
            if (rc.senseCloud(l39)) {
                p39 = 1.5;
                b39 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l39).getCurrentDirection();
                if (targetLocation.equals(l39) || (rc.sensePassability(l39) && !rc.canSenseRobotAtLocation(l39) && currentDirection.equals(Direction.CENTER))) {
                    p39 = rc.senseMapInfo(l39).getCooldownMultiplier(team);
                    b39 = false;
                }
            }
            if (v39 > v49 + p39) {
                v39 = v49 + p39;
                d39 = d49;
            }
            if (v39 > v40 + p39) {
                v39 = v40 + p39;
                d39 = d40;
            }
            if (v39 > v31 + p39) {
                v39 = v31 + p39;
                d39 = d31;
            }
            if (v39 > v30 + p39) {
                v39 = v30 + p39;
                d39 = d30;
            }
            
            r39 |= r49;
            r39 |= r40;
            r39 |= r31;
            r39 |= r30;
            r39 &= !b39;
            o49 |= b39;
            o40 |= b39;
            o31 |= b39;
            o30 |= b39;
        }
        else {
            o49 |= b39;
            o40 |= b39;
            o31 |= b39;
            o30 |= b39;
        }

        if (rc.onTheMap(l67) && rc.canSenseLocation(l67)) {
            if (rc.senseCloud(l67)) {
                p67 = 1.5;
                b67 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l67).getCurrentDirection();
                if (targetLocation.equals(l67) || (rc.sensePassability(l67) && !rc.canSenseRobotAtLocation(l67) && currentDirection.equals(Direction.CENTER))) {
                    p67 = rc.senseMapInfo(l67).getCooldownMultiplier(team);
                    b67 = false;
                }
            }
            if (v67 > v62 + p67) {
                v67 = v62 + p67;
                d67 = d62;
            }
            if (v67 > v61 + p67) {
                v67 = v61 + p67;
                d67 = d61;
            }
            if (v67 > v60 + p67) {
                v67 = v60 + p67;
                d67 = d60;
            }
            if (v67 > v66 + p67) {
                v67 = v66 + p67;
                d67 = d66;
            }
            
            r67 |= r62;
            r67 |= r61;
            r67 |= r60;
            r67 |= r66;
            r67 &= !b67;
            o62 |= b67;
            o61 |= b67;
            o60 |= b67;
            o66 |= b67;
        }
        else {
            o62 |= b67;
            o61 |= b67;
            o60 |= b67;
            o66 |= b67;
        }

        if (rc.onTheMap(l21) && rc.canSenseLocation(l21)) {
            if (rc.senseCloud(l21)) {
                p21 = 1.5;
                b21 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l21).getCurrentDirection();
                if (targetLocation.equals(l21) || (rc.sensePassability(l21) && !rc.canSenseRobotAtLocation(l21) && currentDirection.equals(Direction.CENTER))) {
                    p21 = rc.senseMapInfo(l21).getCooldownMultiplier(team);
                    b21 = false;
                }
            }
            if (v21 > v30 + p21) {
                v21 = v30 + p21;
                d21 = d30;
            }
            if (v21 > v31 + p21) {
                v21 = v31 + p21;
                d21 = d31;
            }
            if (v21 > v22 + p21) {
                v21 = v22 + p21;
                d21 = d22;
            }
            if (v21 > v13 + p21) {
                v21 = v13 + p21;
                d21 = d13;
            }
            
            r21 |= r30;
            r21 |= r31;
            r21 |= r22;
            r21 |= r13;
            r21 &= !b21;
            o30 |= b21;
            o31 |= b21;
            o22 |= b21;
            o13 |= b21;
        }
        else {
            o30 |= b21;
            o31 |= b21;
            o22 |= b21;
            o13 |= b21;
        }

        if (rc.onTheMap(l65) && rc.canSenseLocation(l65)) {
            if (rc.senseCloud(l65)) {
                p65 = 1.5;
                b65 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l65).getCurrentDirection();
                if (targetLocation.equals(l65) || (rc.sensePassability(l65) && !rc.canSenseRobotAtLocation(l65) && currentDirection.equals(Direction.CENTER))) {
                    p65 = rc.senseMapInfo(l65).getCooldownMultiplier(team);
                    b65 = false;
                }
            }
            if (v65 > v66 + p65) {
                v65 = v66 + p65;
                d65 = d66;
            }
            if (v65 > v60 + p65) {
                v65 = v60 + p65;
                d65 = d60;
            }
            if (v65 > v59 + p65) {
                v65 = v59 + p65;
                d65 = d59;
            }
            if (v65 > v58 + p65) {
                v65 = v58 + p65;
                d65 = d58;
            }
            
            r65 |= r66;
            r65 |= r60;
            r65 |= r59;
            r65 |= r58;
            r65 &= !b65;
            o66 |= b65;
            o60 |= b65;
            o59 |= b65;
            o58 |= b65;
        }
        else {
            o66 |= b65;
            o60 |= b65;
            o59 |= b65;
            o58 |= b65;
        }

        if (rc.onTheMap(l68) && rc.canSenseLocation(l68)) {
            if (rc.senseCloud(l68)) {
                p68 = 1.5;
                b68 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l68).getCurrentDirection();
                if (targetLocation.equals(l68) || (rc.sensePassability(l68) && !rc.canSenseRobotAtLocation(l68) && currentDirection.equals(Direction.CENTER))) {
                    p68 = rc.senseMapInfo(l68).getCooldownMultiplier(team);
                    b68 = false;
                }
            }
            if (v68 > v63 + p68) {
                v68 = v63 + p68;
                d68 = d63;
            }
            if (v68 > v62 + p68) {
                v68 = v62 + p68;
                d68 = d62;
            }
            if (v68 > v61 + p68) {
                v68 = v61 + p68;
                d68 = d61;
            }
            if (v68 > v67 + p68) {
                v68 = v67 + p68;
                d68 = d67;
            }
            
            r68 |= r63;
            r68 |= r62;
            r68 |= r61;
            r68 |= r67;
            r68 &= !b68;
            o63 |= b68;
            o62 |= b68;
            o61 |= b68;
            o67 |= b68;
        }
        else {
            o63 |= b68;
            o62 |= b68;
            o61 |= b68;
            o67 |= b68;
        }

        if (rc.onTheMap(l64) && rc.canSenseLocation(l64)) {
            if (rc.senseCloud(l64)) {
                p64 = 1.5;
                b64 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l64).getCurrentDirection();
                if (targetLocation.equals(l64) || (rc.sensePassability(l64) && !rc.canSenseRobotAtLocation(l64) && currentDirection.equals(Direction.CENTER))) {
                    p64 = rc.senseMapInfo(l64).getCooldownMultiplier(team);
                    b64 = false;
                }
            }
            if (v64 > v65 + p64) {
                v64 = v65 + p64;
                d64 = d65;
            }
            if (v64 > v59 + p64) {
                v64 = v59 + p64;
                d64 = d59;
            }
            if (v64 > v58 + p64) {
                v64 = v58 + p64;
                d64 = d58;
            }
            if (v64 > v57 + p64) {
                v64 = v57 + p64;
                d64 = d57;
            }
            
            r64 |= r65;
            r64 |= r59;
            r64 |= r58;
            r64 |= r57;
            r64 &= !b64;
            o65 |= b64;
            o59 |= b64;
            o58 |= b64;
            o57 |= b64;
        }
        else {
            o65 |= b64;
            o59 |= b64;
            o58 |= b64;
            o57 |= b64;
        }

        if (rc.onTheMap(l12) && rc.canSenseLocation(l12)) {
            if (rc.senseCloud(l12)) {
                p12 = 1.5;
                b12 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l12).getCurrentDirection();
                if (targetLocation.equals(l12) || (rc.sensePassability(l12) && !rc.canSenseRobotAtLocation(l12) && currentDirection.equals(Direction.CENTER))) {
                    p12 = rc.senseMapInfo(l12).getCooldownMultiplier(team);
                    b12 = false;
                }
            }
            if (v12 > v21 + p12) {
                v12 = v21 + p12;
                d12 = d21;
            }
            if (v12 > v22 + p12) {
                v12 = v22 + p12;
                d12 = d22;
            }
            if (v12 > v13 + p12) {
                v12 = v13 + p12;
                d12 = d13;
            }
            if (v12 > v5 + p12) {
                v12 = v5 + p12;
                d12 = d5;
            }
            
            r12 |= r21;
            r12 |= r22;
            r12 |= r13;
            r12 |= r5;
            r12 &= !b12;
            o21 |= b12;
            o22 |= b12;
            o13 |= b12;
            o5 |= b12;
        }
        else {
            o21 |= b12;
            o22 |= b12;
            o13 |= b12;
            o5 |= b12;
        }

        if (rc.onTheMap(l48) && rc.canSenseLocation(l48)) {
            if (rc.senseCloud(l48)) {
                p48 = 1.5;
                b48 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l48).getCurrentDirection();
                if (targetLocation.equals(l48) || (rc.sensePassability(l48) && !rc.canSenseRobotAtLocation(l48) && currentDirection.equals(Direction.CENTER))) {
                    p48 = rc.senseMapInfo(l48).getCooldownMultiplier(team);
                    b48 = false;
                }
            }
            if (v48 > v57 + p48) {
                v48 = v57 + p48;
                d48 = d57;
            }
            if (v48 > v49 + p48) {
                v48 = v49 + p48;
                d48 = d49;
            }
            if (v48 > v40 + p48) {
                v48 = v40 + p48;
                d48 = d40;
            }
            if (v48 > v39 + p48) {
                v48 = v39 + p48;
                d48 = d39;
            }
            
            r48 |= r57;
            r48 |= r49;
            r48 |= r40;
            r48 |= r39;
            r48 &= !b48;
            o57 |= b48;
            o49 |= b48;
            o40 |= b48;
            o39 |= b48;
        }
        else {
            o57 |= b48;
            o49 |= b48;
            o40 |= b48;
            o39 |= b48;
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
                        if (v5 < 10000) {
                            return d5;
                        }
                } break;

            case -2:
                switch(dy) {
                    case -4:
                        if (v12 < 10000) {
                            return d12;
                        }
                    case -3:
                        if (v13 < 10000) {
                            return d13;
                        }
                    case -2:
                        if (v14 < 10000) {
                            return d14;
                        }
                } break;

            case -1:
                switch(dy) {
                    case -4:
                        if (v21 < 10000) {
                            return d21;
                        }
                    case -3:
                        if (v22 < 10000) {
                            return d22;
                        }
                    case -2:
                        if (v23 < 10000) {
                            return d23;
                        }
                    case -1:
                        if (v24 < 10000) {
                            return d24;
                        }
                } break;

            case 0:
                switch(dy) {
                    case -4:
                        if (v30 < 10000) {
                            return d30;
                        }
                    case -3:
                        if (v31 < 10000) {
                            return d31;
                        }
                    case -2:
                        if (v32 < 10000) {
                            return d32;
                        }
                    case -1:
                        if (v33 < 10000) {
                            return d33;
                        }
                    case 0:
                        if (v34 < 10000) {
                            return d34;
                        }
                } break;

            case 1:
                switch(dy) {
                    case -4:
                        if (v39 < 10000) {
                            return d39;
                        }
                    case -3:
                        if (v40 < 10000) {
                            return d40;
                        }
                    case -2:
                        if (v41 < 10000) {
                            return d41;
                        }
                    case -1:
                        if (v42 < 10000) {
                            return d42;
                        }
                    case 0:
                        if (v43 < 10000) {
                            return d43;
                        }
                    case 1:
                        if (v44 < 10000) {
                            return d44;
                        }
                } break;

            case 2:
                switch(dy) {
                    case -4:
                        if (v48 < 10000) {
                            return d48;
                        }
                    case -3:
                        if (v49 < 10000) {
                            return d49;
                        }
                    case -2:
                        if (v50 < 10000) {
                            return d50;
                        }
                    case -1:
                        if (v51 < 10000) {
                            return d51;
                        }
                    case 0:
                        if (v52 < 10000) {
                            return d52;
                        }
                    case 1:
                        if (v53 < 10000) {
                            return d53;
                        }
                    case 2:
                        if (v54 < 10000) {
                            return d54;
                        }
                } break;

            case 3:
                switch(dy) {
                    case -3:
                        if (v57 < 10000) {
                            return d57;
                        }
                    case -2:
                        if (v58 < 10000) {
                            return d58;
                        }
                    case -1:
                        if (v59 < 10000) {
                            return d59;
                        }
                    case 0:
                        if (v60 < 10000) {
                            return d60;
                        }
                    case 1:
                        if (v61 < 10000) {
                            return d61;
                        }
                    case 2:
                        if (v62 < 10000) {
                            return d62;
                        }
                    case 3:
                        if (v63 < 10000) {
                            return d63;
                        }
                } break;

            case 4:
                switch(dy) {
                    case -2:
                        if (v64 < 10000) {
                            return d64;
                        }
                    case -1:
                        if (v65 < 10000) {
                            return d65;
                        }
                    case 0:
                        if (v66 < 10000) {
                            return d66;
                        }
                    case 1:
                        if (v67 < 10000) {
                            return d67;
                        }
                    case 2:
                        if (v68 < 10000) {
                            return d68;
                        }
                } break;

        }
    
        o5 = r5;
        o12 = r12;
        o21 = r21;
        o30 = r30;
        o39 = r39;
        o48 = r48;
        o57 = r57;
        o63 = r63;
        o64 = r64;
        o65 = r65;
        o66 = r66;
        o67 = r67;
        o68 = r68;
        Direction ans = Direction.CENTER;

        if (r5 && o5) {
            double dist5 = v5 + 1.5 * Math.sqrt(l5.distanceSquaredTo(targetLocation));
            if (dist5 < localBest) {
                localBest = dist5;
                ans = d5;
                best = l5;
            }
        }

        if (r12 && o12) {
            double dist12 = v12 + 1.5 * Math.sqrt(l12.distanceSquaredTo(targetLocation));
            if (dist12 < localBest) {
                localBest = dist12;
                ans = d12;
                best = l12;
            }
        }

        if (r21 && o21) {
            double dist21 = v21 + 1.5 * Math.sqrt(l21.distanceSquaredTo(targetLocation));
            if (dist21 < localBest) {
                localBest = dist21;
                ans = d21;
                best = l21;
            }
        }

        if (r30 && o30) {
            double dist30 = v30 + 1.5 * Math.sqrt(l30.distanceSquaredTo(targetLocation));
            if (dist30 < localBest) {
                localBest = dist30;
                ans = d30;
                best = l30;
            }
        }

        if (r39 && o39) {
            double dist39 = v39 + 1.5 * Math.sqrt(l39.distanceSquaredTo(targetLocation));
            if (dist39 < localBest) {
                localBest = dist39;
                ans = d39;
                best = l39;
            }
        }

        if (r48 && o48) {
            double dist48 = v48 + 1.5 * Math.sqrt(l48.distanceSquaredTo(targetLocation));
            if (dist48 < localBest) {
                localBest = dist48;
                ans = d48;
                best = l48;
            }
        }

        if (r57 && o57) {
            double dist57 = v57 + 1.5 * Math.sqrt(l57.distanceSquaredTo(targetLocation));
            if (dist57 < localBest) {
                localBest = dist57;
                ans = d57;
                best = l57;
            }
        }

        if (r63 && o63) {
            double dist63 = v63 + 1.5 * Math.sqrt(l63.distanceSquaredTo(targetLocation));
            if (dist63 < localBest) {
                localBest = dist63;
                ans = d63;
                best = l63;
            }
        }

        if (r64 && o64) {
            double dist64 = v64 + 1.5 * Math.sqrt(l64.distanceSquaredTo(targetLocation));
            if (dist64 < localBest) {
                localBest = dist64;
                ans = d64;
                best = l64;
            }
        }

        if (r65 && o65) {
            double dist65 = v65 + 1.5 * Math.sqrt(l65.distanceSquaredTo(targetLocation));
            if (dist65 < localBest) {
                localBest = dist65;
                ans = d65;
                best = l65;
            }
        }

        if (r66 && o66) {
            double dist66 = v66 + 1.5 * Math.sqrt(l66.distanceSquaredTo(targetLocation));
            if (dist66 < localBest) {
                localBest = dist66;
                ans = d66;
                best = l66;
            }
        }

        if (r67 && o67) {
            double dist67 = v67 + 1.5 * Math.sqrt(l67.distanceSquaredTo(targetLocation));
            if (dist67 < localBest) {
                localBest = dist67;
                ans = d67;
                best = l67;
            }
        }

        if (r68 && o68) {
            double dist68 = v68 + 1.5 * Math.sqrt(l68.distanceSquaredTo(targetLocation));
            if (dist68 < localBest) {
                localBest = dist68;
                ans = d68;
                best = l68;
            }
        }

        draws3();
        rc.setIndicatorDot(best, 0, 0, 255);
        if (localBest < globalBest) {
            globalBest = localBest;
            return ans;
        }
        return getBestDirectionWallFollow3(ans);
    }

    private Direction getBestDirectionWallFollow3(Direction prev) throws GameActionException {
        Direction ans = Direction.CENTER;
        int minDistance = closestWallLocations.isEmpty() ? 1000000 : currentLocation.distanceSquaredTo(closestWallLocations.get(0));
    
        if (b5) {
            int distance = currentLocation.distanceSquaredTo(l5);
            if (distance == minDistance) {
                closestWallLocations.add(l5);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l5);
                minDistance = distance;
            }
        }

        if (b12) {
            int distance = currentLocation.distanceSquaredTo(l12);
            if (distance == minDistance) {
                closestWallLocations.add(l12);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l12);
                minDistance = distance;
            }
        }

        if (b13) {
            int distance = currentLocation.distanceSquaredTo(l13);
            if (distance == minDistance) {
                closestWallLocations.add(l13);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l13);
                minDistance = distance;
            }
        }

        if (b14) {
            int distance = currentLocation.distanceSquaredTo(l14);
            if (distance == minDistance) {
                closestWallLocations.add(l14);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l14);
                minDistance = distance;
            }
        }

        if (b21) {
            int distance = currentLocation.distanceSquaredTo(l21);
            if (distance == minDistance) {
                closestWallLocations.add(l21);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l21);
                minDistance = distance;
            }
        }

        if (b22) {
            int distance = currentLocation.distanceSquaredTo(l22);
            if (distance == minDistance) {
                closestWallLocations.add(l22);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l22);
                minDistance = distance;
            }
        }

        if (b23) {
            int distance = currentLocation.distanceSquaredTo(l23);
            if (distance == minDistance) {
                closestWallLocations.add(l23);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l23);
                minDistance = distance;
            }
        }

        if (b24) {
            int distance = currentLocation.distanceSquaredTo(l24);
            if (distance == minDistance) {
                closestWallLocations.add(l24);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l24);
                minDistance = distance;
            }
        }

        if (b30) {
            int distance = currentLocation.distanceSquaredTo(l30);
            if (distance == minDistance) {
                closestWallLocations.add(l30);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l30);
                minDistance = distance;
            }
        }

        if (b31) {
            int distance = currentLocation.distanceSquaredTo(l31);
            if (distance == minDistance) {
                closestWallLocations.add(l31);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l31);
                minDistance = distance;
            }
        }

        if (b32) {
            int distance = currentLocation.distanceSquaredTo(l32);
            if (distance == minDistance) {
                closestWallLocations.add(l32);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l32);
                minDistance = distance;
            }
        }

        if (b33) {
            int distance = currentLocation.distanceSquaredTo(l33);
            if (distance == minDistance) {
                closestWallLocations.add(l33);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l33);
                minDistance = distance;
            }
        }

        if (b39) {
            int distance = currentLocation.distanceSquaredTo(l39);
            if (distance == minDistance) {
                closestWallLocations.add(l39);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l39);
                minDistance = distance;
            }
        }

        if (b40) {
            int distance = currentLocation.distanceSquaredTo(l40);
            if (distance == minDistance) {
                closestWallLocations.add(l40);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l40);
                minDistance = distance;
            }
        }

        if (b41) {
            int distance = currentLocation.distanceSquaredTo(l41);
            if (distance == minDistance) {
                closestWallLocations.add(l41);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l41);
                minDistance = distance;
            }
        }

        if (b42) {
            int distance = currentLocation.distanceSquaredTo(l42);
            if (distance == minDistance) {
                closestWallLocations.add(l42);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l42);
                minDistance = distance;
            }
        }

        if (b43) {
            int distance = currentLocation.distanceSquaredTo(l43);
            if (distance == minDistance) {
                closestWallLocations.add(l43);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l43);
                minDistance = distance;
            }
        }

        if (b44) {
            int distance = currentLocation.distanceSquaredTo(l44);
            if (distance == minDistance) {
                closestWallLocations.add(l44);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l44);
                minDistance = distance;
            }
        }

        if (b48) {
            int distance = currentLocation.distanceSquaredTo(l48);
            if (distance == minDistance) {
                closestWallLocations.add(l48);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l48);
                minDistance = distance;
            }
        }

        if (b49) {
            int distance = currentLocation.distanceSquaredTo(l49);
            if (distance == minDistance) {
                closestWallLocations.add(l49);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l49);
                minDistance = distance;
            }
        }

        if (b50) {
            int distance = currentLocation.distanceSquaredTo(l50);
            if (distance == minDistance) {
                closestWallLocations.add(l50);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l50);
                minDistance = distance;
            }
        }

        if (b51) {
            int distance = currentLocation.distanceSquaredTo(l51);
            if (distance == minDistance) {
                closestWallLocations.add(l51);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l51);
                minDistance = distance;
            }
        }

        if (b52) {
            int distance = currentLocation.distanceSquaredTo(l52);
            if (distance == minDistance) {
                closestWallLocations.add(l52);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l52);
                minDistance = distance;
            }
        }

        if (b53) {
            int distance = currentLocation.distanceSquaredTo(l53);
            if (distance == minDistance) {
                closestWallLocations.add(l53);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l53);
                minDistance = distance;
            }
        }

        if (b54) {
            int distance = currentLocation.distanceSquaredTo(l54);
            if (distance == minDistance) {
                closestWallLocations.add(l54);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l54);
                minDistance = distance;
            }
        }

        if (b57) {
            int distance = currentLocation.distanceSquaredTo(l57);
            if (distance == minDistance) {
                closestWallLocations.add(l57);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l57);
                minDistance = distance;
            }
        }

        if (b58) {
            int distance = currentLocation.distanceSquaredTo(l58);
            if (distance == minDistance) {
                closestWallLocations.add(l58);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l58);
                minDistance = distance;
            }
        }

        if (b59) {
            int distance = currentLocation.distanceSquaredTo(l59);
            if (distance == minDistance) {
                closestWallLocations.add(l59);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l59);
                minDistance = distance;
            }
        }

        if (b60) {
            int distance = currentLocation.distanceSquaredTo(l60);
            if (distance == minDistance) {
                closestWallLocations.add(l60);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l60);
                minDistance = distance;
            }
        }

        if (b61) {
            int distance = currentLocation.distanceSquaredTo(l61);
            if (distance == minDistance) {
                closestWallLocations.add(l61);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l61);
                minDistance = distance;
            }
        }

        if (b62) {
            int distance = currentLocation.distanceSquaredTo(l62);
            if (distance == minDistance) {
                closestWallLocations.add(l62);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l62);
                minDistance = distance;
            }
        }

        if (b63) {
            int distance = currentLocation.distanceSquaredTo(l63);
            if (distance == minDistance) {
                closestWallLocations.add(l63);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l63);
                minDistance = distance;
            }
        }

        if (b64) {
            int distance = currentLocation.distanceSquaredTo(l64);
            if (distance == minDistance) {
                closestWallLocations.add(l64);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l64);
                minDistance = distance;
            }
        }

        if (b65) {
            int distance = currentLocation.distanceSquaredTo(l65);
            if (distance == minDistance) {
                closestWallLocations.add(l65);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l65);
                minDistance = distance;
            }
        }

        if (b66) {
            int distance = currentLocation.distanceSquaredTo(l66);
            if (distance == minDistance) {
                closestWallLocations.add(l66);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l66);
                minDistance = distance;
            }
        }

        if (b67) {
            int distance = currentLocation.distanceSquaredTo(l67);
            if (distance == minDistance) {
                closestWallLocations.add(l67);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l67);
                minDistance = distance;
            }
        }

        if (b68) {
            int distance = currentLocation.distanceSquaredTo(l68);
            if (distance == minDistance) {
                closestWallLocations.add(l68);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l68);
                minDistance = distance;
            }
        }

        if (minDistance > 2) { return prev; }
        int maxDot = -999999;
        minDistance = 1000000;
        for (MapLocation closestWallLocation : closestWallLocations) {
            Direction vertical = currentLocation.directionTo(closestWallLocation);

            Direction tangent1 = vertical.rotateLeft().rotateLeft();
            Direction tangent2 = vertical.rotateRight().rotateRight();

            int dx = lastDirection.getDeltaX();
            int dy = lastDirection.getDeltaY();

            int dot1 = tangent1.getDeltaX() * dx + tangent1.getDeltaY() * dy;
            int dot2 = tangent2.getDeltaX() * dx + tangent2.getDeltaY() * dy;

            int distance1 = currentLocation.add(tangent1).distanceSquaredTo(targetLocation);
            int distance2 = currentLocation.add(tangent2).distanceSquaredTo(targetLocation);

            if (!rc.canMove(tangent1)) {
                dot1 = -1000000;
            }

            if (!rc.canMove(tangent2)) {
                dot2 = -1000000;
            }

            if (dot1 > maxDot) {
                maxDot = dot1;
                minDistance = distance1;
                ans = tangent1;
            }

            if (dot2 > maxDot) {
                maxDot = dot2;
                minDistance = distance2;
                ans = tangent2;
            }

            if (dot1 == maxDot && distance1 < minDistance) {
                maxDot = dot1;
                minDistance = distance1;
                ans = tangent1;
            }

            if (dot2 == maxDot && distance2 < minDistance) {
                maxDot = dot2;
                minDistance = distance2;
                ans = tangent2;
            }
        }
        draws3();
        for (MapLocation closestWallLocation : closestWallLocations) {
            rc.setIndicatorDot(closestWallLocation, 255, 0, 0);
        }
        return ans;
    }

    private void draws3() throws GameActionException {
    
        rc.setIndicatorDot(l5, 255, 0, 255);
        if (b5) {
            rc.setIndicatorDot(l5, 255, 255, 255);
        }

        rc.setIndicatorDot(l12, 255, 0, 255);
        if (b12) {
            rc.setIndicatorDot(l12, 255, 255, 255);
        }

        rc.setIndicatorDot(l13, 255, 0, 255);
        if (b13) {
            rc.setIndicatorDot(l13, 255, 255, 255);
        }

        rc.setIndicatorDot(l14, 255, 0, 255);
        if (b14) {
            rc.setIndicatorDot(l14, 255, 255, 255);
        }

        rc.setIndicatorDot(l21, 255, 0, 255);
        if (b21) {
            rc.setIndicatorDot(l21, 255, 255, 255);
        }

        rc.setIndicatorDot(l22, 255, 0, 255);
        if (b22) {
            rc.setIndicatorDot(l22, 255, 255, 255);
        }

        rc.setIndicatorDot(l23, 255, 0, 255);
        if (b23) {
            rc.setIndicatorDot(l23, 255, 255, 255);
        }

        rc.setIndicatorDot(l24, 255, 0, 255);
        if (b24) {
            rc.setIndicatorDot(l24, 255, 255, 255);
        }

        rc.setIndicatorDot(l30, 255, 0, 255);
        if (b30) {
            rc.setIndicatorDot(l30, 255, 255, 255);
        }

        rc.setIndicatorDot(l31, 255, 0, 255);
        if (b31) {
            rc.setIndicatorDot(l31, 255, 255, 255);
        }

        rc.setIndicatorDot(l32, 255, 0, 255);
        if (b32) {
            rc.setIndicatorDot(l32, 255, 255, 255);
        }

        rc.setIndicatorDot(l33, 255, 0, 255);
        if (b33) {
            rc.setIndicatorDot(l33, 255, 255, 255);
        }

        rc.setIndicatorDot(l39, 255, 0, 255);
        if (b39) {
            rc.setIndicatorDot(l39, 255, 255, 255);
        }

        rc.setIndicatorDot(l40, 255, 0, 255);
        if (b40) {
            rc.setIndicatorDot(l40, 255, 255, 255);
        }

        rc.setIndicatorDot(l41, 255, 0, 255);
        if (b41) {
            rc.setIndicatorDot(l41, 255, 255, 255);
        }

        rc.setIndicatorDot(l42, 255, 0, 255);
        if (b42) {
            rc.setIndicatorDot(l42, 255, 255, 255);
        }

        rc.setIndicatorDot(l43, 255, 0, 255);
        if (b43) {
            rc.setIndicatorDot(l43, 255, 255, 255);
        }

        rc.setIndicatorDot(l44, 255, 0, 255);
        if (b44) {
            rc.setIndicatorDot(l44, 255, 255, 255);
        }

        rc.setIndicatorDot(l48, 255, 0, 255);
        if (b48) {
            rc.setIndicatorDot(l48, 255, 255, 255);
        }

        rc.setIndicatorDot(l49, 255, 0, 255);
        if (b49) {
            rc.setIndicatorDot(l49, 255, 255, 255);
        }

        rc.setIndicatorDot(l50, 255, 0, 255);
        if (b50) {
            rc.setIndicatorDot(l50, 255, 255, 255);
        }

        rc.setIndicatorDot(l51, 255, 0, 255);
        if (b51) {
            rc.setIndicatorDot(l51, 255, 255, 255);
        }

        rc.setIndicatorDot(l52, 255, 0, 255);
        if (b52) {
            rc.setIndicatorDot(l52, 255, 255, 255);
        }

        rc.setIndicatorDot(l53, 255, 0, 255);
        if (b53) {
            rc.setIndicatorDot(l53, 255, 255, 255);
        }

        rc.setIndicatorDot(l54, 255, 0, 255);
        if (b54) {
            rc.setIndicatorDot(l54, 255, 255, 255);
        }

        rc.setIndicatorDot(l57, 255, 0, 255);
        if (b57) {
            rc.setIndicatorDot(l57, 255, 255, 255);
        }

        rc.setIndicatorDot(l58, 255, 0, 255);
        if (b58) {
            rc.setIndicatorDot(l58, 255, 255, 255);
        }

        rc.setIndicatorDot(l59, 255, 0, 255);
        if (b59) {
            rc.setIndicatorDot(l59, 255, 255, 255);
        }

        rc.setIndicatorDot(l60, 255, 0, 255);
        if (b60) {
            rc.setIndicatorDot(l60, 255, 255, 255);
        }

        rc.setIndicatorDot(l61, 255, 0, 255);
        if (b61) {
            rc.setIndicatorDot(l61, 255, 255, 255);
        }

        rc.setIndicatorDot(l62, 255, 0, 255);
        if (b62) {
            rc.setIndicatorDot(l62, 255, 255, 255);
        }

        rc.setIndicatorDot(l63, 255, 0, 255);
        if (b63) {
            rc.setIndicatorDot(l63, 255, 255, 255);
        }

        rc.setIndicatorDot(l64, 255, 0, 255);
        if (b64) {
            rc.setIndicatorDot(l64, 255, 255, 255);
        }

        rc.setIndicatorDot(l65, 255, 0, 255);
        if (b65) {
            rc.setIndicatorDot(l65, 255, 255, 255);
        }

        rc.setIndicatorDot(l66, 255, 0, 255);
        if (b66) {
            rc.setIndicatorDot(l66, 255, 255, 255);
        }

        rc.setIndicatorDot(l67, 255, 0, 255);
        if (b67) {
            rc.setIndicatorDot(l67, 255, 255, 255);
        }

        rc.setIndicatorDot(l68, 255, 0, 255);
        if (b68) {
            rc.setIndicatorDot(l68, 255, 255, 255);
        }

    }

    private Direction getBestDirection4() throws GameActionException {
        MapLocation best = currentLocation;
        double localBest = 1000000.0;
        l34 = currentLocation;
        v34 = 0;
        d34 = Direction.CENTER;
        r34 = true;
        l43 = l34.add(Direction.EAST);
        v43 = 1000000;
        p43 = 1000000;
        d43 = null;
        b43 = true;
        r43 = false;
        o43 = false;
        l25 = l34.add(Direction.WEST);
        v25 = 1000000;
        p25 = 1000000;
        d25 = null;
        b25 = true;
        r25 = false;
        o25 = false;
        l24 = l34.add(Direction.SOUTHWEST);
        v24 = 1000000;
        p24 = 1000000;
        d24 = null;
        b24 = true;
        r24 = false;
        o24 = false;
        l33 = l34.add(Direction.SOUTH);
        v33 = 1000000;
        p33 = 1000000;
        d33 = null;
        b33 = true;
        r33 = false;
        o33 = false;
        l42 = l34.add(Direction.SOUTHEAST);
        v42 = 1000000;
        p42 = 1000000;
        d42 = null;
        b42 = true;
        r42 = false;
        o42 = false;
        l23 = l33.add(Direction.SOUTHWEST);
        v23 = 1000000;
        p23 = 1000000;
        d23 = null;
        b23 = true;
        r23 = false;
        o23 = false;
        l32 = l33.add(Direction.SOUTH);
        v32 = 1000000;
        p32 = 1000000;
        d32 = null;
        b32 = true;
        r32 = false;
        o32 = false;
        l41 = l33.add(Direction.SOUTHEAST);
        v41 = 1000000;
        p41 = 1000000;
        d41 = null;
        b41 = true;
        r41 = false;
        o41 = false;
        l16 = l25.add(Direction.WEST);
        v16 = 1000000;
        p16 = 1000000;
        d16 = null;
        b16 = true;
        r16 = false;
        o16 = false;
        l15 = l25.add(Direction.SOUTHWEST);
        v15 = 1000000;
        p15 = 1000000;
        d15 = null;
        b15 = true;
        r15 = false;
        o15 = false;
        l52 = l43.add(Direction.EAST);
        v52 = 1000000;
        p52 = 1000000;
        d52 = null;
        b52 = true;
        r52 = false;
        o52 = false;
        l51 = l43.add(Direction.SOUTHEAST);
        v51 = 1000000;
        p51 = 1000000;
        d51 = null;
        b51 = true;
        r51 = false;
        o51 = false;
        l50 = l42.add(Direction.SOUTHEAST);
        v50 = 1000000;
        p50 = 1000000;
        d50 = null;
        b50 = true;
        r50 = false;
        o50 = false;
        l14 = l24.add(Direction.SOUTHWEST);
        v14 = 1000000;
        p14 = 1000000;
        d14 = null;
        b14 = true;
        r14 = false;
        o14 = false;
        l60 = l52.add(Direction.EAST);
        v60 = 1000000;
        p60 = 1000000;
        d60 = null;
        b60 = true;
        r60 = false;
        o60 = false;
        l59 = l52.add(Direction.SOUTHEAST);
        v59 = 1000000;
        p59 = 1000000;
        d59 = null;
        b59 = true;
        r59 = false;
        o59 = false;
        l22 = l32.add(Direction.SOUTHWEST);
        v22 = 1000000;
        p22 = 1000000;
        d22 = null;
        b22 = true;
        r22 = false;
        o22 = false;
        l31 = l32.add(Direction.SOUTH);
        v31 = 1000000;
        p31 = 1000000;
        d31 = null;
        b31 = true;
        r31 = false;
        o31 = false;
        l40 = l32.add(Direction.SOUTHEAST);
        v40 = 1000000;
        p40 = 1000000;
        d40 = null;
        b40 = true;
        r40 = false;
        o40 = false;
        l8 = l16.add(Direction.WEST);
        v8 = 1000000;
        p8 = 1000000;
        d8 = null;
        b8 = true;
        r8 = false;
        o8 = false;
        l7 = l16.add(Direction.SOUTHWEST);
        v7 = 1000000;
        p7 = 1000000;
        d7 = null;
        b7 = true;
        r7 = false;
        o7 = false;
        l58 = l51.add(Direction.SOUTHEAST);
        v58 = 1000000;
        p58 = 1000000;
        d58 = null;
        b58 = true;
        r58 = false;
        o58 = false;
        l6 = l15.add(Direction.SOUTHWEST);
        v6 = 1000000;
        p6 = 1000000;
        d6 = null;
        b6 = true;
        r6 = false;
        o6 = false;
        l13 = l23.add(Direction.SOUTHWEST);
        v13 = 1000000;
        p13 = 1000000;
        d13 = null;
        b13 = true;
        r13 = false;
        o13 = false;
        l49 = l41.add(Direction.SOUTHEAST);
        v49 = 1000000;
        p49 = 1000000;
        d49 = null;
        b49 = true;
        r49 = false;
        o49 = false;
        l57 = l50.add(Direction.SOUTHEAST);
        v57 = 1000000;
        p57 = 1000000;
        d57 = null;
        b57 = true;
        r57 = false;
        o57 = false;
        l5 = l14.add(Direction.SOUTHWEST);
        v5 = 1000000;
        p5 = 1000000;
        d5 = null;
        b5 = true;
        r5 = false;
        o5 = false;
        l66 = l60.add(Direction.EAST);
        v66 = 1000000;
        p66 = 1000000;
        d66 = null;
        b66 = true;
        r66 = false;
        o66 = false;
        l65 = l60.add(Direction.SOUTHEAST);
        v65 = 1000000;
        p65 = 1000000;
        d65 = null;
        b65 = true;
        r65 = false;
        o65 = false;
        l21 = l31.add(Direction.SOUTHWEST);
        v21 = 1000000;
        p21 = 1000000;
        d21 = null;
        b21 = true;
        r21 = false;
        o21 = false;
        l30 = l31.add(Direction.SOUTH);
        v30 = 1000000;
        p30 = 1000000;
        d30 = null;
        b30 = true;
        r30 = false;
        o30 = false;
        l39 = l31.add(Direction.SOUTHEAST);
        v39 = 1000000;
        p39 = 1000000;
        d39 = null;
        b39 = true;
        r39 = false;
        o39 = false;
        l2 = l8.add(Direction.WEST);
        v2 = 1000000;
        p2 = 1000000;
        d2 = null;
        b2 = true;
        r2 = false;
        o2 = false;
        l1 = l8.add(Direction.SOUTHWEST);
        v1 = 1000000;
        p1 = 1000000;
        d1 = null;
        b1 = true;
        r1 = false;
        o1 = false;
        l64 = l59.add(Direction.SOUTHEAST);
        v64 = 1000000;
        p64 = 1000000;
        d64 = null;
        b64 = true;
        r64 = false;
        o64 = false;
        l12 = l22.add(Direction.SOUTHWEST);
        v12 = 1000000;
        p12 = 1000000;
        d12 = null;
        b12 = true;
        r12 = false;
        o12 = false;
        l0 = l7.add(Direction.SOUTHWEST);
        v0 = 1000000;
        p0 = 1000000;
        d0 = null;
        b0 = true;
        r0 = false;
        o0 = false;
        l48 = l40.add(Direction.SOUTHEAST);
        v48 = 1000000;
        p48 = 1000000;
        d48 = null;
        b48 = true;
        r48 = false;
        o48 = false;
    
        if (rc.onTheMap(l33) && rc.canSenseLocation(l33)) {
            if (rc.senseCloud(l33)) {
                p33 = 1.5;
                b33 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l33).getCurrentDirection();
                if (targetLocation.equals(l33) || (rc.sensePassability(l33) && !rc.canSenseRobotAtLocation(l33) && currentDirection.equals(Direction.CENTER))) {
                    p33 = rc.senseMapInfo(l33).getCooldownMultiplier(team);
                    b33 = false;
                }
            }
            if (v33 > v43 + p33) {
                v33 = v43 + p33;
                d33 = d43;
            }
            if (v33 > v34 + p33) {
                v33 = v34 + p33;
                d33 = Direction.SOUTH;
            }
            if (v33 > v25 + p33) {
                v33 = v25 + p33;
                d33 = d25;
            }
            
            r33 |= r43;
            r33 |= r34;
            r33 |= r25;
            r33 &= !b33;
            o43 |= b33;
            o25 |= b33;
        }
        else {
            o43 |= b33;
            o25 |= b33;
        }

        if (rc.onTheMap(l25) && rc.canSenseLocation(l25)) {
            if (rc.senseCloud(l25)) {
                p25 = 1.5;
                b25 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l25).getCurrentDirection();
                if (targetLocation.equals(l25) || (rc.sensePassability(l25) && !rc.canSenseRobotAtLocation(l25) && currentDirection.equals(Direction.CENTER))) {
                    p25 = rc.senseMapInfo(l25).getCooldownMultiplier(team);
                    b25 = false;
                }
            }
            if (v25 > v34 + p25) {
                v25 = v34 + p25;
                d25 = Direction.WEST;
            }
            if (v25 > v33 + p25) {
                v25 = v33 + p25;
                d25 = d33;
            }
            
            r25 |= r34;
            r25 |= r33;
            r25 &= !b25;
            o33 |= b25;
        }
        else {
            o33 |= b25;
        }

        if (rc.onTheMap(l43) && rc.canSenseLocation(l43)) {
            if (rc.senseCloud(l43)) {
                p43 = 1.5;
                b43 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l43).getCurrentDirection();
                if (targetLocation.equals(l43) || (rc.sensePassability(l43) && !rc.canSenseRobotAtLocation(l43) && currentDirection.equals(Direction.CENTER))) {
                    p43 = rc.senseMapInfo(l43).getCooldownMultiplier(team);
                    b43 = false;
                }
            }
            if (v43 > v34 + p43) {
                v43 = v34 + p43;
                d43 = Direction.EAST;
            }
            if (v43 > v33 + p43) {
                v43 = v33 + p43;
                d43 = d33;
            }
            
            r43 |= r34;
            r43 |= r33;
            r43 &= !b43;
            o33 |= b43;
        }
        else {
            o33 |= b43;
        }

        if (rc.onTheMap(l42) && rc.canSenseLocation(l42)) {
            if (rc.senseCloud(l42)) {
                p42 = 1.5;
                b42 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l42).getCurrentDirection();
                if (targetLocation.equals(l42) || (rc.sensePassability(l42) && !rc.canSenseRobotAtLocation(l42) && currentDirection.equals(Direction.CENTER))) {
                    p42 = rc.senseMapInfo(l42).getCooldownMultiplier(team);
                    b42 = false;
                }
            }
            if (v42 > v43 + p42) {
                v42 = v43 + p42;
                d42 = d43;
            }
            if (v42 > v34 + p42) {
                v42 = v34 + p42;
                d42 = Direction.SOUTHEAST;
            }
            if (v42 > v33 + p42) {
                v42 = v33 + p42;
                d42 = d33;
            }
            
            r42 |= r43;
            r42 |= r34;
            r42 |= r33;
            r42 &= !b42;
            o43 |= b42;
            o33 |= b42;
        }
        else {
            o43 |= b42;
            o33 |= b42;
        }

        if (rc.onTheMap(l24) && rc.canSenseLocation(l24)) {
            if (rc.senseCloud(l24)) {
                p24 = 1.5;
                b24 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l24).getCurrentDirection();
                if (targetLocation.equals(l24) || (rc.sensePassability(l24) && !rc.canSenseRobotAtLocation(l24) && currentDirection.equals(Direction.CENTER))) {
                    p24 = rc.senseMapInfo(l24).getCooldownMultiplier(team);
                    b24 = false;
                }
            }
            if (v24 > v33 + p24) {
                v24 = v33 + p24;
                d24 = d33;
            }
            if (v24 > v34 + p24) {
                v24 = v34 + p24;
                d24 = Direction.SOUTHWEST;
            }
            if (v24 > v25 + p24) {
                v24 = v25 + p24;
                d24 = d25;
            }
            
            r24 |= r33;
            r24 |= r34;
            r24 |= r25;
            r24 &= !b24;
            o33 |= b24;
            o25 |= b24;
        }
        else {
            o33 |= b24;
            o25 |= b24;
        }

        if (rc.onTheMap(l52) && rc.canSenseLocation(l52)) {
            if (rc.senseCloud(l52)) {
                p52 = 1.5;
                b52 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l52).getCurrentDirection();
                if (targetLocation.equals(l52) || (rc.sensePassability(l52) && !rc.canSenseRobotAtLocation(l52) && currentDirection.equals(Direction.CENTER))) {
                    p52 = rc.senseMapInfo(l52).getCooldownMultiplier(team);
                    b52 = false;
                }
            }
            if (v52 > v43 + p52) {
                v52 = v43 + p52;
                d52 = d43;
            }
            if (v52 > v42 + p52) {
                v52 = v42 + p52;
                d52 = d42;
            }
            
            r52 |= r43;
            r52 |= r42;
            r52 &= !b52;
            o43 |= b52;
            o42 |= b52;
        }
        else {
            o43 |= b52;
            o42 |= b52;
        }

        if (rc.onTheMap(l32) && rc.canSenseLocation(l32)) {
            if (rc.senseCloud(l32)) {
                p32 = 1.5;
                b32 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l32).getCurrentDirection();
                if (targetLocation.equals(l32) || (rc.sensePassability(l32) && !rc.canSenseRobotAtLocation(l32) && currentDirection.equals(Direction.CENTER))) {
                    p32 = rc.senseMapInfo(l32).getCooldownMultiplier(team);
                    b32 = false;
                }
            }
            if (v32 > v42 + p32) {
                v32 = v42 + p32;
                d32 = d42;
            }
            if (v32 > v33 + p32) {
                v32 = v33 + p32;
                d32 = d33;
            }
            if (v32 > v24 + p32) {
                v32 = v24 + p32;
                d32 = d24;
            }
            
            r32 |= r42;
            r32 |= r33;
            r32 |= r24;
            r32 &= !b32;
            o42 |= b32;
            o33 |= b32;
            o24 |= b32;
        }
        else {
            o42 |= b32;
            o33 |= b32;
            o24 |= b32;
        }

        if (rc.onTheMap(l16) && rc.canSenseLocation(l16)) {
            if (rc.senseCloud(l16)) {
                p16 = 1.5;
                b16 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l16).getCurrentDirection();
                if (targetLocation.equals(l16) || (rc.sensePassability(l16) && !rc.canSenseRobotAtLocation(l16) && currentDirection.equals(Direction.CENTER))) {
                    p16 = rc.senseMapInfo(l16).getCooldownMultiplier(team);
                    b16 = false;
                }
            }
            if (v16 > v25 + p16) {
                v16 = v25 + p16;
                d16 = d25;
            }
            if (v16 > v24 + p16) {
                v16 = v24 + p16;
                d16 = d24;
            }
            
            r16 |= r25;
            r16 |= r24;
            r16 &= !b16;
            o25 |= b16;
            o24 |= b16;
        }
        else {
            o25 |= b16;
            o24 |= b16;
        }

        if (rc.onTheMap(l51) && rc.canSenseLocation(l51)) {
            if (rc.senseCloud(l51)) {
                p51 = 1.5;
                b51 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l51).getCurrentDirection();
                if (targetLocation.equals(l51) || (rc.sensePassability(l51) && !rc.canSenseRobotAtLocation(l51) && currentDirection.equals(Direction.CENTER))) {
                    p51 = rc.senseMapInfo(l51).getCooldownMultiplier(team);
                    b51 = false;
                }
            }
            if (v51 > v52 + p51) {
                v51 = v52 + p51;
                d51 = d52;
            }
            if (v51 > v43 + p51) {
                v51 = v43 + p51;
                d51 = d43;
            }
            if (v51 > v42 + p51) {
                v51 = v42 + p51;
                d51 = d42;
            }
            if (v51 > v41 + p51) {
                v51 = v41 + p51;
                d51 = d41;
            }
            
            r51 |= r52;
            r51 |= r43;
            r51 |= r42;
            r51 |= r41;
            r51 &= !b51;
            o52 |= b51;
            o43 |= b51;
            o42 |= b51;
            o41 |= b51;
        }
        else {
            o52 |= b51;
            o43 |= b51;
            o42 |= b51;
            o41 |= b51;
        }

        if (rc.onTheMap(l15) && rc.canSenseLocation(l15)) {
            if (rc.senseCloud(l15)) {
                p15 = 1.5;
                b15 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l15).getCurrentDirection();
                if (targetLocation.equals(l15) || (rc.sensePassability(l15) && !rc.canSenseRobotAtLocation(l15) && currentDirection.equals(Direction.CENTER))) {
                    p15 = rc.senseMapInfo(l15).getCooldownMultiplier(team);
                    b15 = false;
                }
            }
            if (v15 > v24 + p15) {
                v15 = v24 + p15;
                d15 = d24;
            }
            if (v15 > v25 + p15) {
                v15 = v25 + p15;
                d15 = d25;
            }
            if (v15 > v16 + p15) {
                v15 = v16 + p15;
                d15 = d16;
            }
            if (v15 > v23 + p15) {
                v15 = v23 + p15;
                d15 = d23;
            }
            
            r15 |= r24;
            r15 |= r25;
            r15 |= r16;
            r15 |= r23;
            r15 &= !b15;
            o24 |= b15;
            o25 |= b15;
            o16 |= b15;
            o23 |= b15;
        }
        else {
            o24 |= b15;
            o25 |= b15;
            o16 |= b15;
            o23 |= b15;
        }

        if (rc.onTheMap(l23) && rc.canSenseLocation(l23)) {
            if (rc.senseCloud(l23)) {
                p23 = 1.5;
                b23 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l23).getCurrentDirection();
                if (targetLocation.equals(l23) || (rc.sensePassability(l23) && !rc.canSenseRobotAtLocation(l23) && currentDirection.equals(Direction.CENTER))) {
                    p23 = rc.senseMapInfo(l23).getCooldownMultiplier(team);
                    b23 = false;
                }
            }
            if (v23 > v32 + p23) {
                v23 = v32 + p23;
                d23 = d32;
            }
            if (v23 > v33 + p23) {
                v23 = v33 + p23;
                d23 = d33;
            }
            if (v23 > v24 + p23) {
                v23 = v24 + p23;
                d23 = d24;
            }
            if (v23 > v15 + p23) {
                v23 = v15 + p23;
                d23 = d15;
            }
            
            r23 |= r32;
            r23 |= r33;
            r23 |= r24;
            r23 |= r15;
            r23 &= !b23;
            o32 |= b23;
            o33 |= b23;
            o24 |= b23;
            o15 |= b23;
        }
        else {
            o32 |= b23;
            o33 |= b23;
            o24 |= b23;
            o15 |= b23;
        }

        if (rc.onTheMap(l41) && rc.canSenseLocation(l41)) {
            if (rc.senseCloud(l41)) {
                p41 = 1.5;
                b41 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l41).getCurrentDirection();
                if (targetLocation.equals(l41) || (rc.sensePassability(l41) && !rc.canSenseRobotAtLocation(l41) && currentDirection.equals(Direction.CENTER))) {
                    p41 = rc.senseMapInfo(l41).getCooldownMultiplier(team);
                    b41 = false;
                }
            }
            if (v41 > v51 + p41) {
                v41 = v51 + p41;
                d41 = d51;
            }
            if (v41 > v42 + p41) {
                v41 = v42 + p41;
                d41 = d42;
            }
            if (v41 > v33 + p41) {
                v41 = v33 + p41;
                d41 = d33;
            }
            if (v41 > v32 + p41) {
                v41 = v32 + p41;
                d41 = d32;
            }
            
            r41 |= r51;
            r41 |= r42;
            r41 |= r33;
            r41 |= r32;
            r41 &= !b41;
            o51 |= b41;
            o42 |= b41;
            o33 |= b41;
            o32 |= b41;
        }
        else {
            o51 |= b41;
            o42 |= b41;
            o33 |= b41;
            o32 |= b41;
        }

        if (rc.onTheMap(l50) && rc.canSenseLocation(l50)) {
            if (rc.senseCloud(l50)) {
                p50 = 1.5;
                b50 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l50).getCurrentDirection();
                if (targetLocation.equals(l50) || (rc.sensePassability(l50) && !rc.canSenseRobotAtLocation(l50) && currentDirection.equals(Direction.CENTER))) {
                    p50 = rc.senseMapInfo(l50).getCooldownMultiplier(team);
                    b50 = false;
                }
            }
            if (v50 > v51 + p50) {
                v50 = v51 + p50;
                d50 = d51;
            }
            if (v50 > v42 + p50) {
                v50 = v42 + p50;
                d50 = d42;
            }
            if (v50 > v41 + p50) {
                v50 = v41 + p50;
                d50 = d41;
            }
            
            r50 |= r51;
            r50 |= r42;
            r50 |= r41;
            r50 &= !b50;
            o51 |= b50;
            o42 |= b50;
            o41 |= b50;
        }
        else {
            o51 |= b50;
            o42 |= b50;
            o41 |= b50;
        }

        if (rc.onTheMap(l14) && rc.canSenseLocation(l14)) {
            if (rc.senseCloud(l14)) {
                p14 = 1.5;
                b14 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l14).getCurrentDirection();
                if (targetLocation.equals(l14) || (rc.sensePassability(l14) && !rc.canSenseRobotAtLocation(l14) && currentDirection.equals(Direction.CENTER))) {
                    p14 = rc.senseMapInfo(l14).getCooldownMultiplier(team);
                    b14 = false;
                }
            }
            if (v14 > v23 + p14) {
                v14 = v23 + p14;
                d14 = d23;
            }
            if (v14 > v24 + p14) {
                v14 = v24 + p14;
                d14 = d24;
            }
            if (v14 > v15 + p14) {
                v14 = v15 + p14;
                d14 = d15;
            }
            
            r14 |= r23;
            r14 |= r24;
            r14 |= r15;
            r14 &= !b14;
            o23 |= b14;
            o24 |= b14;
            o15 |= b14;
        }
        else {
            o23 |= b14;
            o24 |= b14;
            o15 |= b14;
        }

        if (rc.onTheMap(l60) && rc.canSenseLocation(l60)) {
            if (rc.senseCloud(l60)) {
                p60 = 1.5;
                b60 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l60).getCurrentDirection();
                if (targetLocation.equals(l60) || (rc.sensePassability(l60) && !rc.canSenseRobotAtLocation(l60) && currentDirection.equals(Direction.CENTER))) {
                    p60 = rc.senseMapInfo(l60).getCooldownMultiplier(team);
                    b60 = false;
                }
            }
            if (v60 > v52 + p60) {
                v60 = v52 + p60;
                d60 = d52;
            }
            if (v60 > v51 + p60) {
                v60 = v51 + p60;
                d60 = d51;
            }
            
            r60 |= r52;
            r60 |= r51;
            r60 &= !b60;
            o52 |= b60;
            o51 |= b60;
        }
        else {
            o52 |= b60;
            o51 |= b60;
        }

        if (rc.onTheMap(l31) && rc.canSenseLocation(l31)) {
            if (rc.senseCloud(l31)) {
                p31 = 1.5;
                b31 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l31).getCurrentDirection();
                if (targetLocation.equals(l31) || (rc.sensePassability(l31) && !rc.canSenseRobotAtLocation(l31) && currentDirection.equals(Direction.CENTER))) {
                    p31 = rc.senseMapInfo(l31).getCooldownMultiplier(team);
                    b31 = false;
                }
            }
            if (v31 > v41 + p31) {
                v31 = v41 + p31;
                d31 = d41;
            }
            if (v31 > v32 + p31) {
                v31 = v32 + p31;
                d31 = d32;
            }
            if (v31 > v23 + p31) {
                v31 = v23 + p31;
                d31 = d23;
            }
            
            r31 |= r41;
            r31 |= r32;
            r31 |= r23;
            r31 &= !b31;
            o41 |= b31;
            o32 |= b31;
            o23 |= b31;
        }
        else {
            o41 |= b31;
            o32 |= b31;
            o23 |= b31;
        }

        if (rc.onTheMap(l8) && rc.canSenseLocation(l8)) {
            if (rc.senseCloud(l8)) {
                p8 = 1.5;
                b8 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l8).getCurrentDirection();
                if (targetLocation.equals(l8) || (rc.sensePassability(l8) && !rc.canSenseRobotAtLocation(l8) && currentDirection.equals(Direction.CENTER))) {
                    p8 = rc.senseMapInfo(l8).getCooldownMultiplier(team);
                    b8 = false;
                }
            }
            if (v8 > v16 + p8) {
                v8 = v16 + p8;
                d8 = d16;
            }
            if (v8 > v15 + p8) {
                v8 = v15 + p8;
                d8 = d15;
            }
            
            r8 |= r16;
            r8 |= r15;
            r8 &= !b8;
            o16 |= b8;
            o15 |= b8;
        }
        else {
            o16 |= b8;
            o15 |= b8;
        }

        if (rc.onTheMap(l59) && rc.canSenseLocation(l59)) {
            if (rc.senseCloud(l59)) {
                p59 = 1.5;
                b59 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l59).getCurrentDirection();
                if (targetLocation.equals(l59) || (rc.sensePassability(l59) && !rc.canSenseRobotAtLocation(l59) && currentDirection.equals(Direction.CENTER))) {
                    p59 = rc.senseMapInfo(l59).getCooldownMultiplier(team);
                    b59 = false;
                }
            }
            if (v59 > v60 + p59) {
                v59 = v60 + p59;
                d59 = d60;
            }
            if (v59 > v52 + p59) {
                v59 = v52 + p59;
                d59 = d52;
            }
            if (v59 > v51 + p59) {
                v59 = v51 + p59;
                d59 = d51;
            }
            if (v59 > v50 + p59) {
                v59 = v50 + p59;
                d59 = d50;
            }
            
            r59 |= r60;
            r59 |= r52;
            r59 |= r51;
            r59 |= r50;
            r59 &= !b59;
            o60 |= b59;
            o52 |= b59;
            o51 |= b59;
            o50 |= b59;
        }
        else {
            o60 |= b59;
            o52 |= b59;
            o51 |= b59;
            o50 |= b59;
        }

        if (rc.onTheMap(l22) && rc.canSenseLocation(l22)) {
            if (rc.senseCloud(l22)) {
                p22 = 1.5;
                b22 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l22).getCurrentDirection();
                if (targetLocation.equals(l22) || (rc.sensePassability(l22) && !rc.canSenseRobotAtLocation(l22) && currentDirection.equals(Direction.CENTER))) {
                    p22 = rc.senseMapInfo(l22).getCooldownMultiplier(team);
                    b22 = false;
                }
            }
            if (v22 > v31 + p22) {
                v22 = v31 + p22;
                d22 = d31;
            }
            if (v22 > v32 + p22) {
                v22 = v32 + p22;
                d22 = d32;
            }
            if (v22 > v23 + p22) {
                v22 = v23 + p22;
                d22 = d23;
            }
            if (v22 > v14 + p22) {
                v22 = v14 + p22;
                d22 = d14;
            }
            
            r22 |= r31;
            r22 |= r32;
            r22 |= r23;
            r22 |= r14;
            r22 &= !b22;
            o31 |= b22;
            o32 |= b22;
            o23 |= b22;
            o14 |= b22;
        }
        else {
            o31 |= b22;
            o32 |= b22;
            o23 |= b22;
            o14 |= b22;
        }

        if (rc.onTheMap(l7) && rc.canSenseLocation(l7)) {
            if (rc.senseCloud(l7)) {
                p7 = 1.5;
                b7 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l7).getCurrentDirection();
                if (targetLocation.equals(l7) || (rc.sensePassability(l7) && !rc.canSenseRobotAtLocation(l7) && currentDirection.equals(Direction.CENTER))) {
                    p7 = rc.senseMapInfo(l7).getCooldownMultiplier(team);
                    b7 = false;
                }
            }
            if (v7 > v15 + p7) {
                v7 = v15 + p7;
                d7 = d15;
            }
            if (v7 > v16 + p7) {
                v7 = v16 + p7;
                d7 = d16;
            }
            if (v7 > v8 + p7) {
                v7 = v8 + p7;
                d7 = d8;
            }
            if (v7 > v14 + p7) {
                v7 = v14 + p7;
                d7 = d14;
            }
            
            r7 |= r15;
            r7 |= r16;
            r7 |= r8;
            r7 |= r14;
            r7 &= !b7;
            o15 |= b7;
            o16 |= b7;
            o8 |= b7;
            o14 |= b7;
        }
        else {
            o15 |= b7;
            o16 |= b7;
            o8 |= b7;
            o14 |= b7;
        }

        if (rc.onTheMap(l40) && rc.canSenseLocation(l40)) {
            if (rc.senseCloud(l40)) {
                p40 = 1.5;
                b40 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l40).getCurrentDirection();
                if (targetLocation.equals(l40) || (rc.sensePassability(l40) && !rc.canSenseRobotAtLocation(l40) && currentDirection.equals(Direction.CENTER))) {
                    p40 = rc.senseMapInfo(l40).getCooldownMultiplier(team);
                    b40 = false;
                }
            }
            if (v40 > v50 + p40) {
                v40 = v50 + p40;
                d40 = d50;
            }
            if (v40 > v41 + p40) {
                v40 = v41 + p40;
                d40 = d41;
            }
            if (v40 > v32 + p40) {
                v40 = v32 + p40;
                d40 = d32;
            }
            if (v40 > v31 + p40) {
                v40 = v31 + p40;
                d40 = d31;
            }
            
            r40 |= r50;
            r40 |= r41;
            r40 |= r32;
            r40 |= r31;
            r40 &= !b40;
            o50 |= b40;
            o41 |= b40;
            o32 |= b40;
            o31 |= b40;
        }
        else {
            o50 |= b40;
            o41 |= b40;
            o32 |= b40;
            o31 |= b40;
        }

        if (rc.onTheMap(l13) && rc.canSenseLocation(l13)) {
            if (rc.senseCloud(l13)) {
                p13 = 1.5;
                b13 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l13).getCurrentDirection();
                if (targetLocation.equals(l13) || (rc.sensePassability(l13) && !rc.canSenseRobotAtLocation(l13) && currentDirection.equals(Direction.CENTER))) {
                    p13 = rc.senseMapInfo(l13).getCooldownMultiplier(team);
                    b13 = false;
                }
            }
            if (v13 > v22 + p13) {
                v13 = v22 + p13;
                d13 = d22;
            }
            if (v13 > v23 + p13) {
                v13 = v23 + p13;
                d13 = d23;
            }
            if (v13 > v14 + p13) {
                v13 = v14 + p13;
                d13 = d14;
            }
            if (v13 > v6 + p13) {
                v13 = v6 + p13;
                d13 = d6;
            }
            
            r13 |= r22;
            r13 |= r23;
            r13 |= r14;
            r13 |= r6;
            r13 &= !b13;
            o22 |= b13;
            o23 |= b13;
            o14 |= b13;
            o6 |= b13;
        }
        else {
            o22 |= b13;
            o23 |= b13;
            o14 |= b13;
            o6 |= b13;
        }

        if (rc.onTheMap(l58) && rc.canSenseLocation(l58)) {
            if (rc.senseCloud(l58)) {
                p58 = 1.5;
                b58 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l58).getCurrentDirection();
                if (targetLocation.equals(l58) || (rc.sensePassability(l58) && !rc.canSenseRobotAtLocation(l58) && currentDirection.equals(Direction.CENTER))) {
                    p58 = rc.senseMapInfo(l58).getCooldownMultiplier(team);
                    b58 = false;
                }
            }
            if (v58 > v59 + p58) {
                v58 = v59 + p58;
                d58 = d59;
            }
            if (v58 > v51 + p58) {
                v58 = v51 + p58;
                d58 = d51;
            }
            if (v58 > v50 + p58) {
                v58 = v50 + p58;
                d58 = d50;
            }
            if (v58 > v49 + p58) {
                v58 = v49 + p58;
                d58 = d49;
            }
            
            r58 |= r59;
            r58 |= r51;
            r58 |= r50;
            r58 |= r49;
            r58 &= !b58;
            o59 |= b58;
            o51 |= b58;
            o50 |= b58;
            o49 |= b58;
        }
        else {
            o59 |= b58;
            o51 |= b58;
            o50 |= b58;
            o49 |= b58;
        }

        if (rc.onTheMap(l49) && rc.canSenseLocation(l49)) {
            if (rc.senseCloud(l49)) {
                p49 = 1.5;
                b49 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l49).getCurrentDirection();
                if (targetLocation.equals(l49) || (rc.sensePassability(l49) && !rc.canSenseRobotAtLocation(l49) && currentDirection.equals(Direction.CENTER))) {
                    p49 = rc.senseMapInfo(l49).getCooldownMultiplier(team);
                    b49 = false;
                }
            }
            if (v49 > v58 + p49) {
                v49 = v58 + p49;
                d49 = d58;
            }
            if (v49 > v50 + p49) {
                v49 = v50 + p49;
                d49 = d50;
            }
            if (v49 > v41 + p49) {
                v49 = v41 + p49;
                d49 = d41;
            }
            if (v49 > v40 + p49) {
                v49 = v40 + p49;
                d49 = d40;
            }
            
            r49 |= r58;
            r49 |= r50;
            r49 |= r41;
            r49 |= r40;
            r49 &= !b49;
            o58 |= b49;
            o50 |= b49;
            o41 |= b49;
            o40 |= b49;
        }
        else {
            o58 |= b49;
            o50 |= b49;
            o41 |= b49;
            o40 |= b49;
        }

        if (rc.onTheMap(l6) && rc.canSenseLocation(l6)) {
            if (rc.senseCloud(l6)) {
                p6 = 1.5;
                b6 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l6).getCurrentDirection();
                if (targetLocation.equals(l6) || (rc.sensePassability(l6) && !rc.canSenseRobotAtLocation(l6) && currentDirection.equals(Direction.CENTER))) {
                    p6 = rc.senseMapInfo(l6).getCooldownMultiplier(team);
                    b6 = false;
                }
            }
            if (v6 > v14 + p6) {
                v6 = v14 + p6;
                d6 = d14;
            }
            if (v6 > v15 + p6) {
                v6 = v15 + p6;
                d6 = d15;
            }
            if (v6 > v7 + p6) {
                v6 = v7 + p6;
                d6 = d7;
            }
            if (v6 > v13 + p6) {
                v6 = v13 + p6;
                d6 = d13;
            }
            
            r6 |= r14;
            r6 |= r15;
            r6 |= r7;
            r6 |= r13;
            r6 &= !b6;
            o14 |= b6;
            o15 |= b6;
            o7 |= b6;
            o13 |= b6;
        }
        else {
            o14 |= b6;
            o15 |= b6;
            o7 |= b6;
            o13 |= b6;
        }

        if (rc.onTheMap(l5) && rc.canSenseLocation(l5)) {
            if (rc.senseCloud(l5)) {
                p5 = 1.5;
                b5 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l5).getCurrentDirection();
                if (targetLocation.equals(l5) || (rc.sensePassability(l5) && !rc.canSenseRobotAtLocation(l5) && currentDirection.equals(Direction.CENTER))) {
                    p5 = rc.senseMapInfo(l5).getCooldownMultiplier(team);
                    b5 = false;
                }
            }
            if (v5 > v13 + p5) {
                v5 = v13 + p5;
                d5 = d13;
            }
            if (v5 > v14 + p5) {
                v5 = v14 + p5;
                d5 = d14;
            }
            if (v5 > v6 + p5) {
                v5 = v6 + p5;
                d5 = d6;
            }
            
            r5 |= r13;
            r5 |= r14;
            r5 |= r6;
            r5 &= !b5;
            o13 |= b5;
            o14 |= b5;
            o6 |= b5;
        }
        else {
            o13 |= b5;
            o14 |= b5;
            o6 |= b5;
        }

        if (rc.onTheMap(l57) && rc.canSenseLocation(l57)) {
            if (rc.senseCloud(l57)) {
                p57 = 1.5;
                b57 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l57).getCurrentDirection();
                if (targetLocation.equals(l57) || (rc.sensePassability(l57) && !rc.canSenseRobotAtLocation(l57) && currentDirection.equals(Direction.CENTER))) {
                    p57 = rc.senseMapInfo(l57).getCooldownMultiplier(team);
                    b57 = false;
                }
            }
            if (v57 > v58 + p57) {
                v57 = v58 + p57;
                d57 = d58;
            }
            if (v57 > v50 + p57) {
                v57 = v50 + p57;
                d57 = d50;
            }
            if (v57 > v49 + p57) {
                v57 = v49 + p57;
                d57 = d49;
            }
            
            r57 |= r58;
            r57 |= r50;
            r57 |= r49;
            r57 &= !b57;
            o58 |= b57;
            o50 |= b57;
            o49 |= b57;
        }
        else {
            o58 |= b57;
            o50 |= b57;
            o49 |= b57;
        }

        if (rc.onTheMap(l2) && rc.canSenseLocation(l2)) {
            if (rc.senseCloud(l2)) {
                p2 = 1.5;
                b2 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l2).getCurrentDirection();
                if (targetLocation.equals(l2) || (rc.sensePassability(l2) && !rc.canSenseRobotAtLocation(l2) && currentDirection.equals(Direction.CENTER))) {
                    p2 = rc.senseMapInfo(l2).getCooldownMultiplier(team);
                    b2 = false;
                }
            }
            if (v2 > v8 + p2) {
                v2 = v8 + p2;
                d2 = d8;
            }
            if (v2 > v7 + p2) {
                v2 = v7 + p2;
                d2 = d7;
            }
            
            r2 |= r8;
            r2 |= r7;
            r2 &= !b2;
            o8 |= b2;
            o7 |= b2;
        }
        else {
            o8 |= b2;
            o7 |= b2;
        }

        if (rc.onTheMap(l66) && rc.canSenseLocation(l66)) {
            if (rc.senseCloud(l66)) {
                p66 = 1.5;
                b66 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l66).getCurrentDirection();
                if (targetLocation.equals(l66) || (rc.sensePassability(l66) && !rc.canSenseRobotAtLocation(l66) && currentDirection.equals(Direction.CENTER))) {
                    p66 = rc.senseMapInfo(l66).getCooldownMultiplier(team);
                    b66 = false;
                }
            }
            if (v66 > v60 + p66) {
                v66 = v60 + p66;
                d66 = d60;
            }
            if (v66 > v59 + p66) {
                v66 = v59 + p66;
                d66 = d59;
            }
            
            r66 |= r60;
            r66 |= r59;
            r66 &= !b66;
            o60 |= b66;
            o59 |= b66;
        }
        else {
            o60 |= b66;
            o59 |= b66;
        }

        if (rc.onTheMap(l30) && rc.canSenseLocation(l30)) {
            if (rc.senseCloud(l30)) {
                p30 = 1.5;
                b30 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l30).getCurrentDirection();
                if (targetLocation.equals(l30) || (rc.sensePassability(l30) && !rc.canSenseRobotAtLocation(l30) && currentDirection.equals(Direction.CENTER))) {
                    p30 = rc.senseMapInfo(l30).getCooldownMultiplier(team);
                    b30 = false;
                }
            }
            if (v30 > v40 + p30) {
                v30 = v40 + p30;
                d30 = d40;
            }
            if (v30 > v31 + p30) {
                v30 = v31 + p30;
                d30 = d31;
            }
            if (v30 > v22 + p30) {
                v30 = v22 + p30;
                d30 = d22;
            }
            
            r30 |= r40;
            r30 |= r31;
            r30 |= r22;
            r30 &= !b30;
            o40 |= b30;
            o31 |= b30;
            o22 |= b30;
        }
        else {
            o40 |= b30;
            o31 |= b30;
            o22 |= b30;
        }

        if (rc.onTheMap(l21) && rc.canSenseLocation(l21)) {
            if (rc.senseCloud(l21)) {
                p21 = 1.5;
                b21 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l21).getCurrentDirection();
                if (targetLocation.equals(l21) || (rc.sensePassability(l21) && !rc.canSenseRobotAtLocation(l21) && currentDirection.equals(Direction.CENTER))) {
                    p21 = rc.senseMapInfo(l21).getCooldownMultiplier(team);
                    b21 = false;
                }
            }
            if (v21 > v30 + p21) {
                v21 = v30 + p21;
                d21 = d30;
            }
            if (v21 > v31 + p21) {
                v21 = v31 + p21;
                d21 = d31;
            }
            if (v21 > v22 + p21) {
                v21 = v22 + p21;
                d21 = d22;
            }
            if (v21 > v13 + p21) {
                v21 = v13 + p21;
                d21 = d13;
            }
            
            r21 |= r30;
            r21 |= r31;
            r21 |= r22;
            r21 |= r13;
            r21 &= !b21;
            o30 |= b21;
            o31 |= b21;
            o22 |= b21;
            o13 |= b21;
        }
        else {
            o30 |= b21;
            o31 |= b21;
            o22 |= b21;
            o13 |= b21;
        }

        if (rc.onTheMap(l1) && rc.canSenseLocation(l1)) {
            if (rc.senseCloud(l1)) {
                p1 = 1.5;
                b1 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l1).getCurrentDirection();
                if (targetLocation.equals(l1) || (rc.sensePassability(l1) && !rc.canSenseRobotAtLocation(l1) && currentDirection.equals(Direction.CENTER))) {
                    p1 = rc.senseMapInfo(l1).getCooldownMultiplier(team);
                    b1 = false;
                }
            }
            if (v1 > v7 + p1) {
                v1 = v7 + p1;
                d1 = d7;
            }
            if (v1 > v8 + p1) {
                v1 = v8 + p1;
                d1 = d8;
            }
            if (v1 > v2 + p1) {
                v1 = v2 + p1;
                d1 = d2;
            }
            if (v1 > v6 + p1) {
                v1 = v6 + p1;
                d1 = d6;
            }
            
            r1 |= r7;
            r1 |= r8;
            r1 |= r2;
            r1 |= r6;
            r1 &= !b1;
            o7 |= b1;
            o8 |= b1;
            o2 |= b1;
            o6 |= b1;
        }
        else {
            o7 |= b1;
            o8 |= b1;
            o2 |= b1;
            o6 |= b1;
        }

        if (rc.onTheMap(l39) && rc.canSenseLocation(l39)) {
            if (rc.senseCloud(l39)) {
                p39 = 1.5;
                b39 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l39).getCurrentDirection();
                if (targetLocation.equals(l39) || (rc.sensePassability(l39) && !rc.canSenseRobotAtLocation(l39) && currentDirection.equals(Direction.CENTER))) {
                    p39 = rc.senseMapInfo(l39).getCooldownMultiplier(team);
                    b39 = false;
                }
            }
            if (v39 > v49 + p39) {
                v39 = v49 + p39;
                d39 = d49;
            }
            if (v39 > v40 + p39) {
                v39 = v40 + p39;
                d39 = d40;
            }
            if (v39 > v31 + p39) {
                v39 = v31 + p39;
                d39 = d31;
            }
            if (v39 > v30 + p39) {
                v39 = v30 + p39;
                d39 = d30;
            }
            
            r39 |= r49;
            r39 |= r40;
            r39 |= r31;
            r39 |= r30;
            r39 &= !b39;
            o49 |= b39;
            o40 |= b39;
            o31 |= b39;
            o30 |= b39;
        }
        else {
            o49 |= b39;
            o40 |= b39;
            o31 |= b39;
            o30 |= b39;
        }

        if (rc.onTheMap(l65) && rc.canSenseLocation(l65)) {
            if (rc.senseCloud(l65)) {
                p65 = 1.5;
                b65 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l65).getCurrentDirection();
                if (targetLocation.equals(l65) || (rc.sensePassability(l65) && !rc.canSenseRobotAtLocation(l65) && currentDirection.equals(Direction.CENTER))) {
                    p65 = rc.senseMapInfo(l65).getCooldownMultiplier(team);
                    b65 = false;
                }
            }
            if (v65 > v66 + p65) {
                v65 = v66 + p65;
                d65 = d66;
            }
            if (v65 > v60 + p65) {
                v65 = v60 + p65;
                d65 = d60;
            }
            if (v65 > v59 + p65) {
                v65 = v59 + p65;
                d65 = d59;
            }
            if (v65 > v58 + p65) {
                v65 = v58 + p65;
                d65 = d58;
            }
            
            r65 |= r66;
            r65 |= r60;
            r65 |= r59;
            r65 |= r58;
            r65 &= !b65;
            o66 |= b65;
            o60 |= b65;
            o59 |= b65;
            o58 |= b65;
        }
        else {
            o66 |= b65;
            o60 |= b65;
            o59 |= b65;
            o58 |= b65;
        }

        if (rc.onTheMap(l64) && rc.canSenseLocation(l64)) {
            if (rc.senseCloud(l64)) {
                p64 = 1.5;
                b64 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l64).getCurrentDirection();
                if (targetLocation.equals(l64) || (rc.sensePassability(l64) && !rc.canSenseRobotAtLocation(l64) && currentDirection.equals(Direction.CENTER))) {
                    p64 = rc.senseMapInfo(l64).getCooldownMultiplier(team);
                    b64 = false;
                }
            }
            if (v64 > v65 + p64) {
                v64 = v65 + p64;
                d64 = d65;
            }
            if (v64 > v59 + p64) {
                v64 = v59 + p64;
                d64 = d59;
            }
            if (v64 > v58 + p64) {
                v64 = v58 + p64;
                d64 = d58;
            }
            if (v64 > v57 + p64) {
                v64 = v57 + p64;
                d64 = d57;
            }
            
            r64 |= r65;
            r64 |= r59;
            r64 |= r58;
            r64 |= r57;
            r64 &= !b64;
            o65 |= b64;
            o59 |= b64;
            o58 |= b64;
            o57 |= b64;
        }
        else {
            o65 |= b64;
            o59 |= b64;
            o58 |= b64;
            o57 |= b64;
        }

        if (rc.onTheMap(l12) && rc.canSenseLocation(l12)) {
            if (rc.senseCloud(l12)) {
                p12 = 1.5;
                b12 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l12).getCurrentDirection();
                if (targetLocation.equals(l12) || (rc.sensePassability(l12) && !rc.canSenseRobotAtLocation(l12) && currentDirection.equals(Direction.CENTER))) {
                    p12 = rc.senseMapInfo(l12).getCooldownMultiplier(team);
                    b12 = false;
                }
            }
            if (v12 > v21 + p12) {
                v12 = v21 + p12;
                d12 = d21;
            }
            if (v12 > v22 + p12) {
                v12 = v22 + p12;
                d12 = d22;
            }
            if (v12 > v13 + p12) {
                v12 = v13 + p12;
                d12 = d13;
            }
            if (v12 > v5 + p12) {
                v12 = v5 + p12;
                d12 = d5;
            }
            
            r12 |= r21;
            r12 |= r22;
            r12 |= r13;
            r12 |= r5;
            r12 &= !b12;
            o21 |= b12;
            o22 |= b12;
            o13 |= b12;
            o5 |= b12;
        }
        else {
            o21 |= b12;
            o22 |= b12;
            o13 |= b12;
            o5 |= b12;
        }

        if (rc.onTheMap(l0) && rc.canSenseLocation(l0)) {
            if (rc.senseCloud(l0)) {
                p0 = 1.5;
                b0 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l0).getCurrentDirection();
                if (targetLocation.equals(l0) || (rc.sensePassability(l0) && !rc.canSenseRobotAtLocation(l0) && currentDirection.equals(Direction.CENTER))) {
                    p0 = rc.senseMapInfo(l0).getCooldownMultiplier(team);
                    b0 = false;
                }
            }
            if (v0 > v6 + p0) {
                v0 = v6 + p0;
                d0 = d6;
            }
            if (v0 > v7 + p0) {
                v0 = v7 + p0;
                d0 = d7;
            }
            if (v0 > v1 + p0) {
                v0 = v1 + p0;
                d0 = d1;
            }
            if (v0 > v5 + p0) {
                v0 = v5 + p0;
                d0 = d5;
            }
            
            r0 |= r6;
            r0 |= r7;
            r0 |= r1;
            r0 |= r5;
            r0 &= !b0;
            o6 |= b0;
            o7 |= b0;
            o1 |= b0;
            o5 |= b0;
        }
        else {
            o6 |= b0;
            o7 |= b0;
            o1 |= b0;
            o5 |= b0;
        }

        if (rc.onTheMap(l48) && rc.canSenseLocation(l48)) {
            if (rc.senseCloud(l48)) {
                p48 = 1.5;
                b48 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l48).getCurrentDirection();
                if (targetLocation.equals(l48) || (rc.sensePassability(l48) && !rc.canSenseRobotAtLocation(l48) && currentDirection.equals(Direction.CENTER))) {
                    p48 = rc.senseMapInfo(l48).getCooldownMultiplier(team);
                    b48 = false;
                }
            }
            if (v48 > v57 + p48) {
                v48 = v57 + p48;
                d48 = d57;
            }
            if (v48 > v49 + p48) {
                v48 = v49 + p48;
                d48 = d49;
            }
            if (v48 > v40 + p48) {
                v48 = v40 + p48;
                d48 = d40;
            }
            if (v48 > v39 + p48) {
                v48 = v39 + p48;
                d48 = d39;
            }
            
            r48 |= r57;
            r48 |= r49;
            r48 |= r40;
            r48 |= r39;
            r48 &= !b48;
            o57 |= b48;
            o49 |= b48;
            o40 |= b48;
            o39 |= b48;
        }
        else {
            o57 |= b48;
            o49 |= b48;
            o40 |= b48;
            o39 |= b48;
        }

        int dx = targetLocation.x - l34.x;
        int dy = targetLocation.y - l34.y;

        switch(dx) {
            case -4:
                switch(dy) {
                    case -2:
                        if (v0 < 10000) {
                            return d0;
                        }
                    case -1:
                        if (v1 < 10000) {
                            return d1;
                        }
                    case 0:
                        if (v2 < 10000) {
                            return d2;
                        }
                } break;

            case -3:
                switch(dy) {
                    case -3:
                        if (v5 < 10000) {
                            return d5;
                        }
                    case -2:
                        if (v6 < 10000) {
                            return d6;
                        }
                    case -1:
                        if (v7 < 10000) {
                            return d7;
                        }
                    case 0:
                        if (v8 < 10000) {
                            return d8;
                        }
                } break;

            case -2:
                switch(dy) {
                    case -4:
                        if (v12 < 10000) {
                            return d12;
                        }
                    case -3:
                        if (v13 < 10000) {
                            return d13;
                        }
                    case -2:
                        if (v14 < 10000) {
                            return d14;
                        }
                    case -1:
                        if (v15 < 10000) {
                            return d15;
                        }
                    case 0:
                        if (v16 < 10000) {
                            return d16;
                        }
                } break;

            case -1:
                switch(dy) {
                    case -4:
                        if (v21 < 10000) {
                            return d21;
                        }
                    case -3:
                        if (v22 < 10000) {
                            return d22;
                        }
                    case -2:
                        if (v23 < 10000) {
                            return d23;
                        }
                    case -1:
                        if (v24 < 10000) {
                            return d24;
                        }
                    case 0:
                        if (v25 < 10000) {
                            return d25;
                        }
                } break;

            case 0:
                switch(dy) {
                    case -4:
                        if (v30 < 10000) {
                            return d30;
                        }
                    case -3:
                        if (v31 < 10000) {
                            return d31;
                        }
                    case -2:
                        if (v32 < 10000) {
                            return d32;
                        }
                    case -1:
                        if (v33 < 10000) {
                            return d33;
                        }
                    case 0:
                        if (v34 < 10000) {
                            return d34;
                        }
                } break;

            case 1:
                switch(dy) {
                    case -4:
                        if (v39 < 10000) {
                            return d39;
                        }
                    case -3:
                        if (v40 < 10000) {
                            return d40;
                        }
                    case -2:
                        if (v41 < 10000) {
                            return d41;
                        }
                    case -1:
                        if (v42 < 10000) {
                            return d42;
                        }
                    case 0:
                        if (v43 < 10000) {
                            return d43;
                        }
                } break;

            case 2:
                switch(dy) {
                    case -4:
                        if (v48 < 10000) {
                            return d48;
                        }
                    case -3:
                        if (v49 < 10000) {
                            return d49;
                        }
                    case -2:
                        if (v50 < 10000) {
                            return d50;
                        }
                    case -1:
                        if (v51 < 10000) {
                            return d51;
                        }
                    case 0:
                        if (v52 < 10000) {
                            return d52;
                        }
                } break;

            case 3:
                switch(dy) {
                    case -3:
                        if (v57 < 10000) {
                            return d57;
                        }
                    case -2:
                        if (v58 < 10000) {
                            return d58;
                        }
                    case -1:
                        if (v59 < 10000) {
                            return d59;
                        }
                    case 0:
                        if (v60 < 10000) {
                            return d60;
                        }
                } break;

            case 4:
                switch(dy) {
                    case -2:
                        if (v64 < 10000) {
                            return d64;
                        }
                    case -1:
                        if (v65 < 10000) {
                            return d65;
                        }
                    case 0:
                        if (v66 < 10000) {
                            return d66;
                        }
                } break;

        }
    
        o0 = r0;
        o1 = r1;
        o2 = r2;
        o5 = r5;
        o12 = r12;
        o21 = r21;
        o30 = r30;
        o39 = r39;
        o48 = r48;
        o57 = r57;
        o64 = r64;
        o65 = r65;
        o66 = r66;
        Direction ans = Direction.CENTER;

        if (r0 && o0) {
            double dist0 = v0 + 1.5 * Math.sqrt(l0.distanceSquaredTo(targetLocation));
            if (dist0 < localBest) {
                localBest = dist0;
                ans = d0;
                best = l0;
            }
        }

        if (r1 && o1) {
            double dist1 = v1 + 1.5 * Math.sqrt(l1.distanceSquaredTo(targetLocation));
            if (dist1 < localBest) {
                localBest = dist1;
                ans = d1;
                best = l1;
            }
        }

        if (r2 && o2) {
            double dist2 = v2 + 1.5 * Math.sqrt(l2.distanceSquaredTo(targetLocation));
            if (dist2 < localBest) {
                localBest = dist2;
                ans = d2;
                best = l2;
            }
        }

        if (r5 && o5) {
            double dist5 = v5 + 1.5 * Math.sqrt(l5.distanceSquaredTo(targetLocation));
            if (dist5 < localBest) {
                localBest = dist5;
                ans = d5;
                best = l5;
            }
        }

        if (r12 && o12) {
            double dist12 = v12 + 1.5 * Math.sqrt(l12.distanceSquaredTo(targetLocation));
            if (dist12 < localBest) {
                localBest = dist12;
                ans = d12;
                best = l12;
            }
        }

        if (r21 && o21) {
            double dist21 = v21 + 1.5 * Math.sqrt(l21.distanceSquaredTo(targetLocation));
            if (dist21 < localBest) {
                localBest = dist21;
                ans = d21;
                best = l21;
            }
        }

        if (r30 && o30) {
            double dist30 = v30 + 1.5 * Math.sqrt(l30.distanceSquaredTo(targetLocation));
            if (dist30 < localBest) {
                localBest = dist30;
                ans = d30;
                best = l30;
            }
        }

        if (r39 && o39) {
            double dist39 = v39 + 1.5 * Math.sqrt(l39.distanceSquaredTo(targetLocation));
            if (dist39 < localBest) {
                localBest = dist39;
                ans = d39;
                best = l39;
            }
        }

        if (r48 && o48) {
            double dist48 = v48 + 1.5 * Math.sqrt(l48.distanceSquaredTo(targetLocation));
            if (dist48 < localBest) {
                localBest = dist48;
                ans = d48;
                best = l48;
            }
        }

        if (r57 && o57) {
            double dist57 = v57 + 1.5 * Math.sqrt(l57.distanceSquaredTo(targetLocation));
            if (dist57 < localBest) {
                localBest = dist57;
                ans = d57;
                best = l57;
            }
        }

        if (r64 && o64) {
            double dist64 = v64 + 1.5 * Math.sqrt(l64.distanceSquaredTo(targetLocation));
            if (dist64 < localBest) {
                localBest = dist64;
                ans = d64;
                best = l64;
            }
        }

        if (r65 && o65) {
            double dist65 = v65 + 1.5 * Math.sqrt(l65.distanceSquaredTo(targetLocation));
            if (dist65 < localBest) {
                localBest = dist65;
                ans = d65;
                best = l65;
            }
        }

        if (r66 && o66) {
            double dist66 = v66 + 1.5 * Math.sqrt(l66.distanceSquaredTo(targetLocation));
            if (dist66 < localBest) {
                localBest = dist66;
                ans = d66;
                best = l66;
            }
        }

        draws4();
        rc.setIndicatorDot(best, 0, 0, 255);
        if (localBest < globalBest) {
            globalBest = localBest;
            return ans;
        }
        return getBestDirectionWallFollow4(ans);
    }

    private Direction getBestDirectionWallFollow4(Direction prev) throws GameActionException {
        Direction ans = Direction.CENTER;
        int minDistance = closestWallLocations.isEmpty() ? 1000000 : currentLocation.distanceSquaredTo(closestWallLocations.get(0));
    
        if (b0) {
            int distance = currentLocation.distanceSquaredTo(l0);
            if (distance == minDistance) {
                closestWallLocations.add(l0);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l0);
                minDistance = distance;
            }
        }

        if (b1) {
            int distance = currentLocation.distanceSquaredTo(l1);
            if (distance == minDistance) {
                closestWallLocations.add(l1);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l1);
                minDistance = distance;
            }
        }

        if (b2) {
            int distance = currentLocation.distanceSquaredTo(l2);
            if (distance == minDistance) {
                closestWallLocations.add(l2);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l2);
                minDistance = distance;
            }
        }

        if (b5) {
            int distance = currentLocation.distanceSquaredTo(l5);
            if (distance == minDistance) {
                closestWallLocations.add(l5);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l5);
                minDistance = distance;
            }
        }

        if (b6) {
            int distance = currentLocation.distanceSquaredTo(l6);
            if (distance == minDistance) {
                closestWallLocations.add(l6);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l6);
                minDistance = distance;
            }
        }

        if (b7) {
            int distance = currentLocation.distanceSquaredTo(l7);
            if (distance == minDistance) {
                closestWallLocations.add(l7);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l7);
                minDistance = distance;
            }
        }

        if (b8) {
            int distance = currentLocation.distanceSquaredTo(l8);
            if (distance == minDistance) {
                closestWallLocations.add(l8);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l8);
                minDistance = distance;
            }
        }

        if (b12) {
            int distance = currentLocation.distanceSquaredTo(l12);
            if (distance == minDistance) {
                closestWallLocations.add(l12);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l12);
                minDistance = distance;
            }
        }

        if (b13) {
            int distance = currentLocation.distanceSquaredTo(l13);
            if (distance == minDistance) {
                closestWallLocations.add(l13);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l13);
                minDistance = distance;
            }
        }

        if (b14) {
            int distance = currentLocation.distanceSquaredTo(l14);
            if (distance == minDistance) {
                closestWallLocations.add(l14);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l14);
                minDistance = distance;
            }
        }

        if (b15) {
            int distance = currentLocation.distanceSquaredTo(l15);
            if (distance == minDistance) {
                closestWallLocations.add(l15);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l15);
                minDistance = distance;
            }
        }

        if (b16) {
            int distance = currentLocation.distanceSquaredTo(l16);
            if (distance == minDistance) {
                closestWallLocations.add(l16);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l16);
                minDistance = distance;
            }
        }

        if (b21) {
            int distance = currentLocation.distanceSquaredTo(l21);
            if (distance == minDistance) {
                closestWallLocations.add(l21);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l21);
                minDistance = distance;
            }
        }

        if (b22) {
            int distance = currentLocation.distanceSquaredTo(l22);
            if (distance == minDistance) {
                closestWallLocations.add(l22);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l22);
                minDistance = distance;
            }
        }

        if (b23) {
            int distance = currentLocation.distanceSquaredTo(l23);
            if (distance == minDistance) {
                closestWallLocations.add(l23);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l23);
                minDistance = distance;
            }
        }

        if (b24) {
            int distance = currentLocation.distanceSquaredTo(l24);
            if (distance == minDistance) {
                closestWallLocations.add(l24);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l24);
                minDistance = distance;
            }
        }

        if (b25) {
            int distance = currentLocation.distanceSquaredTo(l25);
            if (distance == minDistance) {
                closestWallLocations.add(l25);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l25);
                minDistance = distance;
            }
        }

        if (b30) {
            int distance = currentLocation.distanceSquaredTo(l30);
            if (distance == minDistance) {
                closestWallLocations.add(l30);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l30);
                minDistance = distance;
            }
        }

        if (b31) {
            int distance = currentLocation.distanceSquaredTo(l31);
            if (distance == minDistance) {
                closestWallLocations.add(l31);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l31);
                minDistance = distance;
            }
        }

        if (b32) {
            int distance = currentLocation.distanceSquaredTo(l32);
            if (distance == minDistance) {
                closestWallLocations.add(l32);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l32);
                minDistance = distance;
            }
        }

        if (b33) {
            int distance = currentLocation.distanceSquaredTo(l33);
            if (distance == minDistance) {
                closestWallLocations.add(l33);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l33);
                minDistance = distance;
            }
        }

        if (b39) {
            int distance = currentLocation.distanceSquaredTo(l39);
            if (distance == minDistance) {
                closestWallLocations.add(l39);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l39);
                minDistance = distance;
            }
        }

        if (b40) {
            int distance = currentLocation.distanceSquaredTo(l40);
            if (distance == minDistance) {
                closestWallLocations.add(l40);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l40);
                minDistance = distance;
            }
        }

        if (b41) {
            int distance = currentLocation.distanceSquaredTo(l41);
            if (distance == minDistance) {
                closestWallLocations.add(l41);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l41);
                minDistance = distance;
            }
        }

        if (b42) {
            int distance = currentLocation.distanceSquaredTo(l42);
            if (distance == minDistance) {
                closestWallLocations.add(l42);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l42);
                minDistance = distance;
            }
        }

        if (b43) {
            int distance = currentLocation.distanceSquaredTo(l43);
            if (distance == minDistance) {
                closestWallLocations.add(l43);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l43);
                minDistance = distance;
            }
        }

        if (b48) {
            int distance = currentLocation.distanceSquaredTo(l48);
            if (distance == minDistance) {
                closestWallLocations.add(l48);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l48);
                minDistance = distance;
            }
        }

        if (b49) {
            int distance = currentLocation.distanceSquaredTo(l49);
            if (distance == minDistance) {
                closestWallLocations.add(l49);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l49);
                minDistance = distance;
            }
        }

        if (b50) {
            int distance = currentLocation.distanceSquaredTo(l50);
            if (distance == minDistance) {
                closestWallLocations.add(l50);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l50);
                minDistance = distance;
            }
        }

        if (b51) {
            int distance = currentLocation.distanceSquaredTo(l51);
            if (distance == minDistance) {
                closestWallLocations.add(l51);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l51);
                minDistance = distance;
            }
        }

        if (b52) {
            int distance = currentLocation.distanceSquaredTo(l52);
            if (distance == minDistance) {
                closestWallLocations.add(l52);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l52);
                minDistance = distance;
            }
        }

        if (b57) {
            int distance = currentLocation.distanceSquaredTo(l57);
            if (distance == minDistance) {
                closestWallLocations.add(l57);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l57);
                minDistance = distance;
            }
        }

        if (b58) {
            int distance = currentLocation.distanceSquaredTo(l58);
            if (distance == minDistance) {
                closestWallLocations.add(l58);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l58);
                minDistance = distance;
            }
        }

        if (b59) {
            int distance = currentLocation.distanceSquaredTo(l59);
            if (distance == minDistance) {
                closestWallLocations.add(l59);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l59);
                minDistance = distance;
            }
        }

        if (b60) {
            int distance = currentLocation.distanceSquaredTo(l60);
            if (distance == minDistance) {
                closestWallLocations.add(l60);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l60);
                minDistance = distance;
            }
        }

        if (b64) {
            int distance = currentLocation.distanceSquaredTo(l64);
            if (distance == minDistance) {
                closestWallLocations.add(l64);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l64);
                minDistance = distance;
            }
        }

        if (b65) {
            int distance = currentLocation.distanceSquaredTo(l65);
            if (distance == minDistance) {
                closestWallLocations.add(l65);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l65);
                minDistance = distance;
            }
        }

        if (b66) {
            int distance = currentLocation.distanceSquaredTo(l66);
            if (distance == minDistance) {
                closestWallLocations.add(l66);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l66);
                minDistance = distance;
            }
        }

        if (minDistance > 2) { return prev; }
        int maxDot = -999999;
        minDistance = 1000000;
        for (MapLocation closestWallLocation : closestWallLocations) {
            Direction vertical = currentLocation.directionTo(closestWallLocation);

            Direction tangent1 = vertical.rotateLeft().rotateLeft();
            Direction tangent2 = vertical.rotateRight().rotateRight();

            int dx = lastDirection.getDeltaX();
            int dy = lastDirection.getDeltaY();

            int dot1 = tangent1.getDeltaX() * dx + tangent1.getDeltaY() * dy;
            int dot2 = tangent2.getDeltaX() * dx + tangent2.getDeltaY() * dy;

            int distance1 = currentLocation.add(tangent1).distanceSquaredTo(targetLocation);
            int distance2 = currentLocation.add(tangent2).distanceSquaredTo(targetLocation);

            if (!rc.canMove(tangent1)) {
                dot1 = -1000000;
            }

            if (!rc.canMove(tangent2)) {
                dot2 = -1000000;
            }

            if (dot1 > maxDot) {
                maxDot = dot1;
                minDistance = distance1;
                ans = tangent1;
            }

            if (dot2 > maxDot) {
                maxDot = dot2;
                minDistance = distance2;
                ans = tangent2;
            }

            if (dot1 == maxDot && distance1 < minDistance) {
                maxDot = dot1;
                minDistance = distance1;
                ans = tangent1;
            }

            if (dot2 == maxDot && distance2 < minDistance) {
                maxDot = dot2;
                minDistance = distance2;
                ans = tangent2;
            }
        }
        draws4();
        for (MapLocation closestWallLocation : closestWallLocations) {
            rc.setIndicatorDot(closestWallLocation, 255, 0, 0);
        }
        return ans;
    }

    private void draws4() throws GameActionException {
    
        rc.setIndicatorDot(l0, 255, 0, 255);
        if (b0) {
            rc.setIndicatorDot(l0, 255, 255, 255);
        }

        rc.setIndicatorDot(l1, 255, 0, 255);
        if (b1) {
            rc.setIndicatorDot(l1, 255, 255, 255);
        }

        rc.setIndicatorDot(l2, 255, 0, 255);
        if (b2) {
            rc.setIndicatorDot(l2, 255, 255, 255);
        }

        rc.setIndicatorDot(l5, 255, 0, 255);
        if (b5) {
            rc.setIndicatorDot(l5, 255, 255, 255);
        }

        rc.setIndicatorDot(l6, 255, 0, 255);
        if (b6) {
            rc.setIndicatorDot(l6, 255, 255, 255);
        }

        rc.setIndicatorDot(l7, 255, 0, 255);
        if (b7) {
            rc.setIndicatorDot(l7, 255, 255, 255);
        }

        rc.setIndicatorDot(l8, 255, 0, 255);
        if (b8) {
            rc.setIndicatorDot(l8, 255, 255, 255);
        }

        rc.setIndicatorDot(l12, 255, 0, 255);
        if (b12) {
            rc.setIndicatorDot(l12, 255, 255, 255);
        }

        rc.setIndicatorDot(l13, 255, 0, 255);
        if (b13) {
            rc.setIndicatorDot(l13, 255, 255, 255);
        }

        rc.setIndicatorDot(l14, 255, 0, 255);
        if (b14) {
            rc.setIndicatorDot(l14, 255, 255, 255);
        }

        rc.setIndicatorDot(l15, 255, 0, 255);
        if (b15) {
            rc.setIndicatorDot(l15, 255, 255, 255);
        }

        rc.setIndicatorDot(l16, 255, 0, 255);
        if (b16) {
            rc.setIndicatorDot(l16, 255, 255, 255);
        }

        rc.setIndicatorDot(l21, 255, 0, 255);
        if (b21) {
            rc.setIndicatorDot(l21, 255, 255, 255);
        }

        rc.setIndicatorDot(l22, 255, 0, 255);
        if (b22) {
            rc.setIndicatorDot(l22, 255, 255, 255);
        }

        rc.setIndicatorDot(l23, 255, 0, 255);
        if (b23) {
            rc.setIndicatorDot(l23, 255, 255, 255);
        }

        rc.setIndicatorDot(l24, 255, 0, 255);
        if (b24) {
            rc.setIndicatorDot(l24, 255, 255, 255);
        }

        rc.setIndicatorDot(l25, 255, 0, 255);
        if (b25) {
            rc.setIndicatorDot(l25, 255, 255, 255);
        }

        rc.setIndicatorDot(l30, 255, 0, 255);
        if (b30) {
            rc.setIndicatorDot(l30, 255, 255, 255);
        }

        rc.setIndicatorDot(l31, 255, 0, 255);
        if (b31) {
            rc.setIndicatorDot(l31, 255, 255, 255);
        }

        rc.setIndicatorDot(l32, 255, 0, 255);
        if (b32) {
            rc.setIndicatorDot(l32, 255, 255, 255);
        }

        rc.setIndicatorDot(l33, 255, 0, 255);
        if (b33) {
            rc.setIndicatorDot(l33, 255, 255, 255);
        }

        rc.setIndicatorDot(l39, 255, 0, 255);
        if (b39) {
            rc.setIndicatorDot(l39, 255, 255, 255);
        }

        rc.setIndicatorDot(l40, 255, 0, 255);
        if (b40) {
            rc.setIndicatorDot(l40, 255, 255, 255);
        }

        rc.setIndicatorDot(l41, 255, 0, 255);
        if (b41) {
            rc.setIndicatorDot(l41, 255, 255, 255);
        }

        rc.setIndicatorDot(l42, 255, 0, 255);
        if (b42) {
            rc.setIndicatorDot(l42, 255, 255, 255);
        }

        rc.setIndicatorDot(l43, 255, 0, 255);
        if (b43) {
            rc.setIndicatorDot(l43, 255, 255, 255);
        }

        rc.setIndicatorDot(l48, 255, 0, 255);
        if (b48) {
            rc.setIndicatorDot(l48, 255, 255, 255);
        }

        rc.setIndicatorDot(l49, 255, 0, 255);
        if (b49) {
            rc.setIndicatorDot(l49, 255, 255, 255);
        }

        rc.setIndicatorDot(l50, 255, 0, 255);
        if (b50) {
            rc.setIndicatorDot(l50, 255, 255, 255);
        }

        rc.setIndicatorDot(l51, 255, 0, 255);
        if (b51) {
            rc.setIndicatorDot(l51, 255, 255, 255);
        }

        rc.setIndicatorDot(l52, 255, 0, 255);
        if (b52) {
            rc.setIndicatorDot(l52, 255, 255, 255);
        }

        rc.setIndicatorDot(l57, 255, 0, 255);
        if (b57) {
            rc.setIndicatorDot(l57, 255, 255, 255);
        }

        rc.setIndicatorDot(l58, 255, 0, 255);
        if (b58) {
            rc.setIndicatorDot(l58, 255, 255, 255);
        }

        rc.setIndicatorDot(l59, 255, 0, 255);
        if (b59) {
            rc.setIndicatorDot(l59, 255, 255, 255);
        }

        rc.setIndicatorDot(l60, 255, 0, 255);
        if (b60) {
            rc.setIndicatorDot(l60, 255, 255, 255);
        }

        rc.setIndicatorDot(l64, 255, 0, 255);
        if (b64) {
            rc.setIndicatorDot(l64, 255, 255, 255);
        }

        rc.setIndicatorDot(l65, 255, 0, 255);
        if (b65) {
            rc.setIndicatorDot(l65, 255, 255, 255);
        }

        rc.setIndicatorDot(l66, 255, 0, 255);
        if (b66) {
            rc.setIndicatorDot(l66, 255, 255, 255);
        }

    }

    private Direction getBestDirection5() throws GameActionException {
        MapLocation best = currentLocation;
        double localBest = 1000000.0;
        l34 = currentLocation;
        v34 = 0;
        d34 = Direction.CENTER;
        r34 = true;
        l26 = l34.add(Direction.NORTHWEST);
        v26 = 1000000;
        p26 = 1000000;
        d26 = null;
        b26 = true;
        r26 = false;
        o26 = false;
        l25 = l34.add(Direction.WEST);
        v25 = 1000000;
        p25 = 1000000;
        d25 = null;
        b25 = true;
        r25 = false;
        o25 = false;
        l24 = l34.add(Direction.SOUTHWEST);
        v24 = 1000000;
        p24 = 1000000;
        d24 = null;
        b24 = true;
        r24 = false;
        o24 = false;
        l33 = l34.add(Direction.SOUTH);
        v33 = 1000000;
        p33 = 1000000;
        d33 = null;
        b33 = true;
        r33 = false;
        o33 = false;
        l42 = l34.add(Direction.SOUTHEAST);
        v42 = 1000000;
        p42 = 1000000;
        d42 = null;
        b42 = true;
        r42 = false;
        o42 = false;
        l23 = l33.add(Direction.SOUTHWEST);
        v23 = 1000000;
        p23 = 1000000;
        d23 = null;
        b23 = true;
        r23 = false;
        o23 = false;
        l32 = l33.add(Direction.SOUTH);
        v32 = 1000000;
        p32 = 1000000;
        d32 = null;
        b32 = true;
        r32 = false;
        o32 = false;
        l41 = l33.add(Direction.SOUTHEAST);
        v41 = 1000000;
        p41 = 1000000;
        d41 = null;
        b41 = true;
        r41 = false;
        o41 = false;
        l17 = l25.add(Direction.NORTHWEST);
        v17 = 1000000;
        p17 = 1000000;
        d17 = null;
        b17 = true;
        r17 = false;
        o17 = false;
        l16 = l25.add(Direction.WEST);
        v16 = 1000000;
        p16 = 1000000;
        d16 = null;
        b16 = true;
        r16 = false;
        o16 = false;
        l15 = l25.add(Direction.SOUTHWEST);
        v15 = 1000000;
        p15 = 1000000;
        d15 = null;
        b15 = true;
        r15 = false;
        o15 = false;
        l50 = l42.add(Direction.SOUTHEAST);
        v50 = 1000000;
        p50 = 1000000;
        d50 = null;
        b50 = true;
        r50 = false;
        o50 = false;
        l18 = l26.add(Direction.NORTHWEST);
        v18 = 1000000;
        p18 = 1000000;
        d18 = null;
        b18 = true;
        r18 = false;
        o18 = false;
        l14 = l24.add(Direction.SOUTHWEST);
        v14 = 1000000;
        p14 = 1000000;
        d14 = null;
        b14 = true;
        r14 = false;
        o14 = false;
        l9 = l16.add(Direction.NORTHWEST);
        v9 = 1000000;
        p9 = 1000000;
        d9 = null;
        b9 = true;
        r9 = false;
        o9 = false;
        l8 = l16.add(Direction.WEST);
        v8 = 1000000;
        p8 = 1000000;
        d8 = null;
        b8 = true;
        r8 = false;
        o8 = false;
        l7 = l16.add(Direction.SOUTHWEST);
        v7 = 1000000;
        p7 = 1000000;
        d7 = null;
        b7 = true;
        r7 = false;
        o7 = false;
        l22 = l32.add(Direction.SOUTHWEST);
        v22 = 1000000;
        p22 = 1000000;
        d22 = null;
        b22 = true;
        r22 = false;
        o22 = false;
        l31 = l32.add(Direction.SOUTH);
        v31 = 1000000;
        p31 = 1000000;
        d31 = null;
        b31 = true;
        r31 = false;
        o31 = false;
        l40 = l32.add(Direction.SOUTHEAST);
        v40 = 1000000;
        p40 = 1000000;
        d40 = null;
        b40 = true;
        r40 = false;
        o40 = false;
        l6 = l15.add(Direction.SOUTHWEST);
        v6 = 1000000;
        p6 = 1000000;
        d6 = null;
        b6 = true;
        r6 = false;
        o6 = false;
        l49 = l41.add(Direction.SOUTHEAST);
        v49 = 1000000;
        p49 = 1000000;
        d49 = null;
        b49 = true;
        r49 = false;
        o49 = false;
        l13 = l23.add(Direction.SOUTHWEST);
        v13 = 1000000;
        p13 = 1000000;
        d13 = null;
        b13 = true;
        r13 = false;
        o13 = false;
        l10 = l17.add(Direction.NORTHWEST);
        v10 = 1000000;
        p10 = 1000000;
        d10 = null;
        b10 = true;
        r10 = false;
        o10 = false;
        l11 = l18.add(Direction.NORTHWEST);
        v11 = 1000000;
        p11 = 1000000;
        d11 = null;
        b11 = true;
        r11 = false;
        o11 = false;
        l57 = l50.add(Direction.SOUTHEAST);
        v57 = 1000000;
        p57 = 1000000;
        d57 = null;
        b57 = true;
        r57 = false;
        o57 = false;
        l5 = l14.add(Direction.SOUTHWEST);
        v5 = 1000000;
        p5 = 1000000;
        d5 = null;
        b5 = true;
        r5 = false;
        o5 = false;
        l3 = l8.add(Direction.NORTHWEST);
        v3 = 1000000;
        p3 = 1000000;
        d3 = null;
        b3 = true;
        r3 = false;
        o3 = false;
        l2 = l8.add(Direction.WEST);
        v2 = 1000000;
        p2 = 1000000;
        d2 = null;
        b2 = true;
        r2 = false;
        o2 = false;
        l1 = l8.add(Direction.SOUTHWEST);
        v1 = 1000000;
        p1 = 1000000;
        d1 = null;
        b1 = true;
        r1 = false;
        o1 = false;
        l21 = l31.add(Direction.SOUTHWEST);
        v21 = 1000000;
        p21 = 1000000;
        d21 = null;
        b21 = true;
        r21 = false;
        o21 = false;
        l30 = l31.add(Direction.SOUTH);
        v30 = 1000000;
        p30 = 1000000;
        d30 = null;
        b30 = true;
        r30 = false;
        o30 = false;
        l39 = l31.add(Direction.SOUTHEAST);
        v39 = 1000000;
        p39 = 1000000;
        d39 = null;
        b39 = true;
        r39 = false;
        o39 = false;
        l0 = l7.add(Direction.SOUTHWEST);
        v0 = 1000000;
        p0 = 1000000;
        d0 = null;
        b0 = true;
        r0 = false;
        o0 = false;
        l4 = l9.add(Direction.NORTHWEST);
        v4 = 1000000;
        p4 = 1000000;
        d4 = null;
        b4 = true;
        r4 = false;
        o4 = false;
        l48 = l40.add(Direction.SOUTHEAST);
        v48 = 1000000;
        p48 = 1000000;
        d48 = null;
        b48 = true;
        r48 = false;
        o48 = false;
        l12 = l22.add(Direction.SOUTHWEST);
        v12 = 1000000;
        p12 = 1000000;
        d12 = null;
        b12 = true;
        r12 = false;
        o12 = false;
    
        if (rc.onTheMap(l33) && rc.canSenseLocation(l33)) {
            if (rc.senseCloud(l33)) {
                p33 = 1.5;
                b33 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l33).getCurrentDirection();
                if (targetLocation.equals(l33) || (rc.sensePassability(l33) && !rc.canSenseRobotAtLocation(l33) && currentDirection.equals(Direction.CENTER))) {
                    p33 = rc.senseMapInfo(l33).getCooldownMultiplier(team);
                    b33 = false;
                }
            }
            if (v33 > v34 + p33) {
                v33 = v34 + p33;
                d33 = Direction.SOUTH;
            }
            if (v33 > v25 + p33) {
                v33 = v25 + p33;
                d33 = d25;
            }
            
            r33 |= r34;
            r33 |= r25;
            r33 &= !b33;
            o25 |= b33;
        }
        else {
            o25 |= b33;
        }

        if (rc.onTheMap(l25) && rc.canSenseLocation(l25)) {
            if (rc.senseCloud(l25)) {
                p25 = 1.5;
                b25 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l25).getCurrentDirection();
                if (targetLocation.equals(l25) || (rc.sensePassability(l25) && !rc.canSenseRobotAtLocation(l25) && currentDirection.equals(Direction.CENTER))) {
                    p25 = rc.senseMapInfo(l25).getCooldownMultiplier(team);
                    b25 = false;
                }
            }
            if (v25 > v34 + p25) {
                v25 = v34 + p25;
                d25 = Direction.WEST;
            }
            if (v25 > v33 + p25) {
                v25 = v33 + p25;
                d25 = d33;
            }
            
            r25 |= r34;
            r25 |= r33;
            r25 &= !b25;
            o33 |= b25;
        }
        else {
            o33 |= b25;
        }

        if (rc.onTheMap(l42) && rc.canSenseLocation(l42)) {
            if (rc.senseCloud(l42)) {
                p42 = 1.5;
                b42 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l42).getCurrentDirection();
                if (targetLocation.equals(l42) || (rc.sensePassability(l42) && !rc.canSenseRobotAtLocation(l42) && currentDirection.equals(Direction.CENTER))) {
                    p42 = rc.senseMapInfo(l42).getCooldownMultiplier(team);
                    b42 = false;
                }
            }
            if (v42 > v34 + p42) {
                v42 = v34 + p42;
                d42 = Direction.SOUTHEAST;
            }
            if (v42 > v33 + p42) {
                v42 = v33 + p42;
                d42 = d33;
            }
            
            r42 |= r34;
            r42 |= r33;
            r42 &= !b42;
            o33 |= b42;
        }
        else {
            o33 |= b42;
        }

        if (rc.onTheMap(l26) && rc.canSenseLocation(l26)) {
            if (rc.senseCloud(l26)) {
                p26 = 1.5;
                b26 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l26).getCurrentDirection();
                if (targetLocation.equals(l26) || (rc.sensePassability(l26) && !rc.canSenseRobotAtLocation(l26) && currentDirection.equals(Direction.CENTER))) {
                    p26 = rc.senseMapInfo(l26).getCooldownMultiplier(team);
                    b26 = false;
                }
            }
            if (v26 > v25 + p26) {
                v26 = v25 + p26;
                d26 = d25;
            }
            if (v26 > v34 + p26) {
                v26 = v34 + p26;
                d26 = Direction.NORTHWEST;
            }
            
            r26 |= r25;
            r26 |= r34;
            r26 &= !b26;
            o25 |= b26;
        }
        else {
            o25 |= b26;
        }

        if (rc.onTheMap(l24) && rc.canSenseLocation(l24)) {
            if (rc.senseCloud(l24)) {
                p24 = 1.5;
                b24 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l24).getCurrentDirection();
                if (targetLocation.equals(l24) || (rc.sensePassability(l24) && !rc.canSenseRobotAtLocation(l24) && currentDirection.equals(Direction.CENTER))) {
                    p24 = rc.senseMapInfo(l24).getCooldownMultiplier(team);
                    b24 = false;
                }
            }
            if (v24 > v33 + p24) {
                v24 = v33 + p24;
                d24 = d33;
            }
            if (v24 > v34 + p24) {
                v24 = v34 + p24;
                d24 = Direction.SOUTHWEST;
            }
            if (v24 > v25 + p24) {
                v24 = v25 + p24;
                d24 = d25;
            }
            
            r24 |= r33;
            r24 |= r34;
            r24 |= r25;
            r24 &= !b24;
            o33 |= b24;
            o25 |= b24;
        }
        else {
            o33 |= b24;
            o25 |= b24;
        }

        if (rc.onTheMap(l16) && rc.canSenseLocation(l16)) {
            if (rc.senseCloud(l16)) {
                p16 = 1.5;
                b16 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l16).getCurrentDirection();
                if (targetLocation.equals(l16) || (rc.sensePassability(l16) && !rc.canSenseRobotAtLocation(l16) && currentDirection.equals(Direction.CENTER))) {
                    p16 = rc.senseMapInfo(l16).getCooldownMultiplier(team);
                    b16 = false;
                }
            }
            if (v16 > v25 + p16) {
                v16 = v25 + p16;
                d16 = d25;
            }
            if (v16 > v26 + p16) {
                v16 = v26 + p16;
                d16 = d26;
            }
            if (v16 > v24 + p16) {
                v16 = v24 + p16;
                d16 = d24;
            }
            
            r16 |= r25;
            r16 |= r26;
            r16 |= r24;
            r16 &= !b16;
            o25 |= b16;
            o26 |= b16;
            o24 |= b16;
        }
        else {
            o25 |= b16;
            o26 |= b16;
            o24 |= b16;
        }

        if (rc.onTheMap(l32) && rc.canSenseLocation(l32)) {
            if (rc.senseCloud(l32)) {
                p32 = 1.5;
                b32 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l32).getCurrentDirection();
                if (targetLocation.equals(l32) || (rc.sensePassability(l32) && !rc.canSenseRobotAtLocation(l32) && currentDirection.equals(Direction.CENTER))) {
                    p32 = rc.senseMapInfo(l32).getCooldownMultiplier(team);
                    b32 = false;
                }
            }
            if (v32 > v42 + p32) {
                v32 = v42 + p32;
                d32 = d42;
            }
            if (v32 > v33 + p32) {
                v32 = v33 + p32;
                d32 = d33;
            }
            if (v32 > v24 + p32) {
                v32 = v24 + p32;
                d32 = d24;
            }
            
            r32 |= r42;
            r32 |= r33;
            r32 |= r24;
            r32 &= !b32;
            o42 |= b32;
            o33 |= b32;
            o24 |= b32;
        }
        else {
            o42 |= b32;
            o33 |= b32;
            o24 |= b32;
        }

        if (rc.onTheMap(l15) && rc.canSenseLocation(l15)) {
            if (rc.senseCloud(l15)) {
                p15 = 1.5;
                b15 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l15).getCurrentDirection();
                if (targetLocation.equals(l15) || (rc.sensePassability(l15) && !rc.canSenseRobotAtLocation(l15) && currentDirection.equals(Direction.CENTER))) {
                    p15 = rc.senseMapInfo(l15).getCooldownMultiplier(team);
                    b15 = false;
                }
            }
            if (v15 > v24 + p15) {
                v15 = v24 + p15;
                d15 = d24;
            }
            if (v15 > v25 + p15) {
                v15 = v25 + p15;
                d15 = d25;
            }
            if (v15 > v16 + p15) {
                v15 = v16 + p15;
                d15 = d16;
            }
            if (v15 > v23 + p15) {
                v15 = v23 + p15;
                d15 = d23;
            }
            
            r15 |= r24;
            r15 |= r25;
            r15 |= r16;
            r15 |= r23;
            r15 &= !b15;
            o24 |= b15;
            o25 |= b15;
            o16 |= b15;
            o23 |= b15;
        }
        else {
            o24 |= b15;
            o25 |= b15;
            o16 |= b15;
            o23 |= b15;
        }

        if (rc.onTheMap(l41) && rc.canSenseLocation(l41)) {
            if (rc.senseCloud(l41)) {
                p41 = 1.5;
                b41 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l41).getCurrentDirection();
                if (targetLocation.equals(l41) || (rc.sensePassability(l41) && !rc.canSenseRobotAtLocation(l41) && currentDirection.equals(Direction.CENTER))) {
                    p41 = rc.senseMapInfo(l41).getCooldownMultiplier(team);
                    b41 = false;
                }
            }
            if (v41 > v42 + p41) {
                v41 = v42 + p41;
                d41 = d42;
            }
            if (v41 > v33 + p41) {
                v41 = v33 + p41;
                d41 = d33;
            }
            if (v41 > v32 + p41) {
                v41 = v32 + p41;
                d41 = d32;
            }
            
            r41 |= r42;
            r41 |= r33;
            r41 |= r32;
            r41 &= !b41;
            o42 |= b41;
            o33 |= b41;
            o32 |= b41;
        }
        else {
            o42 |= b41;
            o33 |= b41;
            o32 |= b41;
        }

        if (rc.onTheMap(l23) && rc.canSenseLocation(l23)) {
            if (rc.senseCloud(l23)) {
                p23 = 1.5;
                b23 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l23).getCurrentDirection();
                if (targetLocation.equals(l23) || (rc.sensePassability(l23) && !rc.canSenseRobotAtLocation(l23) && currentDirection.equals(Direction.CENTER))) {
                    p23 = rc.senseMapInfo(l23).getCooldownMultiplier(team);
                    b23 = false;
                }
            }
            if (v23 > v32 + p23) {
                v23 = v32 + p23;
                d23 = d32;
            }
            if (v23 > v33 + p23) {
                v23 = v33 + p23;
                d23 = d33;
            }
            if (v23 > v24 + p23) {
                v23 = v24 + p23;
                d23 = d24;
            }
            if (v23 > v15 + p23) {
                v23 = v15 + p23;
                d23 = d15;
            }
            
            r23 |= r32;
            r23 |= r33;
            r23 |= r24;
            r23 |= r15;
            r23 &= !b23;
            o32 |= b23;
            o33 |= b23;
            o24 |= b23;
            o15 |= b23;
        }
        else {
            o32 |= b23;
            o33 |= b23;
            o24 |= b23;
            o15 |= b23;
        }

        if (rc.onTheMap(l17) && rc.canSenseLocation(l17)) {
            if (rc.senseCloud(l17)) {
                p17 = 1.5;
                b17 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l17).getCurrentDirection();
                if (targetLocation.equals(l17) || (rc.sensePassability(l17) && !rc.canSenseRobotAtLocation(l17) && currentDirection.equals(Direction.CENTER))) {
                    p17 = rc.senseMapInfo(l17).getCooldownMultiplier(team);
                    b17 = false;
                }
            }
            if (v17 > v26 + p17) {
                v17 = v26 + p17;
                d17 = d26;
            }
            if (v17 > v16 + p17) {
                v17 = v16 + p17;
                d17 = d16;
            }
            if (v17 > v25 + p17) {
                v17 = v25 + p17;
                d17 = d25;
            }
            
            r17 |= r26;
            r17 |= r16;
            r17 |= r25;
            r17 &= !b17;
            o26 |= b17;
            o16 |= b17;
            o25 |= b17;
        }
        else {
            o26 |= b17;
            o16 |= b17;
            o25 |= b17;
        }

        if (rc.onTheMap(l18) && rc.canSenseLocation(l18)) {
            if (rc.senseCloud(l18)) {
                p18 = 1.5;
                b18 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l18).getCurrentDirection();
                if (targetLocation.equals(l18) || (rc.sensePassability(l18) && !rc.canSenseRobotAtLocation(l18) && currentDirection.equals(Direction.CENTER))) {
                    p18 = rc.senseMapInfo(l18).getCooldownMultiplier(team);
                    b18 = false;
                }
            }
            if (v18 > v17 + p18) {
                v18 = v17 + p18;
                d18 = d17;
            }
            if (v18 > v26 + p18) {
                v18 = v26 + p18;
                d18 = d26;
            }
            
            r18 |= r17;
            r18 |= r26;
            r18 &= !b18;
            o17 |= b18;
            o26 |= b18;
        }
        else {
            o17 |= b18;
            o26 |= b18;
        }

        if (rc.onTheMap(l50) && rc.canSenseLocation(l50)) {
            if (rc.senseCloud(l50)) {
                p50 = 1.5;
                b50 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l50).getCurrentDirection();
                if (targetLocation.equals(l50) || (rc.sensePassability(l50) && !rc.canSenseRobotAtLocation(l50) && currentDirection.equals(Direction.CENTER))) {
                    p50 = rc.senseMapInfo(l50).getCooldownMultiplier(team);
                    b50 = false;
                }
            }
            if (v50 > v42 + p50) {
                v50 = v42 + p50;
                d50 = d42;
            }
            if (v50 > v41 + p50) {
                v50 = v41 + p50;
                d50 = d41;
            }
            
            r50 |= r42;
            r50 |= r41;
            r50 &= !b50;
            o42 |= b50;
            o41 |= b50;
        }
        else {
            o42 |= b50;
            o41 |= b50;
        }

        if (rc.onTheMap(l14) && rc.canSenseLocation(l14)) {
            if (rc.senseCloud(l14)) {
                p14 = 1.5;
                b14 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l14).getCurrentDirection();
                if (targetLocation.equals(l14) || (rc.sensePassability(l14) && !rc.canSenseRobotAtLocation(l14) && currentDirection.equals(Direction.CENTER))) {
                    p14 = rc.senseMapInfo(l14).getCooldownMultiplier(team);
                    b14 = false;
                }
            }
            if (v14 > v23 + p14) {
                v14 = v23 + p14;
                d14 = d23;
            }
            if (v14 > v24 + p14) {
                v14 = v24 + p14;
                d14 = d24;
            }
            if (v14 > v15 + p14) {
                v14 = v15 + p14;
                d14 = d15;
            }
            
            r14 |= r23;
            r14 |= r24;
            r14 |= r15;
            r14 &= !b14;
            o23 |= b14;
            o24 |= b14;
            o15 |= b14;
        }
        else {
            o23 |= b14;
            o24 |= b14;
            o15 |= b14;
        }

        if (rc.onTheMap(l8) && rc.canSenseLocation(l8)) {
            if (rc.senseCloud(l8)) {
                p8 = 1.5;
                b8 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l8).getCurrentDirection();
                if (targetLocation.equals(l8) || (rc.sensePassability(l8) && !rc.canSenseRobotAtLocation(l8) && currentDirection.equals(Direction.CENTER))) {
                    p8 = rc.senseMapInfo(l8).getCooldownMultiplier(team);
                    b8 = false;
                }
            }
            if (v8 > v16 + p8) {
                v8 = v16 + p8;
                d8 = d16;
            }
            if (v8 > v17 + p8) {
                v8 = v17 + p8;
                d8 = d17;
            }
            if (v8 > v15 + p8) {
                v8 = v15 + p8;
                d8 = d15;
            }
            
            r8 |= r16;
            r8 |= r17;
            r8 |= r15;
            r8 &= !b8;
            o16 |= b8;
            o17 |= b8;
            o15 |= b8;
        }
        else {
            o16 |= b8;
            o17 |= b8;
            o15 |= b8;
        }

        if (rc.onTheMap(l31) && rc.canSenseLocation(l31)) {
            if (rc.senseCloud(l31)) {
                p31 = 1.5;
                b31 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l31).getCurrentDirection();
                if (targetLocation.equals(l31) || (rc.sensePassability(l31) && !rc.canSenseRobotAtLocation(l31) && currentDirection.equals(Direction.CENTER))) {
                    p31 = rc.senseMapInfo(l31).getCooldownMultiplier(team);
                    b31 = false;
                }
            }
            if (v31 > v41 + p31) {
                v31 = v41 + p31;
                d31 = d41;
            }
            if (v31 > v32 + p31) {
                v31 = v32 + p31;
                d31 = d32;
            }
            if (v31 > v23 + p31) {
                v31 = v23 + p31;
                d31 = d23;
            }
            
            r31 |= r41;
            r31 |= r32;
            r31 |= r23;
            r31 &= !b31;
            o41 |= b31;
            o32 |= b31;
            o23 |= b31;
        }
        else {
            o41 |= b31;
            o32 |= b31;
            o23 |= b31;
        }

        if (rc.onTheMap(l7) && rc.canSenseLocation(l7)) {
            if (rc.senseCloud(l7)) {
                p7 = 1.5;
                b7 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l7).getCurrentDirection();
                if (targetLocation.equals(l7) || (rc.sensePassability(l7) && !rc.canSenseRobotAtLocation(l7) && currentDirection.equals(Direction.CENTER))) {
                    p7 = rc.senseMapInfo(l7).getCooldownMultiplier(team);
                    b7 = false;
                }
            }
            if (v7 > v15 + p7) {
                v7 = v15 + p7;
                d7 = d15;
            }
            if (v7 > v16 + p7) {
                v7 = v16 + p7;
                d7 = d16;
            }
            if (v7 > v8 + p7) {
                v7 = v8 + p7;
                d7 = d8;
            }
            if (v7 > v14 + p7) {
                v7 = v14 + p7;
                d7 = d14;
            }
            
            r7 |= r15;
            r7 |= r16;
            r7 |= r8;
            r7 |= r14;
            r7 &= !b7;
            o15 |= b7;
            o16 |= b7;
            o8 |= b7;
            o14 |= b7;
        }
        else {
            o15 |= b7;
            o16 |= b7;
            o8 |= b7;
            o14 |= b7;
        }

        if (rc.onTheMap(l9) && rc.canSenseLocation(l9)) {
            if (rc.senseCloud(l9)) {
                p9 = 1.5;
                b9 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l9).getCurrentDirection();
                if (targetLocation.equals(l9) || (rc.sensePassability(l9) && !rc.canSenseRobotAtLocation(l9) && currentDirection.equals(Direction.CENTER))) {
                    p9 = rc.senseMapInfo(l9).getCooldownMultiplier(team);
                    b9 = false;
                }
            }
            if (v9 > v17 + p9) {
                v9 = v17 + p9;
                d9 = d17;
            }
            if (v9 > v18 + p9) {
                v9 = v18 + p9;
                d9 = d18;
            }
            if (v9 > v8 + p9) {
                v9 = v8 + p9;
                d9 = d8;
            }
            if (v9 > v16 + p9) {
                v9 = v16 + p9;
                d9 = d16;
            }
            
            r9 |= r17;
            r9 |= r18;
            r9 |= r8;
            r9 |= r16;
            r9 &= !b9;
            o17 |= b9;
            o18 |= b9;
            o8 |= b9;
            o16 |= b9;
        }
        else {
            o17 |= b9;
            o18 |= b9;
            o8 |= b9;
            o16 |= b9;
        }

        if (rc.onTheMap(l40) && rc.canSenseLocation(l40)) {
            if (rc.senseCloud(l40)) {
                p40 = 1.5;
                b40 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l40).getCurrentDirection();
                if (targetLocation.equals(l40) || (rc.sensePassability(l40) && !rc.canSenseRobotAtLocation(l40) && currentDirection.equals(Direction.CENTER))) {
                    p40 = rc.senseMapInfo(l40).getCooldownMultiplier(team);
                    b40 = false;
                }
            }
            if (v40 > v50 + p40) {
                v40 = v50 + p40;
                d40 = d50;
            }
            if (v40 > v41 + p40) {
                v40 = v41 + p40;
                d40 = d41;
            }
            if (v40 > v32 + p40) {
                v40 = v32 + p40;
                d40 = d32;
            }
            if (v40 > v31 + p40) {
                v40 = v31 + p40;
                d40 = d31;
            }
            
            r40 |= r50;
            r40 |= r41;
            r40 |= r32;
            r40 |= r31;
            r40 &= !b40;
            o50 |= b40;
            o41 |= b40;
            o32 |= b40;
            o31 |= b40;
        }
        else {
            o50 |= b40;
            o41 |= b40;
            o32 |= b40;
            o31 |= b40;
        }

        if (rc.onTheMap(l22) && rc.canSenseLocation(l22)) {
            if (rc.senseCloud(l22)) {
                p22 = 1.5;
                b22 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l22).getCurrentDirection();
                if (targetLocation.equals(l22) || (rc.sensePassability(l22) && !rc.canSenseRobotAtLocation(l22) && currentDirection.equals(Direction.CENTER))) {
                    p22 = rc.senseMapInfo(l22).getCooldownMultiplier(team);
                    b22 = false;
                }
            }
            if (v22 > v31 + p22) {
                v22 = v31 + p22;
                d22 = d31;
            }
            if (v22 > v32 + p22) {
                v22 = v32 + p22;
                d22 = d32;
            }
            if (v22 > v23 + p22) {
                v22 = v23 + p22;
                d22 = d23;
            }
            if (v22 > v14 + p22) {
                v22 = v14 + p22;
                d22 = d14;
            }
            
            r22 |= r31;
            r22 |= r32;
            r22 |= r23;
            r22 |= r14;
            r22 &= !b22;
            o31 |= b22;
            o32 |= b22;
            o23 |= b22;
            o14 |= b22;
        }
        else {
            o31 |= b22;
            o32 |= b22;
            o23 |= b22;
            o14 |= b22;
        }

        if (rc.onTheMap(l6) && rc.canSenseLocation(l6)) {
            if (rc.senseCloud(l6)) {
                p6 = 1.5;
                b6 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l6).getCurrentDirection();
                if (targetLocation.equals(l6) || (rc.sensePassability(l6) && !rc.canSenseRobotAtLocation(l6) && currentDirection.equals(Direction.CENTER))) {
                    p6 = rc.senseMapInfo(l6).getCooldownMultiplier(team);
                    b6 = false;
                }
            }
            if (v6 > v14 + p6) {
                v6 = v14 + p6;
                d6 = d14;
            }
            if (v6 > v15 + p6) {
                v6 = v15 + p6;
                d6 = d15;
            }
            if (v6 > v7 + p6) {
                v6 = v7 + p6;
                d6 = d7;
            }
            if (v6 > v13 + p6) {
                v6 = v13 + p6;
                d6 = d13;
            }
            
            r6 |= r14;
            r6 |= r15;
            r6 |= r7;
            r6 |= r13;
            r6 &= !b6;
            o14 |= b6;
            o15 |= b6;
            o7 |= b6;
            o13 |= b6;
        }
        else {
            o14 |= b6;
            o15 |= b6;
            o7 |= b6;
            o13 |= b6;
        }

        if (rc.onTheMap(l13) && rc.canSenseLocation(l13)) {
            if (rc.senseCloud(l13)) {
                p13 = 1.5;
                b13 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l13).getCurrentDirection();
                if (targetLocation.equals(l13) || (rc.sensePassability(l13) && !rc.canSenseRobotAtLocation(l13) && currentDirection.equals(Direction.CENTER))) {
                    p13 = rc.senseMapInfo(l13).getCooldownMultiplier(team);
                    b13 = false;
                }
            }
            if (v13 > v22 + p13) {
                v13 = v22 + p13;
                d13 = d22;
            }
            if (v13 > v23 + p13) {
                v13 = v23 + p13;
                d13 = d23;
            }
            if (v13 > v14 + p13) {
                v13 = v14 + p13;
                d13 = d14;
            }
            if (v13 > v6 + p13) {
                v13 = v6 + p13;
                d13 = d6;
            }
            
            r13 |= r22;
            r13 |= r23;
            r13 |= r14;
            r13 |= r6;
            r13 &= !b13;
            o22 |= b13;
            o23 |= b13;
            o14 |= b13;
            o6 |= b13;
        }
        else {
            o22 |= b13;
            o23 |= b13;
            o14 |= b13;
            o6 |= b13;
        }

        if (rc.onTheMap(l49) && rc.canSenseLocation(l49)) {
            if (rc.senseCloud(l49)) {
                p49 = 1.5;
                b49 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l49).getCurrentDirection();
                if (targetLocation.equals(l49) || (rc.sensePassability(l49) && !rc.canSenseRobotAtLocation(l49) && currentDirection.equals(Direction.CENTER))) {
                    p49 = rc.senseMapInfo(l49).getCooldownMultiplier(team);
                    b49 = false;
                }
            }
            if (v49 > v50 + p49) {
                v49 = v50 + p49;
                d49 = d50;
            }
            if (v49 > v41 + p49) {
                v49 = v41 + p49;
                d49 = d41;
            }
            if (v49 > v40 + p49) {
                v49 = v40 + p49;
                d49 = d40;
            }
            
            r49 |= r50;
            r49 |= r41;
            r49 |= r40;
            r49 &= !b49;
            o50 |= b49;
            o41 |= b49;
            o40 |= b49;
        }
        else {
            o50 |= b49;
            o41 |= b49;
            o40 |= b49;
        }

        if (rc.onTheMap(l10) && rc.canSenseLocation(l10)) {
            if (rc.senseCloud(l10)) {
                p10 = 1.5;
                b10 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l10).getCurrentDirection();
                if (targetLocation.equals(l10) || (rc.sensePassability(l10) && !rc.canSenseRobotAtLocation(l10) && currentDirection.equals(Direction.CENTER))) {
                    p10 = rc.senseMapInfo(l10).getCooldownMultiplier(team);
                    b10 = false;
                }
            }
            if (v10 > v18 + p10) {
                v10 = v18 + p10;
                d10 = d18;
            }
            if (v10 > v9 + p10) {
                v10 = v9 + p10;
                d10 = d9;
            }
            if (v10 > v17 + p10) {
                v10 = v17 + p10;
                d10 = d17;
            }
            
            r10 |= r18;
            r10 |= r9;
            r10 |= r17;
            r10 &= !b10;
            o18 |= b10;
            o9 |= b10;
            o17 |= b10;
        }
        else {
            o18 |= b10;
            o9 |= b10;
            o17 |= b10;
        }

        if (rc.onTheMap(l57) && rc.canSenseLocation(l57)) {
            if (rc.senseCloud(l57)) {
                p57 = 1.5;
                b57 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l57).getCurrentDirection();
                if (targetLocation.equals(l57) || (rc.sensePassability(l57) && !rc.canSenseRobotAtLocation(l57) && currentDirection.equals(Direction.CENTER))) {
                    p57 = rc.senseMapInfo(l57).getCooldownMultiplier(team);
                    b57 = false;
                }
            }
            if (v57 > v50 + p57) {
                v57 = v50 + p57;
                d57 = d50;
            }
            if (v57 > v49 + p57) {
                v57 = v49 + p57;
                d57 = d49;
            }
            
            r57 |= r50;
            r57 |= r49;
            r57 &= !b57;
            o50 |= b57;
            o49 |= b57;
        }
        else {
            o50 |= b57;
            o49 |= b57;
        }

        if (rc.onTheMap(l5) && rc.canSenseLocation(l5)) {
            if (rc.senseCloud(l5)) {
                p5 = 1.5;
                b5 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l5).getCurrentDirection();
                if (targetLocation.equals(l5) || (rc.sensePassability(l5) && !rc.canSenseRobotAtLocation(l5) && currentDirection.equals(Direction.CENTER))) {
                    p5 = rc.senseMapInfo(l5).getCooldownMultiplier(team);
                    b5 = false;
                }
            }
            if (v5 > v13 + p5) {
                v5 = v13 + p5;
                d5 = d13;
            }
            if (v5 > v14 + p5) {
                v5 = v14 + p5;
                d5 = d14;
            }
            if (v5 > v6 + p5) {
                v5 = v6 + p5;
                d5 = d6;
            }
            
            r5 |= r13;
            r5 |= r14;
            r5 |= r6;
            r5 &= !b5;
            o13 |= b5;
            o14 |= b5;
            o6 |= b5;
        }
        else {
            o13 |= b5;
            o14 |= b5;
            o6 |= b5;
        }

        if (rc.onTheMap(l11) && rc.canSenseLocation(l11)) {
            if (rc.senseCloud(l11)) {
                p11 = 1.5;
                b11 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l11).getCurrentDirection();
                if (targetLocation.equals(l11) || (rc.sensePassability(l11) && !rc.canSenseRobotAtLocation(l11) && currentDirection.equals(Direction.CENTER))) {
                    p11 = rc.senseMapInfo(l11).getCooldownMultiplier(team);
                    b11 = false;
                }
            }
            if (v11 > v10 + p11) {
                v11 = v10 + p11;
                d11 = d10;
            }
            if (v11 > v18 + p11) {
                v11 = v18 + p11;
                d11 = d18;
            }
            
            r11 |= r10;
            r11 |= r18;
            r11 &= !b11;
            o10 |= b11;
            o18 |= b11;
        }
        else {
            o10 |= b11;
            o18 |= b11;
        }

        if (rc.onTheMap(l30) && rc.canSenseLocation(l30)) {
            if (rc.senseCloud(l30)) {
                p30 = 1.5;
                b30 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l30).getCurrentDirection();
                if (targetLocation.equals(l30) || (rc.sensePassability(l30) && !rc.canSenseRobotAtLocation(l30) && currentDirection.equals(Direction.CENTER))) {
                    p30 = rc.senseMapInfo(l30).getCooldownMultiplier(team);
                    b30 = false;
                }
            }
            if (v30 > v40 + p30) {
                v30 = v40 + p30;
                d30 = d40;
            }
            if (v30 > v31 + p30) {
                v30 = v31 + p30;
                d30 = d31;
            }
            if (v30 > v22 + p30) {
                v30 = v22 + p30;
                d30 = d22;
            }
            
            r30 |= r40;
            r30 |= r31;
            r30 |= r22;
            r30 &= !b30;
            o40 |= b30;
            o31 |= b30;
            o22 |= b30;
        }
        else {
            o40 |= b30;
            o31 |= b30;
            o22 |= b30;
        }

        if (rc.onTheMap(l2) && rc.canSenseLocation(l2)) {
            if (rc.senseCloud(l2)) {
                p2 = 1.5;
                b2 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l2).getCurrentDirection();
                if (targetLocation.equals(l2) || (rc.sensePassability(l2) && !rc.canSenseRobotAtLocation(l2) && currentDirection.equals(Direction.CENTER))) {
                    p2 = rc.senseMapInfo(l2).getCooldownMultiplier(team);
                    b2 = false;
                }
            }
            if (v2 > v8 + p2) {
                v2 = v8 + p2;
                d2 = d8;
            }
            if (v2 > v9 + p2) {
                v2 = v9 + p2;
                d2 = d9;
            }
            if (v2 > v7 + p2) {
                v2 = v7 + p2;
                d2 = d7;
            }
            
            r2 |= r8;
            r2 |= r9;
            r2 |= r7;
            r2 &= !b2;
            o8 |= b2;
            o9 |= b2;
            o7 |= b2;
        }
        else {
            o8 |= b2;
            o9 |= b2;
            o7 |= b2;
        }

        if (rc.onTheMap(l1) && rc.canSenseLocation(l1)) {
            if (rc.senseCloud(l1)) {
                p1 = 1.5;
                b1 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l1).getCurrentDirection();
                if (targetLocation.equals(l1) || (rc.sensePassability(l1) && !rc.canSenseRobotAtLocation(l1) && currentDirection.equals(Direction.CENTER))) {
                    p1 = rc.senseMapInfo(l1).getCooldownMultiplier(team);
                    b1 = false;
                }
            }
            if (v1 > v7 + p1) {
                v1 = v7 + p1;
                d1 = d7;
            }
            if (v1 > v8 + p1) {
                v1 = v8 + p1;
                d1 = d8;
            }
            if (v1 > v2 + p1) {
                v1 = v2 + p1;
                d1 = d2;
            }
            if (v1 > v6 + p1) {
                v1 = v6 + p1;
                d1 = d6;
            }
            
            r1 |= r7;
            r1 |= r8;
            r1 |= r2;
            r1 |= r6;
            r1 &= !b1;
            o7 |= b1;
            o8 |= b1;
            o2 |= b1;
            o6 |= b1;
        }
        else {
            o7 |= b1;
            o8 |= b1;
            o2 |= b1;
            o6 |= b1;
        }

        if (rc.onTheMap(l39) && rc.canSenseLocation(l39)) {
            if (rc.senseCloud(l39)) {
                p39 = 1.5;
                b39 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l39).getCurrentDirection();
                if (targetLocation.equals(l39) || (rc.sensePassability(l39) && !rc.canSenseRobotAtLocation(l39) && currentDirection.equals(Direction.CENTER))) {
                    p39 = rc.senseMapInfo(l39).getCooldownMultiplier(team);
                    b39 = false;
                }
            }
            if (v39 > v49 + p39) {
                v39 = v49 + p39;
                d39 = d49;
            }
            if (v39 > v40 + p39) {
                v39 = v40 + p39;
                d39 = d40;
            }
            if (v39 > v31 + p39) {
                v39 = v31 + p39;
                d39 = d31;
            }
            if (v39 > v30 + p39) {
                v39 = v30 + p39;
                d39 = d30;
            }
            
            r39 |= r49;
            r39 |= r40;
            r39 |= r31;
            r39 |= r30;
            r39 &= !b39;
            o49 |= b39;
            o40 |= b39;
            o31 |= b39;
            o30 |= b39;
        }
        else {
            o49 |= b39;
            o40 |= b39;
            o31 |= b39;
            o30 |= b39;
        }

        if (rc.onTheMap(l21) && rc.canSenseLocation(l21)) {
            if (rc.senseCloud(l21)) {
                p21 = 1.5;
                b21 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l21).getCurrentDirection();
                if (targetLocation.equals(l21) || (rc.sensePassability(l21) && !rc.canSenseRobotAtLocation(l21) && currentDirection.equals(Direction.CENTER))) {
                    p21 = rc.senseMapInfo(l21).getCooldownMultiplier(team);
                    b21 = false;
                }
            }
            if (v21 > v30 + p21) {
                v21 = v30 + p21;
                d21 = d30;
            }
            if (v21 > v31 + p21) {
                v21 = v31 + p21;
                d21 = d31;
            }
            if (v21 > v22 + p21) {
                v21 = v22 + p21;
                d21 = d22;
            }
            if (v21 > v13 + p21) {
                v21 = v13 + p21;
                d21 = d13;
            }
            
            r21 |= r30;
            r21 |= r31;
            r21 |= r22;
            r21 |= r13;
            r21 &= !b21;
            o30 |= b21;
            o31 |= b21;
            o22 |= b21;
            o13 |= b21;
        }
        else {
            o30 |= b21;
            o31 |= b21;
            o22 |= b21;
            o13 |= b21;
        }

        if (rc.onTheMap(l3) && rc.canSenseLocation(l3)) {
            if (rc.senseCloud(l3)) {
                p3 = 1.5;
                b3 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l3).getCurrentDirection();
                if (targetLocation.equals(l3) || (rc.sensePassability(l3) && !rc.canSenseRobotAtLocation(l3) && currentDirection.equals(Direction.CENTER))) {
                    p3 = rc.senseMapInfo(l3).getCooldownMultiplier(team);
                    b3 = false;
                }
            }
            if (v3 > v9 + p3) {
                v3 = v9 + p3;
                d3 = d9;
            }
            if (v3 > v10 + p3) {
                v3 = v10 + p3;
                d3 = d10;
            }
            if (v3 > v2 + p3) {
                v3 = v2 + p3;
                d3 = d2;
            }
            if (v3 > v8 + p3) {
                v3 = v8 + p3;
                d3 = d8;
            }
            
            r3 |= r9;
            r3 |= r10;
            r3 |= r2;
            r3 |= r8;
            r3 &= !b3;
            o9 |= b3;
            o10 |= b3;
            o2 |= b3;
            o8 |= b3;
        }
        else {
            o9 |= b3;
            o10 |= b3;
            o2 |= b3;
            o8 |= b3;
        }

        if (rc.onTheMap(l4) && rc.canSenseLocation(l4)) {
            if (rc.senseCloud(l4)) {
                p4 = 1.5;
                b4 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l4).getCurrentDirection();
                if (targetLocation.equals(l4) || (rc.sensePassability(l4) && !rc.canSenseRobotAtLocation(l4) && currentDirection.equals(Direction.CENTER))) {
                    p4 = rc.senseMapInfo(l4).getCooldownMultiplier(team);
                    b4 = false;
                }
            }
            if (v4 > v10 + p4) {
                v4 = v10 + p4;
                d4 = d10;
            }
            if (v4 > v11 + p4) {
                v4 = v11 + p4;
                d4 = d11;
            }
            if (v4 > v3 + p4) {
                v4 = v3 + p4;
                d4 = d3;
            }
            if (v4 > v9 + p4) {
                v4 = v9 + p4;
                d4 = d9;
            }
            
            r4 |= r10;
            r4 |= r11;
            r4 |= r3;
            r4 |= r9;
            r4 &= !b4;
            o10 |= b4;
            o11 |= b4;
            o3 |= b4;
            o9 |= b4;
        }
        else {
            o10 |= b4;
            o11 |= b4;
            o3 |= b4;
            o9 |= b4;
        }

        if (rc.onTheMap(l48) && rc.canSenseLocation(l48)) {
            if (rc.senseCloud(l48)) {
                p48 = 1.5;
                b48 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l48).getCurrentDirection();
                if (targetLocation.equals(l48) || (rc.sensePassability(l48) && !rc.canSenseRobotAtLocation(l48) && currentDirection.equals(Direction.CENTER))) {
                    p48 = rc.senseMapInfo(l48).getCooldownMultiplier(team);
                    b48 = false;
                }
            }
            if (v48 > v57 + p48) {
                v48 = v57 + p48;
                d48 = d57;
            }
            if (v48 > v49 + p48) {
                v48 = v49 + p48;
                d48 = d49;
            }
            if (v48 > v40 + p48) {
                v48 = v40 + p48;
                d48 = d40;
            }
            if (v48 > v39 + p48) {
                v48 = v39 + p48;
                d48 = d39;
            }
            
            r48 |= r57;
            r48 |= r49;
            r48 |= r40;
            r48 |= r39;
            r48 &= !b48;
            o57 |= b48;
            o49 |= b48;
            o40 |= b48;
            o39 |= b48;
        }
        else {
            o57 |= b48;
            o49 |= b48;
            o40 |= b48;
            o39 |= b48;
        }

        if (rc.onTheMap(l0) && rc.canSenseLocation(l0)) {
            if (rc.senseCloud(l0)) {
                p0 = 1.5;
                b0 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l0).getCurrentDirection();
                if (targetLocation.equals(l0) || (rc.sensePassability(l0) && !rc.canSenseRobotAtLocation(l0) && currentDirection.equals(Direction.CENTER))) {
                    p0 = rc.senseMapInfo(l0).getCooldownMultiplier(team);
                    b0 = false;
                }
            }
            if (v0 > v6 + p0) {
                v0 = v6 + p0;
                d0 = d6;
            }
            if (v0 > v7 + p0) {
                v0 = v7 + p0;
                d0 = d7;
            }
            if (v0 > v1 + p0) {
                v0 = v1 + p0;
                d0 = d1;
            }
            if (v0 > v5 + p0) {
                v0 = v5 + p0;
                d0 = d5;
            }
            
            r0 |= r6;
            r0 |= r7;
            r0 |= r1;
            r0 |= r5;
            r0 &= !b0;
            o6 |= b0;
            o7 |= b0;
            o1 |= b0;
            o5 |= b0;
        }
        else {
            o6 |= b0;
            o7 |= b0;
            o1 |= b0;
            o5 |= b0;
        }

        if (rc.onTheMap(l12) && rc.canSenseLocation(l12)) {
            if (rc.senseCloud(l12)) {
                p12 = 1.5;
                b12 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l12).getCurrentDirection();
                if (targetLocation.equals(l12) || (rc.sensePassability(l12) && !rc.canSenseRobotAtLocation(l12) && currentDirection.equals(Direction.CENTER))) {
                    p12 = rc.senseMapInfo(l12).getCooldownMultiplier(team);
                    b12 = false;
                }
            }
            if (v12 > v21 + p12) {
                v12 = v21 + p12;
                d12 = d21;
            }
            if (v12 > v22 + p12) {
                v12 = v22 + p12;
                d12 = d22;
            }
            if (v12 > v13 + p12) {
                v12 = v13 + p12;
                d12 = d13;
            }
            if (v12 > v5 + p12) {
                v12 = v5 + p12;
                d12 = d5;
            }
            
            r12 |= r21;
            r12 |= r22;
            r12 |= r13;
            r12 |= r5;
            r12 &= !b12;
            o21 |= b12;
            o22 |= b12;
            o13 |= b12;
            o5 |= b12;
        }
        else {
            o21 |= b12;
            o22 |= b12;
            o13 |= b12;
            o5 |= b12;
        }

        int dx = targetLocation.x - l34.x;
        int dy = targetLocation.y - l34.y;

        switch(dx) {
            case -4:
                switch(dy) {
                    case -2:
                        if (v0 < 10000) {
                            return d0;
                        }
                    case -1:
                        if (v1 < 10000) {
                            return d1;
                        }
                    case 0:
                        if (v2 < 10000) {
                            return d2;
                        }
                    case 1:
                        if (v3 < 10000) {
                            return d3;
                        }
                    case 2:
                        if (v4 < 10000) {
                            return d4;
                        }
                } break;

            case -3:
                switch(dy) {
                    case -3:
                        if (v5 < 10000) {
                            return d5;
                        }
                    case -2:
                        if (v6 < 10000) {
                            return d6;
                        }
                    case -1:
                        if (v7 < 10000) {
                            return d7;
                        }
                    case 0:
                        if (v8 < 10000) {
                            return d8;
                        }
                    case 1:
                        if (v9 < 10000) {
                            return d9;
                        }
                    case 2:
                        if (v10 < 10000) {
                            return d10;
                        }
                    case 3:
                        if (v11 < 10000) {
                            return d11;
                        }
                } break;

            case -2:
                switch(dy) {
                    case -4:
                        if (v12 < 10000) {
                            return d12;
                        }
                    case -3:
                        if (v13 < 10000) {
                            return d13;
                        }
                    case -2:
                        if (v14 < 10000) {
                            return d14;
                        }
                    case -1:
                        if (v15 < 10000) {
                            return d15;
                        }
                    case 0:
                        if (v16 < 10000) {
                            return d16;
                        }
                    case 1:
                        if (v17 < 10000) {
                            return d17;
                        }
                    case 2:
                        if (v18 < 10000) {
                            return d18;
                        }
                } break;

            case -1:
                switch(dy) {
                    case -4:
                        if (v21 < 10000) {
                            return d21;
                        }
                    case -3:
                        if (v22 < 10000) {
                            return d22;
                        }
                    case -2:
                        if (v23 < 10000) {
                            return d23;
                        }
                    case -1:
                        if (v24 < 10000) {
                            return d24;
                        }
                    case 0:
                        if (v25 < 10000) {
                            return d25;
                        }
                    case 1:
                        if (v26 < 10000) {
                            return d26;
                        }
                } break;

            case 0:
                switch(dy) {
                    case -4:
                        if (v30 < 10000) {
                            return d30;
                        }
                    case -3:
                        if (v31 < 10000) {
                            return d31;
                        }
                    case -2:
                        if (v32 < 10000) {
                            return d32;
                        }
                    case -1:
                        if (v33 < 10000) {
                            return d33;
                        }
                    case 0:
                        if (v34 < 10000) {
                            return d34;
                        }
                } break;

            case 1:
                switch(dy) {
                    case -4:
                        if (v39 < 10000) {
                            return d39;
                        }
                    case -3:
                        if (v40 < 10000) {
                            return d40;
                        }
                    case -2:
                        if (v41 < 10000) {
                            return d41;
                        }
                    case -1:
                        if (v42 < 10000) {
                            return d42;
                        }
                } break;

            case 2:
                switch(dy) {
                    case -4:
                        if (v48 < 10000) {
                            return d48;
                        }
                    case -3:
                        if (v49 < 10000) {
                            return d49;
                        }
                    case -2:
                        if (v50 < 10000) {
                            return d50;
                        }
                } break;

            case 3:
                switch(dy) {
                    case -3:
                        if (v57 < 10000) {
                            return d57;
                        }
                } break;

            case 4:
                switch(dy) {
                } break;

        }
    
        o0 = r0;
        o1 = r1;
        o2 = r2;
        o3 = r3;
        o4 = r4;
        o5 = r5;
        o11 = r11;
        o12 = r12;
        o21 = r21;
        o30 = r30;
        o39 = r39;
        o48 = r48;
        o57 = r57;
        Direction ans = Direction.CENTER;

        if (r0 && o0) {
            double dist0 = v0 + 1.5 * Math.sqrt(l0.distanceSquaredTo(targetLocation));
            if (dist0 < localBest) {
                localBest = dist0;
                ans = d0;
                best = l0;
            }
        }

        if (r1 && o1) {
            double dist1 = v1 + 1.5 * Math.sqrt(l1.distanceSquaredTo(targetLocation));
            if (dist1 < localBest) {
                localBest = dist1;
                ans = d1;
                best = l1;
            }
        }

        if (r2 && o2) {
            double dist2 = v2 + 1.5 * Math.sqrt(l2.distanceSquaredTo(targetLocation));
            if (dist2 < localBest) {
                localBest = dist2;
                ans = d2;
                best = l2;
            }
        }

        if (r3 && o3) {
            double dist3 = v3 + 1.5 * Math.sqrt(l3.distanceSquaredTo(targetLocation));
            if (dist3 < localBest) {
                localBest = dist3;
                ans = d3;
                best = l3;
            }
        }

        if (r4 && o4) {
            double dist4 = v4 + 1.5 * Math.sqrt(l4.distanceSquaredTo(targetLocation));
            if (dist4 < localBest) {
                localBest = dist4;
                ans = d4;
                best = l4;
            }
        }

        if (r5 && o5) {
            double dist5 = v5 + 1.5 * Math.sqrt(l5.distanceSquaredTo(targetLocation));
            if (dist5 < localBest) {
                localBest = dist5;
                ans = d5;
                best = l5;
            }
        }

        if (r11 && o11) {
            double dist11 = v11 + 1.5 * Math.sqrt(l11.distanceSquaredTo(targetLocation));
            if (dist11 < localBest) {
                localBest = dist11;
                ans = d11;
                best = l11;
            }
        }

        if (r12 && o12) {
            double dist12 = v12 + 1.5 * Math.sqrt(l12.distanceSquaredTo(targetLocation));
            if (dist12 < localBest) {
                localBest = dist12;
                ans = d12;
                best = l12;
            }
        }

        if (r21 && o21) {
            double dist21 = v21 + 1.5 * Math.sqrt(l21.distanceSquaredTo(targetLocation));
            if (dist21 < localBest) {
                localBest = dist21;
                ans = d21;
                best = l21;
            }
        }

        if (r30 && o30) {
            double dist30 = v30 + 1.5 * Math.sqrt(l30.distanceSquaredTo(targetLocation));
            if (dist30 < localBest) {
                localBest = dist30;
                ans = d30;
                best = l30;
            }
        }

        if (r39 && o39) {
            double dist39 = v39 + 1.5 * Math.sqrt(l39.distanceSquaredTo(targetLocation));
            if (dist39 < localBest) {
                localBest = dist39;
                ans = d39;
                best = l39;
            }
        }

        if (r48 && o48) {
            double dist48 = v48 + 1.5 * Math.sqrt(l48.distanceSquaredTo(targetLocation));
            if (dist48 < localBest) {
                localBest = dist48;
                ans = d48;
                best = l48;
            }
        }

        if (r57 && o57) {
            double dist57 = v57 + 1.5 * Math.sqrt(l57.distanceSquaredTo(targetLocation));
            if (dist57 < localBest) {
                localBest = dist57;
                ans = d57;
                best = l57;
            }
        }

        draws5();
        rc.setIndicatorDot(best, 0, 0, 255);
        if (localBest < globalBest) {
            globalBest = localBest;
            return ans;
        }
        return getBestDirectionWallFollow5(ans);
    }

    private Direction getBestDirectionWallFollow5(Direction prev) throws GameActionException {
        Direction ans = Direction.CENTER;
        int minDistance = closestWallLocations.isEmpty() ? 1000000 : currentLocation.distanceSquaredTo(closestWallLocations.get(0));
    
        if (b0) {
            int distance = currentLocation.distanceSquaredTo(l0);
            if (distance == minDistance) {
                closestWallLocations.add(l0);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l0);
                minDistance = distance;
            }
        }

        if (b1) {
            int distance = currentLocation.distanceSquaredTo(l1);
            if (distance == minDistance) {
                closestWallLocations.add(l1);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l1);
                minDistance = distance;
            }
        }

        if (b2) {
            int distance = currentLocation.distanceSquaredTo(l2);
            if (distance == minDistance) {
                closestWallLocations.add(l2);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l2);
                minDistance = distance;
            }
        }

        if (b3) {
            int distance = currentLocation.distanceSquaredTo(l3);
            if (distance == minDistance) {
                closestWallLocations.add(l3);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l3);
                minDistance = distance;
            }
        }

        if (b4) {
            int distance = currentLocation.distanceSquaredTo(l4);
            if (distance == minDistance) {
                closestWallLocations.add(l4);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l4);
                minDistance = distance;
            }
        }

        if (b5) {
            int distance = currentLocation.distanceSquaredTo(l5);
            if (distance == minDistance) {
                closestWallLocations.add(l5);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l5);
                minDistance = distance;
            }
        }

        if (b6) {
            int distance = currentLocation.distanceSquaredTo(l6);
            if (distance == minDistance) {
                closestWallLocations.add(l6);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l6);
                minDistance = distance;
            }
        }

        if (b7) {
            int distance = currentLocation.distanceSquaredTo(l7);
            if (distance == minDistance) {
                closestWallLocations.add(l7);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l7);
                minDistance = distance;
            }
        }

        if (b8) {
            int distance = currentLocation.distanceSquaredTo(l8);
            if (distance == minDistance) {
                closestWallLocations.add(l8);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l8);
                minDistance = distance;
            }
        }

        if (b9) {
            int distance = currentLocation.distanceSquaredTo(l9);
            if (distance == minDistance) {
                closestWallLocations.add(l9);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l9);
                minDistance = distance;
            }
        }

        if (b10) {
            int distance = currentLocation.distanceSquaredTo(l10);
            if (distance == minDistance) {
                closestWallLocations.add(l10);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l10);
                minDistance = distance;
            }
        }

        if (b11) {
            int distance = currentLocation.distanceSquaredTo(l11);
            if (distance == minDistance) {
                closestWallLocations.add(l11);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l11);
                minDistance = distance;
            }
        }

        if (b12) {
            int distance = currentLocation.distanceSquaredTo(l12);
            if (distance == minDistance) {
                closestWallLocations.add(l12);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l12);
                minDistance = distance;
            }
        }

        if (b13) {
            int distance = currentLocation.distanceSquaredTo(l13);
            if (distance == minDistance) {
                closestWallLocations.add(l13);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l13);
                minDistance = distance;
            }
        }

        if (b14) {
            int distance = currentLocation.distanceSquaredTo(l14);
            if (distance == minDistance) {
                closestWallLocations.add(l14);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l14);
                minDistance = distance;
            }
        }

        if (b15) {
            int distance = currentLocation.distanceSquaredTo(l15);
            if (distance == minDistance) {
                closestWallLocations.add(l15);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l15);
                minDistance = distance;
            }
        }

        if (b16) {
            int distance = currentLocation.distanceSquaredTo(l16);
            if (distance == minDistance) {
                closestWallLocations.add(l16);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l16);
                minDistance = distance;
            }
        }

        if (b17) {
            int distance = currentLocation.distanceSquaredTo(l17);
            if (distance == minDistance) {
                closestWallLocations.add(l17);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l17);
                minDistance = distance;
            }
        }

        if (b18) {
            int distance = currentLocation.distanceSquaredTo(l18);
            if (distance == minDistance) {
                closestWallLocations.add(l18);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l18);
                minDistance = distance;
            }
        }

        if (b21) {
            int distance = currentLocation.distanceSquaredTo(l21);
            if (distance == minDistance) {
                closestWallLocations.add(l21);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l21);
                minDistance = distance;
            }
        }

        if (b22) {
            int distance = currentLocation.distanceSquaredTo(l22);
            if (distance == minDistance) {
                closestWallLocations.add(l22);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l22);
                minDistance = distance;
            }
        }

        if (b23) {
            int distance = currentLocation.distanceSquaredTo(l23);
            if (distance == minDistance) {
                closestWallLocations.add(l23);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l23);
                minDistance = distance;
            }
        }

        if (b24) {
            int distance = currentLocation.distanceSquaredTo(l24);
            if (distance == minDistance) {
                closestWallLocations.add(l24);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l24);
                minDistance = distance;
            }
        }

        if (b25) {
            int distance = currentLocation.distanceSquaredTo(l25);
            if (distance == minDistance) {
                closestWallLocations.add(l25);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l25);
                minDistance = distance;
            }
        }

        if (b26) {
            int distance = currentLocation.distanceSquaredTo(l26);
            if (distance == minDistance) {
                closestWallLocations.add(l26);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l26);
                minDistance = distance;
            }
        }

        if (b30) {
            int distance = currentLocation.distanceSquaredTo(l30);
            if (distance == minDistance) {
                closestWallLocations.add(l30);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l30);
                minDistance = distance;
            }
        }

        if (b31) {
            int distance = currentLocation.distanceSquaredTo(l31);
            if (distance == minDistance) {
                closestWallLocations.add(l31);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l31);
                minDistance = distance;
            }
        }

        if (b32) {
            int distance = currentLocation.distanceSquaredTo(l32);
            if (distance == minDistance) {
                closestWallLocations.add(l32);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l32);
                minDistance = distance;
            }
        }

        if (b33) {
            int distance = currentLocation.distanceSquaredTo(l33);
            if (distance == minDistance) {
                closestWallLocations.add(l33);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l33);
                minDistance = distance;
            }
        }

        if (b39) {
            int distance = currentLocation.distanceSquaredTo(l39);
            if (distance == minDistance) {
                closestWallLocations.add(l39);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l39);
                minDistance = distance;
            }
        }

        if (b40) {
            int distance = currentLocation.distanceSquaredTo(l40);
            if (distance == minDistance) {
                closestWallLocations.add(l40);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l40);
                minDistance = distance;
            }
        }

        if (b41) {
            int distance = currentLocation.distanceSquaredTo(l41);
            if (distance == minDistance) {
                closestWallLocations.add(l41);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l41);
                minDistance = distance;
            }
        }

        if (b42) {
            int distance = currentLocation.distanceSquaredTo(l42);
            if (distance == minDistance) {
                closestWallLocations.add(l42);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l42);
                minDistance = distance;
            }
        }

        if (b48) {
            int distance = currentLocation.distanceSquaredTo(l48);
            if (distance == minDistance) {
                closestWallLocations.add(l48);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l48);
                minDistance = distance;
            }
        }

        if (b49) {
            int distance = currentLocation.distanceSquaredTo(l49);
            if (distance == minDistance) {
                closestWallLocations.add(l49);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l49);
                minDistance = distance;
            }
        }

        if (b50) {
            int distance = currentLocation.distanceSquaredTo(l50);
            if (distance == minDistance) {
                closestWallLocations.add(l50);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l50);
                minDistance = distance;
            }
        }

        if (b57) {
            int distance = currentLocation.distanceSquaredTo(l57);
            if (distance == minDistance) {
                closestWallLocations.add(l57);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l57);
                minDistance = distance;
            }
        }

        if (minDistance > 2) { return prev; }
        int maxDot = -999999;
        minDistance = 1000000;
        for (MapLocation closestWallLocation : closestWallLocations) {
            Direction vertical = currentLocation.directionTo(closestWallLocation);

            Direction tangent1 = vertical.rotateLeft().rotateLeft();
            Direction tangent2 = vertical.rotateRight().rotateRight();

            int dx = lastDirection.getDeltaX();
            int dy = lastDirection.getDeltaY();

            int dot1 = tangent1.getDeltaX() * dx + tangent1.getDeltaY() * dy;
            int dot2 = tangent2.getDeltaX() * dx + tangent2.getDeltaY() * dy;

            int distance1 = currentLocation.add(tangent1).distanceSquaredTo(targetLocation);
            int distance2 = currentLocation.add(tangent2).distanceSquaredTo(targetLocation);

            if (!rc.canMove(tangent1)) {
                dot1 = -1000000;
            }

            if (!rc.canMove(tangent2)) {
                dot2 = -1000000;
            }

            if (dot1 > maxDot) {
                maxDot = dot1;
                minDistance = distance1;
                ans = tangent1;
            }

            if (dot2 > maxDot) {
                maxDot = dot2;
                minDistance = distance2;
                ans = tangent2;
            }

            if (dot1 == maxDot && distance1 < minDistance) {
                maxDot = dot1;
                minDistance = distance1;
                ans = tangent1;
            }

            if (dot2 == maxDot && distance2 < minDistance) {
                maxDot = dot2;
                minDistance = distance2;
                ans = tangent2;
            }
        }
        draws5();
        for (MapLocation closestWallLocation : closestWallLocations) {
            rc.setIndicatorDot(closestWallLocation, 255, 0, 0);
        }
        return ans;
    }

    private void draws5() throws GameActionException {
    
        rc.setIndicatorDot(l0, 255, 0, 255);
        if (b0) {
            rc.setIndicatorDot(l0, 255, 255, 255);
        }

        rc.setIndicatorDot(l1, 255, 0, 255);
        if (b1) {
            rc.setIndicatorDot(l1, 255, 255, 255);
        }

        rc.setIndicatorDot(l2, 255, 0, 255);
        if (b2) {
            rc.setIndicatorDot(l2, 255, 255, 255);
        }

        rc.setIndicatorDot(l3, 255, 0, 255);
        if (b3) {
            rc.setIndicatorDot(l3, 255, 255, 255);
        }

        rc.setIndicatorDot(l4, 255, 0, 255);
        if (b4) {
            rc.setIndicatorDot(l4, 255, 255, 255);
        }

        rc.setIndicatorDot(l5, 255, 0, 255);
        if (b5) {
            rc.setIndicatorDot(l5, 255, 255, 255);
        }

        rc.setIndicatorDot(l6, 255, 0, 255);
        if (b6) {
            rc.setIndicatorDot(l6, 255, 255, 255);
        }

        rc.setIndicatorDot(l7, 255, 0, 255);
        if (b7) {
            rc.setIndicatorDot(l7, 255, 255, 255);
        }

        rc.setIndicatorDot(l8, 255, 0, 255);
        if (b8) {
            rc.setIndicatorDot(l8, 255, 255, 255);
        }

        rc.setIndicatorDot(l9, 255, 0, 255);
        if (b9) {
            rc.setIndicatorDot(l9, 255, 255, 255);
        }

        rc.setIndicatorDot(l10, 255, 0, 255);
        if (b10) {
            rc.setIndicatorDot(l10, 255, 255, 255);
        }

        rc.setIndicatorDot(l11, 255, 0, 255);
        if (b11) {
            rc.setIndicatorDot(l11, 255, 255, 255);
        }

        rc.setIndicatorDot(l12, 255, 0, 255);
        if (b12) {
            rc.setIndicatorDot(l12, 255, 255, 255);
        }

        rc.setIndicatorDot(l13, 255, 0, 255);
        if (b13) {
            rc.setIndicatorDot(l13, 255, 255, 255);
        }

        rc.setIndicatorDot(l14, 255, 0, 255);
        if (b14) {
            rc.setIndicatorDot(l14, 255, 255, 255);
        }

        rc.setIndicatorDot(l15, 255, 0, 255);
        if (b15) {
            rc.setIndicatorDot(l15, 255, 255, 255);
        }

        rc.setIndicatorDot(l16, 255, 0, 255);
        if (b16) {
            rc.setIndicatorDot(l16, 255, 255, 255);
        }

        rc.setIndicatorDot(l17, 255, 0, 255);
        if (b17) {
            rc.setIndicatorDot(l17, 255, 255, 255);
        }

        rc.setIndicatorDot(l18, 255, 0, 255);
        if (b18) {
            rc.setIndicatorDot(l18, 255, 255, 255);
        }

        rc.setIndicatorDot(l21, 255, 0, 255);
        if (b21) {
            rc.setIndicatorDot(l21, 255, 255, 255);
        }

        rc.setIndicatorDot(l22, 255, 0, 255);
        if (b22) {
            rc.setIndicatorDot(l22, 255, 255, 255);
        }

        rc.setIndicatorDot(l23, 255, 0, 255);
        if (b23) {
            rc.setIndicatorDot(l23, 255, 255, 255);
        }

        rc.setIndicatorDot(l24, 255, 0, 255);
        if (b24) {
            rc.setIndicatorDot(l24, 255, 255, 255);
        }

        rc.setIndicatorDot(l25, 255, 0, 255);
        if (b25) {
            rc.setIndicatorDot(l25, 255, 255, 255);
        }

        rc.setIndicatorDot(l26, 255, 0, 255);
        if (b26) {
            rc.setIndicatorDot(l26, 255, 255, 255);
        }

        rc.setIndicatorDot(l30, 255, 0, 255);
        if (b30) {
            rc.setIndicatorDot(l30, 255, 255, 255);
        }

        rc.setIndicatorDot(l31, 255, 0, 255);
        if (b31) {
            rc.setIndicatorDot(l31, 255, 255, 255);
        }

        rc.setIndicatorDot(l32, 255, 0, 255);
        if (b32) {
            rc.setIndicatorDot(l32, 255, 255, 255);
        }

        rc.setIndicatorDot(l33, 255, 0, 255);
        if (b33) {
            rc.setIndicatorDot(l33, 255, 255, 255);
        }

        rc.setIndicatorDot(l39, 255, 0, 255);
        if (b39) {
            rc.setIndicatorDot(l39, 255, 255, 255);
        }

        rc.setIndicatorDot(l40, 255, 0, 255);
        if (b40) {
            rc.setIndicatorDot(l40, 255, 255, 255);
        }

        rc.setIndicatorDot(l41, 255, 0, 255);
        if (b41) {
            rc.setIndicatorDot(l41, 255, 255, 255);
        }

        rc.setIndicatorDot(l42, 255, 0, 255);
        if (b42) {
            rc.setIndicatorDot(l42, 255, 255, 255);
        }

        rc.setIndicatorDot(l48, 255, 0, 255);
        if (b48) {
            rc.setIndicatorDot(l48, 255, 255, 255);
        }

        rc.setIndicatorDot(l49, 255, 0, 255);
        if (b49) {
            rc.setIndicatorDot(l49, 255, 255, 255);
        }

        rc.setIndicatorDot(l50, 255, 0, 255);
        if (b50) {
            rc.setIndicatorDot(l50, 255, 255, 255);
        }

        rc.setIndicatorDot(l57, 255, 0, 255);
        if (b57) {
            rc.setIndicatorDot(l57, 255, 255, 255);
        }

    }

    private Direction getBestDirection6() throws GameActionException {
        MapLocation best = currentLocation;
        double localBest = 1000000.0;
        l34 = currentLocation;
        v34 = 0;
        d34 = Direction.CENTER;
        r34 = true;
        l35 = l34.add(Direction.NORTH);
        v35 = 1000000;
        p35 = 1000000;
        d35 = null;
        b35 = true;
        r35 = false;
        o35 = false;
        l26 = l34.add(Direction.NORTHWEST);
        v26 = 1000000;
        p26 = 1000000;
        d26 = null;
        b26 = true;
        r26 = false;
        o26 = false;
        l25 = l34.add(Direction.WEST);
        v25 = 1000000;
        p25 = 1000000;
        d25 = null;
        b25 = true;
        r25 = false;
        o25 = false;
        l24 = l34.add(Direction.SOUTHWEST);
        v24 = 1000000;
        p24 = 1000000;
        d24 = null;
        b24 = true;
        r24 = false;
        o24 = false;
        l33 = l34.add(Direction.SOUTH);
        v33 = 1000000;
        p33 = 1000000;
        d33 = null;
        b33 = true;
        r33 = false;
        o33 = false;
        l23 = l33.add(Direction.SOUTHWEST);
        v23 = 1000000;
        p23 = 1000000;
        d23 = null;
        b23 = true;
        r23 = false;
        o23 = false;
        l32 = l33.add(Direction.SOUTH);
        v32 = 1000000;
        p32 = 1000000;
        d32 = null;
        b32 = true;
        r32 = false;
        o32 = false;
        l17 = l25.add(Direction.NORTHWEST);
        v17 = 1000000;
        p17 = 1000000;
        d17 = null;
        b17 = true;
        r17 = false;
        o17 = false;
        l16 = l25.add(Direction.WEST);
        v16 = 1000000;
        p16 = 1000000;
        d16 = null;
        b16 = true;
        r16 = false;
        o16 = false;
        l15 = l25.add(Direction.SOUTHWEST);
        v15 = 1000000;
        p15 = 1000000;
        d15 = null;
        b15 = true;
        r15 = false;
        o15 = false;
        l36 = l35.add(Direction.NORTH);
        v36 = 1000000;
        p36 = 1000000;
        d36 = null;
        b36 = true;
        r36 = false;
        o36 = false;
        l27 = l35.add(Direction.NORTHWEST);
        v27 = 1000000;
        p27 = 1000000;
        d27 = null;
        b27 = true;
        r27 = false;
        o27 = false;
        l14 = l24.add(Direction.SOUTHWEST);
        v14 = 1000000;
        p14 = 1000000;
        d14 = null;
        b14 = true;
        r14 = false;
        o14 = false;
        l18 = l26.add(Direction.NORTHWEST);
        v18 = 1000000;
        p18 = 1000000;
        d18 = null;
        b18 = true;
        r18 = false;
        o18 = false;
        l37 = l36.add(Direction.NORTH);
        v37 = 1000000;
        p37 = 1000000;
        d37 = null;
        b37 = true;
        r37 = false;
        o37 = false;
        l28 = l36.add(Direction.NORTHWEST);
        v28 = 1000000;
        p28 = 1000000;
        d28 = null;
        b28 = true;
        r28 = false;
        o28 = false;
        l9 = l16.add(Direction.NORTHWEST);
        v9 = 1000000;
        p9 = 1000000;
        d9 = null;
        b9 = true;
        r9 = false;
        o9 = false;
        l8 = l16.add(Direction.WEST);
        v8 = 1000000;
        p8 = 1000000;
        d8 = null;
        b8 = true;
        r8 = false;
        o8 = false;
        l7 = l16.add(Direction.SOUTHWEST);
        v7 = 1000000;
        p7 = 1000000;
        d7 = null;
        b7 = true;
        r7 = false;
        o7 = false;
        l22 = l32.add(Direction.SOUTHWEST);
        v22 = 1000000;
        p22 = 1000000;
        d22 = null;
        b22 = true;
        r22 = false;
        o22 = false;
        l31 = l32.add(Direction.SOUTH);
        v31 = 1000000;
        p31 = 1000000;
        d31 = null;
        b31 = true;
        r31 = false;
        o31 = false;
        l19 = l27.add(Direction.NORTHWEST);
        v19 = 1000000;
        p19 = 1000000;
        d19 = null;
        b19 = true;
        r19 = false;
        o19 = false;
        l6 = l15.add(Direction.SOUTHWEST);
        v6 = 1000000;
        p6 = 1000000;
        d6 = null;
        b6 = true;
        r6 = false;
        o6 = false;
        l13 = l23.add(Direction.SOUTHWEST);
        v13 = 1000000;
        p13 = 1000000;
        d13 = null;
        b13 = true;
        r13 = false;
        o13 = false;
        l10 = l17.add(Direction.NORTHWEST);
        v10 = 1000000;
        p10 = 1000000;
        d10 = null;
        b10 = true;
        r10 = false;
        o10 = false;
        l5 = l14.add(Direction.SOUTHWEST);
        v5 = 1000000;
        p5 = 1000000;
        d5 = null;
        b5 = true;
        r5 = false;
        o5 = false;
        l11 = l18.add(Direction.NORTHWEST);
        v11 = 1000000;
        p11 = 1000000;
        d11 = null;
        b11 = true;
        r11 = false;
        o11 = false;
        l38 = l37.add(Direction.NORTH);
        v38 = 1000000;
        p38 = 1000000;
        d38 = null;
        b38 = true;
        r38 = false;
        o38 = false;
        l29 = l37.add(Direction.NORTHWEST);
        v29 = 1000000;
        p29 = 1000000;
        d29 = null;
        b29 = true;
        r29 = false;
        o29 = false;
        l3 = l8.add(Direction.NORTHWEST);
        v3 = 1000000;
        p3 = 1000000;
        d3 = null;
        b3 = true;
        r3 = false;
        o3 = false;
        l2 = l8.add(Direction.WEST);
        v2 = 1000000;
        p2 = 1000000;
        d2 = null;
        b2 = true;
        r2 = false;
        o2 = false;
        l1 = l8.add(Direction.SOUTHWEST);
        v1 = 1000000;
        p1 = 1000000;
        d1 = null;
        b1 = true;
        r1 = false;
        o1 = false;
        l21 = l31.add(Direction.SOUTHWEST);
        v21 = 1000000;
        p21 = 1000000;
        d21 = null;
        b21 = true;
        r21 = false;
        o21 = false;
        l30 = l31.add(Direction.SOUTH);
        v30 = 1000000;
        p30 = 1000000;
        d30 = null;
        b30 = true;
        r30 = false;
        o30 = false;
        l20 = l28.add(Direction.NORTHWEST);
        v20 = 1000000;
        p20 = 1000000;
        d20 = null;
        b20 = true;
        r20 = false;
        o20 = false;
        l4 = l9.add(Direction.NORTHWEST);
        v4 = 1000000;
        p4 = 1000000;
        d4 = null;
        b4 = true;
        r4 = false;
        o4 = false;
        l12 = l22.add(Direction.SOUTHWEST);
        v12 = 1000000;
        p12 = 1000000;
        d12 = null;
        b12 = true;
        r12 = false;
        o12 = false;
        l0 = l7.add(Direction.SOUTHWEST);
        v0 = 1000000;
        p0 = 1000000;
        d0 = null;
        b0 = true;
        r0 = false;
        o0 = false;
    
        if (rc.onTheMap(l33) && rc.canSenseLocation(l33)) {
            if (rc.senseCloud(l33)) {
                p33 = 1.5;
                b33 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l33).getCurrentDirection();
                if (targetLocation.equals(l33) || (rc.sensePassability(l33) && !rc.canSenseRobotAtLocation(l33) && currentDirection.equals(Direction.CENTER))) {
                    p33 = rc.senseMapInfo(l33).getCooldownMultiplier(team);
                    b33 = false;
                }
            }
            if (v33 > v34 + p33) {
                v33 = v34 + p33;
                d33 = Direction.SOUTH;
            }
            if (v33 > v25 + p33) {
                v33 = v25 + p33;
                d33 = d25;
            }
            
            r33 |= r34;
            r33 |= r25;
            r33 &= !b33;
            o25 |= b33;
        }
        else {
            o25 |= b33;
        }

        if (rc.onTheMap(l25) && rc.canSenseLocation(l25)) {
            if (rc.senseCloud(l25)) {
                p25 = 1.5;
                b25 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l25).getCurrentDirection();
                if (targetLocation.equals(l25) || (rc.sensePassability(l25) && !rc.canSenseRobotAtLocation(l25) && currentDirection.equals(Direction.CENTER))) {
                    p25 = rc.senseMapInfo(l25).getCooldownMultiplier(team);
                    b25 = false;
                }
            }
            if (v25 > v34 + p25) {
                v25 = v34 + p25;
                d25 = Direction.WEST;
            }
            if (v25 > v35 + p25) {
                v25 = v35 + p25;
                d25 = d35;
            }
            if (v25 > v33 + p25) {
                v25 = v33 + p25;
                d25 = d33;
            }
            
            r25 |= r34;
            r25 |= r35;
            r25 |= r33;
            r25 &= !b25;
            o35 |= b25;
            o33 |= b25;
        }
        else {
            o35 |= b25;
            o33 |= b25;
        }

        if (rc.onTheMap(l35) && rc.canSenseLocation(l35)) {
            if (rc.senseCloud(l35)) {
                p35 = 1.5;
                b35 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l35).getCurrentDirection();
                if (targetLocation.equals(l35) || (rc.sensePassability(l35) && !rc.canSenseRobotAtLocation(l35) && currentDirection.equals(Direction.CENTER))) {
                    p35 = rc.senseMapInfo(l35).getCooldownMultiplier(team);
                    b35 = false;
                }
            }
            if (v35 > v25 + p35) {
                v35 = v25 + p35;
                d35 = d25;
            }
            if (v35 > v34 + p35) {
                v35 = v34 + p35;
                d35 = Direction.NORTH;
            }
            
            r35 |= r25;
            r35 |= r34;
            r35 &= !b35;
            o25 |= b35;
        }
        else {
            o25 |= b35;
        }

        if (rc.onTheMap(l24) && rc.canSenseLocation(l24)) {
            if (rc.senseCloud(l24)) {
                p24 = 1.5;
                b24 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l24).getCurrentDirection();
                if (targetLocation.equals(l24) || (rc.sensePassability(l24) && !rc.canSenseRobotAtLocation(l24) && currentDirection.equals(Direction.CENTER))) {
                    p24 = rc.senseMapInfo(l24).getCooldownMultiplier(team);
                    b24 = false;
                }
            }
            if (v24 > v33 + p24) {
                v24 = v33 + p24;
                d24 = d33;
            }
            if (v24 > v34 + p24) {
                v24 = v34 + p24;
                d24 = Direction.SOUTHWEST;
            }
            if (v24 > v25 + p24) {
                v24 = v25 + p24;
                d24 = d25;
            }
            
            r24 |= r33;
            r24 |= r34;
            r24 |= r25;
            r24 &= !b24;
            o33 |= b24;
            o25 |= b24;
        }
        else {
            o33 |= b24;
            o25 |= b24;
        }

        if (rc.onTheMap(l26) && rc.canSenseLocation(l26)) {
            if (rc.senseCloud(l26)) {
                p26 = 1.5;
                b26 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l26).getCurrentDirection();
                if (targetLocation.equals(l26) || (rc.sensePassability(l26) && !rc.canSenseRobotAtLocation(l26) && currentDirection.equals(Direction.CENTER))) {
                    p26 = rc.senseMapInfo(l26).getCooldownMultiplier(team);
                    b26 = false;
                }
            }
            if (v26 > v35 + p26) {
                v26 = v35 + p26;
                d26 = d35;
            }
            if (v26 > v25 + p26) {
                v26 = v25 + p26;
                d26 = d25;
            }
            if (v26 > v34 + p26) {
                v26 = v34 + p26;
                d26 = Direction.NORTHWEST;
            }
            
            r26 |= r35;
            r26 |= r25;
            r26 |= r34;
            r26 &= !b26;
            o35 |= b26;
            o25 |= b26;
        }
        else {
            o35 |= b26;
            o25 |= b26;
        }

        if (rc.onTheMap(l36) && rc.canSenseLocation(l36)) {
            if (rc.senseCloud(l36)) {
                p36 = 1.5;
                b36 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l36).getCurrentDirection();
                if (targetLocation.equals(l36) || (rc.sensePassability(l36) && !rc.canSenseRobotAtLocation(l36) && currentDirection.equals(Direction.CENTER))) {
                    p36 = rc.senseMapInfo(l36).getCooldownMultiplier(team);
                    b36 = false;
                }
            }
            if (v36 > v26 + p36) {
                v36 = v26 + p36;
                d36 = d26;
            }
            if (v36 > v35 + p36) {
                v36 = v35 + p36;
                d36 = d35;
            }
            
            r36 |= r26;
            r36 |= r35;
            r36 &= !b36;
            o26 |= b36;
            o35 |= b36;
        }
        else {
            o26 |= b36;
            o35 |= b36;
        }

        if (rc.onTheMap(l16) && rc.canSenseLocation(l16)) {
            if (rc.senseCloud(l16)) {
                p16 = 1.5;
                b16 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l16).getCurrentDirection();
                if (targetLocation.equals(l16) || (rc.sensePassability(l16) && !rc.canSenseRobotAtLocation(l16) && currentDirection.equals(Direction.CENTER))) {
                    p16 = rc.senseMapInfo(l16).getCooldownMultiplier(team);
                    b16 = false;
                }
            }
            if (v16 > v25 + p16) {
                v16 = v25 + p16;
                d16 = d25;
            }
            if (v16 > v26 + p16) {
                v16 = v26 + p16;
                d16 = d26;
            }
            if (v16 > v24 + p16) {
                v16 = v24 + p16;
                d16 = d24;
            }
            
            r16 |= r25;
            r16 |= r26;
            r16 |= r24;
            r16 &= !b16;
            o25 |= b16;
            o26 |= b16;
            o24 |= b16;
        }
        else {
            o25 |= b16;
            o26 |= b16;
            o24 |= b16;
        }

        if (rc.onTheMap(l32) && rc.canSenseLocation(l32)) {
            if (rc.senseCloud(l32)) {
                p32 = 1.5;
                b32 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l32).getCurrentDirection();
                if (targetLocation.equals(l32) || (rc.sensePassability(l32) && !rc.canSenseRobotAtLocation(l32) && currentDirection.equals(Direction.CENTER))) {
                    p32 = rc.senseMapInfo(l32).getCooldownMultiplier(team);
                    b32 = false;
                }
            }
            if (v32 > v33 + p32) {
                v32 = v33 + p32;
                d32 = d33;
            }
            if (v32 > v24 + p32) {
                v32 = v24 + p32;
                d32 = d24;
            }
            
            r32 |= r33;
            r32 |= r24;
            r32 &= !b32;
            o33 |= b32;
            o24 |= b32;
        }
        else {
            o33 |= b32;
            o24 |= b32;
        }

        if (rc.onTheMap(l27) && rc.canSenseLocation(l27)) {
            if (rc.senseCloud(l27)) {
                p27 = 1.5;
                b27 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l27).getCurrentDirection();
                if (targetLocation.equals(l27) || (rc.sensePassability(l27) && !rc.canSenseRobotAtLocation(l27) && currentDirection.equals(Direction.CENTER))) {
                    p27 = rc.senseMapInfo(l27).getCooldownMultiplier(team);
                    b27 = false;
                }
            }
            if (v27 > v36 + p27) {
                v27 = v36 + p27;
                d27 = d36;
            }
            if (v27 > v17 + p27) {
                v27 = v17 + p27;
                d27 = d17;
            }
            if (v27 > v26 + p27) {
                v27 = v26 + p27;
                d27 = d26;
            }
            if (v27 > v35 + p27) {
                v27 = v35 + p27;
                d27 = d35;
            }
            
            r27 |= r36;
            r27 |= r17;
            r27 |= r26;
            r27 |= r35;
            r27 &= !b27;
            o36 |= b27;
            o17 |= b27;
            o26 |= b27;
            o35 |= b27;
        }
        else {
            o36 |= b27;
            o17 |= b27;
            o26 |= b27;
            o35 |= b27;
        }

        if (rc.onTheMap(l15) && rc.canSenseLocation(l15)) {
            if (rc.senseCloud(l15)) {
                p15 = 1.5;
                b15 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l15).getCurrentDirection();
                if (targetLocation.equals(l15) || (rc.sensePassability(l15) && !rc.canSenseRobotAtLocation(l15) && currentDirection.equals(Direction.CENTER))) {
                    p15 = rc.senseMapInfo(l15).getCooldownMultiplier(team);
                    b15 = false;
                }
            }
            if (v15 > v24 + p15) {
                v15 = v24 + p15;
                d15 = d24;
            }
            if (v15 > v25 + p15) {
                v15 = v25 + p15;
                d15 = d25;
            }
            if (v15 > v16 + p15) {
                v15 = v16 + p15;
                d15 = d16;
            }
            if (v15 > v23 + p15) {
                v15 = v23 + p15;
                d15 = d23;
            }
            
            r15 |= r24;
            r15 |= r25;
            r15 |= r16;
            r15 |= r23;
            r15 &= !b15;
            o24 |= b15;
            o25 |= b15;
            o16 |= b15;
            o23 |= b15;
        }
        else {
            o24 |= b15;
            o25 |= b15;
            o16 |= b15;
            o23 |= b15;
        }

        if (rc.onTheMap(l23) && rc.canSenseLocation(l23)) {
            if (rc.senseCloud(l23)) {
                p23 = 1.5;
                b23 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l23).getCurrentDirection();
                if (targetLocation.equals(l23) || (rc.sensePassability(l23) && !rc.canSenseRobotAtLocation(l23) && currentDirection.equals(Direction.CENTER))) {
                    p23 = rc.senseMapInfo(l23).getCooldownMultiplier(team);
                    b23 = false;
                }
            }
            if (v23 > v32 + p23) {
                v23 = v32 + p23;
                d23 = d32;
            }
            if (v23 > v33 + p23) {
                v23 = v33 + p23;
                d23 = d33;
            }
            if (v23 > v24 + p23) {
                v23 = v24 + p23;
                d23 = d24;
            }
            if (v23 > v15 + p23) {
                v23 = v15 + p23;
                d23 = d15;
            }
            
            r23 |= r32;
            r23 |= r33;
            r23 |= r24;
            r23 |= r15;
            r23 &= !b23;
            o32 |= b23;
            o33 |= b23;
            o24 |= b23;
            o15 |= b23;
        }
        else {
            o32 |= b23;
            o33 |= b23;
            o24 |= b23;
            o15 |= b23;
        }

        if (rc.onTheMap(l17) && rc.canSenseLocation(l17)) {
            if (rc.senseCloud(l17)) {
                p17 = 1.5;
                b17 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l17).getCurrentDirection();
                if (targetLocation.equals(l17) || (rc.sensePassability(l17) && !rc.canSenseRobotAtLocation(l17) && currentDirection.equals(Direction.CENTER))) {
                    p17 = rc.senseMapInfo(l17).getCooldownMultiplier(team);
                    b17 = false;
                }
            }
            if (v17 > v26 + p17) {
                v17 = v26 + p17;
                d17 = d26;
            }
            if (v17 > v27 + p17) {
                v17 = v27 + p17;
                d17 = d27;
            }
            if (v17 > v16 + p17) {
                v17 = v16 + p17;
                d17 = d16;
            }
            if (v17 > v25 + p17) {
                v17 = v25 + p17;
                d17 = d25;
            }
            
            r17 |= r26;
            r17 |= r27;
            r17 |= r16;
            r17 |= r25;
            r17 &= !b17;
            o26 |= b17;
            o27 |= b17;
            o16 |= b17;
            o25 |= b17;
        }
        else {
            o26 |= b17;
            o27 |= b17;
            o16 |= b17;
            o25 |= b17;
        }

        if (rc.onTheMap(l14) && rc.canSenseLocation(l14)) {
            if (rc.senseCloud(l14)) {
                p14 = 1.5;
                b14 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l14).getCurrentDirection();
                if (targetLocation.equals(l14) || (rc.sensePassability(l14) && !rc.canSenseRobotAtLocation(l14) && currentDirection.equals(Direction.CENTER))) {
                    p14 = rc.senseMapInfo(l14).getCooldownMultiplier(team);
                    b14 = false;
                }
            }
            if (v14 > v23 + p14) {
                v14 = v23 + p14;
                d14 = d23;
            }
            if (v14 > v24 + p14) {
                v14 = v24 + p14;
                d14 = d24;
            }
            if (v14 > v15 + p14) {
                v14 = v15 + p14;
                d14 = d15;
            }
            
            r14 |= r23;
            r14 |= r24;
            r14 |= r15;
            r14 &= !b14;
            o23 |= b14;
            o24 |= b14;
            o15 |= b14;
        }
        else {
            o23 |= b14;
            o24 |= b14;
            o15 |= b14;
        }

        if (rc.onTheMap(l18) && rc.canSenseLocation(l18)) {
            if (rc.senseCloud(l18)) {
                p18 = 1.5;
                b18 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l18).getCurrentDirection();
                if (targetLocation.equals(l18) || (rc.sensePassability(l18) && !rc.canSenseRobotAtLocation(l18) && currentDirection.equals(Direction.CENTER))) {
                    p18 = rc.senseMapInfo(l18).getCooldownMultiplier(team);
                    b18 = false;
                }
            }
            if (v18 > v27 + p18) {
                v18 = v27 + p18;
                d18 = d27;
            }
            if (v18 > v17 + p18) {
                v18 = v17 + p18;
                d18 = d17;
            }
            if (v18 > v26 + p18) {
                v18 = v26 + p18;
                d18 = d26;
            }
            
            r18 |= r27;
            r18 |= r17;
            r18 |= r26;
            r18 &= !b18;
            o27 |= b18;
            o17 |= b18;
            o26 |= b18;
        }
        else {
            o27 |= b18;
            o17 |= b18;
            o26 |= b18;
        }

        if (rc.onTheMap(l37) && rc.canSenseLocation(l37)) {
            if (rc.senseCloud(l37)) {
                p37 = 1.5;
                b37 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l37).getCurrentDirection();
                if (targetLocation.equals(l37) || (rc.sensePassability(l37) && !rc.canSenseRobotAtLocation(l37) && currentDirection.equals(Direction.CENTER))) {
                    p37 = rc.senseMapInfo(l37).getCooldownMultiplier(team);
                    b37 = false;
                }
            }
            if (v37 > v27 + p37) {
                v37 = v27 + p37;
                d37 = d27;
            }
            if (v37 > v36 + p37) {
                v37 = v36 + p37;
                d37 = d36;
            }
            
            r37 |= r27;
            r37 |= r36;
            r37 &= !b37;
            o27 |= b37;
            o36 |= b37;
        }
        else {
            o27 |= b37;
            o36 |= b37;
        }

        if (rc.onTheMap(l8) && rc.canSenseLocation(l8)) {
            if (rc.senseCloud(l8)) {
                p8 = 1.5;
                b8 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l8).getCurrentDirection();
                if (targetLocation.equals(l8) || (rc.sensePassability(l8) && !rc.canSenseRobotAtLocation(l8) && currentDirection.equals(Direction.CENTER))) {
                    p8 = rc.senseMapInfo(l8).getCooldownMultiplier(team);
                    b8 = false;
                }
            }
            if (v8 > v16 + p8) {
                v8 = v16 + p8;
                d8 = d16;
            }
            if (v8 > v17 + p8) {
                v8 = v17 + p8;
                d8 = d17;
            }
            if (v8 > v15 + p8) {
                v8 = v15 + p8;
                d8 = d15;
            }
            
            r8 |= r16;
            r8 |= r17;
            r8 |= r15;
            r8 &= !b8;
            o16 |= b8;
            o17 |= b8;
            o15 |= b8;
        }
        else {
            o16 |= b8;
            o17 |= b8;
            o15 |= b8;
        }

        if (rc.onTheMap(l31) && rc.canSenseLocation(l31)) {
            if (rc.senseCloud(l31)) {
                p31 = 1.5;
                b31 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l31).getCurrentDirection();
                if (targetLocation.equals(l31) || (rc.sensePassability(l31) && !rc.canSenseRobotAtLocation(l31) && currentDirection.equals(Direction.CENTER))) {
                    p31 = rc.senseMapInfo(l31).getCooldownMultiplier(team);
                    b31 = false;
                }
            }
            if (v31 > v32 + p31) {
                v31 = v32 + p31;
                d31 = d32;
            }
            if (v31 > v23 + p31) {
                v31 = v23 + p31;
                d31 = d23;
            }
            
            r31 |= r32;
            r31 |= r23;
            r31 &= !b31;
            o32 |= b31;
            o23 |= b31;
        }
        else {
            o32 |= b31;
            o23 |= b31;
        }

        if (rc.onTheMap(l28) && rc.canSenseLocation(l28)) {
            if (rc.senseCloud(l28)) {
                p28 = 1.5;
                b28 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l28).getCurrentDirection();
                if (targetLocation.equals(l28) || (rc.sensePassability(l28) && !rc.canSenseRobotAtLocation(l28) && currentDirection.equals(Direction.CENTER))) {
                    p28 = rc.senseMapInfo(l28).getCooldownMultiplier(team);
                    b28 = false;
                }
            }
            if (v28 > v37 + p28) {
                v28 = v37 + p28;
                d28 = d37;
            }
            if (v28 > v18 + p28) {
                v28 = v18 + p28;
                d28 = d18;
            }
            if (v28 > v27 + p28) {
                v28 = v27 + p28;
                d28 = d27;
            }
            if (v28 > v36 + p28) {
                v28 = v36 + p28;
                d28 = d36;
            }
            
            r28 |= r37;
            r28 |= r18;
            r28 |= r27;
            r28 |= r36;
            r28 &= !b28;
            o37 |= b28;
            o18 |= b28;
            o27 |= b28;
            o36 |= b28;
        }
        else {
            o37 |= b28;
            o18 |= b28;
            o27 |= b28;
            o36 |= b28;
        }

        if (rc.onTheMap(l9) && rc.canSenseLocation(l9)) {
            if (rc.senseCloud(l9)) {
                p9 = 1.5;
                b9 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l9).getCurrentDirection();
                if (targetLocation.equals(l9) || (rc.sensePassability(l9) && !rc.canSenseRobotAtLocation(l9) && currentDirection.equals(Direction.CENTER))) {
                    p9 = rc.senseMapInfo(l9).getCooldownMultiplier(team);
                    b9 = false;
                }
            }
            if (v9 > v17 + p9) {
                v9 = v17 + p9;
                d9 = d17;
            }
            if (v9 > v18 + p9) {
                v9 = v18 + p9;
                d9 = d18;
            }
            if (v9 > v8 + p9) {
                v9 = v8 + p9;
                d9 = d8;
            }
            if (v9 > v16 + p9) {
                v9 = v16 + p9;
                d9 = d16;
            }
            
            r9 |= r17;
            r9 |= r18;
            r9 |= r8;
            r9 |= r16;
            r9 &= !b9;
            o17 |= b9;
            o18 |= b9;
            o8 |= b9;
            o16 |= b9;
        }
        else {
            o17 |= b9;
            o18 |= b9;
            o8 |= b9;
            o16 |= b9;
        }

        if (rc.onTheMap(l22) && rc.canSenseLocation(l22)) {
            if (rc.senseCloud(l22)) {
                p22 = 1.5;
                b22 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l22).getCurrentDirection();
                if (targetLocation.equals(l22) || (rc.sensePassability(l22) && !rc.canSenseRobotAtLocation(l22) && currentDirection.equals(Direction.CENTER))) {
                    p22 = rc.senseMapInfo(l22).getCooldownMultiplier(team);
                    b22 = false;
                }
            }
            if (v22 > v31 + p22) {
                v22 = v31 + p22;
                d22 = d31;
            }
            if (v22 > v32 + p22) {
                v22 = v32 + p22;
                d22 = d32;
            }
            if (v22 > v23 + p22) {
                v22 = v23 + p22;
                d22 = d23;
            }
            if (v22 > v14 + p22) {
                v22 = v14 + p22;
                d22 = d14;
            }
            
            r22 |= r31;
            r22 |= r32;
            r22 |= r23;
            r22 |= r14;
            r22 &= !b22;
            o31 |= b22;
            o32 |= b22;
            o23 |= b22;
            o14 |= b22;
        }
        else {
            o31 |= b22;
            o32 |= b22;
            o23 |= b22;
            o14 |= b22;
        }

        if (rc.onTheMap(l7) && rc.canSenseLocation(l7)) {
            if (rc.senseCloud(l7)) {
                p7 = 1.5;
                b7 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l7).getCurrentDirection();
                if (targetLocation.equals(l7) || (rc.sensePassability(l7) && !rc.canSenseRobotAtLocation(l7) && currentDirection.equals(Direction.CENTER))) {
                    p7 = rc.senseMapInfo(l7).getCooldownMultiplier(team);
                    b7 = false;
                }
            }
            if (v7 > v15 + p7) {
                v7 = v15 + p7;
                d7 = d15;
            }
            if (v7 > v16 + p7) {
                v7 = v16 + p7;
                d7 = d16;
            }
            if (v7 > v8 + p7) {
                v7 = v8 + p7;
                d7 = d8;
            }
            if (v7 > v14 + p7) {
                v7 = v14 + p7;
                d7 = d14;
            }
            
            r7 |= r15;
            r7 |= r16;
            r7 |= r8;
            r7 |= r14;
            r7 &= !b7;
            o15 |= b7;
            o16 |= b7;
            o8 |= b7;
            o14 |= b7;
        }
        else {
            o15 |= b7;
            o16 |= b7;
            o8 |= b7;
            o14 |= b7;
        }

        if (rc.onTheMap(l13) && rc.canSenseLocation(l13)) {
            if (rc.senseCloud(l13)) {
                p13 = 1.5;
                b13 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l13).getCurrentDirection();
                if (targetLocation.equals(l13) || (rc.sensePassability(l13) && !rc.canSenseRobotAtLocation(l13) && currentDirection.equals(Direction.CENTER))) {
                    p13 = rc.senseMapInfo(l13).getCooldownMultiplier(team);
                    b13 = false;
                }
            }
            if (v13 > v22 + p13) {
                v13 = v22 + p13;
                d13 = d22;
            }
            if (v13 > v23 + p13) {
                v13 = v23 + p13;
                d13 = d23;
            }
            if (v13 > v14 + p13) {
                v13 = v14 + p13;
                d13 = d14;
            }
            if (v13 > v6 + p13) {
                v13 = v6 + p13;
                d13 = d6;
            }
            
            r13 |= r22;
            r13 |= r23;
            r13 |= r14;
            r13 |= r6;
            r13 &= !b13;
            o22 |= b13;
            o23 |= b13;
            o14 |= b13;
            o6 |= b13;
        }
        else {
            o22 |= b13;
            o23 |= b13;
            o14 |= b13;
            o6 |= b13;
        }

        if (rc.onTheMap(l19) && rc.canSenseLocation(l19)) {
            if (rc.senseCloud(l19)) {
                p19 = 1.5;
                b19 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l19).getCurrentDirection();
                if (targetLocation.equals(l19) || (rc.sensePassability(l19) && !rc.canSenseRobotAtLocation(l19) && currentDirection.equals(Direction.CENTER))) {
                    p19 = rc.senseMapInfo(l19).getCooldownMultiplier(team);
                    b19 = false;
                }
            }
            if (v19 > v28 + p19) {
                v19 = v28 + p19;
                d19 = d28;
            }
            if (v19 > v10 + p19) {
                v19 = v10 + p19;
                d19 = d10;
            }
            if (v19 > v18 + p19) {
                v19 = v18 + p19;
                d19 = d18;
            }
            if (v19 > v27 + p19) {
                v19 = v27 + p19;
                d19 = d27;
            }
            
            r19 |= r28;
            r19 |= r10;
            r19 |= r18;
            r19 |= r27;
            r19 &= !b19;
            o28 |= b19;
            o10 |= b19;
            o18 |= b19;
            o27 |= b19;
        }
        else {
            o28 |= b19;
            o10 |= b19;
            o18 |= b19;
            o27 |= b19;
        }

        if (rc.onTheMap(l10) && rc.canSenseLocation(l10)) {
            if (rc.senseCloud(l10)) {
                p10 = 1.5;
                b10 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l10).getCurrentDirection();
                if (targetLocation.equals(l10) || (rc.sensePassability(l10) && !rc.canSenseRobotAtLocation(l10) && currentDirection.equals(Direction.CENTER))) {
                    p10 = rc.senseMapInfo(l10).getCooldownMultiplier(team);
                    b10 = false;
                }
            }
            if (v10 > v18 + p10) {
                v10 = v18 + p10;
                d10 = d18;
            }
            if (v10 > v19 + p10) {
                v10 = v19 + p10;
                d10 = d19;
            }
            if (v10 > v9 + p10) {
                v10 = v9 + p10;
                d10 = d9;
            }
            if (v10 > v17 + p10) {
                v10 = v17 + p10;
                d10 = d17;
            }
            
            r10 |= r18;
            r10 |= r19;
            r10 |= r9;
            r10 |= r17;
            r10 &= !b10;
            o18 |= b10;
            o19 |= b10;
            o9 |= b10;
            o17 |= b10;
        }
        else {
            o18 |= b10;
            o19 |= b10;
            o9 |= b10;
            o17 |= b10;
        }

        if (rc.onTheMap(l6) && rc.canSenseLocation(l6)) {
            if (rc.senseCloud(l6)) {
                p6 = 1.5;
                b6 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l6).getCurrentDirection();
                if (targetLocation.equals(l6) || (rc.sensePassability(l6) && !rc.canSenseRobotAtLocation(l6) && currentDirection.equals(Direction.CENTER))) {
                    p6 = rc.senseMapInfo(l6).getCooldownMultiplier(team);
                    b6 = false;
                }
            }
            if (v6 > v14 + p6) {
                v6 = v14 + p6;
                d6 = d14;
            }
            if (v6 > v15 + p6) {
                v6 = v15 + p6;
                d6 = d15;
            }
            if (v6 > v7 + p6) {
                v6 = v7 + p6;
                d6 = d7;
            }
            if (v6 > v13 + p6) {
                v6 = v13 + p6;
                d6 = d13;
            }
            
            r6 |= r14;
            r6 |= r15;
            r6 |= r7;
            r6 |= r13;
            r6 &= !b6;
            o14 |= b6;
            o15 |= b6;
            o7 |= b6;
            o13 |= b6;
        }
        else {
            o14 |= b6;
            o15 |= b6;
            o7 |= b6;
            o13 |= b6;
        }

        if (rc.onTheMap(l11) && rc.canSenseLocation(l11)) {
            if (rc.senseCloud(l11)) {
                p11 = 1.5;
                b11 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l11).getCurrentDirection();
                if (targetLocation.equals(l11) || (rc.sensePassability(l11) && !rc.canSenseRobotAtLocation(l11) && currentDirection.equals(Direction.CENTER))) {
                    p11 = rc.senseMapInfo(l11).getCooldownMultiplier(team);
                    b11 = false;
                }
            }
            if (v11 > v19 + p11) {
                v11 = v19 + p11;
                d11 = d19;
            }
            if (v11 > v10 + p11) {
                v11 = v10 + p11;
                d11 = d10;
            }
            if (v11 > v18 + p11) {
                v11 = v18 + p11;
                d11 = d18;
            }
            
            r11 |= r19;
            r11 |= r10;
            r11 |= r18;
            r11 &= !b11;
            o19 |= b11;
            o10 |= b11;
            o18 |= b11;
        }
        else {
            o19 |= b11;
            o10 |= b11;
            o18 |= b11;
        }

        if (rc.onTheMap(l5) && rc.canSenseLocation(l5)) {
            if (rc.senseCloud(l5)) {
                p5 = 1.5;
                b5 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l5).getCurrentDirection();
                if (targetLocation.equals(l5) || (rc.sensePassability(l5) && !rc.canSenseRobotAtLocation(l5) && currentDirection.equals(Direction.CENTER))) {
                    p5 = rc.senseMapInfo(l5).getCooldownMultiplier(team);
                    b5 = false;
                }
            }
            if (v5 > v13 + p5) {
                v5 = v13 + p5;
                d5 = d13;
            }
            if (v5 > v14 + p5) {
                v5 = v14 + p5;
                d5 = d14;
            }
            if (v5 > v6 + p5) {
                v5 = v6 + p5;
                d5 = d6;
            }
            
            r5 |= r13;
            r5 |= r14;
            r5 |= r6;
            r5 &= !b5;
            o13 |= b5;
            o14 |= b5;
            o6 |= b5;
        }
        else {
            o13 |= b5;
            o14 |= b5;
            o6 |= b5;
        }

        if (rc.onTheMap(l30) && rc.canSenseLocation(l30)) {
            if (rc.senseCloud(l30)) {
                p30 = 1.5;
                b30 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l30).getCurrentDirection();
                if (targetLocation.equals(l30) || (rc.sensePassability(l30) && !rc.canSenseRobotAtLocation(l30) && currentDirection.equals(Direction.CENTER))) {
                    p30 = rc.senseMapInfo(l30).getCooldownMultiplier(team);
                    b30 = false;
                }
            }
            if (v30 > v31 + p30) {
                v30 = v31 + p30;
                d30 = d31;
            }
            if (v30 > v22 + p30) {
                v30 = v22 + p30;
                d30 = d22;
            }
            
            r30 |= r31;
            r30 |= r22;
            r30 &= !b30;
            o31 |= b30;
            o22 |= b30;
        }
        else {
            o31 |= b30;
            o22 |= b30;
        }

        if (rc.onTheMap(l38) && rc.canSenseLocation(l38)) {
            if (rc.senseCloud(l38)) {
                p38 = 1.5;
                b38 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l38).getCurrentDirection();
                if (targetLocation.equals(l38) || (rc.sensePassability(l38) && !rc.canSenseRobotAtLocation(l38) && currentDirection.equals(Direction.CENTER))) {
                    p38 = rc.senseMapInfo(l38).getCooldownMultiplier(team);
                    b38 = false;
                }
            }
            if (v38 > v28 + p38) {
                v38 = v28 + p38;
                d38 = d28;
            }
            if (v38 > v37 + p38) {
                v38 = v37 + p38;
                d38 = d37;
            }
            
            r38 |= r28;
            r38 |= r37;
            r38 &= !b38;
            o28 |= b38;
            o37 |= b38;
        }
        else {
            o28 |= b38;
            o37 |= b38;
        }

        if (rc.onTheMap(l2) && rc.canSenseLocation(l2)) {
            if (rc.senseCloud(l2)) {
                p2 = 1.5;
                b2 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l2).getCurrentDirection();
                if (targetLocation.equals(l2) || (rc.sensePassability(l2) && !rc.canSenseRobotAtLocation(l2) && currentDirection.equals(Direction.CENTER))) {
                    p2 = rc.senseMapInfo(l2).getCooldownMultiplier(team);
                    b2 = false;
                }
            }
            if (v2 > v8 + p2) {
                v2 = v8 + p2;
                d2 = d8;
            }
            if (v2 > v9 + p2) {
                v2 = v9 + p2;
                d2 = d9;
            }
            if (v2 > v7 + p2) {
                v2 = v7 + p2;
                d2 = d7;
            }
            
            r2 |= r8;
            r2 |= r9;
            r2 |= r7;
            r2 &= !b2;
            o8 |= b2;
            o9 |= b2;
            o7 |= b2;
        }
        else {
            o8 |= b2;
            o9 |= b2;
            o7 |= b2;
        }

        if (rc.onTheMap(l21) && rc.canSenseLocation(l21)) {
            if (rc.senseCloud(l21)) {
                p21 = 1.5;
                b21 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l21).getCurrentDirection();
                if (targetLocation.equals(l21) || (rc.sensePassability(l21) && !rc.canSenseRobotAtLocation(l21) && currentDirection.equals(Direction.CENTER))) {
                    p21 = rc.senseMapInfo(l21).getCooldownMultiplier(team);
                    b21 = false;
                }
            }
            if (v21 > v30 + p21) {
                v21 = v30 + p21;
                d21 = d30;
            }
            if (v21 > v31 + p21) {
                v21 = v31 + p21;
                d21 = d31;
            }
            if (v21 > v22 + p21) {
                v21 = v22 + p21;
                d21 = d22;
            }
            if (v21 > v13 + p21) {
                v21 = v13 + p21;
                d21 = d13;
            }
            
            r21 |= r30;
            r21 |= r31;
            r21 |= r22;
            r21 |= r13;
            r21 &= !b21;
            o30 |= b21;
            o31 |= b21;
            o22 |= b21;
            o13 |= b21;
        }
        else {
            o30 |= b21;
            o31 |= b21;
            o22 |= b21;
            o13 |= b21;
        }

        if (rc.onTheMap(l3) && rc.canSenseLocation(l3)) {
            if (rc.senseCloud(l3)) {
                p3 = 1.5;
                b3 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l3).getCurrentDirection();
                if (targetLocation.equals(l3) || (rc.sensePassability(l3) && !rc.canSenseRobotAtLocation(l3) && currentDirection.equals(Direction.CENTER))) {
                    p3 = rc.senseMapInfo(l3).getCooldownMultiplier(team);
                    b3 = false;
                }
            }
            if (v3 > v9 + p3) {
                v3 = v9 + p3;
                d3 = d9;
            }
            if (v3 > v10 + p3) {
                v3 = v10 + p3;
                d3 = d10;
            }
            if (v3 > v2 + p3) {
                v3 = v2 + p3;
                d3 = d2;
            }
            if (v3 > v8 + p3) {
                v3 = v8 + p3;
                d3 = d8;
            }
            
            r3 |= r9;
            r3 |= r10;
            r3 |= r2;
            r3 |= r8;
            r3 &= !b3;
            o9 |= b3;
            o10 |= b3;
            o2 |= b3;
            o8 |= b3;
        }
        else {
            o9 |= b3;
            o10 |= b3;
            o2 |= b3;
            o8 |= b3;
        }

        if (rc.onTheMap(l1) && rc.canSenseLocation(l1)) {
            if (rc.senseCloud(l1)) {
                p1 = 1.5;
                b1 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l1).getCurrentDirection();
                if (targetLocation.equals(l1) || (rc.sensePassability(l1) && !rc.canSenseRobotAtLocation(l1) && currentDirection.equals(Direction.CENTER))) {
                    p1 = rc.senseMapInfo(l1).getCooldownMultiplier(team);
                    b1 = false;
                }
            }
            if (v1 > v7 + p1) {
                v1 = v7 + p1;
                d1 = d7;
            }
            if (v1 > v8 + p1) {
                v1 = v8 + p1;
                d1 = d8;
            }
            if (v1 > v2 + p1) {
                v1 = v2 + p1;
                d1 = d2;
            }
            if (v1 > v6 + p1) {
                v1 = v6 + p1;
                d1 = d6;
            }
            
            r1 |= r7;
            r1 |= r8;
            r1 |= r2;
            r1 |= r6;
            r1 &= !b1;
            o7 |= b1;
            o8 |= b1;
            o2 |= b1;
            o6 |= b1;
        }
        else {
            o7 |= b1;
            o8 |= b1;
            o2 |= b1;
            o6 |= b1;
        }

        if (rc.onTheMap(l29) && rc.canSenseLocation(l29)) {
            if (rc.senseCloud(l29)) {
                p29 = 1.5;
                b29 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l29).getCurrentDirection();
                if (targetLocation.equals(l29) || (rc.sensePassability(l29) && !rc.canSenseRobotAtLocation(l29) && currentDirection.equals(Direction.CENTER))) {
                    p29 = rc.senseMapInfo(l29).getCooldownMultiplier(team);
                    b29 = false;
                }
            }
            if (v29 > v38 + p29) {
                v29 = v38 + p29;
                d29 = d38;
            }
            if (v29 > v19 + p29) {
                v29 = v19 + p29;
                d29 = d19;
            }
            if (v29 > v28 + p29) {
                v29 = v28 + p29;
                d29 = d28;
            }
            if (v29 > v37 + p29) {
                v29 = v37 + p29;
                d29 = d37;
            }
            
            r29 |= r38;
            r29 |= r19;
            r29 |= r28;
            r29 |= r37;
            r29 &= !b29;
            o38 |= b29;
            o19 |= b29;
            o28 |= b29;
            o37 |= b29;
        }
        else {
            o38 |= b29;
            o19 |= b29;
            o28 |= b29;
            o37 |= b29;
        }

        if (rc.onTheMap(l20) && rc.canSenseLocation(l20)) {
            if (rc.senseCloud(l20)) {
                p20 = 1.5;
                b20 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l20).getCurrentDirection();
                if (targetLocation.equals(l20) || (rc.sensePassability(l20) && !rc.canSenseRobotAtLocation(l20) && currentDirection.equals(Direction.CENTER))) {
                    p20 = rc.senseMapInfo(l20).getCooldownMultiplier(team);
                    b20 = false;
                }
            }
            if (v20 > v29 + p20) {
                v20 = v29 + p20;
                d20 = d29;
            }
            if (v20 > v11 + p20) {
                v20 = v11 + p20;
                d20 = d11;
            }
            if (v20 > v19 + p20) {
                v20 = v19 + p20;
                d20 = d19;
            }
            if (v20 > v28 + p20) {
                v20 = v28 + p20;
                d20 = d28;
            }
            
            r20 |= r29;
            r20 |= r11;
            r20 |= r19;
            r20 |= r28;
            r20 &= !b20;
            o29 |= b20;
            o11 |= b20;
            o19 |= b20;
            o28 |= b20;
        }
        else {
            o29 |= b20;
            o11 |= b20;
            o19 |= b20;
            o28 |= b20;
        }

        if (rc.onTheMap(l12) && rc.canSenseLocation(l12)) {
            if (rc.senseCloud(l12)) {
                p12 = 1.5;
                b12 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l12).getCurrentDirection();
                if (targetLocation.equals(l12) || (rc.sensePassability(l12) && !rc.canSenseRobotAtLocation(l12) && currentDirection.equals(Direction.CENTER))) {
                    p12 = rc.senseMapInfo(l12).getCooldownMultiplier(team);
                    b12 = false;
                }
            }
            if (v12 > v21 + p12) {
                v12 = v21 + p12;
                d12 = d21;
            }
            if (v12 > v22 + p12) {
                v12 = v22 + p12;
                d12 = d22;
            }
            if (v12 > v13 + p12) {
                v12 = v13 + p12;
                d12 = d13;
            }
            if (v12 > v5 + p12) {
                v12 = v5 + p12;
                d12 = d5;
            }
            
            r12 |= r21;
            r12 |= r22;
            r12 |= r13;
            r12 |= r5;
            r12 &= !b12;
            o21 |= b12;
            o22 |= b12;
            o13 |= b12;
            o5 |= b12;
        }
        else {
            o21 |= b12;
            o22 |= b12;
            o13 |= b12;
            o5 |= b12;
        }

        if (rc.onTheMap(l4) && rc.canSenseLocation(l4)) {
            if (rc.senseCloud(l4)) {
                p4 = 1.5;
                b4 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l4).getCurrentDirection();
                if (targetLocation.equals(l4) || (rc.sensePassability(l4) && !rc.canSenseRobotAtLocation(l4) && currentDirection.equals(Direction.CENTER))) {
                    p4 = rc.senseMapInfo(l4).getCooldownMultiplier(team);
                    b4 = false;
                }
            }
            if (v4 > v10 + p4) {
                v4 = v10 + p4;
                d4 = d10;
            }
            if (v4 > v11 + p4) {
                v4 = v11 + p4;
                d4 = d11;
            }
            if (v4 > v3 + p4) {
                v4 = v3 + p4;
                d4 = d3;
            }
            if (v4 > v9 + p4) {
                v4 = v9 + p4;
                d4 = d9;
            }
            
            r4 |= r10;
            r4 |= r11;
            r4 |= r3;
            r4 |= r9;
            r4 &= !b4;
            o10 |= b4;
            o11 |= b4;
            o3 |= b4;
            o9 |= b4;
        }
        else {
            o10 |= b4;
            o11 |= b4;
            o3 |= b4;
            o9 |= b4;
        }

        if (rc.onTheMap(l0) && rc.canSenseLocation(l0)) {
            if (rc.senseCloud(l0)) {
                p0 = 1.5;
                b0 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l0).getCurrentDirection();
                if (targetLocation.equals(l0) || (rc.sensePassability(l0) && !rc.canSenseRobotAtLocation(l0) && currentDirection.equals(Direction.CENTER))) {
                    p0 = rc.senseMapInfo(l0).getCooldownMultiplier(team);
                    b0 = false;
                }
            }
            if (v0 > v6 + p0) {
                v0 = v6 + p0;
                d0 = d6;
            }
            if (v0 > v7 + p0) {
                v0 = v7 + p0;
                d0 = d7;
            }
            if (v0 > v1 + p0) {
                v0 = v1 + p0;
                d0 = d1;
            }
            if (v0 > v5 + p0) {
                v0 = v5 + p0;
                d0 = d5;
            }
            
            r0 |= r6;
            r0 |= r7;
            r0 |= r1;
            r0 |= r5;
            r0 &= !b0;
            o6 |= b0;
            o7 |= b0;
            o1 |= b0;
            o5 |= b0;
        }
        else {
            o6 |= b0;
            o7 |= b0;
            o1 |= b0;
            o5 |= b0;
        }

        int dx = targetLocation.x - l34.x;
        int dy = targetLocation.y - l34.y;

        switch(dx) {
            case -4:
                switch(dy) {
                    case -2:
                        if (v0 < 10000) {
                            return d0;
                        }
                    case -1:
                        if (v1 < 10000) {
                            return d1;
                        }
                    case 0:
                        if (v2 < 10000) {
                            return d2;
                        }
                    case 1:
                        if (v3 < 10000) {
                            return d3;
                        }
                    case 2:
                        if (v4 < 10000) {
                            return d4;
                        }
                } break;

            case -3:
                switch(dy) {
                    case -3:
                        if (v5 < 10000) {
                            return d5;
                        }
                    case -2:
                        if (v6 < 10000) {
                            return d6;
                        }
                    case -1:
                        if (v7 < 10000) {
                            return d7;
                        }
                    case 0:
                        if (v8 < 10000) {
                            return d8;
                        }
                    case 1:
                        if (v9 < 10000) {
                            return d9;
                        }
                    case 2:
                        if (v10 < 10000) {
                            return d10;
                        }
                    case 3:
                        if (v11 < 10000) {
                            return d11;
                        }
                } break;

            case -2:
                switch(dy) {
                    case -4:
                        if (v12 < 10000) {
                            return d12;
                        }
                    case -3:
                        if (v13 < 10000) {
                            return d13;
                        }
                    case -2:
                        if (v14 < 10000) {
                            return d14;
                        }
                    case -1:
                        if (v15 < 10000) {
                            return d15;
                        }
                    case 0:
                        if (v16 < 10000) {
                            return d16;
                        }
                    case 1:
                        if (v17 < 10000) {
                            return d17;
                        }
                    case 2:
                        if (v18 < 10000) {
                            return d18;
                        }
                    case 3:
                        if (v19 < 10000) {
                            return d19;
                        }
                    case 4:
                        if (v20 < 10000) {
                            return d20;
                        }
                } break;

            case -1:
                switch(dy) {
                    case -4:
                        if (v21 < 10000) {
                            return d21;
                        }
                    case -3:
                        if (v22 < 10000) {
                            return d22;
                        }
                    case -2:
                        if (v23 < 10000) {
                            return d23;
                        }
                    case -1:
                        if (v24 < 10000) {
                            return d24;
                        }
                    case 0:
                        if (v25 < 10000) {
                            return d25;
                        }
                    case 1:
                        if (v26 < 10000) {
                            return d26;
                        }
                    case 2:
                        if (v27 < 10000) {
                            return d27;
                        }
                    case 3:
                        if (v28 < 10000) {
                            return d28;
                        }
                    case 4:
                        if (v29 < 10000) {
                            return d29;
                        }
                } break;

            case 0:
                switch(dy) {
                    case -4:
                        if (v30 < 10000) {
                            return d30;
                        }
                    case -3:
                        if (v31 < 10000) {
                            return d31;
                        }
                    case -2:
                        if (v32 < 10000) {
                            return d32;
                        }
                    case -1:
                        if (v33 < 10000) {
                            return d33;
                        }
                    case 0:
                        if (v34 < 10000) {
                            return d34;
                        }
                    case 1:
                        if (v35 < 10000) {
                            return d35;
                        }
                    case 2:
                        if (v36 < 10000) {
                            return d36;
                        }
                    case 3:
                        if (v37 < 10000) {
                            return d37;
                        }
                    case 4:
                        if (v38 < 10000) {
                            return d38;
                        }
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
    
        o0 = r0;
        o1 = r1;
        o2 = r2;
        o3 = r3;
        o4 = r4;
        o5 = r5;
        o11 = r11;
        o12 = r12;
        o20 = r20;
        o21 = r21;
        o29 = r29;
        o30 = r30;
        o38 = r38;
        Direction ans = Direction.CENTER;

        if (r0 && o0) {
            double dist0 = v0 + 1.5 * Math.sqrt(l0.distanceSquaredTo(targetLocation));
            if (dist0 < localBest) {
                localBest = dist0;
                ans = d0;
                best = l0;
            }
        }

        if (r1 && o1) {
            double dist1 = v1 + 1.5 * Math.sqrt(l1.distanceSquaredTo(targetLocation));
            if (dist1 < localBest) {
                localBest = dist1;
                ans = d1;
                best = l1;
            }
        }

        if (r2 && o2) {
            double dist2 = v2 + 1.5 * Math.sqrt(l2.distanceSquaredTo(targetLocation));
            if (dist2 < localBest) {
                localBest = dist2;
                ans = d2;
                best = l2;
            }
        }

        if (r3 && o3) {
            double dist3 = v3 + 1.5 * Math.sqrt(l3.distanceSquaredTo(targetLocation));
            if (dist3 < localBest) {
                localBest = dist3;
                ans = d3;
                best = l3;
            }
        }

        if (r4 && o4) {
            double dist4 = v4 + 1.5 * Math.sqrt(l4.distanceSquaredTo(targetLocation));
            if (dist4 < localBest) {
                localBest = dist4;
                ans = d4;
                best = l4;
            }
        }

        if (r5 && o5) {
            double dist5 = v5 + 1.5 * Math.sqrt(l5.distanceSquaredTo(targetLocation));
            if (dist5 < localBest) {
                localBest = dist5;
                ans = d5;
                best = l5;
            }
        }

        if (r11 && o11) {
            double dist11 = v11 + 1.5 * Math.sqrt(l11.distanceSquaredTo(targetLocation));
            if (dist11 < localBest) {
                localBest = dist11;
                ans = d11;
                best = l11;
            }
        }

        if (r12 && o12) {
            double dist12 = v12 + 1.5 * Math.sqrt(l12.distanceSquaredTo(targetLocation));
            if (dist12 < localBest) {
                localBest = dist12;
                ans = d12;
                best = l12;
            }
        }

        if (r20 && o20) {
            double dist20 = v20 + 1.5 * Math.sqrt(l20.distanceSquaredTo(targetLocation));
            if (dist20 < localBest) {
                localBest = dist20;
                ans = d20;
                best = l20;
            }
        }

        if (r21 && o21) {
            double dist21 = v21 + 1.5 * Math.sqrt(l21.distanceSquaredTo(targetLocation));
            if (dist21 < localBest) {
                localBest = dist21;
                ans = d21;
                best = l21;
            }
        }

        if (r29 && o29) {
            double dist29 = v29 + 1.5 * Math.sqrt(l29.distanceSquaredTo(targetLocation));
            if (dist29 < localBest) {
                localBest = dist29;
                ans = d29;
                best = l29;
            }
        }

        if (r30 && o30) {
            double dist30 = v30 + 1.5 * Math.sqrt(l30.distanceSquaredTo(targetLocation));
            if (dist30 < localBest) {
                localBest = dist30;
                ans = d30;
                best = l30;
            }
        }

        if (r38 && o38) {
            double dist38 = v38 + 1.5 * Math.sqrt(l38.distanceSquaredTo(targetLocation));
            if (dist38 < localBest) {
                localBest = dist38;
                ans = d38;
                best = l38;
            }
        }

        draws6();
        rc.setIndicatorDot(best, 0, 0, 255);
        if (localBest < globalBest) {
            globalBest = localBest;
            return ans;
        }
        return getBestDirectionWallFollow6(ans);
    }

    private Direction getBestDirectionWallFollow6(Direction prev) throws GameActionException {
        Direction ans = Direction.CENTER;
        int minDistance = closestWallLocations.isEmpty() ? 1000000 : currentLocation.distanceSquaredTo(closestWallLocations.get(0));
    
        if (b0) {
            int distance = currentLocation.distanceSquaredTo(l0);
            if (distance == minDistance) {
                closestWallLocations.add(l0);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l0);
                minDistance = distance;
            }
        }

        if (b1) {
            int distance = currentLocation.distanceSquaredTo(l1);
            if (distance == minDistance) {
                closestWallLocations.add(l1);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l1);
                minDistance = distance;
            }
        }

        if (b2) {
            int distance = currentLocation.distanceSquaredTo(l2);
            if (distance == minDistance) {
                closestWallLocations.add(l2);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l2);
                minDistance = distance;
            }
        }

        if (b3) {
            int distance = currentLocation.distanceSquaredTo(l3);
            if (distance == minDistance) {
                closestWallLocations.add(l3);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l3);
                minDistance = distance;
            }
        }

        if (b4) {
            int distance = currentLocation.distanceSquaredTo(l4);
            if (distance == minDistance) {
                closestWallLocations.add(l4);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l4);
                minDistance = distance;
            }
        }

        if (b5) {
            int distance = currentLocation.distanceSquaredTo(l5);
            if (distance == minDistance) {
                closestWallLocations.add(l5);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l5);
                minDistance = distance;
            }
        }

        if (b6) {
            int distance = currentLocation.distanceSquaredTo(l6);
            if (distance == minDistance) {
                closestWallLocations.add(l6);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l6);
                minDistance = distance;
            }
        }

        if (b7) {
            int distance = currentLocation.distanceSquaredTo(l7);
            if (distance == minDistance) {
                closestWallLocations.add(l7);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l7);
                minDistance = distance;
            }
        }

        if (b8) {
            int distance = currentLocation.distanceSquaredTo(l8);
            if (distance == minDistance) {
                closestWallLocations.add(l8);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l8);
                minDistance = distance;
            }
        }

        if (b9) {
            int distance = currentLocation.distanceSquaredTo(l9);
            if (distance == minDistance) {
                closestWallLocations.add(l9);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l9);
                minDistance = distance;
            }
        }

        if (b10) {
            int distance = currentLocation.distanceSquaredTo(l10);
            if (distance == minDistance) {
                closestWallLocations.add(l10);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l10);
                minDistance = distance;
            }
        }

        if (b11) {
            int distance = currentLocation.distanceSquaredTo(l11);
            if (distance == minDistance) {
                closestWallLocations.add(l11);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l11);
                minDistance = distance;
            }
        }

        if (b12) {
            int distance = currentLocation.distanceSquaredTo(l12);
            if (distance == minDistance) {
                closestWallLocations.add(l12);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l12);
                minDistance = distance;
            }
        }

        if (b13) {
            int distance = currentLocation.distanceSquaredTo(l13);
            if (distance == minDistance) {
                closestWallLocations.add(l13);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l13);
                minDistance = distance;
            }
        }

        if (b14) {
            int distance = currentLocation.distanceSquaredTo(l14);
            if (distance == minDistance) {
                closestWallLocations.add(l14);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l14);
                minDistance = distance;
            }
        }

        if (b15) {
            int distance = currentLocation.distanceSquaredTo(l15);
            if (distance == minDistance) {
                closestWallLocations.add(l15);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l15);
                minDistance = distance;
            }
        }

        if (b16) {
            int distance = currentLocation.distanceSquaredTo(l16);
            if (distance == minDistance) {
                closestWallLocations.add(l16);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l16);
                minDistance = distance;
            }
        }

        if (b17) {
            int distance = currentLocation.distanceSquaredTo(l17);
            if (distance == minDistance) {
                closestWallLocations.add(l17);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l17);
                minDistance = distance;
            }
        }

        if (b18) {
            int distance = currentLocation.distanceSquaredTo(l18);
            if (distance == minDistance) {
                closestWallLocations.add(l18);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l18);
                minDistance = distance;
            }
        }

        if (b19) {
            int distance = currentLocation.distanceSquaredTo(l19);
            if (distance == minDistance) {
                closestWallLocations.add(l19);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l19);
                minDistance = distance;
            }
        }

        if (b20) {
            int distance = currentLocation.distanceSquaredTo(l20);
            if (distance == minDistance) {
                closestWallLocations.add(l20);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l20);
                minDistance = distance;
            }
        }

        if (b21) {
            int distance = currentLocation.distanceSquaredTo(l21);
            if (distance == minDistance) {
                closestWallLocations.add(l21);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l21);
                minDistance = distance;
            }
        }

        if (b22) {
            int distance = currentLocation.distanceSquaredTo(l22);
            if (distance == minDistance) {
                closestWallLocations.add(l22);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l22);
                minDistance = distance;
            }
        }

        if (b23) {
            int distance = currentLocation.distanceSquaredTo(l23);
            if (distance == minDistance) {
                closestWallLocations.add(l23);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l23);
                minDistance = distance;
            }
        }

        if (b24) {
            int distance = currentLocation.distanceSquaredTo(l24);
            if (distance == minDistance) {
                closestWallLocations.add(l24);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l24);
                minDistance = distance;
            }
        }

        if (b25) {
            int distance = currentLocation.distanceSquaredTo(l25);
            if (distance == minDistance) {
                closestWallLocations.add(l25);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l25);
                minDistance = distance;
            }
        }

        if (b26) {
            int distance = currentLocation.distanceSquaredTo(l26);
            if (distance == minDistance) {
                closestWallLocations.add(l26);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l26);
                minDistance = distance;
            }
        }

        if (b27) {
            int distance = currentLocation.distanceSquaredTo(l27);
            if (distance == minDistance) {
                closestWallLocations.add(l27);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l27);
                minDistance = distance;
            }
        }

        if (b28) {
            int distance = currentLocation.distanceSquaredTo(l28);
            if (distance == minDistance) {
                closestWallLocations.add(l28);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l28);
                minDistance = distance;
            }
        }

        if (b29) {
            int distance = currentLocation.distanceSquaredTo(l29);
            if (distance == minDistance) {
                closestWallLocations.add(l29);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l29);
                minDistance = distance;
            }
        }

        if (b30) {
            int distance = currentLocation.distanceSquaredTo(l30);
            if (distance == minDistance) {
                closestWallLocations.add(l30);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l30);
                minDistance = distance;
            }
        }

        if (b31) {
            int distance = currentLocation.distanceSquaredTo(l31);
            if (distance == minDistance) {
                closestWallLocations.add(l31);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l31);
                minDistance = distance;
            }
        }

        if (b32) {
            int distance = currentLocation.distanceSquaredTo(l32);
            if (distance == minDistance) {
                closestWallLocations.add(l32);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l32);
                minDistance = distance;
            }
        }

        if (b33) {
            int distance = currentLocation.distanceSquaredTo(l33);
            if (distance == minDistance) {
                closestWallLocations.add(l33);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l33);
                minDistance = distance;
            }
        }

        if (b35) {
            int distance = currentLocation.distanceSquaredTo(l35);
            if (distance == minDistance) {
                closestWallLocations.add(l35);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l35);
                minDistance = distance;
            }
        }

        if (b36) {
            int distance = currentLocation.distanceSquaredTo(l36);
            if (distance == minDistance) {
                closestWallLocations.add(l36);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l36);
                minDistance = distance;
            }
        }

        if (b37) {
            int distance = currentLocation.distanceSquaredTo(l37);
            if (distance == minDistance) {
                closestWallLocations.add(l37);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l37);
                minDistance = distance;
            }
        }

        if (b38) {
            int distance = currentLocation.distanceSquaredTo(l38);
            if (distance == minDistance) {
                closestWallLocations.add(l38);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l38);
                minDistance = distance;
            }
        }

        if (minDistance > 2) { return prev; }
        int maxDot = -999999;
        minDistance = 1000000;
        for (MapLocation closestWallLocation : closestWallLocations) {
            Direction vertical = currentLocation.directionTo(closestWallLocation);

            Direction tangent1 = vertical.rotateLeft().rotateLeft();
            Direction tangent2 = vertical.rotateRight().rotateRight();

            int dx = lastDirection.getDeltaX();
            int dy = lastDirection.getDeltaY();

            int dot1 = tangent1.getDeltaX() * dx + tangent1.getDeltaY() * dy;
            int dot2 = tangent2.getDeltaX() * dx + tangent2.getDeltaY() * dy;

            int distance1 = currentLocation.add(tangent1).distanceSquaredTo(targetLocation);
            int distance2 = currentLocation.add(tangent2).distanceSquaredTo(targetLocation);

            if (!rc.canMove(tangent1)) {
                dot1 = -1000000;
            }

            if (!rc.canMove(tangent2)) {
                dot2 = -1000000;
            }

            if (dot1 > maxDot) {
                maxDot = dot1;
                minDistance = distance1;
                ans = tangent1;
            }

            if (dot2 > maxDot) {
                maxDot = dot2;
                minDistance = distance2;
                ans = tangent2;
            }

            if (dot1 == maxDot && distance1 < minDistance) {
                maxDot = dot1;
                minDistance = distance1;
                ans = tangent1;
            }

            if (dot2 == maxDot && distance2 < minDistance) {
                maxDot = dot2;
                minDistance = distance2;
                ans = tangent2;
            }
        }
        draws6();
        for (MapLocation closestWallLocation : closestWallLocations) {
            rc.setIndicatorDot(closestWallLocation, 255, 0, 0);
        }
        return ans;
    }

    private void draws6() throws GameActionException {
    
        rc.setIndicatorDot(l0, 255, 0, 255);
        if (b0) {
            rc.setIndicatorDot(l0, 255, 255, 255);
        }

        rc.setIndicatorDot(l1, 255, 0, 255);
        if (b1) {
            rc.setIndicatorDot(l1, 255, 255, 255);
        }

        rc.setIndicatorDot(l2, 255, 0, 255);
        if (b2) {
            rc.setIndicatorDot(l2, 255, 255, 255);
        }

        rc.setIndicatorDot(l3, 255, 0, 255);
        if (b3) {
            rc.setIndicatorDot(l3, 255, 255, 255);
        }

        rc.setIndicatorDot(l4, 255, 0, 255);
        if (b4) {
            rc.setIndicatorDot(l4, 255, 255, 255);
        }

        rc.setIndicatorDot(l5, 255, 0, 255);
        if (b5) {
            rc.setIndicatorDot(l5, 255, 255, 255);
        }

        rc.setIndicatorDot(l6, 255, 0, 255);
        if (b6) {
            rc.setIndicatorDot(l6, 255, 255, 255);
        }

        rc.setIndicatorDot(l7, 255, 0, 255);
        if (b7) {
            rc.setIndicatorDot(l7, 255, 255, 255);
        }

        rc.setIndicatorDot(l8, 255, 0, 255);
        if (b8) {
            rc.setIndicatorDot(l8, 255, 255, 255);
        }

        rc.setIndicatorDot(l9, 255, 0, 255);
        if (b9) {
            rc.setIndicatorDot(l9, 255, 255, 255);
        }

        rc.setIndicatorDot(l10, 255, 0, 255);
        if (b10) {
            rc.setIndicatorDot(l10, 255, 255, 255);
        }

        rc.setIndicatorDot(l11, 255, 0, 255);
        if (b11) {
            rc.setIndicatorDot(l11, 255, 255, 255);
        }

        rc.setIndicatorDot(l12, 255, 0, 255);
        if (b12) {
            rc.setIndicatorDot(l12, 255, 255, 255);
        }

        rc.setIndicatorDot(l13, 255, 0, 255);
        if (b13) {
            rc.setIndicatorDot(l13, 255, 255, 255);
        }

        rc.setIndicatorDot(l14, 255, 0, 255);
        if (b14) {
            rc.setIndicatorDot(l14, 255, 255, 255);
        }

        rc.setIndicatorDot(l15, 255, 0, 255);
        if (b15) {
            rc.setIndicatorDot(l15, 255, 255, 255);
        }

        rc.setIndicatorDot(l16, 255, 0, 255);
        if (b16) {
            rc.setIndicatorDot(l16, 255, 255, 255);
        }

        rc.setIndicatorDot(l17, 255, 0, 255);
        if (b17) {
            rc.setIndicatorDot(l17, 255, 255, 255);
        }

        rc.setIndicatorDot(l18, 255, 0, 255);
        if (b18) {
            rc.setIndicatorDot(l18, 255, 255, 255);
        }

        rc.setIndicatorDot(l19, 255, 0, 255);
        if (b19) {
            rc.setIndicatorDot(l19, 255, 255, 255);
        }

        rc.setIndicatorDot(l20, 255, 0, 255);
        if (b20) {
            rc.setIndicatorDot(l20, 255, 255, 255);
        }

        rc.setIndicatorDot(l21, 255, 0, 255);
        if (b21) {
            rc.setIndicatorDot(l21, 255, 255, 255);
        }

        rc.setIndicatorDot(l22, 255, 0, 255);
        if (b22) {
            rc.setIndicatorDot(l22, 255, 255, 255);
        }

        rc.setIndicatorDot(l23, 255, 0, 255);
        if (b23) {
            rc.setIndicatorDot(l23, 255, 255, 255);
        }

        rc.setIndicatorDot(l24, 255, 0, 255);
        if (b24) {
            rc.setIndicatorDot(l24, 255, 255, 255);
        }

        rc.setIndicatorDot(l25, 255, 0, 255);
        if (b25) {
            rc.setIndicatorDot(l25, 255, 255, 255);
        }

        rc.setIndicatorDot(l26, 255, 0, 255);
        if (b26) {
            rc.setIndicatorDot(l26, 255, 255, 255);
        }

        rc.setIndicatorDot(l27, 255, 0, 255);
        if (b27) {
            rc.setIndicatorDot(l27, 255, 255, 255);
        }

        rc.setIndicatorDot(l28, 255, 0, 255);
        if (b28) {
            rc.setIndicatorDot(l28, 255, 255, 255);
        }

        rc.setIndicatorDot(l29, 255, 0, 255);
        if (b29) {
            rc.setIndicatorDot(l29, 255, 255, 255);
        }

        rc.setIndicatorDot(l30, 255, 0, 255);
        if (b30) {
            rc.setIndicatorDot(l30, 255, 255, 255);
        }

        rc.setIndicatorDot(l31, 255, 0, 255);
        if (b31) {
            rc.setIndicatorDot(l31, 255, 255, 255);
        }

        rc.setIndicatorDot(l32, 255, 0, 255);
        if (b32) {
            rc.setIndicatorDot(l32, 255, 255, 255);
        }

        rc.setIndicatorDot(l33, 255, 0, 255);
        if (b33) {
            rc.setIndicatorDot(l33, 255, 255, 255);
        }

        rc.setIndicatorDot(l35, 255, 0, 255);
        if (b35) {
            rc.setIndicatorDot(l35, 255, 255, 255);
        }

        rc.setIndicatorDot(l36, 255, 0, 255);
        if (b36) {
            rc.setIndicatorDot(l36, 255, 255, 255);
        }

        rc.setIndicatorDot(l37, 255, 0, 255);
        if (b37) {
            rc.setIndicatorDot(l37, 255, 255, 255);
        }

        rc.setIndicatorDot(l38, 255, 0, 255);
        if (b38) {
            rc.setIndicatorDot(l38, 255, 255, 255);
        }

    }

    private Direction getBestDirection7() throws GameActionException {
        MapLocation best = currentLocation;
        double localBest = 1000000.0;
        l34 = currentLocation;
        v34 = 0;
        d34 = Direction.CENTER;
        r34 = true;
        l44 = l34.add(Direction.NORTHEAST);
        v44 = 1000000;
        p44 = 1000000;
        d44 = null;
        b44 = true;
        r44 = false;
        o44 = false;
        l35 = l34.add(Direction.NORTH);
        v35 = 1000000;
        p35 = 1000000;
        d35 = null;
        b35 = true;
        r35 = false;
        o35 = false;
        l26 = l34.add(Direction.NORTHWEST);
        v26 = 1000000;
        p26 = 1000000;
        d26 = null;
        b26 = true;
        r26 = false;
        o26 = false;
        l25 = l34.add(Direction.WEST);
        v25 = 1000000;
        p25 = 1000000;
        d25 = null;
        b25 = true;
        r25 = false;
        o25 = false;
        l24 = l34.add(Direction.SOUTHWEST);
        v24 = 1000000;
        p24 = 1000000;
        d24 = null;
        b24 = true;
        r24 = false;
        o24 = false;
        l17 = l25.add(Direction.NORTHWEST);
        v17 = 1000000;
        p17 = 1000000;
        d17 = null;
        b17 = true;
        r17 = false;
        o17 = false;
        l16 = l25.add(Direction.WEST);
        v16 = 1000000;
        p16 = 1000000;
        d16 = null;
        b16 = true;
        r16 = false;
        o16 = false;
        l15 = l25.add(Direction.SOUTHWEST);
        v15 = 1000000;
        p15 = 1000000;
        d15 = null;
        b15 = true;
        r15 = false;
        o15 = false;
        l45 = l35.add(Direction.NORTHEAST);
        v45 = 1000000;
        p45 = 1000000;
        d45 = null;
        b45 = true;
        r45 = false;
        o45 = false;
        l36 = l35.add(Direction.NORTH);
        v36 = 1000000;
        p36 = 1000000;
        d36 = null;
        b36 = true;
        r36 = false;
        o36 = false;
        l27 = l35.add(Direction.NORTHWEST);
        v27 = 1000000;
        p27 = 1000000;
        d27 = null;
        b27 = true;
        r27 = false;
        o27 = false;
        l14 = l24.add(Direction.SOUTHWEST);
        v14 = 1000000;
        p14 = 1000000;
        d14 = null;
        b14 = true;
        r14 = false;
        o14 = false;
        l54 = l44.add(Direction.NORTHEAST);
        v54 = 1000000;
        p54 = 1000000;
        d54 = null;
        b54 = true;
        r54 = false;
        o54 = false;
        l18 = l26.add(Direction.NORTHWEST);
        v18 = 1000000;
        p18 = 1000000;
        d18 = null;
        b18 = true;
        r18 = false;
        o18 = false;
        l46 = l36.add(Direction.NORTHEAST);
        v46 = 1000000;
        p46 = 1000000;
        d46 = null;
        b46 = true;
        r46 = false;
        o46 = false;
        l37 = l36.add(Direction.NORTH);
        v37 = 1000000;
        p37 = 1000000;
        d37 = null;
        b37 = true;
        r37 = false;
        o37 = false;
        l28 = l36.add(Direction.NORTHWEST);
        v28 = 1000000;
        p28 = 1000000;
        d28 = null;
        b28 = true;
        r28 = false;
        o28 = false;
        l9 = l16.add(Direction.NORTHWEST);
        v9 = 1000000;
        p9 = 1000000;
        d9 = null;
        b9 = true;
        r9 = false;
        o9 = false;
        l8 = l16.add(Direction.WEST);
        v8 = 1000000;
        p8 = 1000000;
        d8 = null;
        b8 = true;
        r8 = false;
        o8 = false;
        l7 = l16.add(Direction.SOUTHWEST);
        v7 = 1000000;
        p7 = 1000000;
        d7 = null;
        b7 = true;
        r7 = false;
        o7 = false;
        l19 = l27.add(Direction.NORTHWEST);
        v19 = 1000000;
        p19 = 1000000;
        d19 = null;
        b19 = true;
        r19 = false;
        o19 = false;
        l6 = l15.add(Direction.SOUTHWEST);
        v6 = 1000000;
        p6 = 1000000;
        d6 = null;
        b6 = true;
        r6 = false;
        o6 = false;
        l10 = l17.add(Direction.NORTHWEST);
        v10 = 1000000;
        p10 = 1000000;
        d10 = null;
        b10 = true;
        r10 = false;
        o10 = false;
        l55 = l45.add(Direction.NORTHEAST);
        v55 = 1000000;
        p55 = 1000000;
        d55 = null;
        b55 = true;
        r55 = false;
        o55 = false;
        l63 = l54.add(Direction.NORTHEAST);
        v63 = 1000000;
        p63 = 1000000;
        d63 = null;
        b63 = true;
        r63 = false;
        o63 = false;
        l5 = l14.add(Direction.SOUTHWEST);
        v5 = 1000000;
        p5 = 1000000;
        d5 = null;
        b5 = true;
        r5 = false;
        o5 = false;
        l11 = l18.add(Direction.NORTHWEST);
        v11 = 1000000;
        p11 = 1000000;
        d11 = null;
        b11 = true;
        r11 = false;
        o11 = false;
        l47 = l37.add(Direction.NORTHEAST);
        v47 = 1000000;
        p47 = 1000000;
        d47 = null;
        b47 = true;
        r47 = false;
        o47 = false;
        l38 = l37.add(Direction.NORTH);
        v38 = 1000000;
        p38 = 1000000;
        d38 = null;
        b38 = true;
        r38 = false;
        o38 = false;
        l29 = l37.add(Direction.NORTHWEST);
        v29 = 1000000;
        p29 = 1000000;
        d29 = null;
        b29 = true;
        r29 = false;
        o29 = false;
        l3 = l8.add(Direction.NORTHWEST);
        v3 = 1000000;
        p3 = 1000000;
        d3 = null;
        b3 = true;
        r3 = false;
        o3 = false;
        l2 = l8.add(Direction.WEST);
        v2 = 1000000;
        p2 = 1000000;
        d2 = null;
        b2 = true;
        r2 = false;
        o2 = false;
        l1 = l8.add(Direction.SOUTHWEST);
        v1 = 1000000;
        p1 = 1000000;
        d1 = null;
        b1 = true;
        r1 = false;
        o1 = false;
        l20 = l28.add(Direction.NORTHWEST);
        v20 = 1000000;
        p20 = 1000000;
        d20 = null;
        b20 = true;
        r20 = false;
        o20 = false;
        l56 = l46.add(Direction.NORTHEAST);
        v56 = 1000000;
        p56 = 1000000;
        d56 = null;
        b56 = true;
        r56 = false;
        o56 = false;
        l0 = l7.add(Direction.SOUTHWEST);
        v0 = 1000000;
        p0 = 1000000;
        d0 = null;
        b0 = true;
        r0 = false;
        o0 = false;
        l4 = l9.add(Direction.NORTHWEST);
        v4 = 1000000;
        p4 = 1000000;
        d4 = null;
        b4 = true;
        r4 = false;
        o4 = false;
    
        if (rc.onTheMap(l25) && rc.canSenseLocation(l25)) {
            if (rc.senseCloud(l25)) {
                p25 = 1.5;
                b25 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l25).getCurrentDirection();
                if (targetLocation.equals(l25) || (rc.sensePassability(l25) && !rc.canSenseRobotAtLocation(l25) && currentDirection.equals(Direction.CENTER))) {
                    p25 = rc.senseMapInfo(l25).getCooldownMultiplier(team);
                    b25 = false;
                }
            }
            if (v25 > v34 + p25) {
                v25 = v34 + p25;
                d25 = Direction.WEST;
            }
            if (v25 > v35 + p25) {
                v25 = v35 + p25;
                d25 = d35;
            }
            
            r25 |= r34;
            r25 |= r35;
            r25 &= !b25;
            o35 |= b25;
        }
        else {
            o35 |= b25;
        }

        if (rc.onTheMap(l35) && rc.canSenseLocation(l35)) {
            if (rc.senseCloud(l35)) {
                p35 = 1.5;
                b35 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l35).getCurrentDirection();
                if (targetLocation.equals(l35) || (rc.sensePassability(l35) && !rc.canSenseRobotAtLocation(l35) && currentDirection.equals(Direction.CENTER))) {
                    p35 = rc.senseMapInfo(l35).getCooldownMultiplier(team);
                    b35 = false;
                }
            }
            if (v35 > v25 + p35) {
                v35 = v25 + p35;
                d35 = d25;
            }
            if (v35 > v34 + p35) {
                v35 = v34 + p35;
                d35 = Direction.NORTH;
            }
            
            r35 |= r25;
            r35 |= r34;
            r35 &= !b35;
            o25 |= b35;
        }
        else {
            o25 |= b35;
        }

        if (rc.onTheMap(l24) && rc.canSenseLocation(l24)) {
            if (rc.senseCloud(l24)) {
                p24 = 1.5;
                b24 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l24).getCurrentDirection();
                if (targetLocation.equals(l24) || (rc.sensePassability(l24) && !rc.canSenseRobotAtLocation(l24) && currentDirection.equals(Direction.CENTER))) {
                    p24 = rc.senseMapInfo(l24).getCooldownMultiplier(team);
                    b24 = false;
                }
            }
            if (v24 > v34 + p24) {
                v24 = v34 + p24;
                d24 = Direction.SOUTHWEST;
            }
            if (v24 > v25 + p24) {
                v24 = v25 + p24;
                d24 = d25;
            }
            
            r24 |= r34;
            r24 |= r25;
            r24 &= !b24;
            o25 |= b24;
        }
        else {
            o25 |= b24;
        }

        if (rc.onTheMap(l44) && rc.canSenseLocation(l44)) {
            if (rc.senseCloud(l44)) {
                p44 = 1.5;
                b44 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l44).getCurrentDirection();
                if (targetLocation.equals(l44) || (rc.sensePassability(l44) && !rc.canSenseRobotAtLocation(l44) && currentDirection.equals(Direction.CENTER))) {
                    p44 = rc.senseMapInfo(l44).getCooldownMultiplier(team);
                    b44 = false;
                }
            }
            if (v44 > v35 + p44) {
                v44 = v35 + p44;
                d44 = d35;
            }
            if (v44 > v34 + p44) {
                v44 = v34 + p44;
                d44 = Direction.NORTHEAST;
            }
            
            r44 |= r35;
            r44 |= r34;
            r44 &= !b44;
            o35 |= b44;
        }
        else {
            o35 |= b44;
        }

        if (rc.onTheMap(l26) && rc.canSenseLocation(l26)) {
            if (rc.senseCloud(l26)) {
                p26 = 1.5;
                b26 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l26).getCurrentDirection();
                if (targetLocation.equals(l26) || (rc.sensePassability(l26) && !rc.canSenseRobotAtLocation(l26) && currentDirection.equals(Direction.CENTER))) {
                    p26 = rc.senseMapInfo(l26).getCooldownMultiplier(team);
                    b26 = false;
                }
            }
            if (v26 > v35 + p26) {
                v26 = v35 + p26;
                d26 = d35;
            }
            if (v26 > v25 + p26) {
                v26 = v25 + p26;
                d26 = d25;
            }
            if (v26 > v34 + p26) {
                v26 = v34 + p26;
                d26 = Direction.NORTHWEST;
            }
            
            r26 |= r35;
            r26 |= r25;
            r26 |= r34;
            r26 &= !b26;
            o35 |= b26;
            o25 |= b26;
        }
        else {
            o35 |= b26;
            o25 |= b26;
        }

        if (rc.onTheMap(l36) && rc.canSenseLocation(l36)) {
            if (rc.senseCloud(l36)) {
                p36 = 1.5;
                b36 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l36).getCurrentDirection();
                if (targetLocation.equals(l36) || (rc.sensePassability(l36) && !rc.canSenseRobotAtLocation(l36) && currentDirection.equals(Direction.CENTER))) {
                    p36 = rc.senseMapInfo(l36).getCooldownMultiplier(team);
                    b36 = false;
                }
            }
            if (v36 > v26 + p36) {
                v36 = v26 + p36;
                d36 = d26;
            }
            if (v36 > v35 + p36) {
                v36 = v35 + p36;
                d36 = d35;
            }
            if (v36 > v44 + p36) {
                v36 = v44 + p36;
                d36 = d44;
            }
            
            r36 |= r26;
            r36 |= r35;
            r36 |= r44;
            r36 &= !b36;
            o26 |= b36;
            o35 |= b36;
            o44 |= b36;
        }
        else {
            o26 |= b36;
            o35 |= b36;
            o44 |= b36;
        }

        if (rc.onTheMap(l16) && rc.canSenseLocation(l16)) {
            if (rc.senseCloud(l16)) {
                p16 = 1.5;
                b16 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l16).getCurrentDirection();
                if (targetLocation.equals(l16) || (rc.sensePassability(l16) && !rc.canSenseRobotAtLocation(l16) && currentDirection.equals(Direction.CENTER))) {
                    p16 = rc.senseMapInfo(l16).getCooldownMultiplier(team);
                    b16 = false;
                }
            }
            if (v16 > v25 + p16) {
                v16 = v25 + p16;
                d16 = d25;
            }
            if (v16 > v26 + p16) {
                v16 = v26 + p16;
                d16 = d26;
            }
            if (v16 > v24 + p16) {
                v16 = v24 + p16;
                d16 = d24;
            }
            
            r16 |= r25;
            r16 |= r26;
            r16 |= r24;
            r16 &= !b16;
            o25 |= b16;
            o26 |= b16;
            o24 |= b16;
        }
        else {
            o25 |= b16;
            o26 |= b16;
            o24 |= b16;
        }

        if (rc.onTheMap(l27) && rc.canSenseLocation(l27)) {
            if (rc.senseCloud(l27)) {
                p27 = 1.5;
                b27 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l27).getCurrentDirection();
                if (targetLocation.equals(l27) || (rc.sensePassability(l27) && !rc.canSenseRobotAtLocation(l27) && currentDirection.equals(Direction.CENTER))) {
                    p27 = rc.senseMapInfo(l27).getCooldownMultiplier(team);
                    b27 = false;
                }
            }
            if (v27 > v36 + p27) {
                v27 = v36 + p27;
                d27 = d36;
            }
            if (v27 > v17 + p27) {
                v27 = v17 + p27;
                d27 = d17;
            }
            if (v27 > v26 + p27) {
                v27 = v26 + p27;
                d27 = d26;
            }
            if (v27 > v35 + p27) {
                v27 = v35 + p27;
                d27 = d35;
            }
            
            r27 |= r36;
            r27 |= r17;
            r27 |= r26;
            r27 |= r35;
            r27 &= !b27;
            o36 |= b27;
            o17 |= b27;
            o26 |= b27;
            o35 |= b27;
        }
        else {
            o36 |= b27;
            o17 |= b27;
            o26 |= b27;
            o35 |= b27;
        }

        if (rc.onTheMap(l15) && rc.canSenseLocation(l15)) {
            if (rc.senseCloud(l15)) {
                p15 = 1.5;
                b15 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l15).getCurrentDirection();
                if (targetLocation.equals(l15) || (rc.sensePassability(l15) && !rc.canSenseRobotAtLocation(l15) && currentDirection.equals(Direction.CENTER))) {
                    p15 = rc.senseMapInfo(l15).getCooldownMultiplier(team);
                    b15 = false;
                }
            }
            if (v15 > v24 + p15) {
                v15 = v24 + p15;
                d15 = d24;
            }
            if (v15 > v25 + p15) {
                v15 = v25 + p15;
                d15 = d25;
            }
            if (v15 > v16 + p15) {
                v15 = v16 + p15;
                d15 = d16;
            }
            
            r15 |= r24;
            r15 |= r25;
            r15 |= r16;
            r15 &= !b15;
            o24 |= b15;
            o25 |= b15;
            o16 |= b15;
        }
        else {
            o24 |= b15;
            o25 |= b15;
            o16 |= b15;
        }

        if (rc.onTheMap(l17) && rc.canSenseLocation(l17)) {
            if (rc.senseCloud(l17)) {
                p17 = 1.5;
                b17 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l17).getCurrentDirection();
                if (targetLocation.equals(l17) || (rc.sensePassability(l17) && !rc.canSenseRobotAtLocation(l17) && currentDirection.equals(Direction.CENTER))) {
                    p17 = rc.senseMapInfo(l17).getCooldownMultiplier(team);
                    b17 = false;
                }
            }
            if (v17 > v26 + p17) {
                v17 = v26 + p17;
                d17 = d26;
            }
            if (v17 > v27 + p17) {
                v17 = v27 + p17;
                d17 = d27;
            }
            if (v17 > v16 + p17) {
                v17 = v16 + p17;
                d17 = d16;
            }
            if (v17 > v25 + p17) {
                v17 = v25 + p17;
                d17 = d25;
            }
            
            r17 |= r26;
            r17 |= r27;
            r17 |= r16;
            r17 |= r25;
            r17 &= !b17;
            o26 |= b17;
            o27 |= b17;
            o16 |= b17;
            o25 |= b17;
        }
        else {
            o26 |= b17;
            o27 |= b17;
            o16 |= b17;
            o25 |= b17;
        }

        if (rc.onTheMap(l45) && rc.canSenseLocation(l45)) {
            if (rc.senseCloud(l45)) {
                p45 = 1.5;
                b45 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l45).getCurrentDirection();
                if (targetLocation.equals(l45) || (rc.sensePassability(l45) && !rc.canSenseRobotAtLocation(l45) && currentDirection.equals(Direction.CENTER))) {
                    p45 = rc.senseMapInfo(l45).getCooldownMultiplier(team);
                    b45 = false;
                }
            }
            if (v45 > v36 + p45) {
                v45 = v36 + p45;
                d45 = d36;
            }
            if (v45 > v35 + p45) {
                v45 = v35 + p45;
                d45 = d35;
            }
            if (v45 > v44 + p45) {
                v45 = v44 + p45;
                d45 = d44;
            }
            
            r45 |= r36;
            r45 |= r35;
            r45 |= r44;
            r45 &= !b45;
            o36 |= b45;
            o35 |= b45;
            o44 |= b45;
        }
        else {
            o36 |= b45;
            o35 |= b45;
            o44 |= b45;
        }

        if (rc.onTheMap(l54) && rc.canSenseLocation(l54)) {
            if (rc.senseCloud(l54)) {
                p54 = 1.5;
                b54 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l54).getCurrentDirection();
                if (targetLocation.equals(l54) || (rc.sensePassability(l54) && !rc.canSenseRobotAtLocation(l54) && currentDirection.equals(Direction.CENTER))) {
                    p54 = rc.senseMapInfo(l54).getCooldownMultiplier(team);
                    b54 = false;
                }
            }
            if (v54 > v45 + p54) {
                v54 = v45 + p54;
                d54 = d45;
            }
            if (v54 > v44 + p54) {
                v54 = v44 + p54;
                d54 = d44;
            }
            
            r54 |= r45;
            r54 |= r44;
            r54 &= !b54;
            o45 |= b54;
            o44 |= b54;
        }
        else {
            o45 |= b54;
            o44 |= b54;
        }

        if (rc.onTheMap(l14) && rc.canSenseLocation(l14)) {
            if (rc.senseCloud(l14)) {
                p14 = 1.5;
                b14 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l14).getCurrentDirection();
                if (targetLocation.equals(l14) || (rc.sensePassability(l14) && !rc.canSenseRobotAtLocation(l14) && currentDirection.equals(Direction.CENTER))) {
                    p14 = rc.senseMapInfo(l14).getCooldownMultiplier(team);
                    b14 = false;
                }
            }
            if (v14 > v24 + p14) {
                v14 = v24 + p14;
                d14 = d24;
            }
            if (v14 > v15 + p14) {
                v14 = v15 + p14;
                d14 = d15;
            }
            
            r14 |= r24;
            r14 |= r15;
            r14 &= !b14;
            o24 |= b14;
            o15 |= b14;
        }
        else {
            o24 |= b14;
            o15 |= b14;
        }

        if (rc.onTheMap(l18) && rc.canSenseLocation(l18)) {
            if (rc.senseCloud(l18)) {
                p18 = 1.5;
                b18 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l18).getCurrentDirection();
                if (targetLocation.equals(l18) || (rc.sensePassability(l18) && !rc.canSenseRobotAtLocation(l18) && currentDirection.equals(Direction.CENTER))) {
                    p18 = rc.senseMapInfo(l18).getCooldownMultiplier(team);
                    b18 = false;
                }
            }
            if (v18 > v27 + p18) {
                v18 = v27 + p18;
                d18 = d27;
            }
            if (v18 > v17 + p18) {
                v18 = v17 + p18;
                d18 = d17;
            }
            if (v18 > v26 + p18) {
                v18 = v26 + p18;
                d18 = d26;
            }
            
            r18 |= r27;
            r18 |= r17;
            r18 |= r26;
            r18 &= !b18;
            o27 |= b18;
            o17 |= b18;
            o26 |= b18;
        }
        else {
            o27 |= b18;
            o17 |= b18;
            o26 |= b18;
        }

        if (rc.onTheMap(l37) && rc.canSenseLocation(l37)) {
            if (rc.senseCloud(l37)) {
                p37 = 1.5;
                b37 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l37).getCurrentDirection();
                if (targetLocation.equals(l37) || (rc.sensePassability(l37) && !rc.canSenseRobotAtLocation(l37) && currentDirection.equals(Direction.CENTER))) {
                    p37 = rc.senseMapInfo(l37).getCooldownMultiplier(team);
                    b37 = false;
                }
            }
            if (v37 > v27 + p37) {
                v37 = v27 + p37;
                d37 = d27;
            }
            if (v37 > v36 + p37) {
                v37 = v36 + p37;
                d37 = d36;
            }
            if (v37 > v45 + p37) {
                v37 = v45 + p37;
                d37 = d45;
            }
            
            r37 |= r27;
            r37 |= r36;
            r37 |= r45;
            r37 &= !b37;
            o27 |= b37;
            o36 |= b37;
            o45 |= b37;
        }
        else {
            o27 |= b37;
            o36 |= b37;
            o45 |= b37;
        }

        if (rc.onTheMap(l8) && rc.canSenseLocation(l8)) {
            if (rc.senseCloud(l8)) {
                p8 = 1.5;
                b8 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l8).getCurrentDirection();
                if (targetLocation.equals(l8) || (rc.sensePassability(l8) && !rc.canSenseRobotAtLocation(l8) && currentDirection.equals(Direction.CENTER))) {
                    p8 = rc.senseMapInfo(l8).getCooldownMultiplier(team);
                    b8 = false;
                }
            }
            if (v8 > v16 + p8) {
                v8 = v16 + p8;
                d8 = d16;
            }
            if (v8 > v17 + p8) {
                v8 = v17 + p8;
                d8 = d17;
            }
            if (v8 > v15 + p8) {
                v8 = v15 + p8;
                d8 = d15;
            }
            
            r8 |= r16;
            r8 |= r17;
            r8 |= r15;
            r8 &= !b8;
            o16 |= b8;
            o17 |= b8;
            o15 |= b8;
        }
        else {
            o16 |= b8;
            o17 |= b8;
            o15 |= b8;
        }

        if (rc.onTheMap(l28) && rc.canSenseLocation(l28)) {
            if (rc.senseCloud(l28)) {
                p28 = 1.5;
                b28 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l28).getCurrentDirection();
                if (targetLocation.equals(l28) || (rc.sensePassability(l28) && !rc.canSenseRobotAtLocation(l28) && currentDirection.equals(Direction.CENTER))) {
                    p28 = rc.senseMapInfo(l28).getCooldownMultiplier(team);
                    b28 = false;
                }
            }
            if (v28 > v37 + p28) {
                v28 = v37 + p28;
                d28 = d37;
            }
            if (v28 > v18 + p28) {
                v28 = v18 + p28;
                d28 = d18;
            }
            if (v28 > v27 + p28) {
                v28 = v27 + p28;
                d28 = d27;
            }
            if (v28 > v36 + p28) {
                v28 = v36 + p28;
                d28 = d36;
            }
            
            r28 |= r37;
            r28 |= r18;
            r28 |= r27;
            r28 |= r36;
            r28 &= !b28;
            o37 |= b28;
            o18 |= b28;
            o27 |= b28;
            o36 |= b28;
        }
        else {
            o37 |= b28;
            o18 |= b28;
            o27 |= b28;
            o36 |= b28;
        }

        if (rc.onTheMap(l46) && rc.canSenseLocation(l46)) {
            if (rc.senseCloud(l46)) {
                p46 = 1.5;
                b46 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l46).getCurrentDirection();
                if (targetLocation.equals(l46) || (rc.sensePassability(l46) && !rc.canSenseRobotAtLocation(l46) && currentDirection.equals(Direction.CENTER))) {
                    p46 = rc.senseMapInfo(l46).getCooldownMultiplier(team);
                    b46 = false;
                }
            }
            if (v46 > v37 + p46) {
                v46 = v37 + p46;
                d46 = d37;
            }
            if (v46 > v36 + p46) {
                v46 = v36 + p46;
                d46 = d36;
            }
            if (v46 > v45 + p46) {
                v46 = v45 + p46;
                d46 = d45;
            }
            if (v46 > v54 + p46) {
                v46 = v54 + p46;
                d46 = d54;
            }
            
            r46 |= r37;
            r46 |= r36;
            r46 |= r45;
            r46 |= r54;
            r46 &= !b46;
            o37 |= b46;
            o36 |= b46;
            o45 |= b46;
            o54 |= b46;
        }
        else {
            o37 |= b46;
            o36 |= b46;
            o45 |= b46;
            o54 |= b46;
        }

        if (rc.onTheMap(l7) && rc.canSenseLocation(l7)) {
            if (rc.senseCloud(l7)) {
                p7 = 1.5;
                b7 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l7).getCurrentDirection();
                if (targetLocation.equals(l7) || (rc.sensePassability(l7) && !rc.canSenseRobotAtLocation(l7) && currentDirection.equals(Direction.CENTER))) {
                    p7 = rc.senseMapInfo(l7).getCooldownMultiplier(team);
                    b7 = false;
                }
            }
            if (v7 > v15 + p7) {
                v7 = v15 + p7;
                d7 = d15;
            }
            if (v7 > v16 + p7) {
                v7 = v16 + p7;
                d7 = d16;
            }
            if (v7 > v8 + p7) {
                v7 = v8 + p7;
                d7 = d8;
            }
            if (v7 > v14 + p7) {
                v7 = v14 + p7;
                d7 = d14;
            }
            
            r7 |= r15;
            r7 |= r16;
            r7 |= r8;
            r7 |= r14;
            r7 &= !b7;
            o15 |= b7;
            o16 |= b7;
            o8 |= b7;
            o14 |= b7;
        }
        else {
            o15 |= b7;
            o16 |= b7;
            o8 |= b7;
            o14 |= b7;
        }

        if (rc.onTheMap(l9) && rc.canSenseLocation(l9)) {
            if (rc.senseCloud(l9)) {
                p9 = 1.5;
                b9 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l9).getCurrentDirection();
                if (targetLocation.equals(l9) || (rc.sensePassability(l9) && !rc.canSenseRobotAtLocation(l9) && currentDirection.equals(Direction.CENTER))) {
                    p9 = rc.senseMapInfo(l9).getCooldownMultiplier(team);
                    b9 = false;
                }
            }
            if (v9 > v17 + p9) {
                v9 = v17 + p9;
                d9 = d17;
            }
            if (v9 > v18 + p9) {
                v9 = v18 + p9;
                d9 = d18;
            }
            if (v9 > v8 + p9) {
                v9 = v8 + p9;
                d9 = d8;
            }
            if (v9 > v16 + p9) {
                v9 = v16 + p9;
                d9 = d16;
            }
            
            r9 |= r17;
            r9 |= r18;
            r9 |= r8;
            r9 |= r16;
            r9 &= !b9;
            o17 |= b9;
            o18 |= b9;
            o8 |= b9;
            o16 |= b9;
        }
        else {
            o17 |= b9;
            o18 |= b9;
            o8 |= b9;
            o16 |= b9;
        }

        if (rc.onTheMap(l19) && rc.canSenseLocation(l19)) {
            if (rc.senseCloud(l19)) {
                p19 = 1.5;
                b19 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l19).getCurrentDirection();
                if (targetLocation.equals(l19) || (rc.sensePassability(l19) && !rc.canSenseRobotAtLocation(l19) && currentDirection.equals(Direction.CENTER))) {
                    p19 = rc.senseMapInfo(l19).getCooldownMultiplier(team);
                    b19 = false;
                }
            }
            if (v19 > v28 + p19) {
                v19 = v28 + p19;
                d19 = d28;
            }
            if (v19 > v10 + p19) {
                v19 = v10 + p19;
                d19 = d10;
            }
            if (v19 > v18 + p19) {
                v19 = v18 + p19;
                d19 = d18;
            }
            if (v19 > v27 + p19) {
                v19 = v27 + p19;
                d19 = d27;
            }
            
            r19 |= r28;
            r19 |= r10;
            r19 |= r18;
            r19 |= r27;
            r19 &= !b19;
            o28 |= b19;
            o10 |= b19;
            o18 |= b19;
            o27 |= b19;
        }
        else {
            o28 |= b19;
            o10 |= b19;
            o18 |= b19;
            o27 |= b19;
        }

        if (rc.onTheMap(l10) && rc.canSenseLocation(l10)) {
            if (rc.senseCloud(l10)) {
                p10 = 1.5;
                b10 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l10).getCurrentDirection();
                if (targetLocation.equals(l10) || (rc.sensePassability(l10) && !rc.canSenseRobotAtLocation(l10) && currentDirection.equals(Direction.CENTER))) {
                    p10 = rc.senseMapInfo(l10).getCooldownMultiplier(team);
                    b10 = false;
                }
            }
            if (v10 > v18 + p10) {
                v10 = v18 + p10;
                d10 = d18;
            }
            if (v10 > v19 + p10) {
                v10 = v19 + p10;
                d10 = d19;
            }
            if (v10 > v9 + p10) {
                v10 = v9 + p10;
                d10 = d9;
            }
            if (v10 > v17 + p10) {
                v10 = v17 + p10;
                d10 = d17;
            }
            
            r10 |= r18;
            r10 |= r19;
            r10 |= r9;
            r10 |= r17;
            r10 &= !b10;
            o18 |= b10;
            o19 |= b10;
            o9 |= b10;
            o17 |= b10;
        }
        else {
            o18 |= b10;
            o19 |= b10;
            o9 |= b10;
            o17 |= b10;
        }

        if (rc.onTheMap(l6) && rc.canSenseLocation(l6)) {
            if (rc.senseCloud(l6)) {
                p6 = 1.5;
                b6 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l6).getCurrentDirection();
                if (targetLocation.equals(l6) || (rc.sensePassability(l6) && !rc.canSenseRobotAtLocation(l6) && currentDirection.equals(Direction.CENTER))) {
                    p6 = rc.senseMapInfo(l6).getCooldownMultiplier(team);
                    b6 = false;
                }
            }
            if (v6 > v14 + p6) {
                v6 = v14 + p6;
                d6 = d14;
            }
            if (v6 > v15 + p6) {
                v6 = v15 + p6;
                d6 = d15;
            }
            if (v6 > v7 + p6) {
                v6 = v7 + p6;
                d6 = d7;
            }
            
            r6 |= r14;
            r6 |= r15;
            r6 |= r7;
            r6 &= !b6;
            o14 |= b6;
            o15 |= b6;
            o7 |= b6;
        }
        else {
            o14 |= b6;
            o15 |= b6;
            o7 |= b6;
        }

        if (rc.onTheMap(l55) && rc.canSenseLocation(l55)) {
            if (rc.senseCloud(l55)) {
                p55 = 1.5;
                b55 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l55).getCurrentDirection();
                if (targetLocation.equals(l55) || (rc.sensePassability(l55) && !rc.canSenseRobotAtLocation(l55) && currentDirection.equals(Direction.CENTER))) {
                    p55 = rc.senseMapInfo(l55).getCooldownMultiplier(team);
                    b55 = false;
                }
            }
            if (v55 > v46 + p55) {
                v55 = v46 + p55;
                d55 = d46;
            }
            if (v55 > v45 + p55) {
                v55 = v45 + p55;
                d55 = d45;
            }
            if (v55 > v54 + p55) {
                v55 = v54 + p55;
                d55 = d54;
            }
            
            r55 |= r46;
            r55 |= r45;
            r55 |= r54;
            r55 &= !b55;
            o46 |= b55;
            o45 |= b55;
            o54 |= b55;
        }
        else {
            o46 |= b55;
            o45 |= b55;
            o54 |= b55;
        }

        if (rc.onTheMap(l5) && rc.canSenseLocation(l5)) {
            if (rc.senseCloud(l5)) {
                p5 = 1.5;
                b5 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l5).getCurrentDirection();
                if (targetLocation.equals(l5) || (rc.sensePassability(l5) && !rc.canSenseRobotAtLocation(l5) && currentDirection.equals(Direction.CENTER))) {
                    p5 = rc.senseMapInfo(l5).getCooldownMultiplier(team);
                    b5 = false;
                }
            }
            if (v5 > v14 + p5) {
                v5 = v14 + p5;
                d5 = d14;
            }
            if (v5 > v6 + p5) {
                v5 = v6 + p5;
                d5 = d6;
            }
            
            r5 |= r14;
            r5 |= r6;
            r5 &= !b5;
            o14 |= b5;
            o6 |= b5;
        }
        else {
            o14 |= b5;
            o6 |= b5;
        }

        if (rc.onTheMap(l11) && rc.canSenseLocation(l11)) {
            if (rc.senseCloud(l11)) {
                p11 = 1.5;
                b11 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l11).getCurrentDirection();
                if (targetLocation.equals(l11) || (rc.sensePassability(l11) && !rc.canSenseRobotAtLocation(l11) && currentDirection.equals(Direction.CENTER))) {
                    p11 = rc.senseMapInfo(l11).getCooldownMultiplier(team);
                    b11 = false;
                }
            }
            if (v11 > v19 + p11) {
                v11 = v19 + p11;
                d11 = d19;
            }
            if (v11 > v10 + p11) {
                v11 = v10 + p11;
                d11 = d10;
            }
            if (v11 > v18 + p11) {
                v11 = v18 + p11;
                d11 = d18;
            }
            
            r11 |= r19;
            r11 |= r10;
            r11 |= r18;
            r11 &= !b11;
            o19 |= b11;
            o10 |= b11;
            o18 |= b11;
        }
        else {
            o19 |= b11;
            o10 |= b11;
            o18 |= b11;
        }

        if (rc.onTheMap(l63) && rc.canSenseLocation(l63)) {
            if (rc.senseCloud(l63)) {
                p63 = 1.5;
                b63 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l63).getCurrentDirection();
                if (targetLocation.equals(l63) || (rc.sensePassability(l63) && !rc.canSenseRobotAtLocation(l63) && currentDirection.equals(Direction.CENTER))) {
                    p63 = rc.senseMapInfo(l63).getCooldownMultiplier(team);
                    b63 = false;
                }
            }
            if (v63 > v55 + p63) {
                v63 = v55 + p63;
                d63 = d55;
            }
            if (v63 > v54 + p63) {
                v63 = v54 + p63;
                d63 = d54;
            }
            
            r63 |= r55;
            r63 |= r54;
            r63 &= !b63;
            o55 |= b63;
            o54 |= b63;
        }
        else {
            o55 |= b63;
            o54 |= b63;
        }

        if (rc.onTheMap(l2) && rc.canSenseLocation(l2)) {
            if (rc.senseCloud(l2)) {
                p2 = 1.5;
                b2 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l2).getCurrentDirection();
                if (targetLocation.equals(l2) || (rc.sensePassability(l2) && !rc.canSenseRobotAtLocation(l2) && currentDirection.equals(Direction.CENTER))) {
                    p2 = rc.senseMapInfo(l2).getCooldownMultiplier(team);
                    b2 = false;
                }
            }
            if (v2 > v8 + p2) {
                v2 = v8 + p2;
                d2 = d8;
            }
            if (v2 > v9 + p2) {
                v2 = v9 + p2;
                d2 = d9;
            }
            if (v2 > v7 + p2) {
                v2 = v7 + p2;
                d2 = d7;
            }
            
            r2 |= r8;
            r2 |= r9;
            r2 |= r7;
            r2 &= !b2;
            o8 |= b2;
            o9 |= b2;
            o7 |= b2;
        }
        else {
            o8 |= b2;
            o9 |= b2;
            o7 |= b2;
        }

        if (rc.onTheMap(l38) && rc.canSenseLocation(l38)) {
            if (rc.senseCloud(l38)) {
                p38 = 1.5;
                b38 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l38).getCurrentDirection();
                if (targetLocation.equals(l38) || (rc.sensePassability(l38) && !rc.canSenseRobotAtLocation(l38) && currentDirection.equals(Direction.CENTER))) {
                    p38 = rc.senseMapInfo(l38).getCooldownMultiplier(team);
                    b38 = false;
                }
            }
            if (v38 > v28 + p38) {
                v38 = v28 + p38;
                d38 = d28;
            }
            if (v38 > v37 + p38) {
                v38 = v37 + p38;
                d38 = d37;
            }
            if (v38 > v46 + p38) {
                v38 = v46 + p38;
                d38 = d46;
            }
            
            r38 |= r28;
            r38 |= r37;
            r38 |= r46;
            r38 &= !b38;
            o28 |= b38;
            o37 |= b38;
            o46 |= b38;
        }
        else {
            o28 |= b38;
            o37 |= b38;
            o46 |= b38;
        }

        if (rc.onTheMap(l29) && rc.canSenseLocation(l29)) {
            if (rc.senseCloud(l29)) {
                p29 = 1.5;
                b29 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l29).getCurrentDirection();
                if (targetLocation.equals(l29) || (rc.sensePassability(l29) && !rc.canSenseRobotAtLocation(l29) && currentDirection.equals(Direction.CENTER))) {
                    p29 = rc.senseMapInfo(l29).getCooldownMultiplier(team);
                    b29 = false;
                }
            }
            if (v29 > v38 + p29) {
                v29 = v38 + p29;
                d29 = d38;
            }
            if (v29 > v19 + p29) {
                v29 = v19 + p29;
                d29 = d19;
            }
            if (v29 > v28 + p29) {
                v29 = v28 + p29;
                d29 = d28;
            }
            if (v29 > v37 + p29) {
                v29 = v37 + p29;
                d29 = d37;
            }
            
            r29 |= r38;
            r29 |= r19;
            r29 |= r28;
            r29 |= r37;
            r29 &= !b29;
            o38 |= b29;
            o19 |= b29;
            o28 |= b29;
            o37 |= b29;
        }
        else {
            o38 |= b29;
            o19 |= b29;
            o28 |= b29;
            o37 |= b29;
        }

        if (rc.onTheMap(l1) && rc.canSenseLocation(l1)) {
            if (rc.senseCloud(l1)) {
                p1 = 1.5;
                b1 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l1).getCurrentDirection();
                if (targetLocation.equals(l1) || (rc.sensePassability(l1) && !rc.canSenseRobotAtLocation(l1) && currentDirection.equals(Direction.CENTER))) {
                    p1 = rc.senseMapInfo(l1).getCooldownMultiplier(team);
                    b1 = false;
                }
            }
            if (v1 > v7 + p1) {
                v1 = v7 + p1;
                d1 = d7;
            }
            if (v1 > v8 + p1) {
                v1 = v8 + p1;
                d1 = d8;
            }
            if (v1 > v2 + p1) {
                v1 = v2 + p1;
                d1 = d2;
            }
            if (v1 > v6 + p1) {
                v1 = v6 + p1;
                d1 = d6;
            }
            
            r1 |= r7;
            r1 |= r8;
            r1 |= r2;
            r1 |= r6;
            r1 &= !b1;
            o7 |= b1;
            o8 |= b1;
            o2 |= b1;
            o6 |= b1;
        }
        else {
            o7 |= b1;
            o8 |= b1;
            o2 |= b1;
            o6 |= b1;
        }

        if (rc.onTheMap(l3) && rc.canSenseLocation(l3)) {
            if (rc.senseCloud(l3)) {
                p3 = 1.5;
                b3 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l3).getCurrentDirection();
                if (targetLocation.equals(l3) || (rc.sensePassability(l3) && !rc.canSenseRobotAtLocation(l3) && currentDirection.equals(Direction.CENTER))) {
                    p3 = rc.senseMapInfo(l3).getCooldownMultiplier(team);
                    b3 = false;
                }
            }
            if (v3 > v9 + p3) {
                v3 = v9 + p3;
                d3 = d9;
            }
            if (v3 > v10 + p3) {
                v3 = v10 + p3;
                d3 = d10;
            }
            if (v3 > v2 + p3) {
                v3 = v2 + p3;
                d3 = d2;
            }
            if (v3 > v8 + p3) {
                v3 = v8 + p3;
                d3 = d8;
            }
            
            r3 |= r9;
            r3 |= r10;
            r3 |= r2;
            r3 |= r8;
            r3 &= !b3;
            o9 |= b3;
            o10 |= b3;
            o2 |= b3;
            o8 |= b3;
        }
        else {
            o9 |= b3;
            o10 |= b3;
            o2 |= b3;
            o8 |= b3;
        }

        if (rc.onTheMap(l47) && rc.canSenseLocation(l47)) {
            if (rc.senseCloud(l47)) {
                p47 = 1.5;
                b47 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l47).getCurrentDirection();
                if (targetLocation.equals(l47) || (rc.sensePassability(l47) && !rc.canSenseRobotAtLocation(l47) && currentDirection.equals(Direction.CENTER))) {
                    p47 = rc.senseMapInfo(l47).getCooldownMultiplier(team);
                    b47 = false;
                }
            }
            if (v47 > v38 + p47) {
                v47 = v38 + p47;
                d47 = d38;
            }
            if (v47 > v37 + p47) {
                v47 = v37 + p47;
                d47 = d37;
            }
            if (v47 > v46 + p47) {
                v47 = v46 + p47;
                d47 = d46;
            }
            if (v47 > v55 + p47) {
                v47 = v55 + p47;
                d47 = d55;
            }
            
            r47 |= r38;
            r47 |= r37;
            r47 |= r46;
            r47 |= r55;
            r47 &= !b47;
            o38 |= b47;
            o37 |= b47;
            o46 |= b47;
            o55 |= b47;
        }
        else {
            o38 |= b47;
            o37 |= b47;
            o46 |= b47;
            o55 |= b47;
        }

        if (rc.onTheMap(l56) && rc.canSenseLocation(l56)) {
            if (rc.senseCloud(l56)) {
                p56 = 1.5;
                b56 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l56).getCurrentDirection();
                if (targetLocation.equals(l56) || (rc.sensePassability(l56) && !rc.canSenseRobotAtLocation(l56) && currentDirection.equals(Direction.CENTER))) {
                    p56 = rc.senseMapInfo(l56).getCooldownMultiplier(team);
                    b56 = false;
                }
            }
            if (v56 > v47 + p56) {
                v56 = v47 + p56;
                d56 = d47;
            }
            if (v56 > v46 + p56) {
                v56 = v46 + p56;
                d56 = d46;
            }
            if (v56 > v55 + p56) {
                v56 = v55 + p56;
                d56 = d55;
            }
            if (v56 > v63 + p56) {
                v56 = v63 + p56;
                d56 = d63;
            }
            
            r56 |= r47;
            r56 |= r46;
            r56 |= r55;
            r56 |= r63;
            r56 &= !b56;
            o47 |= b56;
            o46 |= b56;
            o55 |= b56;
            o63 |= b56;
        }
        else {
            o47 |= b56;
            o46 |= b56;
            o55 |= b56;
            o63 |= b56;
        }

        if (rc.onTheMap(l0) && rc.canSenseLocation(l0)) {
            if (rc.senseCloud(l0)) {
                p0 = 1.5;
                b0 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l0).getCurrentDirection();
                if (targetLocation.equals(l0) || (rc.sensePassability(l0) && !rc.canSenseRobotAtLocation(l0) && currentDirection.equals(Direction.CENTER))) {
                    p0 = rc.senseMapInfo(l0).getCooldownMultiplier(team);
                    b0 = false;
                }
            }
            if (v0 > v6 + p0) {
                v0 = v6 + p0;
                d0 = d6;
            }
            if (v0 > v7 + p0) {
                v0 = v7 + p0;
                d0 = d7;
            }
            if (v0 > v1 + p0) {
                v0 = v1 + p0;
                d0 = d1;
            }
            if (v0 > v5 + p0) {
                v0 = v5 + p0;
                d0 = d5;
            }
            
            r0 |= r6;
            r0 |= r7;
            r0 |= r1;
            r0 |= r5;
            r0 &= !b0;
            o6 |= b0;
            o7 |= b0;
            o1 |= b0;
            o5 |= b0;
        }
        else {
            o6 |= b0;
            o7 |= b0;
            o1 |= b0;
            o5 |= b0;
        }

        if (rc.onTheMap(l20) && rc.canSenseLocation(l20)) {
            if (rc.senseCloud(l20)) {
                p20 = 1.5;
                b20 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l20).getCurrentDirection();
                if (targetLocation.equals(l20) || (rc.sensePassability(l20) && !rc.canSenseRobotAtLocation(l20) && currentDirection.equals(Direction.CENTER))) {
                    p20 = rc.senseMapInfo(l20).getCooldownMultiplier(team);
                    b20 = false;
                }
            }
            if (v20 > v29 + p20) {
                v20 = v29 + p20;
                d20 = d29;
            }
            if (v20 > v11 + p20) {
                v20 = v11 + p20;
                d20 = d11;
            }
            if (v20 > v19 + p20) {
                v20 = v19 + p20;
                d20 = d19;
            }
            if (v20 > v28 + p20) {
                v20 = v28 + p20;
                d20 = d28;
            }
            
            r20 |= r29;
            r20 |= r11;
            r20 |= r19;
            r20 |= r28;
            r20 &= !b20;
            o29 |= b20;
            o11 |= b20;
            o19 |= b20;
            o28 |= b20;
        }
        else {
            o29 |= b20;
            o11 |= b20;
            o19 |= b20;
            o28 |= b20;
        }

        if (rc.onTheMap(l4) && rc.canSenseLocation(l4)) {
            if (rc.senseCloud(l4)) {
                p4 = 1.5;
                b4 = false;
            } 

            else {
                Direction currentDirection = rc.senseMapInfo(l4).getCurrentDirection();
                if (targetLocation.equals(l4) || (rc.sensePassability(l4) && !rc.canSenseRobotAtLocation(l4) && currentDirection.equals(Direction.CENTER))) {
                    p4 = rc.senseMapInfo(l4).getCooldownMultiplier(team);
                    b4 = false;
                }
            }
            if (v4 > v10 + p4) {
                v4 = v10 + p4;
                d4 = d10;
            }
            if (v4 > v11 + p4) {
                v4 = v11 + p4;
                d4 = d11;
            }
            if (v4 > v3 + p4) {
                v4 = v3 + p4;
                d4 = d3;
            }
            if (v4 > v9 + p4) {
                v4 = v9 + p4;
                d4 = d9;
            }
            
            r4 |= r10;
            r4 |= r11;
            r4 |= r3;
            r4 |= r9;
            r4 &= !b4;
            o10 |= b4;
            o11 |= b4;
            o3 |= b4;
            o9 |= b4;
        }
        else {
            o10 |= b4;
            o11 |= b4;
            o3 |= b4;
            o9 |= b4;
        }

        int dx = targetLocation.x - l34.x;
        int dy = targetLocation.y - l34.y;

        switch(dx) {
            case -4:
                switch(dy) {
                    case -2:
                        if (v0 < 10000) {
                            return d0;
                        }
                    case -1:
                        if (v1 < 10000) {
                            return d1;
                        }
                    case 0:
                        if (v2 < 10000) {
                            return d2;
                        }
                    case 1:
                        if (v3 < 10000) {
                            return d3;
                        }
                    case 2:
                        if (v4 < 10000) {
                            return d4;
                        }
                } break;

            case -3:
                switch(dy) {
                    case -3:
                        if (v5 < 10000) {
                            return d5;
                        }
                    case -2:
                        if (v6 < 10000) {
                            return d6;
                        }
                    case -1:
                        if (v7 < 10000) {
                            return d7;
                        }
                    case 0:
                        if (v8 < 10000) {
                            return d8;
                        }
                    case 1:
                        if (v9 < 10000) {
                            return d9;
                        }
                    case 2:
                        if (v10 < 10000) {
                            return d10;
                        }
                    case 3:
                        if (v11 < 10000) {
                            return d11;
                        }
                } break;

            case -2:
                switch(dy) {
                    case -2:
                        if (v14 < 10000) {
                            return d14;
                        }
                    case -1:
                        if (v15 < 10000) {
                            return d15;
                        }
                    case 0:
                        if (v16 < 10000) {
                            return d16;
                        }
                    case 1:
                        if (v17 < 10000) {
                            return d17;
                        }
                    case 2:
                        if (v18 < 10000) {
                            return d18;
                        }
                    case 3:
                        if (v19 < 10000) {
                            return d19;
                        }
                    case 4:
                        if (v20 < 10000) {
                            return d20;
                        }
                } break;

            case -1:
                switch(dy) {
                    case -1:
                        if (v24 < 10000) {
                            return d24;
                        }
                    case 0:
                        if (v25 < 10000) {
                            return d25;
                        }
                    case 1:
                        if (v26 < 10000) {
                            return d26;
                        }
                    case 2:
                        if (v27 < 10000) {
                            return d27;
                        }
                    case 3:
                        if (v28 < 10000) {
                            return d28;
                        }
                    case 4:
                        if (v29 < 10000) {
                            return d29;
                        }
                } break;

            case 0:
                switch(dy) {
                    case 0:
                        if (v34 < 10000) {
                            return d34;
                        }
                    case 1:
                        if (v35 < 10000) {
                            return d35;
                        }
                    case 2:
                        if (v36 < 10000) {
                            return d36;
                        }
                    case 3:
                        if (v37 < 10000) {
                            return d37;
                        }
                    case 4:
                        if (v38 < 10000) {
                            return d38;
                        }
                } break;

            case 1:
                switch(dy) {
                    case 1:
                        if (v44 < 10000) {
                            return d44;
                        }
                    case 2:
                        if (v45 < 10000) {
                            return d45;
                        }
                    case 3:
                        if (v46 < 10000) {
                            return d46;
                        }
                    case 4:
                        if (v47 < 10000) {
                            return d47;
                        }
                } break;

            case 2:
                switch(dy) {
                    case 2:
                        if (v54 < 10000) {
                            return d54;
                        }
                    case 3:
                        if (v55 < 10000) {
                            return d55;
                        }
                    case 4:
                        if (v56 < 10000) {
                            return d56;
                        }
                } break;

            case 3:
                switch(dy) {
                    case 3:
                        if (v63 < 10000) {
                            return d63;
                        }
                } break;

            case 4:
                switch(dy) {
                } break;

        }
    
        o0 = r0;
        o1 = r1;
        o2 = r2;
        o3 = r3;
        o4 = r4;
        o5 = r5;
        o11 = r11;
        o20 = r20;
        o29 = r29;
        o38 = r38;
        o47 = r47;
        o56 = r56;
        o63 = r63;
        Direction ans = Direction.CENTER;

        if (r0 && o0) {
            double dist0 = v0 + 1.5 * Math.sqrt(l0.distanceSquaredTo(targetLocation));
            if (dist0 < localBest) {
                localBest = dist0;
                ans = d0;
                best = l0;
            }
        }

        if (r1 && o1) {
            double dist1 = v1 + 1.5 * Math.sqrt(l1.distanceSquaredTo(targetLocation));
            if (dist1 < localBest) {
                localBest = dist1;
                ans = d1;
                best = l1;
            }
        }

        if (r2 && o2) {
            double dist2 = v2 + 1.5 * Math.sqrt(l2.distanceSquaredTo(targetLocation));
            if (dist2 < localBest) {
                localBest = dist2;
                ans = d2;
                best = l2;
            }
        }

        if (r3 && o3) {
            double dist3 = v3 + 1.5 * Math.sqrt(l3.distanceSquaredTo(targetLocation));
            if (dist3 < localBest) {
                localBest = dist3;
                ans = d3;
                best = l3;
            }
        }

        if (r4 && o4) {
            double dist4 = v4 + 1.5 * Math.sqrt(l4.distanceSquaredTo(targetLocation));
            if (dist4 < localBest) {
                localBest = dist4;
                ans = d4;
                best = l4;
            }
        }

        if (r5 && o5) {
            double dist5 = v5 + 1.5 * Math.sqrt(l5.distanceSquaredTo(targetLocation));
            if (dist5 < localBest) {
                localBest = dist5;
                ans = d5;
                best = l5;
            }
        }

        if (r11 && o11) {
            double dist11 = v11 + 1.5 * Math.sqrt(l11.distanceSquaredTo(targetLocation));
            if (dist11 < localBest) {
                localBest = dist11;
                ans = d11;
                best = l11;
            }
        }

        if (r20 && o20) {
            double dist20 = v20 + 1.5 * Math.sqrt(l20.distanceSquaredTo(targetLocation));
            if (dist20 < localBest) {
                localBest = dist20;
                ans = d20;
                best = l20;
            }
        }

        if (r29 && o29) {
            double dist29 = v29 + 1.5 * Math.sqrt(l29.distanceSquaredTo(targetLocation));
            if (dist29 < localBest) {
                localBest = dist29;
                ans = d29;
                best = l29;
            }
        }

        if (r38 && o38) {
            double dist38 = v38 + 1.5 * Math.sqrt(l38.distanceSquaredTo(targetLocation));
            if (dist38 < localBest) {
                localBest = dist38;
                ans = d38;
                best = l38;
            }
        }

        if (r47 && o47) {
            double dist47 = v47 + 1.5 * Math.sqrt(l47.distanceSquaredTo(targetLocation));
            if (dist47 < localBest) {
                localBest = dist47;
                ans = d47;
                best = l47;
            }
        }

        if (r56 && o56) {
            double dist56 = v56 + 1.5 * Math.sqrt(l56.distanceSquaredTo(targetLocation));
            if (dist56 < localBest) {
                localBest = dist56;
                ans = d56;
                best = l56;
            }
        }

        if (r63 && o63) {
            double dist63 = v63 + 1.5 * Math.sqrt(l63.distanceSquaredTo(targetLocation));
            if (dist63 < localBest) {
                localBest = dist63;
                ans = d63;
                best = l63;
            }
        }

        draws7();
        rc.setIndicatorDot(best, 0, 0, 255);
        if (localBest < globalBest) {
            globalBest = localBest;
            return ans;
        }
        return getBestDirectionWallFollow7(ans);
    }

    private Direction getBestDirectionWallFollow7(Direction prev) throws GameActionException {
        Direction ans = Direction.CENTER;
        int minDistance = closestWallLocations.isEmpty() ? 1000000 : currentLocation.distanceSquaredTo(closestWallLocations.get(0));
    
        if (b0) {
            int distance = currentLocation.distanceSquaredTo(l0);
            if (distance == minDistance) {
                closestWallLocations.add(l0);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l0);
                minDistance = distance;
            }
        }

        if (b1) {
            int distance = currentLocation.distanceSquaredTo(l1);
            if (distance == minDistance) {
                closestWallLocations.add(l1);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l1);
                minDistance = distance;
            }
        }

        if (b2) {
            int distance = currentLocation.distanceSquaredTo(l2);
            if (distance == minDistance) {
                closestWallLocations.add(l2);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l2);
                minDistance = distance;
            }
        }

        if (b3) {
            int distance = currentLocation.distanceSquaredTo(l3);
            if (distance == minDistance) {
                closestWallLocations.add(l3);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l3);
                minDistance = distance;
            }
        }

        if (b4) {
            int distance = currentLocation.distanceSquaredTo(l4);
            if (distance == minDistance) {
                closestWallLocations.add(l4);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l4);
                minDistance = distance;
            }
        }

        if (b5) {
            int distance = currentLocation.distanceSquaredTo(l5);
            if (distance == minDistance) {
                closestWallLocations.add(l5);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l5);
                minDistance = distance;
            }
        }

        if (b6) {
            int distance = currentLocation.distanceSquaredTo(l6);
            if (distance == minDistance) {
                closestWallLocations.add(l6);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l6);
                minDistance = distance;
            }
        }

        if (b7) {
            int distance = currentLocation.distanceSquaredTo(l7);
            if (distance == minDistance) {
                closestWallLocations.add(l7);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l7);
                minDistance = distance;
            }
        }

        if (b8) {
            int distance = currentLocation.distanceSquaredTo(l8);
            if (distance == minDistance) {
                closestWallLocations.add(l8);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l8);
                minDistance = distance;
            }
        }

        if (b9) {
            int distance = currentLocation.distanceSquaredTo(l9);
            if (distance == minDistance) {
                closestWallLocations.add(l9);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l9);
                minDistance = distance;
            }
        }

        if (b10) {
            int distance = currentLocation.distanceSquaredTo(l10);
            if (distance == minDistance) {
                closestWallLocations.add(l10);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l10);
                minDistance = distance;
            }
        }

        if (b11) {
            int distance = currentLocation.distanceSquaredTo(l11);
            if (distance == minDistance) {
                closestWallLocations.add(l11);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l11);
                minDistance = distance;
            }
        }

        if (b14) {
            int distance = currentLocation.distanceSquaredTo(l14);
            if (distance == minDistance) {
                closestWallLocations.add(l14);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l14);
                minDistance = distance;
            }
        }

        if (b15) {
            int distance = currentLocation.distanceSquaredTo(l15);
            if (distance == minDistance) {
                closestWallLocations.add(l15);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l15);
                minDistance = distance;
            }
        }

        if (b16) {
            int distance = currentLocation.distanceSquaredTo(l16);
            if (distance == minDistance) {
                closestWallLocations.add(l16);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l16);
                minDistance = distance;
            }
        }

        if (b17) {
            int distance = currentLocation.distanceSquaredTo(l17);
            if (distance == minDistance) {
                closestWallLocations.add(l17);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l17);
                minDistance = distance;
            }
        }

        if (b18) {
            int distance = currentLocation.distanceSquaredTo(l18);
            if (distance == minDistance) {
                closestWallLocations.add(l18);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l18);
                minDistance = distance;
            }
        }

        if (b19) {
            int distance = currentLocation.distanceSquaredTo(l19);
            if (distance == minDistance) {
                closestWallLocations.add(l19);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l19);
                minDistance = distance;
            }
        }

        if (b20) {
            int distance = currentLocation.distanceSquaredTo(l20);
            if (distance == minDistance) {
                closestWallLocations.add(l20);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l20);
                minDistance = distance;
            }
        }

        if (b24) {
            int distance = currentLocation.distanceSquaredTo(l24);
            if (distance == minDistance) {
                closestWallLocations.add(l24);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l24);
                minDistance = distance;
            }
        }

        if (b25) {
            int distance = currentLocation.distanceSquaredTo(l25);
            if (distance == minDistance) {
                closestWallLocations.add(l25);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l25);
                minDistance = distance;
            }
        }

        if (b26) {
            int distance = currentLocation.distanceSquaredTo(l26);
            if (distance == minDistance) {
                closestWallLocations.add(l26);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l26);
                minDistance = distance;
            }
        }

        if (b27) {
            int distance = currentLocation.distanceSquaredTo(l27);
            if (distance == minDistance) {
                closestWallLocations.add(l27);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l27);
                minDistance = distance;
            }
        }

        if (b28) {
            int distance = currentLocation.distanceSquaredTo(l28);
            if (distance == minDistance) {
                closestWallLocations.add(l28);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l28);
                minDistance = distance;
            }
        }

        if (b29) {
            int distance = currentLocation.distanceSquaredTo(l29);
            if (distance == minDistance) {
                closestWallLocations.add(l29);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l29);
                minDistance = distance;
            }
        }

        if (b35) {
            int distance = currentLocation.distanceSquaredTo(l35);
            if (distance == minDistance) {
                closestWallLocations.add(l35);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l35);
                minDistance = distance;
            }
        }

        if (b36) {
            int distance = currentLocation.distanceSquaredTo(l36);
            if (distance == minDistance) {
                closestWallLocations.add(l36);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l36);
                minDistance = distance;
            }
        }

        if (b37) {
            int distance = currentLocation.distanceSquaredTo(l37);
            if (distance == minDistance) {
                closestWallLocations.add(l37);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l37);
                minDistance = distance;
            }
        }

        if (b38) {
            int distance = currentLocation.distanceSquaredTo(l38);
            if (distance == minDistance) {
                closestWallLocations.add(l38);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l38);
                minDistance = distance;
            }
        }

        if (b44) {
            int distance = currentLocation.distanceSquaredTo(l44);
            if (distance == minDistance) {
                closestWallLocations.add(l44);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l44);
                minDistance = distance;
            }
        }

        if (b45) {
            int distance = currentLocation.distanceSquaredTo(l45);
            if (distance == minDistance) {
                closestWallLocations.add(l45);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l45);
                minDistance = distance;
            }
        }

        if (b46) {
            int distance = currentLocation.distanceSquaredTo(l46);
            if (distance == minDistance) {
                closestWallLocations.add(l46);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l46);
                minDistance = distance;
            }
        }

        if (b47) {
            int distance = currentLocation.distanceSquaredTo(l47);
            if (distance == minDistance) {
                closestWallLocations.add(l47);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l47);
                minDistance = distance;
            }
        }

        if (b54) {
            int distance = currentLocation.distanceSquaredTo(l54);
            if (distance == minDistance) {
                closestWallLocations.add(l54);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l54);
                minDistance = distance;
            }
        }

        if (b55) {
            int distance = currentLocation.distanceSquaredTo(l55);
            if (distance == minDistance) {
                closestWallLocations.add(l55);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l55);
                minDistance = distance;
            }
        }

        if (b56) {
            int distance = currentLocation.distanceSquaredTo(l56);
            if (distance == minDistance) {
                closestWallLocations.add(l56);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l56);
                minDistance = distance;
            }
        }

        if (b63) {
            int distance = currentLocation.distanceSquaredTo(l63);
            if (distance == minDistance) {
                closestWallLocations.add(l63);
            }
            if (distance < minDistance) {
                closestWallLocations.clear();
                closestWallLocations.add(l63);
                minDistance = distance;
            }
        }

        if (minDistance > 2) { return prev; }
        int maxDot = -999999;
        minDistance = 1000000;
        for (MapLocation closestWallLocation : closestWallLocations) {
            Direction vertical = currentLocation.directionTo(closestWallLocation);

            Direction tangent1 = vertical.rotateLeft().rotateLeft();
            Direction tangent2 = vertical.rotateRight().rotateRight();

            int dx = lastDirection.getDeltaX();
            int dy = lastDirection.getDeltaY();

            int dot1 = tangent1.getDeltaX() * dx + tangent1.getDeltaY() * dy;
            int dot2 = tangent2.getDeltaX() * dx + tangent2.getDeltaY() * dy;

            int distance1 = currentLocation.add(tangent1).distanceSquaredTo(targetLocation);
            int distance2 = currentLocation.add(tangent2).distanceSquaredTo(targetLocation);

            if (!rc.canMove(tangent1)) {
                dot1 = -1000000;
            }

            if (!rc.canMove(tangent2)) {
                dot2 = -1000000;
            }

            if (dot1 > maxDot) {
                maxDot = dot1;
                minDistance = distance1;
                ans = tangent1;
            }

            if (dot2 > maxDot) {
                maxDot = dot2;
                minDistance = distance2;
                ans = tangent2;
            }

            if (dot1 == maxDot && distance1 < minDistance) {
                maxDot = dot1;
                minDistance = distance1;
                ans = tangent1;
            }

            if (dot2 == maxDot && distance2 < minDistance) {
                maxDot = dot2;
                minDistance = distance2;
                ans = tangent2;
            }
        }
        draws7();
        for (MapLocation closestWallLocation : closestWallLocations) {
            rc.setIndicatorDot(closestWallLocation, 255, 0, 0);
        }
        return ans;
    }

    private void draws7() throws GameActionException {
    
        rc.setIndicatorDot(l0, 255, 0, 255);
        if (b0) {
            rc.setIndicatorDot(l0, 255, 255, 255);
        }

        rc.setIndicatorDot(l1, 255, 0, 255);
        if (b1) {
            rc.setIndicatorDot(l1, 255, 255, 255);
        }

        rc.setIndicatorDot(l2, 255, 0, 255);
        if (b2) {
            rc.setIndicatorDot(l2, 255, 255, 255);
        }

        rc.setIndicatorDot(l3, 255, 0, 255);
        if (b3) {
            rc.setIndicatorDot(l3, 255, 255, 255);
        }

        rc.setIndicatorDot(l4, 255, 0, 255);
        if (b4) {
            rc.setIndicatorDot(l4, 255, 255, 255);
        }

        rc.setIndicatorDot(l5, 255, 0, 255);
        if (b5) {
            rc.setIndicatorDot(l5, 255, 255, 255);
        }

        rc.setIndicatorDot(l6, 255, 0, 255);
        if (b6) {
            rc.setIndicatorDot(l6, 255, 255, 255);
        }

        rc.setIndicatorDot(l7, 255, 0, 255);
        if (b7) {
            rc.setIndicatorDot(l7, 255, 255, 255);
        }

        rc.setIndicatorDot(l8, 255, 0, 255);
        if (b8) {
            rc.setIndicatorDot(l8, 255, 255, 255);
        }

        rc.setIndicatorDot(l9, 255, 0, 255);
        if (b9) {
            rc.setIndicatorDot(l9, 255, 255, 255);
        }

        rc.setIndicatorDot(l10, 255, 0, 255);
        if (b10) {
            rc.setIndicatorDot(l10, 255, 255, 255);
        }

        rc.setIndicatorDot(l11, 255, 0, 255);
        if (b11) {
            rc.setIndicatorDot(l11, 255, 255, 255);
        }

        rc.setIndicatorDot(l14, 255, 0, 255);
        if (b14) {
            rc.setIndicatorDot(l14, 255, 255, 255);
        }

        rc.setIndicatorDot(l15, 255, 0, 255);
        if (b15) {
            rc.setIndicatorDot(l15, 255, 255, 255);
        }

        rc.setIndicatorDot(l16, 255, 0, 255);
        if (b16) {
            rc.setIndicatorDot(l16, 255, 255, 255);
        }

        rc.setIndicatorDot(l17, 255, 0, 255);
        if (b17) {
            rc.setIndicatorDot(l17, 255, 255, 255);
        }

        rc.setIndicatorDot(l18, 255, 0, 255);
        if (b18) {
            rc.setIndicatorDot(l18, 255, 255, 255);
        }

        rc.setIndicatorDot(l19, 255, 0, 255);
        if (b19) {
            rc.setIndicatorDot(l19, 255, 255, 255);
        }

        rc.setIndicatorDot(l20, 255, 0, 255);
        if (b20) {
            rc.setIndicatorDot(l20, 255, 255, 255);
        }

        rc.setIndicatorDot(l24, 255, 0, 255);
        if (b24) {
            rc.setIndicatorDot(l24, 255, 255, 255);
        }

        rc.setIndicatorDot(l25, 255, 0, 255);
        if (b25) {
            rc.setIndicatorDot(l25, 255, 255, 255);
        }

        rc.setIndicatorDot(l26, 255, 0, 255);
        if (b26) {
            rc.setIndicatorDot(l26, 255, 255, 255);
        }

        rc.setIndicatorDot(l27, 255, 0, 255);
        if (b27) {
            rc.setIndicatorDot(l27, 255, 255, 255);
        }

        rc.setIndicatorDot(l28, 255, 0, 255);
        if (b28) {
            rc.setIndicatorDot(l28, 255, 255, 255);
        }

        rc.setIndicatorDot(l29, 255, 0, 255);
        if (b29) {
            rc.setIndicatorDot(l29, 255, 255, 255);
        }

        rc.setIndicatorDot(l35, 255, 0, 255);
        if (b35) {
            rc.setIndicatorDot(l35, 255, 255, 255);
        }

        rc.setIndicatorDot(l36, 255, 0, 255);
        if (b36) {
            rc.setIndicatorDot(l36, 255, 255, 255);
        }

        rc.setIndicatorDot(l37, 255, 0, 255);
        if (b37) {
            rc.setIndicatorDot(l37, 255, 255, 255);
        }

        rc.setIndicatorDot(l38, 255, 0, 255);
        if (b38) {
            rc.setIndicatorDot(l38, 255, 255, 255);
        }

        rc.setIndicatorDot(l44, 255, 0, 255);
        if (b44) {
            rc.setIndicatorDot(l44, 255, 255, 255);
        }

        rc.setIndicatorDot(l45, 255, 0, 255);
        if (b45) {
            rc.setIndicatorDot(l45, 255, 255, 255);
        }

        rc.setIndicatorDot(l46, 255, 0, 255);
        if (b46) {
            rc.setIndicatorDot(l46, 255, 255, 255);
        }

        rc.setIndicatorDot(l47, 255, 0, 255);
        if (b47) {
            rc.setIndicatorDot(l47, 255, 255, 255);
        }

        rc.setIndicatorDot(l54, 255, 0, 255);
        if (b54) {
            rc.setIndicatorDot(l54, 255, 255, 255);
        }

        rc.setIndicatorDot(l55, 255, 0, 255);
        if (b55) {
            rc.setIndicatorDot(l55, 255, 255, 255);
        }

        rc.setIndicatorDot(l56, 255, 0, 255);
        if (b56) {
            rc.setIndicatorDot(l56, 255, 255, 255);
        }

        rc.setIndicatorDot(l63, 255, 0, 255);
        if (b63) {
            rc.setIndicatorDot(l63, 255, 255, 255);
        }

    }

    public Direction getBestDirection(MapLocation targetLocation) throws GameActionException {
        currentLocation = rc.getLocation();

        globalBest = 1000000;
        if (!targetLocation.equals(this.targetLocation)) {
            globalBest = 1000000;
            this.targetLocation = targetLocation;
            lastDirection = Direction.CENTER;
            closestWallLocations.clear();
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

        lastDirection = ans;
        return ans;
    }

    private double dot(Direction directionA, Direction directionB) {
        return directionA.getDeltaX() * directionB.getDeltaX() + directionA.getDeltaY() * directionB.getDeltaY();
    }
}