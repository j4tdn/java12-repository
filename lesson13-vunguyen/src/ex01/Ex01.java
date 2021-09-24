package ex01;

import common.Extension;
import utils.FileUtils;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import static common.Extension.jpeg;
import static common.Extension.jpg;

public class Ex01 {
    private static final String GARBAGE_PATH = "garbage";
    private static final String IMAGE_PATH = "garbage/image";
    private static final String MUSIC_PATH = "garbage/music";
    private static final String SYSTEM_PATH = "garbage/system";
    private static final String CODING_PATH = "garbage/coding";

    public static void main(String[] args) throws IOException {
        File garbage = FileUtils.createDir(GARBAGE_PATH);
        File image = FileUtils.createDir(IMAGE_PATH);
        File music = FileUtils.createDir(MUSIC_PATH);
        File system = FileUtils.createDir(SYSTEM_PATH);
        File coding = FileUtils.createDir(CODING_PATH);

        // make directory


        FileUtils.create(GARBAGE_PATH, 20, Extension.values());

        // move .png, .jpg, jpeg to image
        moveFile(garbage, image,
                 (f, name) -> name.endsWith(Extension.png.val()) || name.endsWith(jpg.val()) || name.endsWith(jpeg.val()));

        // move .mp3, .mp4 to music
        moveFile(garbage, music,
                 (f, name) -> name.endsWith(Extension.mp3.val()) || name.endsWith(Extension.mp4.val()));

        // move .bat to system
        moveFile(garbage, system,
                 (f, name) -> name.endsWith(Extension.bat.val()));

        // copy .java to coding
        copyFile(garbage, coding, (f, name) -> name.endsWith(Extension.java.val()));

        // delete .txt
        deleteFile(garbage, (f, name) -> name.endsWith(Extension.txt.val()));

    }

    /**
     * Move file
     *
     * @param dir       directory to move
     * @param targetDir target directory
     * @param filter    FilenameFilter filter file by name
     */
    public static void moveFile(File dir, File targetDir, FilenameFilter filter) {
        File[] files = dir.listFiles(filter);
        for (File file : files) {
            file.renameTo(new File(targetDir, file.getName()));
        }
    }

    /**
     * Copy file
     *
     * @param dir       directory to copy
     * @param targetDir target directory
     * @param filter    FilenameFilter filter file by name
     */
    public static void copyFile(File dir, File targetDir, FilenameFilter filter) throws IOException {
        File[] files = dir.listFiles(filter);
        for (File file : files) {
            System.out.println(file.getPath());
            System.out.println(targetDir.getPath());
            Files.copy(file.toPath(), Paths.get(targetDir.getPath(), file.getName()), StandardCopyOption.REPLACE_EXISTING);
        }
    }

    /**
     * Delete file
     *
     * @param dir    directory to copy
     * @param filter filter by name
     */
    public static void deleteFile(File dir, FilenameFilter filter) {
        File[] files = dir.listFiles(filter);
        for (File file : files) {
            file.delete();
        }
    }
}
