package Ex03;

public class App {
	private static int C(int k, int n) {
		if (k == 0 || k == n)

			return 1;

		if (k == 1)
			return n;

		return C(k - 1, n - 1) + C(k, n - 1);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(C(j, i) + " ");
			}
			System.out.println();
		}
	}

}
