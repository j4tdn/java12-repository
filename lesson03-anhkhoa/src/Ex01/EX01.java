package Ex01;

import java.util.Scanner;

public class EX01 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Nhập tâm đường tròn: ");
		System.out.println("x: ");
		double a = Double.parseDouble(sc.nextLine());
		System.out.println("y: ");
		double b = Double.parseDouble(sc.nextLine());
		Point cen = new Point(a, b);
		Circle.setCenter(cen);
		System.out.println("Nhập đường kính đường tròn: ");
		Circle.setDiameter(Double.parseDouble(sc.nextLine()));
		System.out.println("Nhập điểm A: ");
		System.out.println("x: ");
		double a1 = Double.parseDouble(sc.nextLine());
		System.out.println("y: ");
		double b1 = Double.parseDouble(sc.nextLine());
		Point A = new Point(a1, b1);
		System.out.println(Circle.Check(A));
	}
}
