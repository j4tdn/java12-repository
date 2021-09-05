package Utils;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

import common.Extension;

public class FileUtils {
	private static final Random rd = new Random();

	private FileUtils() {

	}

	public static File create(String path) {
		boolean isValid = false;
		File file = new File(path);

		if (!file.exists()) {
			File parent = file.getParentFile();
			if (!parent.exists()) {
				parent.mkdir();
			}
			isValid = createFile(file);
		}
		return isValid ? file : null;
	}

	private static boolean createFile(File file) {
		boolean isValid = false;
		try {
			isValid = file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isValid;
	}

	public static boolean[] create(String dirpath, int nof, Extension[] values) {
		boolean[] rs = new boolean[nof];
		File dirFile = new File(dirpath);
		if (!dirFile.exists()) {
			dirFile.mkdirs();
		}
		int length = values.length;
		for (int i = 0; i < nof; i++) {
			String name = "" + System.currentTimeMillis() + values[rd.nextInt(length)].value();
			File file = new File(dirFile, name);
			rs[i] = createFile(file);
		}
		return rs;
	}

	public static void read(File file) {
		FileReader fr = null;
		BufferedReader br = null;
		try {

			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			FileUtils.close(br, fr);

		}
	}

	public static void write(File file) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {

			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			bw.write("khoa dep trai1\n");
			// bw.newLine();
			bw.write("Khoa khoa");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			FileUtils.close(bw, fw);

		}
		System.out.println("==============");
		FileUtils.open(file);
	}

	public static void printf(File... list) {
		for (File item : list) {
			System.out.println(item.getPath());
		}
	}

	public static void open(File file) {
		try {
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void close(AutoCloseable... closeables) {
		for (AutoCloseable item : closeables) {
			if (item != null) {
				try {
					item.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
