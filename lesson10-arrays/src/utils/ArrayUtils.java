package utils;

public class ArrayUtils {
	public ArrayUtils() {
	}
	
	public static void printf(int[] digits) {
		for (int digit : digits) {
			System.out.print(digit + " ");
		}
		System.out.println();
	}
	
	public static void printf(String[] elements) {
		for (String element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	public static void printf(Object[] obj) {
		for (Object object : obj) {
			System.out.println(object + " ");
		}
		System.out.println();
	}
}
