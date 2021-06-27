package ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		do{
			try {
				System.out.println("Nhap email: ");
				String email = ip.next();
				emailException(email);
				break;
			} catch (EmailException e) {
			}
		}
		while(true);
	}
	

	public static void emailException(String email) throws EmailException {
		if(!email.matches("^[a-zA-Z]+[a-zA-Z0-9]*@{1}[a-zA-Z]+.com(.[a-zA-Z]{0,1})*")) throw new EmailException("Sai email");
	}
}
