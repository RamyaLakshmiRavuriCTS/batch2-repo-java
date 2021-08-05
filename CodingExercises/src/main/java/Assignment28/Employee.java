package Assignment28;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String email;
    private String address;
    public static List<Employee> employees = new ArrayList<>();

    public Employee() {
    }

    public Employee(String firstName, String lastName, String mobileNumber, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        String employee = String.format("%-15s %-15s %-15s %-30s %-15s", this.firstName, this.lastName, this.mobileNumber, this.email, this.address);
        return employee;
    }

    public static void displayEmployeeList() {
        System.out.println("Employee List:");
        System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "Firstname", "Lastname", "Mobile", "Email", "Address");
        Employee.employees.stream().sorted(Comparator.comparing(Employee::getFirstName)).forEach(System.out::println);
    }
}
