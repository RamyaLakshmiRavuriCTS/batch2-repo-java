import java.util.ArrayList;
import java.util.List;

public class UserMaincode {

    public static List<Integer> generateOddEvenList(List<Integer> l1, List<Integer> l2){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<l1.size();i++){
            if(i%2 !=0){
                list.add(l1.get(i));
            }
            else
                list.add(l2.get(i));
        }
        return list;
    }




    }


