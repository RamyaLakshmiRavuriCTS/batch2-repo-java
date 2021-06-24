package DateAndTimeAPI;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*This class display today date and present time
 * and current zone
 * and current time at Tokyo
 * using Date And time API*/
public class DisplayLocalDateAndTime {
    /*Main method
     * using Date and Time API introduced in java 8
     * printing today date and current time and zone
     * and time in tokyo*/
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
        String dateAndTime = localDateTime.format(dateTimeFormatter);
        System.out.println("Today Date And Time is " + dateAndTime);
        ZonedDateTime currentTime = ZonedDateTime.now();
        System.out.println("Current Zone is " + currentTime.getZone());
        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        LocalTime time = LocalTime.now(zoneId);
        System.out.println("Tokyo current Time is " + time);


    }


}
