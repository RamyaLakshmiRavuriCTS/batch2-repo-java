package Assignment07;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

public class UserMainCode {

    public static ArrayList<String> retirementEmployeeList(HashMap<String, String> employees) {
        ArrayList<String> retirementEmpList = new ArrayList<>();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate currentDate = LocalDate.parse("01/01/2014", dateFormatter);

        for (String id : employees.keySet()) {
            LocalDate dob = LocalDate.parse(employees.get(id), dateFormatter);
            int age = Period.between(dob, currentDate).getYears();
            if (age >= 60) {
                retirementEmpList.add(id);
            }
        }
        return retirementEmpList;
    }
}
