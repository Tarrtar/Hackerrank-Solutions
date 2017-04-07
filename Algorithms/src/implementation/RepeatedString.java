package implementation;

import java.util.Scanner;

/**
 * Created by emuoztu on 3/26/2017.
 */
public class RepeatedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();

        char[] sChars = s.toCharArray();

        //find total numbers of letter a for given string s
        long numOfLetterA = 0;
        long stringLength = s.length();

        for (int i = 0; i < stringLength; i++) {
            if (sChars[i] == 'a') {
                numOfLetterA++;
            }
        }

        //calculate total number of letter a for number of sets found in infinite string
        long numOfLetterAForSets = (n / stringLength) * numOfLetterA;

        //find total number of letter a for remainder string
        long numOfLetterAForRemainder = 0;
        long remainderSize = n % stringLength;
        for (int i = 0; i < remainderSize; i++) {
            if (sChars[i] == 'a') {
                numOfLetterAForRemainder++;
            }
        }

        long totalNumberOfLetterA = numOfLetterAForSets + numOfLetterAForRemainder;

        System.out.println(totalNumberOfLetterA);
    }

}
