package control;

public class Ex05 {
	public static void main(String[] args) {
		// Print numbers < n (n=7) with 3 ways: Loop 0-6
		int n = 7;
		printWithFor(n);
		printWithWhile(n);
		printWithDoWhile(n);
		demoBreakContinue(n);
	}

	private static void printWithFor(int n) {
		System.out.println("===== For =====");
		// BT1; BT2; BT3
		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}
	}

	private static void printWithWhile(int n) {
		System.out.println("\n===== While =====");
		// expression = BT2
		int i = 0;
//		while (i < n) {
//			System.out.print(i + " ");
//			i++;
//		}

		while (true) {
			if (i == n) {
				break;
			}
			System.out.print(i + " ");
			i++;
		}

	}

	private static void printWithDoWhile(int n) {
		System.out.println("\n===== DoWhile =====");
		int i = 0;
		do {
			System.out.print(i + " ");
			i++;
		} while (i < n);
		// condition = BT2
	}

	private static void demoBreakContinue(int n) {
		System.out.println("\n===== DemoBreak =====");
		for (int i = 0; i < n; i++) {
			// System.out.print(i + "  "); // 0 1 2 3
			if (i == 3) {
				break;
			}
			// System.out.print(i + "  "); // 0 1 2
		}
		System.out.println("\n===== DemoContinue =====");
		for (int i = 0; i < n; i++) {
			System.out.print(i + "  "); // 0 1 2 3 4 5 6
			if (i == 3) {
				continue;
			}
			// System.out.print(i+ " "); // 0 1 2 4 5 6
		}
	}
}
