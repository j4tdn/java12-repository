//Tìm số lẻ lớn nhất trong dãy số
package ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập số phần tử trong mảng :  ");
		int n = Integer.parseInt(sc.nextLine());
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("arr[" + i + "] = ");
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Số lẻ lớn nhất trong mảng arr là : " + oddMax(arr));
	}

	private static int oddMax(int[] arr) {
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
