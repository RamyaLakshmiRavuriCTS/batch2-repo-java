import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserMainCode {

    public static String findOldDate(String string1, String string2) {
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("d-MM-yyyy");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("MM/d/yyyy");
        LocalDate localDate1 = LocalDate.parse(string1, dateTimeFormatter1);
        LocalDate localDate2 = LocalDate.parse(string2, dateTimeFormatter1);
        if (localDate1.isBefore(localDate2)) {
            return localDate1.format(dateTimeFormatter2);
        }
        return localDate2.format(dateTimeFormatter2);
    }
}



