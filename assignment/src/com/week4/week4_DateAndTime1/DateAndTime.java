import java.time.*;
import java.time.format.DateTimeFormatter;

//main class
public class DateAndTime {

    //main method
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println("Date is :" + date);

        LocalTime time = LocalTime.now();
        System.out.println("Time is" + time);

        LocalDateTime datetime1 = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = datetime1.format(format);
        System.out.println("LocalDatetime now is :" + formatDateTime);

        ZonedDateTime zone = ZonedDateTime.now();
        System.out.println(zone.getZone());
        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneId istZoneId = ZoneId.of("Asia/Kolkata");
        ZonedDateTime zone1 = ZonedDateTime.of(datetime1, istZoneId);
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime zone2 = zone1.withZoneSameInstant(tokyo);
        System.out.println("In Tokyo Central Time Zone:" + zone2);
    }
}
