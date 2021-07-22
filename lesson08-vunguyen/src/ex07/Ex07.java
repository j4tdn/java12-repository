package ex07;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter string S: ");
        String s = scanner.nextLine();
        if (!s.matches("[a-z]+")) {
            throw new IllegalArgumentException("Invalid string");
        }

        System.out.println("Enter position x: ");
        int x = Integer.parseInt(scanner.nextLine());
        if (x > s.length() - 1) {
            System.out.println("Biggest length is 0 ");
            System.out.println("Smallest length is 0");
            return;
        }

        char c = s.charAt(x);
        int[] longestArr = new int[s.length()];
        int count = 0;

        Arrays.fill(longestArr, 1);
        for (int i = x + 1; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                longestArr[count]++;
            } else {
                c = s.charAt(i);
                count++;
            }
        }

        int longest = Integer.MIN_VALUE;
        for (int i: longestArr) {
            if (longest < i) {
                longest = i;
            }
        }

        System.out.println("Biggest length is " + longest);
        System.out.println("Smallest length is 1");

    }
}
