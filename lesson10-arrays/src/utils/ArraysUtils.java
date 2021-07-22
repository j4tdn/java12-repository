package utils;

import bean.Item;

public class ArraysUtils {
    public ArraysUtils() {
    }

    public static void printf(int[] digits) {
        for(int digit: digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
    }

    public static void printf(Integer[] digits) {
        for(Integer digit: digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
    }
    public static void printf(String[] elements) {
        for(String element: elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void printf(Item[] items) {
        for (Item item: items) {
            System.out.println(item);
        }
    }
}
