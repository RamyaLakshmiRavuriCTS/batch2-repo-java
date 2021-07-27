import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of ArrayList");
        int size = sc.nextInt();
        System.out.println("Enter elements into list1 and list2");
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 2 * size; i++) {
            if (i < size) {
                list1.add(sc.nextInt());
            } else {
                list2.add(sc.nextInt());
            }
        }
        System.out.println("Enter set operation ");
        String operation = sc.next();
        List<Integer> result = UserMainCode.performSetOperations(list1, list2, operation);
        for (Integer number : result) {
            System.out.println(number);
        }
    }
}