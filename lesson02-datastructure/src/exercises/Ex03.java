package exercises;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        int count = 0;
        String key = null;
        while (true){
            System.out.println("Enter a valid number: ");
             key = ip.nextLine();

            if(isValidNumberPt(key)) {
                System.out.println("number "+key);
                return;

            }
            count++;
            if (count == 3) {
                System.out.println("Wrong entering number exceeds 3 times ");
                return;
            }

        }
    }

    private static boolean isValidNumber(String key) {
        for(int i = 0;i < key.length();i++){
            char tmp = key.charAt(i);
            if(!Character.isDigit(tmp));
            return false;
        }
        return true;
    }

    private static boolean isValidNumberPt(String key) {
        String regex = "\\d+";
        return key.matches(regex);
    }


}
