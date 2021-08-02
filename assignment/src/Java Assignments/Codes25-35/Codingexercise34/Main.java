import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Insert \n2. Search \n3. Delete \n4. Display \n5. Exit \nEnter your choice :");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    String string = scanner.next();
                    StringList.insert(string);
                    break;
                case 2:
                    String string2 = scanner.next();
                    StringList.search(string2);
                    break;
                case 3:
                    String string3 = scanner.next();
                    StringList.delete(string3);
                    break;
                case 4:
                    StringList.display();
                    break;
                case 5:
                    System.exit(2);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;

            }
        }
    }
}