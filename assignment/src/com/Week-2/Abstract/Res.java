public class Res {
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