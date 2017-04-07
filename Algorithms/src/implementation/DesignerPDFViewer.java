package implementation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by emuoztu on 3/8/2017.
 */
public class DesignerPDFViewer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        /*for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }*/

        String word = "abc";

        getTotalHighlightedArea(h, word);
        //System.out.println(getTotalHighlightedArea(h, word));
    }

    private static int getTotalHighlightedArea(int[] h, String word) {
        ArrayList<Integer> positions = getPositionsInAlphabet(word);

        int maxHeight = 0;

        for (int position : positions) {
            if (h[position - 1] > maxHeight) {
                maxHeight = h[position - 1];
            }
        }

        int totalHighlightedArea = maxHeight * word.length();

        return totalHighlightedArea;
    }

    //lower case
    private static ArrayList<Integer> getPositionsInAlphabet (String s) {

        ArrayList<Integer> positions = new ArrayList<>();

        char[] ch  = s.toCharArray();

        int index = 0;

        for(char c : ch) {
            int temp = (int)c;
            int temp_integer = 96;
            if(temp<=122 & temp>=97) {
                positions.add(temp-temp_integer);
                //System.out.print(temp-temp_integer);
            }

            index++;
        }

        return positions;
    }

}
