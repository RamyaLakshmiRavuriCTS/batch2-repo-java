public class Teacher extends Person {
    private String name;
    private String address;

    public Teacher(String name, String address) {
        super(name, address);
    }

    @Override
    public void role() {
        System.out.println(getName() + " is a Teacher");
    }

    @Override
    public void responsibilities() {
        System.out.println("Responsibility of " + getName() + " is:" + "Teaching");
    }
}