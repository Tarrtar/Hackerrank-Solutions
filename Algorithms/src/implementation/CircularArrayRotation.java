package implementation;

import java.util.Scanner;

/**
 * Created by tatarJR on 3/21/2017.
 */
public class CircularArrayRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        for (int a0 = 0; a0 < q; a0++) {
            int m = in.nextInt();
            System.out.println(m - (k % n) < 0 ? a[m - (k % n) + n] : a[m - (k % n)]);
        }
    }

    private static int[] getRotatedArray(int[] a, int k) {

        int[] rotatedArray = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            rotatedArray[(i + k) % a.length] = a[i];
        }

        return rotatedArray;
    }

}
