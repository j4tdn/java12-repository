package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bean.Word;
import utils.WordUtils;

public class Ex04 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List<Word> dictionary = WordUtils.getAllWords();

		int choose;
		do {
			System.out.println("================MENU CỦA GIA BẢO============");
			System.out.println("1.Thêm 1 từ mới vào từ điển.");
			System.out.println("2.Tra từ điển.");
			System.out.println("3.In ra từ điển.");
			System.out.println("4.Thoát.");
			System.out.println("=============================================");
			System.out.print("Mời nhập lựa chọn: ");
			choose = Integer.parseInt(sc.nextLine());
			switch (choose) {
			case 1:
				System.out.print("Nhập vào từ: ");
				String word = sc.nextLine();
				System.out.print("Nhập vào nghĩa: ");
				String mean = sc.nextLine();
				System.out.print("Nhập vào loại từ");
				String type = sc.nextLine();
				System.out.println("Nhập ghi chú: ");
				String note = sc.nextLine();
				Word a = new Word(word, mean, type, note);
				if (addWord(a, dictionary)) {
					System.out.println("Thêm thành công!");
				} else {
					System.out.println("Đã tồn tại từ này");
				}
				break;
			case 2:
				System.out.print("Nhập vào từ cần tra cứu: "); String s= sc.nextLine();
				System.out.println("========Có phải đây là từ bạn cần tìm? ====");
				WordUtils.printf(searchWord(s, dictionary));
				break;
			case 3:
				WordUtils.printf(dictionary);
				break;
			default:
				break;
			}
		} while (choose != 4);
	}
	private static List<Word> searchWord(String s, List<Word> dic){
		List<Word> rs = new ArrayList<>();
		for(Word word: dic) {
			if(s.toLowerCase().equals(word.getWord().toLowerCase())) {
				rs.add(word);
			}
		}
		return rs;
	}

	private static boolean addWord(Word w, List<Word> dic) {
		if (!isContains(w, dic)) {
			dic.add(w);
			return true;
		}
		return false;
	}

	private static boolean isContains(Word w, List<Word> dic) {
		for (Word word : dic) {
			if (word.getWord().toLowerCase().equals(w.getWord().toLowerCase())
					&& (word.getMean().toLowerCase().equals((w.getMean().toLowerCase()))))
				return true;
		}
		return false;
	}
}
