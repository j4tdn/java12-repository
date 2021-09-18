package ex03;

import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Card> cards = CardUtils.create();
		System.out.println(cards.size());
		CardUtils.dealCards(cards);
	}
}
