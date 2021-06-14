package exception;

import java.util.Scanner;

public class Ex04 {
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter a: ");
		int a = Integer.parseInt(ip.nextLine());
		
		System.out.print("Enter b: ");
		int b = Integer.parseInt(ip.nextLine());
		
		
		// Make sure a != 0
		try {
			int x = div(a, b);
			System.out.println("Result: " + x);
		} catch (ArithmeticException e) {
			System.out.println("--- Jump to catch ---");
		}
		
		// throws, finally
		System.out.println("End");
	}
	
	private static int div(int a, int b) {
		// Root cause: a = 0
		if(a == 0) {
			System.out.println("Throw Exception");
			throw new ArithmeticException();
		}
		return -b/a;
	}
}
