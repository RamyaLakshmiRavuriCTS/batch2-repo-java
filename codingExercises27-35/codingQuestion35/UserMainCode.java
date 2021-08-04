import java.util.*;

public class UserMainCode {
    private static Map<String, List<Integer>> cardMap=new HashMap<>();

    public static void insert(Card card){
        if (!cardMap.containsKey(card.getSymbol())) {
            cardMap.put(card.getSymbol(), new ArrayList<>());
        }
        cardMap.get(card.getSymbol()).add(card.getNumber());
    }

    public static void display(){
        Map<String, List<Integer>> sortedMap = new TreeMap<>(cardMap);
        System.out.println("Distinct Symbols are :");
        for(String string:sortedMap.keySet()){
            System.out.print(string+" ");
        }
        System.out.println();
        for(String string:sortedMap.keySet()) {
            for (Map.Entry<String, List<Integer>> map : sortedMap.entrySet()) {
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
