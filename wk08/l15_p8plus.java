package wk08;

import java.io.*;

public class l15_p8plus {
    public static void main(String [] args) throws IOException
    {
        String filename = "./wk08/data/hello.txt";
        FileReader fr = new FileReader(filename);


        fr.close();
    }
}

