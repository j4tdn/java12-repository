package ex02;

import common.Extension;
import utils.FileUtils;

import java.io.File;

public class Ex02 {
    private static final String IMAGES_PATH = "images";

    public static void main(String[] args) {
        File images = FileUtils.createDir(IMAGES_PATH);
        FileUtils.create(IMAGES_PATH, 30, Extension.jpg, Extension.png);

        File[] jpgFiles = images.listFiles((f, name) -> name.endsWith(Extension.jpg.val()));
        File[] pngFiles = images.listFiles((f, name) -> name.endsWith(Extension.png.val()));

        renameFiles(jpgFiles, ".jpg");
        renameFiles(pngFiles, ".png");
    }

    public static void renameFiles(File[] files,String name) {
        int count = 1;
        for (File file : files) {
            file.renameTo(new File(file.getParentFile(), count + name));
            count++;
        }
    }
}
