package ex04;

import utils.FileUtils;

import java.io.File;
import java.util.Random;

public class Ex04 {
    private static Random rd = new Random();
    private static final String README_PATH = "readme.txt";

    public static void main(String[] args) {
        int n = 3; // rows
        int m = 4; // cols

        File readme = FileUtils.create(README_PATH);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                FileUtils.write(readme, rd.nextInt(1000) + " ");
            }
            FileUtils.write(readme, "\n");
        }

        FileUtils.read(readme);

    }


}
