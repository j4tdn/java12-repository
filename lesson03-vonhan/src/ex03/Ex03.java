package ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		int row, col, i, j;
		int tableA[][] = new int[10][10];
		
		// nhập kích thước bảng
		System.out.print("Enter row for the table A : ");
		row = ip.nextInt();
		System.out.print("Enter column for the table A : ");
		col = ip.nextInt();

		//nhập phần tử
		System.out.println("Enter " + (row * col) + " Table Elements : ");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print("tableA["+i+"]["+j+"]");
				tableA[i][j] = ip.nextInt();
			}
		}

		// in bảng
		System.out.print("The Table A is :\n");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(tableA[i][j] + "  ");
			}
			System.out.println();
		}

		kiemTraYenNgua(tableA, row, col);

	}

	public static void kiemTraYenNgua(int[][] tableA, int x, int y) {
		int minhang[] = new int[10];
		int maxcot[] = new int[10];
		for (int i = 0; i < x; i++) {
			minhang[i] = tableA[i][0];
			for (int j = 0; j < y; j++) {
				if (minhang[i] > tableA[i][j]) {
					minhang[i] = tableA[i][j];
				}
			}
		}

		for (int j = 0; j < y; j++) {
			maxcot[j] = tableA[0][j];
			for (int i = 0; i < x; i++) {
				if (maxcot[j] < tableA[i][j]) {
					maxcot[j] = tableA[i][j];
				}
			}
		}

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if ((tableA[i][j] == minhang[i]) && (tableA[i][j] == maxcot[j])) {
					System.out.println("Phần tử yên ngựa là " + tableA[i][j]);
				}
			}
		}
	}
}
