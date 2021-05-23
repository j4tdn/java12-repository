package homework;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner ip=new Scanner(System.in);
   int count=0;
   while(true) {
	   System.out.println("Enter a valid number: ");
	   String text=ip.nextLine();
	   if(isValidNumber(text)) {
		   System.out.println("number: "+text);
		   return;
	   }
	   count++;
	   if(count==3) {
		   System.out.println("Wrong entering number exceeds 3 times >> Exit");
	   }
   }
	}

	public static boolean isValidNumber(String text) {
		for (int i = 0; i < text.length(); i++) {
			char tmp = text.charAt(i);
			if (!Character.isDigit(tmp)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isValidNumberPt1(String text) {
		String regex = "\\d+";
		return text.matches(regex);
	}
	
}
