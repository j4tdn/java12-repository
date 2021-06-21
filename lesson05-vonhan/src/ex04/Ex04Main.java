package ex04;

import java.util.Arrays;

public class Ex04Main {
	public static void main(String[] args) {
		int[] arrA = new int[] { 21, 42, 63 };
		int[] arrB = new int[] { 7, 14, 21, 28, 35, 42, 56, 63 };
		int[] arrC = new int[] { 6, 12, 18, 24, 30, 36, 42, 48, 54, 60 };
		System.out.println(getLeastCommonMultiple(arrA)); // 126
		System.out.println(getLeastCommonMultiple(arrB)); 
		System.out.println(getLeastCommonMultiple(arrC)); 
	}
	
	private static int getLeastCommonMultiple(int[] array) {
		Arrays.sort(array);
		int result = array[0];
		for (var i : array) {
			result = getLeastCommonMultiple(result, i);
		}
		return result;
	}

	private static int getLeastCommonMultiple(int a, int b) {
		for (int i = a > b ? a : b; i < a * b; i++) {
			if (i % a == 0 && i % b == 0) {
				return i;
			}
		}
		return a * b;
	}
}
