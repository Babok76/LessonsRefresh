package Les44_Writing_To_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File fileIn = new File("WriteToFile");
        PrintWriter pw = new PrintWriter(fileIn);

        pw.println("Test row 1");
        pw.println("Test row 2");

        pw.close();
    }
}
