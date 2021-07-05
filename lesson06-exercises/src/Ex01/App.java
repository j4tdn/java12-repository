package Ex01;

import java.util.Scanner;

public class App {
	private static Scanner scan = new Scanner(System.in);
	private static Integer a;
	private static Integer b;
	private static Integer x;

	public static void main(String[] args) {
		// ax+b=0;

		boolean check = false;
		while (check == false) {
			try {
				System.out.println("nhap a: ");
				a = Integer.parseInt(scan.nextLine());
				System.out.println("nhap b: ");
				b = Integer.parseInt(scan.nextLine());
				x = -b / a;
				System.out.println(x);
				check = true;
			} catch (NumberFormatException  e) {
				System.out.println("vui long nhap so");
			} catch (ArithmeticException e) {
				System.out.println("khong the chia cho 0");
				System.out.println("vui long nhap lai");
			}

		}
	}
}
