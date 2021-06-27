package ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		do{
			try {
				System.out.println("Nhap mat khau: ");
				String pass = ip.next();
				numberOfCharacters(pass);
				break;
			} catch (PasswordRequirements e) {
			}
		}
		while(true);
	}
	
	public static void numberOfCharacters(String pass) throws PasswordRequirements {
		if(!pass.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,256}$")) 
			throw new PasswordRequirements("Password must contain: \nAt least 8 characters \nAt most 256 characters "
					+ "\nAt least 1 lowercase alphabetic \nAt least 1 uppercase alphabetic \nAt least 1 number \nAt least 1 special character");
	}
	
	
}
	


