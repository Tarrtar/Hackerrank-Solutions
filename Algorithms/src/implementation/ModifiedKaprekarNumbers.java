package implementation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tatarJR on 3/8/2017.
 */
public class ModifiedKaprekarNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();

        printModifiedKaprekarsInRange(p, q);
    }

    private static void printModifiedKaprekarsInRange(int p, int q) {

        ArrayList<Integer> modifiedKaprekarNumbers = new ArrayList();

        for (int i = p; i <= q ; i++) {
            if (isModifiedKaprekarNumber(i)) {
                modifiedKaprekarNumbers.add(i);
            }
        }

        if (modifiedKaprekarNumbers.size() > 0) {
            for (Integer modifiedKaprekarNumber : modifiedKaprekarNumbers) {
                System.out.print(modifiedKaprekarNumber + " ");
            }
        } else {
            System.out.println("INVALID RANGE");
        }

    }

    private static boolean isModifiedKaprekarNumber (int number) {

        boolean isKaprekar = false;

        String numberString = Integer.toString(number);
        int numberDigits = numberString.length();

        long square = (long)number*(long)number;
        String squareString = Long.toString(square);
        int squareDigits = squareString.length();

        String right = squareString.substring(squareDigits - numberDigits);
        String left = squareString.substring(0, squareDigits - right.length());

        if (squareDigits == 1) {
            left = "0";
        }

        int leftNum = Integer.parseInt(left);
        int rightNum = Integer.parseInt(right);

        if ((leftNum + rightNum) == number) {
            isKaprekar = true;
        }

        return isKaprekar;
    }

}
