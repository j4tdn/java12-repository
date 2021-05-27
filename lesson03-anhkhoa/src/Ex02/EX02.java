package Ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class EX02 {
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<Vehicle> list = new ArrayList<Vehicle>();
	public static boolean checkk =false;
	public static void main(String[] args) {
		System.out.println("===============================");
		System.out.println("1. Nhap Thong Tin");
		System.out.println("2. Xuat Bang Ke Khai Tien Thue Cac Loai Xe");
		System.out.println("3. Thoat");
		int choose = Integer.parseInt(sc.nextLine());
		do
		{
			Choose(choose);
			System.out.println("===============================");
			System.out.println("1. Nhap Thong Tin");
			System.out.println("2. Xuat Bang Ke Khai Tien Thue Cac Loai Xe");
			System.out.println("3. Thoat");
			choose = Integer.parseInt(sc.nextLine());
		}while (!checkk);
	
	}

	public static void Choose(int choose) {

		switch (choose) {
		case 1:
			for (int i = 0; i < 3; i++) {
				System.out.println("Nhap Xe thu " + (i + 1));
				Choose1();
			}
			break;
		case 2:
			if (list.isEmpty()) {
				System.out.println("Khong co gi de xuat, vui long nhap thong tin xe o buoc 1");
			} else {
				export();
			}
			break;
		case 3:
			System.out.println("Kết thúc chương trình");
			checkk=false;
			System.exit(0);
		default:
			System.out.println("vui long chon dung");
			break;
		}
	}

	public static void Choose1() {
		System.out.println("Vui long nhap ten chu xe");
		String a = sc.nextLine();
		System.out.println("VUi long nhap loai xe");
		String b = sc.nextLine();
		System.out.println("VUi long nhap dung tich");
		int c = Integer.parseInt(sc.nextLine());
		System.out.println("VUi long nhap gia tri xe");
		long d = Long.parseLong(sc.nextLine());
		Vehicle a1 = new Vehicle(a, b, c, d);
		
		list.add(a1);
	}

	public static void export() {
		System.out.println("Tên chủ xe" + "\t" + "Loại xe" + "\t" + "Dung tich" + "\t" + "Trị giá" + "\t" + "Thuế phải nộp");
		System.out.println("=====================================================================================");
		for(var item :list)
		{
			System.out.println(item.toString()+"\n");
		}
	}
}
