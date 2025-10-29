package wk10;

import java.util.Scanner;
import java.io.*;

public class fileIO {
    public static void main(String[] args) throws IOException{

        // ============================================
        // File I/O with methods
        // ============================================
        System.out.println("=== File I/O ===");
        FileReader fileIn = new FileReader("wk10/triangles.txt");
        Scanner fileScanner = new Scanner(fileIn);
        // how many triangles to print
        int count = fileScanner.nextInt();

        for (int i = 0; i < count; i++) {
            // get the size
            int size = fileScanner.nextInt();
            // up or down??
            String direction = fileScanner.next();
            // print!
            printTriangle(size, direction);
            System.out.println();
        }
        fileIn.close();
    }
    // Prints a triangle of given size and direction
    //
    //  returns nothing; takes an int and String as input
    public static void printTriangle(int size, String direction) {
        if (direction.equals("up")) {
            // Growing triangle
            for (int row = 1; row <= size; row++) {
                for (int col = 0; col < row; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {  // direction.equals("down")
            // Shrinking triangle
            for (int row = size; row >= 1; row--) {
                for (int col = 0; col < row; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}

