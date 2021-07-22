package question4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//main class
public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    //main method
    public static void main(String[] args) {
        int size = SCANNER.nextInt();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 2 * size; i++) {
            if (i < size) {
                list1.add(SCANNER.nextInt());
            } else {
                list2.add(SCANNER.nextInt());
            }
        }

        List<Integer> result = UserMainCode.generateOddEvenList(list1, list2);
        for (Integer number : result) {
            System.out.println(number);
        }
    }
}
