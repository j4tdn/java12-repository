package exercises;

import java.util.Scanner;

public class Exercise3 {
	// Hàm kiểm tra số đối xứng
	public static boolean Check(int n) {
		int temp = 0;
		int temp2 = n;
		while (n != 0) {
			temp += n % 10;
			n /= 10;
			if (n != 0)
				temp *= 10;
		}
		return temp == temp2;
	}

	public static void main(String[] args) {
		int number;
		// Nhập giá trị
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Nhập vào số cần kiểm tra: ");
			number = input.nextInt();
		}
		// Trả về kết quả
		String s = (Check(number)) ? "Là số đối xứng" : "Không là số đối xứng";
		System.out.println(s);
	}
}
