import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the input:");
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
        String operation = scanner.next();
        List<Integer> output = UserMainCode.performSetOperations(list, list1, operation);
        for (Integer number : output) {
            System.out.println(number);
        }
    }
}
