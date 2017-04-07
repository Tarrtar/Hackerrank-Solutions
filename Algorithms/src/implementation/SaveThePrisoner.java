package implementation;

import java.util.Scanner;

/**
 * Created by tatarJR on 3/21/2017.
 */
public class SaveThePrisoner {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numOfTestCases = in.nextInt();

        for (int i = 0; i < numOfTestCases; i++) {
            int numOfPrisoners = in.nextInt();
            int numOfSweets = in.nextInt();
            int prisonerId = in.nextInt();

            int id = prisonerId + (numOfSweets % numOfPrisoners) - 1;

            if (id == 0) {
                id = numOfPrisoners;
            } else if(id > numOfPrisoners) {
                id = id % numOfPrisoners;
            }

            System.out.println(id);
        }
    }
}
