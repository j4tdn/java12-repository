package exception;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);
//Nếu code xảy ra ngoại lệ => JVM ném ra thông tin ngoại lệ trong console va kết thúc chương trình
	
	public static void main(String[] args) {

		// Enter your year of birth => Calculate your age
		System.out.println("Enter your year of birth: ");
		int age = ip.nextInt();

		int currentYear = LocalDate.now().getYear();
		System.out.println("Your age : " + (currentYear - age + 1));
	}
}
