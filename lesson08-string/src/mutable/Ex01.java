package mutable;

public class Ex01 {
	public static void main(String[] args) {
		// Immutable
		String s = "Box";
		System.out.println(System.identityHashCode(s));
		
		s = reverse(s.concat("Layout"));
		System.out.println(System.identityHashCode(s));
		
		System.out.println("s: " + s);
		
		System.out.println("===============");
		
		// Mutable: StringBuilder, StringBuffer
		StringBuilder b = new StringBuilder("Grid");
		System.out.println(System.identityHashCode(b));
		b.append("Layout")
		 .append("-Manager");
		System.out.println(System.identityHashCode(b));
		
		System.out.println("b: " + b);
	}
	
	private static String reverse(String input) {
		char[] reverse = new char[input.length()];
		for (int i = 0; i < reverse.length; i++) {
			reverse[i] = input.charAt(input.length() - i - 1);
		}
		return String.valueOf(reverse);
	}
	
	private static String reverse02(String input) {
		char[] sequences = input.toCharArray();
		for (int i = 0; i < sequences.length/2; i++) {
			char tmp = sequences[i];
			sequences[i] = sequences[sequences.length - i - 1];
			sequences[sequences.length - i  - 1] = tmp;
		}
		return String.valueOf(sequences);
	}
}
