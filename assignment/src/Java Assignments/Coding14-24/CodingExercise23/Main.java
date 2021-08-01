import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//main class
public class Main {

    //main method
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(convertDateFormat(scanner.next()));
    }
    public static String convertDateFormat(String date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d-MM-yyyy");
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("d-MM-yy");
        LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);
        return localDate.format(dateTimeFormatter1);
    }
}