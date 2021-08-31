package Ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(FindSameString(s1, s2));
	}

	private static String FindSameString(String s1, String s2) {
		String rs = "";
		List<String> list = new ArrayList<>();
		if (!(s1.matches(".*[a-zA-Z]")) || !(s2.matches(".*[a-zA-Z]"))) {
			return "Chuoi khong thoa man";
		}
		for (int i = 0; i <=s1.length(); i++) {
			for (int j = i + 1; j <= s1.length() - 1; j++) {
				String s = s1.substring(i, j);
				if (s2.contains(s))
					list.add(s);
			}
		}

		for (String item : list) {
			if (item.length() > rs.length())
				rs = item;
		}
		return rs;
	}
}
