package inheritance.functionalinterface_practice;

/**
 * Viết chương trình tính 2 số a,b
 *  + Cộng
 *  + Trừ
 *  + Nhân
 *  + Chia
 */

public class App {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		// Khởi tạo đối tượng, thể hiện interface dùng: 
		Condition condition = new Condition() {
			
			@Override
			public int result(int firstNum, int secondNum) {
				return firstNum * secondNum;
			}
		};
		
		// lamda expression (parameters)->{body}
		// => Khởi tạo đối tượng cho Functional Interface
		Condition sum = (int firstNum, int secondNum) -> {
			return firstNum + secondNum;
		};
		Condition sub = (firstNum, secondNum) -> firstNum - secondNum;
		Condition mul = (firstNum, secondNum) -> firstNum * secondNum;
		Condition div = (firstNum, secondNum) -> firstNum / secondNum;
		
		System.out.println(result(a, b, sum));
		System.out.println(result(a, b, sub));
		System.out.println(result(a, b, mul));
		System.out.println(result(a, b, div));

	}
	
	// Điều kiện : int ham(int digit1, int digit2)
	
	private static int result(int firstNum, int secondNum, Condition con) {
		return con.result(firstNum, secondNum);
	}
	
}
