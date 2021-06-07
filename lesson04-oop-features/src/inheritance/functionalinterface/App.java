package inheritance.functionalinterface;

public class App implements Condition{
	public static void main(String[] args) {
		int[] digits = {1,4,8,12,25,60};
		
		// anonymous class
		
		// Khởi tạo đối tượng, thể hiện cho interface dùng:
		// implementation class
		Condition evenCondition = new EvenCondition();
		
		// lambda expression (parameter) -> {body}
		// ==> anonymous function
		// ==> Khởi tạo đối tượng cho Functional Interface
		Condition d5Con = (int number) -> {
			return number % 5 == 0;
		};
		
		Condition d5Condition = number -> number % 5 == 0;
		
		// strategy pattern
		System.out.println("count even: " + count(digits, number -> number % 2 == 0));
		System.out.println("count d5: " + count(digits, number -> number % 5 == 0));
		System.out.println("count d5: " + count(digits, number -> number % 5 == 0));
	}
	
	// Condition: boolean nameFunction(int digit)
	
	private static int count(int[] digits, Condition con) {
		int count = 0;
		for(int digit:digits) {
			if(con.stategy(digit)) {
				count++;
			}
		}
		return count;
	}

	@Override
	public boolean stategy(int num) {
		return false;
	}
}
