//implementation class for person
public class Teacher extends Person {

    private String name, address;

    public Teacher(String name, String address) {
        super(name, address);
    }

    //prints role of teacher
    @Override
    public void role() {
        System.out.println("My Role is Teacher");
    }

    //prints teacher responsibility
    @Override
    public void responsibility() {
        System.out.println("My responsibility is teaching");
    }
}