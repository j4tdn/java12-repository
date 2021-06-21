package exception.compile;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex03 {
	
	private static Scanner ip = new Scanner(System.in);
	
	// Neu code xay ra ngoai le => JVM nem ra ngoai le trong console va end program
	// InputMismatchException
	// NumberformatException
	
	public static void main(String[] args) {
		// Enter your year of birth -> Calculate your age
		
		String ageText = "";
		while(true) {
			System.out.print("Enter your year of birth: ");
			ageText = ip.nextLine();
			
			// regular expression  = regex
			// \d: digit = [0-9]
			// + : amount: 1, n numbers
			if(ageText.matches("\\d+")) {
				break;
			}
			System.out.println("--- Invalid Age ---");
		}
		
		// Could cause an Exception
		int age = Integer.parseInt(ageText);
		
		int currentYear = LocalDate.now().getYear();
		System.out.println("Your age: " + (currentYear - age + 1));
	}
}
