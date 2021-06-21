package exception.compile;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex01 {
	static Scanner sc = new Scanner(System.in);

	// nếu code xảy ra exception => jvm ném ra thông tin ngoại lệ trong console và
	// kết thúc chương trình
	// InputMismatchException
	// NumberFormatException

	public static void main(String[] args) {
		// enter your year of birth => calculate your age
		int year = -1;
		while (true) {
			try {
				System.out.print("Enter your year of birth: ");
				year = Integer.parseInt(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("Error : " + e);
			}
		}
		int currentYear = LocalDate.now().getYear();
		System.out.println("Your age: " + (currentYear - year + 1));
		System.out.println("Thread main end!");

	}
}
