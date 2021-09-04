package manipulation;

import utils.FileUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex01 {

    private static final String path = "data/readme.txt";

    public static void main(String[] args) {
        File file = new File(path);

        // write file
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file,true);
            bw = new BufferedWriter(fw);
            bw.write("Transaction: Alian - Milan 25000\n");
            bw.write("Trader: kuler >> - Cambridge 10000\n");
            bw.write("Line 5\n");
            bw.write("Line 6\n");


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            FileUtils.close(bw, fw);
        }
        System.out.println("====================");
        FileUtils.open(file);
        // read file
    }
}
