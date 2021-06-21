package week2.abstraction;

public class Doctor extends Person{

    public Doctor(String name, String address) {
        super(name, address);
    }

    @Override
    public void role() {
        System.out.println(getName() + " is a Doctor.");
    }

    @Override
    public void does() {
        System.out.println(getName() + " gives treatment to patients.");
    }
}
