public class Emp implements Comparable {
    public String department;
    public int salary;

    public Emp(String department, int salary) {
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.getSalary(), ((Emp) o).getSalary());
    }
}