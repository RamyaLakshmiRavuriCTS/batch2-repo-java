import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) throws ParseException {

        Scanner read=new Scanner(System.in);
        String date=read.next();
        System.out.println(getDay(date));
    }
    public static String getDay(String date) throws ParseException {

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy");
        Date date1=simpleDateFormat.parse(date);
        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("EEEEE");
        String name=simpleDateFormat1.format(date1);
        return name.toLowerCase();

    }
}
