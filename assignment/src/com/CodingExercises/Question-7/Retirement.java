import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//main class
public class Retirement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No. of Employees:");
        int size = scanner.nextInt();

        Map<String, String> employeeMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            employeeMap.put(scanner.next(), scanner.next());
        }
        System.out.println(EmployeeList(employeeMap));

    }


    //list of employees whose age greater than & equal to 60
    public static List<String> EmployeeList(Map<String, String> employeeMap) {
        String dob;
        LocalDate todayDate = LocalDate.of(2014, 1, 1);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        List<String> retiredEmployees = new ArrayList<>();

        for (Map.Entry<String, String> employee : employeeMap.entrySet()) {
            dob = employee.getValue();
            LocalDate dateofbirth = LocalDate.parse(dob, dateTimeFormatter);
            long age = dateofbirth.until(todayDate, ChronoUnit.YEARS);
            if (age >= 60) {
                retiredEmployees.add(employee.getKey());
            }
        }
        return retiredEmployees;
    }
}
