package utils;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import common.Extension;
import common.Trader;

public class FileUtils {
	private static final Random rd = new Random();

	private FileUtils() {
	}
	
	
	/**
	 * - new Filewriter(File file , boolean append)
	 * 	  + append : true -> giữ ndung cũ và thêm ndung mới
	 * 	  + append : false -> xóa ndung cũ, chỉ ghi ndung mới 
	 */
	public static void write(File file) {
		// write file -> draft (nháp)
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);

			bw.write("Transaction : Alan - 2000 " + "\n");
			bw.write("Transaction : Blan - 1999 " + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			FileUtils.close(bw, fw);
		}
		FileUtils.open(file);
	}

	public static void read(File file) {
		// read file -> draft (nháp)
//		FileReader rd = null;
//		BufferedReader bd = null;
//		try {
//			rd = new FileReader(file);
//			bd = new BufferedReader(rd);
//
//			// iterator
//			String line = null;
//			while ((line = bd.readLine()) != null) {
//				System.out.println(line);
//			}
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		FileReader fr = null ;
		BufferedReader br = null ;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			System.out.println(br.readLine());
			
			// contents file must read sequentialy -> use Iterator
			
			while(br.readLine() != null ) {
				System.out.println(br.readLine());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			FileUtils.close(br, fr);
		}
		
	}

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

	private static boolean createFile(File file) {
		boolean isValid = false;
		try {
			isValid = file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return isValid;
	}

	public static boolean[] create(String dirPath, int nof, Extension[] exts) {
		boolean[] result = new boolean[nof];
		
		File dirFile = new File(dirPath);
		
		// create folder
		if(!dirFile.exists()) {
			dirFile.mkdirs();
		}
		
		//create file
		int length = exts.length;
		for(int i = 0; i < nof; i++	)	{
			String name = System.currentTimeMillis() + exts[rd.nextInt(length)].val();
			File file = new File(dirFile, name);
			result[i] = createFile(file);
		}
		
		return result;
	}

	/**
	 * 
	 * getPath()
	 * getAbsolutePath()
	 * getCanonicalPath() : hiểu được các câu lệnh trong đường dẫn
	 */
	public static void printf(File ... files) {
		for (File file : files) {
			System.out.println(file.getPath());
		}
	}

	public static void open(File file) {
		try {
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void close(AutoCloseable ... closeables) {
		for (AutoCloseable closeable : closeables) {
			if (closeables != null) {
				try {
					closeable.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
