package exception;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex01 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//Enter your year of bitrh -> Calculate age ?
		System.out.println("Enter your year of birth : ");
		int age = sc.nextInt();
		
		int currentYear = LocalDate.now().getYear();
		System.out.println("Your age : " + (currentYear - age + 1));
	}
	
}
