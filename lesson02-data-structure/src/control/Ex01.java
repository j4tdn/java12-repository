package control;

public class Ex01 {
	public static void main(String[] args) {
		// tìm max 2 số, 3 số
		int a = 8;
		int b = 6;
		int c = 10;

		System.out.println("Max 1; " + max(a, b));
		System.out.println("Max 2: " + max(a, b, c));
	}

	private static int max(int a, int b) {
		if (a > b) {
			return a;
		}
		return b;
	}

	private static int max(int a, int b, int c) {
		int max = a > b ? a : b;
		if (c > max) {
			max = c;
		}
		return max;
	}

}
