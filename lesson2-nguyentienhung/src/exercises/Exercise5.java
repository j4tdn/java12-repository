package exercises;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		int number, i = 1, sum = 0;
		// Nhập xuất
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Nhập vào số cần đổi: ");
			number = input.nextInt();
		}
		// Đổi cơ số
		do {
			sum += (number % 2) * i;
			number /= 2;
			i *= 10;
		} while (number > 0);
		// Xuất kết quả
		System.out.println("KQ: " + sum);
	}

}
