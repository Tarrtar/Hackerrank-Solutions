package warmup;

import java.util.Scanner;

/**
 * Created by tatarJR on 3/8/2017.
 */
public class SimpleArraySum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        int sum = 0;

        for(int arr_i=0; arr_i < n; arr_i++){
            sum += arr[arr_i];
        }

        System.out.println(sum);

    }

}
