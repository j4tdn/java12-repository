package bai04;

import java.util.Scanner;

public class Bai04 {
    public static void main(String[] args) {
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arrOfValues = s.split(" ");
        for (String i : arrOfValues) {
            int value = Integer.parseInt(i);
            if (value > max) {
                max = value;
            }
        }
        System.out.println("So lon nhat la: " + max);
    }
}
