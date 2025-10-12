package wk07;

import java.util.Scanner;

public class IsPrimeForBreak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = s.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            // System.out.println(i);
            if (num % i == 0) {
                System.out.println(i);
                isPrime = false;
                break;  // stop as soon as we know it's not prime
            }
        }
        if (num > 1 && isPrime) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
    }
}
