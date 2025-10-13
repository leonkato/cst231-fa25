package wk08;
import java.io.*;
public class l15p20 {

    public static void main(String[] args) throws IOException {
        String filename = "wk08/data/output.txt";  // name of the file
        FileWriter fw = new FileWriter(filename);  // get a FileWriter
        PrintWriter pw = new PrintWriter(fw);      // get a PrintWriter and attach to fw
        pw.println("Here we are!");                // print as much as you like
        fw.close();                                // clean up
   }
}

