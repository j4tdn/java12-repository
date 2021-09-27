package ex01;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import common.Extension;
import utils.FileUtils;

public class Ex01 {
	private static final String PathGarbage = "garbage";
	private static final String PathImage = "garbage/image";
	private static final String PathMusic = "garbage/music";
	private static final String PathSystem = "garbage/system";
	private static final String PathCoding = "garbage/coding";

	public static void main(String[] args) throws IOException {

		File garbage = FileUtils.createDir(PathGarbage);
		File image = FileUtils.createDir(PathImage);
		File music = FileUtils.createDir(PathMusic);
		File system = FileUtils.createDir(PathSystem);
		File coding = FileUtils.createDir(PathCoding);
		deleteFile(garbage);
		deleteFile(image);
		deleteFile(music);
		deleteFile(system);
		deleteFile(coding);
		FileUtils.create(PathGarbage, 20, Extension.values());

		System.out.println("Move file png, jpg, jpeg to folder Image");
		moveFile(garbage, image, file -> file.isFile() && file.getName().endsWith(Extension.png.val())
				|| file.getName().endsWith(Extension.jpg.val()) || file.getName().endsWith(Extension.jpeg.val()));

		System.out.println("Move file mp3, mp4 to folder Music");
		moveFile(garbage, music, file -> file.isFile() && file.getName().endsWith(Extension.mp3.val())
				|| file.getName().endsWith(Extension.mp4.val()));

		System.out.println("Move file bat to folder System");
		moveFile(garbage, system, file -> file.isFile() && file.getName().endsWith(Extension.bat.val()));

		System.out.println("Copy file java to folder Coding");
		copyFile(garbage, coding, file -> file.isFile() && file.getName().endsWith(Extension.java.val()));

		System.out.println("Delete file txt to folder Coding");
		deleteFile(garbage, file -> file.isFile() && file.getName().endsWith(Extension.txt.val()));
	}

	private static void copyFile(File files, File folder, FileFilter filter) throws IOException {
		for (File file : files.listFiles(filter)) {
			File fi = new File(folder.toPath() + "\\" + file.getName());
			Files.copy(file.toPath(), fi.toPath());
		}
	}

	private static void moveFile(File files, File folder, FileFilter filter) {
		for (File file : files.listFiles(filter)) {
			file.renameTo(new File(folder, file.getName()));
		}
	}

	private static void deleteFile(File files, FileFilter filter) {
		for (File file : files.listFiles(filter)) {
			file.delete();
		}
	}
	
	private static void deleteFile(File files) {
		for (File file : files.listFiles())
			if (!file.isDirectory())
				file.delete();
	}
}
