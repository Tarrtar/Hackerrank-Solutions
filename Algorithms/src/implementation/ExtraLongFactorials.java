package implementation;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by tatarJR on 3/22/2017.
 */
public class ExtraLongFactorials {

    //important!! learn how java stores short,long numbers integers, big integers and decimals, floats, doubles etc
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        BigInteger factorial = new BigInteger("1");

        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(factorial);
    }

}
