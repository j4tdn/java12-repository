package collection.baitap3;

import java.util.Collections;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Card> deckOfCard = CardUtils.createDeckOfCard();
		Player firstPlayer = new Player(1,"Ajex");
		Player secondPlayer = new Player(2,"John");
		Player thirdPlayer = new Player(3,"Hung");
		Player fourthPlayer = new Player(4,"Donald");
	
		shuffleAndDivide(deckOfCard, firstPlayer, secondPlayer, thirdPlayer, fourthPlayer);
		
		checkCardPlayer(firstPlayer, secondPlayer, thirdPlayer, fourthPlayer);
		
	}
	
	public static void shuffleAndDivide(List<Card> deckOfCard, Player firstPlayer, Player secondPlayer, Player thirdPlayer, Player fourthPlayer) {
		Collections.shuffle(deckOfCard);
		
		for(int i = 0; i < deckOfCard.size(); i+= 4) {
			firstPlayer.getQuarterOfDeck().add(deckOfCard.get(i));
		}
		for(int i = 1; i < deckOfCard.size(); i+= 4) {
			secondPlayer.getQuarterOfDeck().add(deckOfCard.get(i));
		}
		for(int i = 2; i < deckOfCard.size(); i+= 4) {
			thirdPlayer.getQuarterOfDeck().add(deckOfCard.get(i));
		}
		for(int i = 3; i < deckOfCard.size(); i+= 4) {
			fourthPlayer.getQuarterOfDeck().add(deckOfCard.get(i));
		}
	}
	public static void checkCardPlayer(Player firstPlayer, Player secondPlayer, Player thirdPlayer, Player fourthPlayer) {
		System.out.println("----------Cards of first player: ");
		for (Card card: firstPlayer.getQuarterOfDeck()) {
			System.out.println(card);
		}
		System.out.println("---------Cards of second player: ");
		for (Card card: secondPlayer.getQuarterOfDeck()) {
			System.out.println(card);
		}
		System.out.println("---------Cards of third player: ");
		for (Card card: thirdPlayer.getQuarterOfDeck()) {
			System.out.println(card);
		}
		System.out.println("---------Cards of fourth player: ");
		for (Card card: fourthPlayer.getQuarterOfDeck()) {
			System.out.println(card);
		}
	}
}
