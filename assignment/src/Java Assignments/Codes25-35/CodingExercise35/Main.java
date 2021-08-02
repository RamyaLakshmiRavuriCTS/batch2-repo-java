import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number of Cards :");
        int size=scanner.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("Enter card "+(i+1));
            Card card=new Card(scanner.next(),scanner.nextInt());
            insert(card);
        }
        display();
    }
    private static Map<String, List<Integer>> cardMap=new HashMap<>();

    public static void insert(Card card){
        if (!cardMap.containsKey(card.getSymbol())) {
            cardMap.put(card.getSymbol(), new ArrayList<>());
        }
        cardMap.get(card.getSymbol()).add(card.getNumber());
    }

    public static void display(){
        System.out.println("Distinct Symbols are :");
        for(String string:cardMap.keySet()){
            System.out.println(string+" ");
        }

        for(String string:cardMap.keySet()) {
            for (Map.Entry<String, List<Integer>> map : cardMap.entrySet()) {
                if(map.getKey().equals(string)){
                    System.out.println("Cards in "+map.getKey()+" Symbol");
                    int sum=0;
                    for(Integer integer:map.getValue()){
                        System.out.println(map.getKey()+" "+integer);
                        sum+=integer;
                    }
                    System.out.println("Number of cards :"+map.getValue().size());
                    System.out.println("Sum of Numbers :"+sum);
                }
            }
        }
    }
}