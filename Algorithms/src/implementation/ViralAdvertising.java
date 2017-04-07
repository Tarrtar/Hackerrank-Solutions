package implementation;

import java.util.Scanner;

/**
 * Created by emuoztu on 3/21/2017.
 */
public class ViralAdvertising {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int totalPeopleReached = 0;
        int peopleReachedForDay = 0;

        for (int day = 1; day <= n; day++) {
            if (day == 1) {
                //inital people 5, 5/2 = 2
                peopleReachedForDay = 2;
            } else {
                peopleReachedForDay = (peopleReachedForDay * 3) / 2;

            }

            totalPeopleReached += peopleReachedForDay;
        }

        System.out.println(totalPeopleReached);

    }

}
