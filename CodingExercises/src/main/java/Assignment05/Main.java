package Assignment05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();

        Map<Integer, Integer> numbers = new HashMap<>(len);
        try {
            for (int i = 0; i < len; i++) {
                int k = scanner.nextInt();
                int v = scanner.nextInt();
                numbers.put(k, v);
            }

            int averageOfOdd = UserMainCode.getAverageOfOdd(numbers);
            System.out.println(averageOfOdd);

        } catch (Exception e) {
            System.out.println("Provide only Integer values");
            e.printStackTrace();
        }


    }
}
