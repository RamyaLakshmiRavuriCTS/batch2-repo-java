import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Retirement {
    public static void main(String[] args) throws ParseException {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of list");
        int size = input.nextInt();
        HashMap<String, String> map = new HashMap<>();
        input.nextLine();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the id");
            String id = input.nextLine();
            System.out.println("enter the date in format dd/mm/yyyy");
            String date = input.nextLine();
            map.put(id, date);
        }
        System.out.println(retirementEmployeeList(map));
    }

    public static ArrayList<String> retirementEmployeeList(HashMap<String, String> map) throws ParseException {
        ArrayList<String> result = new ArrayList<>();
        String Date1 = "01/01/2014";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(Date1);
        for (Map.Entry<String, String> set : map.entrySet()) {
            String Date2 = set.getValue();
            Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(Date2);
            long time_difference = date1.getTime() - date2.getTime();
            long years_difference = (time_difference / (1000l * 60 * 60 * 24 * 365));
            if (years_difference >= 60)
                result.add(set.getKey());
        }
        return result;
    }
}
