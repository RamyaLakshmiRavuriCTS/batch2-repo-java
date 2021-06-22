public class Student extends Person {

    private String name, address;

    public Student(String name, String address) {
        super(name, address);
    }

    //prints role of student
    @Override
    public void role() {
        System.out.println("My Role is Student");
    }

    //prints responsibility of student
    @Override
    public void responsibility() {
        System.out.println("My responsibility is studying");
    }
}
