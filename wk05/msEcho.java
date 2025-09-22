package wk05;
import java.util.Scanner;

public class msEcho {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("Program echos user input until user types 'x'");
        String inString = "";
        // loop until user types "x"
        while (true) {
            System.out.print(">>> ");
            inString = userIn.nextLine();
            if (inString.equalsIgnoreCase("x")) {
                break;
            }
            System.out.println(inString);
        }
        System.out.println("Done");
    }

}
