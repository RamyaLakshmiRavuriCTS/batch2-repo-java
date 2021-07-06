package MethodReference;
/*Employee class is a pojo or bean
* uses to store the employee information*/
public class Employee {
    private final String name;
    private final int id;
    private final int age;

    public Employee(String name, int employeeId, int age) {
        this.name = name;
        this.id = employeeId;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ",Id=" + id +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }
}
