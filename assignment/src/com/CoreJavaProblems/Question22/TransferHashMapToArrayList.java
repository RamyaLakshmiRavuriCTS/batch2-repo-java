import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TransferHashMapToArrayList {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the size of HashMap");
        int size= read.nextInt();
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter id");
            int id= read.nextInt();
            read.nextLine();
            System.out.println("enter String");
            String value= read.nextLine();
            map.put(id,value);
        }
        System.out.println(getName(map));
    }
    public static ArrayList<String> getName(HashMap<Integer,String> map){
        ArrayList<String> arrayList=new ArrayList<>();
        for (Map.Entry<Integer, String> set :
                map.entrySet()) {
            int length= set.getValue().length();
            if(set.getValue().charAt(0)<=122&&set.getValue().charAt(0)>=97)
            if(set.getValue().charAt(length-1)<=90&&set.getValue().charAt(0)>=65)
            if(set.getValue().matches(".*\\d+.*"))
                arrayList.add(set.getValue());

            }
        return arrayList;
        }
    }

