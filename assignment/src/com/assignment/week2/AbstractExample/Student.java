public class Student extends Person{
    public Student(String name, String address) {
        super(name, address);
    }

    @Override
    public void role() {
        System.out.println(getName() + " is a student.");
        System.out.println(getName() + " address is " + getAddress());
    }

    @Override
    public void Responsibilty() {
        System.out.println("responsibility is studying");
    }
}
