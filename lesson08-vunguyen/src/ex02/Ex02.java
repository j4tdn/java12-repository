package ex02;

import java.util.Scanner;

public class Ex02 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter full name: ");
        String s = scanner.nextLine();
        if (!s.matches("[A-Za-z ]+")) {
            throw new IllegalArgumentException("Invalid name");
        }
        String[] words = s.trim().replaceAll("\\s+", " ").split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        System.out.println("Full name: " + String.join(" ", words));
    }
}
