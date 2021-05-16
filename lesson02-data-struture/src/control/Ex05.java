package control;

public class Ex05 {
	public static void main(String[] args) {
		int n=7;
		prinWithFor(n);
		prinWithWhile(n);
		prinWithDoWhile(n);
		
	}
	private static void prinWithFor(int n) {
		System.out.println("\n");
		for (int i=0;i<7;i++) {
			System.out.print(i);
		}
	}
	private static void prinWithWhile(int n) {
		System.out.println("\n");
		int i=0;
		while(i<n) {
			System.out.print(i+" ");
			i++;
		}
	}
	private static void prinWithDoWhile(int n) {
		System.out.println("\n");
		int i=0;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<n);
	}
	private static void demoBreakContinue(int n) {
	
	}
}