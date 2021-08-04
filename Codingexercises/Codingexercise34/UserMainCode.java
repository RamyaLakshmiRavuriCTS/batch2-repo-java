package Operations;

import java.util.ArrayList;
import java.util.List;

public class UserMainCode {
    private static List<String> stringList = new ArrayList<>();

    public static void insert(String input) {
        if (stringList.contains(input)) {
            System.out.println("Item already exist");
        } else {
            stringList.add(input);
            System.out.println("Inserted successfully");
        }
    }

    public static void search(String input) {
        if (stringList.contains(input)) {
            System.out.println("Item found in the list.");
        } else {
            System.out.println("Item not found in the list.");
        }
    }

    public static void delete(String input) {
        if (stringList.contains(input)) {
            stringList.remove(input);
            System.out.println("Deleted successfully");
        } else {
            System.out.println("Item not found in the list.");
        }
    }

    public static void display() {
        System.out.println("The Items in the list are :");
        for (String string : stringList) {
            System.out.println(string);
        }
    }
}