package Question22;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Map<Integer, String> personMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            personMap.put(scanner.nextInt(), scanner.next());
        }

        List<String> names = UserMainCode.getName(personMap);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
