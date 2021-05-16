package input;

import java.util.Scanner;

public class Ex01Scanner {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter fullname: ");
		String fullname = ip.nextLine();
		
		System.out.print("Enter age: ");
		//int age = ip.nextInt(); // khong nen vi gay loi
		int age = Integer.parseInt(ip.nextLine());
		
		System.out.print("Address: ");
		String address = ip.nextLine();
		
		System.out.print("Enter hobbies: ");
		String hobbies = ip.nextLine();
		
		System.out.println("Fullname: "+fullname);
		System.out.println("Hobbies: "+hobbies);
		System.out.println("Age: "+age);
		System.out.println("Address: "+ address);
	}
}
