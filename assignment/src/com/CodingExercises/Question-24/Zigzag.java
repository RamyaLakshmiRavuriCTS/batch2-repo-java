import java.util.Scanner;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

//main class
public class Zigzag {
    //main method
    public static void main(String[] args) throws IOException, ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getLastDayOfMonth(scanner.next()));
    }
//Logic implemented class
    public static int getLastDayOfMonth(String date) throws IOException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar cal = Calendar.getInstance();
        Date d1 = sdf.parse(date);
        cal.setTime(d1);
        int n = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        return n;
    }
}