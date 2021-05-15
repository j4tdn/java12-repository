package Ex06;

public class Ex06 {
	// Viết chương trình tìm số nguyên tố thứ 200 trong hệ thống số tự nhiên.
	public static void main(String[] args) {
		int order = 200;
		System.out.printf("Số nguyên tố thứ %d là: %d", order, prime(order));
	}

	private static int prime(int order) {
		// 2 3 5 7
		int dem = 0;
		for (int i = 2; i <= Integer.MAX_VALUE; i++) {
			if (isPrime(i)) {
				dem++;
				if (dem == order) {
					return i;
				}
			}
		}
		return dem;
	}

	private static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
