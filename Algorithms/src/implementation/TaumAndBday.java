package implementation;

import java.util.Scanner;

/**
 * Created by emuoztu on 3/8/2017.
 */
public class TaumAndBday {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();

            System.out.println(calculateTotalPrice(b, w, x, y, z));
        }
    }

    private static long calculateTotalPrice(long numberBlack, long numberWhite, long priceBlack, long priceWhite, long convertCost) {

        long totalPrice = 0;

        if(convertCost > priceBlack && convertCost > priceWhite){
            totalPrice = (priceBlack*numberBlack) + (priceWhite*numberWhite);
        }
        else if(priceBlack+convertCost < priceWhite){
            totalPrice= (priceBlack*numberBlack) + (priceBlack*numberWhite) + (numberWhite*convertCost);
        }
        else if(priceWhite+convertCost < priceBlack){
            totalPrice = (priceWhite*numberBlack) + (priceWhite*numberWhite) + (numberBlack*convertCost);
        }
        else{
            totalPrice = (priceBlack*numberBlack) + (priceWhite*numberWhite);
        }

        return totalPrice;
    }

}
