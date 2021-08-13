package collection.baitap4;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Dictionary {	
	public Map<String, Word> dictionary = null;
	
	public Dictionary() {
		dictionary = new TreeMap<>();
	}
	
	public void add(Word newWord) {
		dictionary.put(newWord.getWord().toLowerCase(), newWord);
	}
	
	public Word search(String word) {
		return dictionary.get(word);
	}
	
	public void show() {
		for(Entry<String, Word> entry : dictionary.entrySet()) {
			System.out.println(entry);
		}
	}
}
