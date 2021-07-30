import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserMainCode {

    public static String getDay(String date) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);

        int day = localDate.getDayOfWeek().getValue();

        switch (day) {
            case 1:
                return "Monday";

            case 2:
                return "Tuesday";

            case 3:
                return "Wednesday";

            case 4:
                return "Thursday";

            case 5:
                return "Friday";

            case 6:
                return "Saturday";

            case 7:
                return "Sunday";

            default:
                return null;

        }

    }
}