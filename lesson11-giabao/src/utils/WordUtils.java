package utils;

import java.util.Arrays;
import java.util.List;

import bean.Word;

public class WordUtils {
	private WordUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<Word> getAllWords(){
		return Arrays.asList(
				new Word("apple", "quả táo", "danh từ", "tên loại trái cây"),
				new Word("different", "khác nhau", "tính từ", "mô tả"),
				new Word("various", "khác nhau", "tính từ", "mô tả"),
				new Word("lovely", "dễ thương", "tính từ", "mô tả"),
				new Word("Silly", "ngớ ngẩn", "tính từ", "mô tả"),
				new Word("Silly", "khùng điên", "tính từ", "mô tả")
				);
				
	}
	public static void printf(List<Word> words) {
		for( Word word: words) {
			System.out.println(word);
		}
	}
}
