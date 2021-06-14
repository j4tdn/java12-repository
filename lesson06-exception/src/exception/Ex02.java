package exception;


import java.time.LocalDate;
import java.util.Scanner;

public class Ex02 {

    private static Scanner ip = new Scanner(System.in);

    //    nếu code xảy ra ngoại lệ >> JVM ném ra thông tin ngoại lê trong console va ket thuc chuong trinh
//	    InputMismatchException
//	    NumberFormatException
//	    handle exception
    public static void main(String[] args) {
//	        Enter your year of birth => Caculate your age


        int age = -1;

        while (true) {
            try {

                System.out.print("Enter your age of birth ! ");
                age = Integer.parseInt((ip.nextLine()));
                break;
            } catch (NumberFormatException e) {
                System.out.println("----- Invaliad Age ------");
            }
        }

        int currentYear = LocalDate.now().getYear();
        System.out.println("Your age :" + (currentYear - age + 1));
        System.out.println("Thread main end");
    }
}

