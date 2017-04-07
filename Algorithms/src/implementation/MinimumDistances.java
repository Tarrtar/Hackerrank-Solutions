package implementation;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by tatarJR on 3/31/2017.
 */
public class MinimumDistances {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for (int A_i = 0; A_i < n; A_i++) {
            A[A_i] = in.nextInt();
        }

        int minDistance = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && A[i] == A[j]) {
                    minDistance = minDistance == -1 ? Math.abs(i - j) : Math.min(minDistance, Math.abs(i - j));
                }
            }
        }

        System.out.println(minDistance);
    }

}
