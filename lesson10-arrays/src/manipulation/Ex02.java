package manipulation;

import utils.ArrayUtils;

public class Ex02 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 1, 2, 3, 4, 5, 6 };

		reverse(a);
		reverse(b);

		ArrayUtils.printf(a);
		ArrayUtils.printf(b);
	}

	private static void reverse(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int tmp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = tmp;
		}
	}
}
