package ex02;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        String[] strArr01 = {"01a2b3456cde478"};
        String[] strArr02 = {"aa6b546c6e22h", "aa6b326c6e22h", ""};
        System.out.println(Arrays.toString(strArr01) + " result: " + String.join(", ", getLargestNumbers(strArr01)));
        System.out.println(Arrays.toString(strArr02) + " result: " + String.join(", ", getLargestNumbers(strArr02)));

    }

    private static String[] getLargestNumbers(String... ss) {
        int[] numbers = new int[ss.length];
        int count = 0;
        for (String s : ss) {
            // take out numbers in s then find max
            String[] strArrOfNumbers = s.split("[a-z]+"); // include empty string
            System.out.println(String.join(", ", strArrOfNumbers));
            numbers[count] = findMaxValue(strArrOfNumbers);
            count++;
        }
        sort(numbers);

        // convert int[] to String[]
        String[] result = new String[numbers.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = String.valueOf(numbers[i]);
        }
        return result;
    }

    /**
     * Sort int arrays in ascending order using insertion sort
     *
     * @param numbers given int arrays of numbers
     */
    private static void sort(int[] numbers) {
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }
    }

    /**
     * Find max number from string array of numbers including empty string
     *
     * @param strArrOfNumbers given string array of numbers include empty string
     * @return maximum numbers in given string array
     */
    private static int findMaxValue(String[] strArrOfNumbers) {
        int max = Integer.MIN_VALUE;
        if (strArrOfNumbers.length == 1 && strArrOfNumbers[0].isEmpty()) {
            return 0;
        }
        for (String s : strArrOfNumbers) {
            if (!s.isEmpty()) {
                int value = Integer.parseInt(s);
                if (max < value) {
                    max = value;
                }
            }
        }
        return max;
    }
}
