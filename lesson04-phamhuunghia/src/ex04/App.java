package ex04;

import java.util.Scanner;

public class App {
	private static Scanner sc = new Scanner(System.in);

	enum Position {
		GDoc, NVien, TPhong
	}

	public static void main(String[] args) {
		Person[] persons=null;
		
		int choose;
		do
		{
			System.out.println("=====================Menu====================");
			System.out.println("1.Nhập thông tin nhân sự ");
			System.out.println("2.Xem Thông tin nhân sự ");
			System.out.println("3.Mức lương từng loại nhân sự");
			System.out.println("4.Thoát!");
			System.out.println("=============================================");
			System.out.print("Mời nhập lựa chọn: ");
			choose = Integer.parseInt(sc.nextLine());
			
			switch (choose) {
			case 1:
					persons =employ();
				break;
			case 2:
					if(persons==null) {
						System.out.println("Cty chưa có nhân viên !!!\n"); 
						break;
					}
					else {
						for(Person ps:persons) {
							System.out.println(ps);
						}
					}
				break;
			case 3:
				if(persons==null) {
					System.out.println("Cty chưa có nhân viên !!!\n"); 
					break;
				}
				else {
					for(Person ps:persons) {
						System.out.println(ps.getThongTinLuong());
					}
				}
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Yêu cầu ko hợp lệ");
				break;
			}
		}
		while (choose!=4);
		
	}
	
	private static Person[] employ() {
		System.out.println("\n<Nhap thong tin giam doc: >");
		Person p1 = inputInfor(Position.GDoc);
		System.out.println("\n<Nhap thong tin Truong phong: >");
		Person p2 = inputInfor(Position.TPhong);
		System.out.println("\n<Nhap thong tin nhan vien 1: >");
		Person p3 = inputInfor(Position.NVien);
		System.out.println("\n<Nhap thong tin nhan vien 2: >");
		Person p4 = inputInfor(Position.NVien);
		Person []persons= {p1,p2,p3,p4};
		return persons;
	}
	
	private static Person inputInfor(Position pt) {
		String name;
		int namSinh;
		float hsLuong;
		System.out.println("Tên: ");
		name = sc.nextLine();
		System.out.println("Năm sinh: ");
		namSinh = Integer.parseInt(sc.nextLine());
		System.out.println("Hệ số lương: ");
		hsLuong = Integer.parseInt(sc.nextLine());
		switch (pt) {
		case GDoc: {
			System.out.println("Hệ số chức vụ: ");
			int hsChucVu = Integer.parseInt(sc.nextLine());
			return new GiamDoc(name, namSinh, hsLuong, hsChucVu);
		}
		case TPhong: {
			System.out.println("Số nhân viên quản lý: ");
			int slNVien = Integer.parseInt(sc.nextLine());
			return new TruongPhong(name, namSinh, hsLuong, slNVien);
		}
		default:
			System.out.println("Tên đơn vị:");
			String donVi = sc.nextLine();
			return new NhanVien(name, namSinh, hsLuong, donVi);
		}
	}
	
	private static void getThongTinNhanSu(Person[] employees) {
		for(Person ps: employees) {
			System.out.println(ps);
		}
	}
}
