package bai03;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long value = scanner.nextLong();
        if (isSymmetric(value)) {
            System.out.println(value + " la so doi xung");
        } else {
            System.out.println(value + " khong phai la so doi xung");
        }
    }

    public static boolean isSymmetric(long value) {
        ArrayList<Integer> digits = new ArrayList<>();
        if (value >= 0 && value <= 9) {
            return true;
        }
        while (value > 0) {
            int digit = (int) (value % 10);
            digits.add(digit);
            value /= 10;
        }
        for (int i = 0; i < digits.size() / 2; i++) {
            if (!digits.get(i).equals(digits.get(digits.size() - i - 1))) {
                return false;
            }
        }
        return true;
    }
}
