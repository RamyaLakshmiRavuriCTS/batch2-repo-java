import java.util.Scanner;
import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        System.out.println("enter the date:");
        Scanner scanner = new Scanner(System.in);
        System.out.println(UserMainCode.getLastDayOfMonth(scanner.next()));
    }
}
