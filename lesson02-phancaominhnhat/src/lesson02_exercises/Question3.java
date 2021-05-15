package lesson02_exercises;

import java.io.InputStream;
import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào 1 số bất kì: ");
		int number = scanner.nextInt();
		if(kiemTraSoDoiXung(number)) {
			System.out.println("Số " + number + " là số đối xứng.");
		} else {
			System.out.println("Số " + number + " không là số đối xứng.");
		};
	}
	private static boolean kiemTraSoDoiXung(int number) {
		String strNumber = Integer.toString(number);
		int count = 0;
		for(int i = 0; i < strNumber.length()/2; i++) {
			if(strNumber.charAt(i) == strNumber.charAt(strNumber.length() - i - 1)) {
				count++;
			}
		}
		return count == strNumber.length()/2;
	}
}
