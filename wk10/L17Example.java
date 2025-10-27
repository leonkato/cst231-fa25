package wk10;

import java.util.Random;

public class L17Example {
    public static void main(String[] args) {
        Random rgen = new Random();
        double sum = 0;
        double rVal;
        for (int i = 0; i < 10; i++) {
            rVal = myRandom(rgen);
            System.out.println(rVal);
            sum += rVal;
        }
        System.out.println("The sum is: " + sum);
    }

    public static double myRandom(Random rgen) {
        // return a random number between 0.1 and 1, in increments of 0.1
        return (Math.abs(rgen.nextInt()) % 10 + 1) / 10.0;
    }


}
