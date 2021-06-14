package inheritance.functionalinterface;

public class App {
	public static void main(String[] args) {
		int[] digits = { 1, 4, 8, 12, 25, 60 };
		
		
		//How passes strategy into function
		//c1: create anonymous class
		Predicate even = new Predicate() {
			
			@Override
			public boolean strategy(int num) {
				return num % 2 != 0;
			}
		};
		
		Predicate d5 = new Predicate() {
			
			@Override
			public boolean strategy(int num) {
				return num % 5 == 0;
			}
		};
		
		//c2 : create class implement functional interface
		OddPredicate oddClass = new OddPredicate();
		
		//c3 : lambda expression
		//create object of functional interface
		//anonymous function
		Predicate d3Lambda = num -> num % 3 == 0;
		
		System.out.println(count(digits, oddClass));
		System.out.println(count(digits, even));
		System.out.println(count(digits, d3Lambda));
		System.out.println(count(digits, d5));
	}
	
	public static int count(int[] digits, Predicate p) {
		int count = 0;
		for(int digit : digits) {
			if(p.strategy(digit)) {
				count++;
			}
		}
		return count;
	}
	
	//những hàm giống nhau nhưng khác 1 biểu thức điều kiện -> ý tưởng là truyền biểu thức đó như tham số vào hàm
	//Java ko cho truyền hàm vào hàm -> Strategy pattern
//	public static int countNoOddNbr(int[] digits) {
//		int count = 0;
//		for(int digit : digits) {
//			if(digit % 2 ==0) {
//				count++;
//			}
//		}
//		return count;
//	}
//	
//	public static int countNoD3Nbr(int[] digits) {
//		int count = 0;
//		for(int digit : digits) {
//			if(digit % 2 ==0) {
//				count++;
//			}
//		}
//		return count;
//	}
//	
//	public static int countNoD5Nbr(int[] digits) {
//		int count = 0;
//		for(int digit : digits) {
//			if(digit % 2 ==0) {
//				count++;
//			}
//		}
//		return count;
//	}
}
