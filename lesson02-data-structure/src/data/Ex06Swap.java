package data;

public class Ex06Swap {
	public static void main(String[] args) {
		
		int a = 10;
		
		// Integer i1 = 10; // CSP
		Integer i2 = new Integer(20); // HEAP
		
		Digit d1 = new Digit(10);
		Digit d2 = new Digit(10);
		
		swap(d1, d2);
		
		System.out.println("d1: " + d1);
		System.out.println("d2: " + d2);
	}
	
	private static void swap(Digit first, Digit second) {
		int tmp = first.value;
		first.value = second.value;
		second.value = tmp;
	}
}
