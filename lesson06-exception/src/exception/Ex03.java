package exception;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex03 {
	private static Scanner ip = new Scanner(System.in);
//Nê�?u code xảy ra ngoại lệ => JVM ne�?m ra thông tin ngoại lệ trong console va kê�?t thu�?c chương trình

	public static void main(String[] args) {

		// Enter your year of birth => Calculate your age
		System.out.println("Enter your year of birth: ");
		String ageText = "";
		while (true) {
			System.out.println("Exter your year of birth: ");
			ageText = ip.nextLine();
               
			if(ageText.matches("\\d+")) {
				break;
			}
			System.out.println("------Invalid Age------");
		}
		int age = Integer.parseInt(ageText);

		int currentYear = LocalDate.now().getYear();
		System.out.println("Your age : " + (currentYear - age + 1));
	}
}
