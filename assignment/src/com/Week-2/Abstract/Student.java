public class Student extends Person {
    private String name;
    private String address;

    public Student(String name, String address) {
        super(name, address);
    }

    @Override
    public void role() {
        System.out.println(getName() + " is a Student");
    }

    @Override
    public void responsibilities() {
        System.out.println("Responsibilities of " + getName() + " are:" +
                "\n1. Attending Classes on time" +
                "\n2. Complete assignments on time" +
                "\n3. Pass in exams");
    }
}