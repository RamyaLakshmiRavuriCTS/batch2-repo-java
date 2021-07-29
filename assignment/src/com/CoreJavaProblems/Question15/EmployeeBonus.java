import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class EmployeeBonus {
    public static void main(String[] args) throws ParseException {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int size = read.nextInt();
        HashMap<Integer, String> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < size; i++) {
            System.out.println("enter the employee id");
            int id = read.nextInt();
            read.nextLine();
            System.out.println("Enter the DOB of employee in format 'dd-mm-yyyy'");
            String dob = read.nextLine();
            System.out.println("Enter the salary of employee");
            int salary = read.nextInt();
            map1.put(id, dob);
            map2.put(id, salary);
        }
        TreeMap<Integer, Integer> result = calculatezrevisedSalary(map1, map2);
        for (Map.Entry<Integer, Integer> e : result.entrySet())
            System.out.println("Id: " + e.getKey()
                    + " Salary: " + e.getValue());
    }

    public static TreeMap<Integer, Integer> calculatezrevisedSalary(HashMap<Integer, String> hmap1,
                                                                    HashMap<Integer, Integer> hmap2) throws ParseException {
        TreeMap<Integer, Integer> tmap = new TreeMap<Integer, Integer>();
        Iterator<Integer> it1 = hmap1.keySet().iterator();
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
        String ss = "01-09-2014";
        int new_sal = 0;
        while (it1.hasNext()) {
            int id1 = it1.next();
            String dob = hmap1.get(id1);
            int salary = hmap2.get(id1);
            Date d1 = sd.parse(dob);
            Date d2 = sd.parse(ss);
            int y1 = d1.getYear();
            int y2 = d2.getYear();
            int year = Math.abs(y1 - y2);
            if(salary<5000)
            {
                new_sal=-100;
                tmap.put(id1, new_sal);
            }
            else if (year >= 25 && year <= 30) {
                new_sal = salary + (salary * 20 / 100);
                tmap.put(id1, new_sal);
            } else if (year >= 31 && year <= 60) {
                new_sal = salary + (salary * 30 / 100);
                tmap.put(id1, new_sal);
            } else
            {
                new_sal=-200;
                tmap.put(id1, new_sal);
            }

        }
        return tmap;
    }
}
