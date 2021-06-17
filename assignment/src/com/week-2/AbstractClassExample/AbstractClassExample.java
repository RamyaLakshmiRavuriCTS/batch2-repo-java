public class AbstractClassExample {

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
