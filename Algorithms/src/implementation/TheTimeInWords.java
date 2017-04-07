package implementation;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by emuoztu on 4/1/2017.
 */
public class TheTimeInWords {

    private static final HashMap<Integer, String> NUMBERS_IN_WORDS = new HashMap<>();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int hour = in.nextInt();
        int minute = in.nextInt();

        initializeMap();

        if (minute == 0) {
            System.out.println(NUMBERS_IN_WORDS.get(hour) + " o' clock");
        }
        if (minute == 1) {
            System.out.println(getMinuteInWords(minute) + " minute past " + NUMBERS_IN_WORDS.get(hour));
        }
        if (minute != 15 && minute > 1 && minute <= 29) {
            System.out.println(getMinuteInWords(minute) + " minutes past " + NUMBERS_IN_WORDS.get(hour));
        }
        if (minute == 15) {
            System.out.println("quarter past " + NUMBERS_IN_WORDS.get(hour));
        }
        if (minute == 30) {
            System.out.println("half past " + NUMBERS_IN_WORDS.get(hour));
        }
        if (minute != 45 && minute >= 31 && minute <= 59) {
            System.out.println(getMinuteInWords(60 - minute) + " minutes to " + NUMBERS_IN_WORDS.get((hour + 1) % 12));
        }
        if (minute == 45) {
            System.out.println("quarter to " + NUMBERS_IN_WORDS.get((hour + 1) % 12));
        }

    }

    private static void initializeMap() {
        NUMBERS_IN_WORDS.put(1, "one");
        NUMBERS_IN_WORDS.put(2, "two");
        NUMBERS_IN_WORDS.put(3, "three");
        NUMBERS_IN_WORDS.put(4, "four");
        NUMBERS_IN_WORDS.put(5, "five");
        NUMBERS_IN_WORDS.put(6, "six");
        NUMBERS_IN_WORDS.put(7, "seven");
        NUMBERS_IN_WORDS.put(8, "eight");
        NUMBERS_IN_WORDS.put(9, "nine");
        NUMBERS_IN_WORDS.put(10, "ten");
        NUMBERS_IN_WORDS.put(11, "eleven");
        NUMBERS_IN_WORDS.put(12, "twelve");
        NUMBERS_IN_WORDS.put(13, "thirteen");
        NUMBERS_IN_WORDS.put(20, "twenty");
    }

    private static String getMinuteInWords(int minute) {

        String minuteInWords = "";

        switch (minute) {
            case 0:
                minuteInWords = NUMBERS_IN_WORDS.get(0);
                break;
            case 10:
                minuteInWords = NUMBERS_IN_WORDS.get(10);
                break;
            case 11:
                minuteInWords = NUMBERS_IN_WORDS.get(11);
                break;
            case 12:
                minuteInWords = NUMBERS_IN_WORDS.get(12);
                break;
            case 13:
                minuteInWords = NUMBERS_IN_WORDS.get(13);
                break;
            default:
                minuteInWords = determineMinutesInWord(minute);
                break;
        }

        return minuteInWords;
    }

    private static String determineMinutesInWord(int minute) {
        int ones = minute % 10;
        int tens = minute / 10;

        String word = "";

        if (tens == 0) {
            word = NUMBERS_IN_WORDS.get(ones);
        }
        if (tens == 1) {
            word = NUMBERS_IN_WORDS.get(ones) + "teen";
        }
        if (tens == 2) {
            word = ones == 0 ? NUMBERS_IN_WORDS.get(20) : NUMBERS_IN_WORDS.get(20) + " " + NUMBERS_IN_WORDS.get(ones);
        }

        return word;
    }

}
