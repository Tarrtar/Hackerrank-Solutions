package implementation;

import java.util.Scanner;

/**
 * Created by tatarJR on 3/24/2017.
 */
public class LibraryFine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int returnDay = in.nextInt();
        int returnMonth = in.nextInt();
        int returnYear = in.nextInt();

        int expectedDay = in.nextInt();
        int expectedMonth = in.nextInt();
        int expectedYear = in.nextInt();

        int libraryFine = 0;

        if (expectedYear < returnYear) {
            libraryFine = 10000;
        } else if (expectedYear == returnYear) {
            if (expectedMonth < returnMonth) {
                libraryFine = 500 * (returnMonth - expectedMonth);
            } else if(expectedMonth == returnMonth) {
                if (expectedDay < returnDay) {
                    libraryFine = 15 * (returnDay - expectedDay);
                }
            }
        }

        System.out.println(libraryFine);
    }
}
