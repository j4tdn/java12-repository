package exception.compile;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex03 {
	
	private static Scanner ip = new Scanner(System.in);
	
	// InputMismatchException
	// NumberFormatException
	// Handle Exception
	
	public static void main(String[] args) {
		// Enter your year of birth => Calculate your age
		
		String ageText = "";
		while(true) {
			System.out.println("Enter your year of birth: ");
			ageText = ip.nextLine();
			// regular expression = REGEX
			if (ageText.matches("\\d+")) {
				break;
			}
			System.out.println("--- Invalid Age ---");
		}
		
		// Could cause potential Exception
		int age = Integer.parseInt(ageText);
		
		int currentYear = LocalDate.now().getYear();		
		System.out.println("Your age: " + (currentYear - age + 1));
		System.out.println("Thread main end!");
	}
}
