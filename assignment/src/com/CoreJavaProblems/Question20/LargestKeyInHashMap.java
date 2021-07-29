import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LargestKeyInHashMap {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter size of hashMap");
        int size=read.nextInt();
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<size;i++)
        {
            int key= read.nextInt();
            read.nextLine();
            String value= read.nextLine();
            map.put(key,value);
        }
        System.out.println(getMaxKeyValue(map));
    }
    public static String getMaxKeyValue(HashMap<Integer,String> map){
        int max=0;
        StringBuilder builder=new StringBuilder();
        for (Map.Entry<Integer, String> set :
                map.entrySet()) {

            if (set.getKey() >max) {
                max= set.getKey();
                builder=new StringBuilder(set.getValue());

            }
        }
        return  String.valueOf(builder);
    }
}
