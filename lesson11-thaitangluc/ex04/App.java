package ex04;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class App {
	private static final Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		Word w1 = new Word("Hello", "xin chao", "dong tu", "xin chao hoy");
		Word w2 = new Word("Hi", "xin chao", "dong tu", "xin chao hoy");
		Word w3 = new Word("Bye", "tam biet", "dong tu", "tam biet hoy");
		Word w4 = new Word("house", "ngoi nha", "danh tu", "ngoi nha hoy");
		Word w5 = new Word("Big", "to", "tinh tu", "to lam");

		Map<String, Word> words = new TreeMap<>();
		words.put(w1.getWord(), w1);
		words.put(w2.getWord(), w2);
		words.put(w3.getWord(), w3);
		words.put(w4.getWord(), w4);
		words.put(w5.getWord(), w5);
		Dictionary dic = new Dictionary(words);
		int i = 1;
		while (i != 0) {
			System.out.println("=======");
			i = ip.nextInt();
			switch (i) {
			case 1: {
				System.out.println("=======");
				dic.add();
				break;
			}
			case 2: {
				System.out.println("=======");
				String wordSearch = ip.next();
				dic.search(wordSearch);
				break;
			}
			}
		}
	}

}
