package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by emuoztu on 3/8/2017.
 */
public class Gemstones {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        List<String> stones = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            String s = input.next();
            stones.add(s);
        }

        String anyStone = stones.get(0);
        //System.out.println("anystone: " + anyStone);
        stones.remove(0);
        List<Character> gemStones = new ArrayList<>();
        int letterCounter = 0;

        for (int i = 0; i < anyStone.length(); i++) {
            for (String stone : stones) {
                if(stone.indexOf(anyStone.charAt(i)) != -1) {
                    //System.out.println(anyStone.charAt(i));
                    letterCounter++;

                    if (letterCounter == (t-1)) {
                        if (!gemStones.contains(anyStone.charAt(i))) {
                            gemStones.add(anyStone.charAt(i));
                        }
                    }
                }
            }

            //System.out.println("t-1: " + (t-1));
            //System.out.println("lettercounter: " + letterCounter);

            letterCounter = 0;
        }

        System.out.println(gemStones.size());
    }

}
