package utils;

import java.util.Arrays;

import bean.SortOrder;

public class ArraysUtils {
	public ArraysUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static void sort(int[] digits, SortOrder order) {
		Arrays.sort(digits);
		
		if(order == SortOrder.DESC) {
			reverse(digits);
		}
	}
	
	
	public static void printf(int[] digits) {
		for(int digit:digits) {
			System.out.print(digit+ " ");
		}
		System.out.println();
	}
	
	public static void printf(Object[] objects) {
		for(Object object:objects) {
			System.out.println(object);
		}
		System.out.println();
	}
	
	private static void reverse(int[] digits) {
		for(int i = 0; i < digits.length / 2; i++) {
			int temp = digits[i];
			digits[i] = digits[digits.length - i - 1];
			digits[digits.length - i - 1] = temp;
		}			
	}
}