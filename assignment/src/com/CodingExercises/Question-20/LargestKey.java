import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LargestKey {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of HashMap:");
        int size = scanner.nextInt();
        Map<Integer, String> personMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            personMap.put(scanner.nextInt(), scanner.next());
        }
        System.out.println("Max Key value:" + MaxKeyValue(personMap));
    }

    //Logic implementation class
    public static String MaxKeyValue(Map<Integer, String> personMap) {
        String KeyValue = null;
        int max = 0;
        for (Map.Entry<Integer, String> person : personMap.entrySet()) {
            if (person.getKey() > max) {
                max = person.getKey();
                KeyValue = person.getValue();
            }
        }
        return KeyValue;
    }
}