package ex06;

import java.util.Scanner;

public class Ex06 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuilder digits = new StringBuilder();
        for (int i = 1; i < 1000000; i++) {
            digits.append(i);
        }
        String[] orders = digits.toString().split("");

        System.out.println("Enter K:");
        int order = Integer.parseInt(scanner.nextLine());
        System.out.println(orders[order - 1]);
    }
}
