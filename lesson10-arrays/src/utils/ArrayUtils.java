package utils;

public class ArrayUtils {
	public static void printf(int[] digits) {
		for(int digit: digits) {
			System.out.print(digit+ " ");
		}
		System.out.println();
	}
	
	public static void printf(Integer[] digits) {
		for(Integer digit: digits) {
			System.out.print(digit+ " ");
		}
		System.out.println();
	}
	
	public static void printf(String[] elements) {
		for(String element: elements) {
			System.out.print(element+ " ");
		}
		System.out.println();
	}
	public static void printf(Object[] objects) {
		for(Object object: objects) {
			System.out.println(object);
		}
	}

}

