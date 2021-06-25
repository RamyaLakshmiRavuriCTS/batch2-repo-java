import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;
import java.text.*;

/*Time is a class which is used to diplay current date,
 *time and zone*/
public class Time {
    /*Main method
     *Display of Current date,time & zone and
     * Current time in tokyo*/
    public static void main(String[] args) {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy  hh:mm:ss a zzz");
        System.out.println("Current Date: " + ft.format(dNow));
        ZonedDateTime currentTime = ZonedDateTime.now();
        System.out.println("Current Zone: " + currentTime.getZone());

        ZoneId zone = ZoneId.of("Asia/Tokyo");

        LocalTime time = LocalTime.now(zone);
        System.out.println("Tokyo Time: " + time);


    }
}