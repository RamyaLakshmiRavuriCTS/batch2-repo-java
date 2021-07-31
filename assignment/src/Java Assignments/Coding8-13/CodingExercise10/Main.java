import java.util.*;

//main class
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 2 * input; i++) {
            if (i < input) {
                list.add(scanner.nextInt());
            } else {
                list1.add(scanner.nextInt());
            }
        }
        Set<Integer> list2 = new LinkedHashSet<>();
        list2.addAll(list);
        list.clear();
        list.addAll(list2);
        String operation = scanner.next();
        List<Integer> output = performSetOperations(list, list1, operation);
        for (Integer numbers : output) {
            System.out.println(numbers);
        }
        }
    public static List<Integer> performSetOperations(List<Integer> list1, List<Integer> list2, String operationType) {
        List<Integer> modifiedList = new ArrayList<>();
        switch (operationType) {
            default:

                System.out.println("Wrong operation Symbol");

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

