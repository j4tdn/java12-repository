package Ex04;

import java.util.ArrayList;
import java.util.List;

public class dictionary {
	private List<wordEnglish> dic;

	public dictionary() {
		dic = new ArrayList<>();
	}

	public boolean add(wordEnglish word) {
		for (wordEnglish item : dic) {
			if (item.equals(word))
				return false;
		}
		dic.add(word);
		return true;
	}

	public wordEnglish search(String word) {
		for (wordEnglish item : dic) {
			if (item.getWord().equals(word))
				return item;
		}
		return null;
	}

}
