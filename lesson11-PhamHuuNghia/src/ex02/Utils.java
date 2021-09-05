package ex02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Utils {

	private static List<CD> listCD = new ArrayList<CD>();
	private static Scanner sc;
	
	private static boolean addNew(CD cd) {
		Objects.requireNonNull(cd);
		if(listCD.contains(cd)){
			return false;
		}
		listCD.add(cd);
			return true;
	}
	
//	private static boolean check(int id) {
//		for(CD cd : listCD) {
//			if(id == cd.getId())
//				return true;
//		}
//		return false;
//	}
	
	private static double getSumVal() {
		double sum=0;
		for(CD cd: listCD) {
			sum+=cd.getPrice();
		}
		return sum;
	}
	
	
	public static void menuCase() {
		System.out.println("=============MENU================");
		System.out.println("1.Thêm đĩa CD");
		System.out.println("2.Tính số lượng CD có trong danh sách");
		System.out.println("3.Tình tổng giá thành của các CD");
		System.out.println("4.Phương thức sắp xếp danh sách giảm dần theo giá thành");
		System.out.println("5.Phương thức sắp xếp danh sách tăng dần theo tựa CD");
		System.out.println("6.Kết thúc");
		boolean check = true;
		while (check) {
			System.out.println("Chọn chức năng");
			sc = new Scanner(System.in);
			int n = Integer.parseInt(sc.nextLine());
			switch (n) {
			case 1:
				System.out.println("Nhập ID CD");
				int id = Integer.parseInt(sc.nextLine());
				System.out.println("Nhập Loại CD");
				String name = sc.nextLine();
				System.out.println("Nhập ca sĩ");
				String singer = sc.nextLine();
				System.out.println("Nhập Số bài hát");
				int amount = Integer.parseInt(sc.nextLine());
				System.out.println("Nhập Giá thành");
				double price = Double.parseDouble(sc.nextLine());
				CD cd = new CD(id, name, singer, amount, price);
				String s=(addNew(cd)==false ) ? "them that bai" : "them thanh cong" ;
				System.out.println(s);
				break;
			case 2:
				System.out.println("Danh sach cac CD: ");
				listCD.forEach(System.out::println);
				System.out.println("Number of CD: "+listCD.size());
				break;
			case 3:
				System.out.println("Tong gia cua cac CD: "+ getSumVal());
				break;
			case 4:
				listCD.sort(Comparator.comparing(CD::getPrice).reversed());
				listCD.forEach(System.out::println);
				break;
			case 5:
				listCD.sort(Comparator.comparing(CD::getName));
				listCD.forEach(System.out::println);
				break;
			case 6:
				check=false;
				System.out.println("Ket Thuc");
				break;
			default:
				System.out.println("không có chức năng này");
				break;
			}
		}
	}

}
