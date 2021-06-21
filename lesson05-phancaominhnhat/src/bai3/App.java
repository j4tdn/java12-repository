package bai3;

public class App {
	public static void main(String[] args) {
		int a = 2;
		int b = 8;
		System.out.println("(" + a + "," + b + ")(" + isPowerOf(a, b) + ")");
	}
	
	private static boolean isPowerOf(int a, int b) {
		int check = a;
		if(a < b) {
			check = b;
			b = a;
		}
		while(check % b == 0 && check / b > 0) {
			 check = check / b;
			 if(check == 1) {
				 return true;
			 }
		}
		return false;
	}
}
