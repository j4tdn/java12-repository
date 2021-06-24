package bai3;

public class Main {
	public static void main(String[] args) {
		int n = 6;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(C(j, i) + "   ");
			}
			System.out.println("\n");
		}
		
	}
	
	public static int C(int k, int n) {
		if(k == 0 || k == n) {
			return 1;
		}
		return C(k - 1, n - 1) + C(k, n - 1);
	}
}
