  
package mutable;

public class Ex01 {
	public static void main(String[] args) {
		//Immutable
		String s="Box";
		System.out.println(System.identityHashCode(s));
		
		//2 o nho khac nhau
		s+= "Layout";
		System.out.println(System.identityHashCode(s));
		
		System.out.println(reverse(s));
		
		System.out.println("===============");
		
		//Mutable: String Builder,StringBuffer
		StringBuilder b = new StringBuilder("Grid");
		System.out.println(System.identityHashCode(b));
		b.append("Layout")
			.append(".Manager");
			//.reverse(); đảo chuỗi
		System.out.println(System.identityHashCode(b));
		
		System.out.println("b: " + b);
	}
	private static String reverse(String input) {
		char[] sequences = input.toCharArray();
		for(int i=0;i<sequences.length/2;i++) {
			char tmp=sequences[i];
			sequences[i] = sequences[sequences.length-i-1];
			sequences[sequences.length-i-1] = tmp;
		}
		return String.copyValueOf(sequences);
	}
}