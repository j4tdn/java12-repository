package BaiTapjava;

import java.util.Scanner;

public class Ex01 {
	public static Scanner scanner = new Scanner(System.in);

	public static boolean Check(Integer x) {
		return (x != 0) && ((x & (x - 1)) == 0);
	}

	public static void main(String[] args) {

		System.out.println("Nhap So can Kiem Tra:");
		Integer x = Integer.parseInt(scanner.nextLine());
		System.out.println((Check(x) ? "La luy thua cua 2" : "Khong phai Luy Thua Cua 2"));
	}
}
