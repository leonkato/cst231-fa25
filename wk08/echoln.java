package wk08;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class echoln {
    public static void main(String[] args) throws IOException {

        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String filename = userIn.next();;

        FileReader fr = new FileReader(filename);
        Scanner fileIn = new Scanner(fr);

        while (fileIn.hasNextLine()) {
            System.out.println(fileIn.nextLine());
        }
        userIn.close();
        fileIn.close();
    }
}
