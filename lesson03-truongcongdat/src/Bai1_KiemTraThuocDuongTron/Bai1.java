package Bai1_KiemTraThuocDuongTron;

import java.util.Scanner;

/**
 * 
 * @author Truong Dat
 * 
 * Nhập vào tâm và bán kính của một đường tròn. Sau đó nhập vào một điểm A(x, y) bất
kì và kiểm tra xem A có thuộc đường tròn không ?
 *
 */
public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cirX, cirY;
		double r;
		System.out.println("Nhập vào tâm của đường tròn: ");
		
		System.out.print("x = ");
		cirX = sc.nextInt();
		System.out.print("y = ");
		cirY = sc.nextInt();
		System.out.print("r = ");
		r = sc.nextDouble();
		Circle circle = new Circle(new Point(cirX, cirY), r);
		
		System.out.println("Nhập vào điểm A: ");
		int xA, yA;
		System.out.println("x = ");
		xA = sc.nextInt();
		System.out.println("y = ");
		yA = sc.nextInt();
		Point A = new Point(xA, yA);
		
		circle.Check(A);
		
		sc.close();
		
	}
}
