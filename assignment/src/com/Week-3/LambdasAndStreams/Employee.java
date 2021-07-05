package LambdasAndStreams;

import java.util.Comparator;
import java.util.stream.Collector;

/*Employee class is a pojo and
 *implements Comparable interface*/
public class Employee implements Comparable, Comparator {
    private String department;
    private int salary;

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

        return this.getSalary() + 34;
    }

    @Override
    public int compare(Object o1, Object o2) {
        if (((Employee) o1).getSalary() > ((Employee) o2).getSalary()) {
            return 1;
        } else if (((Employee) o1).getSalary() == ((Employee) o2).getSalary()) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        return ((this.getDepartment().equals(((Employee) obj).getDepartment())) && (this.getSalary() == ((Employee) obj).getSalary()));
    }

    @Override
    public int compareTo(Object o) {
        Employee e = (Employee) o;

        if (this.getSalary() > ((Employee) o).getSalary()) {
            return 1;
        } else if (this.getSalary() == ((Employee) o).getSalary()) {
            return 0;
        } else {
            return -1;
        }
    }

}
