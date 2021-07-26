package utils;

import java.util.Arrays;

import bean.SortOrder;

public final class ArraysUtils {
	private ArraysUtils() {
	}
	
	public static void sort(int[] digits, SortOrder order) {
		Arrays.sort(digits);
		if (order == SortOrder.DESC) {
			reverse(digits);
		}
	}
	
	public static void reverse(int[] digits) {
		for (int i = 0; i < digits.length / 2; i++) {
			int temp = digits[i];
			digits[i] = digits[digits.length - 1 - i];
			digits[digits.length - 1 - i] = temp;
		}
	}
	
	public static void printf(int[] digits) {
		for (int digit: digits) {
			System.out.print(digit + " ");
		}
	}
	
	public static void printf(Object[] objects) {
		for (Object object: objects) {
			System.out.println(object + " ");
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
