package wk08;
import java.io.*; // note changed import
public class l15p18 {

    public static void main(String [] args) throws IOException {
        String filename = "output.txt";
        FileWriter fw = new FileWriter(filename);  // opens a file for writing
    //
        fw.close();                                // clean up - necessary!
    }
}
