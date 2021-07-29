import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

//This class calucates the bonus of employee based on dob
public class Calsalary {

    public static TreeMap<Integer, Integer> Calsalary(HashMap<Integer, String> hash1, HashMap<Integer, Integer> hash2) throws ParseException {
        TreeMap<Integer, Integer> tree = new TreeMap<Integer, Integer>();
        Iterator<Integer> iterator = hash1.keySet().iterator();
        SimpleDateFormat simpledate = new SimpleDateFormat("dd-MM-YYYY");
        String setdate = "01-09-2014";
        int new_salary = 0;
        while (iterator.hasNext()) {
            int id1 = iterator.next();
            String dob = hash1.get(id1);
            int salary = hash2.get(id1);
            Date date1 = simpledate.parse(dob);
            Date date2 = simpledate.parse(setdate);
            date1 = simpledate.parse(dob);
            int year1 = date1.getYear();
            int year2 = date2.getYear();
            int year = Math.abs(year1 - year2);
            if (year >= 25 && year <= 30) {
                new_salary = salary + (salary * 20 / 100);
                tree.put(id1, new_salary);
            } else if (year >= 31 && year <= 60) {
                new_salary = salary + (salary * 30 / 100);
                tree.put(id1, new_salary);
            } else
                ;
        }
        return tree;
    }
}