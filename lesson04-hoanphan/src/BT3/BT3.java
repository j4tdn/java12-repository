package BT3;

import java.util.Scanner;

public class BT3 {
	public final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] a = new int[10][10];
		int h;
		do {
			System.out.print("\n Nhap do dai cua tam giac pascal = ");
			h = sc.nextInt();
		} while(h > 10);
		System.out.println("\n==========Tam giac Pascal h = " + h + " =============");
		for(int i = 0; i <= h; i++) {
			for(int j = 0; j <= i; j++) {
				if(i == j || j == 0) {
					a[i][j] = 1;
					System.out.print(a[i][j] + "\t");
				} else {
					a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
					System.out.print(a[i][j] + "\t");
				}
			}
			System.out.println(" ");
		}
	}

}