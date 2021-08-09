package Assignment24;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserMainCode {

    public static int getLastDayOfMonth(String stringDate) {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(stringDate, dateFormat);
        int daysInMonth = date.getMonth().maxLength();

        return daysInMonth;
    }
}
