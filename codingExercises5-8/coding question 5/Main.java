import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hashmap size");
        int size = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println("Enter key and value");
        for (int i = 0; i < size; i++) {
            map.put(sc.nextInt(), sc.nextInt());
        }
        System.out.println(UserMainCode.getAverageOfOdd(map));

    }

}
