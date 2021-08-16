package sorting;

import Utils.ArrayUtils;


/**
 * bubbleSort
 */
public class Ex01 {
	public static void main(String[] args) {
		int numbers[] = { 1, 5, 9, 4, 6, 11 };
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length-i-1; j++) {
				int temp = numbers[j];
				numbers[j] = numbers[j + 1];
				numbers[j + 1] = temp;
			}
		}
		
		ArrayUtils.printf(numbers);
	}
}
