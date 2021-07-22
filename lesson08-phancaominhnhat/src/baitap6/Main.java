package baitap6;

public class Main {
	public static void main(String[] args) {
		String number = "12345678910111213141516171814645646546546546546546546546";
		
		int k = 20;
		System.out.println();
		while(!number.trim().matches("[0-9]*")) {
			System.out.println("Not a number");
		}
		
		System.out.println("So o vi tri thu k la: " + number.charAt(k-1));
	}
}
