package manipulation;

import utils.ArraysUntils;

public class Ex02 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 1, 2, 3, 4, 5, 6 };
reverse(a);
ArraysUntils.printf(a);
	}

	private static void reverse(int[] digits) {
		int[] c = new int[digits.length];
		int length=digits.length;
		int m=0;
		for(int i=length-1;i>=0;i--) {
			c[m]=digits[i];
			m++;
		}
		for(int i=0;i<length;i++) {
			digits[i]=c[i];
		}
   	}
}
