package implementation;

import java.util.Scanner;

/**
 * Created by emuoztu on 3/20/2017.
 */
public class UtopianTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            System.out.println(getLatestTreeHeight(n));
        }
    }

    private static int getLatestTreeHeight(int cycle) {

        int height = 1;

        for (int i = 1; i <= cycle; i++) {
            if (i % 2 != 0) {
                height = height * 2;
            } else {
                height += 1;
            }
        }

        return height;
    }
}
