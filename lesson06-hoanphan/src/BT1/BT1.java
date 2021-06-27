package BT1;

import java.security.DigestException;
import java.util.Scanner;

public class BT1 {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
	
		do {
			int a =0;
			int b =0;

			try {
				System.out.println("Enter a: ");
				a = Integer.parseInt(ip.nextLine());
				
				System.out.println("Enter b: ");
				b = Integer.parseInt(ip.nextLine());
				float x = div(a,b);
				System.out.println("Phuong trinh co nghiem x = : "+x);
				break;
			} catch (DigestException e) {
				if(a==0 && b!=0) {
					System.out.println("--Phuong trinh vo nghiem--");
				}
				if(a==0 && b==0) {
					System.out.println("--Phuong trinh co vo so nghiem--");
				}
			}catch (NumberFormatException e) {
				System.out.println("Nhap sai ki tu, nhap lai");}

		} while (true);
		
	}
	private static float div(float a, float b) throws DigestException/* throws ArithmeticException*/{
		if(a==0) {
			throw new DigestException();
		}
		System.out.println("giai pt "+a+"x + "+b+" = 0");
		return -b/a;
	}
}