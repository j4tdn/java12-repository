package exercise04;

import java.util.Scanner;

public class Test {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		GiamDoc gd1 = new GiamDoc();
		TruongPhong tp1 = new TruongPhong();
		NhanVien nv1 = new NhanVien(), nv2 = new NhanVien();
		// Thong Tin Giam doc
		System.out.println("Nhập thông tin giám đốc: ");
		System.out.println("Nhập họ và tên : ");
		gd1.setHoVaTen(input.nextLine());
		System.out.println("Nhập năm sinh : ");
		gd1.setNamSinh(Integer.parseInt(input.nextLine()));
		System.out.println("Nhập hệ số lương : ");
		gd1.setHeSoLuong(Float.parseFloat(input.nextLine()));
		System.out.println("Nhập hệ số chức vụ : ");
		gd1.setHeSoChucVu(Float.parseFloat(input.nextLine()));
		// Thong Tin Truong Phong
		System.out.println("Nhập thông tin trưởng phòng: ");
		System.out.println("Nhập họ và tên : ");
		tp1.setHoVaTen(input.nextLine());
		System.out.println("Nhập năm sinh : ");
		tp1.setNamSinh(Integer.parseInt(input.nextLine()));
		System.out.println("Nhập hệ số lương : ");
		tp1.setHeSoLuong(Float.parseFloat(input.nextLine()));
		System.out.println("Nhập số nhân viên quản lý : ");
		tp1.setSoLuongNhanVien(Integer.parseInt(input.nextLine()));
		/// Thong tin nhan vien 1
		System.out.println("Nhập thông tin nhân viên: ");
		System.out.println("Nhập họ và tên : ");
		nv1.setHoVaTen(input.nextLine());
		System.out.println("Nhập năm sinh : ");
		nv1.setNamSinh(Integer.parseInt(input.nextLine()));
		System.out.println("Nhập hệ số lương : ");
		nv1.setHeSoLuong(Float.parseFloat(input.nextLine()));
		System.out.println("Nhập tên đơn vị : ");
		nv1.setTenDonVi(input.nextLine());
		// Thong tin nhan vien 2
		System.out.println("Nhập thông tin nhân viên: ");
		System.out.println("Nhập họ và tên : ");
		nv2.setHoVaTen(input.nextLine());
		System.out.println("Nhập năm sinh : ");
		nv2.setNamSinh(Integer.parseInt(input.nextLine()));
		System.out.println("Nhập hệ số lương : ");
		nv2.setHeSoLuong(Float.parseFloat(input.nextLine()));
		System.out.println("Nhập tên đơn vị : ");
		nv2.setTenDonVi(input.nextLine());
		System.out.println(gd1);
		System.out.println(tp1);
		System.out.println(nv1);
		System.out.println(nv2);
	}

}
