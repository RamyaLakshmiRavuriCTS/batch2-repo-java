public class Teacher extends Person {

    public Teacher(String name, String address) {
        super(name, address);
    }

    @Override
    public void role() {
        System.out.println(getName() + " is Teacher");
    }

    @Override
    public void responsibility() {
        System.out.println(getName() + " Teaches to the students");
        System.out.println(getName() + " lives in " + getAddress());
    }
}
