package declaration;

import java.util.Arrays;

import bean.Condition;

public class Ex02 {	
	public static void main(String[] args) {
		int[] digits = {0,1,2,3,4,5,6,7,8,9};
		
		printf(getElements(digits, d1 -> d1 % 2 == 0));
		printf(getElements(digits, d1 -> d1 % 3 == 0));
	}
	
	private static int[] getElements(int[] digits, Condition cdt) {
		int[] result = new int[digits.length];
		int index = 0;
		
		for(int digit: digits) {
			if (cdt.test(digit)) {
				result[index++] = digit;
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}
	
	private static void printf(int[] digits) {
		for(int digit: digits) {
			System.out.println(digit + " ");
		}
		System.out.println();
	}
}

