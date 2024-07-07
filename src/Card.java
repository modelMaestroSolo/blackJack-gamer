public class Card {
    Suit suit;
    Rank rank;

    Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        if (rank == Rank.JACK)
            return "J" + "-" + suit;
        if (rank == Rank.QUEEN)
            return "Q" + "-" + suit;
        if (rank == Rank.KING)
            return "K" + "-" + suit;
        if (rank == Rank.ACE)
            return "A" + "-" + suit;
        return rank.getRankValue() + "-" + suit;
    }

    public Rank getRank() {
        return rank;
    }
}
