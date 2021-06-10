package ex04;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
	static int[] A = new int[20];
	static int n = 0;
	static Random rd = new Random();
	static Scanner sc = new Scanner(System.in);

	private static void input() {
		System.out.print("Nhập số nguyên dương n (2<n<20): ");
		n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			A[i] = rd.nextInt(10) + 1;
		}
	}

	public static void main(String[] args) {
		input();
		printArr();
		System.out.println("Bội chung nhỏ nhất các phần tử: " + getLeastCommonMultiple());
	}

	private static void printArr() {
		System.out.print("Mảng được random: ");
		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}

	private static int getLeastCommonMultiple() {
		int bcnn = 1;
		for (int i = 0; i < n; i++) {
			bcnn = BCNN(bcnn, A[i]);
		}
		return bcnn;
	}

	private static int UCLN(int a, int b) {
		if (b == 0)
			return a;
		return UCLN(b, a % b);
	}

	private static int BCNN(int a, int b) {
		return (a * b) / UCLN(a, b);
	}
}
