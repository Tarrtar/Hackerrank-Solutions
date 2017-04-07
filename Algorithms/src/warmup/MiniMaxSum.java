package warmup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by emuoztu on 3/8/2017.
 */
public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();

        long[] nums = new long[5];
        nums[0] = a;
        nums[1] = b;
        nums[2] = c;
        nums[3] = d;
        nums[4] = e;

        Arrays.sort(nums);

        long sum = 0;

        for(int i = 0; i < 5; i++) {
            sum += nums[i];
        }

        long minSum = sum - nums[4];
        long maxSum = sum - nums[0];

        System.out.print(minSum);
        System.out.print(" ");
        System.out.print(maxSum);

    }

}
