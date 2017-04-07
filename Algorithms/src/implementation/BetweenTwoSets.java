package implementation;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by emuoztu on 3/10/2017.
 */
public class BetweenTwoSets {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        int[] b = new int[m];
        for (int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
        }

        long startTime = System.currentTimeMillis();

        Arrays.sort(a);
        Arrays.sort(b);

        int max = 0;
        int min = 0;

        if (a[n - 1] > b[m - 1]) {
            max = a[n - 1];
        } else {
            max = b[m - 1];
        }

        if (a[0] > b[0]) {
            min = b[0];
        } else {
            min = a[0];
        }

        ArrayList<Integer> numbersBetweenSets = new ArrayList<>();

        for (int i = min; i <= max; i++) {

            int factorCount = 0;

            for (int j = 0; j < n; j++) {
                if (i >= a[j] && (i % a[j] == 0)) {
                    factorCount++;
                    if ((!numbersBetweenSets.contains(i)) && factorCount == n) {
                        numbersBetweenSets.add(i);
                    }
                }
            }
        }

        int betweenSetsCount = 0;

        for (int i : numbersBetweenSets) {

            int factorCount = 0;

            for (int k = 0; k < m; k++) {
                if (b[k] >= i && (b[k] % i == 0)) {
                    factorCount++;
                    if (factorCount == m) {
                        betweenSetsCount++;
                    }
                }
            }
        }

        System.out.println(betweenSetsCount);

        long endTime = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Execution time is " + formatter.format((endTime - startTime) / 1000d) + " seconds");
    }
}
