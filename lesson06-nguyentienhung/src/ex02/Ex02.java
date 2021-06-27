package ex02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyException extends Exception {
	String str1;

	MyException(String str2) {
		str1 = str2;
	}

	public String toString() {
		return (str1);
	}
}

public class Ex02 {

	public static Scanner input = new Scanner(System.in);

	public static boolean check(String s, String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		return matcher.find();
	}

	public static void main(String[] args) {
		String s = "";

		do {
			try {
				System.out.println("Nhập mật khẩu muốn đăng kí:");
				s = input.nextLine();
				if (s.length() < 8 || s.length() > 256) {
					throw new MyException("At least 8 character and at most 256 character");
				}
				if (!check(s, "[A-Z]"))
					throw new MyException("At least UpperCase Alphabetic character");
				if (!check(s, "[a-z]"))
					throw new MyException("At least LowerCase Alphabetic character");
				if (!check(s, "[0-9]"))
					throw new MyException("At least 1 number");
				if (!check(s, "(?=.*?[#?!@$%^&*-])"))
					throw new MyException("At least 1 special  character");
				break;
			} catch (MyException exp) {
				System.out.println(exp);
			}
		} while (true);
		System.out.println("Success");

	}

}
