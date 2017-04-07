package com.tartarjr;

import java.util.Scanner;

/**
 * Created by emuoztu on 3/28/2017.
 */
public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int a0 = 0; a0 < n; a0++) {
            int rQueen = in.nextInt();
            int cQueen = in.nextInt();

            int maxMovesLeftBottom = Math.min(rQueen, cQueen) - 1;
            int maxMovesRightTop = n - Math.max(rQueen, cQueen);

            int maxMovesRightBottom = rQueen > cQueen ? n - Math.min(rQueen, cQueen) : n - Math.max(rQueen, cQueen);
            int maxMovesLeftTop = rQueen > cQueen ? n - Math.max(rQueen, cQueen) : n - Math.min(rQueen, cQueen);

            System.out.println("LEFT BOTTOM MAX: " + (rQueen - maxMovesLeftBottom) + ", " + (cQueen - maxMovesLeftBottom));
            System.out.println("RIGHT TOP MAX: " + (rQueen + maxMovesRightTop) + ", " + (cQueen + maxMovesRightTop));
            System.out.println("RIGHT BOTTOM MAX: " + (rQueen - maxMovesRightBottom) + ", " + (cQueen + maxMovesRightBottom));
            System.out.println("LEFT TOP MAX: " + (rQueen + maxMovesLeftTop) + ", " + (cQueen - maxMovesLeftTop));
            System.out.println("TOTAL MOVES: " + (maxMovesLeftBottom + maxMovesRightTop + maxMovesRightBottom + maxMovesLeftTop));
            System.out.println("*******");
        }
    }
}
