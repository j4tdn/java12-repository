package BT2;

import java.util.Scanner;

public class BT2 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		
		do {
			System.out.print("Nhap password: ");
			try {
				String password = sc.nextLine();
				
				checkLenghtPassword(password);
				break;
			} catch (Exception e) {
			
				System.out.println("you must input enough 8 character! ");
			}
			
		} while (true);
		System.out.println("password correct !!! ");
			
	}
	
	public static boolean checkLenghtPassword(String password) throws Exception {
		if(password.length() < 8) {
			throw new Exception("Pass must contain at least 8 characters");
		}
		if(password.length() > 256) {
			throw new Exception("Pass must contain at most 256 characters");
		}
		return true;
	}
	
}

