package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.Card;
import bean.Card.Type;

public class Ex03 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		List<Card> cards = mockCardsAfterShuffle();
		dealCards(cards);
	}

	@SuppressWarnings("rawtypes")
	private static void dealCards(List<Card> cards) {
		System.out.println(">>>>>>>>>Chia bài<<<<<<<<<");
		List<Card> player1 = new ArrayList<>();
		List<Card> player2 = new ArrayList<>();
		List<Card> player3 = new ArrayList<>();
		List<Card> player4 = new ArrayList<>();
		
		// Tiến hành phát bài theo thứ tự
		for(int i = 0; i< 52;i++) {
			int number = i % 4;
			
			switch (number) {
			case 0:
				player1.add(cards.get(i));
				break;
			case 1:
				player2.add(cards.get(i));
				break;
			case 2:
				player3.add(cards.get(i));
				break;
			case 3:
				player4.add(cards.get(i));
			}
		}
		
		System.out.println("=====Bài player1=====");
		show(player1);
		System.out.println("=====Bài player2=====");
		show(player2);
		System.out.println("=====Bài player3=====");
		show(player3);
		System.out.println("=====Bài player4=====");
		show(player4);
	}

	@SuppressWarnings("rawtypes")
	private static void show(List<Card> cards) {
		cards.forEach(card -> System.out.println(card));
	}

	@SuppressWarnings({ "rawtypes", "unchecked"})
	private static List<Card> mockCardsAfterShuffle() {
		List<Card> cards = new ArrayList<>();
		Card.Type[] types = {Type.Club, Type.Diamond, Type.Heart, Type.Spade};
		int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10};
		String[] anothers = {"J", "Q", "K", "A"};
		// thêm các phần tử bộ bài
		for (Type type : types) {
			for (int number : numbers) {
				cards.add(new Card(type, number));
			}
			
			for (String character : anothers) {
				cards.add(new Card(type, character));
			}
		}
		
		Collections.shuffle(cards);
		return cards;
	}
}