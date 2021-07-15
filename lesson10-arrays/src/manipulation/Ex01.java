package manipulation;

import utils.ArraysUtils;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = {1,9,6,36,12,33};
		ArraysUtils.printf(add(digits, 2,72));
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
}
