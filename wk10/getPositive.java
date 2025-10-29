package wk10;

import java.util.Scanner;
import java.io.*;

public class getPositive {

    public static void main(String[] args) throws IOException {
        // pass a Scanner as a parameter
        System.out.println("=== Example 1: Scanner Parameter ===");
        Scanner input = new Scanner(System.in);
        int num = getPositiveInt(input);
        System.out.println("You entered: " + num);
        int ranged = getNumberInRange(input, 1, 10);
        System.out.println("You entered: " + ranged);
        System.out.println();
    }
    // Scanner parameter methods - don't make a new scanner;
    // reuse the one we make in the main method

    // Returns a positive integer (keeps asking until valid)
    // Takes one parameter - a Scanner; returns an int
    public static int getPositiveInt(Scanner s) {
        int number;
        do {
            System.out.print("Enter a positive integer: ");
            number = s.nextInt();
        } while (number <= 0);
        return number;
    }
    // Returns an integer between min and max (inclusive)
    // Takes 3 parameters: Scanner, int, int; returns an int
    public static int getNumberInRange(Scanner s, int min, int max) {
        int number;
        do {
            System.out.print("Enter number between " + min + " and " + max + ": ");
            number = s.nextInt();
        } while (number < min || number > max);
        return number;
    }
}

