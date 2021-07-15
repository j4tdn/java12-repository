package declaration;

import java.util.Arrays;

import bean.Condition;

public class Ex02 {

	public static void main(String[] args) {
		int[] digits = {0,3,5,6,19,22,0};
		
		printf(getDigits(digits,d1 -> d1 % 2 == 0));
		printf(getDigits(digits,d1 -> d1 % 3 == 0));
		
	}
	private static int[] getDigits(int[] digits, Condition cdt) {
		int[] result = new int[digits.length];
		int index = 0;
		
		for(int digit: digits) {
			if(cdt.test(digit)) {
				result[index++] = digit;
			}
		}
		
		return Arrays.copyOf(result, index);
	}
	
	private static void printf(int[] digits) {
		for(int digit: digits) {
			System.out.print(digit+ " ");
		}
		System.out.println();
	}
}
