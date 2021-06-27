package ex04;

import java.util.Scanner;

import exception.InvalidNumberInputException;

public class Ex04 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean chk=false;
		String strDigit="";
		while(!chk) {
			try {
				System.out.println("Enter number: ");
				strDigit=sc.nextLine();
				chk=CheckValidInput(strDigit);
			} catch (InvalidNumberInputException ex) {
				System.out.println(ex);
			}
		}
		int digit = Integer.parseInt(strDigit);
		readDigits(digit);
	}

	private static void readDigits(int digit) {
		// TODO Auto-generated method stub
		
	}

	private static boolean CheckValidInput(String str) throws InvalidNumberInputException {
		if(str.matches("^(0|[1-9][0-9]{0,2})$")) {
			return true;
		}
		throw new InvalidNumberInputException("Invalid input!!!");
	} 
	
}
