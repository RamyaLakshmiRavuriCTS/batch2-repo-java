import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of hashmap");
        int size= sc.nextInt();

        System.out.println("Enter integer key and string value");
        Map<Integer,String> personMap=new HashMap<>();

        for(int i=0;i<size;i++)
        {
            personMap.put(sc.nextInt(), sc.next());
        }

        System.out.println(UserMainCode.getMaxKeyValue(personMap));
    }

}