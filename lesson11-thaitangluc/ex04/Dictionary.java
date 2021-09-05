package ex04;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private final Map<String, Word> words;

    public Dictionary() {
        words = new HashMap<>();
    }

    public Dictionary(Map<String, Word> words) {
        this.words = words;
    }

    public void add(Word word) {
        words.put(word.getWord(), word);
    }

    public Word search(String word) {
        return words.get(word);
    }

    public void printf() {
        words.values().forEach(System.out::println);
    }
}
