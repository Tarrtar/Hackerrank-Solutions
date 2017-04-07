package strings;

import java.util.Scanner;

/**
 * Created by tatarJR on 3/8/2017.
 */
public class AlternatingCharacters {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            String s = in.next();
            System.out.println(getMinNumOfDeletes(s));
        }
    }

    private static int getMinNumOfDeletes(String s) {
        int minNumOfDeletes = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            String currentChar = Character.toString(s.charAt(i));
            String charBefore = "";
            String charAfter = Character.toString(s.charAt(i+1));;

            if (currentChar.equals(charAfter)) {
                minNumOfDeletes++;
            }
        }

        return minNumOfDeletes;
    }

}
