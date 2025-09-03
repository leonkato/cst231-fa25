 
// msWeek02Triangle.java
// Demo for Week 2: Random Triangle Checker
// Tools shown:
// Random numbers (with Math.abs, %, +1),
// Math method calls,
// boolean comparisons
package wk02;

import java.util.Random;

public class msWeek02Triangle {
    public static void main(String[] args) {

        Random rand = new Random();

        System.out.println("=== Week 2 Demo: Random Triangle Checker ===\n");

        // ---------------------------------------------------------
        // Generate 3 random integers between 1 and 5
        // Use Math.abs(rand.nextInt()) % range + 1
        //
        // Random + r.nextInt() + Math.abs + % + addition
        // ---------------------------------------------------------
        int a = Math.abs(rand.nextInt()) % 5 + 1;
        int b = Math.abs(rand.nextInt()) % 5 + 1;
        int c = Math.abs(rand.nextInt()) % 5 + 1;

        System.out.println("Random sides: " + a + ", " + b + ", " + c);

        // ---------------------------------------------------------
        // Step 1: Boolean for "valid triangle?"
        // Rule: sum of any two sides must be greater than the third
        //
        // Comparison (>) + AND operator (&&) ; Boolean expression
        // ---------------------------------------------------------
        boolean valid = (a + b > c) && (a + c > b) && (b + c > a);
        System.out.println("Do these form a valid triangle? " + valid);

        // ---------------------------------------------------------
        // Step 2: Get boolean for "rightSide triangle?"
        // Find the sides for Pythagorus
        // Then check hyp^2 == side1^2 + side2^2 using Math.pow.
        //
        //  Note Math.pow returns double
        // ---------------------------------------------------------

        int hyp = Math.max(a, Math.max(b, c));

        // Figure out the other two sides
        int sum = a + b + c;
        int side1 = Math.min(a, Math.min(b, c));
        int side2 = sum - hyp - side1;

        System.out.println("longest side: " + hyp);
        System.out.println("shortest side: " + side1);
        System.out.println("remaining side: " + side2);

        // Compute squares using Math.pow
        double leftSide = Math.pow(side1, 2) + Math.pow(side2, 2);
        double rightSide = Math.pow(hyp, 2);

        boolean isRight = (leftSide == rightSide);
        // are they close enough (your choice) to being equal?
        // boolean isRight =  0.0000001 > Math.abs(leftSide - rightSide);
        System.out.println("Is this a right triangle? " + isRight);

        // Show the details of the Pythagorean check
        System.out.println(side1 + "^2 + " + side2 + "^2 = " + leftSide);
        System.out.println(hyp + "^2 = " + rightSide);
    }
}
