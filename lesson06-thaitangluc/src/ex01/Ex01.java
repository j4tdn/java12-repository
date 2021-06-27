package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a, b;
		do {
			try {
				System.out.println("Nhap a: ");
				a = Integer.parseInt(ip.next());
				System.out.println("Nhap b: ");
				b = Integer.parseInt(ip.next());
				double x = div(a,b);
				System.out.println("x = " + x);
				break;
			} catch (NumberFormatException e) {
				System.out.println("So khong hop le");
			} catch (ArithmeticException e) {
				System.out.println("Loi chia 0");
			}
		}
		while(true);
		
	}
	
	public static double div(int a, int b) {
		if(a==0) throw new ArithmeticException();
		return -b/a;
	}
}
