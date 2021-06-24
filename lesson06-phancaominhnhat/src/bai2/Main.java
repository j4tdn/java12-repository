package bai2;

import java.util.Scanner;

import exception.password.LowerAlphabeticException;
import exception.password.NumberLenghtException;
import exception.password.SpecialCharacterException;
import exception.password.UpperAlphaBeticException;
import exception.password.LenghtOfPassException;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter password: ");
		while(true) {
			try {
				String password = scanner.nextLine();
				
				checkLenghtPassword(password);
				checkLowerAlphabetic(password);
				checkUpperAlphabetic(password);
				checkNumberOfPass(password);
				checkSpeacialCharacter(password);
				break;
			} catch (LenghtOfPassException e) {
				e.printStackTrace();
				sleep();
			} catch (LowerAlphabeticException e) {
				e.printStackTrace();
				sleep();
			} catch(UpperAlphaBeticException e) {
				e.printStackTrace();
				sleep();
			} catch (NumberLenghtException e) {
				e.printStackTrace();
				sleep();
			} catch (SpecialCharacterException e) {
				e.printStackTrace();
				sleep();
			}
			System.out.print("Enter password again: ");
		}
	}
	
	public static boolean checkLenghtPassword(String password) throws LenghtOfPassException {
		if(password.length() < 8) {
			throw new LenghtOfPassException("Pass must contain at least 8 characters");
		}
		if(password.length() > 256) {
			throw new LenghtOfPassException("Pass must contain at most 256 characters");
		}
		return true;
	}
	
	public static boolean checkLowerAlphabetic(String password) throws LowerAlphabeticException {
		if(password.matches(".*[a-z].*")) {
			return true;
		}
		throw new LowerAlphabeticException("Pass must contain at least 1 lowercase alphabetic character");
	}
	
	public static boolean checkUpperAlphabetic(String password) throws UpperAlphaBeticException {
		if(password.matches(".*[A-Z].*")) {
			return true;
		}
		throw new UpperAlphaBeticException("Pass must contain at least 1 uppercase alphabetic character");
	}
	public static boolean checkNumberOfPass(String password) throws NumberLenghtException {
		if(!password.matches(".*\\d.*")) {
			throw new NumberLenghtException("Pass must contain at least 1 number");
		}
		return true;
		
	}
	
	public static boolean checkSpeacialCharacter(String password) throws SpecialCharacterException {
		if(password.matches(".*_.*") || password.matches(".*\\W.*")) {
			return true;
		}
		throw new SpecialCharacterException("Pass must contain at least 1 special character");
	}
	
	public static void sleep() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
