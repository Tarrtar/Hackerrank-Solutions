package implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by tatarJR on 3/8/2017.
 */
public class SockMerchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }

        Map<Integer,Integer> counterMap = new HashMap<>();

        for (int i = 0; i < c.length; i++) {

            int count = 0;

            for (int j = 0; j < c.length; j++) {
                if (c[i] == c[j]) {
                    count++;
                }
            }

            if (!counterMap.containsKey(c[i])) {
                counterMap.put(c[i], count);
            }

        }

        int pair = 0;

        for (Map.Entry<Integer,Integer> entry : counterMap.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            //System.out.println("Number:" + key + " ," + "Count:" + value);

            pair += value / 2;

        }

        System.out.println(pair);

    }

}
