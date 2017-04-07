package implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by tatarJR on 3/17/2017.
 */
public class PickingNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        //sort the array
        Arrays.sort(a);

        int max = 0;

        for (int i = 0; i < n - 1; i++) {

            int count = 0;

            //check there is/are consecutive or equal numbers(s) to a[i] in the array
            if ((Math.abs(a[i] - a[i + 1]) <= 1)) {
                for (int j = i + 1; j < n; j++) {

                    //determine all consecutive or equal numbers to a[i] in the array and increase the count
                    if ((Math.abs(a[i] - a[j]) <= 1)) {
                        count++;
                    }

                    //determine the size of maximum consecutive sequence
                    if(count > max) {
                        max = count;
                    }
                }
            }
        }

        //+1 represents the number a[i]
        System.out.println(max + 1);
    }
}
