package ex02;

import java.io.File;
import java.io.FileFilter;

import common.Extension;
import utils.FileUtils;

public class Ex02 {
	private static final String PathImage = "images";
	public static void main(String[] args) {
		File images = FileUtils.createDir(PathImage);
		deleteFile(images);
		FileUtils.create(PathImage, 30, Extension.jpg, Extension.png);
		rename(images, "jpg", file -> file.getName().endsWith(".jpg"));
		rename(images, "png", file -> file.getName().endsWith(".png"));
	}
	
	private static void rename(File files, String name, FileFilter filter) {
		int i = 1;
		for(File file: files.listFiles(filter)) {
			file.renameTo(new File(file.getParentFile(), i + "." + name));
			i++;
		}
	}
	
	private static void deleteFile(File files) {
		for (File file : files.listFiles())
			if (!file.isDirectory())
				file.delete();
	}
}
