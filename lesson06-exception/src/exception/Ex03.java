package exception;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex03 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//Enter your year of bitrh -> Calculate age ?
		
		String text = "";
		while(true) {
			System.out.println("Enter your year of birth : ");
			text = sc.nextLine();
			
			if(text.matches("\\d+")) {
				break;
			}
			System.out.println("Invalid number !");
		}
		
		int age = Integer.parseInt(text);
		
		int currentYear = LocalDate.now().getYear();
		System.out.println("Your age : " + (currentYear - age + 1));
	}
	
}
