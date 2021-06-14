package exception;

import java.time.LocalDate;
import java.util.Scanner;

public class  Ex01 {


    private static Scanner ip = new Scanner(System.in);

    //    nếu code xảy ra ngoại lệ >> JVM ném ra thông tin ngoại lê trong console va ket thuc chuong trinh
//    InputMismatchException
//    NumberFormatException
    public static void main(String[] args) {
//        Enter your year of birth => Caculate your age

        System.out.print("Enter your age of brith: ");
        int age = Integer.parseInt((ip.nextLine()));

        int currentYear = LocalDate.now().getYear();
        System.out.println("Your age :" + (currentYear - age + 1));
    }
}






