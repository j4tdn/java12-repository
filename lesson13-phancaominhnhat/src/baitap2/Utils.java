package baitap2;


import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Random;

import extension.Extension2;

public class Utils {
	private static final Random rd = new Random();
	
	public static void createFolder(String path) {
		File dir = new File(path);
		if(!dir.exists()) {
			dir.mkdirs();
			createFile(Extension2.values(), path);
		}
	}

	public static void createFile(Extension2[] extensions, String path) {
		int length = extensions.length;
		int count = 0;
		while(true) {
			int r = rd.nextInt(length);
			String name = "" + System.currentTimeMillis() + extensions[r].value();
			File file = new File(path + "/" + name);
			if(!file.exists()) {
				try {
					file.createNewFile();
					count++;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(count == 30) {
				break;
			}
		}
	}

	public static void renameFile(String path) {
		File[] filesPNG = getFile(path, Extension2.png); 
		File[] filesJPG = getFile(path, Extension2.jpg); 
		int count = 1;
		for(File file : filesPNG) {
			file.renameTo(new File(file.getParent() + "/" + count + Extension2.png.value()));
			count++;
		}
		count = 1;
		for(File file : filesJPG) {
			file.renameTo(new File(file.getParent() + "/" + count + Extension2.jpg.value()));
			count++;
		}
	}
	
	public static File[] getFile(String path, Extension2 extension) {
		File dir = new File(path);
		
		return dir.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				return file.getName().endsWith(extension.value());
			}
		});
	}
}
