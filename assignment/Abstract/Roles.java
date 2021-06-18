public class Roles {
    public static void main(String[] args) {
        Student student = new Student("Sravani", "Kakinada");
        student.role();
        student.responsibility();
        Teacher teacher = new Teacher("RamMurthy", "Vizag");
        teacher.role();
        teacher.responsibility();
        Doctor doctor = new Doctor("Ramya", "Hyderabad");
        doctor.role();
        doctor.responsibility();
    }
  }
