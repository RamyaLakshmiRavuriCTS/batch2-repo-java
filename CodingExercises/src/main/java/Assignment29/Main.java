package Assignment29;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfCards = 0;
        while (Card.setOfCards.size() < 4) {
            System.out.println("Enter a card :");
            String symbol = scanner.nextLine();
            int number = Integer.parseInt(scanner.nextLine());

            Card card = new Card(symbol, number);
            Card.setOfCards.add(card);
            noOfCards++;
        }
        System.out.println("Four symbols gathered in " + noOfCards + " cards.");
        Card.displayCardsInSet();
    }
}
