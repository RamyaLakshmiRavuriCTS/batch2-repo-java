package Assignment10;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class UserMainCode {

    public static ArrayList<Integer> performSetOperations(ArrayList<Integer> setA, ArrayList<Integer> setB, char setOperator) {

        switch (setOperator) {
            case '+': // set union
                setA.addAll(setB);
                return (ArrayList<Integer>) setA.stream().distinct().collect(Collectors.toList());
            case '*': // set intersection
                return (ArrayList<Integer>) setA.stream().filter(x -> setB.contains(x)).distinct().collect(Collectors.toList());
            case '-':// set difference
                return (ArrayList<Integer>) setA.stream().filter(x -> !setB.contains(x)).distinct().collect(Collectors.toList());
        }
        return null;
    }
}
