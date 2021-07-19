package manipulation;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		int[] a = { 1, 7, 2, 4, 9};
		int[] b = { 1, 2, 3, 4, 5, 6};
	}

	private static void reverse(int[] digits) {
		for (int i = 0; i < digits.length / 2; i++) {
			int temp = digits[i];
			digits[i] = digits[digits.length - 1 - i];
			digits[digits.length - 1 - i] = temp;
		}
	}
}
