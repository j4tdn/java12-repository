package view;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import bean.CD;
import utils.CDUtils;

public class Ex02 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List<CD> cds = CDUtils.getAll();

		int choose;
		do {
			System.out.println("================MENU CỦA GIA BẢO============");
			System.out.println("1.Thêm 1 CD vào danh sách.");
			System.out.println("2.Tính số lượng CD có trong danh sách.");
			System.out.println("3.Tính tổng giá thành của các CD.");
			System.out.println("4.Sắp xếp danh sách theo giá thành giảm dần");
			System.out.println("5.Sắp xếp danh sách tăng dần theo dựa CD");
			System.out.println("6.Thoát.");
			System.out.println("=============================================");
			System.out.print("Mời nhập lựa chọn: ");
			choose = Integer.parseInt(sc.nextLine());
			switch (choose) {
			case 1:
				CD newCD = new CD(06, "Vpop", "Mỹ Ánh", 1, 120000);
				if (addCD(newCD, cds)) {
					System.out.println("Thêm thành công!");
				} else {
					System.out.println("Đã tồn tại mã cd này");
				}
				;
				break;
			case 2:
				System.out.println("Số lương CD có trong danh sách: " + countCD(cds));
				break;
			case 3:
				System.out.println("Tổng giá thành của các CD: " + sumPriceCds(cds));
				break;
			case 4:
				Comparator<CD> comp = new Comparator<CD>() {
					@Override
					public int compare(CD o1, CD o2) {
						return (int) (o1.getPrice() - o2.getPrice());
					}
				};
				cds.sort(comp);
				CDUtils.printf(cds);
				break;
			case 5:
				Comparator<CD> comp1 = new Comparator<CD>() {

					@Override
					public int compare(CD o1, CD o2) {
						// TODO Auto-generated method stub
						return o1.getCDtype().compareTo(o2.getCDtype());
					}
				};
				cds.sort(comp1);
				CDUtils.printf(cds);
				break;
			case 6:
				break;
			default:
				System.out.println("không có lựa chọn này!!!1");
				break;
			}
		} while (choose != 6);
	}

	private static boolean addCD(CD newCD, List<CD> cds) {
		for (CD cd : cds) {
			if (newCD.equals(cd)) {
				return false;
			}
		}
		cds.add(newCD);
		return true;
	}

	private static int countCD(List<CD> cds) {
		int count = 0;
		for (CD cd : cds) {
			count++;
		}
		return count;
	}

	private static double sumPriceCds(List<CD> cds) {
		double sumprice = 0;
		for (CD cd : cds) {
			sumprice += cd.getPrice();
		}
		return sumprice;
	}

}
