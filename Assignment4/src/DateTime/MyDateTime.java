package DateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class MyDateTime {

    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Unformatted Date and Time : " + dateTime);

        String formatedDateTime = dateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss"));
        System.out.println("Formatted Date and Time : " + formatedDateTime);


        TimeZone timezone = TimeZone.getDefault();
        System.out.println("Current Time Zone : " + timezone.getDisplayName());

        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        LocalDateTime tokyoDateTime = LocalDateTime.now(tokyo);
        System.out.println("Tokyo formatted Date and Time : " + tokyoDateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss")));
    }
}
