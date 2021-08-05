import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the date:");
        String s1 = scanner.next();
        System.out.println("day of week is:");
        System.out.println(UserMainCode.getDay(s1));
    }
}