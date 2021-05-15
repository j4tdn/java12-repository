package data;

public class Ex08PriVsOb {
	public static void main(String[] args) {
		// ctrl shift o => remove redundant import
		// char, Character
		char a = 'x';
		char b = '5';
		
		System.out.println("a: " + isDigit(a));
		System.out.println("b: " + isDigit(b));
			
		System.out.println("a: " + Character.isDigit(a));
	}
	
	// string: abc, 123, a1b
	private static boolean isDigit(char tmp) {
		return tmp >= '0' && tmp <= '9';
	}
}
