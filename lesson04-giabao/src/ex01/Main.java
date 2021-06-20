package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static List<SinhVien> list = new ArrayList<SinhVien>();
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(102190252, "Đinh Gia Bảo", 9, 8);
		SinhVien sv2 = new SinhVien(102190220, "Lê Gia Anh Khoa", 9, 10);
		list.add(sv1);
		list.add(sv2);
		nhap();
		xuat();
	}
	public static void nhap() {
		SinhVien sv3= new SinhVien();
		System.out.println("Nhập thông tin một sinh viên:");
		System.out.print("Nhập vào MSSV: ");
		sv3.setMSSV(Integer.parseInt(sc.nextLine()));
		System.out.print("Nhập vào họ tên sinh viên: ");
		sv3.setHoTen(sc.nextLine());
		System.out.print("Nhập vào điểm LT: ");
		sv3.setDiemLT(Float.parseFloat(sc.nextLine()));
		System.out.print("Nhập vào điểm TH: ");
		sv3.setDiemTH(Float.parseFloat(sc.nextLine()));
		list.add(sv3);
	}
	public static void xuat() {
		System.out.println("=====================DANH SÁCH SINH VIÊN=======================");
		System.out.printf("%-20s %-20s %-15s %-15s %-15s \n","MSSV","Họ Tên","Điểm LT","Điểm TH","Điểm TB");
		for (SinhVien i : list) {
			System.out.printf("%-20s %-20s %-15s %-15s %-15s \n",i.getMSSV(),i.getHoTen(),i.getDiemLT(),i.getDiemTH(),i.diemTB());
		}
	}
}
