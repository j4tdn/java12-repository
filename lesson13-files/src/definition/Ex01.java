package definition;

import common.Extension;
import utils.FileUtils;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Ex01 {

    private static final String path = "data/readme.txt";
    private static final String dirPath = "data/random";


    public static void main(String[] args) throws IOException {

        // create file

//        File file = FileUtils.create(path);
//        System.out.println("is success: "+(file !=  null));
//
//        int nof = 20;
//        boolean[] files = FileUtils.create(dirPath,20, Extension.values());
//        System.out.println(files);


        File dirFile = new File(dirPath);

        File[] files = dirFile.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isFile() && file.getName().endsWith(Extension.txt.val());
            }
        });
        FileUtils.print(files);

}}
