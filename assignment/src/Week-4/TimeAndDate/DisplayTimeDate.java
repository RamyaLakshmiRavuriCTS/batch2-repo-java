import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class DisplayTimeDate {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
        String dateAndTime = localDateTime.format(dateTimeFormatter);
        System.out.println("Today Date And Time is " + dateAndTime);
        ZonedDateTime currentTime = ZonedDateTime.now();
        System.out.println("Current Zone is " + currentTime.getZone());
        ZoneId zoneId = ZoneId.of("Asia/Seoul");
        LocalTime time = LocalTime.now(zoneId);
        System.out.println("Seoul current Time is " + time);
    }
}