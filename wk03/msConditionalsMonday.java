package wk03;

import java.util.Scanner;

/**
 * CST231 — Conditionals Walkthrough
 **/
public class msConditionalsMonday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // The if — runs only if the condition is true.
        // if (true) always runs; if (false) never runs.

//        if (true) {
//            System.out.println("This will always happen if condition is true.");
//        }
//        if (false) {
//            System.out.println("This will NEVER happen if condition is false");
//        }
//
        // ───────────────────────────────────────────────────────────────
        // Example 2: Asking a question about a number
        // Read a number and ask: is it greater than 10?
        //

//        System.out.print("Please enter a whole number: ");
//        int number = in.nextInt();
//
//        if (number > 10) {
//            System.out.println("Your number is bigger than 10.");
//        }
//
//        if (number < 10) {
//            System.out.println("Your number is smaller than 10.");
//       }

        // ───────────────────────────────────────────────────────────────
        // Example 3: Improving the logic
        // Using >= ensures that 10 counts as big.
        // Try inputs 9, 10, 11 to see the difference.

//        System.out.print("Please enter a whole number: ");
//        int number = in.nextInt();
//
//        if (number >= 10) {
//            System.out.println("Your number is big!");
//        }
//
//        if (number < 10) {
//            System.out.println("Your number is small!");
//        }

        // ───────────────────────────────────────────────────────────────
        // Example 4: Using else
        // Either the number is big (>= 10) or it is small (< 10).
        // The else block handles the opposite case automatically.

//        System.out.print("Please enter a whole number: ");
//        int number = in.nextInt();
//
//        if (number >= 10) {
//            System.out.println("Your number is big!");
//
//        } else {
//            System.out.println("Your number is small!");
//        }

        // ───────────────────────────────────────────────────────────────
        // Example 4b: Using else if
        // Sometimes you have more than two possibilities.
        // else if lets you chain together multiple exclusive options.
        // Only ONE of the branches will run: the first true condition.
        //
        // Try values like 9, 10, 15, and watch which branch runs.

//      System.out.print("Please enter a whole number: ");
//        int number = in.nextInt();
//
//        if (number > 10) {
//            System.out.println("Your number is greater than 10.");
//        } else if (number == 10)  {
//            System.out.println("Your number is exactly 10.");
//        } else if (number < 0) {
//            System.out.println("Achtung! Negative number");
//        }
//        else {
//            System.out.println("Your number is less than 10.");
//        }


        // ───────────────────────────────────────────────────────────────
        // Example 5: Comparing two scores
        // Decide which player wins.

//        System.out.print("Enter Player 1's score: ");
//        double score1 = in.nextDouble();
//
//        System.out.print("Enter Player 2's score: ");
//        double score2 = in.nextDouble();
//
//        if (score1 > score2) {
//            System.out.println("Player 1 wins!");
//        } else if (score2 > score1) {
//            System.out.println("Player 2 wins!");
//        } else {
//            System.out.println("It's a tie!");
//        }
//        System.out.println("Here we are...");

        // ───────────────────────────────────────────────────────────────
        // Example 6: Password check (Strings)
        // Use .equals() to compare String contents, not ==.

//        String secret = "hello123";
//
//        System.out.print("Enter your name: ");
//        String name = in.next();
//
//        System.out.print("Enter password: ");
//        String password = in.next();
//
//        if (password.equals(secret)) {
//            System.out.println("Welcome, " + name + "!");
//        } else {
//            System.out.println("Password is incorrect.");
//        }

// ───────────────────────────────────────────────────────────────
// Example X: Exiting early with return
// Normally, the program runs line by line from top to bottom.
// The statement `return;` inside main() ends the program immediately.
// No further lines of main() will run.
//
// This is useful if we detect an error and want to stop.
//
// Try entering a negative number to see the early exit.
//
//
//System.out.print("Enter a positive number: ");
//int value = in.nextInt();
//
//if (value < 0) {
//    System.out.println("Error: negative number entered.");
//    return; // program ends here — nothing below will run
//}
//
//System.out.println("Thanks! You entered " + value);
    }
}
