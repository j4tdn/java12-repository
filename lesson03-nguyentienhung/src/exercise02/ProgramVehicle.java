package exercise02;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramVehicle {

	public static void main(String[] args) {
		ArrayList<Vehicle> listVehicle = new ArrayList<Vehicle>();
		Scanner scanner = new Scanner(System.in);
		int option;
		do {
			System.out.println("************************Menu****************************");
			System.out.println("1.Enter information and create object Vehicle :");
			System.out.println("2.Output Data");
			System.out.println("3.Exit");
			System.out.println("Giving Your Opinion:");
			option = Integer.parseInt(scanner.nextLine());
			switch (option) {
			case 1: {
				String name;
				String model;
				int capacity;
				double cost;
				System.out.println("Enter Name of Vehicle:");
				name = scanner.nextLine();
				System.out.println("Enter Model of Vehicle:");
				model = scanner.nextLine();
				System.out.println("Enter Capacity of Vehicle:");
				capacity = Integer.parseInt(scanner.nextLine());
				System.out.println("Enter Cost of Vehicle:");
				cost = Double.parseDouble(scanner.nextLine());
				Vehicle vehicle = new Vehicle(name, model, capacity, cost);
				listVehicle.add(vehicle);
				break;
			}
			case 2: {
				System.out.printf("%-25s%-25s%-25s%-25s%s\n","Tên chủ xe","Loại xe","Dung tích","Trị Giá","Thuế phải nộp");
				System.out.println("======================================================================================================");
				for (Vehicle item : listVehicle) {
					System.out.printf("%-23s%-23s%-22s%-22s%s\n",item.getName(),item.getModel(),item.getCapacity(),item.getCost(),item.getTaxation());
				}
				break;
			}
			case 3: {
				System.exit(0);
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);
			}
		} while (true);
	}

}
