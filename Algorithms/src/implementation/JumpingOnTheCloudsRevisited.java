package implementation;

import java.util.Scanner;

/**
 * Created by emuoztu on 3/22/2017.
 */
public class JumpingOnTheCloudsRevisited {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        /*int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }*/

        int thunder_cloud = 0;

        for (int i = 0; i < n; i++) {
            int ci = in.nextInt();
            if (i % k == 0)
                thunder_cloud = thunder_cloud + ci;
        }

        System.out.println(thunder_cloud);

        System.out.println(100 - n / k - thunder_cloud * 2);

        /*int totalEnergy = 100;

        int currentCloudIndex = 0;

        do {
            currentCloudIndex = (currentCloudIndex + k) % n;

            if (c[currentCloudIndex] == 1) {
                totalEnergy -= 3;
            } else {
                totalEnergy -= 1;
            }

        } while (currentCloudIndex != 0);

        System.out.println(totalEnergy);*/
    }

}
