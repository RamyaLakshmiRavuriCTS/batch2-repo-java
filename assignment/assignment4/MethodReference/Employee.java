public class Employee {
    private int Empid;
    public String name;
    private int age;

    public Employee(String name, int Empid, int age) {
        this.name = name;
        this.Empid = Empid;
        this.age = age;
    }
    public int getEmpid() {
        return Empid;
    }

    public void setEmpid(int empid) {
        Empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}
