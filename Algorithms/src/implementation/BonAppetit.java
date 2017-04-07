package implementation;

import java.util.Scanner;

/**
 * Created by tatarJR on 3/17/2017.
 */
public class BonAppetit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] prices = new int[n];
        int k = in.nextInt();

        int totalAnna = 0;

        for (int i = 0; i < n; i++) {
            prices[i] = in.nextInt();

            if(i != k) {
                totalAnna += prices[i];
            }
        }

        int chargedForAnna = in.nextInt();

        int difference = chargedForAnna - (totalAnna / 2);

        if(difference == 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(difference);
        }
    }

}
