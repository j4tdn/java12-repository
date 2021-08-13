package collection.baitap3;

import java.util.ArrayList;
import java.util.List;

public class CardUtils {
	public static List<Card> createDeckOfCard() {
		List<Card> deckOfCard = new ArrayList<>();
		
		for (int i = 0; i < 52; i++) {
			Card newCard = new Card();
			
			if(!isExisted(deckOfCard, newCard)) {
				deckOfCard.add(newCard);
			} else {
				i--;
			}
		}
		return deckOfCard;
	}
	
	public static boolean isExisted(List<Card> deckOfCard, Card newCard) {
		for(Card card : deckOfCard) {
			if (newCard.equals(card)) {
				return true;
			}
		}
		return false;
	}
}
