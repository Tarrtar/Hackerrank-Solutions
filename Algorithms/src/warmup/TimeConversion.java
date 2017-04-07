package warmup;

import java.util.Scanner;

/**
 * Created by emuoztu on 3/8/2017.
 */
public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();

        int hourDigits = Integer.parseInt(time.substring(0, 2));
        String noonIndıcator = time.substring(8, 10);

        //System.out.println(hourDigits);
        //System.out.println(noonIndıcator);

        String hourString = Integer.toString(hourDigits);

        if (noonIndıcator.equals("AM")) {
            if (hourDigits == 12) {
                hourDigits = 0;
                hourString = "0" + Integer.toString(hourDigits);
            }

            if(hourDigits < 10) {
                hourString = "0" + Integer.toString(hourDigits);
            }

        } else if(noonIndıcator.equals("PM")) {
            if (hourDigits < 12) {
                hourDigits += 12;
                hourString = Integer.toString(hourDigits);
            } else{

            }
        }

        String convertedTime = hourString + time.substring(2, 8);
        System.out.println(convertedTime);

    }

}
