package input;

import java.util.Scanner;

public class Ex01Scanner {
	public static void main(String[] args) {
		// Nhập họ tên, sở thích, tuổi
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter fullname: ");
		String fullname = ip.nextLine();
		
		System.out.print("Enter age: ");
		int age = Integer.parseInt(ip.nextLine());
		// ip.nextInt(); has redundant enter
		// ip.nextLine: not
		
		System.out.print("Enter hobbies: ");
		String hobbies = ip.nextLine();
		
		System.out.print("Address: ");
		String address = ip.nextLine();
		
		System.out.println("fullname: " + fullname);
		System.out.println("age: " + age);
		System.out.println("hobbies: " + hobbies);
		System.out.println("address: " + address);
		
	}
}
