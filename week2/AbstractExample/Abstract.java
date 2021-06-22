public class Abstract {
    public static void main(String[] args) {
        Person student = new Student("Anu","Bangalore");
        student.Role();
        student.Responsibilty();
        Person teacher = new Teacher("Akki","Hyderabad");
        teacher.Role();
        teacher.Responsibilty();
        Person doctor = new Doctor("Abhi","Delhi");
        doctor.Role();
        doctor.Responsibilty();

    }
}
