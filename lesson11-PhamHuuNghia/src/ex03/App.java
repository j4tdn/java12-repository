package ex03;

import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Card> list = Utils.getListCard();
		
		//suffle
		Utils.suffle(list);
		list.forEach(System.out::println);
		
		
	}
}
