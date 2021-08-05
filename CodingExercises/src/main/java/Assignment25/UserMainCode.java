package Assignment25;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class UserMainCode {

    public static String getAge(String stringDate) {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate standardDate = LocalDate.parse("01/01/2015", dateFormat);
        LocalDate inputDate = LocalDate.parse(stringDate, dateFormat);
        int ageInYears = Period.between(inputDate, standardDate).getYears();

        if (ageInYears > 18) {
            return "eligible";
        }

        return "not-eligible";
    }
}
