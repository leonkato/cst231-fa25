package wk07;

import java.util.Scanner;

public class ForSquare {

    public static void main(String[] args) {
        // print a square
        String str01 = "*";
        // String str02 = "&";

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");

        int size =  s.nextInt();

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(str01);
            }
            System.out.println();
        }
    }
}
