package implementation;

import java.util.Scanner;

/**
 * Created by emuoztu on 3/8/2017.
 */
public class CutTheSticks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        int shortestStick = 0;

        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        findNumberOfCuts(arr);
    }

    private static void findNumberOfCuts(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int shortestStick = getShortestStick(array);
            int numberOfCuts = 0;

            for (int j = 0; j < array.length; j++) {

                if (!(array[j] - shortestStick < 0)) {
                    array[j] = array[j] - shortestStick;
                    numberOfCuts++;
                    //System.out.println("index:" + j + " " + "length:" + array[j]);
                } else {
                    //System.out.println("index:" + j + " " + "length:" + array[j]);
                }

            }

            if (numberOfCuts != 0) {
                System.out.println(numberOfCuts);
            }
        }
    }

    private static int getShortestStick(int[] array) {

        int min = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++)
        {
            if(array[i] < min && array[i] != 0)
                min = array[i];
        }

        return min;
    }

}
