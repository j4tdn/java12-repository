package baitap1;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import extension.Extension;

public class Utils {
	private static String PARENT_PATH = "garbage";
	private static final Random rd = new Random();
	
	public static void create() {
		File parent = new File(PARENT_PATH);
		if(!parent.exists()) {
			parent.mkdir();
			createFolder();
			createFile(Extension.values());
		}
	}
	
	public static void createFolder() {
		for(DirEnum path : DirEnum.values()) {
			File dir = new File(PARENT_PATH + "/" + path.toString());
			if(!dir.isDirectory()) {
				dir.mkdir();
			}
		}
	}
	
	public static void createFile(Extension[] extensions) {
		int length = Extension.values().length;
		int count = 0;
		while(true) {
			if(count == 20) {
				break;
			}
			String name = "" + System.currentTimeMillis() + extensions[rd.nextInt(length)].value();
			File file = new File(PARENT_PATH + "/" + name);
			if(!file.exists()) {
				try {
					file.createNewFile();
					count++;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static boolean action(String dest, String option, String... sources) {
		List<File[]> listArr = getFile(sources); 
	
		Iterator<File[]> arrFile = listArr.iterator();
		
		while (arrFile.hasNext()) {
			File[] file = arrFile.next();
			if(file.length != 0) {
				for(int i = 0; i < file.length; i++) {
					switch (option) {
					case "move":
						boolean isMoved = file[i].renameTo(new File("garbage/" + dest + "/" + file[i].getName()));
						if(!isMoved) {
							return false;
						}						
						break;
					case "copy":
						try {
							Files.copy(file[i].toPath(),(new File("garbage/" + dest + "/" + file[i].getName())).toPath(), StandardCopyOption.REPLACE_EXISTING);
						} catch (IOException e) {
							e.printStackTrace();
						}
						break;
					case "delete":
						file[i].delete();
						break;
					}
				}
			}
		}
		return true;
	}

	public static List<File[]> getFile(String... sources) {
		File dir = new File(PARENT_PATH);
		
		return Arrays.asList(sources).stream().map(source -> dir.listFiles(new FileFilter() {
			@Override
			public boolean accept(File file) {
				return file.isFile() && (file.getName().endsWith(source));
			}
		})).collect(Collectors.toList());
	}
}
