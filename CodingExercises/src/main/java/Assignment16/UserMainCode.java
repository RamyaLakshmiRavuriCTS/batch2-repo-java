package Assignment16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserMainCode {

    public static String findOldDate(String date1, String date2) {

        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate1 = LocalDate.parse(date1, inputFormat);
        LocalDate localDate2 = LocalDate.parse(date2, inputFormat);

        if (localDate1.isBefore(localDate2)) {
            return localDate1.format(outputFormat);
        }

        return localDate2.format(outputFormat);
    }
}
