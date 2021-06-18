package ex03;

import java.util.Scanner;

public class Ex03 {
	/*
	 *	 Viết hàm kiểm tra một số có phải là lũy thừa của một số khác không
		VD: (8, 2)(true), (8, 2)(true), (6, 2)(false), (20, 4)(false), (64, 4)(true).

		Method signature: boolean isPowerOf(int a, int b)
	 */

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();

        System.out.println("Result: " + isPower(a, b));
    }

    private static boolean isPowerOf(int a, int b) {
        if (a > b) {
            return isPower(a, b);
        }
        return isPower(b, a);

    }

    private static boolean isPower(int value, int power) {
        // 2 90010
        // 	 45005
        if (power == 1 || power == value) {
            return true;
        }
        while (power > value) {
            if (power % value != 0) {
                return false;
            }
            power /= value;
        }

        return power == value;
    }
}

