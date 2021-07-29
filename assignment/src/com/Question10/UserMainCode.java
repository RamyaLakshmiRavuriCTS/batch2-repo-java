package Question10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserMainCode {

    public static List<Integer> performSetOperations(List<Integer> list1, List<Integer> list2, String operationType) {
        List<Integer> modifiedList = new ArrayList<>();
        switch (operationType) {
            case "+":
                Set<Integer> elimanteCommon = new HashSet<>();
                elimanteCommon.addAll(list1);
                elimanteCommon.addAll(list2);
                modifiedList.addAll(elimanteCommon);
                break;
            case "*":
                for (Integer number : list1) {
                    if (list2.contains(number)) {
                        modifiedList.add(number);
                    }
                }
                break;
            case "-":
                for (Integer number : list1) {
                    if (!list2.contains(number)) {
                        modifiedList.add(number);
                    }
                }
                break;
        }
        return modifiedList;
    }
}