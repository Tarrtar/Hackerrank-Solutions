package implementation;

import java.util.Scanner;

/**
 * Created by tatarJR on 3/8/2017.
 */
public class AppleAndOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int houseStartPoint = in.nextInt();
        int houseEndPoint = in.nextInt();
        int appleTreePoint = in.nextInt();
        int orangeTreePoint = in.nextInt();
        int numOfApples = in.nextInt();
        int numOfOranges = in.nextInt();

        int[] apple = new int[numOfApples];
        int appleCount = 0;
        for(int apple_i=0; apple_i < numOfApples; apple_i++){
            apple[apple_i] = in.nextInt();

            if (apple[apple_i]  + appleTreePoint >= houseStartPoint && apple[apple_i]  + appleTreePoint <= houseEndPoint) {
                appleCount++;
            }
        }

        System.out.println(appleCount);

        int[] orange = new int[numOfOranges];
        int orangeCount = 0;
        for(int orange_i=0; orange_i < numOfOranges; orange_i++){
            orange[orange_i] = in.nextInt();

            if (orange[orange_i]  + orangeTreePoint >= houseStartPoint && orange[orange_i]  + orangeTreePoint <= houseEndPoint) {
                orangeCount++;
            }
        }

        System.out.println(orangeCount);
    }

}
