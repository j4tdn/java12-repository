package data;

public class Ex05 {
	public static void main(String[] args) {
		
		Integer a = 10;
		Integer b = 20;
		
		swap(a, b);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		// Student: id, name, age
		// Integer: value
		
		// int x = 10;
		
	}
	
	// Integer first = a;
	// Integer second = b;
	private static void swap(Integer first, Integer second) {
		Integer tmp = first; 
		first = second;
		second = tmp;
	}
}
