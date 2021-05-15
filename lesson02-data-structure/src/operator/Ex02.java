package operator;

public class Ex02 {
	public static void main(String[] args) {
		// Toán tử điều kiện: ?:
		// expression ? A : B;
		// if (expression) {
			// A
		// } else {
			// B
		// }
		
		// parameter = expression ? A : B;
		
		int number = 10;
		boolean isEven = number % 2 == 0;
		System.out.println(isEven);
		
		// max 2 số
		int first = 90;
		int second = 120;
		int third = 22;
		
		System.out.println("max: " + max(second, third));
		System.out.println("max: " + max(first, second, third));
	}
	
	private static int max(int first, int second) {
		return first > second ? first : second;
	}
	
	private static int max(int first, int second, int third) {
		int max = first > second ? first : second;
		return max > third ? max : third;
		
//		return  (first > second ? first : second) > third 
//				? (first > second ? first : second) 
//				: third;
	}
}
