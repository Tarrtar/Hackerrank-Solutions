package implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by emuoztu on 3/26/2017.
 */
public class EqualizeTheArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        Map<Integer, Integer> numbersCountsMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int number = in.nextInt();

            if (!numbersCountsMap.containsKey(number)) {
                numbersCountsMap.put(number, 1);
            } else {
                numbersCountsMap.put(number, numbersCountsMap.get(number) + 1);
            }
        }

        int maxCount = numbersCountsMap.values().stream().max(Integer::compare).get();

        System.out.println(n - maxCount);
    }
}
