package definition;

import utils.FileUtils;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Ex01 {
    // relative path
    // absolute path
    private static final String path = "data/readme.txt";
    private static final String dirPath = "data/random";

    public static void main(String[] args) throws IOException {
//        File file = FileUtils.create(path);
//        System.out.println("is success: " + (file != null));
//
//        boolean[] files = FileUtils.create(dirPath, 20, Extension.values());
//        System.out.println(files);

        // filter
        File dirFile = new File(dirPath);

        File[] files = dirFile.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return dirFile.isFile() && file.getName().endsWith(".txt");
            }
        });
        FileUtils.printf(files);
    }
}
