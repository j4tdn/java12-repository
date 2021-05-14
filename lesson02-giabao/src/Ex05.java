import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số tự nhiên n: ");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("Dạng nhị phân của n là: " + nhiphan(n));
	}

	public static int nhiphan(int a) {
		int binary[] = new int[8];
		int index = 0, rs = 0;
		while (a > 0) {
			binary[index++] = a % 2;
			a = a / 2;
		}
		for (int i = index; i >= 0; i--) {
			rs = rs * 10 + binary[i];
		}
		return rs;
	}
}
