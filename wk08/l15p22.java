package wk08;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class l15p22 {

    public static void main(String[] args) throws IOException {
        String filename = "wk08/data/output.txt";  // name of the file
        FileWriter fw = new FileWriter(filename);  // get a FileWriter
        PrintWriter pw = new PrintWriter(fw);      // get a PrintWriter and attach to fw
        pw.println("Here we are!");                // print as much as you like
        int i = 5;
        double u = 5.5;
        String s = "five point five";
        pw.print(i + " ");
        pw.println(u);
        pw.println(s);
        pw.println();
        pw.println(i + " " + u + " " + s);
        fw.close();                                // clean up
   }
}

