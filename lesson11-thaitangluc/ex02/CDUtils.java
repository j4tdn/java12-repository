package ex02;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CDUtils {
	private static final Scanner ip = new Scanner(System.in);
	private CDUtils() {
		
	}
	
	public static void menu(List<CD> lists) {
		
        int selection = 0;
        do {
        	System.out.println("1. Add CD");
            System.out.println("2. Show number of CDs");
            System.out.println("3. Show total price of CDs");
            System.out.println("4. Sort CDs in descending order by price");
            System.out.println("5. Sort CDs in ascending order by type");
            System.out.println("6. Exit");
        	selection = ip.nextInt();
            switch (selection) {
                case 1:
                    add(lists);
                    break;
                case 2:
                    countCD(lists);
                    break;
                case 3:
                    sumOfCost(lists);
                    break;
                case 4:
                    sortCost(lists);
                    break;
                case 5:
                    sortType(lists);
                    break;
            }
        } while (selection != 6);
	}
	
	public static void add(List<CD> lists) {
		int id = ip.nextInt();
		String type = ip.next();
		String singer = ip.next();
		int numOfSong = ip.nextInt();
		double cost = ip.nextDouble();
		CD cd = new CD(id, type, singer, numOfSong, cost);
		if(lists.contains(cd)) {
			System.out.println("Add unsuccessful !!");
		} else {
			lists.add(cd);
			System.out.println("Add successfull !!");
		}
	}
	
	public static void countCD(List<CD> lists) {
		System.out.println("Number of CD: " + lists.size());
	}
	
	public static void sumOfCost(List<CD> lists) {
		System.out.println("Total price: " + lists.stream()
		  									      .map(CD::getCost)
		  									      .reduce(Double::sum).get());
	}
	
	public static void sortCost(List<CD> lists) {
		lists.sort(Comparator.comparingDouble(CD::getCost));
		printf(lists);
	}
	
	public static void sortType(List<CD> lists) {
		lists.sort(Comparator.comparing(CD::getType));
		printf(lists);
	}
	
	public static void printf(List<CD> lists) {
		for(CD cd: lists) {
			System.out.println(cd);
		}
	}
}
