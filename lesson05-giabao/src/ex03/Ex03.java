package ex03;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("(8,2) " + isPowerOf(8, 2));
		System.out.println("(6,2) " + isPowerOf(6, 2));
		System.out.println("(20,4) " + isPowerOf(20, 4));
		System.out.println("(64,4) " + isPowerOf(64, 4));
		System.out.println("(56,2) " + isPowerOf(1, 2));
	}

	private static boolean isPowerOf(int a, int b) {
		if (a == 1 || a == 0)
			return true;
		int x = a / b;
		int y = a % b;
		if (y > 0 && y < b)
			return false;
		return isPowerOf(x, b);
	}
}
