package org.example;

import java.util.ArrayList;
import java.util.List;

public  class Chess {
    public static String solve(int kingX, int kingY, int rook1X, int rook1Y, int rook2X, int rook2Y, int rook3X, int rook3Y){

        String result = "";

        if (rook1X == kingX || rook1Y == kingY) {
            result += 1;
        }

        if (rook2X == kingX || rook2Y == kingY) {
            result += " " +  2;
        }

        if (rook3X == kingX || rook3Y == kingY) {
            result += " " + 3;
        }
        if (result.length() != 0) {
         return result.strip();
        }
        return "0";
    }
}

