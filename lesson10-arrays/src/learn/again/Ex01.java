package learn.again;

import java.util.Arrays;

public class Ex01{
	public static void main(String[] args) {
		int[] digits = {0,1,2,3,4,5,6,7,8};
		
		printf(getElements(digits, digit -> digit % 2 == 0));
		printf(getElements(digits, digit -> digit % 2 != 0));

	}

	private static int[] getElements(int[] digits, Strategy strategy) {
		int[] result = new int[digits.length]; 
		int index = 0;
		
		for (int digit : digits) {
			if(strategy.condition(digit)) {
				result[index++] = digit;	
			}
		}
		
		return Arrays.copyOf(result, index);
	}
	
	private static void printf(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
