import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UserMainCode {
    public static int getLastDayOfMonth(String date) throws IOException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar = Calendar.getInstance();
        Date d1 = sdf.parse(date);
        calendar.setTime(d1);
        int numberOfDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return numberOfDays;
    }
}
