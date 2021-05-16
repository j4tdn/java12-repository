package data_structures;

import java.util.Scanner;

public class Ex01 {

	public static boolean isPowerOfTwo(int n) {
		// dùng đệ quy,
		if (n == 1)
			return true;
		else if (n % 2 != 0 || n == 0)
			return false;
		return isPowerOfTwo(n / 2);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int ob = sc.nextInt();
		if (isPowerOfTwo(ob) == true) {
			System.out.println("True " + "\n");
		} else
			System.out.println("False " + "\n");

	}
}
