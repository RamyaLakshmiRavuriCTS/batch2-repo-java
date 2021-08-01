import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.TreeMap;
public class Details {
    public static Map<Integer, Integer> calculateRevisedSalary(Map<Integer, String> dobMap, Map<Integer, Integer> salaryMap) {
        Map<Integer, Integer> modifiedMap = new TreeMap<>();
        LocalDate today = LocalDate.of(2014, 1, 1);
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("d-MM-yyyy");
        LocalDate dateOfBirth;
        for (Map.Entry<Integer, String> dob : dobMap.entrySet()) {
            dateOfBirth = LocalDate.parse(dob.getValue(), dateTimeFormatter);
            long age = dateOfBirth.until(today, ChronoUnit.YEARS);
            int salary = salaryMap.get(dob.getKey());
            if (age >= 25 && age <= 30 && salary > 5000) {
                salary += ((salary * 20) / 100);
            } else if (age >= 31 && age <= 60 && salary > 5000) {
                salary += ((salary * 30) / 100);
            } else if (salary < 5000) {
                salary = -100;
            } else {
                salary = -200;
            }
            modifiedMap.put(dob.getKey(), salary);
        }
        return modifiedMap;
    }
}

