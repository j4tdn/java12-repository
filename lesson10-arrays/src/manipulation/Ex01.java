package manipulation;

import utils.ArrayUtils;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = { 1, 9, 5, 36, 12, 33 };
		ArrayUtils.printf(add(digits, 77, 2));
	}
	
	private static int[] add(int[] arr, int newEl, int k) {
		int[] result = new int[arr.length + 1];
		
		for(int i = 0; i < k; i++) {
			result[i] = arr[i];
		}
		
		result[k] = newEl;
		
		for(int i = k+1; i < result.length; i++) {
			result[i] = arr[i-1];
		}
		
		return result;
		
	}
}
