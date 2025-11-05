package wk09;
import java.io.*;
import java.util.Scanner;

/**
 * Just read the input file and write to the output file line by line.
 */
public class cpy {
    public static void main(String[] args) throws IOException {

        // --- Phase 1: READ from an existing file ---
        String inputFile = "wk09/data/member.txt";
        // FileReader opens a text file for reading.
        FileReader fr = new FileReader(inputFile);
        // Scanner parses the text into tokens (words, numbers, etc.)
        Scanner fs = new Scanner(fr);

        // --- Phase 2: get ready to WRITE to the output file ---
        String outputFile = "wk09/data/cpyOutput.txt";
        FileWriter fw = new FileWriter(outputFile);
        PrintWriter pw = new PrintWriter(fw);

        // Get a line from the input and write to the output.
        while (fs.hasNext()) {
            pw.println(fs.nextLine());

        }
        // Close everything.
        fs.close();
        pw.close();   // also flushes remaining output
    }
}

