package question7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//main class
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Map<String, String> employeeMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            employeeMap.put(scanner.next(), scanner.next());
        }
        System.out.println(UserMainCode.retirementEmployeeList(employeeMap));

    }
}
