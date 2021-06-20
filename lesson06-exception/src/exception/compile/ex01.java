package exception.compile;

import java.io.File;
import java.io.IOException;

public class ex01 {
	private static final String path="database.md";
	
	public static void main(String[] args) throws IOException {
		File file=new File(path);
		boolean status=false;
		if(!file.exists()) {
			status=file.createNewFile();
		}
		System.out.println(status);
	}
}
