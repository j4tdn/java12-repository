package ex02;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CdUtils {
	private static final Scanner ip = new Scanner(System.in);
	private CdUtils() {
		
	}
	
	public static void add(List<CD> lists) {
		System.out.println("Them 1 CD");
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
}
