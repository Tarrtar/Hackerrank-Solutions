package implementation;

import java.util.Scanner;

/**
 * Created by emuoztu on 3/17/2017.
 */
public class CatsAndAMouse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            printWhoCatches(x, y, z);
        }
    }

    private static void printWhoCatches(int x, int y, int z) {

        int distanceX = Math.abs(x - z);
        int distanceY = Math.abs(y - z);

        if (distanceX > distanceY) {
            System.out.println("Cat B");
        } else if (distanceX < distanceY) {
            System.out.println("Cat A");
        } else {
            System.out.println("Cat B");
        }
    }

}
