package ex01;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import utils.FileUtils;

public class Ex01 {
	private static String path = "garbage";
	private static String[] arrFolder = { "image", "music", "system", "coding" };
	private static String dirPath = "garbage";

	public static void main(String[] args) {
		// Create folder garbage in lesson13-giabao
//		File file = FileUtils.createFolder(path);
//		System.out.println("isValid: " +  (file!=null));
//		
		// create 4 folder in garbage
//		for(String name: arrFolder) {
//			Path pathfolder = Paths.get(path, name);
//			FileUtils.createFolder(pathfolder.toString());
//		}

		// create 20 files with extension enum
//		int nof =20;
//		boolean[] files = FileUtils.create(dirPath, nof, Extension.values());
//		System.out.println(files);

		// move file -> folder
		moveFile(filterFile(Extension.png), arrFolder[0]);
		moveFile(filterFile(Extension.jpg), arrFolder[0]);
		moveFile(filterFile(Extension.jpeg), arrFolder[0]);

		moveFile(filterFile(Extension.mp3), arrFolder[1]);
		moveFile(filterFile(Extension.mp4), arrFolder[1]);

		moveFile(filterFile(Extension.bat), arrFolder[2]);

		// copy file->folder
		copyFile(filterFile(Extension.java), arrFolder[3]);
		
		//delete file .txt
		deleteFile(filterFile(Extension.txt));
	}
	private static void deleteFile(File[] files) {
		for(File file: files) {
			file.delete();
		}
	}
	private static void copyFile(File[] files, String pathOfFolder) {
		InputStream inStream = null;
		OutputStream outStream = null;
		try {
			for(File file: files) {
			Path newpath = Paths.get(dirPath, pathOfFolder,file.getName());
			inStream = new FileInputStream(file);
			outStream = new FileOutputStream(new File(newpath.toString()));
			int length;
			byte[] buffer = new byte[1024];

			// copy the file content in bytes
			while ((length = inStream.read(buffer)) > 0) {
				outStream.write(buffer, 0, length);
			}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inStream.close();
				outStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void moveFile(File[] files, String pathOfFolder) {
		try {
			Path newpath = Paths.get(dirPath, pathOfFolder);
			for (File file : files) {
				file.renameTo(new File(newpath.toString(), file.getName()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
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
