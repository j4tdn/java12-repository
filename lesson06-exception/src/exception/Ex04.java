package exception;

import java.util.Scanner;

public class Ex04 {
	private static Scanner ip=new Scanner(System.in);
	public static void main(String[] args) {
		
				System.out.println("Enter your a: ");
				int a=Integer.parseInt(ip.nextLine());
				
				System.out.println("Enter your b: ");
				int b=Integer.parseInt(ip.nextLine());
				
				try {
					int x= div(a,b);
					System.out.println("Result: "+x);
				}catch(ArithmeticException e) {
					System.out.println("Jump to catch");
				}
		}
	private static int div(int a, int b) {
		// TODO Auto-generated method stub
		if(a==0) {
			System.out.println("Throw exception");
			throw new ArithmeticException();
		}
		return -b/a;
	}
}
