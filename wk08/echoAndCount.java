package wk08;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class echoAndCount {
    public static void main(String[] args) throws IOException {

        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String filename = userIn.next();

        FileReader fr = new FileReader(filename);
        Scanner fileIn = new Scanner(fr);

        int count = 0;

        while (fileIn.hasNext()) {
            System.out.println(fileIn.next());
            count++;
        }

        userIn.close();
        fileIn.close();

        System.out.println(count);
    }
}
