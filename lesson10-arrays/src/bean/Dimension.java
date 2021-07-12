package bean;

import utils.ArraysUntils;

public class Dimension {
	public static void main(String[] args) {
		int[] digits = { 1, 9, 5, 36, 12, 33 };
        ArraysUntils.printf(digits);
	}

	private static int[] add(int[] digits, int k, int newElement) {
		int[] result = new int[digits.length + 1];

		for (int i = 0; i < k; i++) {
			result[i] = digits[i];
		}
		result[k] = newElement;

		for (int i = k + 1; i < result.length; i++) {
			result[i] = digits[i - 1];
		}

		return result;
	}
}
