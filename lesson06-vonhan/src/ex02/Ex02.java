package ex02;

import java.util.Scanner;

public class Ex02 {
	/*
	 * Chương trình kiểm tra tính hợp lệ của mật khẩu
	 */
	public static void main(String[] args) {
		try {
			String password = "0001234aasAA+__";
			validatePassword(password);
		} catch (Exception e) {
			System.out.println(e.toString());
//			e.printStackTrace();
		}
	}

	public static boolean validatePassword(String pass) throws Exception {
		if (pass.length() < 8) {
			throw new Exception("At least 8 characters!");
		}
		if (pass.length() > 256) {
			throw new Exception("At most 256 characters!");
		}
		
		String regexAtLeastOneLowercase = ".*(\\w+).*";
		System.out.println(pass.matches(regexAtLeastOneLowercase)); /* true */
		if (!pass.matches(regexAtLeastOneLowercase)) {
			throw new Exception("At least one lowercase alphabetic character!");
		}

		String regexAtLeastOneUppercase = ".*([A-Z]+).*";
		System.out.println(pass.matches(regexAtLeastOneUppercase)); /* true */
		if (!pass.matches(regexAtLeastOneUppercase)) {
			throw new Exception("At least one uppercase alphabetic character!");
		}
		
		String regexAtLeastOneNumber = ".*([0-9]+).*";
		System.out.println(pass.matches(regexAtLeastOneNumber)); 
		if (!pass.matches(regexAtLeastOneNumber)) {
			throw new Exception("At least one number!");
		}

		String regexAtLeastOneSpecialChar = ".*([~!@#$%^&*\\\\(\\\\)\\\\-_=\\\\+\\\\]\\\\[}{|;:,.<>])+.*";
		System.out.println(pass.matches(regexAtLeastOneSpecialChar)); 

		if (!pass.matches(regexAtLeastOneSpecialChar)) {
			throw new Exception("At least one special character!");
		}

		return true;
	}
}