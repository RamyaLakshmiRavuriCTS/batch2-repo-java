package Assignment23;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserMainCode {

    public static String convertDateFormat(String stringDate) {

        DateTimeFormatter fromDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter toDateFormat = DateTimeFormatter.ofPattern("dd-MM-yy");
        String formattedDate = LocalDate.parse(stringDate, fromDateFormat).format(toDateFormat);

        return formattedDate;
    }
}
