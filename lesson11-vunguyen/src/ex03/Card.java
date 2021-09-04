package ex03;

public class Card<T> {
    public enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }

    private Suit suit;
    private T rank;

    public Card() {
    }

    public Card(Suit suit, T rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public T getRank() {
        return rank;
    }

    public void setRank(T rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
