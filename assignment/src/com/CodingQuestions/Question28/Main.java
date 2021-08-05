import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();
        System.out.println("Enter The Number of Employees");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            Employee employee = new Employee();
            System.out.println("Enter Employee " + (i + 1) + " Details:");
            System.out.println("Enter the Firstname");
            employee.setFirstName(scanner.next());
            System.out.println("Enter the Lastname");
            employee.setLastName(scanner.next());
            System.out.println("Enter the Mobile Number");
            employee.setMobileNumber(scanner.next());
            System.out.println("Enter the Email");
            employee.setEmail(scanner.next());
            System.out.println("Enter the Address");
            employee.setAddress(scanner.next());
            employeeList.add(employee);
        }
        Collections.sort(employeeList);
        System.out.println(employeeList);
        System.out.println("Employee List:");
        System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "Firstname", "Lastname", "Mobile", "Email", "Address");
        for (Employee employee1 : employeeList) {
            System.out.format("%-15s %-15s %-15s %-30s %-15s\n", employee1.getFirstName(), employee1.getLastName(), employee1.getMobileNumber(), employee1.getEmail(), employee1.getAddress());
        }
    }
}
