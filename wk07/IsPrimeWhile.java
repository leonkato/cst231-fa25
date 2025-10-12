package wk07;
import java.util.Scanner;

public class IsPrimeWhile {
    public static void main(String[] args) {
        // A prime is a positive integer > 1 with exactly two distinct positive divisors: 1 and itself.
        // The smallest prime is 2.
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = s.nextInt();

        boolean isPrime = true;
        int i = 2;

        while (i < num) {
            if (num % i == 0) {
                System.out.println("\t" + i);
                    isPrime = false;
            }
            i++;
            //System.out.println(i);
        }

        if (num > 1 && isPrime) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
    }
}
