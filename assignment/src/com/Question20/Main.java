package Question20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        Map<Integer,String> personMap=new HashMap<>();
        for(int i=0;i<size;i++){
            personMap.put(scanner.nextInt(),scanner.next());
        }
        System.out.println(UserMainCode.findMaxKeyValue(personMap));
    }

}
