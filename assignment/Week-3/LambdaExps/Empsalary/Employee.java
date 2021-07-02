import java.util.*;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;
public class Employee {
    public static void main(String[]args){
        List<Emp> allEmployees = new ArrayList<>();
        {
            allEmployees.add(new Emp("CSE",50000));
            allEmployees.add(new Emp("CSE",40000));
            allEmployees.add(new Emp("ECE",45000));
            allEmployees.add(new Emp("ECE",35000));
            allEmployees.add(new Emp("IT",36000));
            allEmployees.add(new Emp("CSE",45000));
        }
        Map<String, Emp> topEmployees = allEmployees.stream().collect(Collectors.groupingBy(e-> e.department, collectingAndThen(maxBy(Comparator.comparingDouble(Emp::getSalary)), Optional::get)));
        System.out.println("Top Salaried Employees in all departments:\n"+Arrays.asList(topEmployees));
    }

    public static class Emp implements Comparable {
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
}