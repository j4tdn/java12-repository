package control;

public class Ex03 {
	public static void main(String[] args) {
		// Enter 1 number (1,2,3) => Print English text according to number
		//                        => Out of 1,2,3 => Invalid number
		
		// Non-break: Ignore validate of case condition below correct case 
		int number = 2;
		
		switch (number) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		default:
			System.out.println("Invalid number");
		}
		System.out.println("==MAIN==");
		System.out.println("=====================");
		
		if (number == 1) {
			System.out.println("ONE");
		} else if (number == 2) {
			System.out.println("TWO");
		} else if (number == 3) {
			System.out.println("THREE");
		} else {
			System.out.println("Invalid number");
		}
	}
}