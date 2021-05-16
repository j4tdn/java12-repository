package control;

public class Ex03 {

	public static void main(String[] args) {
		// Enter 1 number => Print text according to number
		//                   Out of 1,2,3 => Invalid number
		// Non-break: ignore validate of case condition below correct case
		
		int number = 8;
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
	}

}
