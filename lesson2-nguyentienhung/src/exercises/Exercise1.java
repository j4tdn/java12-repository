package exercises;

import java.util.Scanner;

public class Exercise1 {
	// Hàm kiểm tra số lũy thừa
	public static boolean Check(int soLuyThua) {
		int temp = soLuyThua;
		for (int i = 1; i < soLuyThua; i++) {
			if (temp % 2 != 0)
				return false;
			temp /= 2;
			if (temp == 1)
				break;
		}
		return true;
	}

	public static void main(String[] args) {
		int soLuyThua;

		// Nhập giá trị
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Nhập vào số cần kiểm tra: ");
			soLuyThua = input.nextInt();
		}

		// Xuất kết quả
		String s = (Check(soLuyThua)) ? "Là số lũy thừa của 2" : "Không là lũy thừa của 2";
		System.out.println(s);
	}

}
