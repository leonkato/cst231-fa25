package wk01.d1;

public class Hello {
    public static void main(String[] args){
        // SAY: Welcome to CST 231. Goal today: see Java run, then peek at literals, variables, types, and a few operators.
        // TYPE: System.out.println("Hello CST 231 Class!");  // Keep this line active so we get one success on Day 1.
        System.out.println("Hello CST 231 Class!");

        /* ─────────────────────────────────────────────────────────────────────────────
         * SECTION 1: Variables, assignment, and printing
         * SAY: A variable is a named box that holds a value. We declare a type, then a name.
         * TYPE (leave commented for Day 1; students will type next class):
         *
         // int x;                // declare an int named x (no value yet)
         // x = 5;                // assign a value later
         // int y = 7;            // declare and assign in one line
         // System.out.println(x); // print the current value of x
         *
         * ASK: What will print when we print x right after setting it to 5?
         * POINT: Declarations can be separate from assignments; printing shows the current value at that moment.
         * ───────────────────────────────────────────────────────────────────────────── */

        /* ─────────────────────────────────────────────────────────────────────────────
         * SECTION 2: Expressions and the + operator
         * SAY: We can compute new values using expressions and store them in new variables.
         * TYPE:
         *
         // int z = x + y;          // compute sum of x and y
         // System.out.println(z);  // show the result
         *
         * ASK: If x=5 and y=7, what do we expect for z?
         * POINT: `+` is addition for numbers; later we’ll see it’s concatenation for Strings.
         * ───────────────────────────────────────────────────────────────────────────── */

        /* ─────────────────────────────────────────────────────────────────────────────
         * SECTION 3: Doubles vs. ints (types matter)
         * SAY: `double` holds fractional values; `int` holds whole numbers.
         * TYPE:
         *
         // double a = 7.5;          // literal with a decimal → double
         // System.out.println(a);
         // double b = a + x;        // mixing double + int → result is double
         // System.out.println(b);
         // b = a * 2;               // arithmetic with doubles
         // System.out.println("Res: " + b);  // demonstrate String + number
         *
         * ASK: Why does `a + x` produce a double? (Type promotion to the wider type.)
         * POINT: Java promotes to the wider type in mixed arithmetic (int → double).
         * ───────────────────────────────────────────────────────────────────────────── */

        /* ─────────────────────────────────────────────────────────────────────────────
         * SECTION 4: Integer vs. floating‑point division
         * SAY: Division behaves differently for ints vs. doubles.
         * TYPE:
         *
         // x = 13 / 3;              // both operands are int → integer division → 4
         // System.out.println(x);
         // b = 13.0 / 3;            // one operand is double → floating‑point division → 4.333...
         // System.out.println(b);
         *
         * ASK: Why does `13/3` give 4, but `13.0/3` gives ~4.333?
         * POINT: If both operands are int, Java truncates the fraction. Include a double to keep the fraction.
         * ───────────────────────────────────────────────────────────────────────────── */

        /* ─────────────────────────────────────────────────────────────────────────────
         * SECTION 5: The remainder operator (%)
         * SAY: `%` gives the remainder after division; it’s useful for parity, cycles, etc.
         * TYPE:
         *
         // x = 13 % 3;              // remainder of 13 divided by 3 → 1
         // System.out.println(x);
         *
         * ASK: What’s `12 % 3`? What about `14 % 3`?
         * POINT: `%` is not a percentage; it’s the remainder operator (modulus).
         * ───────────────────────────────────────────────────────────────────────────── */

        /* ─────────────────────────────────────────────────────────────────────────────
         * WRAP-UP
         * SAY: Next class, you’ll type all of this yourselves. Before then, install IntelliJ (guide in Canvas).
         * ASK: Any questions on literals, variables, types, integer vs. double division, or `%`?
         * ───────────────────────────────────────────────────────────────────────────── */
    }
}
