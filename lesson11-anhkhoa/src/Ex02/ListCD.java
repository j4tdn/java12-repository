package Ex02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ListCD {
	private static List<CD> data = new ArrayList<CD>();
	private static Scanner sc;

	private ListCD() {

	}

	private static String addCD(CD cd) {

		for (CD item : data) {
			if (item.getId() == cd.getId())
				return "Thêm thất bại";
		}
		data.add(cd);
		return "Thêm thành công";
	}

	private static int size() {
		return data.size();
	}

	private static long ToTalAmountPrice() {
		long rs = 0;
		for (CD item : data) {
			rs += item.getPrice();
		}
		return rs;
	}

	private static void SortDes() {
		data.sort(Comparator.comparing(CD::getPrice, Comparator.reverseOrder()));
		for (var item : data) {
			System.out.println(item);
		}
	}

	private static void Sort() {
		data.sort(Comparator.comparing(CD::getName));
		for (var item : data) {
			System.out.println(item);
		}
	}

	public static void MENU() {
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
				System.out.println(addCD(cd));
				break;
			case 2:
				System.out.println(size());
				break;
			case 3:
				System.out.println(ToTalAmountPrice());
				break;
			case 4:
				if (data.isEmpty())
					System.out.println("Danh sách rỗng");
				else
					SortDes();
				break;
			case 5:
				if (data.isEmpty())
					System.out.println("Danh sách rỗng");
				else
					Sort();
				break;
			case 6:
				check = false;
				break;
			default:
				System.out.println("không có chức năng này");
				break;
			}
		}
	}
}
