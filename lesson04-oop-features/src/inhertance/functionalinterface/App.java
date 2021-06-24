package inhertance.functionalinterface;

import java.util.Arrays;
import java.util.List;

/**
  . Viết chương trình đếm số lượng các phần tử là
	+ Số chẵn
    + Số lẻ
    + Số chia hết cho 3
    + Số chia hết cho 5

 */
public class App {
	public static void main(String[] args) {
		int[] digits = { 1, 4, 8, 12, 25, 60 };
//		System.out.println("evens: " + countNoEvenNbrs(digits));
//		System.out.println("odds: " + countNoOddNbrs(digits));
//		System.out.println("d3: " + countNoDivisionOf3(digits));
		
		
		// Khởi tạo đối tượng, thể hiện cho interface dùng:
		// implementation class
		Predicate evenCon = new EvenCondition();
		Predicate oddCond = new OddCondition();
		
		// anonymous class
		Predicate d3Con = new Predicate() {
			
			@Override
			public boolean test(int xyz) {
				return xyz % 3 == 0;
			}
		};
		
		// lambda expression (parameters) -> {body}
		// =>> anonymous function
		// ==> Khởi tạo đối tượng cho Functional Interface
		Predicate d5Con = (int num) -> {
			return num % 5 == 0;
		};
		
		Predicate d5Condition = num -> num % 5 == 0;
		
		// strategy pattern
		System.out.println("count even: " + count(digits, t -> t % 2 == 0));
		System.out.println("count odd: "  + count(digits, num -> num % 2 != 0));
		System.out.println("count d3: "   + count(digits, num -> num % 3 == 0));
		System.out.println("count d5: "   + count(digits, num -> num % 5 == 0));
	}
	
	// Điều kiện: boolean ham(int a)
	private static int count(int[] digits, Predicate con) {
		int count = 0;
		for (int digit: digits) {
			if (con.test(digit)) {
				count++;
			}
		}
		return count;
	}
	
	/*
	private static int countNoEvenNbrs(int[] digits) {
		int count = 0;
		for (int digit: digits) {
			if (digit % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	
	private static int countNoOddNbrs(int[] digits) {
		int count = 0;
		for (int digit: digits) {
			if (digit % 2 != 0) {
				count++;
			}
		}
		return count;
	}
	
	private static int countNoDivisionOf3(int[] digits) {
		int count = 0;
		for (int digit: digits) {
			if (digit % 3 == 0) {
				count++;
			}
		}
		return count;
	}
	*/
}
