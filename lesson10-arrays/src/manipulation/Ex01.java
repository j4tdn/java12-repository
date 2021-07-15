package manipulation;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = { 1, 9, 5, 36, 12, 33 };
		int[] rs = add(digits, 2, 4);
		for (var s : rs) {
			System.out.println(s);
		}
	}

	private static int[] add(int[] digits, int k, int h) {
		int[] rs = new int[digits.length + 1];
		for (int i = 0; i < k; i++) {
			rs[i] = digits[i];
		}
		rs[k] = h;
		for (int i = k + 1; i < rs.length; i++) {
			rs[i] = digits[i - 1];
		}
		return rs;
	}
}
