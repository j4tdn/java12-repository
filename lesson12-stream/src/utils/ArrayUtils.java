package utils;

import java.util.Arrays;

public final class ArrayUtils {
    private ArrayUtils() {
    }

    public static void printf(int[] digits) {
        Arrays.stream(digits).forEach(System.out::println);
    }
}
