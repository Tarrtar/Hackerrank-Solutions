package warmup;

import java.util.Scanner;

/**
 * Created by tatarJR on 3/8/2017.
 */
public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=0; i<n; i++) {
            for(int j=i; j<n-1; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<i+1; k++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }

}
