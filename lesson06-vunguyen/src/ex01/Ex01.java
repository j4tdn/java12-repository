package ex01;

import java.util.Scanner;

public class Ex01 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ax + b = 0");
        double a = 0;
        double b = 0;
        double x = 0;
        while (true) {
            try {
                System.out.println("Input a: ");
                a = Integer.parseInt(scanner.nextLine());
                if (a == 0) {
                    throw new ArithmeticException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("a can't be string type");
            } catch (ArithmeticException e) {
                System.out.println("a can't be zero");
            }
        }
        while (true) {
            try {
                System.out.println("Input b: ");
                b = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("b can't be string type");
            }
        }
        x = -b / a;
        System.out.println("x = " + x);
    }
}
