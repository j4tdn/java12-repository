package exception;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex01 {
	
	private static Scanner ip = new Scanner(System.in);
	
	// InputMismatchException
	// NumberFormatException
	// Handle Exception
	
	public static void main(String[] args) {
		// Enter your year of birth => Calculate your age
		int age = -1;
		
		while (true) {
			try {
				System.out.println("Enter your year of birth: ");
				age = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("--- Invalid Age ---");
			}			
		}
		
		int currentYear = LocalDate.now().getYear();		
		System.out.println("Your age: " + (currentYear - age + 1));
		System.out.println("Thread main end!");
	}
}
