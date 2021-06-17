public class Teacher extends Person {

    private String name, address;

    public Teacher(String name, String address) {
        super(name, address);
    }


    public void role() {
        System.out.println("My Role is Teacher");
    }

    public void responsibility() {
        System.out.println("My responsibility is teaching");
    }
}