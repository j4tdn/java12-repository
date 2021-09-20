package definition;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

import common.Extension;
import utils.FileUtils;

public class Ex01 {
	// relative path
	// absolute path

	private static final String path = "data/readme.txt";
	private static final String dirPath = "data/random";

	public static void main(String[] args) throws IOException {
		/* create file with File class */
//		File file = FileUtils.create(path);
//		System.out.println("isSuccess : " + (file != null));

		/* create file with Path class */
//		Path path = Paths.get("data", "markup.txt");
//		Path pr = Files.createFile(path);
//		System.out.println("pr : " + pr);

		/* create 20 random files */
		boolean[] files = FileUtils.create(dirPath, 20, Extension.values());
		System.out.println(files);

		/**
		 * Filter 
		 * - listFiles() : File[] file 
		 * - listFiles(FileFilter filter) : File[] file
		 * 			~ (FileNameFilter nameFilter)
		 * - isFile() : Boolean file 
		 * - isDirectory() : Boolean folder(file)
		 */
		File file = new File(dirPath);

		File[] listFiles = file.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				File file = new File(dir, name);
				return file.isFile() && file.getName().endsWith(Extension.txt.val());
			}
		});
		FileUtils.printf(listFiles);
	
	}
}
