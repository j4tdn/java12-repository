package input;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// nhập họ tên, sở thích, tuổi
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter fullname: ");
		String fullname = ip.nextLine();
		
		System.out.print("Enter age: ");
		int age = Integer.parseInt(ip.nextLine());
		
		System.out.print("Enter hobbies: ");
		String hobbies = ip.nextLine();

		System.out.print("Enter Address: ");
		String address = ip.nextLine();
		
		
		System.out.println("Fullname: " + fullname);
		System.out.println("Hobbies: " + hobbies);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
	}
}
