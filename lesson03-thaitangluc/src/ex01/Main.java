package ex01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Nhap toa do diem a: ");
		double xA = ip.nextDouble();
		double yA = ip.nextDouble();
		
		Point a = new Point(xA, yA);
		
		System.out.println("Nhap toa do tam duong tron: ");
		double xO = ip.nextDouble();
		double yO = ip.nextDouble();
		
		Point o = new Point(xO, yO);
		
		System.out.println("Nhap ban kinh duong tron: ");
		double r = ip.nextDouble();
		
		PointUtils.Circle(a, o, r);
	}
}
