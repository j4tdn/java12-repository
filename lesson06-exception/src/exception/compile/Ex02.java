package exception.compile;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
	
	private static Scanner ip = new Scanner(System.in);
	
	// Neu code xay ra ngoai le => JVM nem ra ngoai le trong console va end program
	// InputMismatchException
	// NumberformatException
	// Handle Exception
	
	public static void main(String[] args) {
		// Enter your year of birth -> Calculate your age
		
	
				System.out.print("Enter your year of birth: ");
				int age = Integer.parseInt( ip.nextLine());
				
		int currentYear = LocalDate.now().getYear();
		System.out.println("Your age: " + (currentYear - age + 1));
		
		System.out.println("Thread main end !");
	}
}
