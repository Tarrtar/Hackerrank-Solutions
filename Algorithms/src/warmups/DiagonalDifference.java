package warmups;

import java.util.Scanner;

/**
 * Created by emuoztu on 3/8/2017.
 */
public class DiagonalDifference {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];

        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }

        int sumPrimaryDiagonal = 0;
        int sumSecondaryDiagonal = 0;

        for(int a_i=0; a_i < n; a_i++){

            for(int a_j=0; a_j < n; a_j++){

                if(a_i == a_j) {
                    sumPrimaryDiagonal += a[a_i][a_j];
                }

                if(a_i + a_j == n - 1) {
                    sumSecondaryDiagonal += a[a_i][a_j];
                }
            }
        }

        int sum = sumPrimaryDiagonal - sumSecondaryDiagonal;

        if (sum < 0) {
            sum *= -1;
        }

        System.out.println(sum);
    }

}
