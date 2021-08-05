import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserMainCode {
    public static String getDay(String s1) throws ParseException {
        SimpleDateFormat simpledate = new SimpleDateFormat("MM-dd-yyyy");
        Date date = simpledate.parse(s1);
        SimpleDateFormat simpledate1 = new SimpleDateFormat("EEEEE");
        String name = simpledate1.format(date);
        return name;
    }
}