package exercises;

import java.util.Scanner;

public class Ex01ValidNumber {
    //    nhap vao 1 chuoi so hop le
//    neu sai nhap, yeu cau nhap lai.
//    enter a valid number
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int count = 0;
        String text = null; //123

        do {
            System.out.println("Enter number: ");
            text = ip.nextLine();
            if (text.matches("[0-9]+")) {
                break;
            }
            count++;
            if (count == 3) {
                System.out.println("Wrong text exxceeds 3 times!");
                return;
            }
        } while (true);
        int number = Integer.parseInt(text);
        System.out.println("Value :" + number);
    }
}
