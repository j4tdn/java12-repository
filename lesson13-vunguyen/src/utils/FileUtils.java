package utils;

import common.Extension;

import java.io.*;
import java.util.Random;

public final class FileUtils {
    public static Random rd = new Random();

    private FileUtils() {
    }

    /**
     * Create file in current path
     *
     * @param file file
     * @return true if file was successfully created; false if not
     */
    public static boolean createFile(File file) {
        boolean isValid = false;
        try {
            isValid = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isValid;
    }

    /**
     * Create file
     *
     * @param path path
     * @return File if file was successfully created; null if not
     */
    public static File create(String path) {
        boolean isValid = true;
        File file = new File(path);
        if (!file.exists()) {
            File parent = file.getParentFile();
            if (parent != null && !parent.exists()) {
                parent.mkdirs();
            }
            isValid = createFile(file);
        }
        return isValid ? file : null;
    }

    /**
     * Create multiple file with random extension
     *
     * @param dirPath directory path
     * @param nof     number of files
     * @param exts    extensions
     * @return array of boolean indicates files were successfully created or not
     */
    public static boolean[] create(String dirPath, int nof, Extension... exts) {
        boolean[] result = new boolean[nof];
        File dirFile = createDir(dirPath);

        int length = exts.length;
        for (int i = 0; i < nof; i++) {
            String name = System.currentTimeMillis() + exts[rd.nextInt(length)].val();
            File file = new File(dirFile, name);
            result[i] = createFile(file);
        }

        return result;
    }

    /**
     * Create directory from path
     *
     * @param dirPath directory path
     * @return directory File
     */
    public static File createDir(String dirPath) {
        File dirFile = new File(dirPath);
        if (!dirFile.exists()) {
            dirFile.mkdirs();
        }
        return dirFile;
    }

    public static void read(File file) {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            FileUtils.close(br, fr);
        }

    }

    public static void write(File file, String string) {
        // write file >> draft
        java.io.FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new java.io.FileWriter(file, true);
            bw = new BufferedWriter(fw);

            bw.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            FileUtils.close(bw, fw);
        }
    }

    public static void close(AutoCloseable... closeables) {
        for (AutoCloseable closeable : closeables) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
