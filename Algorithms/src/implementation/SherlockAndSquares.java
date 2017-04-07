package implementation;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by tatarJR on 3/23/2017.
 */
public class SherlockAndSquares {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int startingNumber = in.nextInt();
            int endingNumber = in.nextInt();

            System.out.println((int) (Math.floor(Math.sqrt(endingNumber)) - Math.ceil(Math.sqrt(startingNumber)) + 1));
        }
    }


    private static void printSquareIntegers(int startRange, int endRange) {

        int count = 0;

        for (int i = startRange; i <= endRange; i++) {
            if (Math.sqrt((double) i) == (int) Math.sqrt((double) i)) {
                //System.out.println(i);
                count++;
            }
        }

        System.out.println(count);
    }
}
