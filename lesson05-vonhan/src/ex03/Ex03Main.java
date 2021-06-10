package ex03;

public class Ex03Main {
	public static void main(String[] args) {
		System.out.println(isPowerOf(8, 2)); //T
		System.out.println(isPowerOf(6, 2)); //F
		System.out.println(isPowerOf(20, 4)); //F
		System.out.println(isPowerOf(64, 4)); //T
	}
	
	private static boolean isPowerOf(int a, int b) {
		int small = (a < b) ? a : b;
		int big = (small == b) ? a : b;
		int i = 0;
		while (true) {
			if (big == Math.pow(small, i)) {
				return true;
			}
			if (Math.pow(small, i) > big) {
				return false;
			}
			i++;
		}
	}
}
