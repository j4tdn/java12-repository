package BT2;

import java.util.ArrayList;
import java.util.Scanner;

public class Solve {
	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<Vehicle> listRegister = new ArrayList<Vehicle>();

	public static void main(String[] args) {
		menu();
	}
	private static void input() {
		String charAnother = ""; 
		do {
			System.out.println("----------------nhap thong tin xe-------------");
			System.out.print("Chủ xe: ");
			String chuXe = scanner.nextLine();
			System.out.print("Kiểu xe: ");
			String kieuXe = scanner.nextLine();
			System.out.print("Dung tích: ");
			int dungTich = Integer.parseInt(scanner.nextLine());
			System.out.print("Giá trị: ");
			double giaTri = Double.parseDouble(scanner.nextLine());
			listRegister.add(new Vehicle(chuXe, kieuXe, dungTich, giaTri));
			System.out.println("nhap Y/N to continue input next infomation...");
			do {				
				charAnother = scanner.nextLine();
				if(!charAnother.equalsIgnoreCase("y") && !charAnother.equalsIgnoreCase("n")) {
					System.out.println("nhap Y/N to continue...");
					continue;
				}
				break;
			}while(true);
			
		}while(charAnother.equalsIgnoreCase("y"));
	}

	private static void output() {
		if (listRegister.size() == 0) {
			System.out.println("list empty");
			scanner.nextLine();
			return;
		}
		String alignFormat = "| %-25s | %-10s | %-8d | %,-17f| %,-12f%n";
		String alignHeader = "| %-25s | %-10s | %-4s | %-15s | %-15s |%n";
		System.out.format(alignHeader, "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		System.out.println("=================================================================================================");
		for (int i = 0; i < listRegister.size(); i++) {
			Vehicle v = listRegister.get(i);
			System.out.format(alignFormat, v.getOwner(), v.getType(), v.getCapacity(), v.getCost(), v.getTax());
		}
		scanner.nextLine();
	}
	private static void menu() {
		int choose = 0;
		do {
			System.out.println("-----------Menu------------");
			System.out.println("1. nhap thong tin xe");
			System.out.println("2. xuat ban ke khai");
			System.out.println("3. thoat ");

			do {
				System.out.print("nhap lua chon : ");
				choose = Integer.parseInt(scanner.nextLine());
				switch (choose) {
				case 1:
					input();
					break;
				case 2:
					output();
					break;
				case 3:
					System.out.println("Exit done...");
					return;
				default:
					break;
				}
			} while (choose != 1 && choose != 2);

		} while (true);

	}

}