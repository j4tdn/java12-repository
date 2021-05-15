package data;

public class Ex04 {
	public static void main(String[] args) {
		// HEAP
		// Store at constant pool
		Integer oa = 20; 
		Integer ob = 20;
		Integer oa1 = 50;
		Integer oa2 = 20;
		Integer oa3 = 50;
		
		// 101 cells
		String s1 = "a";
		String s2 = "a";
		// ..............
		String s100 = "a";
		
		// 200 cells
		String ss1 = new String("a");
		String ss2 = new String("a");
		String ss100 = new String("a");
		
		// Store at normal heap
		// Self: new to create object
		Integer oc = new Integer(40);
		Integer od = new Integer(40);
		
		hash("oa: ", oa);
		hash("ob: ", ob);
		hash("oa1: ", oa1);
		hash("oa2: ", oa2);
		hash("oa3: ", oa3);
		hash("oc: ", oc);
		hash("od: ", od);
		
		// operator = => STACK
		oa = 50;
		hash("oa", oa);
		
	}
	
	private static void hash(String text, Integer input) {
		System.out.println(text + System.identityHashCode(input));
	}
}
