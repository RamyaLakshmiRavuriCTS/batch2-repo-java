import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<EmployeeDetails> employeeDetailsList = new ArrayList<>();

        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            EmployeeDetails employee = new EmployeeDetails();
            System.out.println("Enter Employee " + (i + 1) + " Details:");
            employee.setFirstName(scanner.next());
            employee.setLastName(scanner.next());
            employee.setMobileNumber(scanner.next());
            employee.setEmail(scanner.next());
            employee.setAddress(scanner.next());
            employeeDetailsList.add(employee);
        }
        Collections.sort(employeeDetailsList);
        System.out.println(employeeDetailsList);
        System.out.println("Employee List:");
        System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "Firstname", "Lastname", "Mobile", "Email", "Address");
        for (EmployeeDetails employee1 : employeeDetailsList) {
            System.out.format("%-15s %-15s %-15s %-30s %-15s\n", employee1.getFirstName(), employee1.getLastName(), employee1.getMobileNumber(), employee1.getEmail(), employee1.getAddress());
        }
    }
}