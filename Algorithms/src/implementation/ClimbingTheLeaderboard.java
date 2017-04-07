package implementation;

import java.util.*;

/**
 * Created by tatarJR on 3/18/2017.
 */
public class ClimbingTheLeaderboard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        ArrayList<Integer> uniqueScores = new ArrayList<>();

        int temp = 0;

        for (int scores_i = 0; scores_i < n; scores_i++) {

            int score = in.nextInt();

            if (scores_i == 0) {
                uniqueScores.add(score);
            } else {
                if (score != temp) {
                    uniqueScores.add(score);
                }
            }

            temp = score;
        }

        int m = in.nextInt();
        int[] alice = new int[m];
        for (int alice_i = 0; alice_i < m; alice_i++) {
            alice[alice_i] = in.nextInt();
        }

        Collections.reverse(uniqueScores);

        for (int i = 0; i < m; i++) {
            int index = Collections.binarySearch(uniqueScores, alice[i]);
            System.out.println(index >= 0 ? uniqueScores.size() - index : uniqueScores.size() - ~index + 1);
        }
    }

}
