package ex01;

import java.util.Scanner;

public class Ex01 {
	static Scanner sc = new Scanner(System.in);
	static int x, y, R, x_A, y_A;

	public static void main(String[] args) {
		Input();
		IsContains(x, y, x_A, y_A, R);
	}

	public static void Input() {
		System.out.println("Nhap va tam cua duong tron");
		System.out.print("x=");
		x = Integer.parseInt(sc.nextLine());
		System.out.print("y=");
		y = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap vao ban kinh duong tron");
		System.out.print("R=");
		R = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap kiem tra diem bat ki");
		System.out.print("x_A=");
		x_A = Integer.parseInt(sc.nextLine());
		System.out.print("y_A=");
		y_A = Integer.parseInt(sc.nextLine());
	}

	public static void IsContains(int x, int y, int x_A, int y_A, int R) {
		double k = Math.sqrt(Math.pow(x_A - x, 2) + Math.pow(y_A - y, 2));
		if (k == R)
			System.out.println("A thuoc duong tron");
		else
			System.out.println("A khong thuoc duong tron");
	}
}
