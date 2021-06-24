package ex04;

import java.util.Scanner;

public class AppUtils {
    private static Scanner scanner = new Scanner(System.in);

    public static People input(int selection) {
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Input year of birth: ");
        int yearOfBirth = scanner.nextInt();
        System.out.println("Input coefficients salary: ");
        float coefficientsSalary = scanner.nextFloat();
        scanner.nextLine();
        switch (selection) {
            case 1:
                System.out.println("Input job coefficientL: ");
                return new Director(name, yearOfBirth, coefficientsSalary, scanner.nextFloat());
            case 2:
                System.out.println("Input number of management staff: ");
                return new HeadOfDepartment(name, yearOfBirth, coefficientsSalary, scanner.nextInt());
            case 3:
                System.out.println("Input department name: ");
                return new Staff(name, yearOfBirth, coefficientsSalary, scanner.nextLine());
            default:
                System.out.println("Invalid input");
                return null;
        }
    }

    public static int menu() {
        System.out.println("========= EMPLOYEE DATA =========");
        System.out.println("1. Input Director data");
        System.out.println("2. Input head of department data");
        System.out.println("3. Input staff data");
        System.out.println("4. Show employees data");
        System.out.println("5. Show employees salary");
        System.out.println("6. Exit");
        System.out.println("Selection: ");
        int selection = scanner.nextInt();
        scanner.nextLine();
        return selection;
    }
}
