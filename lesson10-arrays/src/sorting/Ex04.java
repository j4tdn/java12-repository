package sorting;

import utils.ArraysUtils;

public class Ex04 {
	public static void main(String[] args) {
		// selection sort
		int[] digits = { 1, 5, 9, 4, 6, 11 };
		
		for (int i = 0; i < digits.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < digits.length; j++) {
				if (digits[minIndex] > digits[j]) {
					minIndex = j;
				}
			}
			
			int temp = digits[i];
			digits[i] = digits[minIndex];
			digits[minIndex] = temp;
		}
		
		ArraysUtils.printf(digits);
	}
}
