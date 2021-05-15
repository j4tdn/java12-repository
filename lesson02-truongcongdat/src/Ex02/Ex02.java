package Ex02;

public class Ex02 {
	public static void main(String[] args) {
		// Viết chương trình tính tổng S = 4! +7! + 12! + 18!
		long s = factorial(4) + factorial(7) + factorial(12) + factorial(18);

		System.out.println("s = " + s);
	}

	// Tinh giai thua
	private static long factorial(int number) {
		if (number == 0 || number == 1) {
			return 1;
		}
		return number * factorial(number - 1);
	}
}
