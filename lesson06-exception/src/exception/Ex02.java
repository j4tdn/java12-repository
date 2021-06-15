package exception;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex02 {
	private static Scanner ip=new Scanner(System.in);
	public static void main(String[] args) {
		String ageText ="";
		while(true) {
			try {
				System.out.println("Enter your age");
				ageText=ip.nextLine();
				
				if(ageText.matches("\\d+"));
				break;
			}catch(NumberFormatException ex){
				System.out.println("* Invalid Age *");
			}
		}
		int age= Integer.parseInt(ageText);
		int currentYear=LocalDate.now().getYear();
		System.out.println("Your age: "+(currentYear-age+1));
	}
}
