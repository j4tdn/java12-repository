package homework;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int count = 0;
		String text = null;
		while (true) {
			System.out.print("Enter a valid number: ");
			text = ip.nextLine();

			if (isValidNumberPt(text)) {
				System.out.println("number: " + text);
				return;
			}

			count++;
			if (count == 3) {
				System.out.println("Wrong entering number exceeds 3 times >> Exit !!!");
				return;
			}
		}
	}
	
	@SuppressWarnings("unused")
	private static boolean isValidNumber(String text) {
		for (int i = 0; i < text.length(); i++) {
			char tmp = text.charAt(i);
			if (!Character.isDigit(tmp)) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isValidNumberPt(String text) {
		// regex pattern, regular expression: Biểu thức chính quy
		// \\d [0-9] [0123456789]
		// + {1, } >> 1 or more
		String regex = "\\d+";
		return text.matches(regex);
	}
}
