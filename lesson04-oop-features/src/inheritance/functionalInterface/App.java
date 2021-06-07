package inheritance.functionalInterface;

public class App {

	public static void main(String[] args) {
		int[] digits = {1,4,8,12,25,60};
//		System.out.println("Odd" + FindOdd(digits));
//		System.out.println("Even" + FindEven(digits));
		
		
		//implementation class
		Predicate odd = new OddCondition();
		Predicate even = new Predicate() {
			
			@Override
			public boolean strategy(int num) {
				return num % 2 == 0;
			}
			
		};
		//annymous class
		Predicate d3 = new Predicate() {
			
			@Override
			public boolean strategy(int num) {
				return num % 3 == 0;
			}
			
		};
		
		//lamda expression (parameter) -> {body}
		//---> khoi tao doi tuong cho Functional Interface
		Predicate d5Con = num -> num % 5 == 0;

		System.out.println("count event " + count(digits,num -> num % 2 == 0));
		System.out.println("count Odd " + count(digits,num -> num % 2 != 0));
		System.out.println("count d3 " + count(digits,num -> num % 3 == 0));
		System.out.println("count d5 " + count(digits,num -> num % 5 == 0));

	}
	//ĐK: boolean ham(int digit)
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
