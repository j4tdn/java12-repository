package exception.runtime;

import java.util.Scanner;

import exception.own.DivideByZeroException;

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
		} catch (DivideByZeroException e) {
			System.out.println("--- Jump to catch ---");
		}
		
		// throws, finally
		System.out.println("Thread main end !");
	}
	
	// Should not throws RuntimeException
	private static int div(int a, int b) /* throws ArithmeticException */ {
		// Root cause: a = 0
		if (a == 0) {
			System.out.println("throw Exception");
			// throw new ArithmeticException();
			throw new DivideByZeroException();
		}
		System.out.println("-b/a");
		return -b/a;
	}
}
