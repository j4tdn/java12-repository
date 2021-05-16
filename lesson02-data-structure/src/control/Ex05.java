package control;

public class Ex05 {
	public static void main(String[] args) {
		//Print numbers < n (n = 7)
		int n = 7;
		printWithFor(n);
		printWithWhile(n);
		printWithDoWhile(n);
		demoBreakContinue(n);
	}
	
	private static void printWithFor(int n) {
		System.out.println("=== For ===");
		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}
	}
	
	private static void printWithWhile(int n) {
		System.out.println("\n=== While ===");
		int i = 0;
		while (i < n) {
			System.out.println(i + " ");
			i++;
		}
	}
	
	private static void printWithDoWhile(int n) {
		System.out.println("\n=== Do While ===");
		int i = 0;
		do {
			System.out.println(i + " ");
			i++;
		} while (i < n);
	}
	
	private static void demoBreakContinue(int n) {
		System.out.println("\n=== DemoBreak ===");
		for (int i = 0; i < n; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i + " "); // 0 1 2
		}
		
		System.out.println("\n=== DemoContinue ===");
		for (int i = 0; i < n; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i + " "); // 0 1 2 4 5 6
		}
	}
}
