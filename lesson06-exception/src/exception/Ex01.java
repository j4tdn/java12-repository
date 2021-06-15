package exception;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex01 {
	private static Scanner ip=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter your age");
		int age = ip.nextInt();
		int currentYear=LocalDate.now().getYear();
		System.out.println("Your age: "+(currentYear-age+1));
	}
}
