package Bt1;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import common.Extension;
import fileUtils.FileUtils;

public class BT1 {

	private static final  String path = "D:\\java12\\workspaces\\lesson13-hoanphan\\garbage" ;
	private static final  String dirPath = "D:\\java12\\workspaces\\lesson13-hoanphan\\garbage\\image\\" ;
	private static final  String dirPath1 = "garbage/music/" ;
	private static final  String dirPath2 = "garbage/system/" ;
	private static final  String dirPath3 = "garbage/coding/" ;

	
	public static void main(String[] args) throws IOException {	
		Path dir = Paths.get(dirPath3);
		Files.createDirectories(dir);

//		FileUtils.create(path, 20, Extension.values());
		
//		//Filter
//		File[] filesTxt = FileUtils.filter(path,"jpeg");
//		FileUtils.printf(filesTxt);

        //delete
		FileUtils.deleteFiles(path, "txt");
		
		//move
		FileUtils.moveFiles(path, dirPath, "jpeg");
		FileUtils.moveFiles(path, dirPath, "jpg");
		FileUtils.moveFiles(path, dirPath, "png");
		
		FileUtils.moveFiles(path, dirPath1, "mp3");
		FileUtils.moveFiles(path, dirPath1, "mp4");
		
		FileUtils.moveFiles(path, dirPath2, "bat");
		
		//copy
		FileUtils.copyFiles(path, dirPath3, "java");

	}
}