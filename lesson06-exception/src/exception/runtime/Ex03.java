package exception.runtime;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex03 {
	private static Scanner ip = new Scanner(System.in);
	
	//neu code xay ra ngai le --> JVM nem ra thong tin ngoai le
	//InputMissmathException
	//NumberFormatException
	
	public static void main(String[] args) {
		//enter your year of birth -> calc your age
		String ageText ="";
		while(true) {
			System.out.println("Enter your year of birth: ");
			ageText = ip.nextLine();
			//regular-expresstion =REGEX
			// \d: digit [0-9]
			//+ : amout: 1,n numbers
			if(ageText.matches("\\d+")) {
				break;
			}
			System.out.println("Invalid Age");
		}
		
		int age = Integer.parseInt(ageText);
		int currentYear = LocalDate.now().getYear();
		System.out.println("your age: "+(currentYear - age +1));
	}
}
