package menupulation;

import java.util.Arrays;

import Utils.ArrayUtils;

public class Ex02 {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		reverse(a);
		ArrayUtils.printf(a);
	}

	private static void reverse(int[] digits) {
		int[] c=Arrays.copyOfRange(digits, 0, digits.length);
		int index=0;
		for(int i=digits.length-1;i>=0;i--) {
			digits[index++]=c[i];
		}
	}
}
