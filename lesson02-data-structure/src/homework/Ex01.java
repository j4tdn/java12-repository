package homework;

import java.util.Scanner;

public class Ex01 {
	/*
	 Ex01: Kiểm tra chuỗi nhập vào có phải là 1 số hợp lệ?
	 Nhập lại khi hợp lệ, nếu quá 3 lần thì dừng ctrinh với return	  
	 * */
	public static void main(String[] args) {
		// B1: Enter a text
		// B2: Validate input text
		//	+ text: number => Integer.parseInt(text) => int
		//	+ text: invalid number >> Require reenter

		Scanner ip = new Scanner(System.in);
		int count = 0;
		String text = null;
		while(true) {
			System.out.print("Enter number: ");
			text = ip.nextLine();
			
			if(isValidNumberPt(text)) {				
				System.out.println("Number: " + text);
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
		for(int i = 0; i < text.length(); i++) {
			char tmp = text.charAt(i);
			if(!Character.isDigit(tmp)) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isValidNumberPt(String text) {
		//regex pattern, regular expression: Bieu thuc chinh quy
		String regex = "\\d+";
		return text.matches(regex);
	}
}
