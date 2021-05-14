package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		int n;
		try (Scanner scanner = new Scanner(System.in)) {
			do {
				System.out.println("Nhập vào số lượng số cần nhập: ");
				n = scanner.nextInt();
			} while (n < 0);

			// Khởi tạo và cấp phát bộ nhớ cho mảng
			int array[] = new int[n];

			System.out.println("Nhập các số : ");
			for (int i = 0; i < n; i++) {
				System.out.print("Nhập số thứ " + i + ": ");
				array[i] = scanner.nextInt();
			}

			// Hiển thị mảng vừa nhập
			System.out.println("\nCác số vừa nhập: ");
			for (int i = 0; i < n; i++) {
				System.out.print(array[i] + "\t");
			}
			// Sắp xếp mảng

			Arrays.sort(array);

			// Xuất kết quả
			for (int i = n - 1; i >= 0; i--) {
				if (array[i] % 2 != 0) {
					System.out.println("Kết quả: " + array[i]);
					break;
				}
			}
		}
	}

}
