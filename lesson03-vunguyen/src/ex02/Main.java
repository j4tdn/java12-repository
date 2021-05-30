package ex02;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int select;
        Vehicle[] vehicles = new Vehicle[3];
        do {
            select = menu();
            switch (select) {
                case 1:
                    vehicles[0] = inputVehicle();
                    vehicles[1] = inputVehicle();
                    vehicles[2] = inputVehicle();
                    break;
                case 2:
                    outputVehiclesInfo(vehicles);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid select");
            }
        } while (select != 3);
    }

    private static int menu() {
        System.out.println("         MENU");
        System.out.println("1. Input vehicles");
        System.out.println("2. Output vehicles data sheet");
        System.out.println("3. Quit");
        System.out.print("Select: ");
        return scanner.nextInt();
    }

    private static Vehicle inputVehicle() {
        System.out.println("Input vehicle:");
        scanner.nextLine();
        System.out.print("Owner: ");
        String owner = scanner.nextLine();
        System.out.print("Type: ");
        String type = scanner.nextLine();
        System.out.print("cc: ");
        int cc = scanner.nextInt();
        System.out.print("Vehicle value: ");
        double vehicleValue = scanner.nextDouble();
        return new Vehicle(owner, type, cc, vehicleValue);
    }

    private static void outputVehiclesInfo(Vehicle[] vehicles) {
        System.out.printf("%-25s%-25s%-25s%-25s%-25s", "Tên chủ xe", "Loại xe", "Dung tich", "Trị giá", "Thuế phải nộp");
        System.out.println("===================================================================================================");
        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle.toString());
        }
    }
}
