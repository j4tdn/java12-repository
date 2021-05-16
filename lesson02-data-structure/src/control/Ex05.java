package control;

public class Ex05 {
	public static void main(String[] args) {
		//Print numbers < n with 3 ways
		int n = 7;
		printWithFor(n);
		printWithWhile(n);
		printWithDoWhile(n);
		demoBreakContinue(n);
	}
	
	private static void printWithFor(int n) {
		System.out.println("======= For ======");
		for(int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}
	}
	
	private static void printWithWhile(int n) {
		System.out.println("\n====== While =====");
		int i = 0;
		while(i < n) {
			System.out.print(i + " ");
			i++;
		}
	}
	
	private static void printWithDoWhile(int n) {
		System.out.println("\n====== Do While =====");
		int i = 0;
		do {
			System.out.print(i + " ");
			i++;
		}while(i < n);
	}
	private static void demoBreakContinue(int n) {
		System.out.println("\n====== Demo Break Continue =====");
		for (int i = 0 ; i < n; i++) {
			if (i == 3) {
				break;
			}
			System.out.print(i + " ");
		}
	}

}
