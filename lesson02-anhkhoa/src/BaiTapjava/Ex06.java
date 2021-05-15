package BaiTapjava;

public class Ex06 {
	public static int dem = 1;
	public static int i = 2;
	public static boolean CheckPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		while (dem <= 200) {
			if (CheckPrime(++i)) {
				System.err.println(dem + ":   " + i);
				dem++;
			}
		}
		System.out.println("Số nguyên tố thứ 200 là: " + i);
	}
}
