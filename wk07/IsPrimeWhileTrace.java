import java.util.Scanner;

public class IsPrimeWhileTrace {
    public static void main(String[] args) {

        /*
         By definition, a prime number is a positive integer greater than 1
         that has exactly two distinct positive divisors: 1 and itself.
         Since 1 is only divisible by 1 (it has just one divisor), it fails that test.
         The smallest prime number is 2, which is the only even prime.
        */

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = s.nextInt();

        boolean isPrime = true;
        int i = 2;

        // → is /u2192 if you're so inclined

        System.out.println();
        System.out.println("Tracing while loop for num = " + num);
        System.out.println("--------------------------------");

        while (i < num && isPrime) {
            int remainder = num % i;
            System.out.println("i = " + i + " → remainder = " + remainder);
            if (remainder == 0) {
                System.out.println("   " + num + " is divisible by " + i +
                                   " → set isPrime = false and stop looping soon");
                isPrime = false;
            } else {
                System.out.println("   " + num + " is NOT divisible by " + i +
                                   " → isPrime stays " + isPrime);
            }
            i++;
        }

        System.out.println("--------------------------------");
        System.out.println("Loop finished. i = " + i + ", isPrime = " + isPrime);

        if (num > 1 && isPrime) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
    }
}
