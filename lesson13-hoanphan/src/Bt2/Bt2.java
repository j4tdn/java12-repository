package Bt2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import common.Extension;
import common.ExtensionImg;
import fileUtils.FileUtils;

public class Bt2 {
	
	private static final  String path = "D:\\java12\\workspaces\\lesson13-hoanphan\\images\\" ;
	
	public static void main(String[] args) throws IOException {
		
		Path dir = Paths.get(path);
		Files.createDirectories(dir);
		
	//	FileUtils.createImg(path, 30 , ExtensionImg.values());
		
		FileUtils.renameFiles(path, "png");
		FileUtils.renameFiles(path, "jpg");
		
	}
}
