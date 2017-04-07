package implementation;

import java.util.Scanner;

/**
 * Created by emuoztu on 3/17/2017.
 */
public class DrawingBook {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();

        int pagesFromStart = p / 2;
        int pagesFromEnd = (n - p) / 2;

        System.out.println(Math.min(pagesFromStart, pagesFromEnd));
    }

}
