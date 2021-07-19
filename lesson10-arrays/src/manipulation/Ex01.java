package manipulation;

import java.util.Arrays;

import utils.ArraysUntils;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = { 1, 9, 5, 36, 12, 33 };
		ArraysUntils.printf(add(digits, 2, 3));
		System.out.println("=======");
		ArraysUntils.printf(remove(digits, 2));
	}

	private static int[] add(int[] digits, int k, int newElement) {
		int[] result = new int[digits.length + 1];
		// copy
		for (int i = 0; i < digits.length; i++) {
			result[i] = digits[i];
		}
		// shift right 1 unit
		for (int i = result.length - 1; i > k; i--) {
			result[i] = result[i - 1];
		}

		result[k] = newElement;
		return result;
	}

	private static int[] remove(int[] digits, int k) {
		int[] result = new int[digits.length - 1];
		for (int i = 0; i < k; i++) {
			result[i] = digits[i];
		}
		for (int i = k + 1; i < digits.length; i++) {
			result[i - 1] = digits[i];
		}
		return result;
	}

	private static int[] delete(int[] digits, int k) {
		for (int i = k + 1; i < digits.length; i++) {
			digits[i - 1] = digits[i];
		}
		return Arrays.copyOfRange(digits, 0, digits.length - 1);
	}
}
