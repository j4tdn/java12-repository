package exception;

import java.util.Scanner;

public class Ex04 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter a:");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("Enter b:");
		int b = Integer.parseInt(sc.nextLine());
		
		try {
			System.out.println(div(a, b));
		} catch (ArithmeticException e) {
			System.out.println("--Jump to catch");
		}
		System.out.println("Thread main end !");
	}
	
	private static int div(int a, int b) {
		if(a == 0) {
			throw new ArithmeticException();
		}
		return - b / a;
	}
}
