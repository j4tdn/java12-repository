package data;

public class Ex08PriVsOb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char, Character
		char a='x';
		char b='1';
		
		System.out.println(isDigit(a));
		System.out.println(isDigit(b));
	}
	
	private static boolean isDigit(char temp) {
		return(temp>='0' && temp<='9');
	}
	
}
