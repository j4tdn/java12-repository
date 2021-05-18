package input;

import java.util.Scanner;

public class Ex01Scanner {
	public static void main(String[] args) {
		//nhap ho ten, joy, age
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter fullname: ");
		String fullname = ip.nextLine();
		
		System.out.println("Enter age: ");
		int age = Integer.parseInt(ip.nextLine());
		//ip.nextInt(): has redundant enter
		//ip.nextLine: not
		
		System.out.println("Enter Hobbies: ");
		String hobbies = ip.nextLine();
		
		System.out.println("Enter Address: ");
		String address = ip.nextLine();
		
		System.out.println("Fullname: "+fullname);
		System.out.println("hobbies: "+hobbies);
		System.out.println("age: "+age);
		System.out.println("address: "+address);

	}
}
