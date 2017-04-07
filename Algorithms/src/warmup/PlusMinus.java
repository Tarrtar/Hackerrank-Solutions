package warmup;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by emuoztu on 3/8/2017.
 */
public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        double numOfPositives = 0;
        double numOfNegatives = 0;
        double numOfZeros = 0;

        for(int arr_i=0; arr_i < n; arr_i++){
            if(arr[arr_i] > 0) {

                numOfPositives += 1;
            } if(arr[arr_i] < 0) {

                numOfNegatives += 1;
            } if(arr[arr_i] == 0) {

                numOfZeros += 1;
            }
        }

        double positiveFraction =  numOfPositives / n;
        double negativeFraction =  numOfNegatives / n;
        double zeroFraction =  numOfZeros / n;

        NumberFormat formatter = new DecimalFormat("#0.0000");

        System.out.println(formatter.format(positiveFraction));
        System.out.println(formatter.format(negativeFraction));
        System.out.println(formatter.format(zeroFraction));
    }

}
