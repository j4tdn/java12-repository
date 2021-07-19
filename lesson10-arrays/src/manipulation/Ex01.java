package manipulation;

import utils.ArraysUtils;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = {1,9,6,36,12,33};
		ArraysUtils.printf(delete(digits, 3));
	}
	private static int[] add(int[] digits, int k, int newElement) {
		int[] result = new int[digits.length+1];
		for(int i=0;i<k;i++) {
			result[i]= digits[i];
		}
		result[k] = newElement;
		for(int j=k+1;j<result.length;j++) {
			result[j] = digits[j-1];
		}
		return result;
	}
	private static int[] insert(int[] digits, int k, int newElement) {
		int[] result = new int[digits.length+1];
		for(int i=0;i<digits.length;i++) {
			result[i] = digits[i];
		}
		//shift right 1 unit
		for (int j=result.length-1;j>k;j--) {
			result[j] = result[j-1];
		}
		result[k] = newElement;
		return result;
	}
	private static int[] delete(int[] digits, int k) {
		int[] result = new int[digits.length-1];
		for(int i=0;i<k;i++) {
			result[i]= digits[i];
		}
		for(int i=k;i<result.length;i++) {
			result[i]=digits[i+1];
		}
		return result;
	}
	
}
