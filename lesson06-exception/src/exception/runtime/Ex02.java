package exception.runtime;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex02 {
    //finally

    private static final String PATH = "database.md";
    public static void main(String[] args) {

        // access file
        File file = new File(PATH);
        if(file.exists()) {
            // Write data into file
            FileWriter fw = null;
            try {
                fw = new FileWriter(file);

                // e.g: 1000 orders
                fw.write("Line 1\n");
                fw.write("Line 2\n");
                fw.write("Line 3\n");
                fw.write("Line 4\n");
                fw.write("Line 5\n");
                fw.write("Line ==============\n");
                fw.write("Line 770\n");

                // calculation => Exception
                // power cut
                fw.write(5/0);
                // TH1: Calculation and write file from scratch
                // Th2: Keep data before encounter error

                fw.write("Line 999\n");
                fw.write("Line 1000\n");

            } catch (IOException e) {
                e.printStackTrace();
            } catch (ArithmeticException e) {
                System.out.println("ArithemeticException");
            } finally {
                System.out.println("complete writing data into file successful..." + file.getName());

                try {
                    // save and close
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("-- Thread main --");
        }
    }
}


