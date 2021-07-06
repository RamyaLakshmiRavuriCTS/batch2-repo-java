import java.util.Comparator;

public class EmployeeDetails implements Comparable, Comparator {
    final private String department;
    final private int salary;
    public EmployeeDetails(String department, int salary){
        this.department = department;
        this.salary = salary;
    }
    @Override
    public String toString () {
        return "Employee{" +
                "department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
    public String getDepartment () {
        return department;
    }
    public int getSalary () {
        return salary;
    }
    @Override
    public int hashCode () {
        return this.getDepartment().hashCode();
    }
    @Override
    public int compare (Object o1, Object o2){
        return Integer.compare(((EmployeeDetails) o1).getSalary(), ((EmployeeDetails) o2).getSalary());
    }
    @Override
    public boolean equals (Object obj){
        return ((this.getDepartment().equals(((EmployeeDetails) obj).getDepartment())));
    }
    @Override
    public int compareTo (Object o){
        return Integer.compare(this.getSalary(), ((EmployeeDetails) o).getSalary());
    }
}
