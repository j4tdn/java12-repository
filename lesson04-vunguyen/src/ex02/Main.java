package ex02;

import java.util.Arrays;

public class Main {
    private static int count = 0;

    public static void main(String[] args) {
        int[] arrs = {3, 4, 5, 15, 13, 21, 45, 63, 35, 70};
        int[] newArrs = new int[arrs.length];
        collectNumbers(arrs, newArrs, i -> i % 7 == 0 && i % 5 != 0);
        collectNumbers(arrs, newArrs, i -> i % 7 == 0 && i % 5 == 0);
        collectNumbers(arrs, newArrs, i -> i % 7 != 0 && i % 5 != 0);
        collectNumbers(arrs, newArrs, i -> i % 5 == 0 && i % 7 != 0);
        System.out.println(Arrays.toString(newArrs));
    }

    private static void collectNumbers(int[] arrs, int[] newArrs, Checker checker) {
        for (int i : arrs) {
            if (checker.check(i)) {
                newArrs[count++] = i;
            }
        }
    }
}
