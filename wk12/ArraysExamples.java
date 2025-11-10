package wk12;

/**
 * CST 231 - Arrays Introduction
 * Examples
 * Week 12
 */

public class ArraysExamples {

    // ==================================================================
    // Examples #1: Basic Array Operations
    // ==================================================================
    public static void examples1() {
        System.out.println("=== examples #1 ===");

        // Create an int array called ages with 5 values
        int[] ages = {18, 21, 19, 22, 20};

        // Print out the FIRST age
        System.out.println("First age: " + ages[0]);

        // Print out the LAST age
        System.out.println("Last age: " + ages[4]);
        // OR: System.out.println("Last age: " + ages[ages.length - 1]);

        // Change the third age to 25
        ages[2] = 25;

        // Print out the third age to verify
        System.out.println("Third age (after change): " + ages[2]);

        System.out.println();
    }


    // ==================================================================
    // Examples #2: Arrays and Loops
    // ==================================================================
    public static void examples2() {
        System.out.println("=== Examples #2 ===");

        // 1. Create an int array (at least 5 elements)
        int[] numbers = {15, 23, 8, 42, 31, 19, 7};

        // 2. Use a loop to print ALL elements
        System.out.println("All elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("  Element " + i + ": " + numbers[i]);
        }

        // 3. Use a loop to calculate the SUM
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // 4. Print the sum
        System.out.println("Sum: " + sum);

        System.out.println();
    }


    // ==================================================================
    // Examples #3: Methods with Arrays
    // ==================================================================

    /**
     * Calculates the sum of all elements in an array
     *
     */
    public static int sum(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }

    /**
     * Calculates the average of all elements in an array
     *
     */
    public static double average(int[] numbers) {
        int total = sum(numbers);  // Call sum() to get the total
        return (double) total / numbers.length;
    }

    public static void examples3() {
        System.out.println("=== examples #3 ===");

        // Test array
        int[] testScores = {85, 92, 78, 90, 88, 95};

        // Test sum method
        int total = sum(testScores);
        System.out.println("Sum of scores: " + total);

        // Test average method
        double avg = average(testScores);
        System.out.println("Average score: " + avg);

        System.out.println();
    }

    // ==================================================================
    // MAIN METHOD - Run all
    // ==================================================================
    public static void main(String[] args) {
//        examples1();
  //      examples2();
        examples3();
    }
}

