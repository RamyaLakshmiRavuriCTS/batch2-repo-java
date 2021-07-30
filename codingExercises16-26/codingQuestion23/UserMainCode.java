import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserMainCode {

    public static String convertDateFormat(String date)
    {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd-MM-yy");
        LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);

        return localDate.format(dateTimeFormatter1);
    }

}