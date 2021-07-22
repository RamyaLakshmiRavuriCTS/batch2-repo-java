package question4;

import java.util.ArrayList;
import java.util.List;

//logic implemented class
public class UserMainCode {

    //add odd index elements in first list and even index elements in second list
    public static List<Integer> generateOddEvenList(List<Integer> list1, List<Integer> list2) {
        List<Integer> oddEvenList = new ArrayList<Integer>();
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                oddEvenList.add(list2.get(i));
            } else {
                oddEvenList.add(list1.get(i));
            }
        }
        return oddEvenList;
    }
}
