package utils;

import java.util.Arrays;

import bean.SortOrder;

public class ArraysUtils {
	public ArraysUtils() {
		// TODO Auto-generated constructor stub
	}
	public static void printf(int[] digits) {
		for(int digit:digits) {
			System.out.print(digit+ " ");
		}
	}
	public static void printf(String[] sequences) {
		for(String sequence:sequences) {
			System.out.print(sequence+ " ");
		}
	}
	public static void printf(Object[] objects) {
		for (Object object : objects) {
			System.out.println(object);
		}
	}
	public static void sort(int[] digits, SortOrder order) {
		Arrays.sort(digits);
		if(order==SortOrder.DESC) {
			reverseArr(digits);
		}
	}
	public static void reverseArr(int[] arr) {
		int index = arr.length/2;
		for(int i=0;i<=index;i++) {
			int t = arr[i];
			arr[i]= arr[arr.length-i-1];
			arr[arr.length-1-i]=t;
		}
	}
}
