import java.text.ParseException;
import java.util.*;

public class EmployeeBonus {
    //main method
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        TreeMap<Integer, Integer> tree = new TreeMap<Integer, Integer>();
        HashMap<Integer, String> hash1 = new HashMap<Integer, String>();
        HashMap<Integer, Integer> hash2 = new HashMap<Integer, Integer>();
        for (int i = 0; i < size; i++) {
            int id = scanner.nextInt();
            hash1.put(id, scanner.next());
            hash2.put(id, scanner.nextInt());
        }
        tree =Calsalary.Calsalary(hash1, hash2);
        Iterator<Integer> iterator = tree.keySet().iterator();
        while (iterator.hasNext()) {
            int id = iterator.next();
            int value = tree.get(id);
            System.out.println(id);
            System.out.println(value);
        }
    }
}