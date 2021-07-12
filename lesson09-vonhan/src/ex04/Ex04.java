package ex04;

public class Ex04 {
	private static StringBuilder reverseString = new StringBuilder();
	
	public static void main(String[] args) {
		String s = "Welcome to Java12 class";
		
		System.out.println(revert(s));
	}
	
	private static String revert(String s) {
		String[] a = s.split("[\\s]+");
		for (int i = 0; i < a.length; i++) {
			a[i] = new StringBuilder().append(a[i]).reverse().toString();
		}
		String result = "";
		for(String i : a) {
			result = result.concat(i).concat(" ");
		}
		return result.trim();
	}
}
