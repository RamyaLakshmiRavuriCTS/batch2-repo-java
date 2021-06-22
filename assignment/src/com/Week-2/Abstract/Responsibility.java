/*Main class
 *Creation of abstract class*/

public class Responsibility {

    /*Main method
     *Creation of objects for classes(student,teacher,doctor) using(Person) super type
     * Calling abstract methods using objects*/
    public static void main(String[] args) {
        Person student = new Student("Yeshwanth", "Vijayawada");

        Person teacher = new Teacher("Anupama", "Vijayawada");

        Person doctor = new Doctor("Ramesh", "Vizag");

        student.role();
        student.responsibilities();

        teacher.role();
        teacher.responsibilities();

        doctor.role();
        doctor.responsibilities();
    }
}