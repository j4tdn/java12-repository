package input;

import java.util.Scanner;

public class Ex01Scanner {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter Name:");
		String fullName = ip.nextLine();
		
		System.out.println("Enter hobbies:");
		String hobbies = ip.nextLine();
		
		System.out.println("Enter age:");
		int age=Integer.parseInt(ip.nextLine());
		
		
		System.out.println("Address Name:");
		String Address = ip.nextLine();
		
		System.out.println("Full Name:"+fullName);
		System.out.println("Hobies :"+hobbies);
		System.out.println("Age::"+age);
		System.out.println("Address::"+Address);
		
	}
}
