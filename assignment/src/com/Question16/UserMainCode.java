package Question16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserMainCode {

    public static String getOldDate(String date1, String date2) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d-MM-yyyy");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("MM/d/yyyy");
        LocalDate localDate1 = LocalDate.parse(date1, dateTimeFormatter);
        LocalDate localDate2 = LocalDate.parse(date2, dateTimeFormatter);
        if (localDate1.isBefore(localDate2)) {
            return localDate1.format(dateTimeFormatter2);
        }
        return localDate2.format(dateTimeFormatter2);
    }
}
