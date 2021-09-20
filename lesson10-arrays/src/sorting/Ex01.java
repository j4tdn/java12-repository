package sorting;

import utils.ArrayUtils;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 9, 4, 6, 11 };

		System.out.print("Bubble Sort : ");
		bubbleSort(numbers);
		ArrayUtils.printf(numbers);
		
		System.out.print("Selection Sort : ");
		selectionSort(numbers);
		ArrayUtils.printf(numbers);
	}

	/**
	 * Bubble Sort
	 * 	- is comparison sort, compare two adjacent element and swap order
	 */
	private static void bubbleSort(int[] numbers) {
		// ascending
//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = 0; j < numbers.length - i - 1; j++) {
//				if (numbers[j] > numbers[j + 1]) {
//					int tmp = numbers[j];
//					numbers[j] = numbers[j + 1];
//					numbers[j + 1] = tmp;
//				}
//			}
//		}
		
		for(int i = numbers.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(numbers[j] < numbers[i]) {
					int tmp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = tmp;
				}
			}
		}
 	}
	
	/**
	 * Selection Sort
	 * 	- chọn đầu hoặc cuối để duyệt
	 * 	- for i duyệt các ptử ngoài cùng 
	 * 	- for j duyệt các ptử chưa sorted
	 * 		+ ss các ptử chưa sorted và lấy giá trị lớn/ nhỏ nhất
	 * 		+ ss ptử vừa tìm vs ptử ngoài cùng -> swap
	 */
	private static void selectionSort(int[] numbers) {
		
		for(int i = numbers.length - 1; i > 0 ; i--) {
			int maxIdx = -1;
			int max = Integer.MIN_VALUE;
			
			//find max in unsorted array
			for(int j = 0; j < i; j++) {
				if(numbers[j] > max) {
					max = numbers[j];
					maxIdx = j;
				}
			}
			//swap el max 
			if(numbers[maxIdx] > numbers[i]) {
				int tmp = numbers[i];
				numbers[i] = numbers[maxIdx];
				numbers[maxIdx] = tmp;
			}
		}
	}
}
