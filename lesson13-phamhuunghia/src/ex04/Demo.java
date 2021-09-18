package ex04;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class Demo {
	private static final String fileName = "Random.txt";
	public static void main(String[] args) {
		writeFile(4, 3, fileName);
		readFile();
	}

	private static void writeFile(int col, int row, String path) {
		File file = createFile(path);

		Random rd = new Random();
		try {
			PrintWriter pw = new PrintWriter(file);
			pw.write(row + " " + col + "\n");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					pw.write(rd.nextInt(10) + " ");

				}
				pw.write("\n");
			}
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static File createFile(String path) {
		File file = new File(path);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return file;
	}

	private static void readFile() {
		int [][]matrix=null;
		int row=0;
		int col=0;
		try {
			List<String> lines = Files.readAllLines(Paths.get(fileName));
			String[] firstLine = lines.get(0).split(" ");
			 row = Integer.parseInt(firstLine[0]);
			 col = Integer.parseInt(firstLine[1]);
			matrix = new int[row][col];
			
			//line 0: col and row
			//line 1 to end : matrix
			for (int i = 1; i <= row; i++) {
				int currentRow = i-1 ;
				asignVal(lines.get(i), matrix, currentRow);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		printMatrix(matrix, row, col);
	}

	private static void asignVal(String input, int[][] matrix, int row) {
		String[] s = input.trim().split(" ");
		for (int i = 0; i < s.length; i++) {
			matrix[row][i] = Integer.parseInt(s[i]);
		}
	}
	
	private static void printMatrix(int [][]matrix, int row,int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j]+" ");
			}
		System.out.println("\n");
		}
	}
	
}
