/*Main class
* Creating objects for abstract class implemented classes*/

public class AbstractClassExample {

    /*Main method
     * creating objects for implemented classes(student,teacher,doctor) using super type(Person)
     * calling implemented abstract methods using objects*/
    public static void main(String[] args) {
        Person student = new Student("Naresh", "Penuganchiprolu");

        Person teacher = new Teacher("Arun kumar", "Vijayawada");

        Person doctor = new Doctor("srinu", "Ganavaram");

        student.role();
        student.responsibilities();

        teacher.role();
        teacher.responsibilities();

        doctor.role();
        doctor.responsibilities();

    }
}
