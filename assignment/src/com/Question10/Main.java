package Question10;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        Set<Integer> list = new LinkedHashSet<>();
        list.addAll(list1);
        list1.clear();
        list1.addAll(list);

        String operation = scanner.next();
            List<Integer> result = UserMainCode.performSetOperations(list1, list2, operation);
            for (Integer numbers : result) {
                System.out.println(numbers);
            }
        }
    }
