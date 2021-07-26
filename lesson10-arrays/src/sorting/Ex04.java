package sorting;

import utils.ArraysUtils;

public class Ex04 {
	public static void main(String[] args) {
		// selection sort
		int[] digits = { 1, 5, 9, 4, 6, 11 };

		
		// i = 0 -> length - 1
		// j = i + 1 -> length - 1
		for (int i = digits.length - 1; i > 0; i--) {
			int maxIdx = -1;
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < i; j++) {
				if (digits[j] > max) {
					max = digits[j];
					maxIdx = j;
				}
			}
			
			// swap element at maxIdx with i
			if (digits[maxIdx] > digits[i]) {
				int tmp = digits[i];
				digits[i] = digits[maxIdx];
				digits[maxIdx] = tmp;
			}
		}
		
		// quick sort, merge sort

		ArraysUtils.printf(digits);
	}
}
