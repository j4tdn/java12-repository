package inheritance.functionalinterface;

public class App {
	public static void main(String[] args) {
		int[] digits = { 1, 4, 8, 12, 25, 60 };
		// Implement class
		Condition oddCond = new OddCondition();
		// anonymous class
		Condition condition = new Condition() {

			@Override
			public boolean strategy(int num) {

				return num % 2 == 0;
			}
		};
		// lambda expression
		// anonymous funtional
		//==>Khoi tao doi tuong cho Functional Interface
		Condition dSCon = (int num) -> {
			return num % 5 == 0;
		};

		Condition dSCondition = num -> num % 5 == 0;

		// strategy pattren
		
     	System.out.println("count even: " + count(digits, num -> num % 2 == 0));
		System.out.println("count odd: "  + count(digits, num -> num % 2 != 0));
		System.out.println("count d3: "   + count(digits, num -> num % 3 == 0));
		System.out.println("count d5: "   + count(digits, num -> num % 5 == 0));
	}

//Điều kiện: boolean hanm(int a)
	private static int count(int[] digits, Condition con) {
		int count = 0;
		for (int digit : digits) {
			if (con.strategy(digit)) {
				count++;
			}
		}
		return count;
	}

}
