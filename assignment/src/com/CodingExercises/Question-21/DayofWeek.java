import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DayofWeek {
    //Main method
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println(DayinWeek(string));
    }

    //Returns the day in the week based on date
    public static String DayinWeek(String string) throws ParseException {
        SimpleDateFormat simpledate = new SimpleDateFormat("MM-dd-yyyy");
        Date date = simpledate.parse(string);
        SimpleDateFormat simpledate1 = new SimpleDateFormat("EEEEE");
        String name = simpledate1.format(date);
        return name;
    }

}
