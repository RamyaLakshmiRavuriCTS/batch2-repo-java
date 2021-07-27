package Assignment15;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.TreeMap;

public class UserMainCode {

    public static TreeMap<Integer, Integer> calculateRevisedSalary(HashMap<Integer, LocalDate> idMapsDOB, HashMap<Integer, Integer> idMapsSalary) {
        TreeMap<Integer, Integer> idMapsRevisedSalary = new TreeMap<>();
        LocalDate standardDate = LocalDate.parse("01-09-2014", DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        for (int id : idMapsDOB.keySet()) {

            LocalDate dob = idMapsDOB.get(id);
            int salary = idMapsSalary.get(id);

            if (dob.isBefore(standardDate)) {
                int age = Period.between(dob, standardDate).getYears();

                if (age > 60 || age < 25 || salary < 5000) {
                    if (salary < 5000) {
                        salary = -100;
                    } else {
                        salary = -200;
                    }
                } else if (age <= 30 && age >= 25) {
                    salary *= 1.20;
                } else {
                    salary *= 1.30;
                }

                idMapsRevisedSalary.put(id, salary);
            }
        }
        return idMapsRevisedSalary;
    }
}
