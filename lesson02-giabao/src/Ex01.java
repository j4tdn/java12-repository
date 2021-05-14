import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào số nguyên n:");
		int n = Integer.parseInt(sc.nextLine());
		if (isPowerOfTwo(n)) {
			System.out.println(n + " là luỹ thừa của 2");
		} else {
			System.out.println(n + " không phải là luỹ thừa của 2");
		}
	}

	public static boolean isPowerOfTwo(int n) {
		if (n == 0) return false;
		if (n == 1) return true;
		int x = n / 2;
		int y = n % 2;
		if (y == 1)
			return false;
		return isPowerOfTwo(x);
	}
}
