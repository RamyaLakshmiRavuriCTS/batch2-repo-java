import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

//main class
public class Main {

    //main method
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(getAge("01-01-2015",scanner.next()));
    }
    public static String getAge(String date1,String date2){
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("d-MM-yyyy");
        LocalDate today=LocalDate.parse(date1,dateTimeFormatter);
        LocalDate dateOfBirth=LocalDate.parse(date2,dateTimeFormatter);
        long age=dateOfBirth.until(today, ChronoUnit.YEARS);
        if(age>=18){
            return "eligible";
        }
        return "not-eligible";
    }
}