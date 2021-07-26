import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of employees:");
        int size = scanner.nextInt();
        Map<String, String> employeeMap = new HashMap<>();

        for (int i = 0; i < size; i++) {
            employeeMap.put(scanner.next(), scanner.next());
        }

        System.out.println(UserMainCode.retirementEmployeeList(employeeMap));

    }
}
