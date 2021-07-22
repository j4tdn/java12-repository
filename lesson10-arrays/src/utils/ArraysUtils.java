package utils;

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
}
