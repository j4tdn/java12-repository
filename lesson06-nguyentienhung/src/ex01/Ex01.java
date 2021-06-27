package ex01;

import java.util.Scanner;

public class Ex01 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int a = 0, b = 0;
		boolean check = true, check1 = true;
		do {
			try {
				do {
					try {
						System.out.println("Nhập giá trị a:");
						a = Integer.parseInt(input.nextLine());
						System.out.println("Nhập giá trị b:");
						b = Integer.parseInt(input.nextLine());
						check = true;
					} catch (Exception ex) {
						System.out.println("Vui lòng nhập giá trị là số");
						check = false;
					}
				} while (check != true);

				double Result = -b / a;
				check1 = true;
				System.out.println("Result: " + Result);
			} catch (ArithmeticException ex) {
				check1 = false;
				System.out.println("Lỗi chia 0 nhập lại a,b");
			}
		} while (check1 != true);

	}

}
