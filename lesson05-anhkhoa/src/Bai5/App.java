package Bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	static ArrayList<IBook> books = new ArrayList<IBook>();
	static Scanner sc = new Scanner(System.in);

	public static void input() {
		TextBook s1 = new TextBook("SGK01", 50000, "Nhi Đồng", false);
		TextBook s2 = new TextBook("SGK02", 11000, "Kim Đồng", true);
		TextBook s3 = new TextBook("SGK03", 20000, "Nhi Đồng", false);
		ReferenceBook s4 = new ReferenceBook("STK01", 120000, "Nhi Đồng", 20);
		ReferenceBook s5 = new ReferenceBook("STK02", 13000, "Giáo Dục", 30);

		books.add(s1);
		books.add(s2);
		books.add(s3);
		books.add(s4);
		books.add(s5);
	}

	public static void main(String[] args) {
		input();
		int choose;
		do {
			System.out.println("=====================Menu====================");
			System.out.println("1.In ra các sách của NXB Nhi Đồng.");
			System.out.println("2.In ra sách có đơn giá nhỏ hơn 50. ");
			System.out.println("3.In ra sách có đơn giá từ 100 đến 200.");
			System.out.println("4.Thực hiện mua sách, tính tiền.");
			System.out.println("5.Thoát!");
			System.out.println("=============================================");
			System.out.print("Mời nhập lựa chọn: ");
			choose = Integer.parseInt(sc.nextLine());

			switch (choose) {
			case 1:
				output(sachNhiDong());
				break;
			case 2:
				output(sachDuoi50());
				break;
			case 3:
				output(sach100den200());
				break;
			case 4:
				money(muasach());
				break;
			case 5:
				break;
			default:
				System.out.println("Không có lựa chọn này!");
				break;
			}
		} while (choose != 5);
	}

	public static ArrayList<IBook> muasach() {
		ArrayList<IBook> output = new ArrayList<IBook>();
		System.out.print("Nhập mã SGK: ");
		String sgk = sc.nextLine();
		System.out.print("Nhập mã STK: ");
		String stk = sc.nextLine();
		for (var book : books) {
			if (book.maSach.equals(stk) || book.maSach.equals(sgk)) {
				output.add(book);
			}
		}
		return output;
	}

	public static void money(ArrayList<IBook> input) {
		int money = 0;
		for (IBook book : input) {
			money += book.money();
		}
		System.out.println("Số tiền phải trả là: " + money);
	}

	public static ArrayList<IBook> sach100den200() {
		ArrayList<IBook> output = new ArrayList<IBook>();
		for (IBook book : books) {
			if (book.dongia <= 20000 && book.dongia >= 100000) {
				output.add(book);
			}
		}
		return output;
	}

	public static ArrayList<IBook> sachDuoi50() {
		ArrayList<IBook> output = new ArrayList<IBook>();
		for (IBook book : books) {
			if (book.dongia < 50000) {
				output.add(book);
			}
		}
		return output;
	}

	public static ArrayList<IBook> sachNhiDong() {
		ArrayList<IBook> output = new ArrayList<IBook>();
		for (IBook book : books) {
			if (book.NXB.equals("Nhi Đồng")) {
				output.add(book);
			}
		}
		return output;
	}

	public static void output(ArrayList<IBook> input) {
		System.out.println("Danh sách các sách theo yêu cầu: ");
		for (IBook book : input) {
			System.out.println(book.toString());
		}
	}

}