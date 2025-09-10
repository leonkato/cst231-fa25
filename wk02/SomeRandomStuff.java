package wk02;

import java.util.Random;

public class SomeRandomStuff {
    public static void main(String[] args) {
        // make a new random number generator

        Random rand = new Random();

        int myRandomInt = rand.nextInt();

        System.out.println(myRandomInt);

/*
        Minimum value: -2,147,483,648 (-2^31)
        Maximum value: 2,147,483,647 (2^31 - 1)
*/

        // Take the absolute value
        System.out.println();
        System.out.println(Math.abs(myRandomInt));
        System.out.println();
        // And mod by the size of the range
        System.out.println();
        System.out.println(Math.abs(myRandomInt) % 5);
        System.out.println();
        // adjust by 1 to move the range from [0, (n-1)] to [1, n]
        System.out.println();
        System.out.println(Math.abs(myRandomInt) % 12 + 1);
        System.out.println();


    }
}

