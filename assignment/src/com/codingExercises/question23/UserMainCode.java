package question23;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//Logic implemented class
public class UserMainCode {

    public static String convertDateFormat(String date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d-MM-yyyy");
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("d-MM-yy");
        LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);
        return localDate.format(dateTimeFormatter1);
    }
}
