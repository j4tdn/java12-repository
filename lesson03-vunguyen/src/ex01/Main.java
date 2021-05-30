package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input center point:");
        System.out.print("x: ");
        double x = scanner.nextDouble();
        System.out.print("y: ");
        double y = scanner.nextDouble();
        Point centerPoint = new Point(x, y);
        System.out.print("Input radius: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(centerPoint, radius);
        System.out.println("Input point A:");
        System.out.print("xA: ");
        double xA = scanner.nextDouble();
        System.out.print("xB: ");
        double xB = scanner.nextDouble();
        Point A = new Point(xA, xB);
        if (CalculateRadius(centerPoint, A) == radius) {
            System.out.println("A thuoc duong tron");
        } else {
            System.out.println("A khong thuoc duong tron");
        }
    }

    private static double CalculateRadius(Point a, Point b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(),2) + Math.pow(a.getY() - b.getY(), 2));
    }
}
