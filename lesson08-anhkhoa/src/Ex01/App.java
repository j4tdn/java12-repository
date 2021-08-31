package Ex01;

import java.util.Scanner;

public class App {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String string = sc.nextLine();
		// printf1(string);
		printf3(string);
	}

	private static void printf1(String s) {
		int n = s.length();
		for (int i = 0; i < n; i++) {
			System.out.println(s.substring(i, i + 1));
		}
	}

	private static void printf2(String s) {
		String[] list = s.split("\\s+");
		for (var item : list) {
			System.out.println(item);
		}
	}

	private static void printf3(String s) {

		String rs = "";
		String[] list = s.split("\\s+");
		for (int i = list.length - 1; i >= 0; i--) {
			rs += list[i] + " ";
		}
		System.out.println(rs);
	}
}
