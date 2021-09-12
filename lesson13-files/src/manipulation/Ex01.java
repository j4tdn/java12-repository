package manipulation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import utils.FileUtils;

public class Ex01 {
	private static final String path = "data/readme.txt";

	public static void main(String[] args) {
		File file = new File(path);


		System.out.println("============== ^-^ ================");
		FileUtils.read(file);

	}
}