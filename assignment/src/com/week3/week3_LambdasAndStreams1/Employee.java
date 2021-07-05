import java.util.Comparator;

//employee class
public class Employee implements Comparable, Comparator {

    final private String department;
    final private int salary;

    public Employee(String department, int salary) {

        this.department = department;
        this.salary = salary;
    }

    //overridden method
    @Override
    public String toString() {
        return "Employee{" + "department='" + department + '\'' + ", salary=" + salary + '}';
    }

    //returns department
    public String getDepartment() {
        return department;
    }

    //returns salary
    public int getSalary() {
        return salary;
    }

    //overridden method
    @Override
    public int hashCode() {
        return this.getDepartment().hashCode();
    }

    //overridden method
    @Override
    public int compare(Object o1, Object o2) {
        return Integer.compare(((Employee) o1).getSalary(), ((Employee) o2).getSalary());
    }

    //overridden method
    @Override
    public boolean equals(Object obj) {
        return ((this.getDepartment().equals(((Employee) obj).getDepartment())));
    }

    //overridden method
    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.getSalary(), ((Employee) o).getSalary());
    }
}