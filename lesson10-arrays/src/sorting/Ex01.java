package sorting;

import Utils.ArrayUtils;

public class Ex01 {
	public static void main(String[] args) {
		int numbers[] = { 1, 5, 9, 4, 6, 11 };

		// ascending
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; i < numbers.length - i - 1; i++) {
				if (numbers[j] < numbers[j + 1]) {
					int tmp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1]=tmp;
				}
			}
		}
		ArrayUtils.printf(numbers);
	}
}
