package strings;

import java.util.Scanner;

/**
 * Created by tatarJR on 4/3/2017.
 */
public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        String sLowerCase = s.toLowerCase();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != sLowerCase.charAt(i)) {
                count++;
            }
        }

        System.out.println(count + 1);
    }

}
