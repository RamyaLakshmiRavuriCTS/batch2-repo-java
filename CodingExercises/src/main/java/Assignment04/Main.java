package Assignment04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>(len);
        ArrayList<Integer> list2 = new ArrayList<>(len);

        for (int i = 0; i < (2 * len); i++) {
            if (i < len) {
                list1.add(i, scanner.nextInt());
            } else {
                list2.add((i - len), scanner.nextInt());
            }
        }

        List<Integer> evenOddList = UserMainCode.generateOddEvenList(list1, list2);
        evenOddList.forEach(x -> System.out.println(x));
    }
}
