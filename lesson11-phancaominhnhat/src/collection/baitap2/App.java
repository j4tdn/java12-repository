package collection.baitap2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		DiskCD firstDisk = new DiskCD(1, "Rock", "John Tommy", 2, 2);
		DiskCD secondDisk = new DiskCD(2, "Folk", "Justin Bidden", 5, 4);
		DiskCD thirdDisk = new DiskCD(3, "Dance", "Selena Mlem", 4, 3);
		
		List<DiskCD> listCDs = new ArrayList<>();
		listCDs.add(firstDisk);
		listCDs.add(secondDisk);
		listCDs.add(thirdDisk);
		
		CDUtils.menu(listCDs);
	}
}
