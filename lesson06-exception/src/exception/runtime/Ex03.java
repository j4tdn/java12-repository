package exception.runtime;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex03 {
	
	private static Scanner ip = new Scanner(System.in);
	
	// Nếu code xảy ra ngoại lệ => JVM ném ra thông tin ngoại lệ trong console và kết thúc chương trình
	// InputMismatchException
	// NumberFormatException
	
	public static void main(String[] args) {
		// Enter your year of birth => Calculate your age
		
		System.out.println("\\\\");
		
		String ageText = "";
		while(true) {
			System.out.print("Enter your year of birth: ");
			ageText = ip.nextLine();
			// REGular EXpression = REGEX
			// \d: digit = [0-9]
			// + : amount: 1, n numbers
			if (ageText.matches("\\d+")) {
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
