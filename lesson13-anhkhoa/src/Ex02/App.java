package Ex02;

import java.io.File;

import Ex01.Extension;
import utils.FileUtils;

public class App {
	private static String dir = "garbage";
	private static String[] child = { "images" };
	private static String Pathh = "garbage//images";

	public static void main(String[] args) {
		FileUtils.createDirectory(child, dir); 
		FileUtils.create(Pathh, 30, new Extension[] { Extension.pnq, Extension.jpg }); 
		File file = new File(Pathh); 
		File[] files = file.listFiles(a -> a.getName().endsWith(Extension.pnq.getvalue()));
		File[] files1 = file.listFiles(a -> a.getName().endsWith(Extension.jpg.getvalue()));
		FileUtils.renametoEx02(files, Pathh);
		FileUtils.renametoEx02(files1, Pathh);
	}
}
