package implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by tatarJR on 3/17/2017.
 */
public class MigratoryBirds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];

        for (int types_i = 0; types_i < n; types_i++) {
            types[types_i] = in.nextInt();
        }

        Map<Integer, Integer> typeCountsMap = new HashMap<Integer, Integer>();

        for (int i : types) {
            if (typeCountsMap.containsKey(i)) {
                typeCountsMap.put(i, typeCountsMap.get(i) + 1);
            } else {
                typeCountsMap.put(i, 1);
            }
        }

        Map.Entry<Integer, Integer> maxEntry = null;

        for (Map.Entry<Integer, Integer> entry : typeCountsMap.entrySet()) {

            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }

            if (entry.getValue() == maxEntry.getValue() && entry.getKey() < maxEntry.getKey()) {
                maxEntry = entry;
            }
        }

        System.out.println("ID: " + maxEntry.getKey() + ", VALUE: " + maxEntry.getValue());

    }
}
