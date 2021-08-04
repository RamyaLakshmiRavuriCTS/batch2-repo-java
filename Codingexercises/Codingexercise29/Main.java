package Uniquesymbols;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Set<Card> cardSet=new HashSet<>();
        while(cardSet.size()!=4){
            System.out.println("Enter a card :");
            Card card=new Card(scanner.next(),scanner.nextInt());
            cardSet.add(card);
        }
        List<Card> cardList=new ArrayList<>(cardSet);
        Collections.sort(cardList);
        for(Card card:cardList){
            System.out.println(card.getSymbol()+" "+card.getNumber());
        }
    }
}