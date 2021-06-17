public class Student extends Person {

    private String name, address;

    public Student(String name, String address) {
        super(name, address);
    }


    public void role() {
        System.out.println("My Role is Student");
    }

    public void responsibility() {
        System.out.println("My responsibility is studying");
    }
}
