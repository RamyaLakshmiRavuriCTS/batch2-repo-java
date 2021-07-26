package ArrayListManipulation;

import java.util.ArrayList;
import java.util.List;

public class UserMainCode {

    public static List<Integer> generateOddEvenList(List<Integer> list1, List<Integer> list2){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<list1.size();i++){
            if(i%2 !=0){
                list.add(list1.get(i));
            }
            else
                list.add(list2.get(i));
        }
        return list;
    }
}
