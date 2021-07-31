package Question24;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class UserMainCode {

    public static int getLastDayOfMonth(String date){
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("d-MM-yyyy");
        LocalDate localDate=LocalDate.parse(date,dateTimeFormatter);
        Month month=localDate.getMonth();
        Month month1=Month.FEBRUARY;
        if(month.equals(month1)){
            if(localDate.isLeapYear()){
                return month.maxLength();
            }
            else{
                return 28;
            }
        }
        return month.maxLength();
    }
}