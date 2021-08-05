package Assignment29;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Card {
    private String symbol;
    private int number;
    public static Set<Card> setOfCards = new HashSet<>();

    public Card() {
    }

    public Card(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return symbol.equals(card.symbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol);
    }

    @Override
    public String toString() {
        return this.symbol + " " + this.number;
    }

    public static void displayCardsInSet() {
        System.out.println("Cards in Set are :");
        Card.setOfCards.stream().sorted(Comparator.comparing(Card::getSymbol)).forEach(System.out::println);
    }
}
