package exception;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex03 {
	// nếu code xảy ra exception => jvm ném ra thông tin ngoại lệ trong console và
	// kết thúc chương trình
	// InputMismatchException
	// NumberFormatException
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// enter your year of birth => calculate your age
	
		
		
		String agetext ="";
		while (true) {
			System.out.print("Enter your year of birth: ");
			agetext = sc.nextLine();
			if(agetext.matches("\\d+")) {
				break;
			}
			System.out.println("---Invalid Age---");
		}
		int year = Integer.parseInt(agetext);
		
		int currentYear = LocalDate.now().getYear();
		System.out.println("Your age: " + (currentYear - year + 1));
		System.out.println("Thread main end!");

	}
}
