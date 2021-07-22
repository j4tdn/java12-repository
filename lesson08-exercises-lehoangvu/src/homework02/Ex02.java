package homework02;

import java.util.Scanner;

public class Ex02 {
    private static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter your name :");
        String name = "";
        do {
            name = ip.nextLine();
            if (!isValid(name)){
                System.out.println("Enter again name");
                continue;
            }
            break;
        }while(true);
        String[] wordInName = name.split("[\\s]+");
        for (String w: wordInName)
        {
            System.out.print(w.substring(0,1).toUpperCase() + w.substring(1).toLowerCase()+" ");
        }
    }
    private static boolean isValid(String name){
        return name.matches("[a-z A-Z]{1,30}");
    }
}
