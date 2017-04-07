package implementation;

import java.util.Scanner;

/**
 * Created by emuoztu on 3/21/2017.
 */
public class SequenceEquation {

    public static void main(String args[]) throws Exception {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
    }

    private static void bruteForce(int[] pValues) {

        for (int i = 1; i <= pValues.length; i++) {
            for (int j = 0; j < pValues.length; j++) {
                if (i == pValues[j]) {
                    for (int k = 0; k < pValues.length; k++) {
                        if (j + 1 == pValues[k]) {
                            System.out.println(k + 1);
                        }
                    }
                }
            }
        }

    }

}
