package ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Gia Bảo", "Vision 2019", 100, 24000000);
		Vehicle v2 = new Vehicle("Anh Khoa", "SH 2020", 150, 100000000);
		vehicles.add(v1);
		vehicles.add(v2);
		int choose;
		do {
			System.out.println("=====================MENU CỦA GIA BẢO ======================");
			System.out.println("1.Nhập vào thông tin và tạo đối tượng.");
			System.out.println("2.Xuất bảng kê khai tiền thuế trước bạ.");
			System.out.println("3.Thoát");
			System.out.println("=========================================");
			System.out.print("=> Mời nhập lựa chọn: ");
			choose = Integer.parseInt(sc.nextLine());
			switch (choose) {
			case 1: {
				Input();
				break;
			}
			case 2: {
				Output();
				break;
			}
			case 3: {
				break;
			}
			default: {
				System.out.println("Không có sự lựa chọn này!");
			}
			}
		} while (choose != 3);
	}

	public static void Input() {
		String tenchuxe, loaixe;
		int dungtich;
		double trigia;
		System.out.println("=======================");
		System.out.println("Mời nhập thông tin đối tượng");
		System.out.print("Tên chủ sở hữu: ");
		tenchuxe = sc.nextLine();
		System.out.print("Loại xe: ");
		loaixe = sc.nextLine();
		System.out.print("Dung tích: ");
		dungtich = Integer.parseInt(sc.nextLine());
		System.out.print("Trị giá: ");
		trigia = Double.parseDouble(sc.nextLine());
		vehicles.add(new Vehicle(tenchuxe, loaixe, dungtich, trigia));
	}

	public static void Output() {
		System.out.println("                   BẢNG KÊ KHAI TIỀN THUẾ TRƯỚC BẠ");
		System.out.printf("%-20s %-15s %-15s %-15s %-15.4s \n", "Tên chủ xe", "Loại xe", "Dung tích", "Giá trị",
				"Thuế phải nộp");
		System.out.println("========================================================================");
		for (Vehicle v : vehicles) {
			System.out.printf("%-20s %-15s %-15s %-15s %-15.4s \n", v.getTenchuxe(), v.getLoaixe(), v.getDungtich(),
					v.getTrigia(), VehicleUtils.thuexe(v));
		}
		System.out.println();
	}

}
