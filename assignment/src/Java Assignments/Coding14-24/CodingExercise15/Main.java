import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//main class
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        Map<Integer,String> dobMap=new HashMap<>();
        Map<Integer,Integer> salaryMap=new HashMap<>();
        for(int i=0;i<size;i++){
            int id=scanner.nextInt();
            dobMap.put(id,scanner.next());
            salaryMap.put(id,scanner.nextInt());
        }
        Map<Integer,Integer> result=Details.calculateRevisedSalary(dobMap,salaryMap);
        for(Map.Entry<Integer,Integer> map:result.entrySet()){
            System.out.println(map.getKey());
            System.out.println(map.getValue());
        }
    }
}