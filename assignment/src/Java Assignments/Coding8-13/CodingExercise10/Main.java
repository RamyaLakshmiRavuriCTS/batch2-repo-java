import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
//main class
public class Main {

    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:");
        int size = scanner.nextInt();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 2 * size; i++) {
            if (i < size) {
                list1.add(scanner.nextInt());
            } else {
                list2.add(scanner.nextInt());
            }
        }
        String operation = scanner.next();
        List<Integer> result = performSetOperations(list1, list2, operation);
        for (Integer number : result) {
            System.out.println(number);
        }
    }
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

