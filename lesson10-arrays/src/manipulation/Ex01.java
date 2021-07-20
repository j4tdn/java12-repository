package manipulation;

import utils.ArraysUtils;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        int[] digits = { 1, 9, 5, 36, 12, 33 };
        ArraysUtils.printf(delete(digits, 4));
    }

    // 1 9 5 36 12 33
    // k = 2, newElement = 77
    // 1 9 "77" 5 36 12 33

    private static int[] add(int[] digits, int k, int newElement) {
        int[] result = new int[digits.length + 1];
        for (int i = 0; i < k; i++) {
            result[i] = digits[i];
        }
        result[k] = newElement;
        for (int i = k + 1; i < result.length; i++) {
            result[i] = digits[i - 1];
        }
        return result;
    }

    // 1 9 5 36 12 33
    // k = 2, newElement = 77

    // 0 0 0 0 0 0 0
    // 1 9 5 36 12 33 0
    // 1 9 5 5 36 12 33
    private static int[] insert(int[] digits, int k, int newElement) {
        int[] result = new int[digits.length + 1];

        // copy
        for (int i = 0; i < digits.length; i++) {
            result[i] = digits[i];
        }

        // shift right 1 unit
        for (int i = result.length - 1; i > k; i--) {
            result[i] = result[i - 1];
        }

        // assign
        result[k] = newElement;

        return result;
    }

    // 1 9 5 36 12 33
    // k = 3
    // 1 9 5 12 33
    private static int[] remove(int[] digits, int k) {
        int[] result = new int[digits.length - 1];

        for (int i = 0; i < k; i++) {
            result[i] = digits[i];
        }

        for (int i = k + 1; i < digits.length; i++) {
            result[i - 1] = digits[i];
        }

        return result;
    }

    // 1 9 5 36 12 33
    // k = 3

    // 1 9 5 12 33 33
    // 1 9 5 12 33
    private static int[] delete(int[] digits, int k) {
        for (int i = k+1; i < digits.length; i++) {
            digits[i-1] = digits[i];
        }

        return Arrays.copyOfRange(digits, 0, digits.length-1);
    }
}
