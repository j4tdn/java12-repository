package exception;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);
	
	//neu code xay ra ngai le --> JVM nem ra thong tin ngoai le
	//InputMissmathException
	//NumberFormatException
	public static void main(String[] args) {
		//enter your year of birth -> calc your age
		System.out.println("Enter your year of birth: ");
		int age = Integer.parseInt(ip.nextLine());
		
		int currentYear = LocalDate.now().getYear();
		System.out.println("your age: "+(currentYear - age +1));
	}
}
