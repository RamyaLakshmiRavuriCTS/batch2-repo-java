package Assignment28;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void testEmployeeClass() {
        Employee employee1 = new Employee("Amar", "CR", "9874561230", "amar@gmail.com", "London");
        Employee employee2 = new Employee("William", "Becker", "449876543210", "william@abc.com", "America");
        Employee.employees.add(employee2);
        Employee.employees.add(employee1);

        Employee.displayEmployeeList();

    }

}