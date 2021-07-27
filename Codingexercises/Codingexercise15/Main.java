package Employeebonus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//main class
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        Map<Integer,String> dobMap=new HashMap<>();
        Map<Integer,Integer> salaryMap=new HashMap<>();
        for(int i=0;i<size;i++){
            int id=sc.nextInt();
            dobMap.put(id,sc.next());
            salaryMap.put(id,sc.nextInt());
        }
        Map<Integer,Integer> result=UserMainCode.calculateRevisedSalary(dobMap,salaryMap);
        for(Map.Entry<Integer,Integer> map:result.entrySet()){
            System.out.println(map.getKey());
            System.out.println(map.getValue());
        }
    }
}
