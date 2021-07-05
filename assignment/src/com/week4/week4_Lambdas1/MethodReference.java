import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//employee class
class Employee {
    String name;
    String id;

    public Employee() {
    }

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    //overridden method
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", id=" + id + '}';
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
}
//main class
public class MethodReference {

    //main method
    public static void main(String[] args) {

        Employee emp1 = new Employee("sam", "4");
        Employee emp2 = new Employee("amy", "2");
        Employee emp3 = new Employee("brad", "1");

        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("Atfer sorting by name");
        List<Employee> sortedEmployeesName = list.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        sortedEmployeesName.forEach(System.out::println);
        System.out.println("After sorting by Id");
        List<Employee> sortedEmployeesId = list.stream()
                .sorted(Comparator.comparing(Employee::getId))
                .collect(Collectors.toList());
        sortedEmployeesId.forEach(System.out::println);

    }
}