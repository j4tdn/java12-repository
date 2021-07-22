package homework03;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class Ex03 {
    public static void main(String[] args) {
        String input = "Em có yêu anh không anh để anh biết còn chờ\r\n"
                      +"Em xin lỗi em đã có thái độ không đúng với anh";
        System.out.println("input:\n"+input);

        System.out.println("\noutput:");
        System.out.println(removeTheSign(input));
    }

    private static String removeTheSign(String s){
        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCOMBINING_DIACRITICAL_MARKS}+");
        return pattern.matcher(temp).replaceAll("").replace('đ','d').replace('Đ','D');

    }
}
