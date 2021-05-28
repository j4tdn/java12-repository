package exercise03;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		int soDong, soCot;
		ArrayList<Integer> list = new ArrayList<Integer>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào số dòng của mảng: ");
		soDong = scanner.nextInt();
		System.out.println("Nhập vào số cột của mảng: ");
		soCot = scanner.nextInt();

		int[][] A = new int[soDong][soCot];
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
				A[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Mảng vừa nhập: ");
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println("\n");
		}
		int chiSoDong, chiSoCot, min, max, check = 1;
		for (int i = 0; i < soDong; i++) {
			min = A[i][0];
			max = A[i][0];
			chiSoDong = i;
			chiSoCot = 0;
			check = 1;
			for (int j = 0; j < soCot; j++) {
				if (min > A[i][j]) {
					min = A[i][j];
					max = A[i][j];
					chiSoDong = i;
					chiSoCot = j;
				}
			}
			for (int v = 0; v < soDong; v++) {
				if (max < A[v][chiSoCot])
					check = 0;
			}
			if (check == 1)
				list.add(A[chiSoDong][chiSoCot]);
		}
		if (list.size() == 0)
			System.out.println("Không có phần tử yên ngựa nào");
		else {
			System.out.println("Phần tử yên ngựa là:");
			for (int item : list) {
				System.out.println(item);
			}
		}
	}
}
