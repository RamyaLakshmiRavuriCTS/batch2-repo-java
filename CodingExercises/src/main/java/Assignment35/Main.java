package Assignment35;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number of Cards :");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter card " + i + " :");
            String symbol = scanner.nextLine();
            int number = Integer.parseInt(scanner.nextLine());

            Card card = new Card(symbol, number);
            Card.addCard(card);
        }

        Card.displayCardsData();
    }
}
