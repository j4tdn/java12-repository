package ex04;

import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Dictionary {
	private final Map<String, Word> words;
	private static final Scanner ip = new Scanner(System.in);

	public Dictionary() {
		words = new TreeMap<>();
	}

	public Dictionary(Map<String, Word> words) {
		this.words = words;
	}

	public void add() {
		String word = ip.next();
		String means = ip.next();
		String type = ip.next();
		String note = ip.next();
		Word wordAdd = new Word(word, means, type, note);
		words.put(wordAdd.getWord(), wordAdd);
	}

	public void search(String word) {
		word=word.toLowerCase();
		Set<Entry<String, Word>> entrySet = words.entrySet();
		
		for (Entry<String, Word> entry: entrySet) {
			if(entry.getKey().equals(word)) {
				System.out.println(entry.getValue());
				break;
			}
		}
	}

	public void printf() {
		Set<Entry<String, Word>> entrySet = words.entrySet();
		
		for (Entry<String, Word> entry: entrySet) {
			System.out.println(entry.getValue());
		}
	}

}
