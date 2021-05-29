package ex03;

import java.util.Scanner;

public class YenNgua {
	static int sh, sc;

	public static void main(String[] args) {
		int arr[][] = new int[10][10];
		Input(arr);
		System.out.println();
		Show(arr);
		System.out.println();
		YenNgua(arr);
	}



	public static void Input(int arr[][]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so hang: ");
		sh = input.nextInt();
		System.out.print("Nhap so cot: ");
		sc = input.nextInt();
		for (int i = 0; i < sh; i++) {
			for (int j = 0; j < sc; j++) {
				System.out.print("Nhap phan tu [" + i + " ; " + j + "] = ");
				arr[i][j] = input.nextInt();
			}
		}
	}

	public static void Show(int arr[][]) {
		System.out.println("Hien thi ma tran");
		for (int i = 0; i < sh; i++) {
			for (int j = 0; j < sc; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void YenNgua(int arr[][]) {
		int min;
		int max;
		int n = 0;
		int count = 0;
		for (int i = 0; i < sh; i++) {
			min = arr[i][0];
			for (int j = 0; j < sc; j++) {
				if (min > arr[i][j]) {
					min = arr[i][j];
					n = j;
				} 
			}
			max = min;
			for (int j = 0; j < sh; j++) {
				if (max < arr[j][n])
					max = arr[j][n]; 
			}
			if (max == min) {
				System.out.println(max);
				count++;
				}
		}
		if (count == 0) System.out.println("Khong co phan tu yen ngua");
	}
}
