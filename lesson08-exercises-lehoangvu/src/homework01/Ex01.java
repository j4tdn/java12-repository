package homework01;

import java.util.Scanner;

public class Ex01 {
    private  static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
//    String s = "Ngày hai hai tháng chín năm hai không hai mốt";

        String s = "";
        do {
            System.out.println("Enter String s: ");
            s = ip.nextLine();
            if (s == null || !isValid(s)){

                System.out.println("Input again!! ");
                continue;
            }
            break;
        }while (true);

        System.out.print("Print each character on a line :");
        for (int i = 0; i <= s.length() - 1;i++){
            System.out.print("\n"+s.charAt(i));
        }
        System.out.println("==================================");

        System.out.println("\nPrint  each from on a line: ");
        String[] words = s.split("[\\s]");
        for (String word:words) {
            System.out.println(word+" ");
        }
        System.out.println("==================================");

//        in ra chuổi đảo ngược theo từ và theo kí tự ...
        System.out.println("Print reversed string by character");
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i));
        }
        System.out.println("=====================================");
        for (int i = words.length - 1;i >= 0;i--){
            System.out.println(words[i]);
        }


    }

    private static boolean isValid(String s){
        return s.matches("[\\p{L}\\s]{1,}");

    }

}
