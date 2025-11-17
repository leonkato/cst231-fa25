package wk13;

import java.util.Random;

public class TwoDArrayDemo {

    public static void main(String[] args) {
        // Create a Random object - we'll use this for testing
        Random rand = new Random();

        // Create a 2D array - 4 rows by 5 columns
        int[][] data = new int[4][5];

        // It's all zeros
        System.out.println("Empty array:");
        print(data);
        System.out.println();

        // Fill it with random numbers
        fillRandom(data, rand, 10);  // random numbers 1-10

        // Print it
        System.out.println("Filled with random numbers (1-10):");
        print(data);
        System.out.println();

        // Count how many times each number appears
        System.out.println("Counting occurrences:");
        countOccurrences(data);
    }

    public static void print(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]);
                if (col < arr[row].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();  // new line after each row
        }
    }

    public static void fillRandom(int[][] arr, Random rand, int max) {
        // Outer loop - for each row
        for (int row = 0; row < arr.length; row++) {
            // Inner loop - for each column in this row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = Math.abs(rand.nextInt()) % max + 1;
            }
        }
    }

    public static void countOccurrences(int[][] data) {
        // For each possible value (0-9)
        for (int target = 1; target <= 10; target++) {
            int count = 0;
            // Search the entire 2D array
            for (int row = 0; row < data.length; row++) {
                for (int col = 0; col < data[row].length; col++) {
                    if (data[row][col] == target) {
                        count++;
                    }
                }
            }
            // Only print if we found any
            if (count > 0) {
                System.out.println("Found " + count + " copies of " + target);
            }
        }
    }
}