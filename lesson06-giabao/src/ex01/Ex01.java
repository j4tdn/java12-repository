package ex01;

import java.util.Scanner;

public class Ex01 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//GIAI HỆ PHƯƠNG TRÌNH AX+B=0
		int a,b;
		a= input();
		b= input();
		
		//make sure a!=0
		try {
		double x=div(a, b);
		System.out.println("Result: "+ x);
		} catch(ArithmeticException e) {
			System.out.println("---Jump to catch---");
		}
		System.out.println("Thread main end!");
	}
	private static double div(int a, int b) {
		//Root cause: a=0;
		if( a==0) {
			System.out.println("throw Exception");
			throw new ArithmeticException();
		}
		System.out.println("-b/a");
		return (double)-b/a;
	}
	
	private static int input() {
		int value = 0;
		do {
			try {
				System.out.print("Enter number: ");
				value = Integer.parseInt(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("Error!");
			}

		} while (true);
		return value;
	}
	
	}


