package implementation;

import com.tartarjr.IO;

import java.util.List;
import java.util.Scanner;

/**
 * Created by tatarJR on 3/30/2017.
 */
public class QueensAttackII {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int rQueen = in.nextInt();
        int cQueen = in.nextInt();

        List<Integer> inputs = IO.readFile();

        int movesToEast = n - cQueen;
        int movesToWest = cQueen - 1;
        int movesToNorth = n - rQueen;
        int movesToSouth = rQueen - 1;
        int movesToSouthWest = Math.min(rQueen, cQueen) - 1;
        int movesToNorthEast = n - Math.max(rQueen, cQueen);
        int movesToSouthEast = Math.min(rQueen - 1, n - cQueen);
        int movesToNorthWest = Math.min(n - rQueen, cQueen - 1);

        for (int a0 = 0; a0 <= inputs.size() - 2; a0 += 2) {
            int rObstacle = inputs.get(a0);
            int cObstacle = inputs.get(a0 + 1);

            if (cQueen < cObstacle && rQueen == rObstacle) {
                movesToEast = Math.min(movesToEast, cObstacle - cQueen - 1);
            }
            if (cQueen > cObstacle && rQueen == rObstacle) {
                movesToWest = Math.min(movesToWest, cQueen - cObstacle - 1);
            }
            if (rQueen < rObstacle && cQueen == cObstacle) {
                movesToNorth = Math.min(movesToNorth, rObstacle - rQueen - 1);
            }
            if (rQueen > rObstacle && cQueen == cObstacle) {
                movesToSouth = Math.min(movesToSouth, rQueen - rObstacle - 1);
            }
            if (rQueen > rObstacle && cQueen > cObstacle && rQueen - rObstacle == cQueen - cObstacle) {
                movesToSouthWest = Math.min(movesToSouthWest, rQueen - rObstacle - 1);
            }
            if (rQueen < rObstacle && cQueen < cObstacle && rObstacle - rQueen == cObstacle - cQueen) {
                movesToNorthEast = Math.min(movesToNorthEast, rObstacle - rQueen - 1);
            }
            if (rQueen > rObstacle && cQueen < cObstacle && rQueen - rObstacle == cObstacle - cQueen) {
                movesToSouthEast = Math.min(movesToSouthEast, rQueen - rObstacle - 1);
            }
            if (rQueen < rObstacle && cQueen > cObstacle && rObstacle - rQueen == cQueen - cObstacle) {
                movesToNorthWest = Math.min(movesToNorthWest, rObstacle - rQueen - 1);
            }
        }

        System.out.println(movesToEast + movesToWest + movesToNorth + movesToSouth + movesToSouthWest + movesToNorthEast + movesToSouthEast + movesToNorthWest);
    }

}
