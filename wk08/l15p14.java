package wk08;

import java.io.*;
import java.util.Scanner;

public class l15p14 {
    public static void main(String [] args) throws IOException {
        String filename = "./wk08/data/numbers.txt";  // data file
        FileReader fr = new FileReader(filename);     // get a FileReader
        Scanner f = new Scanner(fr);                  // attach a Scanner

        int sum = 0, data;
        while(f.hasNext()) {        // as long as there's something to read
            data = f.nextInt();     // get it
            sum += data;            // use it
        }
        fr.close();
        System.out.println("Sum is " + sum);
    }
}
