import java.text.ParseException;
import java.util.*;

public class Main {
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
        System.out.println(UserCode.EmployeeList(map));
    }
}