package implementation;

import java.util.Scanner;

/**
 * Created by emuoztu on 3/8/2017.
 */
public class FindDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();

            System.out.println(getNumOfDivisibleDigits(n));
        }
    }

    private static int getNumOfDivisibleDigits(int n) {

        int numOfDivisibleDigits = 0;

        String nString = Integer.toString(n);
        char[] nDigits = nString.toCharArray();

        for (char nDigit : nDigits) {
            int digit = Integer.parseInt(Character.toString(nDigit));

            if ((digit != 0) && (n % digit == 0)) {
                numOfDivisibleDigits++;
            }
        }

        return numOfDivisibleDigits;
    }

}
