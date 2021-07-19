package manipulation;

import java.util.Arrays;

import utils.ArraysUtils;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = { 1, 9, 5, 36, 12, 33 };
		ArraysUtils.printf(delete(digits, 1));
	}

	private static int[] add(int[] digits, int k, int newElement) {
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
	
	private static int[] insert(int[] digits, int k, int newElement) {
		int[] result = new int[digits.length + 1];
		
		// copy
		for (int i = 0; i < digits.length; i++) {
			result[i] = digits[i];
		}
		
		// shift right 1 unit
		for (int i = result.length - 1; i > k; i--) {
			result[i] = result[i - 1];
		}
		
		// assign
		result[k] = newElement;
		return result;
	}
	
	private static int[] remove(int[] digits, int k) {
		int[] result = new int[digits.length - 1];
		for (int i = 0; i < result.length; i++) {
			if (i < k) {
				result[i] = digits[i];
			} else {
				result[i] = digits[i + 1];
			}
		}
		return result;
	}
	
	private static int[] delete(int[] digits, int k) {
		int[] result = Arrays.copyOf(digits, digits.length);
		for (int i = k; i < result.length - 1; i++) {
			result[i] = result[i + 1];
		}
		return Arrays.copyOf(result, result.length - 1);
	}
}
