package ex03;

public class Ex03 {
	public static boolean isPowerOf(int a, int b) {
		do {
			if (a % b != 0)
				return false;
			a /= b;
		} while (a != 1);
		return true;
	}

	public static void main(String[] args) {
		int a = 64, b = 4;
		System.out.println(isPowerOf(a, b));
	}
}
