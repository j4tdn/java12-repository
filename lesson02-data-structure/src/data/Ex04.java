package data;

public class Ex04 {
	public static void main(String[] args) {
		Integer oa = 20;
		Integer ob = 20;
		Integer oa1 = 50;
		Integer oa2 = 20;
		Integer oa3 = 50;
		int b = 20;
		int c = 50;
		
		hash("oa: ", oa);
		hash("ob: ", ob);
		hash("oa1: ", oa1);
		hash("oa2: ", oa2);
		hash("oa3: ", oa3);
		hash("b: ", b);
		hash("c: ", c);
		
	}
	
	public static void hash(String text, Integer num) {
		System.out.println(text + System.identityHashCode(num));
	}
}
