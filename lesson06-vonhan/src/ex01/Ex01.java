package ex01;

import java.util.Scanner;

public class Ex01 {
	/**
	 * Bẫy lỗi khi giải phương trình bậc nhất ax + b = 0.
	 */
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int a = 0;
		while(true) {
			
			System.out.print("Nhập a : ");
			try {
				a = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println(e.toString());
				System.out.println("Không phải số. Nhập lại !");
			}
		}
		
		int b = 0;
		while(true) {
			System.out.print("Nhập b : ");
			try {
				b = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println(e.toString());
				System.out.println("Không phải số. Nhập lại !");
			}
		}
		
		double result = 0;
		try {
			result = (double)-b / a;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("Nghiệm x của phương trình " + a + "X + " + b + " = 0 là " + result);
		
	}
}