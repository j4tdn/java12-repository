package ex03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class CardUtils {
	
	private CardUtils() {
	}
	
	public static List<Card> create() {
		List<Type> type = new ArrayList<>();
		List<Order> order = new ArrayList<>();
		List<Card> cards = new ArrayList<>();
		for(int i = 0; i<4; i++) {
			type.add(Type.values()[i]);
		}
		for(int i = 0; i< 13; i++) {
			order.add(Order.values()[i]);
		}
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<13; j++) {
				Card card = new Card(order.get(j), type.get(i));
				cards.add(card);
			}
		}
		printf(cards);
		return cards;
	}
	
	public static void dealCards(List<Card> cards) {
		List<Card> card1 = new ArrayList<>();
		List<Card> card2 = new ArrayList<>();
		List<Card> card3 = new ArrayList<>();
		List<Card> card4 = new ArrayList<>();
		Random rd = new Random();
		int i = 0;
		int index = 0;
		while(i<52) {
			index = rd.nextInt(cards.size());
			card1.add(cards.get(index));
			cards.remove(index);
			
			index = rd.nextInt(cards.size());
			card2.add(cards.get(index));
			cards.remove(index);
			
			index = rd.nextInt(cards.size());
			card3.add(cards.get(index));
			cards.remove(index);
			
			index = rd.nextInt(cards.size());
			card4.add(cards.get(index));
			cards.remove(index);
			i+=4;
		}
		
		printf(card1);
		System.out.println(card1.size());
		printf(card2);
		System.out.println(card2.size());
		printf(card3);
		System.out.println(card3.size());
		printf(card4);
		System.out.println(card4.size());
	}
	
	public static void printf(List<Card> cards) {
		for(Card card: cards) {
			System.out.print(card + " ");
		}
		System.out.println();
	}
}
