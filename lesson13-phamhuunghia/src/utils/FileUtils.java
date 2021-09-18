package utils;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class FileUtils {
	public static void creatFolder(String[] names) {
		File dir;
		for (String name : names) {
			dir = new File(name);
			if (!dir.exists()) {
				dir.mkdir();
			}
		}
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
	
	public static void create(String dirPath,int nbrFile, Object[] exts) {
		File dirFile = new File(dirPath);
		Random rd = new Random();
		int count = 1;
		if (dirFile.exists()) {
			dirFile.mkdirs();
		}
		int length = exts.length; 
		while(count <= nbrFile) {
			String name = dirPath + "/" + System.currentTimeMillis() + "." + exts[rd.nextInt(length)];
			File file = new File(name);
			count = createFile(file) ? ++count : count;
		}
	}
}
