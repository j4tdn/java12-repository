package manipulation;

import utils.FileUtils;

import java.io.File;

public class Ex01 {
    private static final String path = "data/readme.txt";

    public static void main(String[] args) {
        File file = new File(path);


        System.out.println("============== ^-^ ================");
        FileUtils.read(file);

    }
}
