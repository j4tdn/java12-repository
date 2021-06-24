package exception.runtime;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex02 {
	
	private static Scanner ip = new Scanner(System.in);
	
	// Nếu code xảy ra ngoại lệ => JVM ném ra thông tin ngoại lệ trong console và kết thúc chương trình
	// InputMismatchException
	// NumberFormatException
	// Handle Exception
	
	public static void main(String[] args) {
		// Enter your year of birth => Calculate your age
		int age = -1;
		
		while(true) {
			try {
				System.out.print("Enter your year of birth: ");
				age = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("--- Invaliad Age ---");
			}
		}
		
		int currentYear = LocalDate.now().getYear();
		System.out.println("Your age: " + (currentYear - age + 1));
		System.out.println("Thread main end !");
	}
}
