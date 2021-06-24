package BT4;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	
	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<People> listHumanResouces = new ArrayList<People>();

	public static void main(String[] args) {
		menu();
	}
	private static void input(People p) {
		
			System.out.println("----------------nhap thong tin-------------");
			System.out.print("Ho Ten: ");
			p.setHoTen(scanner.nextLine());
			System.out.print("Nam Sinh: ");
			p.setNS(scanner.nextInt());
			scanner.nextLine();
			System.out.print("He So Luong: ");
			p.setHeSoLuong(Double.parseDouble(scanner.nextLine()));

//			listHumanResouces.add(new People(Hoten, NamSinh, HeSoLuong));
			
	}
	
	public static void inputGD(GiamDoc gd) {
		input(gd);
		System.out.print("He so chuc vu: ");
		gd.setHeSoChucVu(scanner.nextFloat());
		scanner.nextLine();
	}
	
	public static void inputTP(TruongPhong tp) {
		input(tp);
		System.out.print("So luong nhan vien quan ly: ");
		tp.setSoLuongNVQuanLy(scanner.nextInt());
		scanner.nextLine();
	}
	
	public static void inputNV(NhanVien nv) {
		input(nv);
		System.out.print("Ten don vi: ");
		nv.setTenDonVi(scanner.nextLine());
	}

	private static void output() {
		if (listHumanResouces.size() == 0) {
			System.out.println("list empty");
			scanner.nextLine();
			return;
		}
		String alignFormat = "| %-25s | %-10s |%n";
		String alignHeader = "| %-25s | %-10s |%n";
		System.out.format(alignHeader, "Ho Ten", "Nam Sinh");
		System.out.println("=================================================================================================");
		for (int i = 0; i < listHumanResouces.size(); i++) {
			People p = listHumanResouces.get(i);
			System.out.format(alignFormat, p.getHoTen(), p.getNS());
		}
		scanner.nextLine();
	}
	private static void CalSalary() {
		if (listHumanResouces.size() == 0) {
			System.out.println("list empty");
			scanner.nextLine();
			return;
		}
		String alignFormat = "| %-25s %n";
		String alignHeader = "| %-25s %n";
		System.out.format(alignHeader,"Bang Luong");
		System.out.println("=================================================================================================");
		for (int i = 0; i < listHumanResouces.size(); i++) {
			People p = listHumanResouces.get(i);
			System.out.format(alignFormat, p.toString());
		}
		
		scanner.nextLine();
	}
	private static void menu() {
		int choose = 0;
		do {
			System.out.println("-----------Menu------------");
			System.out.println("1. Nhap thong tin giam doc");
			System.out.println("2. Nhap thong tin truong phong");
			System.out.println("3. Nhap thong tin nhan vien");
			System.out.println("4. Hien thi thong tin");
			System.out.println("5. Hien thi Bang Luong");
			System.out.println("6. Thoat ");

			do {
				System.out.print("nhap lua chon : ");
				choose = Integer.parseInt(scanner.nextLine());
				switch (choose) {
				case 1:
					GiamDoc gd = new GiamDoc();
					inputGD(gd);
					listHumanResouces.add(gd);
					break;
				case 2:
					TruongPhong tp = new TruongPhong();
					inputTP(tp);
					listHumanResouces.add(tp);
					break;
				case 3:
					NhanVien nv = new NhanVien();
					inputNV(nv);
					listHumanResouces.add(nv);
					break;
				case 4:
					output();
					break;
				case 5:
					CalSalary();
					break;
				case 6:
					System.out.println("Exit done...");
					return;
				default:
					break;
				}
			} while (choose != 1 && choose != 2 && choose != 3 && choose != 4);

		} while (true);

	}

}
