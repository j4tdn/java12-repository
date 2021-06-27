package ex03;

import java.util.Scanner;

import exception.ValidEmailException;

public class Ex03 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean check=false;
		while(!check) {
			try {
				System.out.println("Nhập địa chỉ email: ");
				String email=sc.nextLine();
				check=checkValidEmail(email);
			} catch (ValidEmailException e) {
				System.out.println(e);
			}
		}
		System.out.println("Hop le");
	}
	private static boolean  checkValidEmail(String email) throws ValidEmailException {
		if(email.matches("^[a-zA-Z]+[a-zA-z0-9]*@{1}gmail.com$")) {
			
			return true;
		}
		throw new ValidEmailException("Email ko hợp lệ");
	}
	
}
