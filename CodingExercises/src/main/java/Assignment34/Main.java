package Assignment34;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<String> stringList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 0;
        while (input != 5) {
            printMenu();
            System.out.println("Enter your choice :");
            input = Integer.parseInt(scanner.nextLine());

            switch (input) {
                case 1: {
                    //insert
                    System.out.println("Enter the item to be inserted:");
                    String word = scanner.nextLine();
                    stringList.add(word);
                    System.out.println("Inserted successfully");
                    break;
                }
                case 2: {
                    //search
                    System.out.println("Enter the item to search :");
                    String word = scanner.nextLine();

                    if (stringList.contains(word)) {
                        System.out.println("Item found in the list.");
                    } else {
                        System.out.println("Item not found in the list.");
                    }
                    break;
                }
                case 3: {
                    //delete
                    System.out.println("Enter the item to delete :");
                    String word = scanner.nextLine();

                    if (stringList.contains(word)) {
                        stringList.remove(word);
                        System.out.println("Deleted successfully");
                    } else {
                        System.out.println("Item does not exist.");
                    }
                    break;
                }
                case 4: {
                    //display
                    System.out.println("The Items in the list are :");
                    stringList.forEach(System.out::println);
                }
            }
        }
    }

    public static void printMenu() {
        System.out.println("1. Insert\n2. Search\n3. Delete\n4. Display\n5. Exit");
    }

}
