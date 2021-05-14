
import java.util.Scanner;

public class Ex08 {
	public static boolean SoNguyenTo(int a) {
		if (a < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0)
				return false;
		}
		return true;
	}

	public static boolean SoHanhPhuc(int a) {
		for (int i = 1; i < a; i++) {
			for (int j = i; j < a; j++) {
				if (a == (i * i + j * j))
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int a, b;
		int count = 0;
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();

		for (int i = a; i <= b; i++) {
			if (SoNguyenTo(i) && SoHanhPhuc(i)) {
				++count;
			}
		}
		System.out.println(count);
	}

}
