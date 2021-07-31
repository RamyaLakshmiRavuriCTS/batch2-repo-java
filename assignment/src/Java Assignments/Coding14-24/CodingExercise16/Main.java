import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// main class
public class Main {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date1 = scanner.next();
        String date2 = scanner.next();
        System.out.println(findOldDate(date1, date2));
    }

        //return old date in given two dates
        public static String findOldDate(String date1, String date2) {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d-MM-yyyy");
            DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("MM/d/yyyy");
            LocalDate localDate1 = LocalDate.parse(date1, dateTimeFormatter);
            LocalDate localDate2 = LocalDate.parse(date2, dateTimeFormatter);
            if (localDate1.isBefore(localDate2)) {
                return localDate1.format(dateTimeFormatter2);
            }
            return localDate2.format(dateTimeFormatter2);
        }
    }
