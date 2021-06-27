package ex01;

import java.util.Scanner;

public class Ex01 {
    private static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {

        float a = input("a:");
        float b = input("b");
        solve(a, b);
    }

    private static float input(String s) {

        float a = 0;
        while(true){
            System.out.printf("Enter " + s + " = ");
            try {
                a = Float.parseFloat(ip.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return a;
    }

    private static void solve(float a, float b) {
        float result = 0;
        do {
            try {
                result = (int) -b / (int) a;
                break;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                a = input("a");
            }
        } while (true);
        result = -b / a;
        System.out.println("Result : " + result);
    }
}

