package ex02;

import static utils.FileUtils.*;

import java.io.File;

public class Demo {
	public static void main(String[] args) {
		
		Extention[] imgExts = {Extention.png,Extention.jpg};
		creatFolder(new String[]{"images"});
		create("images", 30, imgExts);
		
		for(Extention ext: imgExts) {
			renameFile(ext);
		}
		
	}
	
	private static void renameFile(Extention ex) {
		File[] file = filter(ex);
		int count=0;
		for(int i=0; i< file.length;i++) {
			File newFile = new File("images/", ++count + ex.val());
			file[i].renameTo(newFile);
		}
	}
	
	
	
	private static File[] filter(Extention ex) {
		File dirFile=new File("images");
		File[] files=dirFile.listFiles(pathName ->pathName.getName().endsWith(ex.val()));
		
		return files;
	}
}
