package exercise01;

import java.util.Scanner;

public class Ex01 {
	public static int check(double a, double b, double radius, double x, double y) {
		if (radius > Math.sqrt(Math.pow(a - x, 2) + Math.pow(b - y, 2)))
			return 1;
		else if (radius < Math.sqrt(Math.pow(a - x, 2) + Math.pow(b - y, 2)))
			return -1;
		return 0;
	}

	public static void main(String[] args) {
		double a, b, radius, x, y;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter center of circle I(a,b):");
			System.out.print("a:");
			a = Double.parseDouble(sc.nextLine());
			System.out.print("b:");
			b = Double.parseDouble(sc.nextLine());
			System.out.println("Enter radius of circle I(a,b):");
			radius = Double.parseDouble(sc.nextLine());
			System.out.println("Enter point A(x,y):");
			System.out.print("x:");
			x = Double.parseDouble(sc.nextLine());
			System.out.print("y:");
			y = Float.parseFloat(sc.nextLine());
		}
		if (check(a, b, radius, x, y) == 1)
			System.out.println("Point A(x,y) in circle");
		else if (check(a, b, radius, x, y) == -1)
			System.out.println("Point A(x,y) out circle");

		System.out.println("Point A(x,y) on circle");

	}

}
