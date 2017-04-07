package implementation;

import java.util.Scanner;

/**
 * Created by tatarJR on 3/22/2017.
 */
public class AppendAndDelete {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();
        String t = in.next();

        int k = in.nextInt();

        int size = s.length() > t.length() ? t.length() : s.length();

        int i = 0;
        for (; i < size; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                break;
            }
        }

        int numOfMinOperations = s.length() + t.length() - 2 * i;

        System.out.println(numOfMinOperations);

        if((numOfMinOperations <= k && (k - numOfMinOperations) % 2 == 0) || s.length() + t.length() < k) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
