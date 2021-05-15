package operator;

public class Ex01 {
	public static void main(String[] args) {
		int number = 8;
		int result = ++number + 10;
		System.out.println(number);
		System.out.println(result);

		System.out.println(!true);

		boolean isEven = isEven(10);

		if (isEven) {
			System.out.println("So chan");
		}
		if (!isEven) {
			System.out.println("So le");
		}

		int c = 2;
		int d = 2;

		if (c > 1 || d++ > 3) {
			System.out.println("Good condition!");
		}

		System.out.println("d: " + d);
	}

	private static boolean isEven(int input) {
		return input % 2 == 0;
	}
}
