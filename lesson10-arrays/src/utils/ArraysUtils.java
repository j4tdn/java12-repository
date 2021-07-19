package utils;

public final class ArraysUtils {
	private ArraysUtils() {
	}
	
	public static void printf(int[] digits) {
		for (int digit: digits) {
			System.out.print(digit + " ");
		}
	}
	
	public static int[] add(int[] digits, int k, int newElement) {
		int[] result = new int[digits.length + 1];
		for (int i = 0; i < result.length; i++) {
			if (i < k) {
				result[i] = digits[i];
			} else if (i == k) {
				result[i] = newElement;
			} else {
				result[i] = digits[i - 1];
			}
		}
		return result;
	}
}
