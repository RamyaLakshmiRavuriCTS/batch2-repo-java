package LambdasAndStreams;

/*This class is a pojo or bean
 * it implements the Comparable  interface
 * And overrides the CompareTo,hashCode,toString and equals methods*/
public class Employee implements Comparable {
    final private String department;
    final private int salary;

    public Employee(String department, int salary) {
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int hashCode() {
        return this.getDepartment().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return ((this.getDepartment().equals(((Employee) obj).getDepartment())));
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.getSalary(), ((Employee) o).getSalary());
    }

}
