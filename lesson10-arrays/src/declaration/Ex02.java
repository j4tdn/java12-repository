package declaration;

import java.util.Arrays;

import bean.Comparator;

public class Ex02 {
	public static void main(String[] args) {
		int[] digits = {1, 3, 6, 19, 22, 40};
		int[] result = get(digits, a -> a % 2 == 0);
		System.out.println(Arrays.toString(result));
	}
	
	private static int[] get(int[] digits, Comparator comparator) {
		int[] result = new int[digits.length];
		int count = 0;
		for (int digit: digits) {
			if (comparator.compare(digit)) {
				result[count] = digit;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
