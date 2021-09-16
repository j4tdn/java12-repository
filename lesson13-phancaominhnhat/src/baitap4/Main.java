package baitap4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
	private static Random rd = new Random();
	private static Scanner scanner = new Scanner(System.in);
	private static String PATH = "src/baitap4/readme.txt";
	private static int row = 0;
	private static int column = 0;
	
	public static void main(String[] args) {
		int[][] matrix = createMatrix();
		File file = create();
		
		writeFile(file, matrix);
		
		int[][] matrixOutput =  readFile();
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print(matrixOutput[j][i] + "    ");
			}
			System.out.println();
		}
	}
	
	public static int[][] createMatrix() {
		System.out.println("Enter row: ");
		row = scanner.nextInt();
		System.out.println("Enter column: ");
		column = scanner.nextInt();
		
		int[][] matrix = new int[column][row];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				matrix[j][i] = rd.nextInt(9);
			}
		}
		return matrix;
	}
	
	public static File create() {
		boolean isValid = true;
		File file = new File(PATH);
		
		if(!file.exists()) {
			File parent = file.getParentFile();
			if(parent != null && !parent.exists()) {
				parent.mkdirs();
			}
			isValid = createFile(file);
		}
		return isValid ? file : null;
	}
	
	public static boolean createFile(File file) {
		boolean isValid = false;
		
		try {
			isValid = file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return isValid;
	}

	public static void writeFile(File file, int[][] matrix) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write("rows: " + row + " || column: " + column);
			bw.newLine();
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < column; j++) {
					bw.write(matrix[j][i] + "    ");
				}
				bw.newLine();
			}
			bw.close();fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int[][] readFile() {
		FileReader fr = null;
		BufferedReader br = null;
		int[][] matrixOutput = new int[column][row];
		try {
			fr = new FileReader(new File(PATH));
			br = new BufferedReader(fr);
			
			String dataRow = null;
			int i = 0;
			int j = 0;
			boolean isFirstLine = true;
			while((dataRow = br.readLine()) != null){
				if(isFirstLine) {
					isFirstLine = false;
					continue;
				}
				if(dataRow != "") {					
					for(String numberStr : dataRow.split("\\s+")) {
						matrixOutput[j][i] = Integer.parseInt(numberStr);
						j++;
					}
					i++;
					j = 0;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return matrixOutput;
	}
}
