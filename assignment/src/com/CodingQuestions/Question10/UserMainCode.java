import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class UserMainCode {

    public static List<Integer> performSetOperations(List<Integer> list, List<Integer> list1, String operationType) {
        List<Integer> modifiedList = new ArrayList<>();
        switch (operationType) {
            case "+":
                Set<Integer> eliminateCommon = new HashSet<>();
                eliminateCommon.addAll(list);
                eliminateCommon.addAll(list1);
                modifiedList.addAll(eliminateCommon);
                break;
            case "*":
                for (Integer number : list) {
                    if (list1.contains(number)) {
                        modifiedList.add(number);
                    }
                }
                break;
            case "-":
                for (Integer number : list) {
                    if (!list1.contains(number)) {
                        modifiedList.add(number);
                    }
                }
                break;
        }
        return modifiedList;
    }
}
