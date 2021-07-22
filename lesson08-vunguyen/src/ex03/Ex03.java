package ex03;

import java.util.Scanner;

public class Ex03 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter string: ");
        String s = scanner.nextLine();
        boolean flag = s.matches("[aAàÀảẢãÃáÁạẠăĂằẰẳẲẵẴắẮặẶâÂầẦẩẨẫẪấẤậẬbBcCdDđĐeEèÈẻẺẽẼéÉẹẸêÊềỀểỂễỄếẾệỆfFgGhHiIìÌỉỈĩĨíÍịỊjJkKlLmMnNoOòÒỏỎõÕóÓọỌôÔồỒổỔỗỖốỐộỘơƠờỜởỞỡỠớỚợỢpPqQrRsStTuUùÙủỦũŨúÚụỤưƯừỪửỬữỮứỨựỰvVwWxXyYỳỲỷỶỹỸýÝỵỴzZ ]+");
        if (!flag) {
            throw new IllegalArgumentException("Invalid String");
        }
        System.out.println(unsignedVietnameseString(s));
    }

    private static final String[] vietnameseLetters = new String[]{
            "aAeEoOuUiIdDyY",
            "áàạảãâấầậẩẫăắằặẳẵ",
            "ÁÀẠẢÃÂẤẦẬẨẪĂẮẰẶẲẴ",
            "éèẹẻẽêếềệểễ",
            "ÉÈẸẺẼÊẾỀỆỂỄ",
            "óòọỏõôốồộổỗơớờợởỡ",
            "ÓÒỌỎÕÔỐỒỘỔỖƠỚỜỢỞỠ",
            "úùụủũưứừựửữ",
            "ÚÙỤỦŨƯỨỪỰỬỮ",
            "íìịỉĩ",
            "ÍÌỊỈĨ",
            "đ",
            "Đ",
            "ýỳỵỷỹ",
            "ÝỲỴỶỸ"
    };

    private static String unsignedVietnameseString(String s) {
        for (int i = 1; i < vietnameseLetters.length; i++) {
            for (int j = 0; j < vietnameseLetters[i].length(); j++) {
                char letter = vietnameseLetters[i].charAt(j);
                if (s.contains(String.valueOf(letter))) {
                    // String.replace return new String => s don't change in main
                    s = s.replace(letter, vietnameseLetters[0].charAt(i - 1));
                }
            }
        }
        return s;
    }
}
