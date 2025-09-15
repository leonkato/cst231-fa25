package wk04;

import java.util.Scanner;

public class ModIterativeMain {
    public static void main(String[] args) {

        Scanner userIn = new Scanner(System.in);

        System.out.print("enter dividend (int): ");
        int dividend = userIn.nextInt();

        System.out.print("enter divisor (int): ");
        int divisor = userIn.nextInt();

        // quit if bad parameter
        if (divisor <= 0) {
            System.out.println("Divisor must be a positive integer.");
            return;
        }

        int originalDividend = dividend;
        int originalDivisor  = divisor;

        int count = 0;  // counts how many times we subtract (i.e., the quotient)

        // successive subtraction shows what % means
        while (dividend >= divisor) {
            count++;
            System.out.print(dividend + " minus ");
            dividend -= divisor;
            System.out.println(divisor + " is " + dividend);
        }

        System.out.println("there are no more " + originalDivisor + "s in " + dividend + ", so we're done.");

        // Build the result line with prints, then finish with println
        System.out.print(originalDividend);
        System.out.print(" mod ");
        System.out.print(originalDivisor);
        System.out.print(" is: ");
        System.out.println(dividend);

        // Optional teaching line to show the loop counted the quotient:
        System.out.print("(We subtracted ");
        System.out.print(count);
        System.out.print(" times -> quotient ");
        System.out.print(count);
        System.out.print(", remainder ");
        System.out.print(dividend);
        System.out.println(".)");
    }
}
