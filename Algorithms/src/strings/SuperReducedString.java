package strings;

import java.util.*;

/**
 * Created by emuoztu on 4/3/2017.
 */
public class SuperReducedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();

        StringBuilder sBuilder = new StringBuilder(s);

        int i = 0;
        while (i + 1 < sBuilder.length()) {
            if (sBuilder.charAt(i) == sBuilder.charAt(i + 1)) {
                sBuilder = sBuilder.delete(i, i + 2);
                i = 0;
            } else {
                i++;
            }
        }

        System.out.println(sBuilder.toString().equals("") ? "Empty String" : sBuilder.toString());
    }

}
