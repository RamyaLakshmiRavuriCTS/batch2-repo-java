package week2.abstraction;

public class Student extends Person {

    public Student(String name, String address) {
        super(name, address);
    }

    @Override
    public void role() {
        System.out.println(getName() + " is a Student.");
    }

    @Override
    public void does() {
        System.out.println(getName() + " goes to school everyday.");
    }
}
