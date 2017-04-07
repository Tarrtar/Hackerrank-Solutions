package implementation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by emuoztu on 3/31/2017.
 */
public class BeautifulTriplets {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        ArrayList<Integer> sequence = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            sequence.add(in.nextInt());
        }

        int tripleCount = 0;

        for (int i : sequence) {
            if (sequence.contains((i + k)) && sequence.contains(i + 2 * k)) {
                tripleCount++;
            }
        }

        System.out.println(tripleCount);
    }

}
