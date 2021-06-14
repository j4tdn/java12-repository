package exception;


import java.time.LocalDate;
import java.util.Scanner;

public class Ex03 {

    private static Scanner ip = new Scanner(System.in);

//	    nếu code xảy ra ngoại lệ >> JVM ném ra thông tin ngoại lê trong console va ket thuc chuong trinh
//	    InputMismatchException
//	    NumberFormatException

    public static void main(String[] args) {
//	        Enter your year of birth => Caculate your age


        String agetext = "";
        while (true) {
            System.out.print("Enter your age of brith  : ");
            agetext = ip.nextLine();
            // regular
            // \\d : is digit [0-9]
            // + : amount : 1, n number
            if (agetext.matches("\\d+")) {
                break;
            }
            System.out.println("--- Invaliad age ---");

        }


        int age = Integer.parseInt(agetext);
        int currentYear = LocalDate.now().getYear();
        System.out.println("Your age :" + (currentYear - age + 1));
    }
}
