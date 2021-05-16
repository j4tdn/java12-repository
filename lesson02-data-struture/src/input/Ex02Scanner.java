package input;

import java.util.Scanner;

public class Ex02Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		
		System.out.println("Enter full name:");
		String fullname=ip.nextLine();
		
		System.out.println("Enter Hobbies:");
		String hobbies=ip.nextLine();
		
		System.out.println("Enter age:");
		int age=Integer.parseInt(ip.nextLine());
		
		System.out.println("Enter address:");
		int address=ip.nextInt();
		
		System.out.println(fullname);
		System.out.println(hobbies);
		System.out.println(age);
		System.out.println(address);
	}

}
