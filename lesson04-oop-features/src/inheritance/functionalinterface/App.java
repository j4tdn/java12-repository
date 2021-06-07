package inheritance.functionalinterface;

public class App {
	public static void main(String[] args) {
		int[] digits = { 1, 4, 8, 12, 25, 60 };
		
		// lambda expression (parameters) -> {body}
		// ==> Anonymous function
		// ==> Khởi tại đối tượng cho Functional Interface
		Predicate d5Con = (int num) -> {
			return num % 5 == 0;
		};
		Predicate d5Condition = num -> num % 5 == 0;
		
		// strategy pattern
		System.out.println("count even: " + count(digits, num -> num % 2 == 0));
		System.out.println("count odd: " + count(digits, num -> num % 2 != 0));
		System.out.println("count d3: " + count(digits, num -> num % 3 == 0));
		System.out.println("count d5: " + count(digits, num -> num % 5 == 0));
	}
	
	//boolean ham(int digit)
	private static int count(int[] digits, Predicate con) {
		int count = 0;
		for (int digit: digits) {
			if (con.strategy(digit)) {
				count++;
			}
		}
		return count;
	}
}
