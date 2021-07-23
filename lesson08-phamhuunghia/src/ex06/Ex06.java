package ex06;

import utils.Utils;

public class Ex06 {
	public static void main(String[] args) {
		System.out.println("Enter Number:");
		String s = Utils.sc.nextLine();
		
		System.out.println("Location Number Of k:");
		int k = Utils.sc.nextInt();
		System.out.println("Result: "+ s.charAt(k - 1));
	}
}
