package ex01;

import java.util.Scanner;


/*
    Nhập Tâm và bán Kính đường tròn, kiểm tra 1 điểm A(x,y) có thuộc được tròn hay không .
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao tam duong tron!");
        System.out.println("Hoanh do x: ");
        double a = Double.parseDouble(sc.nextLine());

        System.out.println("Tung do y: ");
        double b = Double.parseDouble(sc.nextLine());

        System.out.println("Nhap ban kinh R: ");
        double r = Double.parseDouble(sc.nextLine());

        System.out.println("Diem A : ");

        System.out.println("Nhap pointX: ");
        double pointX = Double.parseDouble(sc.nextLine());

        System.out.println("Nhap pointY:");
        double pointY = sc.nextDouble();

        Point A = new Point(pointX, pointY);
//        System.out.println(Circle.check(A));
    }
}
