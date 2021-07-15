package manipulation;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = {1, 9, 5, 36, 12, 33};
//		ArrayUtils.printf(add(digits, 2, 77));
	}
	
	private static int[] add(int[] digits, int k, int newElement) {
		int[] result = new int[digits.length + 1];
		
		result = Arrays.copyOfRange(digits, 0, digits.length);
		for(int i = k; i < result.length; i++) {
			result[i + 1] = result[i]; 
		}
		result[k] = newElement;
		
		return result;
	}
}
