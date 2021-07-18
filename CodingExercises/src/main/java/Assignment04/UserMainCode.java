package Assignment04;

import java.util.ArrayList;
import java.util.List;

public class UserMainCode {

    public static List<Integer> generateOddEvenList(List<Integer> list1, List<Integer> list2) {
        int len = list1.size();
        ArrayList<Integer> evenOddList = new ArrayList<>(len);

        for (int i = 0; i < len; i++) {
            if ( i % 2 == 0) {
                evenOddList.add(list2.get(i));
            } else {
                evenOddList.add(list1.get(i));
            }
        }
        return evenOddList;
    }
}
