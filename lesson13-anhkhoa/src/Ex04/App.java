package Ex04;

import java.io.File;

import utils.FileUtils;

public class App {
	public static void main(String[] args) {
		FileUtils.WriteMatrix("Bai4\\Random.txt");
		File file = new File("Bai4\\Random.txt");
		FileUtils.read(file);
	}
}
