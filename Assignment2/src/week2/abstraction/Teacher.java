package week2.abstraction;

public class Teacher extends Person{

    public Teacher(String name, String address) {
        super(name,address);
    }

    @Override
    public void role() {
        System.out.println(getName() + " is a Teacher.");
    }

    @Override
    public void does() {
        System.out.println(getName() + " teaches Lessons.");
    }
}
