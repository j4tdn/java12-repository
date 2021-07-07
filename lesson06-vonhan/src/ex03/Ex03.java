package ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email = "";
		
		while(true) {
			System.out.print("Enter email:    ");
			email = sc.nextLine();
			try {
				System.out.println(EmailValidator.validateWithString(email));
				System.out.println(EmailValidator.validateWithRegex(email));
				break;
			} catch (EmailException e) {
				System.out.println(e.toString());;
				System.out.println("Input again :");
			}
		}
		sc.close();
	}
	
	
}