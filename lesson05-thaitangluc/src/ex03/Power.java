package ex03;

public class Power {
	public static void main(String[] args) {
		int a = 12;
		int b = 20735;
		System.out.println(isPowerOf(a, b));
	}
	
	public static boolean isPowerOf(int a, int b) {
		if (check(a,b) || check(b,a)) return true;
		return false;
	}
	
	public static boolean check(int a, int b) {
		int n = b;
		while(a>=b) {
				b*=n;
				if(b==a) return true;
		}
		return false;
	}
}
