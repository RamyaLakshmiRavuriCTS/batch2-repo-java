import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class UserMainCode {

    //return older date in given two dates
    public static String findOldDate(String date1, String date2)
    {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate localDate1 = LocalDate.parse(date1, dateTimeFormatter);
        LocalDate localDate2 = LocalDate.parse(date2, dateTimeFormatter);

        if (localDate1.isBefore(localDate2))
        {
            return localDate1.format(dateTimeFormatter2);
        }

        return localDate2.format(dateTimeFormatter2);
    }

}