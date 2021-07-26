import java.time.LocalDate;
        import java.time.format.DateTimeFormatter;
        import java.time.temporal.ChronoUnit;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.Map;


public class UserMainCode {


    public static List<String> retirementEmployeeList(Map<String, String> employeeMap) {
        String dob;
        LocalDate todayDate = LocalDate.of(2014, 1, 1);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<String> eligibleEmployees = new ArrayList<>();
          //entrySet() method  is used to create
        // a set out of the same elements contained in the hash map
        for (Map.Entry<String, String> employee : employeeMap.entrySet()) {
            dob = employee.getValue();
            LocalDate dateofbirth = LocalDate.parse(dob, dateTimeFormatter);
            //ChronoUnit  represents the concept of a nanosecond, the smallest supported unit of time
            long age = dateofbirth.until(todayDate, ChronoUnit.YEARS);
            if (age > 60) {
                eligibleEmployees.add(employee.getKey());
            }
        }
        return eligibleEmployees;
    }
}
