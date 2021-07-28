import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of the group of employees");
        int size= sc.nextInt();
        Map<Integer,String> dobMap=new HashMap<>();
        Map<Integer,Integer> salaryMap=new HashMap<>();
        System.out.println("Enter id ,dob and salary of the employees");
        for(int i=0;i<size;i++)
        {
            int id= sc.nextInt();
            dobMap.put(id, sc.next());
            salaryMap.put(id, sc.nextInt());
        }
        Map<Integer,Integer> result=UserMainCode.calculateRevisedSalary(dobMap,salaryMap);
        //The java.util.HashMap.entrySet() method in Java is used to create a
        // set out of the same elements contained in the hash map.
        // It  returns a set view of the hash map
        for(Map.Entry<Integer,Integer> map:result.entrySet())
        {
            System.out.println(map.getKey());
            System.out.println(map.getValue());
        }
    }
}
