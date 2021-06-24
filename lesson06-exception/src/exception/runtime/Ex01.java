package exception.runtime;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex01 {
	
	private static Scanner ip = new Scanner(System.in);
	
	// Nếu code xảy ra ngoại lệ => JVM ném ra thông tin ngoại lệ trong console và kết thúc chương trình
	// InputMismatchException
	// NumberFormatException
	
	public static void main(String[] args) {
		// Enter your year of birth => Calculate your age
		
		System.out.print("Enter your year of birth: ");
		int age = Integer.parseInt(ip.nextLine());
		
		int currentYear = LocalDate.now().getYear();
		System.out.println("Your age: " + (currentYear - age + 1));
	}
}
