package wk05;
import java.util.Scanner;

public class msEchoDoWhile {
    public static void main(String[] args) {

        Scanner userIn = new Scanner(System.in);
        System.out.println("Program echos user input until user types 'x'");
        String inString = "";
        // loop until user types "x"
         do {
            System.out.print(">>> ");
            inString = userIn.nextLine();
            System.out.println(inString);
        } while (!inString.equalsIgnoreCase("x"));

        System.out.println("Done");
    }

}
