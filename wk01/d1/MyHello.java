package wk01.d1;

public class MyHello {
    public static void main(String[] args){

        // Welcome to CST 231. Goal today: see Java run, then a quick look
        // at literals, variables, types and a few operators.

        System.out.println("Hello CST 231 Class!");

        /* SECTION 1: Variables, assignment, and printing
         * A variable is a named box that holds a value. We declare a type, then a name.
         * A literal is a value that we can type that java will understand.
         */

        int x;                // declare an int named x (no value yet)
        x = 5;                // assign a value later;
        int y = 7;            // declare and assign in one line
        System.out.println(x); // print the current value of x

        /* What will print when we print x right after setting it to 5?
         * Declarations can be separate from assignments;
         * printing shows the current value at that moment.
         */

        /* SECTION 2: Expressions and the + operator
         * We can compute new values using expressions and store them in new variables.
         */

        int z = x + y;          // compute sum of x and y
        System.out.println(z);  // show the result

        /*
         * If x=5 and y=7, what do we expect for z?
         * Note: `+` is addition for numbers; later we’ll see it’s concatenation for Strings.
         */

        /*
         * SECTION 3: Doubles vs. ints (types matter)
         * `double` holds floating point values; `int` holds whole numbers.
         */

          double a = 7.5;          // literal with a decimal → double
          System.out.println(a);
          double b = a + x;        // mixing double + int → result is double
          System.out.println(b);
          b = a * 2;               // arithmetic with doubles

          String myString = "Res: " + b;   // demonstrate String + number
          System.out.println(myString);


        /*
         * Why does `a + x` produce a double?
         * Java promotes to the wider type in mixed arithmetic (int → double).
         */

        /* ─────────────────────────────────────────────────────────────────────────────
         * SECTION 4: Integer vs. floating‑point division
         * Division behaves differently for ints vs. doubles.
         */

          x = 13 / 3;              // both operands are int → integer division → 4
          System.out.println(x);
          b = 13.0 / 3;            // one operand is double → floating‑point division → 4.333...
          System.out.println(b);

        /*
         * Why does `13/3` give 4, but `13.0/3` gives ~4.333?
         * If both operands are int, Java throws away the remainder.
         * If you include a double, the result will be a double with a fractional part.
         */

        /*
         * SECTION 5: The remainder operator (%) = what happened to the remainder?!
         * `%` gives the remainder after division; it’s useful for lots of problems
         */

          x = 13 % 3;              // remainder of 13 divided by 3 → 1
          System.out.println(x);

        /*
         * What’s `12 % 3`? What about `14 % 3`?
         * `%` is not a percentage; it’s the remainder operator (modulus).
         */


    }
}
