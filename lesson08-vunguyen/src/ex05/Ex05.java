package ex05;

import java.util.Scanner;

public class Ex05 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter string s1: ");
        String s1 = scanner.nextLine();
        if (!s1.matches("[A-Z]+") || s1.length() > 250) {
            throw new IllegalArgumentException("Invalid string");
        }

        System.out.println("Enter string s2: ");
        String s2 = scanner.nextLine();
        if (!s2.matches("[A-Z]+") || s2.length() > 250) {
            throw new IllegalArgumentException("Invalid string");
        }

        System.out.println("Longest common substring is " + findLongestCommonSubstring(s1, s2));
    }

    private static String findLongestCommonSubstring(String s1, String s2) {
        StringBuilder result = new StringBuilder();

        // length of longest common substring
        int length = 0;

        // create a table whose row is s1, col is s2.
        // first row and col are ignored.
        int[][] table = new int[s1.length() + 1][s2.length() + 1];

        // cell's row index of result's last character
        int row = 0;

        for (int i = 1; i < s1.length() + 1; i++) {
            for (int j = 1; j < s2.length() + 1; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    table[i][j] = table[i - 1][j - 1] + 1;
                    if (table[i][j] > length) {
                        length = table[i][j];
                        row = i;
                    }
                }
            }
        }

        for (int i = 0; i < length; i++) {
            result.append(s1.charAt(row - length + i));
        }

        return result.toString();
    }
}
