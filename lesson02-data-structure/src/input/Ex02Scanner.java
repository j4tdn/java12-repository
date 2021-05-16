package input;

import java.util.Scanner;

public class Ex02Scanner {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter fullname: ");
		String fullname = ip.nextLine();
		
		System.out.println("Enter age: ");
//		int age = ip.nextInt();
		int age = Integer.parseInt(ip.nextLine());
		System.out.println(age);
		
		int alo = ip.nextInt();
		ip.nextLine();
		String str = ip.nextLine();
		System.out.println(str);
	}
}
