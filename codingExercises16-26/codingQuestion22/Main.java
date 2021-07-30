import java.util.HashMap;
import java.util.List;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hashmap size");
        int size = sc.nextInt();
        HashMap<Integer, String> personMap = new HashMap<>();
        System.out.println("Enter  id and name");
        for (int i = 0; i < size; i++) {
            personMap.put(sc.nextInt(), sc.next());
        }

        List<String> names = UserMainCode.getName(personMap);
        for (String name : names) {
            System.out.println(name);
        }
    }
}