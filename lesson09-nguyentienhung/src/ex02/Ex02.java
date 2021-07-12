package ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ex02 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int n = 0;
		System.out.println("Nhập chuỗi số lượng xâu chuỗi:");
		n = Integer.parseInt(input.nextLine());
		String[] texts = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập xâu thứ " + (i + 1) + ":");
			texts[i] = input.nextLine();
		}
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(String item : texts) {
			list.add(check(item));
		}
		list.sort((o1, o2) -> o1 - o2);
		System.out.println("Result: ");
		for(Integer item : list) {
			System.out.println(item);
		}
	}

	public static int check(String text) {
		int max = 0;
		String[] numbers = text.split("\\D+");
		for (String number : numbers) {
			if (!number.isEmpty()) {
				if (max < Integer.parseInt(number))
					max = Integer.parseInt(number);
			}
		}
		return max;
	}
}
