package definition;

import java.io.File;
import java.io.IOException;

public class Ex02 {
	private static String path = "readme.txt";

	public static void main(String[] args) throws IOException {
		File file = new File(path);
		String path = file.getPath();
		String absolutePath = file.getAbsolutePath();
		String canonicalPath = file.getCanonicalPath();
		
		System.out.println("Path: " + path);
		System.out.println("abso: " + absolutePath);
		System.out.println("canon: " + canonicalPath);
	}
}