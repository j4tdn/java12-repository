package Bai2;

import java.util.Arrays;

public class Demo {
	private static int n = 10;
	private static int[] arr = { 3, 7, 9, 2, 1, 6, 5, 4, 10 };

	public static void main(String[] args) {
		System.out.println(Find());
	}

	private static int Find() {
		int sum = 0;
		int sum1 = 0;
		for (int item : arr) {
			sum += item;
		}
		for (int i = 0; i <= n; i++) {
			sum1 += i;
		}
		return sum1-sum;
	}
}
