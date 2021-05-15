package data;

public class Ex05 {
	public static void main(String[] args) {		
		Integer a = 10;
		Integer b = 20;
		
		swap(a, b);
		
		System.out.println("a: " + System.identityHashCode(a));
		System.out.println("b: " + b);
		
	}
	
	private static void swap(Integer first, Integer second) {
		first = first + second; // 2020 2000
		second = first - second; // 2020 20
		first = first - second;
	}
}
