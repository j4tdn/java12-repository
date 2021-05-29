package BT1;

import java.util.Scanner;

public class Solve {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao toa do tam cua duong tron: ");
		int Cx,Cy;
		Cx = scanner.nextInt();
		Cy = scanner.nextInt();
		
		double r;
		System.out.println("nhap vao ban kinh cua duong tron: ");
		r = scanner.nextDouble();
		
		Circle c = new Circle(new Point(Cx,Cy), r);
		System.out.println("nhap vao tao do diem A: ");
		int xA, yA;
		xA = scanner.nextInt();
		yA = scanner.nextInt();
		Point A = new Point(xA, yA);
		
		c.Determined(A);
		
	}
	
}
