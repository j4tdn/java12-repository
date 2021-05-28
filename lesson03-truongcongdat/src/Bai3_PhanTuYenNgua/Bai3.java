package Bai3_PhanTuYenNgua;

import java.util.Random;
import java.util.Scanner;

public class Bai3 {
	public static Random rd = new Random();
	public static Scanner sc = new Scanner(System.in);
	public static int[][] arr;
	public static int row;
	public static int col;

	/**
	 * 
	 * 3 45 8 24 36 10 7 4 11
	 * 
	 * -> Nhỏ nhất trong hàng, lớn nhất trong cột ->
	 */

	public static void main(String[] args) {
		System.out.print("Nhập số hàng: ");
		row = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập số cột: ");
		col = Integer.parseInt(sc.nextLine());
		arr = new int[row][col];
		input();
		output();
		checkHang();
	}

	public static void input() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = rd.nextInt(99) + 1;
			}
		}
	}
	
	public static void output() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("%-4d",arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void checkHang() {
		for (int i = 0; i < row; i++) {
			int minRow = Integer.MAX_VALUE;
			int cot = 0;
			int hang = 0;
			for (int j = 0; j < col; j++) {
				// Thu được số nhỏ nhất trong hàng
				if (minRow > arr[i][j]) {
					minRow = arr[i][j];
					hang = i;
					cot = j;
				}
			}
			if (checkCot(hang, cot, minRow)) {
				return;
			}
		}
		System.out.println("Không có phần tử yên ngựa");
	}

	// Quét cột thứ j
	public static boolean checkCot(int hang, int cot, int minRow) {
		int maxCol = minRow;
		for (int i = 0; i < row; i++) {
			if (arr[i][cot] == minRow) {
				continue;
			}
			if (arr[i][cot] > maxCol) {
				maxCol = arr[i][cot];
			}
		}
		if (maxCol == minRow) {
			System.out.println("Phần tử yên ngựa là: " + maxCol);
			return true;
		} else {
			return false;
		}
	}
}
