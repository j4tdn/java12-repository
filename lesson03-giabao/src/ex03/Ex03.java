package ex03;

import java.util.Scanner;

public class Ex03 {
	static int[][] A = new int[10][10];
	static Scanner sc = new Scanner(System.in);
	static int row, column;

	public static void main(String[] args) {
		System.out.print("Nhập vào số hàng: ");
		row = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập vào số cột: ");
		column = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				A[i][j] = Integer.parseInt(sc.nextLine());
			}
		}
		Xuatmang();
		System.out.println("===============================");
		if (isExist(A)) {
			System.out.println("Có phần tử yên ngựa ở mảng này!");
		} else {
			System.out.println("Không có phần tử yên ngựa ở mảng này!");
		}

	}

	public static boolean isExist(int[][] Array) {
		int i, j, min, min_index;
		boolean max;
		for (i = 0; i < row; i++) {
			// kiểm tra có phải min của hàng i hay không
			min = A[i][0];
			min_index = 0;
			for (j = 0; j < column; j++) {
				if (A[i][j] < min) {
					min = A[i][j];
					min_index = j;
				}
			}

			// kiểm tra có phải max của cột min_index hay không
			max = true;
			for (j = 0; j < row; j++) {
				if (A[j][min_index] > min) {
					max = false;
					break;
				}
			}
			if (max)
				return true;
		}
		return false;
	}

	public static void Xuatmang() {
		System.out.println("Mảng 2 chiều đã nhập vào là:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}
}
