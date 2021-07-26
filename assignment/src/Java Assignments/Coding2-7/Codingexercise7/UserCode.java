import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
public class UserCode {
    public static ArrayList<String> EmployeeList(HashMap<String, String> map) throws ParseException {
        ArrayList<String> result = new ArrayList<>();
        String Date1 = "01/01/2014";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(Date1);
        for (Map.Entry<String, String> set : map.entrySet()) {
            String Date2 = set.getValue();
            Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(Date2);
            long time_difference = date1.getTime() - ((Date) date2).getTime();
            long years_difference = (time_difference / (1000l * 60 * 60 * 24 * 365));
            if (years_difference >= 60)
                result.add(set.getKey());
        }
        return result;
    }
}

