package Assignment10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        ArrayList<Integer> setA = new ArrayList<>(size);
        ArrayList<Integer> setB = new ArrayList<>(size);

        for (int i = 0; i < (2 * size); i++) {
            if (i < size) {
                setA.add(i, scanner.nextInt());
            } else {
                setB.add((i - size), scanner.nextInt());
            }
        }
        scanner.nextLine();
        char setOperator = scanner.nextLine().charAt(0);

        ArrayList<Integer> result = UserMainCode.performSetOperations(setA, setB, setOperator);
        result.forEach(System.out::println);
    }
}
