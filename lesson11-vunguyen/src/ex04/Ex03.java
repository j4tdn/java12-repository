package ex04;

import java.util.HashMap;
import java.util.Map;

public class Ex03 {
    public static void main(String[] args) {
        Map<String, Word> words = new HashMap<>();
        words.put("hello", new Word("hello", "xin chao", "verb", ""));
        words.put("number", new Word("number", "so", "noun", ""));

        Dictionary dictionary = new Dictionary(words);
        Word word = new Word("computer", "may tinh", "noun", "");
        dictionary.add(word);
        Word searchWord = dictionary.search("computer");
        dictionary.printf();
    }
}
