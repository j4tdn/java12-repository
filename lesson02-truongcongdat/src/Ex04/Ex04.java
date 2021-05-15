package Ex04;

import java.util.Scanner;

public class Ex04 {
	/*
	 * Viết chương trình nhập vào một dãy các số nguyên từ bàn phím. Tìm số lẻ lớn
	 * nhất trong dãy số và in ra.
	 * 
	 */
	private static int N = 5;

	public static void main(String[] args) {
		int[] arr = new int[N];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < N; i++) {
			System.out.print("arr[" + i + "] = ");
			arr[i] = sc.nextInt();
		}
		sc.close();

		System.out.println("Số lẻ lớn nhất trong mảng arr là : " + oddMaxNum(arr));
	}

	private static int oddMaxNum(int[] arr) {
		int result = Integer.MIN_VALUE;
		for (int number : arr) {
			if (number % 2 == 1) {
				if (number > result) {
					result = number;
				}
			}
		}
		return result;
	}
}
