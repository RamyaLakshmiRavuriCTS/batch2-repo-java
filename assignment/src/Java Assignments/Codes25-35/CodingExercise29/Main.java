import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Set<CardDetails> cardSet=new HashSet<>();
        while(cardSet.size()!=4){
            System.out.println("Enter a card :");
            CardDetails card=new CardDetails(scanner.next(),scanner.nextInt());
            cardSet.add(card);
        }
        List<CardDetails> cardList=new ArrayList<>(cardSet);
        Collections.sort(cardList);
        for(CardDetails card:cardList){
            System.out.println(card.getSymbol()+" "+card.getNumber());
        }
    }
}