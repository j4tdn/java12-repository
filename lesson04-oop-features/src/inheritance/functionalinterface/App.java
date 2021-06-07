package inheritance.functionalinterface;

public class App {
	public static void main(String[] args) {
		int[] digits = { 1, 4, 8, 12, 25, 60 };
		/**
		 * đếm số lượng các số. 
		 * số chẵn 
		 * số lẻ 
		 * chia hết cho 5 
		 * chia hết cho 3
		 */

		// Khởi tạo đối tượng cho interface dùng
		Condition EvenCon = new OddCondition();

		// anonymous class
		Condition OddCon = new Condition() {
			@Override
			public boolean strategy(int number) {
				return number % 2 != 0;
			}
		};

		// lamda expression (parameters)-> {body}
		// => anonymous function
		// => Khởi tạo đối tượng cho functional interface
		Condition d5Con = (int num) -> {
			return num % 5 == 0;
		};
		Condition d5Condition = num -> num % 2 == 0;

		// Strategy pattern
		System.out.println(count(digits, num -> num % 2 == 0));
		System.out.println(count(digits, num -> num % 2 != 0));
		System.out.println(count(digits, num -> num % 3 == 0));
		System.out.println(count(digits, num -> num % 5 == 0));
	}

	private static int count(int[] input, Condition con) {
		int count = 0;
		for (int i : input) {
			if (con.strategy(i)) {
				count++;
			}
		}
		return count;
	}
}
