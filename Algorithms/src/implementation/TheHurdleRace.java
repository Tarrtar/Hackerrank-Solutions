package implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by emuoztu on 3/20/2017.
 */
public class TheHurdleRace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for (int height_i = 0; height_i < n; height_i++) {
            height[height_i] = in.nextInt();
        }

        Arrays.sort(height);

        System.out.println(k >= height[n - 1] ? 0 : height[n - 1] - k);
    }

}
