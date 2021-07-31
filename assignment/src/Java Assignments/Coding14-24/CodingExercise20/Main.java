import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//main class
public class Main {
    //main method
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        Map<Integer,String> personMap=new HashMap<>();
        for(int i=0;i<size;i++){
            personMap.put(scanner.nextInt(),scanner.next());
        }
        System.out.println(getMaxKeyValue(personMap));
    }
    public static String getMaxKeyValue(Map<Integer,String> personMap){
        String maxKeyValue=null;
        int max=0;
        for(Map.Entry<Integer,String> person:personMap.entrySet()){
            if(person.getKey()>max){
                max=person.getKey();
                maxKeyValue=person.getValue();
            }
        }
        return maxKeyValue;
    }
}