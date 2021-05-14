import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập vào số nguyên n: ");
		int n = Integer.parseInt(sc.nextLine());
		if (isSymNum(n)) {
			System.out.println(n + " là số đối xứng!");
		} else {
			System.out.println(n + " không là số đối xứng!");
		}
	}

	public static int sodoi(int n) {
		int temp = n;
		int rs = 0;
		while (temp > 0) {
			rs = rs * 10 + temp % 10;
			temp /= 10;
		}
		return rs;
	}

	public static boolean isSymNum(int input) {
		int output = sodoi(input);
		return input == output;
	}
}
