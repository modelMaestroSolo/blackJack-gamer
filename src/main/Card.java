package main;

public class Card {
    Suit suit;
    Rank rank;

    Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return switch (rank) {
            case Rank.JACK -> "J" + "-" + suit;
            case Rank.QUEEN -> "Q" + "-" + suit;
            case Rank.KING -> "K" + "-" + suit;
            case Rank.ACE -> "A" + "-" + suit;
            default -> rank.getRankValue() + "-" + suit;
        };
    }

}