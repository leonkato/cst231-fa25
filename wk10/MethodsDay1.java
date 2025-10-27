package wk10;

public class MethodsDay1 {


    public static void main(String[] args) {
        //

        // ============================================
        // EXAMPLE 1: Simplest void method
        //    no parameters; no value returned
        //    is there a method we know that works like this?
        // ============================================

//        System.out.println("=== Example 1: Void Method ===");
//        System.out.println("Program starting");
//        printWelcome();
//        printWelcome();  // can call multiple times!
//        System.out.println("Program ending\n");


        // ============================================
        // EXAMPLE 2: Method with return value
        //    no parameters; value returned
        //    what method do we already call that works like this?
        // ============================================
//        System.out.println("=== Example 2: Return Value ===");
//        int theLuckyNumber = getLuckyNumber();
//        System.out.println("Your lucky number is: " + theLuckyNumber);
//        System.out.println("Lucky again: " + getLuckyNumber());
//        System.out.println();
//
        
        // ============================================
        // EXAMPLE 3: Methods with parameters
        // ============================================
//        System.out.println("=== Example 3: Parameters ===");
//        greetUser("Alice");
//        greetUser("Bob");
//
//        int result = addNumbers(5, 3);
//        System.out.println("5 + 3 = " + result);
//
//        result = addNumbers(10, 20);
//        System.out.println("10 + 20 = " + result);
//        System.out.println();
        
        
        // ============================================
        // EXAMPLE 4: Pattern printing
        // ============================================
//        System.out.println("=== Example 4: Pattern Printing ===");
//        printSquare(4);
//        System.out.println();
//        printSquare(2);
//        System.out.println();

        
        // ============================================
        // EXAMPLE 5: Scope demonstration
        // ============================================
        System.out.println("=== Example 5: Scope ===");
        int x = 10;
        System.out.println("In main, x = " + x);
        changeX(x);
        System.out.println("After changeX, x = " + x);  // STILL 10!
    }
    
    
    // ============================================
    // METHOD DEFINITIONS BELOW
    // ============================================
    
    // EXAMPLE 1: Void method, no parameters
    // Communicates with USER (prints)
    public static void printWelcome() {
        System.out.println("*****************");
        System.out.println("Welcome to CST231");
        System.out.println("*****************");
    }
    
    
    // EXAMPLE 2: Returns int, no parameters
    // Communicates with PROGRAM (returns value)
    public static int getLuckyNumber() {
        int number = 7;
        return number;  // sends 7 back to caller
    }
    
    
    // EXAMPLE 3a: Void method with String parameter
    // Takes data IN, communicates with USER
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
        System.out.println("Welcome to the program.");
    }
    
    
    // EXAMPLE 3b: Returns int, takes two int parameters
    // Takes data IN, sends data back OUT to program
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }
    
    
    // EXAMPLE 4: Pattern printing
    // void (prints), takes int parameter
    public static void printSquare(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print("* ");
            }
            System.out.println();  // end the row
        }
    }
    
    
    // EXAMPLE 5: Scope demonstration
    // Shows that parameter x is SEPARATE from main's x
    public static void changeX(int x) {
        x = 999;  // This changes the LOCAL x only!
        System.out.println("In changeX, x = " + x);

    }
}


/* ============================================
   COMMON MISTAKES
   ============================================

// MISTAKE 1: Trying to print void method
System.out.println(printWelcome());  // ERROR!

// MISTAKE 2: Not capturing return value
getLuckyNumber();  // Value is lost!

// MISTAKE 3: Including datatype in method call
greetUser(String "Alice");  // ERROR! Just use "Alice"

// MISTAKE 4: Forgetting return statement
public static int getLuckyNumber() {
    int number = 7;
    // forgot return!
}  // ERROR!

*/
