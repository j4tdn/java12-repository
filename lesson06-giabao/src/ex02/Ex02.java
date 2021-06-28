package ex02;

import java.util.Scanner;

public class Ex02 {
	private static String username = "giabao";
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Check password is right password with condition!");
		// atleast 8charaters
		// at most 256 charaters .{8,256}
		// at least 1 uppercase 1 lowercase (?=.*?[A-Z])(?=.*?[a-z])
		// at least 1 number (?=.*?[0-9])
		// at least 1 special character (?=.*?[.#?!@$%^&*-])

		// not contain yourname
		// not contain email
		inputPassWord();
	}

	private static void inputPassWord() {
		String passWord = "";
		do {
			System.out.println("Enter your password:");
			passWord = sc.nextLine();
		} while (!isRightPassWord(passWord) || isExistsUserName(passWord, username));
		System.out.println("PassWord is correct!");
	}

	private static boolean isExistsUserName(String passWord, String userName) {
		return passWord.contains(userName);
	}

	private static boolean isRightPassWord(String passWord) {
		return passWord.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[.#?!@$%^&*-]).{8,256}$");
	}
}
