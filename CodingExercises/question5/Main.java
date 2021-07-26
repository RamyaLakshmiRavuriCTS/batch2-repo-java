package question5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//main class
public class Main {

    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Map<Integer, Integer> numberMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            numberMap.put(scanner.nextInt(), scanner.nextInt());
        }
        System.out.println(UserMainCode.getAverageOfOdd(numberMap));
    }
}
