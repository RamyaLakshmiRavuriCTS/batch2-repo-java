package SetOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//main class
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of ArrayList");
        int size = scanner.nextInt();
        System.out.println("Enter elements list1 and list2");
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
        List<Integer> result = UserMainCode.performSetOperations(list1, list2, operation);
        for (Integer number : result) {
            System.out.println(number);
        }
    }
}
