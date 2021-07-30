package Largestkey;

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
        System.out.println(UserMainCode.getMaxKeyValue(personMap));
    }

}
