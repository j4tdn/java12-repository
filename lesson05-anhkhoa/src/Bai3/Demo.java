package Bai3;

public class Demo {
	public static void main(String[] args) {
		System.out.println(Check(64, 4));
	}

	private static boolean Check(int a, int b) {
		while (a >= b) {
			if (a % b != 0)
				return false;
			a = a / b;

		}
		return true;
	}

}
