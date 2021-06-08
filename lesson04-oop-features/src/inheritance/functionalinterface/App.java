package inheritance.functionalinterface;

public class App {
	public static void main(String[] args) {
		int[] digits = { 1, 4, 8, 12, 25, 60 };
		// strategy pattern
				System.out.println("count even: " + count(digits, num -> num % 2 == 0));
				System.out.println("count odd: "  + count(digits, num -> num % 2 != 0));
				System.out.println("count d3: "   + count(digits, num -> num % 3 == 0));//Chia het cho 3
				System.out.println("count d5: "   + count(digits, num -> num % 5 == 0));//Chia het cho 5
	}
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
	static int countNoEventsNbrs(int[] digits) {
		int dem = 0;
		for (int i : digits) {
			if (i % 2 == 0) {
				dem++;
			}
		}
		return dem;
	}

	static int countNoOdNbrs(int[] digits) {
		int dem = 0;
		for (int i : digits) {
			if (i % 2 != 0) {
				dem++;
			}
		}
		return dem;
	}

	static int countNoDivisionOf3(int[] digits) {
		int dem = 0;
		for (int i : digits) {
			if (i % 3 == 0) {
				dem++;
			}
		}
		return dem;
	}

	static int soChiaHetCho5(int[] digits) {
		int dem = 0;
		for (int i : digits) {
			if (i % 5 == 0) {
				dem++;
			}
		}
		return dem;
	}*/
}
