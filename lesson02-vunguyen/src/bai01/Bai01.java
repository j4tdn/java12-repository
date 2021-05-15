package bai01;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (isPowerOf2(value)) {
            System.out.println(value + " la luy thua cua 2");
        } else {
            System.out.println(value + " khong phai la luy thua cua 2");
        }
    }

    public static boolean isPowerOf2(int value) {
        if (value == 2) {
            return true;
        }
        if (value % 2 == 0 && value > 0) {
            return isPowerOf2(value / 2);
        }
        return false;
    }
}
