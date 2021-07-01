package immutable;

public class Ex01 {
	public static void main(String[] args) {
		// literal versus object
		// literal: heap(constant-pool)
		String l1 = "hello";
		String l2 = "welcome";
		String l3 = "hello";
		
		hash("l1", l1);
		hash("l2", l2);
		hash("l3", l3);
		
		// object: heap(normal)
		// deprecated
		String o1 = new String("hello");
		String o2 = new String("welcome");
		String o3 = new String("welcome");

		hash("o1", o1);
		hash("o2", o2);
		hash("o3", o3);
	}
	
	private static void hash(String text, String input) {
		System.out.println(text + ": " + System.identityHashCode(input));
	}
}
