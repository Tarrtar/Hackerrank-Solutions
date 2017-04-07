package warmups;

import java.util.Scanner;

/**
 * Created by emuoztu on 3/8/2017.
 */
public class CompareTheTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        int[] aliceArray = {a0, a1, a2};
        int[] bobArray = {b0, b1, b2};

        int alicePoints = 0;
        int bobPoints = 0;

        for(int i=0; i<3; i++) {
            if(aliceArray[i] > bobArray[i]) {
                alicePoints += 1;
            } else if(bobArray[i] > aliceArray[i]) {
                bobPoints += 1;
            }
        }

        System.out.println(alicePoints + " " + bobPoints);
    }
}
