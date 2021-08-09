package Assignment28;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Number of Employees");
        int noOfEmployees = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= noOfEmployees; i++) {
            System.out.println("Enter Employee " + i + " Details:");
            System.out.println("Enter the Firstname");
            String firstName = scanner.nextLine();

            System.out.println("Enter the Lastname");
            String lastName = scanner.nextLine();

            System.out.println("Enter the Mobile");
            String mobile = scanner.nextLine();

            System.out.println("Enter the Email");
            String email = scanner.nextLine();

            System.out.println("Enter the Address");
            String address = scanner.nextLine();

            Employee employee = new Employee(firstName, lastName, mobile, email, address);
            Employee.employees.add(employee);
        }

        Employee.displayEmployeeList();
    }
}
