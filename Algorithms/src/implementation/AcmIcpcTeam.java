package implementation;

import com.tartarjr.IO;

import java.util.List;
import java.util.Scanner;

/**
 * Created by tatarJR on 3/30/2017.
 */
public class AcmIcpcTeam {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        String topic[] = new String[n];

        List<String> inputs = IO.readFile2();

        for (int topic_i = 0; topic_i < n; topic_i++) {
            topic[topic_i] = inputs.get(topic_i);
        }

        int maxTopics = 0;
        int maxTeams = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                int count = 0;
                for (int k = 0; k < m; k++) {
                    if (topic[i].charAt(k) == '1' || topic[j].charAt(k) == '1') {
                        count++;
                    }
                }
                if (count > maxTopics) {
                    maxTopics = count;
                    maxTeams = 1;
                } else if (count == maxTopics) {
                    maxTeams++;
                }
            }
        }

        System.out.println(maxTopics);
        System.out.println(maxTeams);
    }

}
