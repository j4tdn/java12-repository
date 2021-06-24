package BT1;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(111,"Phan Van Hoan",8.5f,9);
		SinhVien sv2 = new SinhVien(112,"Truong Dat",9.5f,8);
		SinhVien sv3 = new SinhVien();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Ma SV: ");
        sv3.setMaSV(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap ten SV: ");
        sv3.setHoTen(sc.nextLine());
        System.out.println("Nhap diem LT: ");
        sv3.setDiemLT(sc.nextFloat());
        System.out.println("Nhap diem TH: ");
        sv3.setDiemTH(sc.nextFloat());
     
        System.out.printf("%7s %12s %20s %10s %10s \n","Ma SV","Ho Ten","Diem LT","Diem TH","Diem TB");

        sv1.inSV();
        sv2.inSV();
        sv3.inSV();
	}
}
