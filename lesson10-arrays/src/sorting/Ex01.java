package sorting;

import utils.ArraysUtils;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 9, 4, 6, 11, 0 };
		bubbleSort(numbers);
		ArraysUtils.printf(numbers);
	}
	
	private static void bubbleSort(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length - i - 1; j++) {
				if(numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
	}
}
