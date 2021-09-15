package ex02;

import java.io.File;
import java.io.FileFilter;
import java.nio.file.Paths;

import ex01.Extension;
import utils.FileUtils;

public class Ex02 {
	private static String dirPath ="garbage/images";
	public static void main(String[] args) {
		//create 30 file images in images
		int nof =30;
		Extension[] imgExts = {Extension.jpg,Extension.png};
		boolean[] files = FileUtils.create(dirPath, nof, imgExts);
		System.out.println(files);
		
		//rename images 
		renameImage(filterFile(Extension.jpg), Extension.jpg);
		renameImage(filterFile(Extension.png), Extension.png);
	}
	private static boolean[] renameImage(File[] file,Extension ex) {
		boolean[] rs = new boolean[file.length];
		for (int i=0;i<file.length;i++) {
			// File (or directory) with new name
			String newName = i + ex.val();
			File newfile = new File(dirPath,newName);
			rs[i] = file[i].renameTo(newfile);
		}
		return rs;
	}
	private static File[] filterFile(Extension ex) {
		File dirFile = new File(dirPath);
		File[] files = dirFile.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.isFile() && pathname.getName().endsWith(ex.val());
			}
		});
		return files;
	}
}
