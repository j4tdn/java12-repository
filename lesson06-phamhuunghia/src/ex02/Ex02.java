package ex02;

import java.util.Scanner;

import exception.InvalidLengthException;
import exception.NumberException;
import exception.SpecialCharacterException;
import exception.UppercaseAlphaException;
import exception.lowerCaseAlphaException;

public class Ex02 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean check = false;
		while (!check) {
			
			try {
				System.out.println("Enter new password: ");
				String password = sc.nextLine();
	
				check = CheckUppercase(password);
				check = CheckLengthPW(password);
				check = CheckNumber(password);
				check = CheckLowercase(password);
				check = CheckSpeCharacter(password);
			}
			catch (lowerCaseAlphaException ex) {
				check=false;
				System.out.println(ex);
			}catch (UppercaseAlphaException ex) {
					check=false;
					System.out.println(ex);
			}catch (NumberException ex) {
				check=false;
				System.out.println(ex);
			}catch (SpecialCharacterException ex) {
				check=false;
				System.out.println(ex);
			}catch (InvalidLengthException ex) {
				check=false;
				System.out.println(ex);
			}
		}
		System.out.println(" *** Success create new password ***");
		
	}
	
	static boolean CheckLengthPW(String pw) throws InvalidLengthException {
		boolean chk=true;
		if(!(pw.length()<=256 && pw.length()>=8)) {
			throw new InvalidLengthException("Pass must contain at least 8 characters and contain at most 256 characters!!!!!");
		}
		return chk;
	}
	static boolean CheckUppercase(String pw) throws UppercaseAlphaException {
		if(pw.matches(".*[A-Z].*")) {
			return true;
		}
		throw new UppercaseAlphaException("Pass must contain at least 1 upper case alphabetic character!!!!!");
	}
	static boolean CheckLowercase(String pw) throws lowerCaseAlphaException {
		if(pw.matches(".*[a-z].*")) {
			return true;
		}
		throw new lowerCaseAlphaException("Pass must contain at least 1 lower case alphabetic character!!!!!");
	}
	static boolean CheckNumber(String pw) throws NumberException {
		if(pw.matches(".*[0-9].*")) {
			return true;
		}
		throw new NumberException("Pass must contain at least 1 number");
	}
	
	static boolean CheckSpeCharacter(String pw) throws SpecialCharacterException {
		if(pw.matches(".*[\\W].*")) {
			
			return true;
		}
		throw new SpecialCharacterException("Pass must contain at least 1 Special character!!!!!");
	}
}
