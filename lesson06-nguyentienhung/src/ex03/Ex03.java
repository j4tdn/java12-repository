package ex03;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyException extends Exception {
	String s1;

	public MyException(String s2) {
		s1 = s2;
	}

	@Override
	public String toString() {

		return s1;
	}
}

public class Ex03 {
	public static void main(String[] args) {
		String regex = "^[a-zA-Z]+[a-zA-Z0-9]*@{1}gmail.com$";

		do {
			try {
				Scanner scanner = new Scanner(System.in);
				String input = scanner.nextLine();
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(input);
				if (matcher.find()) {
					System.out.println("Hợp lệ");
					break;
				} else {
					throw new MyException("Email Không đúng định dạng, nhập lại");
				}

			} catch (MyException exp) {
				System.out.println(exp);
			}
		} while (true);
	}
}
