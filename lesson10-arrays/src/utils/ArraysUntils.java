package utils;

import java.util.Arrays;

import bean.SortOrder;

public class ArraysUntils {
	public static void printf(int[] digits) {
		for (int digit : digits) {
			System.out.println(digit + " ");
		}
		System.out.println();
	}

	public static void printf(Object[] objects) {
		for (Object object : objects) {
			System.out.println(object + " ");
		}
		System.out.println();
	}
	public static void sort(int[] digits, SortOrder order) {
		Arrays.sort(digits);
		if(order==SortOrder.DESC) {
			reverse(digits);
		}
	
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
