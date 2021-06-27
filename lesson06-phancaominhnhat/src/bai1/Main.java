package bai1;

import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		System.out.println("Giai phuong trinh bac nhat ax + b = 0");
		while(true) {
			try {
				System.out.print("Enter a: ");
				a = Integer.parseInt(scanner.nextLine());
				System.out.print("Enter b: ");
				b = Integer.parseInt(scanner.nextLine());
				int c = -b / a;
				System.out.println("Result: x = " + (float)-b/a);
				break;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				sleep();
				System.out.println("Can not enter character different number.Input again!!!");
			} catch (ArithmeticException e) {
				e.printStackTrace();
				sleep();
				System.out.println("Can not enter character 0");
			}
		}
	}
	public static void sleep() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
