package wk13;

public class StringsCharFinal {
    
    // Class-level constant - can be used in all methods
    static final int MAX_SIZE = 100;
    
    public static void main(String[] args) {
        System.out.println("=== Part 1: char type for this Friday's Lab ===");
        // charForLab();
        
        System.out.println("\n=== Part 2: String Methods ===");
        // stringMethods();
        
        System.out.println("\n=== Part 3: String and char Array Conversions ===");
        stringCharArrays();

        System.out.println("\n=== Part 4: final Variables ===");
        // finalVariables();
    }

    public static void charForLab() {
        System.out.println("Converting numbers to digit characters:");
        System.out.println("(This is what you need for Friday's lab!)\n");
        
        // This is the pattern!
        for (int i = 1; i <= 9; i++) {
            char digitChar = (char)(i + 48);
            System.out.println(i + " -> '" + digitChar + "'");
        }
        // Can also assign with character literal
        char x = 'X';
        char o = 'O';
        System.out.println("\nYou'll also use: " + x + " and " + o);
    }
    public static void stringMethods() {
        String s1 = "hello";
        String s2 = "HELLO";
        
        // Comparison - USE .equals() NOT ==
        System.out.println("Comparing strings \"hello\" and \"HELLO\":");
        System.out.println("s1.equals(s2): " + s1.equals(s2));  // false
        System.out.println("s1.equalsIgnoreCase(s2): " + s1.equalsIgnoreCase(s2));  // true
        
        // Getting a character
        System.out.println("\nGetting characters:");
        char c = s1.charAt(1);
        System.out.println("s1.charAt(1): " + c);  // 'e'
        
        // Transforming
        System.out.println("\nTransforming:");
        String upper = s1.toUpperCase();
        System.out.println("toUpperCase(): " + upper);  // HELLO
        System.out.println("Original s1: " + s1);       // still "hello" - immutable!
        
        // Searching
        System.out.println("\nSearching:");
        System.out.println("contains('ll'): " + s1.contains("ll"));  // true
        System.out.println("indexOf('ll'): " + s1.indexOf("ll"));    // 2
        System.out.println("indexOf('z'): " + s1.indexOf("z"));      // -1 (not found)
        
        // Length
        System.out.println("\nLength:");
        System.out.println("length(): " + s1.length());  // 5
    }

    public static void stringCharArrays() {
        // String to char array
        String s = "hello";
        char[] chars = s.toCharArray();
        
        System.out.println("Original string: " + s);
        System.out.println("As char array: ");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println();
        
        // Modify the char array (can't do this with String!)
        chars[0] = 'H';  // capitalize first letter
        
        System.out.println("\nAfter modifying char array:");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println();
        
        // Convert back to String
        String newString = new String(chars);
        System.out.println("Back to String: " + newString);  // "Hello"
        
        // Original is unchanged (we converted, we didn't modify it)
        System.out.println("Original still: " + s);  // "hello"
    }

    public static void finalVariables() {
        // Local final variable
        final int DAYS_IN_WEEK = 7;
        System.out.println("Days in week: " + DAYS_IN_WEEK);
        
         // This would NOT compile:
         // DAYS_IN_WEEK = 8;  // ERROR!
        
        // Can declare and assign separately
        final int MONTHS;
        MONTHS = 12;  // First assignment - OK
        System.out.println("Months in year: " + MONTHS);
        
        // This would NOT compile:
        // MONTHS = 13;  // ERROR!
        
        // Using class-level constant
        System.out.println("\nClass constant MAX_SIZE: " + MAX_SIZE);
        
        // Example use case: array sizing
        int[] data = new int[MAX_SIZE];
        System.out.println("Created array of size: " + data.length);
        
        System.out.println("\nWhy use final?");
        System.out.println("- Documents that the value shouldn't change");
        System.out.println("- Compiler prevents accidental changes");
        System.out.println("- Easy to update: change in one place");
    }
}
