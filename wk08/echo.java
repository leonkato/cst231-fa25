package wk08;
import java.io.*;
import java.util.Scanner;

public class echo {
    public static void main(String[] args) throws IOException {

        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String filename = userIn.next();;

        FileReader fr = new FileReader(filename);
        Scanner fileIn = new Scanner(fr);

        while (fileIn.hasNext()) {
            System.out.println(fileIn.next());
        }
        userIn.close();
        fileIn.close()
    }
}
