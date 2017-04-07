package implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by tatarJR on 3/17/2017.
 */
public class BreakingTheRecords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];

        for (int score_i = 0; score_i < n; score_i++) {
            score[score_i] = in.nextInt();
        }

        int maxCount = 0;
        int minCount = 0;

        int currentMin = score[0];
        int currentMax = score[0];

        for (int i = 0; i < n; i++) {

            if (score[i] > currentMax) {
                maxCount++;
                currentMax = score[i];
            }

            if (score[i] < currentMin) {
                minCount++;
                currentMin = score[i];
            }
        }

        System.out.print(maxCount);
        System.out.print(" ");
        System.out.print(minCount);
    }

}
