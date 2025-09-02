package wk01.d2;

// We’re going to need a Scanner to let the user type things in
import java.util.Scanner;

public class Day02 {
    public static void main(String[] args) {

        // First, let’s play with variables and arithmetic.
        // We’ll declare two integers (whole numbers),
        // add them together, and store the result in a new variable.
        int a = 8;
        int b = 3;
        int c = a + b;

        // Print the result all by itself
        System.out.println("c = " + c);

        // Print the result in a friendlier way,
        // showing the original numbers and the answer.
        System.out.println(a + " + " + b + " = " + c);

        // Now for something new: INPUT!
        // Up until now, our program just printed things out.
        // With a Scanner, we can let the user type in a value.

        Scanner in = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");

        // Read in the number they type, and save it in a variable n
        int n = in.nextInt();

        System.out.println(n);

        // Show off a few things we can do with that number:

        // Multiply it by 2
        System.out.println("n * 2 = " + (n * 2));

        // Use % (remainder) and / (division) operators
        a = n % 4;   // remainder when n is divided by 4
        b = n / 4;   // whole-number division by 4
        System.out.println("n % 4 = " + a);
        System.out.println("n / 4 = " + b);

        // Compute the square root using the Math.sqrt method.
        //
        // A method is a named piece of code that does a specific job.
        // Some methods take inputs (called "arguments") and then
        // give back a result (called the "return value").
        //
        // Here, the input is our number n, and the result is its square root.
        // We capture that result in a double variable called d.

        double d = Math.sqrt(n);
        System.out.println("sqrt(n) = " + d);
        double s = Math.pow(n, 2);
        System.out.println("n * n = " + s);

        // Now let’s work with boolean values.
        //
        // A boolean is the simplest kind of variable — it can only be
        // true or false, nothing in between.
        //
        // The code (n == 13) asks a question:
        // "Is n equal to 13?" The answer will be true or false.;
        // We save that answer in a boolean variable called b1.
        boolean b1 = (n == 13);

        // Similarly, (n == 15) checks whether n equals 15.
        boolean b2 = (n == 15);

        // Let’s print them out to see the results.
        System.out.println("n == 13? " + b1);
        System.out.println("n == 15? " + b2);

//        // More examples of boolean expressions:
//        // "Is n greater than 10?"
//        boolean bigger = (n > 10);
//        System.out.println("n > 10? " + bigger);
//
        // "Is n an even number?"  (remainder is 0 when divided by 2)
        boolean even = (n % 2 == 0);
        System.out.println("n is even? " + even);

//        // Soon, we'll use the answers to these types of questions
//        // to control what happens in our code.
//
//        // In this short program we saw: variables, arithmetic, input,
//        // method calls, and boolean expressions. Not bad for Day 2!
    }
}
