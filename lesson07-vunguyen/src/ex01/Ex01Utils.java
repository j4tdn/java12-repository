package ex01;

import java.util.Scanner;

public final class Ex01Utils {
    public static Scanner scanner = new Scanner(System.in);

    private Ex01Utils() {
    }

    public static int selectOption(String s) {
        int option = 0;
        while (true) {
            try {
                System.out.println(s);
                System.out.println("1. Yes");
                System.out.println("2. No");
                System.out.println("Chose: ");
                // Don't catch NumberFormatException as NUmberFormatException is subclass of IllegalArgumentException
                option = Integer.parseInt(scanner.nextLine());
                if (option != 1 && option != 2) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("You must chose 1 or 2");
            }
        }
        return option;
    }
}
