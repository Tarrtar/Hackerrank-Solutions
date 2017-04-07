package implementation;

import java.util.Scanner;

/**
 * Created by tatarJR on 3/8/2017.
 */
public class GradingStudents {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int a0 = 0; a0 < n; a0++) {
            int grade = in.nextInt();

            System.out.println(getRoundedGrade(grade));

        }
    }

    private static int getRoundedGrade(int grade) {

        int roundedGrade = grade;
        int nextMultiplyofFive = ((grade + 4) / 5) * 5;
        int difference = nextMultiplyofFive - grade;

        if (grade >= 38 && difference < 3 ) {
            roundedGrade = nextMultiplyofFive;
        }

        return roundedGrade;
    }

}
