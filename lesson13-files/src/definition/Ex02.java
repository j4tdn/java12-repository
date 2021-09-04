package definition;

import java.io.File;
import java.io.IOException;

public class Ex02 {
	private static final String path = "../data/readme.txt";
	
	public static void main(String[] args) throws IOException {
		File file = new File(path);
		
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getCanonicalPath());
	}
}
