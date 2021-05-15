package BaiTapjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex04 {
	public static ArrayList<Integer> list = new ArrayList<Integer>();
	public static Scanner scanner = new Scanner(System.in);

	public static void CheckSoLe(Integer x) {
		if (x % 2 != 0)
			list.add(x);
	}

	public static void main(String[] args) {
		Integer n = Integer.parseInt(scanner.nextLine());
		for (Integer i = 0; i < n; i++) {
			Integer m = Integer.parseInt(scanner.nextLine());
			CheckSoLe(m);
		}
		Collections.sort(list);
		System.out.println(list.get(list.size() - 1));
	}
}
