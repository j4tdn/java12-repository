package ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		writeFile();
		readFile();
	}

	private static void readFile() {
		File file = new File("Random.txt");
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			br.lines()
				.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}

	private static void writeFile() {
		File file = new File("Random.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		int row = 3;
		int col = 5;
		Random rd = new Random();
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					bw.write(rd.nextInt(100) + " ");
				}
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				bw.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}

	}
}
