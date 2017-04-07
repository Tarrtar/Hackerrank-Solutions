package strings;

import java.util.Scanner;

/**
 * Created by tatarJR on 3/8/2017.
 */
public class FunnyString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for (int i = 0; i < t; i++) {

            String s = input.next();

            if (isFunny(s)) {
                System.out.println("Funny");
            }else{
                System.out.println("Not Funny");
            }
        }
    }

    private static boolean isFunny(String s) {
        boolean isFunny = true;

        String rs = new StringBuilder(s).reverse().toString();

        for (int i = 1; i < s.length(); i++) {

            int asciDiffS = s.charAt(i) - s.charAt(i-1);
            int asciDiffRs = rs.charAt(i) - rs.charAt(i-1);

            if (Math.abs(asciDiffS) != Math.abs(asciDiffRs)) {
                isFunny = false;
            }
        }

        return isFunny;
    }

}
