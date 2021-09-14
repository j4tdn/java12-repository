package ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) {
		CD cd1 = new CD(1, "nhac", "Anh", 5, 100);
		CD cd2 = new CD(2, "kich", "Lien", 3, 120);
		CD cd3 = new CD(3, "sieu nhan", "Ha", 1, 50);
		CD cd4 = new CD(4, "phim ma", "Anh", 4, 40);
		CD cd5 = new CD(5, "nhac", "Lien", 3, 150);
		CD cd6 = new CD(6, "kich", "Quang", 8, 170);
		
		List<CD> lists = new ArrayList<>(Arrays.asList(cd1, cd2, cd3, cd4, cd5, cd6));
		
		CdUtils.add(lists);
		System.out.println(lists.size());
	}
}
