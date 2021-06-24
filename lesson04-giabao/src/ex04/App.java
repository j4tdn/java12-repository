package ex04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	static ArrayList<People> nhansu = new ArrayList<People>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		input();
		int choose;
		do
		{
			System.out.println("=====================Menu====================");
			System.out.println("1.Nhập vào thông tin một nhân viên. ");
			System.out.println("2.Nhập vào thông tin một trưởng phòng. ");
			System.out.println("3.Nhập vào thông tin một giám đốc.");
			System.out.println("4.In ra danh sách nhân sự.");
			System.out.println("5.Tính lương cho nhân sự,");
			System.out.println("6.Thoát!");
			System.out.println("=============================================");
			System.out.print("Mời nhập lựa chọn: ");
			choose = Integer.parseInt(sc.nextLine());
			
			switch (choose) {
			case 1:
				NhanVien s1= new NhanVien();
				InputNvien(s1);
				nhansu.add(s1);
				break;
			case 2:
				TruongPhong s2 = new TruongPhong();
				InputTruongPhong(s2);
				nhansu.add(s2);
				break;
			case 3:
				GiamDoc s3 = new GiamDoc();
				InputGDoc(s3);
				nhansu.add(s3);
				break;
			case 4: 
				System.out.println("=================DANH SÁCH NHÂN VIÊN================");
				for(People people : nhansu) {
					System.out.println(people.toString());
				}
				break;
			case 5: 
				System.out.println("====================BẢNG LƯƠNG=====================");
				System.out.printf("%-15s%-15s\n","Họ tên", "Lương");
				for(People people : nhansu) {
					System.out.printf("%-15s%-15s\n", people.hoten, people.money());
				}
				break;
			case 6:
				break;
			default:
				System.out.println("Không có lựa chọn này!");
				break;
			}
		}
		while (choose!=6);
	}
	public static void InputPeo(People people) {
		System.out.println("Nhập thông tin:");
		System.out.print("Nhập họ tên: "); 
		people.setHoten(sc.nextLine());
		System.out.print("Nhập năm sinh: ");
		people.setNamsinh(sc.nextLine());
		System.out.print("Nhập hệ số lương: ");
		people.setHsluong(Double.parseDouble(sc.nextLine()));
	}
	public static void InputNvien(NhanVien nhanvien) {
		InputPeo(nhanvien);
		System.out.print("Nhập tên đơn vị:");
		nhanvien.setTendonvi(sc.nextLine());
	}
	public static void InputTruongPhong(TruongPhong tp) {
		InputPeo(tp);
		System.out.print("Nhập số lượng nhân viên quản lý:");
		tp.setSlNVquanly(Integer.parseInt(sc.nextLine()));
	}
	public static void InputGDoc(GiamDoc gd) {
		InputPeo(gd);
		System.out.print("Nhập hệ số chức vụ:");
		gd.setHschucvu(Double.parseDouble(sc.nextLine()));
	}
	public static void input() {
		GiamDoc a = new GiamDoc("Gia Bảo", "2001", 2.0, 0.3);
		TruongPhong b = new TruongPhong("Anh Khoa", "2001", 1.8, 13);
		nhansu.add(a);
		nhansu.add(b);
	}
}
