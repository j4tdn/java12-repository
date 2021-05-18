package homework;

import java.util.Iterator;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in) ;
		int count=0;
		while(true) {
			System.out.println("Enter a number:");
			String text=ip.nextLine();
			
			if(isValidNumberpt(text)) {
				System.out.println("Number: "+text);
				return; //stop in void method	
			}
			count ++;
			if(count==3) {
				System.out.println("Nhap sai 3 lan, thoat");
				return;
			}
		}
	}
	
	private static boolean isValidNumber(String text) {
		for (int i=0 ; i< text.length();i++) {
			char temp=text.charAt(i);
			if(!Character.isDigit(temp)) {
				return false;
			}
		}
		return true;
	}
	private static boolean isValidNumberpt(String text) {
		String regex = "\\d+";
		return text.matches(regex);
	}
}
