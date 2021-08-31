package demo;

import java.util.Arrays;
import java.util.OptionalInt;

public class Ex11 {
    public static void main(String[] args) {
        // 1, 2, 1, 4, 5, 8, 10, 4, 12
        int[] digits = {1, 2, 1, 4, 5, 8, 10, 4, 12};

        // 1st: is there any element that is divisible by 10
        boolean d10 = Arrays.stream(digits)
                .anyMatch(digit -> digit % 10 == 0);

        // 2nd: find the first element that is divisible by 4
        OptionalInt optIntD4 = Arrays.stream(digits)
                .filter(item -> item % 4 == 0)
                .findFirst();
        if (optIntD4.isPresent()) {
            System.out.println("fistD4: " + optIntD4.getAsInt());
        }

        // 3nd: find the element that is divisible by 5 in the list
        OptionalInt optIntD5 = Arrays.stream(digits)
                .filter(item -> item % 5 == 0)
                .findAny();
        if (optIntD5.isPresent()) {
            System.out.println("fistD4: " + optIntD5.getAsInt());
        }

        // 4th: does all elements less than 100
        boolean allLT100 = Arrays.stream(digits)
                .allMatch(digit -> digit < 100);

        // 5th: does no elements greater than 0
        boolean nonGT100 = Arrays.stream(digits)
                .noneMatch(digit -> digit > 100);
    }
}