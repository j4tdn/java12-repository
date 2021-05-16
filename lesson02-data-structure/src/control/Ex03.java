package control;

public class Ex03 {
	public static void main(String[] args) {
		
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
			break;
		}
	}
}
