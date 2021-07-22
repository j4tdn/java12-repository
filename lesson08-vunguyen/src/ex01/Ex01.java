package ex01;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        String s = scanner.nextLine();
        boolean flag = s.matches("[aAàÀảẢãÃáÁạẠăĂằẰẳẲẵẴắẮặẶâÂầẦẩẨẫẪấẤậẬbBcCdDđĐeEèÈẻẺẽẼéÉẹẸêÊềỀểỂễỄếẾệỆfFgGhHiIìÌỉỈĩĨíÍịỊjJkKlLmMnNoOòÒỏỎõÕóÓọỌôÔồỒổỔỗỖốỐộỘơƠờỜởỞỡỠớỚợỢpPqQrRsStTuUùÙủỦũŨúÚụỤưƯừỪửỬữỮứỨựỰvVwWxXyYỳỲỷỶỹỸýÝỵỴzZ ]+");
        if (!flag) {
            throw new IllegalArgumentException("Invalid String");
        }

        String[] characters = s.trim().replaceAll("\\s+", "").split("");
        System.out.println("Print each character in a line: "
                + String.join(", ", characters));

        System.out.println("Print each word in each line: ");
        String[] words = s.trim().split("\\s+");
        for (String word: words) {
            System.out.println(word);
        }

        System.out.println("Print reverse array of characters: "
                + printReverseArr(characters));

        System.out.println("Print reverse array of words: "
                + printReverseArr(words));
    }

    private static String printReverseArr(String[] strArr) {
//        reverse each character in each element and reverse element position of strArr
//        StringBuilder s = new StringBuilder(String.join(" ", strArr));
//        return String.join(", ", s.reverse().toString().split(" "));

        // reverse element position of strArr
        String[] tempArr = Arrays.copyOf(strArr, strArr.length);
        for (int i = 0; i < tempArr.length/2; i++) {
            String temp = tempArr[i];
            tempArr[i] = tempArr[tempArr.length - 1 - i];
            tempArr[tempArr.length - 1 - i] = temp;
        }
        return String.join(", ", tempArr);
    }
}
