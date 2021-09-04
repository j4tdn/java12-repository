package ex03;

import java.util.List;

public class Player {
    private List<Card<String>> cards;

    public Player() {
    }

    public Player(List<Card<String>> cards) {
        this.cards = cards;
    }

    public List<Card<String>> getCards() {
        return cards;
    }

    public void setCards(List<Card<String>> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Player{" +
                "cards=" + cards +
                '}';
    }
}
