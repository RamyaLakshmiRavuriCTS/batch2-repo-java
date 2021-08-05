package Assignment35;

import java.util.*;
import java.util.stream.Collectors;

public class Card {
    private String symbol;
    private int number;
    private static Map<String, List<Card>> cardsMap = new HashMap<>();

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
    public String toString() {
        return this.symbol + " " + this.number;
    }

    public static void addCard(Card card) {
        if (!cardsMap.containsKey(card.getSymbol())) {
            cardsMap.put(card.getSymbol(), new ArrayList<>());
        }
        cardsMap.get(card.getSymbol()).add(card);
    }

    public static void displayCardsData() {
        System.out.println("Distinct Symbols are :");
        String distinctSymbols = cardsMap.keySet().stream().sorted().collect(Collectors.joining(" "));
        System.out.println(distinctSymbols);
        for (String k : cardsMap.keySet().stream().sorted().collect(Collectors.toList())) {
            System.out.println("Cards in " + k + " Symbol");
            List<Card> list = cardsMap.get(k);
            list.forEach(System.out::println);

            System.out.println("Number of cards : " + list.size());

            int sumOfNumbers = list.stream().mapToInt(Card::getNumber).sum();
            System.out.println("Sum of Numbers : " + sumOfNumbers);
        }
    }
}
