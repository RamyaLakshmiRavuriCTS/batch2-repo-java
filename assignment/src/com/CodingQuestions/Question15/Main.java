import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number of employees:");
        int number=scanner.nextInt();
        Map<Integer,String> dobMap=new HashMap<>();
        Map<Integer,Integer> salaryMap =new HashMap<>();
        for(int i=0;i<number;i++){
            int id=scanner.nextInt();
            dobMap.put(id,scanner.next());
            salaryMap.put(id,scanner.nextInt());
        }
        Map<Integer,Integer> output=UserMainCode.calculateRevisedSalary(dobMap, salaryMap);
        for(Map.Entry<Integer,Integer> map:output.entrySet()){
            System.out.println(map.getKey());
            System.out.println(map.getValue());
        }
    }
}