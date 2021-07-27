package question7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//logic implemented class
public class UserMainCode {

    //list the employee whose age greater then 60
    public static List<String> retirementEmployeeList(Map<String, String> employeeMap) {
        String dob;
        LocalDate todayDate = LocalDate.of(2014, 1, 1);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        List<String> eligibleEmployees = new ArrayList<>();

        for (Map.Entry<String, String> employee : employeeMap.entrySet()) {
            dob = employee.getValue();
            LocalDate dateofbirth = LocalDate.parse(dob, dateTimeFormatter);
            long age = dateofbirth.until(todayDate, ChronoUnit.YEARS);
            if (age > 60) {
                eligibleEmployees.add(employee.getKey());
            }
        }
        return eligibleEmployees;
    }
}
