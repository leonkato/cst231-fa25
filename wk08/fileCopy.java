package wk08;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Demonstration of file input and output streams in Java.
 *
 * Reads data from an input file, prints it to the console,
 * then copies it to a new output file.
 *
 * Shows how FileReader/Scanner work together for reading
 * and FileWriter/PrintWriter for writing.
 */
public class fileCopy {
    public static void main(String[] args) throws IOException {

        // --- Phase 1: READ from an existing file ---
        String filename = "wk08/data/countPlusData";

        // FileReader opens a text file for reading characters.
        FileReader fr = new FileReader(filename);

        // Scanner parses the text into tokens (words, numbers, etc.)
        Scanner fs = new Scanner(fr);

        // The first value in the file is expected to be an integer.
        int size = fs.nextInt();

        // Print that many tokens from the file to the console.
        for (int count = 0; count < size && fs.hasNext(); count++) {
            System.out.println(fs.next());
        }

        // Always close resources when done reading.
        fs.close();      // closes both the Scanner and its FileReader

        // --- Phase 2: WRITE to a new file ---
        FileWriter fw = new FileWriter("wk08/data/countPlusDataCopy");
        PrintWriter pw = new PrintWriter(fw);

        // Reopen the input file to copy its contents.
        fr = new FileReader(filename);
        fs = new Scanner(fr);

        // Skip the first integer (the size value).
        fs.next();

        // Write the same number of tokens to the new file.
        // The first line is the size value itself.
        pw.println(size);

        for (int k = 0; k < size && fs.hasNext(); k++) {
            pw.println(fs.next());
        }

        // Close everything.
        fs.close();
        pw.close();   // also flushes remaining output
    }
}

