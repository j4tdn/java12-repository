package ex01;

import java.util.Scanner;

public class Ex01 {
	private static Scanner ip=new Scanner(System.in);
	public static void main(String[] args) {				
				while (true) {
					try {
						System.out.println("<Y=aX+b>");
						System.out.println("Enter a: ");
						int a=Integer.parseInt(ip.nextLine());
						
						System.out.println("Enter b: ");
						int b=Integer.parseInt(ip.nextLine());
						int x= div(a,b);
						System.out.println("Result: X= "+x);
					}catch(ArithmeticException e) {
						System.out.println("Cannot divide by zero");
						continue;
					}catch(NumberFormatException nbe) {
						System.out.println("Giá trị nhập vào không hợp lệ!");
						continue;
					}
					break;
				}
		}
	
	private static int div(int a, int b) {
		return -b/a;
	}
}
