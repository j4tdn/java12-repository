package lesson03_date1_bai3;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		int m = 0, n = 0;
		int[][] arr = null;
		// Nhap du lieu cua ma tran
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so hang cua ma tran: ");
		m = scanner.nextInt();
		System.out.print("Nhap so cot cua ma tran: ");
		n = scanner.nextInt();
		
		arr = new int[m][n]; 
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		
		// Tim phan tu nho nhat cua hang
		MaxAndMin[] min = MaxAndMinUtils.elementMinOfRow(m, n, arr);
		// Tim phan tu lơn nhat trong cot 
		MaxAndMin[] max = MaxAndMinUtils.elementMaxOfCol(m, n, arr, min);
		
		if(MaxAndMinUtils.isElementSaddle(min, max) != null) {
			MaxAndMin elementSaddle = MaxAndMinUtils.isElementSaddle(min, max); 
				System.out.print("Phan tu yen ngua la: " + elementSaddle.getValue());
				System.out.println(" | Ô số: [" + elementSaddle.getElementRow() + "," + elementSaddle.getElementCol() + "]");
		} else {
			System.out.println("Khong tim thay!!!");
		}
	}
}
