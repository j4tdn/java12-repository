package definition;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import common.Extension;
import utils.FileUtils;

public class Ex01 {
	// relative path
	// absolute path
	private static final String path = "data/readme.txt";
	private static final String dirPath = "data/random";
	
	public static void main(String[] args) throws IOException {
		// create file
//		File file = FileUtils.create(path);
//		System.out.println("is success: " + (file != null));
		
//		Path pth = Paths.get("data","markup.txt");
//		Path pr = Files.createFile(pth);
//		System.out.println("pr: " + pr);
		
		int numberOfFile = 20;
//		boolean[] files = FileUtils.create(dirPath, 20, Extension.values());
//		System.out.println(files);
		
		// filter
		File dirFile = new File(dirPath);
		
		File[] list = dirFile.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				return file.isFile() && file.getName().endsWith(Extension.txt.value());
			}
		});
		FileUtils.printf(list);
	}
}
