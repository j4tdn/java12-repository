package homework;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String text = null;
//			while (true) {
//				System.out.println("Enter a valid number: ");
//				String text = sc.nextLine();
//				if(!isValueNumber(text)) {
//					System.out.println("Text: ");
//					return;
//				}
//				count++;
//				if(count==3) {
//					System.out.println("Wrong entering number => exit ");
//					return;
//				}
//			}
		do {
			System.out.print("Enter a valid number: ");
			text = sc.nextLine();

			if (count == 3) {
				System.out.println("Wrong entering number >> Exit!!");
				return;
			}

			count++;
		} while (!isValueNumber(text));
		System.out.println("number: " + text);
	}

	private static boolean isValueNumber(String text) {
		for (int i = 0; i < text.length(); i++) {
			char tmp = text.charAt(i);
			if (!Character.isDigit(tmp)) {
				return false;
			}
		}
		return true;
	}

	private static boolean isValueNumerPt(String text) {
		// regex patter, regular expression: biểu thức chính quy
		// \\d[0-9]
		// +{1,} >>1 or more
		String regex = "\\d+";
		return text.matches(regex);
	}

}
