package exception;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex02 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//Enter your year of bitrh -> Calculate age ?
		int age = -1;
		
		//c2: use try...catch 
		while(true) {
			try {
				System.out.println("Enter your year of birth : ");
				age = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("exception :" + e);
			}
		}
		
		
		int currentYear = LocalDate.now().getYear();
		System.out.println("Your age : " + (currentYear - age + 1));
	}
	
}
