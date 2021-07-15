package manipulation;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = { 1, 9, 5, 36, 12, 33 };
	}

	private static int[] add(int[] digits, int k, int newElement) {
		int[] result = new int[digits.length + 1];
		for (int i = 0; i < result.length; i++) {
			if (i < k) {
				result[i] = digits[i];
			} else if (i == k) {
				result[i] = newElement;
			} else {
				result[i] = digits[i - 1];
			}
		}
		return result;
	}
}
