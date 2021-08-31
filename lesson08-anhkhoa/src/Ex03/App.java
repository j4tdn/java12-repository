package Ex03;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
	private static String replace(String s) {

		String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pattern.matcher(temp).replaceAll("");
	}

	private static String rs(String s) {
		String rs = "";
		String[] list = s.split("\\s+");
		for (String item : list) {
			rs += replace(item) + " ";
		}
		return rs;
	}

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s = sc.nextLine();
		System.out.println(rs(s));
	}
}
