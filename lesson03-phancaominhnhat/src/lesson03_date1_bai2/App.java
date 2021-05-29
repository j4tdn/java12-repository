package lesson03_date1_bai2;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle();
		Vehicle v3 = new Vehicle();
		boolean loop = true;
		while(loop) {
			menu();
			int option = scanner.nextInt();
			while(option != 1 && option != 2 && option != 3) {
				option = scanner.nextInt();
			}
			switch (option) {
			case 1: {
				enterInforOfCar(v1);
				enterInforOfCar(v2);
				enterInforOfCar(v3);
				back(scanner);
				break;
			}
			case 2: {
				Vehicle[] v = {v1, v2, v3};
				VehicleUtils.export(v);
				back(scanner);
				break;
			}
			case 3: {
				System.out.println("Kết thúc chương trình.");
				loop = false;
				break;
			}
			default:
			}
		}
		
	}
	
	public static void menu() {
		System.out.println("\n**********MENU*********\n");
		System.out.println("1. Nhập thông tin của xe.");
		System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe.");
		System.out.println("3. Thoát.\n");
		System.out.print("Nhập vào tùy chọn của bạn: ");
	}
	
	public static void enterInforOfCar(Vehicle v) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("**********Nhập thông tin xe**********");
		System.out.print("Nhập tên chủ xe: ");
		v.setNameOwner(scanner.nextLine());
		System.out.print("Nhập loại xe: ");
		v.setType(scanner.nextLine());
		System.out.print("Nhập dung tích: ");
		v.setCapacity(scanner.nextInt());
		scanner.nextLine();
		System.out.print("Nhập trị giá: ");
		v.setCost(Double.parseDouble(scanner.nextLine()));
	}
	
	public static void back(Scanner scanner) {		
		System.out.print("Nhập phím 0 để quay về menu: ");
		int t = scanner.nextInt();
		while(t != 0) {
			t = scanner.nextInt();
		}
	}
}
