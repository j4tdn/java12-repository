package ex03;

import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        List<Card<String>> deck = CardUtils.createDeck();

        CardUtils.shuffle(deck);

        List<Player> players = CardUtils.distribute(deck);

        players.forEach(System.out::println);
    }
}
