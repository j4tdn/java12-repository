package bai05;

import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println(value + " o he co so 2 la " + Integer.toBinaryString(value));
    }
}
