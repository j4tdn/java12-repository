package manipulation;

import java.util.Arrays;
import java.util.Iterator;

import utils.ArrayUtils;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = { 1, 9, 5, 36, 12, 33 };
		ArrayUtils.printf(add(digits, 2, 77));
		ArrayUtils.printf(insert(digits, 2, 77));
		ArrayUtils.printf(remove(digits, 2));
	}

	/**
	 * 1. Add element to index k
	 */
	// c1:
	// 1, 9, 5, 36, 12, 33 | k = 2 , newEl = 77
	// 0 0 0 0 0 0 0
	// 1, 9, 77, 5, 36, 12, 33

	private static int[] add(int[] digits, int k, int newEl) {
		int[] results = new int[digits.length + 1];

		// before k
		for (int i = 0; i < k; i++) {
			results[i] = digits[i];
		}

		// at k
		results[k] = newEl;

		// after k : shift right 1 unit
		for (int i = k + 1; i < results.length; i++) {
			results[i] = digits[i - 1];
		}

		return results;
	}

	// c2:
	// 1, 9, 5, 36, 12, 33 | k= 2, newElement = 77
	// copy to new array : 1, 9, 5, 36, 12, 33 ,0
	// from index k shift right 1 unit
	private static int[] insert(int[] digits, int k, int newEl) {
		int[] results = new int[digits.length + 1];

		for (int i = 0; i < digits.length; i++) {
			results[i] = digits[i];
		}

		for (int i = k; i < results.length; i++) {
			results[i] = digits[i - 1];
		}

		results[k] = newEl;

		return results;
	}

	/**
	 * 2. Remove element at index k
	 */
	// 1, 9, 5, 36, 12, 33 | k= 2
	// 1, 9, 36, 12, 33
	// c1 :
	// copy to new array from 0 to index k-1 -> newArr[i] = arr[i]
	// shift left 1 unit at index k+1 -> newArr[]
	private static int[] remove(int[] digits, int k) {
		int[] results = new int[digits.length - 1];
		
		for (int i = 0; i < k; i++) {
			results[i] = digits[i];
		}
		
		for (int i = k+1 ; i < digits.length; i++) {
			results[i - 1] = digits[i];
		}
		
		return results;
	}

	// c2 :
	// 1, 9, 5, 36, 12, 33 | k= 2
	// 1, 9, 36, 12, 33, 33
	// 1, 9, 36, 12, 33
	private static int[] delete(int[] arr, int k) {
		for (int i = k + 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];

		}
		return Arrays.copyOfRange(arr, 0, arr.length - 1);
	}

}
