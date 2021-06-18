package week2.abstraction;

public class PersonTest {

    public static void main(String[] args) {

        Person student = new Student("Ravi", "Hyderabad");
        Person teacher = new Teacher("Sundhar", "Banglore");
        Person doctor = new Doctor("Ramesh", "Chennai");

        student.role();
        student.does();

        teacher.role();
        teacher.does();

        doctor.role();
        doctor.does();
    }
}
