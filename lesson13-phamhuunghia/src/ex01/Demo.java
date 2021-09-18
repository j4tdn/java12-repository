package ex01;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.regex.Pattern;

import static utils.FileUtils.*;

public class Demo {
	public static void main(String[] args) throws IOException {
		createFile();
		
		File[] files=new File("garbage").listFiles();
		
		for(File file:files) {
			if(file.isFile()) {
				String ext=file.getName().split(Pattern.quote("."))[1];
				manipulate(file, ext);
			}
		}
		
	}
	private static void manipulate(File file,String ext) throws IOException {
		switch(ext) {
		case "png", "jpg", "jpeg":
			Files.move(Paths.get(file.getPath()), Paths.get(file.getPath().replace("garbage\\", "garbage\\image\\")));
			break;
		case "mp3", "mp4":  
			Files.move(Paths.get(file.getPath()), Paths.get(file.getPath().replace("garbage\\", "garbage\\music\\")));
			break;
		case "bat": 
			Files.move(Paths.get(file.getPath()), Paths.get(file.getPath().replace("garbage\\", "garbage\\system\\")));
			break;
		case "java": 
			Files.move(Paths.get(file.getPath()), Paths.get(file.getPath().replace("garbage\\", "garbage\\coding\\")));
			break;
		case "txt": 
			file.delete();
			break;
		}
	}
	
	static void createFile() {
		creatFolder(new String[]{"garbage"});
		
		String[] path={ "garbage/image", "garbage/music", "garbage/system", "garbage/coding" };
		creatFolder(path);
		
		create("garbage",20, Extension.values());
	}
	
	
}
