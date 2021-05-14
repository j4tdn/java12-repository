
public class Ex06 {
	public static void main(String[] args) {
		int count = 1, i = 2;

		while (count != 200) {
			if (isPrime(++i))
				count++;
		}
		
		System.out.println("Số nguyên tố thứ 200 là: " + i);
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
