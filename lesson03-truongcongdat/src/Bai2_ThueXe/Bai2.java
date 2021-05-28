package Bai2_ThueXe;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<Vehicle> danhSach = new ArrayList<Vehicle>();

	public static void main(String[] args) {
		luaChon();
	}

	private static void luaChon() {
		int choose = 0;
		do {
			System.out.println("========Menu======");
			System.out.println("1. Nhập thông tin");
			System.out.println("2. Xuất bản kê khai tiền thuế của các xe");
			System.out.println("3. Thoát");

			do {
				System.out.print(">> Your choose: ");
				choose = Integer.parseInt(sc.nextLine());
				switch (choose) {
				case 1:
					nhapThongTin();
					break;
				case 2:
					xuatBanKeKhai();
					break;
				case 3:
					System.out.println("Bạn đã thoát chương trình...");
					return;

				default:
					System.out.println("Cú pháp không hợp lệ");
					break;
				}
			} while (choose != 1 && choose != 2);

		} while (true);

	}

	private static void nhapThongTin() {
		String inputAnother = ""; 
		do {
			System.out.println("----------Nhập thông tin xe--------");
			System.out.print("Chủ xe: ");
			String chuXe = sc.nextLine();
			System.out.print("Kiểu xe: ");
			String kieuXe = sc.nextLine();
			System.out.print("Dung tích: ");
			int dungTich = Integer.parseInt(sc.nextLine());
			System.out.print("Giá trị: ");
			double giaTri = Double.parseDouble(sc.nextLine());
			danhSach.add(new Vehicle(chuXe, kieuXe, dungTich, giaTri));
			System.out.println("Nhập thành công: Xe [" + danhSach.get(danhSach.size() - 1) + "]");
			
			System.out.println("Bạn có muốn nhập thêm một chiếc xe nữa không? (Y/N)");
			do {				
				inputAnother = sc.nextLine();
				if(!inputAnother.equalsIgnoreCase("y") && !inputAnother.equalsIgnoreCase("n")) {
					System.out.println("!! Vui lòng nhập Yes(Y)/No(N)...");
					continue;
				}
				break;
			}while(true);
			
		}while(inputAnother.equalsIgnoreCase("y"));
	}

	private static void xuatBanKeKhai() {
		if (danhSach.size() == 0) {
			System.out.println("Danh sách rỗng");
			sc.nextLine();
			return;
		}
		String alignFormat = "| %-32s | %-10s | %-9d | %,-15.2f | %,-15.2f |%n";
		String alignHeader = "| %-32s | %-10s | %-4s | %-15s | %-15s |%n";
		System.out.format(alignHeader, "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		System.out.println("=================================================================================================");
		for (int i = 0; i < danhSach.size(); i++) {
			Vehicle v = danhSach.get(i);
			System.out.format(alignFormat, v.getOwner(), v.getType(), v.getCapacity(), v.getCost(), v.getTax());
		}
		sc.nextLine();
	}
}
