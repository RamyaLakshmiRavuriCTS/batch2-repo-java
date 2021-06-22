public class Abstract{

    public static void main(String[] args) {
        Person student = new Student("Divya","Nandyal");
        student.Role();
        student.Responsibilty();
        Person teacher = new Teacher("Jyothi","SDR School");
        teacher.Role();
        teacher.Responsibilty();
        Person doctor = new Doctor("Anitha","Medicover");
        doctor.Role();
        doctor.Responsibilty();



    }
}
