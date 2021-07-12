package ex02;

import java.util.Arrays;

/**
 * code has consulted..
 */
public class Ex02 {
    public static void main(String[] args) {


        String s1 = "01a2b3456cde47118";
        String s2 = "aa6b546cbbb566e22h";
        String s3 = "aa6b326c6e22h";
        String[] ss1 = getLargestNumbers(s1);
        String[] ss2 = getLargestNumbers(s2);
        String[] ss3 = getLargestNumbers(s1, s2, s3);
        printResult("Result ss1: ", ss1);
        printResult("Result ss2: ", ss2);
        printResult("Result ss3: ", ss3);
//
    }

    private static void printResult(String text, String... result) {
        System.out.println(text);
        for (int i = 0; i < result.length; i++) {
            System.out.println(" - String " + (i + 1) + ": " + result[i]);
        }
    }

    private static String[] getLargestNumbers(String... arr) {
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replaceFirst("[a-z]+", "");
            String temp[] = arr[i].split("[a-z]+");
            for (int j = 0; j < temp.length; j++) {
                temp[j] = temp[j].replaceAll("[0]+", "");
            }

            int tempInteger[] = new int[temp.length];

            for (int j = 0; j < temp.length; j++) {
                tempInteger[j] = Integer.parseInt(temp[j]);
            }

            result[i] = String.valueOf(Arrays.stream(tempInteger).max().getAsInt());
        }
        return result;
    }
}

