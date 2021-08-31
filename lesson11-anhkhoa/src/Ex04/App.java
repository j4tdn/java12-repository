package Ex04;

import java.util.Scanner;

public class App {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String wordcheck = sc.nextLine();
		wordEnglish w = new wordEnglish("khoa", "dep trai", "hoc sinh", " ");
		dictionary dic = new dictionary();
		dic.add(w);
		System.out.println(check(wordcheck, dic));
	}

	private static wordEnglish check(String word, dictionary dic) {
		return dic.search(word);
	}

}
