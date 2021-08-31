package Ex02;

import java.util.Scanner;

public class App {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s = sc.nextLine();
		System.out.println(printf(s));
	}

	private static String printf(String s) {
		String rs = "";
		String[] list = s.split("\\s+");
		for (String item : list) {
			if (!(item.matches(".*[a-zA-Z]")))
				return "từ không thỏa mãn";
		}

		for (String item : list) {

			String begin = item.substring(0, 1);
			String end = item.substring(1, item.length());
			String temp = begin.toUpperCase() + end.toLowerCase();
			rs += temp + " ";
		}
		return rs;
	}
}
