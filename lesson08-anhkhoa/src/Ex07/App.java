package Ex07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s = sc.nextLine();
		String rs = FindShortedString(s);
		System.out.println("Chuoi Lon Nhat: " + FindLongestString(s));
		System.out.println("Vi tri chuoi lon nhat: " + s.indexOf(FindLongestString(s)));
		System.out.println("Chuoi Ngan Nhat: " + FindShortedString(s));
		System.out.println("Vi tri chuoi lon nhat: " + s.indexOf(FindShortedString(s)));
	}

	private static List<String> FindString(String s) {
		List<String> list = new ArrayList<>();
		String rs = "";
		List<String> collect = decay(s);
		for (String item : collect) {
			if (Same(item))
				list.add(item);
		}

		return list;

	}

	private static String FindLongestString(String s) {
		if (s.length() > 255)
			return "loi sai";
		if (!(s.matches(".*[a-zA-Z]")))
			return "loi sai";
		List<String> list = FindString(s);
		String rs = "";
		for (String item : list) {
			if (item.length() > rs.length())
				rs = item;
		}
		return rs;
	}

	private static String FindShortedString(String s) {
		if (s.length() > 255)
			return "loi sai";
		if (!(s.matches(".*[a-zA-Z]")))
			return "loi sai";
		List<String> list = FindString(s);
		List<String> rs = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (i < 1) {
				boolean check = true;
				List<String> a = decay(list.get(i));
				List<String> a1 = decay(list.get(i + 1));
				for (String item : a) {
					if (item.equals(list.get(i + 1)))
						check = false;
				}
				for (String item : a1) {
					if (item.equals(list.get(i)))
						check = false;
				}
				if (check)
					rs.add(list.get(i));
			} else if (i == list.size() - 1) {
				boolean check = true;
				List<String> a = decay(list.get(i));
				List<String> a1 = decay(list.get(i - 1));
				for (String item : a) {
					if (item.equals(list.get(i - 1)))
						check = false;
				}
				for (String item : a1) {
					if (item.equals(list.get(i)))
						check = false;
				}
				if (check)
					rs.add(list.get(i));
			} else {
				boolean check = true;
				List<String> a = decay(list.get(i));
				List<String> a1 = decay(list.get(i + 1));
				List<String> a2 = decay(list.get(i - 1));
				for (String item : a) {
					if (item.equals(list.get(i + 1)))
						check = false;
				}
				for (String item : a1) {
					if (item.equals(list.get(i)))
						check = false;
				}
				for (String item : a) {
					if (item.equals(list.get(i - 1)))
						check = false;
				}
				for (String item : a2) {
					if (item.equals(list.get(i)))
						check = false;
				}
				if (check)
					rs.add(list.get(i));
			}
		}
		String rss = rs.get(0);
		for (String item : rs) {
			if (item.length() < rss.length())
				rss = item;
		}
		return rss;
	}

	private static List<String> decay(String s) {
		List<String> t = new ArrayList<>();
		if (s.length() == 1) {
			t.add(s);
		} else {
			for (int k = 0; k <= s.length(); k++) {
				for (int h = k + 1; h <= s.length(); h++) {
					t.add(s.substring(k, h));
				}
			}
		}
		return t;
	}

	private static boolean Same(String s) {
		int k = 0;
		String rs = s.substring(0, 1);
		for (int i = 0; i < s.length(); i++) {
			if (rs.equals(s.substring(i, i + 1)))
				k++;
		}
		if (k == s.length())
			return true;
		return false;
	}
}
