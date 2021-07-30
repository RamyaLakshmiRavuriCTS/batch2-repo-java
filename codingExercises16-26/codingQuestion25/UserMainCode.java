import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;


public class UserMainCode {

    //returns status based on age
    public static String getAge(String date1,String date2)
    {
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate today=LocalDate.parse(date1,dateTimeFormatter);
        LocalDate dateOfBirth=LocalDate.parse(date2,dateTimeFormatter);
        long age=dateOfBirth.until(today, ChronoUnit.YEARS);

        if(age>=18){
            return "eligible";
        }

        return "not-eligible";
    }

}