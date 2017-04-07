package implementation;

import java.util.Scanner;

/**
 * Created by tatarJR on 3/20/2017.
 */
public class BeautifulDaysAtTheMovies {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int startDay = in.nextInt();
        int endDay = in.nextInt();
        int divider = in.nextInt();

        int count = 0;

        for (int i = startDay; i <= endDay; i++) {
            if (Math.abs(i - reverseInt(i)) % divider == 0) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static int reverseInt(int num) {
        long reversedNum = 0;

        while (num != 0) {
            reversedNum = reversedNum * 10;
            reversedNum = reversedNum + num % 10;
            num = num / 10;
        }

        return (int) reversedNum;
    }

}
