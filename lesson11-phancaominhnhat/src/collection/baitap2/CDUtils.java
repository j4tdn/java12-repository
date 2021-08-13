package collection.baitap2;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CDUtils {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void menu(List<DiskCD> listCDs) {
		System.out.println("---------------------------------------Menu--------------------------------------");
		System.out.println("1. Thêm một đĩa CD vào danh sách");
		System.out.println("2. Xem số lượng đĩa CD đang có trong danh sách");
		System.out.println("3. Tính tổng giá thành của các CD");
		System.out.println("4. Sắp xếp danh sách giảm dần theo giá thành");
		System.out.println("5. Sắp xếp danh sách tăng dần theo tựa CD");
		System.out.println("6. Kết thúc chương trình");
		System.out.print("Nhập lựa chọn của bạn: ");
		
		while (true) {
			switch (scanner.nextInt()) {
				case 1: {
					add(listCDs);
					break;
				}
				case 2: {
					count(listCDs);
					break;
				}
				case 3: {
					calculateTotalCostCD(listCDs);
					break;
				}
				case 4: {
					sortCDDescendingByPrice(listCDs);
					System.out.println("Sorted !!!");
					break;
				}
				case 5: {
					sortCDAscendingByTitle(listCDs);
					System.out.println("Sorted !!!");
					break;
				}
				case 6: {
					System.out.println("See you later !!!");
					System.exit(0);
				}
			}
			CDUtils.menu(listCDs);
		}
	}
	
	// Thêm CD vào danh sách 
	public static void add(List<DiskCD> listCDs) {
		DiskCD diskCD = new DiskCD();
		while(true) {
			try {
				System.out.print("Nhập mã CD: ");
				diskCD.setCodeCD(scanner.nextInt());
				System.out.print("Nhập loại CD: ");
				scanner.nextLine();
				diskCD.setTypeCD(scanner.nextLine());
				System.out.print("Nhập tên ca sỹ: ");
				diskCD.setSinger(scanner.nextLine());
				System.out.print("Nhập số bài hát: ");
				diskCD.setAmountSong(scanner.nextInt());
				System.out.print("Nhập giá thành: ");
				diskCD.setCostCD(scanner.nextInt());
				listCDs.add(diskCD);
				break;
			} catch (Exception e) {
				System.out.println("Input wrong. Please try again !");
				scanner.nextLine();
			}
		}
	}

	// Đếm số lượng CD đang có
	public static void count(List<DiskCD> listCDs) {
		System.out.println("Số lượng CD đang có trong danh sách là: " + listCDs.size());
		for(DiskCD diskCD: listCDs) {
			System.out.println(diskCD);
		}
	}
	
	// Tính tổng giá thành của các CD
	public static void calculateTotalCostCD(List<DiskCD> listCDs) {
		float totalCostCD = 0;
		
		for (DiskCD diskCD : listCDs) {
			totalCostCD += diskCD.getCostCD();
		}
		
		System.out.println("Tổng giá thành CD là: " + totalCostCD);
	}

	public static List<DiskCD> sortCDDescendingByPrice(List<DiskCD> listCDs) {
		Comparator<DiskCD> comparator = new Comparator<DiskCD>() {
			@Override
			public int compare(DiskCD o1, DiskCD o2) {
				if(o1.getCostCD() < o2.getCostCD()) {
					return 1;
				}
				if (o1.getCostCD() > o2.getCodeCD()) {
					return -1;
				}
				return 0;
			}
		};
		listCDs.sort(comparator);
		return listCDs;
	}

	public static List<DiskCD> sortCDAscendingByTitle(List<DiskCD> listCDs) {
		listCDs.sort((d1,d2) -> d1.getTypeCD().compareTo(d2.getTypeCD()));
		return listCDs;
	}
}
