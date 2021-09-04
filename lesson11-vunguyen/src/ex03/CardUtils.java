package ex03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class CardUtils {
    private CardUtils() {
    }

    public static List<Card<String>> createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8" ,"9" ,"10", "J", "Q", "K", "A"};
        Card.Suit[] suits = Card.Suit.values();

        List<Card<String>> deck = new ArrayList<>();

        for (String rank : ranks) {
            for (Card.Suit suit : suits) {
                deck.add(new Card<>(suit, rank));
            }
        }

        return deck;
    }

    public static void shuffle(List<Card<String>> deck) {
        Collections.shuffle(deck);
    }

    public static List<Player> distribute(List<Card<String>> deck) {
        int count = 0;
        List<Player> players = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            Player player = new Player();
            List<Card<String>> cards = new ArrayList<>();

            for (int j = 0; j < 13; j++) {
                cards.add(deck.get(count));
                count++;
            }
            player.setCards(cards);
            players.add(player);

        }

        return players;
    }
}
