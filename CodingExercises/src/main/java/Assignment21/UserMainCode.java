package Assignment21;

import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class UserMainCode {

    public static String getDay(String date) {
        String day = null;
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate inputDate = LocalDate.parse(date, dateFormat);
        day = inputDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        return day;
    }
}
