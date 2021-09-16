package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Ex01.Extension;

public class FileUtils {
	private static Random rd = new Random();

	private FileUtils() {

	}

	public static void createDirectory(String[] files, String dir) {
		for (String item : files) {
			File file = new File(dir, item);
			if (!(file.exists())) {
				file.mkdirs();
			}
		}
	}

	public static boolean createFile(File file) {
		boolean isValid = false;
		try {
			isValid = file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isValid;
	}

	public static boolean[] create(String dirPath, int nof, Extension[] exts) {
		boolean[] rs = new boolean[nof];

		File dirFile = new File(dirPath);
		if (!dirFile.exists()) {
			dirFile.mkdirs();
		}
		int lenghth = exts.length;
		for (int i = 0; i < nof; i++) {
			String name = "" + System.currentTimeMillis() + exts[rd.nextInt(lenghth)].getvalue();
			File file = new File(dirFile, name);
			rs[i] = createFile(file);
		}
		return rs;
	}

	public static void MoveFile(String dirPath, File[] files) {
		File file = new File(dirPath);
		for (File item : files) {
			System.out.println(item.renameTo(new File(dirPath + "\\" + item.getName())));
		}
	}

	public static void Close(AutoCloseable... autoCloseables) {
		for (AutoCloseable item : autoCloseables) {
			try {
				item.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void Copy(File[] files, String out) {
		for (File item : files) {
			InputStream inStream = null;
			OutputStream outStream = null;
			try {
				inStream = new FileInputStream(new File(item.getName()));
				outStream = new FileOutputStream(new File(out + "\\" + item.getName()));
				int length;
				byte[] buffer = new byte[1024];
				while ((length = inStream.read(buffer)) > 0) {
					outStream.write(buffer, 0, length);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				Close(inStream, outStream);
			}
		}
	}

	public static void Dele(File[] files) {
		for (File item : files) {
			item.delete();
		}
	}

	public static void renametoEx02(File[] files, String dir) {
		boolean isvalid = files[0].getName().endsWith(".png");
		String end = isvalid ? ".png" : ".jpg";
		int i = 0;
		for (File item : files) {
			item.renameTo(new File(dir + "//" + i + end));
			i++;
		}
	}

	public static void write(File file, List<String> list) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			for (String item : list) {
				bw.write(item);
				bw.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Close(bw, fw);
		}
	}

	public static List<String> read(File file) {
		List<String> rs = new ArrayList<>();
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				rs.add(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error readfile: " + e);
		}
		return rs;
	}

	public static void WriteMatrix(String name) {
		File file = new File(name);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		int row = 3;
		int col = 5;
		Random rd = new Random();
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					bw.write(rd.nextInt(100) + " ");
				}
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				bw.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}

	}
}
